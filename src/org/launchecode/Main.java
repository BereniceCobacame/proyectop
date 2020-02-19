package org.launchecode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {
        String var = System.getenv("PATHF");
        FileInputStream fis = new FileInputStream(var);
        Properties p = new Properties();
        p.load(fis);

        System.out.println(p.getProperty("usuario"));
    }
}