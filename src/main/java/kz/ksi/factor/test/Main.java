package kz.ksi.factor.test;

import kz.factor.resources.tofischema.*;

/**
 * Created by Erlan.Ibraev on 05.07.2016.
 */
public class Main {

    public static void main(String[] args) {
        MessagePortService service = new MessagePortService();
        MessagePort port = service.getMessagePortSoap11();

        GetDataRequest request = new GetDataRequest();
        GetDataResponse response = port.getData(request); //port.;

        // System.out.println(response.toString());

    }
}
