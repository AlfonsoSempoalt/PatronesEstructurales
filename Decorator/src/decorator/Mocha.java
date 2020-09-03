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
public class Mocha implements CondimentDecorator{
    private Beverage bebida;
    
    public Mocha(Beverage bebida){
        this.bebida= bebida;
    }
    
    @Override
    public float cost() {
        return this.bebida.cost()+2.1f;
    }

    @Override
    public String getDescription() {
        return this.bebida.getDescription()+" Mocha";
    }
    
}
