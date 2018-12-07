/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twilio;

// Download the twilio-java library from http://twilio.com/docs/libraries
import java.util.Map;
import java.util.HashMap;
 
import com.twilio.sdk.resource.instance.Account;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Message;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
 
public class Example {
 
    /* Find your sid and token at twilio.com/user/account */
    public static final String ACCOUNT_SID = "";
    public static final String AUTH_TOKEN = "b662d762a5b7d55bd2579c642e5dc214";
 
    public static void main(String[] args) throws TwilioRestException {
    TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
 
    // Build a filter for the SmsList
    Map<String, String> params = new HashMap<String, String>();
    params.put("Body", "Jenny please?! I love you <3");
    params.put("To", "");
    params.put("From", "");
 
    SmsFactory messageFactory = client.getAccount().getSmsFactory();
    Sms message = messageFactory.create(params);
    System.out.println(message.getSid());
    }
}
//</namevaluepair>