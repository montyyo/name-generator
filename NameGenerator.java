
/**
 * clase para crear nombres de las guerras de las galaxias
 * 
 * @author (marco) 
 * @version (1-13/03/2015)
 */
public class NameGenerator
{
    // atributos
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String ciudad;
    public static final int INICIAL_INDEX=0;//posicion inicial
    public static final int NUMBER_OF_NAME_CHARS=3;//chars nombre
    public static final int NUMBER_OF_FIRSTNAME_CHARS=3;//chars primer apellido
     public static final int NUMBER_MOTHER_CHARS=2;//chars segundo apellido
     public static final int NUMBER_OF_CITY_CHARS=3;//chars ciudad
    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator(String nombre, String primerApellido,String segundoApellido,String ciudad)
    {
        this.nombre=nombre;
        this.primerApellido=primerApellido;
        this.segundoApellido=segundoApellido;
        this.ciudad=ciudad;
    }

    /**
     * metodo para obtener el nombre de tu personaje
     * 
     * 
     * @return    nombre de personaje 
     */
    public void starWarsName()
    {
        String name=null;
        if(nombre!= null && primerApellido!= null)
        {
            name= nombre.substring(INICIAL_INDEX,NUMBER_OF_NAME_CHARS)+ 
            primerApellido.substring(INICIAL_INDEX,NUMBER_OF_FIRSTNAME_CHARS);
        }
        System.out.println(name);
    }
    
    
    /**
     * metodo para obtener el apellido de tu personaje
     * 
     * @return     apellido de tu personaje
     */
    public void starWarsLastName()
    {
        String lastName=null;
        if(segundoApellido!= null && ciudad!= null)
        {
            lastName= segundoApellido.substring(INICIAL_INDEX,NUMBER_MOTHER_CHARS)+ 
            ciudad.substring(INICIAL_INDEX, NUMBER_OF_CITY_CHARS);
        }
        System.out.println(lastName);
    }
}
