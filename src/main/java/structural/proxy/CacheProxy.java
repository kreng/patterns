package structural.proxy;

import java.util.Map;
import java.util.WeakHashMap;

public class CacheProxy implements Calculator {
    Map<RequestParameters, Integer> addCache = new WeakHashMap<>();
    Map<RequestParameters, Integer> devideCache = new WeakHashMap<>();
    Map<RequestParameters, Integer> multiplyCache = new WeakHashMap<>();
    Map<RequestParameters, Integer> substractCache = new WeakHashMap<>();

    Calculator service;

    public CacheProxy(Calculator calculator) {
        service = calculator;
    }

    @Override
    public int add(Integer n1, Integer n2) {
        Integer cachedResult = addCache.get(new RequestParameters(n1, n2));
        if (cachedResult != null) {
            return cachedResult;
        }
        Integer result = service.add(n1, n2);
        addCache.put(new RequestParameters(n1, n2), result);
        return result;
    }

    @Override
    public int devide(Integer n1, Integer n2) {
        Integer cachedResult = devideCache.get(new RequestParameters(n1, n2));
        if (cachedResult != null) {
            return cachedResult;
        }
        Integer result = service.devide(n1, n2);
        devideCache.put(new RequestParameters(n1, n2), result);
        return result;
    }

    @Override
    public int multiply(Integer n1, Integer n2) {
        Integer cachedResult = multiplyCache.get(new RequestParameters(n1, n2));
        if (cachedResult != null) {
            return cachedResult;
        }
        Integer result = service.multiply(n1, n2);
        multiplyCache.put(new RequestParameters(n1, n2), result);
        return result;
    }

    @Override
    public int substract(Integer n1, Integer n2) {
        Integer cachedResult = substractCache.get(new RequestParameters(n1, n2));
        if (cachedResult != null) {
            return cachedResult;
        }
        Integer result = service.substract(n1, n2);
        substractCache.put(new RequestParameters(n1, n2), result);
        return result;
    }
}
