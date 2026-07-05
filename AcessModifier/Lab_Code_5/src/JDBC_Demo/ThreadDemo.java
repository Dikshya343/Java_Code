package JDBC_Demo;

public class ThreadDemo implements Runnable {
    Thread t;
    String name;
    ThreadDemo(String name){
        this.name = name ;
        t = new Thread(this);
    }
    void start(){
        t.start() ;
    }
    public void run(){
        for(int i = 0; i < 10 ; i++){
            System.out.println(name+ " "+i);
            try{
                t.sleep(1000);
            }
            catch(Exception e){
        }


    }
        }
    public static void main(String args[]){
        ThreadDemo obj = new ThreadDemo("first");
        ThreadDemo obj1 = new ThreadDemo("second");
        obj.start();
        obj1.start();
    }

}
