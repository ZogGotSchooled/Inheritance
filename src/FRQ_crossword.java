//public class FRQ_crossword {
//    //traverse left-to-right first (row major order)
//    //white square with no square left, no square above: label with n (initially n=0, then n++)
//    //puzzle[r][c], where each Square within is either black/white (bool) and has num (int)
//
//        public class Square{
//            public Square(boolean isBlack, int num){
//                //not implemented
//            }
//        }
//
//    public class Crossword{
//        private Square[][] puzzle;
//
//        public Crossword(boolean[][] blackSquares){
//            puzzle = new Square[blackSquares.length][blackSquares[0].length];
//
//            int n = 0;
//            //remember row major order
//            for (int i = 0; i < puzzle.length; i++) {
//                for (int j = 0; j < puzzle[0].length; j++) {
//                    if(toBeLabelled(i,j,blackSquares)) {
//                        n++;
//                        puzzle[i][j] = new Square(blackSquares[i][j], n);
//                    }
//                    else
//                        puzzle[i][j] = new Square(blackSquares[i][j], 0);
//                }
//            }
//        }
//
//        private boolean toBeLabelled(int r, int c, boolean[][] blackSquares){
//            if(blackSquares[c][r]) return false;
//            if(r==0 || c==0) return true;
//            if(blackSquares[c-1][r] || blackSquares[c][r-1]) return true;
//
//            return false;
//        }
//    }
//
//}
