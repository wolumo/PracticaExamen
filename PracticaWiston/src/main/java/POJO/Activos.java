/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;




/**
 *
 * @author JADPA18
 */
public class Activos {
    
    private String nombre  ;
    private float ValorActivo , ValorSalvamento;
    private TipoActivos tipoActivos;

   
    public enum TipoActivos{
         EDIFICIO, VEHICULO, MAQUINARIA ,MOBILIARIA , EQUIPODEOFICINA
    }
    public int anios (){
        int anio=0;
        switch(tipoActivos){
            case EDIFICIO: anio = 20;
            break;
            case VEHICULO: anio = 5;
            break;
            case MAQUINARIA: anio = 8;
            break;
            case MOBILIARIA: anio = 2;
            break;
            case EQUIPODEOFICINA : anio = 1;
            break;
        }
        return anio;
    }

    public Activos(String nombre, float ValorActivo,  TipoActivos tipoActivos, float ValorSalvamento) {
        this.nombre = nombre;
        this.ValorActivo = ValorActivo;
        this.tipoActivos = tipoActivos;
        this.ValorSalvamento = ValorSalvamento;
       
    }

    public float getValorActivo() {
        return ValorActivo;
    }

    public void setValorActivo(float ValorActivo) {
        this.ValorActivo = ValorActivo;
    }

    public float getValorSalvamento() {
        return ValorSalvamento;
    }

    public void setValorSalvamento(float ValorSalvamento) {
        this.ValorSalvamento = ValorSalvamento;
    }

    public TipoActivos getTipoActivos() {
        return tipoActivos;
    }

    public void setTipoActivos(TipoActivos tipoActivos) {
        this.tipoActivos = tipoActivos;
    }
  
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   public float depreciacion(){
       return (ValorActivo-ValorSalvamento) / anios();
   }

    public Activos() {
    }

    @Override
    public String toString() {
        return "Activos{" + "nombre=" + nombre + ", ValorActivo=" + ValorActivo + ", ValorSalvamento=" + ValorSalvamento + ", tipoActivos=" + tipoActivos + anios() + '}';
    }
    public Object[] Vector(){
        Object[] obj = new Object[anios()+1];
        obj[0] = nombre; 
        for(int i = 1 ; i <obj.length; i++){
            obj[i]= depreciacion();
        }
        return obj;
    }
  
    
}
