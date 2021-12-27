/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int st = 1, end = n;
        while(st <= end){
            int myPick = st + (end - st)/2;
            //logic
            int res = guess(myPick);
            //handling all three cases
            if(res == 0)
                return myPick;
            else if(res == -1)
                end = myPick - 1;
            else if(res == 1)
                st = myPick + 1;
        }
        return -1;
    }
}