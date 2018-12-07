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
 
public class SmsSender {
 
    /* Find your sid and token at twilio.com/user/account */
    public static final String ACCOUNT_SID = "";
    public static final String AUTH_TOKEN = "";
 
    public static void main(String[] args) throws TwilioRestException {
 
        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
 
        Account account = client.getAccount();
 
        MessageFactory messageFactory = account.getMessageFactory();
        ArrayList params = new ArrayList();
        params.add(new BasicNameValuePair("To", "+14152856")); // Replace with a valid phone number for your account.
        params.add(new BasicNameValuePair("From", "+19899320208")); // Replace with a valid phone number for your account.
        params.add(new BasicNameValuePair("Body", "LOL!"));
        Message sms = messageFactory.create(params);
    }
}
//</namevaluepair>