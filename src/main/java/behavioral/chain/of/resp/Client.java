package behavioral.chain.of.resp;

public class Client {
    static Handler handlerChain;

    static {
        handlerChain = new Handler.FirefightHandler();
        handlerChain.setNext(new Handler.AmbulanceHandler())
                .setNext(new Handler.PoliceHandler())
                .setNext(new Handler.ErrorHandler());
    }

    public static void main(String... args) {
        System.out.println(handlerChain.call("POLICE"));
    }
}