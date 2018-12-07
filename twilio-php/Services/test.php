<?php
$people = array('' => 'Yuan Tao',
				'' => 'Yan');

if (!$name = $people[$_REQUEST['From']]){
		$name = 'Monkey';
}
 
header('content-type:text/xml');
echo "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
?>
<Response>
		<Sms><?php echo $name; ?>, thanks for the message!</Sms>
</Response>


