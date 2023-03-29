package DIP;

public class DIPProblem2 {

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
            return new DramaCategory();
        }
    }
}
