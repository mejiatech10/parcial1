public class perro {


    private int id;
    private String nombre;
    private String raza;
    private int edadmeses;
    private String tamaño;
    private boolean vacunado;
    private boolean esterilizado;
    private boolean adoptado;
    private  String adoptante;

    public perro(int id, String nombre, String raza, int edadmeses, String tamaño, boolean vacunado, boolean esterilizado, boolean adoptado, String adoptante) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.edadmeses = edadmeses;
        this.tamaño = tamaño;
        this.vacunado = false;
        this.esterilizado = false;
        this.adoptado = adoptado;
        this.adoptante = adoptante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdadmeses() {
        return edadmeses;
    }

    public void setEdadmeses(int edadmeses) {
        this.edadmeses = edadmeses;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    public String getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(String adoptante) {
        this.adoptante = adoptante;
    }

    public boolean vacunar(){
        this.vacunado = true ;
        System.out.println("se vacuno el perro ");
        return true;

    }

    public boolean esterilizar(){
        this.esterilizado = true;
        System.out.println("el perro esta estrilizado");
        return true;
    }

    public void marcaradoptados(){
        return ;
    }

    public void calcularedadhumanaaprox(){
        int edad1;
        System.out.println(" cuantos años tienen ");
        int edadmeses = animal.nextInt();
        edad1 = ((edadmeses/12)*7);
        System.out.println(edad1);
        return edad1;


    }

    public void aptoparaapartamento(){


    }
    public String toString(){
        return "Perro" +
                "id=" + id +
                ", nombre=" + nombre +
                ", raza=" + raza +
                ", edadMeses=" + edadmeses +
                ", tamano='" + tamaño + '\'' +
                ", vacunado=" + vacunado +
                ", esterilizado=" + esterilizado +
                ", adoptado=" + adoptado +
                ", adoptante='" + adoptante + '



    }

}
