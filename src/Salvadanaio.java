public class Salvadanaio {
    static int monete =0;
    

    public void inserisci(){
       usa(true);
    }
    
    public void preleva(){
        usa(false);;
    }

    private void usa(boolean inserisci){
        if(inserisci){
            monete++;
        }else{
            monete--;
        }
    }

}
