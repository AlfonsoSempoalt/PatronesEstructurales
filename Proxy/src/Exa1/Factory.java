/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exa1;

/**
 *
 * @author Alfonso Sempoalt
 */
public class Factory {

    private static ProxyServicio proxy;

    public static ProxyServicio returnProxy(Usuario usuario) {
        if (proxy == null) {
            return new ProxyServicio(usuario);
        } else {
            return proxy;
        }
    }
}
