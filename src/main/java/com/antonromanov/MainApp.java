package com.antonromanov;

import com.antonromanov.TrackOperation;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Anton on 18.04.2018.
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("Beans.xml");



        TrackOperation operation = (TrackOperation) ctx.getBean("op");
        operation.myadvice();





    }


}
