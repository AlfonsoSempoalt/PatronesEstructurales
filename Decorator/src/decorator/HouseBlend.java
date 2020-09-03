/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Alfonso Sempoalt
 */
public class HouseBlend implements Beverage {

    @Override
    public String getDescription() {
        return "HouseBlend coffe";
    }

    @Override
    public float cost() {
        return 2.5f;
    }

}
