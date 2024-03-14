public class Bank {

    public static int invest(int vklad, int god, int srok){
        return vklad * god * srok;
    }
    public void licSchet(){
        System.out.println(invest(15000, 12, 30));
        System.out.println("Branch 1 completed");
        System.out.println("Branch 1 + Branch 2 completed");
    }
}
