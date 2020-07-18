package structural.proxy;

public class RemoteSystemFacade implements Calculator{

    static SoapServiceStub soapService = new SoapServiceStub();

    @Override
    public int add(Integer n1, Integer n2){
       return soapService.sendAddRq(" Send Rq");
    }

    @Override
    public int devide(Integer n1, Integer n2){
       return soapService.sendDivideRq(" Send Rq");
    }

    @Override
    public int multiply(Integer n1, Integer n2){
       return soapService.sendMultiplyRq(" Send Rq");
    }

    @Override
    public int substract(Integer n1, Integer n2){
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
