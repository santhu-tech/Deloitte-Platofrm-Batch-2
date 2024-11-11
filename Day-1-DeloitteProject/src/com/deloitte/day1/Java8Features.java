package com.deloitte.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Features {
    public static void main(String[] args) {

        //Lambada expression
        //Syntax
        // (parameters ) ->expression ;

        //Functional Interface
        //Stream API

       /* List<Integer> salaryList =new ArrayList<>();
        salaryList.add(30000);
        salaryList.add(60000);
        salaryList.add(150000);
        salaryList.add(75000);
        salaryList.add(89000);
        long output=salaryList.stream().filter((Integer sal)->sal>50000).count();
        System.out.println(output); */

        List<String> names = Arrays.asList("Apple" ,"Orange","Banana");
        List<String> filteredNames =names.stream()
                                         .filter(name -> name.length() >3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredNames);
        System.out.println(names);

    }


}
