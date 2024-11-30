package com.literatura.console;

import com.literatura.service.Adapter;
import com.literatura.service.ConsumerApi;

public class DriverLiteratura {
    private final String BASE_URL="https://gutendex.com/books/";
    private Adapter adapter = new Adapter();
    private ConsumerApi consumerApi= new ConsumerApi();

    public  void test(){
     String ans=consumerApi.getDataApi(BASE_URL);
        System.out.println("la data" + ans);
    }

}
