const app = require("./src/app");
const { DB_URI } = require("./src/config");
const mongoose = require("mongoose");

let DB_URI_M = "mongodb+srv://hazem123:hazem123@courzelo.j0sab.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";


mongoose.connect(DB_URI_M, {
  useCreateIndex: true,
  useFindAndModify: false,
  useNewUrlParser: true,
  useUnifiedTopology: true
}, err => {
  if(err) throw err;
  
})

app.listen(3050, () => {
  console.log("running on port 3050");
  console.log("--------------------------");
});
