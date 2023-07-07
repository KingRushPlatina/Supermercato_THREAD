/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercato;
import supermercato.Classi_Persona.Cliente;

public class nodo {
    Cliente info;
    nodo next;
    
    public nodo(Cliente info_v){
        next = null;
        info = info_v;
    }
 
    public String stampa(){
        String q =" ";
        if (next != null){
            q = q + this.info.getTipo() + ": "+this.info.nomes+"\n"+this.next.stampa(); 
        }else{
            q = q + this.info.getTipo() + ": "+this.info.nomes+" ";
        }
        return q;
    }
    public Cliente getInfo(){
        return info;
    }
}
