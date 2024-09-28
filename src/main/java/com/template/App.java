package com.template;

import processing.core.PApplet;

public class App extends PApplet
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PApplet.main("com.template.App");
    }

    // Window settings ↓
    public void settings() {
        size(600, 600);
    }

    // Standard setup function ↓
    public void setup() {
        background(0);
    }

    // Standard draw function ↓
    public void draw() {
        ellipse(width / 2, height / 2, 50, 50);
    }
}
