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
    private
    private String nombre , tipoActivo ;
    private String ValorActivo , ValorSalvamento;
   
    public enum TipoActivo {
        EDIFICIO(20), VEHICULO(5) , MAQUINARIA(8) , MOBILIARIO(2), EQUIPODEOFICINA(1);
        private int años;

        private TipoActivo(int tiempo) {
            años = tiempo;
        }
        public int getAños(){
            return años;
        }
        
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoActivo() {
        return tipoActivo;
    }

    public void setTipoActivo(String tipoActivo) {
        this.tipoActivo = tipoActivo;
    }

    

    public String getValorActivo() {
        return ValorActivo;
    }

    public void setValorActivo(String ValorActivo) {
        this.ValorActivo = ValorActivo;
    }

    public String getValorSalvamento() {
        return ValorSalvamento;
    }

    public void setValorSalvamento(String ValorSalvamento) {
        this.ValorSalvamento = ValorSalvamento;
    }

    public Activos(String nombre, String tipoActivo, String ValorActivo, String ValorSalvamento) {
        this.nombre = nombre;
        this.tipoActivo = tipoActivo;
        this.ValorActivo = ValorActivo;
        this.ValorSalvamento = ValorSalvamento;
    }
 
    
    public Activos() {
    }

    @Override
    public String toString() {
        return "Activos{" + "nombre=" + nombre + ", tipoActivo=" + tipoActivo + ", ValorActivo=" + ValorActivo + ", ValorSalvamento=" + ValorSalvamento + '}';
    }
    
}
