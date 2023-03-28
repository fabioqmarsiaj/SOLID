package OCP;

public class OCPSolution {

    abstract class Video {
        abstract void calculatesInterest();
    }

    class Movie extends Video {

        @Override
        public void calculatesInterest() {
            throw new UnsupportedOperationException();
            // ! Implements its own algorithm
        }
    }

    class TVShow extends Video {

        @Override
        public void calculatesInterest() {
            throw new UnsupportedOperationException();
            // ! Implements its own algorithm
        }
    }
}
