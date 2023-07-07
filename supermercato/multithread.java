/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercato;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import supermercato.Classi_Persona.Cliente;
import supermercato.Classi_Persona.Dipendente;

public class multithread extends Thread {

    ImageIcon green = new ImageIcon("green.PNG");
    ImageIcon red = new ImageIcon("red.PNG");
    int a = 0; // numero minimo
    int b = 19; // numero massimo
    static int velocita = 1000;
    static int entrate = 10;
    static int uscite = 50;
    static int cambio = 20;
    Lista temp;

    public static void setCambio(int cambio) {
        cambio = cambio;
    }

    public static void setUscite(int Uscite) {
        uscite = Uscite;
    }

    public static void setEntrate(int Entrate) {
        entrate = Entrate;
    }

    public static void setVelocita(int Velocita) {
        velocita = Velocita;
    }
    Supermercato l;

    @Override
    public void run() {  //INIZIO MULTITHEREAD

        int secondi = 0;
        int minuti = 0;
        SetCasse();
        while (true) {

            secondi++;

            int c = ((b - a) + 1);                        //GENERAZIONE RANDOM
            Random random = new Random();
            int miavar = random.nextInt(c) + a;

            if (secondi == 60) {
                minuti++;
                secondi = 0;
            }
            if (minuti <= 9 && secondi <= 9) {                                 //OROLOGIO
                l.l1.setText("0" + minuti + ":" + "0" + secondi);
                l.l2.setText("0" + minuti + ":" + "0" + secondi);
            } else if (secondi <= 9) {
                l.l1.setText(minuti + ":" + "0" + secondi);
                l.l2.setText(minuti + ":" + "0" + secondi);
            } else if (minuti <= 9) {
                l.l1.setText("0" + minuti + ":" + secondi);
                l.l2.setText("0" + minuti + ":" + secondi);
            }
            if (minuti == 24) {  //RESET OROLOGIO
                minuti = 0;
            }

            if (secondi % entrate == 0) {  // SE SECONDI MULTIPLO DI ENTRATE ENTRA;

                if ("anziano".equals(l.array[miavar].getTipo()) || "incinta".equals(l.array[miavar].getTipo()) || "anziana".equals(l.array[miavar].getTipo())) {
                    if (l.Casse[0].aperta == false) {

                        l.desk1("uomocassa.png");
                        l.button1.setIcon(green);
                        l.Casse[0].aperta = true;
                        l.Casse[0].addCoda(l.array[miavar]);
                        l.coda1.setText(l.Casse[0].stampa());

                    } else {
                        l.Casse[0].addCoda(l.array[miavar]);
                        l.coda1.setText(l.Casse[0].stampa());

                    }

                } else {
                    int[] ta = {1000, 1000, 1000, 1000, 1000, 1000};
                    int cont = 1;
                    for (int i = 1; i < l.Casse.length; i++) {
                        if (l.Casse[i].aperta == true) {

                            ta[cont] = l.Casse[i].numNodi;              //SE LA CASSA E APERTA ASSEGNO A TA IL NUMERO DI NODI DELLA CASSA
                            cont++;
                        }

                    }

                    IntSummaryStatistics stat = Arrays.stream(ta).summaryStatistics();
                    int min = stat.getMin();

                    boolean mark = true;
                    int temp = 0;
                    int i1 = 1;
                    while (mark == true) {

                        if (l.Casse[i1].numNodi == min && l.Casse[i1].aperta == true) {  //CICLO FINO A QUANDO TROVO LA CASSA CON IL NUMERO DI NODI E SIA ANCHE APERTA;
                            mark = false;
                            temp = i1;  //MI SALVO INDICE COSI HO LA CASSA MINIMA
                        }
                        if (i1 == 6) {
                            mark = false;
                        }
                        i1++;
                    }
                    //CERCO LA CASSA CHE ABBIA temp UGUALE AL INDICE COSI FACENDO ASSEGNO ALLA CASSA CON IL MINOR NUMERO DI CLIENTI IL NUOVO CLIENTE
                    if (temp == 1) {
                        l.Casse[1].addCoda(l.array[miavar]);
                        l.coda2.setText(l.Casse[1].stampa());

                    }
                    if (temp == 2) {
                        l.Casse[2].addCoda(l.array[miavar]);
                        l.coda3.setText(l.Casse[2].stampa());
                        //  setcas();

                    }
                    if (temp == 3) {
                        l.Casse[3].addCoda(l.array[miavar]);
                        l.coda4.setText(l.Casse[3].stampa());

                    }
                    if (temp == 4) {
                        l.Casse[4].addCoda(l.array[miavar]);
                        l.coda5.setText(l.Casse[4].stampa());

                    }
                    if (temp == 5) {
                        l.Casse[5].addCoda(l.array[miavar]);
                        l.coda6.setText(l.Casse[5].stampa());

                    }
                    if (l.Casse[1].aperta == false && l.Casse[2].aperta == false && l.Casse[3].aperta == false && l.Casse[4].aperta == false && l.Casse[5].aperta == false) {
                        showMessageDialog(null, "TUTTE LE CASSE SONO CHIUSE APRIRE UNA CASSA NORMALE GRAZIE");
                    }  //VERIFICO SE TUTTE LE CASSE SONO APERTE

                }
            }

            if (secondi % uscite == 0) {
                
              
                if (l.Casse[0].numNodi > 0) {                     //SE IL NUMERO DI NODI E MAGGIORE DI 0 RIMUOVE IL CLIENTE 
                    l.Casse[0].removeTesta();
                    l.coda1.setText(l.Casse[0].stampa());  //STAMPO I CLIENTI IN CODA

                }
                if (l.Casse[1].numNodi > 0) {
                    l.Casse[1].removeTesta();
                    l.coda2.setText(l.Casse[1].stampa());

                }
                if (l.Casse[2].numNodi > 0) {
                    l.Casse[2].removeTesta();
                    l.coda3.setText(l.Casse[2].stampa());

                }
                if (l.Casse[3].numNodi > 0) {
                    l.Casse[3].removeTesta();
                    l.coda4.setText(l.Casse[3].stampa());

                }
                if (l.Casse[4].numNodi > 0) {
                    l.Casse[4].removeTesta();
                    l.coda5.setText(l.Casse[4].stampa());

                }
                if (l.Casse[5].numNodi > 0) {
                    l.Casse[5].removeTesta();
                    l.coda6.setText(l.Casse[5].stampa());

                }

            }
            if (secondi % cambio == 0) {
                SetCasse();

            }

            try {
                Thread.sleep(velocita);
            } catch (InterruptedException e) {
            }

        }

    }

