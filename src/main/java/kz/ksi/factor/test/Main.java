package kz.ksi.factor.test;


import kz.factor.resources.test.TestPort;
import kz.factor.resources.test.TestPortService;

/**
 * Created by Erlan.Ibraev on 05.07.2016.
 */
public class Main {

    public static void main(String[] args) {
        TestPortService service = new TestPortService();
        TestPort port = service.getTestPortSoap11();

/*        GetDataRequest request = new GetDataRequest();
        GetDataResponse response = port.getData(request); //port.;

        System.out.println(response.toString());*/

    }
}
