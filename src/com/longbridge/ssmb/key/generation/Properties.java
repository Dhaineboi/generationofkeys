package com.longbridge.ssmb.key.generation;

import java.io.IOException;
import java.io.InputStream;

public class Properties {




    public static java.util.Properties getProperties()
    {
        java.util.Properties prop = new java.util.Properties();
        String fname = "application.properties";
        InputStream ins = null;
        try
        {
            ins = Main.class.getClassLoader().getResourceAsStream(fname);
            System.out.println(ins);
            prop.load(ins);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Live : " + prop);
        return prop;
    }
}
