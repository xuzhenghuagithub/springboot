package com.cncpc;

import java.util.ServiceLoader;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        //通过
        ServiceLoader<DataBaseDriver> loader = ServiceLoader.load(DataBaseDriver.class);
        for (DataBaseDriver driver : loader) {
            System.out.println(driver.buildConnect("test"));

        }
    }
}
