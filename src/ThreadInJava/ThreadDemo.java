package ThreadInJava;
class Numbers{
    public void printNumbers(int n){
        for(int i = 1; i<=10; i++){
            System.out.println(i*n);
        }
    }
}
public class ThreadDemo extends Thread{
    int num;
    ThreadDemo(int num){
        this.num = num;
    }
    public void run(){
        Numbers obj = new Numbers();
        System.out.println(currentThread());
        obj.printNumbers(num);
    }
    public static void main(String[] args) {
    ThreadDemo threadDemo = new ThreadDemo(2);
    ThreadDemo threadDemo1 = new ThreadDemo(5);
    threadDemo.start();
    threadDemo1.start();
    }
}
