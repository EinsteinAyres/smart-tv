//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Esta TV está ligada? " + smartTv.ligado);
        System.out.println("Esta TV está no canal: " + smartTv.canal);
        System.out.println("Esta TV está no volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Esta TV está ligada? " + smartTv.ligado);

    }
}