package com.rupp.repo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(getMaxFirstLetter());
        System.out.println(getMinFirstLetter());
    }
    
    /**
     * @return String
     */
    public static String getMaxFirstLetter(){
    	Map<String, HashSet<String>> countriesList = CountriesList.getCountriesByFirstLetter();
    	List<String> keys = new ArrayList<>(countriesList.keySet());
    	Collections.sort(keys, new Comparator<String>() {
    	    @Override
    	    public int compare(String o1, String o2) {
    	    	return Integer.valueOf(countriesList.get(o2).size()).compareTo(countriesList.get(o1).size());
    	    }
    	});
    	return keys.get(0);
    }
    
    /** 
     * @return String
     */
    public static String getMinFirstLetter(){
    	Map<String, HashSet<String>> countriesList = CountriesList.getCountriesByFirstLetter();
    	List<String> keys = new ArrayList<>(countriesList.keySet());
    	Collections.sort(keys, new Comparator<String>() {
    	    @Override
    	    public int compare(String o1, String o2) {
    	    	return Integer.valueOf(countriesList.get(o1).size()).compareTo(countriesList.get(o2).size());
    	    }
    	});
    	return keys.get(0);
    }
   
}
