import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// Класс Магазин, хранящий произведенные товары
public class Store {
    private int product=0;
    ReentrantLock locker;
    Condition notFull;
    Condition notEmpty;

    Store(){
        locker = new ReentrantLock(); // создаем блокировку
        notFull = locker.newCondition(); //получаем условие1, связанное с блокировкой
        notEmpty = locker.newCondition(); //получаем условие2, связанное с блокировкой
    }
    public void get() {
        locker.lock();
        try{
            // пока нет доступных товаров на складе, ожидаем
            while (product<1)
                notEmpty.await();
            product--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println("Товаров на складе: " + product);

            // сигнализируем
            notFull.signal();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock();
        }
    }
    public void put() {
        locker.lock();
        try{
            // пока на складе 3 товаров, ждем освобождения места
            while (product>=3)
                notFull.await();
            product++;
            System.out.println("Производитель добавил 1 товар");
            System.out.println("Товаров на складе: " + product);
            // сигнализируем
            notEmpty.signal();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        } finally{
            locker.unlock();
        }
    }
}

