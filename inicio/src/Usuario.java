public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();
        smartTv.mudarCanal(13);

        System.out.println("A TV ESTA LIGADA ? " + smartTv.ligada);
        System.out.println("canal atual: " + smartTv.canal);
        System.out.println("volume atual: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo status -> A TV ESTA LIGADA ? " + smartTv.ligada);

        smartTv.aumentarVolume();

        System.out.println("Novo status -> volume atual: " + smartTv.volume);
    }
}
