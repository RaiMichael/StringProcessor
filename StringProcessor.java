package com.example.StringProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class ReturnedValue
{
    public int numberOfStrings;
    public List<String> words;

    public ReturnedValue(int numberOfStrings, List<String> words) {
        this.numberOfStrings = numberOfStrings;
        this.words = words;
    }
}
public class StringProcessor {
    public static ReturnedValue StringProcessor(List<String> list)
    {
        /* In case if the business rules changed in order to get the strings with different length and/or different initial letter
        the following 2 variables i.e., letter and len can be changed accordingly. */
        char letter = 'm';
        int len = 5;
        int count =0;
        List<String> words = new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            String element = list.get(i);
            if(element.length()>len)
            {
                words.add(element);
            }
            if(element.toLowerCase().charAt(0)==letter)
            {
                count++;
            }
        }
        ReturnedValue objectReturned = new ReturnedValue(count,words);
        return objectReturned;

    }
    public static void main(String[] args) {
        System.out.println("This is Java Project");
        List<String> list = new ArrayList<String>();
        list.add("Melbourne");
        list.add("Sydney");
        list.add("Perth");
        list.add("Goa");
        list.add("Canberra");
        list.add("Minion");
        list.add("Mike");
        list.add("Microsoft");
        ReturnedValue value = StringProcessor(list);
        System.out.println(value.numberOfStrings);
        for(int i =0;i<value.words.size();i++)
        {
            System.out.println(value.words.get(i));
        }
    }

}

