<?php

require '/Services/Twilio.php';
 
// set your AccountSid and AuthToken from www.twilio.com/user/account
$AccountSid = "AC9c2bb012a5cf78edc956e954482b3c07";
$AuthToken = "b662d762a5b7d55bd2579c642e5dc214";
 
$client = new Services_Twilio($AccountSid, $AuthToken);
 
$sms = $client->account->sms_messages->create(
    "+19899320208", // From this number
    "+16464152856", // To this number
    "Test message!"
);
 
// Display a confirmation message on the screen
echo "Sent message {$sms->sid}";