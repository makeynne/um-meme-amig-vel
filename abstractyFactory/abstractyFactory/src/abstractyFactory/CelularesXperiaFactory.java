package abstractyFactory;

/**
 *
 * @author livia
 */
public class CelularesXperiaFactory implements CelularFactory{

    @Override
    public CelularEmConta createCelularEmConta() {
      return new XperiaT3Ultra();
    }

    @Override
    public CelularMaisCaro createCelularMaisCaro() {
      return (CelularMaisCaro) new XperiaT9Ultra();
    }
    
}
