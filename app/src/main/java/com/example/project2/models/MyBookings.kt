package com.example.project2.models


class ordering {
    var paymentmethod:String=""
    var destination:String=""
    var arrival_time: String=""
    var cutlrey:String=""
    var id:String=""
    constructor(paymentmethod:String,destination:String,arrival_time:String,cutlery:String,id:String){
        this.paymentmethod=paymentmethod
        this.destination=destination
        this.arrival_time=arrival_time
        this.cutlrey= cutlrey
        this.id=id
    }
    constructor()

}

class MyBookings(
    paymentmethod: Any?,
    destination: Any?,
    arrivaltime: Any?,
    cutlurey: Any?,
    id: String
) {

}
