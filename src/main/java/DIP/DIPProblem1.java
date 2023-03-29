package DIP;

public class DIPProblem1 {

    class DramaCategory {

    }

    class Movie {
        private String name;
        private DramaCategory category;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public DramaCategory getCategory() {
            return category;
        }

        public void setCategory(DramaCategory category) {
            this.category = category;
        }
    }
}
