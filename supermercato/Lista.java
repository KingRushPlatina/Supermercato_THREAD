/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercato;

import supermercato.Classi_Persona.Cliente;

/**
 *
 * @author studenti
 */
public class Lista
{
    nodo testa = null;
    int numNodi = 0;
    int numeroIdentificazione;
    boolean aperta;

    public Lista(int numeroIdentificazione, boolean aperta) {
        this.numeroIdentificazione = numeroIdentificazione;
        this.aperta = aperta;
    }
    
    public String stampa(){
        String s = "";
        if(testa==null){
            s=" ";
        }else{
            s=this.testa.stampa();
        }
        return s;
    }

    public void addTesta(Cliente value){
        nodo n = new nodo(value);
        if(testa == null) testa = n;
        else{
            n.next = testa;
            testa = n;
        }
        numNodi++;
    }
    
    public boolean removeTesta(){
        boolean b = true;
        if(testa != null){
            testa = testa.next;
            numNodi--;
            b = false;
        }
        return b;
    }
    public void addCoda(Cliente value){
        nodo n = new nodo(value);
        nodo n1 = testa;
        if( testa== null )
        {
           testa=n;
        }
        else
         {
               while(n1.next != null){
            n1 = n1.next;
        }
        n1.next = n;
        numNodi++;
        }
     
    }
    
    public void removeCoda(){
        boolean b = true;
        nodo n = testa;
        if(n != null){
            if(n.next != null)
            {
                boolean ceck= false;
                while(ceck==false){
                    if(n.next.next==null){
                        n.next=null;
                        ceck=false;
                    }
                 
                }
            }
            else{
                b = false;
                testa = null;
            }
            numNodi--;
        }
        
    }
    
    public void svuota(){
        boolean b = true;
        if(testa == null) b = false;
        else testa = null; 
        numNodi = 0;
      
    }
    
    
    
  
    

    public void setTesta(nodo testa) {
        this.testa = testa;
    }
    
   


}


