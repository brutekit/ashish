import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);


        List<Future<?>> future = new ArrayList<>();
        for (int i = 1; i <= 10 ; i++) {
            future.add(executorService.submit(new MyThread(i)));
//            executorService.execute(new MyThread(i));
        }
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);  //wait till here
        System.out.println(new Date());
       future.stream().forEach(e -> System.out.println(e));

    }
}

class MyThread implements Runnable{
    int i ;
    MyThread(int i){
        this.i = i ;
    }

    @Override
    public void run()  {
        System.out.println(this.i +" Printed by Thread : "+ Thread.currentThread().getName());
        try{Thread.sleep(1000);

        }catch (InterruptedException ie){
        }
    }
}