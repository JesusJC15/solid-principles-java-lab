package com.example.solid.lsp;

public class GasCar implements Drivable, Refuelable {
    @Override
    public void drive() {
        System.out.println("Conduciendo...");
    }

    @Override
    public void refuel() {
        System.out.println("Repostando...");
    }
}
