package LSP;

public class LSPProblem {

    class Movie {
        public void increaseVolume(){
            throw new UnsupportedOperationException();
        }
    }

    class TheLionKing extends Movie {
        // ! Movie with sound
    }

    class ModernTimes extends Movie {
        // ! Movie without sound so cant extends from Movie
    }

    public void main(String[] args) {
        Movie theLionKing = new TheLionKing();
    }
}


