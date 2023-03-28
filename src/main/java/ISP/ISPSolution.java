package ISP;

public class ISPSolution {

    interface Movie {
        void play();
    }

    interface AudioControl {
        void increaseVolume();
    }

    class TheLionKing implements Movie, AudioControl{

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
    }
}
