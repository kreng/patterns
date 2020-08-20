package behavioral.chain.of.resp;

public abstract class Handler {
    protected Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public abstract String call(String service);




    public static class FirefightHandler extends Handler{

        @Override
        public String call(String service) {
            if("FIREFIGHT".equals(service))
                return "CALLED firefight";
            return next.call(service);
        }
    }

    public static class AmbulanceHandler extends Handler{

        @Override
        public String call(String service) {
            if("MED".equals(service))
                return "CALLED MEDICINE";
            return next.call(service);
        }
    }

    public static class PoliceHandler extends Handler{

        @Override
        public String call(String service) {
            if("POLICE".equals(service))
                return "CALLED POLICE";
            return next.call(service);
        }
    }

    public static class ErrorHandler extends Handler{

        @Override
        public String call(String service) {
            throw new RuntimeException("No appropriate handler found");
        }
    }
}
