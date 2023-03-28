package OCP;

public class OCPProblem {

    class Video {
        private String type;

        public void calculateInterest(){
            if(this.type.equals("Movie")){
                // Calculates interests based on movies
            } else if(this.type.equals("TVShow")){
                // Calculates interests based on TV Shows
            }
            // ! Everytime some type needs to be created I need to modify the Video class.
        }
    }

}
