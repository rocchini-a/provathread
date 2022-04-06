public class App {
    public static void main(String[] args) throws Exception {
        Salvadanaio s = new Salvadanaio();
       Azione inseriscimonete= new Azione(s, true);
       inseriscimonete.run();

       Azione prelevamonete= new Azione(s, false);
       prelevamonete.run();

       System.out.println("i trheads sono partiti");
       
       inseriscimonete.join();
       prelevamonete.join();

       System.out.println("i trheads hanno finito");
       System.out.println(Salvadanaio.monete);
    }
}
