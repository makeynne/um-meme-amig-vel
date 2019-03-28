/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractyFactory;

/**
 *
 * @author livia
 */
public class CelularesSamsungFactory implements CelularFactory{

    @Override
    public CelularEmConta createCelularEmConta() {
      return new SamsungGalaxyJ4();
    }

    @Override
    public CelularMaisCaro createCelularMaisCaro() {
      return (CelularMaisCaro) new SamsungGalaxyS9Plus();
    }
    
}
