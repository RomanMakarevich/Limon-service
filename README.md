# Limon-service

#User Story

**LS-1: Как "Клиент" я хочу зарегистрироваться в системе, и, если такого пользователя не найдено, регистрируюсь, для возможности войти в систему.**
      
Request:

POST /limon-servise/customers/sign-up

{

    "email" : "vasya@email.com",
    "name" : "VasyaVasiliy",
    "password" : "qwerty",
    "phone" : "+375291234567"
  
}

Response: 201 CREATED


**LS-2: Как "Клиент", будучи ранее зарегистрированным пользователем, я хочу войти в систему, и, если такой пользователь существует и пароль совпадает, войти в систему, для последующей работы с системой.**
      
Request:
      
POST /limon-servise/customers/sign-in
      
{

    "email" : "vasya@email.com",
    "password" : "qwerty"
      
}
      
Response: 200 OK

      
**LS-3: Как "Клиент", я хочу добавить автомобиль в свой гараж.**

Request:
      
POST /limon-servise/cars

{

    "make" : "Mercedes-benz",
    "model" : "W123",
    "vin" : "wdb12312312312312",
    "releaseYear" : "1983",
    "engineType" : "240D",
    "typeOfTransmission" : "mechanical",
    "mileage" : "500000",
    "date" : "01:01:2020"
    

}

Response: 201 CREATED

**LS-4: Как "Клиент", я хочу внести сведенья об обслуживании**

Request:
 
PUT /limon-servise/cars/{carId}/service

{

    "carId" : "1",
    "mileage" : "500001",
    "date" : "02:01:2020",
    "ripeOfWork" : "replacementOrRepair",
    "sparePart" : "oil",
    "description" : "oil Comma 10W40",
    "mechanic" : "self"

}

Response: 200 OK

**LS-5: Как "Клиент", я хочу внести текущий пробек автомобиля**

Request:
 
PUT /limon-servise/cars/{carId}/mileage

{

    "mileage" : "509500",
    "date" : "02:01:2020"

}

Response: 200 OK


**LS-6: Как "Клиент", я хочу посмотреть всю историю обслуживания автомобиля**

Request:
 
GET /limon-servise/cars/{carId}/service

Response: 200 OK

[

    {

        "mileage" : "500001",
        "date" : "02:01:2020",
        "ripeOfWork" : "replacementOrRepair",
        "sparePart" : "oil",
        "description" : "oil Comma 10W40",
        "mechanic" : "self"

    }

]


**LS-7: Как "Работник Limon-Servise", я хочу посмотреть список всех автомобилей, зарегистрированных в системе**

Request:
 
GET /limon-servise/cars/

Response: 200 OK

[

    {

        "make" : "Mercedes-benz",
        "model" : "W123",
        "vin" : "wdb12312312312312",
        "releaseYear" : "1983",
        "engineType" : "240D",
        "typeOfTransmission" : "mechanical",
        "mileage" : "509500",
        "owner" : "VasyaVasiliy"

    }

]


**LS-8: Как "Работник Limon-Servise", я хочу посмотреть список всех автовладельцев, зарегистрированных в системе**

Request:

GET /limon-servise/customers

Response: 200 OK

[

    {

        "email" : "vasya@email.com",
        "name" : "VasyaVasiliy",
        phone" : "+375291234567"

    }

]


**LS-9: Как "Работник Limon-Servise", я хочу посмотреть профиль автовладельца с id - 2**

Request:

GET /limon-servise/customers/{customerId}

{

    "customerId" : "2"

}

Response: 200 OK

{

        "email" : "vasya@email.com",
        "name" : "VasyaVasiliy",
        phone" : "+375291234567"

}


**LS-10: Как "Работник Limon-Servise", я хочу посмотреть список автомобилей, которые пренадлежат автовладельцу с id - 2**

Request:

GET /limon-servise/cars/

{

    "customerId" : "2"

}

Response: 200 OK

[

    {

        "make" : "Mercedes-benz",
        "model" : "W123",
        "vin" : "wdb12312312312312",
        "releaseYear" : "1983",
        "engineType" : "240D",
        "typeOfTransmission" : "mechanical",
        "mileage" : "509500",
        "owner" : "VasyaVasiliy"

    }

]


**LS-11: Как "Работник Limon-Servise", я хочу внести сведенья об обслуживании**
                                       
Request:
                                        
PUT /limon-servise/cars/{carId}/service
                                   
{

    "carId" : "1",
    "mileage" : "500001",
    "date" : "02:01:2020",
    "ripeOfWork" : "replacementOrRepair",
    "sparePart" : "oil",
    "description" : "oil Comma 10W40",
    "mechanic" : "self"
                                       
}
                                       
Response: 200 OK