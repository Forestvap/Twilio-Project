<?php

require '/Services/Twilio.php';
 
// set your AccountSid and AuthToken from www.twilio.com/user/account
$AccountSid = "";
$AuthToken = "";
 
$client = new Services_Twilio($AccountSid, $AuthToken);
 
$sms = $client->account->sms_messages->create(
    "", // From this number
    "", // To this number
    "Test message!"
);
 
// Display a confirmation message on the screen
echo "Sent message {$sms->sid}";