public class Kata {
    //https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java
    public static String rps(String p1, String p2) {
        String result = null;
        switch (p1) {
            case "scissors": {
                switch (p2) {
                    case "scissors": {
                        result = "Draw!";
                        break;
                    }
                    case "paper": {
                        result = "Player 1 won!";
                        break;
                    }
                    case "rock": {
                        result = "Player 2 won!";
                        break;
                    }
                }
                break;
            }
            case "paper": {
                switch (p2) {
                    case "scissors": {
                        result = "Player 2 won!";
                        break;
                    }
                    case "paper": {
                        result = "Draw!";
                        break;
                    }
                    case "rock": {
                        result = "Player 1 won!";
                        break;
                    }
                }
                break;
            }
            case "rock": {
                switch (p2) {
                    case "scissors": {
                        result = "Player 1 won!";
                        break;
                    }
                    case "paper": {
                        result = "Player 2 won!";
                        break;
                    }
                    case "rock": {
                        result = "Draw!";
                    }
                }
            }
        }
        return result;
    }
}
