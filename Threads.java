// class A extends Thread{
//     public void run(){
//         for(int i=0; i<50; i++){
//             System.out.println("Thread A is running");
//             try {
//                 Thread.sleep(100);
//             } catch (Exception e) {
//                System.out.println(e);
//             }
//         }
//     }
// }

// class B extends Thread{
//     public void run(){
//         for(int i=0; i<10; i++){
//             System.out.println("Thread B is running");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                System.out.println(e);
//             }
//         }
//     }
// }


// ============== Method 2 ========================= 


// class A implements Runnable{
//     public void run(){
//         for(int i=0; i<5; i++){
//             System.out.println("Thread A is running");
//             try {
//                 Thread.sleep(100);
//             } catch (Exception e) {
//                System.out.println(e);
//             }
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){
//         for(int i=0; i<10; i++){
//             System.out.println("Thread B is running");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                System.out.println(e);
//             }
//         }
//     }
// }


public class Threads {
    public static void main(String[] args) {
        // A a = new A();
        // B b = new B();
        // a.start();
        // b.start();

        // ======== Method 2 ============ 
            Runnable obj1 = () -> {
                for(int i=0; i<10; i++){
                    System.out.println("Thread A is running");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                       System.out.println(e);
                    }
                }
            };


            Runnable obj2 = () -> {
                for(int i=0; i<10; i++){
                    System.out.println("Thread B is running");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                       System.out.println(e);
                    }
                }
            };



        // Runnable obj1 = new A();
        // Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
