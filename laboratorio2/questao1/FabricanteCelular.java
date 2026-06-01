// Interface da fábrica (Factory) que construirá os celulares
public interface FabricanteCelular {
    public Celular constroiCelular(String modelo);
}