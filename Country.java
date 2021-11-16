package com.company;

public class Country {
    String Name;
    String Language;
    String Population;
    String Capital;
    String Cities;

    Country (String name,String language,String population,String capital, String cities){
           Name=name;
           Language=language;
           Population=population;
           Capital=capital;
           Cities=cities;

    }

    public String toString(){ //source https://www.javatpoint.com/understanding-toString()-method

        return  "The country name is:"+Name+"\n The spoken Language is: "+Language+
                "\n The population is: "+Population+"\n The capital city is: "+Capital+
                "\n Some popular cities include "+ Cities;

    }
}
