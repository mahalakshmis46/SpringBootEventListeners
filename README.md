# SpringBootEventListeners
Simple SpringBoot RestAPI which has basic CRUD operations.
Using Hibernate EventListeners, all the changes to entity are captured to an Audit table.

Example inputs:

http://localhost:8080/getAudit
http://localhost:8080/updateUser
http://localhost:8080/createUser

{
"id":  1,	
"name": "test",
"city": "London"
}
