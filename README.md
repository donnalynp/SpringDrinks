# SpringDrinks
- ## Why are we doing this? <br/>
We are creating a Spring Boot API as the final project for the bootcamp.
- ## How I expected the challenge to go? <br/>
I expected the project to be more challenging as there is a lot of things to remember. I also thought that it would be harder to put the project on a repository on GitHub as this is something we have not practice very often but it has been less challenging than what I first thought to be. 
- ## What went well? / What didn't go as planned? <br/>
I run to some problems with mySQL table, I initially had ‘long’ as my data type for price and amount but later realised that I needed the price to be ‘double/decimal’ and amount to be a ‘’string so that I could add the measurement of the unit of the amount of the drinks (mainly litres). So, I had to modify the data type on mySQL workbench after changing it in my domain class. <br/>
Towards the end, when running the Controller Integration Test, I was having some errors, my table on mySQL was already created so the test wasn’t running. I had to add a new line in the fizzydrink-schema.sql file to drop the existing table so that I could run the test. In the end, I was able to overcome all these errors.
- ## Possible improvements for future revisions of the project. <br/>
Some possible improvements for future revisions of the project are:
  -	To increase the test coverage as it only goes up to 59.9%; with more practice I could try to get it up to 80% as a stretch goal.
  -	To make use of the Jira board from the start. – I created the Jira board and updated it all in the last day. It would have been more realistic if I had created   it on the first day of the project and updated it day by day as I was doing the project.
  -	To practice how to merge branches. – I had a branch called database that I wanted to merge with the dev branch, but I realised it wasn’t possible because I   originally created the databases branch from the main. At the end, I merged database with the main branch.
- ##	Screenshots showing your postman requests and the output from the API.

POST Request - Create Id 2 
<img width="1440" alt="POST Request - Create Id 2" src="https://user-images.githubusercontent.com/93529843/148786637-482f9208-2812-4ac9-ac32-32fe32e06115.png">

DEL Request - Delete Id 1 
<img width="1440" alt="DEL Request - Delete Id 1" src="https://user-images.githubusercontent.com/93529843/148787266-6f50c6c7-5a1d-4f2f-8e4f-a39ad6df12f4.png">

GET Request - ReadAll after deleting Id 1
<img width="1440" alt="GET Request - ReadAll after deleting id 1" src="https://user-images.githubusercontent.com/93529843/148787290-605a83bc-fea6-467f-b71c-314d62bc14b4.png">

POST Request - Create Id 3
<img width="1440" alt="POST Request - Create Id 3" src="https://user-images.githubusercontent.com/93529843/148787529-38015da7-4ffc-4c8b-b0dc-c4b47e9e7d04.png">

GET Request - ReadAll after creating Id 3
<img width="1440" alt="GET Request - ReadAll after creating id 3" src="https://user-images.githubusercontent.com/93529843/148787551-c64b30db-2ceb-4290-b34f-5db6dc7e9e0d.png">

GET Request - ReadById reading Id 3
<img width="1440" alt="GET Request - ReadById read Id 3" src="https://user-images.githubusercontent.com/93529843/148787807-08a86b04-26f9-4bfe-8da1-f21e2d9a820c.png">

DEL Request - Delete Id 3
<img width="1440" alt="DEL Request - Delete Id 3" src="https://user-images.githubusercontent.com/93529843/148787824-68f70f2c-bbe5-4b25-b83f-561858601545.png">

GET Request - ReadAll after deleting Id 3
<img width="1440" alt="GET Request - ReadAll after deleting Id 3" src="https://user-images.githubusercontent.com/93529843/148788032-db3868b8-5ab6-428c-8340-9a621a46d3c4.png">

PUT Request - Updated Id 2
<img width="1440" alt="PUT Request - Updated Id 2" src="https://user-images.githubusercontent.com/93529843/148788042-969ceec0-e437-46df-b8b0-180cc39fa0ef.png">

- ## Screenshots of your database to prove that data is being persisted.

Connecting to MySQL Database <br/>
A new schema was created on MySQL workbench but the table with its columns were created by running the code on Eclipse
<img width="1440" alt="Connecting to MySQL Database" src="https://user-images.githubusercontent.com/93529843/148788269-e40b2fb8-4ec9-42e4-9dae-6eff426e1c1a.png">

End Result After Postman Requests
<img width="1440" alt="End Result After Postman Requests" src="https://user-images.githubusercontent.com/93529843/148788473-99d3d9be-477c-4597-80bd-4f6f9cb6d977.png">

- ## Screenshot of your test results, including coverage report.
Fizzy Drink Service Unit Test using JUnit4 Annotations
<img width="1440" alt="Fizzy Drink Service Unit Test JUnit4 Annotations" src="https://user-images.githubusercontent.com/93529843/148788827-3c16f2d7-4567-4a3d-8bc7-84dbd6dff295.png">

 Fizzy Drink Service Unit Test using JUnit5 Annotations
<img width="1440" alt="Fizzy Drink Service Unit Test JUnit5 Annotations" src="https://user-images.githubusercontent.com/93529843/148788839-e1252905-7920-4c53-80f1-2e32f5372885.png">

Using EqualsVerifier
<img width="1440" alt="EqualsVerifier" src="https://user-images.githubusercontent.com/93529843/148788928-5e8b7979-b7da-462b-92a8-906de0e1aa88.png">

No Null Fields Test
<img width="1440" alt="No Null Fields Test" src="https://user-images.githubusercontent.com/93529843/148788958-4c018692-d14b-4a90-960d-9994de3ed005.png">

Setters Test
<img width="1440" alt="Setters Test" src="https://user-images.githubusercontent.com/93529843/148788973-27c3a77b-93fa-444c-985f-1d28361c3d53.png">

Controller Unit Test
<img width="1440" alt="Controller Unit Test" src="https://user-images.githubusercontent.com/93529843/148789081-1e15557c-d435-4712-a6a9-dc1fcc580769.png">

Controller Integration Test
<img width="1440" alt="Controller Integration Test" src="https://user-images.githubusercontent.com/93529843/148789093-ec3ab9ac-886c-4caa-bd3b-8799effd0a9e.png">

Coverage Check
<img width="1440" alt="Coverage check " src="https://user-images.githubusercontent.com/93529843/148789105-c3431542-124b-4a7d-9eaf-b37c592cfd25.png">

- ## Link to Jira Board
Click here to go to the Jira Board for this project:<br/>
https://donnalyn-parocha.atlassian.net/jira/software/projects/SPRIN/boards/1/roadmap

