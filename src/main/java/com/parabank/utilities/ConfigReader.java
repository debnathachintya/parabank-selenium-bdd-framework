package com.parabank.utilities;

import com.parabank.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static final Properties PROPERTIES = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream(FrameworkConstants.CONFIG_FILE_PATH);
            PROPERTIES.load(fis);
        } catch (Exception e) {
            throw new RuntimeException("Unable to load config.properties",e);
        }
    }

    public static String get(String key) {
        return PROPERTIES.getProperty(key);
    }
}
