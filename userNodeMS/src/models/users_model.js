const mongoose = require('mongoose')


const userSchema = new mongoose.Schema({
    name: {
        type: String,
        required: [true, "Please enter your name!"],
        trim: true
    },
    email: {
        type: String,
        required: [true, "Please enter your email!"],
        trim: true,
        unique: true
    },
    password: {
        type: String,
        required: [true, "Please enter your password!"]
    },
    role: {
        type: Number,
        default: 0 // 0 = user, 1 = admin
    },
    First_name : {  
        type: String,
        default : null  
    },
    Last_name : {  
        type: String,
        default : null  
    },
    Address : {  
        type: String,
        default : null  
    },
    Country : {  
        type: String,
        default : null  
    },
    Description : {  
        type: String,
        default : null  
    }
}, {
    timestamps: true
})

module.exports = mongoose.model("Users", userSchema)