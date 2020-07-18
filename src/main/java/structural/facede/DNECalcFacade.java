package structural.facede;

public class DNECalcFacade {

    static SoapServiceStub soapService = new SoapServiceStub();

    public static int add(Integer n1, Integer n2){
       return soapService.sendAddRq(" Send Rq");
    }

    public static int Devide(Integer n1, Integer n2){
       return soapService.sendDivideRq(" Send Rq");
    }

    public static int multiply(Integer n1, Integer n2){
       return soapService.sendMultiplyRq(" Send Rq");
    }

    public static int substract(Integer n1, Integer n2){
       return soapService.sendSubstractRq(" Send Rq");
    }

    static class SoapServiceStub {
        Integer sendAddRq(String s) {
            return -1;
        }
        Integer sendDivideRq(String s) {
            return -1;
        }
        Integer sendMultiplyRq(String s) {
            return -1;
        }
        Integer sendSubstractRq(String s) {
            return -1;
        }
    }
}
