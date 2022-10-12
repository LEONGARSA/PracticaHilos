public class Main
{
    public static void main(String[] args)
    {
        Hilo tarea1 = new Hilo("Tarea1");
        Hilo tarea2 = new Hilo("Tarea2");

        tarea1.run();
        tarea2.run();
    }
}
