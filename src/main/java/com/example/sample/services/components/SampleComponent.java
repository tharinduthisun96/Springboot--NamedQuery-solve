package com.example.sample.services.components;


@FunctionalInterface
public interface SampleComponent {
    public void execute();

    public static String cal(){
        System.out.println("Cal method");
        return "Cal method";
    }
}
