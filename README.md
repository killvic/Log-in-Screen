# Log-in-Screen

Task: Create a good UX for users entering their email address and password during registration in the application.

Requirements:
  1. Email format validation. Example: user@gmail is not a valid email address (.com is missing)
  2. The user interface should indicate whether the email address is valid or not. If necessary, the interface should indicate what is wrong with the address
  3. Autocompletion and domain availability check. Users often make typos when entering their address. For example, they may incorrectly enter the domain name (gmail.con instead of gmail.com)
  4. Password validation. There are no restrictions on the entered characters, but there is a minimum and maximum length requirement. If necessary, the interface should indicate what is wrong with the password
  5. Check that all fields are filled in and indicate which field is missing

For Autocompletion, it is necessary to:
  - Check the existence of the entered domain
  - Indicate what is wrong with the entered name
  - Offer autocompletion of the domain name with the most likely and popular domain names. For example, if the user enters "user@", possible completions could be "user@gmail.com", "user@yahoo.com", etc. If the user specifies "user@g", popular domains starting with "g" could be suggested, for example: "user@gmail.com", "user@gmail.co.uk"


List of supported by autocomplete emails:
gmail.com
yahoo.com
outlook.com
aol.com
icloud.com
hotmail.com
live.com
mail.com
msn.com
ymail.com
me.com
hotmail.co.uk
yahoo.co.uk
outlook.co.uk
rocketmail.com
yahoo.fr
yahoo.de
yahoo.in
yahoo.ca
yahoo.com.br
yahoo.co.in
yahoo.co.jp
yahoo.co.id
yahoo.com.au
yahoo.com.mx
yahoo.es
yahoo.com.ar
yahoo.com.ph
yahoo.com.co
yahoo.com.vn
yahoo.it
yahoo.com.tr
yahoo.pl
yahoo.com.ua
yahoo.co.th
yahoo.com.sg
yahoo.com.sa
yahoo.com.my
yahoo.com.cn
yahoo.com.pk
yahoo.com.ng
yahoo.com.eg
yahoo.com.bd
yahoo.com.ve
yahoo.com.pe
yahoo.com.ph
yahoo.com.ng
yahoo.com.my
yahoo.com.mx
yahoo.com.kw
