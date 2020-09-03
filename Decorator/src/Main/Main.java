/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import decorator.Beverage;
import decorator.CondimentDecorator;
import decorator.Decaf;
import decorator.*;

/**
 *
 * @author Alfonso Sempoalt
 */
public class Main {
    public static void main(String[] args) {
        CondimentDecorator soya= new Mocha(new Decaf());
        CondimentDecorator bebida= new Mocha(new Milk(new Expresso()));
        Beverage decaf= soya;
        Beverage expreso= bebida;
        System.out.println(decaf.getDescription()+" "+decaf.cost());
        System.out.println(expreso.getDescription()+" "+ expreso.cost());
    }
}
