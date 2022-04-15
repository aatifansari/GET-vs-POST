# GET-vs-POST
An illustrative project to show how data is send to the server using GET and POST methods

The application start from index.jsp file. The default welcome file for https://{host_name}/SimpleServlet context path.

- WELCOME PAGE

![image](https://user-images.githubusercontent.com/44142827/163630247-e2661c49-e610-4ac3-b6e1-6cf6defa5289.png)


Two method are given to pass data to the server

- Submit Form using GET method
- Submit Form using POST method

Selecting any option opens a simple form page

![image](https://user-images.githubusercontent.com/44142827/163631299-95cd8196-0483-4223-8b38-5271c1c18dd7.png)

a). When GET method is used user is given warning that it's credential is visible in the URL

![image](https://user-images.githubusercontent.com/44142827/163632400-35ceefa5-0f48-4ecd-9e88-4452c05e4d51.png)


### URL
![image](https://user-images.githubusercontent.com/44142827/163631541-4802f5f1-0b47-47e6-ba43-a45470253dc4.png)

b). When POST method is used data is passed in the body so the secret is safe!!

![image](https://user-images.githubusercontent.com/44142827/163631695-7d9fd4c7-fe15-47d0-a892-aba1f67669dd.png)


GET Method - 
- Parameters are passed in the URL therefore it should not be used when dealing with sensitive data
- GET request can be bookmarked
- GET requests remain in the browser history

POST Method -
- Parameter are passed in the request body therefore used when dealing with sensitive data
- POST cannot be bookmarked
- POST request do not remain in the browser history
- POST requests have no restrictions on data length.

Used deployment descriptor file to map FormServlet to SimpleServlet/submittedForm context path.

![image](https://user-images.githubusercontent.com/44142827/163632675-c49a4cd1-f58d-46bb-89ea-02d68480ce2c.png)


## IMPORTANT NOTES
- web.xml file directory -  src/main/webapp/WEB-INF
- jsp pages directory - src/main/webapp

## Tools and Technologies
- Java 
- Servlet
- JSP
- Maven
