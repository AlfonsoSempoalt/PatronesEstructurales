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
public class Soy implements CondimentDecorator {

    private Beverage bebida;

    public Soy(Beverage bebida) {
        this.bebida = bebida;
    }

    @Override
    public float cost() {
        return bebida.cost()+1.2f;
    }

    @Override
    public String getDescription() {
        return bebida.getDescription()+" Soya";
    }

}
