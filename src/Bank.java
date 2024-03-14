public class Bank {

    public static int invest(int vklad, int god, int srok){
        return vklad * god * srok;
    }
    public void licSchet(){
        System.out.println(invest(15000, 12, 30));
    }
}
