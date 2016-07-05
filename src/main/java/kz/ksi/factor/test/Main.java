package kz.ksi.factor.test;

import kz.factor.resources.tofischema.GetMessageRequest;
import kz.factor.resources.tofischema.GetMessageResponse;
import kz.factor.resources.tofischema.MessagePort;
import kz.factor.resources.tofischema.MessagePortService;

/**
 * Created by Erlan.Ibraev on 05.07.2016.
 */
public class Main {

    public static void main(String[] args) {
        MessagePortService service = new MessagePortService();
        MessagePort port = service.getMessagePortSoap11();

        GetMessageRequest request = new GetMessageRequest();
        GetMessageResponse response = port.getMessage(request);

        System.out.println(response.toString());

    }
}
