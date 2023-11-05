package org.example;

import org.example.core.WindowManager;
import org.lwjgl.Version;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting program");
        System.out.println(Version.getVersion());

        WindowManager window  = new WindowManager("GAME ENGINE",1600,900, false);
        window.init();

        while (!window.windowShouldClose()){
            window.update();
        }

        window.cleanup();

        System.out.println("Ending program");
    }
}