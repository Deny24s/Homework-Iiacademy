package com.company;

public class EnumMain {

    public static void main(String[] args) {
//        ECountry country=ECountry.BELARUS;
//        System.out.println(country.getPopulationSize());

        System.out.println(ECountry.valueOf( "GERMANY" ));
        System.out.println(ECountry.valueOf( "GERMANY" )==ECountry.GERMANY);
//        System.out.println(ECountry.valueOf( "ABHAZIA" ));

        CountryAreaComparator countryAreaComparator=new CountryAreaComparator();
        System.out.println("Страна " + ECountry.BELARUS+ " меньше " + ECountry.INDIA + " поэтому возвращается число " + countryAreaComparator.compare( ECountry.BELARUS,ECountry.GERMANY ));

    }
}
