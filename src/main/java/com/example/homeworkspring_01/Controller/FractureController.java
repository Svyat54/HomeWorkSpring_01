package com.example.homeworkspring_01.Controller;

import com.example.homeworkspring_01.Entities.Fracture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FractureController {
    @GetMapping("/isProper") // http://localhost:8080/isProper
    public boolean proper(@RequestParam() int number, @RequestParam() int deNumber) {
        return new Fracture(number, deNumber).proper();
    }

    @GetMapping("/reduction")// http://localhost:8080/reduction
    public Fracture euclid(@RequestParam() int number, @RequestParam() int deNumber) {
        Fracture fracture = new Fracture(number, deNumber);
        fracture.reduce();
        return fracture;
    }

    @GetMapping("/sum") // http://localhost:8080/sum
    public Fracture sum(@RequestParam() int number, @RequestParam() int deNumber,
                   @RequestParam() int number1, @RequestParam() int deNumber1) {
        Fracture fracture = new Fracture(number, deNumber);
        Fracture fracture1 = new Fracture(number1, deNumber1);
        fracture.sum(fracture1);
        return fracture;
    }

    @GetMapping("/minus") // http://localhost:8080/minus
    public Fracture minus(@RequestParam() int number, @RequestParam() int deNumber,
                          @RequestParam() int number1, @RequestParam() int deNumber1) {
        Fracture fracture = new Fracture(number, deNumber);
        Fracture fracture1 = new Fracture(number1, deNumber1);
        fracture.minus(fracture1);
        return fracture;
    }

    @GetMapping("/increase") // http://localhost:8080/increase
    public Fracture increase(@RequestParam() int number, @RequestParam() int deNumber,
                        @RequestParam() int number1, @RequestParam() int deNumber1) {
        Fracture fracture = new Fracture(number, deNumber);
        Fracture fracture1 = new Fracture(number1, deNumber1);
        fracture.increase(fracture1);
        return fracture;
    }

    @GetMapping("/division") // http://localhost:8080/division
    public Fracture division(@RequestParam() int number, @RequestParam() int deNumber,
                             @RequestParam() int number1, @RequestParam() int deNumber1) {
        Fracture fracture = new Fracture(number, deNumber);
        Fracture fracture1 = new Fracture(number1, deNumber1);
        fracture.division(fracture1);
        return fracture;
    }
}