    public void SetCasse() {
        if (l.Casse[0].aperta) {
            int miavar1 = ThreadLocalRandom.current().nextInt(0, 19 + 1); //GENERAZIONE RANDOMICO

            String s = l.dip[miavar1].nome;
            l.Dipendente1.setText(s);
            l.dip[miavar1].Stipendio += 7.5;
            l.dip[miavar1].numC += 1;

            if (l.dip[miavar1].sesso == "uomo") {
                l.desk1("uomocassa.png");
            }
            if (l.dip[miavar1].sesso.equals("donna")) {
                l.desk1("donnacassa.png");
            }
        } else {
            l.desk1("empty.png");
        }

        if (l.Casse[1].aperta) {
            int miavar2 = ThreadLocalRandom.current().nextInt(0, 19 + 1);
            l.dip[miavar2].Stipendio += 7.5;
            l.dip[miavar2].numC += 1;
            String s = l.dip[miavar2].nome;

            l.Dipendente2.setText(s);

            if (l.dip[miavar2].sesso.equals("uomo")) {
                l.desk2("uomocassa.png");
            } else {
                l.desk2("donnacassa.png");
            }
        } else {
            l.desk2("empty.png");
        }
        if (l.Casse[2].aperta) {
            int miavar3 = ThreadLocalRandom.current().nextInt(0, 19 + 1);
            l.dip[miavar3].Stipendio += 7.5;
            l.dip[miavar3].numC += 1;
            String s = l.dip[miavar3].nome;
            l.Dipendente3.setText(s);

            System.out.println(l.dip[miavar3].sesso);
            if (l.dip[miavar3].sesso.equals("uomo")) {
                l.desk3("uomocassa.png");
            } else {
                l.desk3("donnacassa.png");
            }
        } else {
            l.desk3("empty.png");
        }
        if (l.Casse[3].aperta) {
            int miavar4 = ThreadLocalRandom.current().nextInt(0, 19 + 1);
            l.dip[miavar4].Stipendio += 7.5;
            l.dip[miavar4].numC += 1;
            String s = l.dip[miavar4].nome;
            l.Dipendente4.setText(s);

            if (l.dip[miavar4].sesso.equals("uomo")) {
                l.desk4("uomocassa.png");
            } else {
                l.desk4("donnacassa.png");
            }
        } else {
            l.desk4("empty.png");
        }
        if (l.Casse[4].aperta) {
            int miavar5 = ThreadLocalRandom.current().nextInt(0, 19 + 1);
            l.dip[miavar5].Stipendio += 7.5;
            l.dip[miavar5].numC += 1;
            String s = l.dip[miavar5].nome;
            l.Dipendente5.setText(s);

            if (l.dip[miavar5].sesso.equals("uomo")) {
                l.desk5("uomocassa.png");
            } else {
                l.desk5("donnacassa.png");
            }
        } else {
            l.desk5("empty.png");
        }
        if (l.Casse[5].aperta) {
            int miavar6 = ThreadLocalRandom.current().nextInt(0, 19 + 1);
            l.dip[miavar6].Stipendio += 7.5;
            l.dip[miavar6].numC += 1;
            String s = l.dip[miavar6].nome;
            l.Dipendente6.setText(s);

            if (l.dip[miavar6].sesso.equals("uomo")) {
                l.desk6("uomocassa.png");
            } else {
                l.desk6("donnacassa.png");
            }
        } else {
            l.desk6("empty.png");
        }

    }

    public void setL(Supermercato l) {  //PASSIAMO MAIN AL SUPERMERCATO
        this.l = l;
    }

    public void setcas() {

        Lista codaprova = l.Casse[2];
        nodo centro = codaprova.testa;
        nodo temp = codaprova.testa;
        if (codaprova.testa != null) {
            while (temp != null && temp.next != null) {
                temp = temp.next.next;
                centro = centro.next;
            }
            l.Casse[2].setTesta(centro);
        }

    }

}
