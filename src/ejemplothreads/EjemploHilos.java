package ejemplothreads;

public class EjemploHilos {

    public static void main(String args[]) {
        Thread juan = new Thread(new Alumno("Juan"));
        Thread luis = new Thread(new Alumno("Luis"));
        Thread nora = new Thread(new Alumno("Nora"));
        try {
            juan.start();
            juan.sleep(4000);

            //juan.setPriority(6);
            //juan.join();
            luis.start();
            //luis.setPriority(8);
            //luis.join();
            nora.start();
            //nora.setPriority(7);
            //nora.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

class Alumno implements Runnable {

    String mensaje;

    public Alumno(String nombre) {

        mensaje = ("Hola, soy " + nombre + " y este es mi mensaje numero: ");

    }

    public void run() {

        for (int i = 1; i < 4; i++) {
            String msj = mensaje + i;
            System.out.println(msj);

            //Thread.yield();
            //Thread.currentThread().getName();
        }

    }
}



