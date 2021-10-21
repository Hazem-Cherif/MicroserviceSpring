let DB_URI = "mongodb+srv://hazem123:hazem123@courzelo.j0sab.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";

if (process.env.MONGO_DB_URI) {
  DB_URI = process.env.MONGO_DB_URI;
}

module.exports = {
  DB_URI
};
