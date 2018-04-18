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
  /*      ApplicationContext ctx =
                new ClassPathXmlApplicationContext("Beans.xml");



        TrackOperation operation = (TrackOperation) ctx1.getBean("op");
        operation.myadvice(); */

        ApplicationContext ctx1 =
                new ClassPathXmlApplicationContext("Beans.xml");


        Thinker thinker = (Thinker) ctx1.getBean("thinker");
        thinker.thinkOfSomething("22222");




    }


}
