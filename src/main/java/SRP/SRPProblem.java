package SRP;

public class SRPProblem {

    class Course {
        private String name;
        private String category;
        private String description;

        public String conenction(){
            return "DB Conenction";
        }

        public String insert(String category){
            return "DB insertion " + category;
        }

        public void createCategory(){
            conenction();
            insert(this.category);
        }
    }
}
