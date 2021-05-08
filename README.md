# Springboot Simple REST CURD demo with spring boot built in methods

```
Spring boot provides us some built-in curd methods so that we become relieved from writing so much code in the DAO file. 
Here I used postman to check CURD API.

```

- Get all the data from database 
 <img src="https://user-images.githubusercontent.com/25477302/117531718-bc92e280-b005-11eb-8675-b7aaad3a4ecc.jpg" width="100%"></img>
 
- Get employee with a specific employee id
 <img src="https://user-images.githubusercontent.com/25477302/117531794-36c36700-b006-11eb-8860-e76e4a72c385.jpg" width="100%"></img>

- Delete an employee with an employee id
<img src="https://user-images.githubusercontent.com/25477302/117531861-843fd400-b006-11eb-9599-faa4ed4339dc.jpg" width="100%"></img>

- Insert a new employee 
<img src="https://user-images.githubusercontent.com/25477302/117531937-d123aa80-b006-11eb-9e51-e8956c067a97.jpg" width="100%"></img>
<img src="https://user-images.githubusercontent.com/25477302/117531977-03350c80-b007-11eb-9f62-4e326bdc6a5a.jpg" width="100%"></img>

- Update an employee
<img src="https://user-images.githubusercontent.com/25477302/117532027-45f6e480-b007-11eb-969d-7a3a7b40fcb7.jpg" width="100%"></img>
<img src="https://user-images.githubusercontent.com/25477302/117532031-4a230200-b007-11eb-9886-1d54ba66f3da.jpg" width="100%"></img>


## Note :
- Must use the plural form of database table when using URL to get data
- You can either extends CrudRepository<T,ID> interface or JpaRepository<T,ID> interface
