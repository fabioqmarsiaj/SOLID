package SRP;

public class SRPSolution {

    class Course {
        private String name;
        private String category;
        private String description;
        private DBConnection dbConnection;

        public Course(String name, String category, String description, DBConnection dbConnection) {
            this.name = name;
            this.category = category;
            this.description = description;
            this.dbConnection = dbConnection;
        }

        public void createCategory(){
            dbConnection.insert(this.category);
        }
    }

    class DBConnection{

        public DBConnection() {
            connection();
        }

        public String connection(){
            return "DB Conenction";
        }

        public String insert(String category){
            return "DB insertion " + category;
        }
    }
}
