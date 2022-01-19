package com.ea.growth.cheatchess.application;

import javax.swing.JFrame;

public class Application extends JFrame {

    public static void main(String[] args) {
        new Application().run();
    }

    private ApplicationConfigurer applicationConfigurer;

    private Application() {
       applicationConfigurer = new ApplicationConfigurer();
    }

    private void run() {
        setTitle(applicationConfigurer.getProperty(Keys.WINDOW_TITLE));
        setSize(applicationConfigurer.getInteger(Keys.WINDOW_WIDTH), applicationConfigurer.getInteger(Keys.WINDOW_HEIGHT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
