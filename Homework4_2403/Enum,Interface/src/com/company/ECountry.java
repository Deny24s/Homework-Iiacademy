package com.company;

public enum ECountry implements ICountryInfo {
    BELARUS( 4, 10 ), FINLAND( 11, 19 ), FRANCE( 7, 23 ),
    GERMANY( 8, 30 ), GREECE( 12, 27 ), INDIA( 135, 50 ),
    ITALY( 5, 25 ), NETHERLANDS( 10, 40 ), SWITZERLAND( 15, 26 ),
    THAILAND( 6, 20 );

    private int populationSize;
    private int countryArea;

    ECountry(int populationSize, int countryArea) {
        this.populationSize = populationSize;
        this.countryArea = countryArea;
    }


    @Override
    public int getCountryArea() {
        return countryArea;
    }

    @Override
    public int getPopulationSize() {
        return populationSize;
    }

}
