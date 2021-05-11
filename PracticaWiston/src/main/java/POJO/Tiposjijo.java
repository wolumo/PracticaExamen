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
public class Tiposjijo {
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
}
