package main.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krevsky on 23.11.2016.
 */
public class Printer {
    public void printKrevBeanAVoice() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("main/resources/krevContext.xml");
        KrevBeanA krevBeanA = (KrevBeanA) ctx.getBean("krevBeanA");
        System.out.println(krevBeanA.getKrevVoice());
    }
}
