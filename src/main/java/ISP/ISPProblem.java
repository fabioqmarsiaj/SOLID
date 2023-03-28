package ISP;

public class ISPProblem {
    interface Movie {
        void play();

        void increaseVolume();
    }

    class TheLionKing implements Movie {

        @Override
        public void play() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void increaseVolume() {
            throw new UnsupportedOperationException();
        }
    }

    class ModernTimes implements Movie {

        @Override
        public void play() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void increaseVolume() {
            throw new UnsupportedOperationException("Will not be used for this class");
        }
    }
}
