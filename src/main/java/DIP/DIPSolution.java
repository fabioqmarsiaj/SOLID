package DIP;

public class DIPSolution {

    public void main(String[] args) {
        Movie dramaMovie = new Movie("Name", new DramaCategory());
        Movie comedyMovie = new Movie("Name", new ComedyCategory());
    }

    interface Category {

    }

    class DramaCategory implements Category {

    }

    class ComedyCategory implements Category {

    }

    class Movie {
        private final String name;
        private final Category category;

        public Movie(String name, Category category) {
            this.name = name;
            this.category = category;
        }
    }
}
