package com.company;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<ECountry> {

    @Override
    public int compare(ECountry o1, ECountry o2) {
        if (o1.getCountryArea()>o2.getCountryArea()){
        return 1;}
        if (o1.getCountryArea()<o2.getCountryArea()){
            return -1; }
        else {
            return 0; }

    }


}
