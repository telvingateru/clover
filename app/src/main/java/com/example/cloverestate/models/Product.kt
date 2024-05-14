package com.example.cloverestate.models

class Product {
    var imageUrl:String = ""
    var estate:String = ""
    var location:String = ""
    var feature1:String = ""
    var price:String = ""
    var feature2:String = ""
    var feature3:String = ""
    var feature4:String = ""
    var category:String = ""

    constructor(location: String, price: String, estate: String, feature1: String, imageUrl: String, feature2: String, feature3: String, feature4: String, category: String) {
        this.imageUrl = imageUrl
        this.estate = estate
        this.location = location
        this.feature1 = feature1
        this.feature2 = feature2
        this.feature3 = feature2
        this.feature4 = feature4
        this.category = category
    }

    constructor()
}