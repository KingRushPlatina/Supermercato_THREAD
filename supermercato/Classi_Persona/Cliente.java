/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercato.Classi_Persona;

/**
 *
 * @author studenti
 */
public class Cliente extends Persona{
    String Tipo;

    public Cliente(String Tipo, String nome_v, String sesso_v) {
        super(nome_v, sesso_v);
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

   
    
}
