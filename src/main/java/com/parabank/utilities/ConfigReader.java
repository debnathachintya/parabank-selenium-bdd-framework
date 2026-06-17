package com.parabank.utilities;

import com.parabank.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        try {
            FileInputStream fis = new FileInputStream(FrameworkConstants.CONFIG_FILE_PATH);
            properties = new Properties();
            properties.load(fis);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
