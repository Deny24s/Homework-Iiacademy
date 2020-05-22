public class Consumer implements Runnable{
    Store store;

    // Класс Потребитель
    Consumer(Store store){
        this.store=store;
    }
    public void run(){
        for (int i = 1; i < 6; i++) {
            store.get();
        }
    }
}

