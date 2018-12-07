<?php

require '/Services/Twilio.php';
 
// set your AccountSid and AuthToken from www.twilio.com/user/account
$AccountSid = "";
$AuthToken = "";
 
$client = new Services_Twilio($AccountSid, $AuthToken);
 
$sms = $client->account->sms_messages->create(
    "+19899320208", // From this number
    "+14152856", // To this number
    "Test message!"
);
 
// Display a confirmation message on the screen
echo "Sent message {$sms->sid}";