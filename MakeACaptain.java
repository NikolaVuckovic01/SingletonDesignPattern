public class MakeACaptain {
    private static MakeACaptain _captain;

    private MakeACaptain(){

    }
    public static MakeACaptain getCaptain(){
        if(_captain==null){
            _captain=new MakeACaptain();
            System.out.println("Izabran novi kapiten");
        }
        else{
            System.out.println("Vec postoji kapiten");
        }
        return _captain;
    }

    public static void main(String[] args) {
        MakeACaptain c1= MakeACaptain.getCaptain();
        MakeACaptain c2= MakeACaptain.getCaptain();

        if(c1==c2)
            System.out.println("c1 i c2 su iste instance");
    }
}
