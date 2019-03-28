package abstractyFactory;

public class Main {
     public static void main(String[] args) {
         
    CelularFactory fabricaDeCelulares = new CelularesMotorolaFactory(); //FABRICA DA MOTOROLA
    CelularFactory fabricaDeCelulares2 = (CelularFactory) new CelularesSamsungFactory(); //FABRICA DA SAMSUNG
    CelularFactory fabricaDeCelulares3 = new CelularesAppleFactory();   //FABRICA DA APPLE
    CelularFactory fabricaDeCelulares4 = new CelularesXperiaFactory(); //FABRICA DA XPERIA
    //Celular caro MOTOROLA
    CelularMaisCaro celularCaro = fabricaDeCelulares.createCelularMaisCaro();
    celularCaro.exibirInfoCelularMaisCaro();
    
    //Celular caro MOTOROLA
    CelularEmConta celular1 = fabricaDeCelulares.createCelularEmConta();
    celular1.exibirInfoCelularMaisEmConta();
    System.out.println("");
    
    //Celular barato SAMSUNG
    CelularEmConta celularBarato = fabricaDeCelulares2.createCelularEmConta();
    celularBarato.exibirInfoCelularMaisEmConta();
    
    //Celular barato SAMSUNG
    CelularMaisCaro celular2 = fabricaDeCelulares2.createCelularMaisCaro();
    celular2.exibirInfoCelularMaisCaro();
    System.out.println("");
    
    //Celulares APPLE
    CelularMaisCaro celular3 = fabricaDeCelulares3.createCelularMaisCaro();
    celular3.exibirInfoCelularMaisCaro();
    
    CelularEmConta celular4 = fabricaDeCelulares3.createCelularEmConta();
    celular4.exibirInfoCelularMaisEmConta();
    
    //Celular barato XPERIA
    CelularEmConta celular5 = fabricaDeCelulares4.createCelularEmConta();
    celular5.exibirInfoCelularMaisEmConta();
    
    //Celular barato XPERIA
    CelularMaisCaro celular6 = fabricaDeCelulares4.createCelularMaisCaro();
    celular6.exibirInfoCelularMaisCaro();
    System.out.println("");
    }
}
