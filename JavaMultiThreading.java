class JavaMultiThreading extends Thread     	       //class JavaMultiThreading extends the Thread class
{

public void run()  
{                                           //run() method of the Thread class
System.out.println(" Inside run() method of Thread class ");
}

public static void main(String[] args){

JavaMultiThreading object = new JavaMultiThreading();  //creating object of class
object.start();					       //start() method calls the run() method of thread class

}

} 