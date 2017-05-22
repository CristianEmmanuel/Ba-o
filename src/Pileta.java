/**
 * Created by cristian on 22/05/17.
 */
public class Pileta {

    private String agua;

    public Pileta() {
        this.agua = agua;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public void perderAgua(boolean b){
        boolean pierde = true;
        if (pierde==true){
            System.out.println("Aun pierde agua debes repararlo");
        }else {
            System.out.println("Buen trabajo ya no pierde ");
        }
    }
}
