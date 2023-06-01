public class TiposPeliculas {
    //atributos
    String NomPelicula;
    String tipo;
    int year;
    String lugar_creacion;
    String act_principal;
    int duracion;
    String clasificacion;
    String pais;
    String company_creacion;

    //constructor
    public TiposPeliculas(String NomPelicula, String tipo, int year, String lugar_creacion, String act_principal, int duracion, String clasificacion, String pais, String company_creacion) {
        this.NomPelicula = NomPelicula;
        this.tipo = tipo;
        this.year = year;
        this.lugar_creacion = lugar_creacion;
        this.act_principal = act_principal;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.pais = pais;
        this.company_creacion = company_creacion;
    }

    //métodos

    public String getNomPelicula() {
        return NomPelicula;
    }

    public void setNomPelicula(String nomPelicula) {
        NomPelicula = nomPelicula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLugar_creacion() {
        return lugar_creacion;
    }

    public void setLugar_creacion(String lugar_creacion) {
        this.lugar_creacion = lugar_creacion;
    }

    public String getAct_principal() {
        return act_principal;
    }

    public void setAct_principal(String act_principal) {
        this.act_principal = act_principal;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCompany_creacion() {
        return company_creacion;
    }

    public void setCompany_creacion(String company_creacion) {
        this.company_creacion = company_creacion;
    }
    public void imprimirpelicula(){
        System.out.println(this.NomPelicula);
        System.out.println(this.act_principal);
        System.out.println(this.tipo);
        System.out.println(this.year);
        System.out.println(this.duracion + " min");
        System.out.println(this.pais);
        System.out.println(this.clasificacion);
        System.out.println(this.company_creacion);
        System.out.println(this.lugar_creacion);
    }


}
