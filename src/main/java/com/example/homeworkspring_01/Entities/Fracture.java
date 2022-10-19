package com.example.homeworkspring_01.Entities;

public class Fracture {
    private int number;
    private int deNumber;

    public Fracture(int number, int deNumber) {
        this.number = number;
        this.deNumber = deNumber;
    }

    public int getNumber() {
        return number;
    }

    public int getDeNumber() {
        return deNumber;
    }

    public boolean proper(){
        return this.number < this.deNumber;
    }

    private int euclid(){
        int a = this.number;
        int b = this.deNumber;
        while (b != 0){
         int tmp = a % b;
         a = b;
         b = tmp;
        }
        return a;
    }

    public void reduce(){
        int div = euclid();
        this.number /= div;
        this.deNumber /= div;
    }

    public void sum(Fracture fracture){
        this.number *= fracture.deNumber;
        this.number += fracture.number * this.deNumber;
        this.deNumber *= fracture.deNumber;
        this.reduce();
    }

    public void minus(Fracture fracture){
        this.number *= fracture.deNumber;
        this.number -= fracture.number * this.deNumber;
        this.deNumber *= fracture.deNumber;
        this.reduce();
    }

    public void increase (Fracture fracture){
        this.number *= fracture.number;
        this.deNumber *= fracture.deNumber;
        this.reduce();
    }

    public void division(Fracture fracture){
        this.number *= fracture.deNumber;
        this.deNumber *= fracture.number;
        this.reduce();
    }
}
