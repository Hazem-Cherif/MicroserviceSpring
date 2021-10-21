const express = require("express");
const Users = require("./models/users_model");
const app = express();
const bodyParser = require("body-parser");

app.use(bodyParser.json());

app.get("/", (req, res) => {
  res.json({ msg: "Hello , you are now in user microservice devolopped with nodeJs" });
});

app.get("/users", async (req, res) => {
  try {
    const users = await Users.find().select('-password')

    res.json(users)
} catch (err) {
    return res.status(500).json({msg: err.message})
}
});


module.exports = app;
