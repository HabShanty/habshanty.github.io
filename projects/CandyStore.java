class CandyStore {
    public int candy(int[] ratings) {

        int solution = 0; 
        int corpusLength = ratings.length;
        int index, prevIndex, nextIndex = 0;
        int[] candies = new int[corpusLength];
        
        //If there is only one child
        if(corpusLength == 1) return 1;


        //Compare each child to their left neighbor. 
        //If a child’s rating is higher, they get more candies than the left neighbor. 
        //Otherwise, they keep at least one candy.
        for(int i = 1; i < corpusLength; i++){

            
            if( ratings[i] > ratings[i - 1]) {
                candies[i] += 1;
                
            }
            System.out.println(candies[i] + " " + candies[i + 1]);
        }

        //Compare each child to their right neighbor. If a child’s rating is higher, 
        //you need to ensure the candy count stays valid by updating it to the max of its current value 
        //and one more than the right neighbor’s candies.

        for(int i = corpusLength - 1; i > -1; i--){
            
        }
        return solution;
    }

    public static void main(String[] args) {
        CandyStore solution = new CandyStore();

        int[] children1 = {1, 0, 2};
        System.out.println(solution.candy(children1));  // Output: 5
    }
}