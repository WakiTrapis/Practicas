package miRPG.Base;

public abstract class item {

    //atributos
    private String name;
    private String description;

    //constructor
    public item(String name, String description) {
        this.name = name;
        this.description = description;
    }
    //getters y setters
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    //metodo abstracto para usar el item
    public abstract boolean use(character user);










}

