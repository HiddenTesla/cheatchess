package com.ea.growth.cheatchess.application;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationConfigurer {

    private static final String
        PROPERTY_FILE_DIRECTORY = "properties",
        PROPERTY_DEFAULT_FILE  = "application.properties",
        PROFILE         = "PROFILE",
        ____ = null;

    private Properties defaultProperties;
    private Properties profileProperties;

    public ApplicationConfigurer() {
        loadProperties();
    }

    private void loadProperties() {
        defaultProperties = new Properties();
        profileProperties = new Properties();

        try {
            InputStream is = this.getClass().getClassLoader().getResourceAsStream(PROPERTY_FILE_DIRECTORY + "/" + PROPERTY_DEFAULT_FILE);
            defaultProperties.load(is);

            String profile = System.getenv(PROFILE);
            if (profile != null && !profile.isBlank()) {
                String p = String.format("%s/application-%s.properties", PROPERTY_FILE_DIRECTORY,  profile);
                is = this.getClass().getClassLoader().getResourceAsStream(p);
                if (is == null) {
                    throw new IOException("No such file: " + p);
                }
                profileProperties.load(is);
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getProperty(String key) {
        String v = System.getProperty(key);
        if (v != null)
            return v;

        v = profileProperties.getProperty(key);
        if (v != null)
            return v;

        v = defaultProperties.getProperty(key);
        return v;
    }

    public int getInteger(String key) {
        String v = getProperty(key);
        if (key == null)
            return 0;
        else
            return Integer.parseInt(v);
    }
}
