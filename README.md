# innovetes

build introduction
   step 1: go to service-user till pom.xml file using commandline
   step 2: then clean and install maven project e.i---- mvn clean install
   step 3: go to target file e.i--- cd target
   step 4: run project e.i----- java -jar services-user-0.0.1-SNAPSHOT.jar

Rest api point
1.Employee
    1.1) 
    url-------http://localhost:8091/employee/add
        method:post
        body:{"name":"",//mandatory
        "dateOfBirth":""}
    1.2) get all employee with pagination
         url-----http://localhost:8091/employee/getAll
         method:get
    1.3) get by employee name
        url---- http://localhost:8091/employee/Em_get?eId=bbb
         method:get
    1.4):put with Id
          url---http://localhost:8091/employee/Em_update
          method:Put
          body:{
              "id": 1,
              "name": "bbb",//mandatory
              "dateOfBirth": "12/12/2020"
            }
 2.Address entity
         2.1) add address
             url-----http://localhost:8091/address/add
             method:post
             body:{
                "addrLineOne":"jhdfgjdfn",//mandatory
                "addrLineTwo":"kdfgkjnkn",
                "city":"pune"
              }
          2.2) get All address with pagination
               url----- http://localhost:8091/address/getAll
                method:get
          2.3) get individual by Id
              url------ http://localhost:8091/address/Ad_get?id=1
               method:get
          2.4) update by Id
               url------ http://localhost:8091/address/Ad_update
                method:put
                body:{
              "id":"1",
              "addrLineOne":"jhdfgjdfn",
              "addrLineTwo":"hhhhh",
              "city":"pune"
            }
          2.5) partial update to address field
               url-------http://localhost:8091/address/Ad_par_update
               method:patch
               body:{
              "id":"1",
              "addrLineOne":"hello...",
              "city":"ok"
            }
 3. Em[ployeeAddress with relationShi[p
          3.1) add employeeAddress
          url-----http://localhost:8091/employeeAddress/add
          method:post
          bopdy:{
                "employee":{
                          "id": 1,
                          "name": "ccc",
                          "dateOfBirth": "12/12/2020"
                      },
                "address": {
                          "id": 1,
                          "addrLineOne": "jhdfgjdfn",
                          "addrLineTwo": "kdfgkjnkn",
                          "city": "pune"
                      },
                "addressType":"office"
	
}
        3.2) get all employee address with pagination
             url-----http://localhost:8091/employeeAddress/getAll
             method:Get
          
       3.3) get individual employee and address detail
            url-------http://localhost:8091/employeeAddress/Em_get?id=2
            method:get
       
