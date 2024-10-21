//This solution has better time complexity that GPT, but less readability
class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int gasSupply = 0;
        int gasCost = 0;
        int tank = 0;
        int startingStation = 0;
        int stationsVisited =0;
        int numStations = gas.length;
        int i = 0, c = 0; //Index and counters

        for (i = 0; i < numStations; i++){
            gasSupply += gas[i];
            gasCost += cost[i];
        }
        
        if(gasSupply < gasCost){
            return -1;
        }
        
        while(stationsVisited < numStations){
            tank += gas[c] - cost[c];
            //System.out.println(tank + " " + c);

            if (tank < 0) {
                startingStation = c + 1;
                stationsVisited = 0;
                tank = 0;
                c++;
            }
            else if(c == numStations - 1 && numStations != 1){
                c = 0;
            }
            else{
                stationsVisited++;
                c++;
            }
        
        }
            
        return startingStation;
    }

    public static void main(String[] args) {
        GasStation solution = new GasStation();

        // Example 1
        int[] gas1 = {1, 2, 3, 4, 5};
        int[] cost1 = {3, 4, 5, 1, 2};
        System.out.println(solution.canCompleteCircuit(gas1, cost1));  // Output: 3
        
        // Example 2
        int[] gas2 = {2, 3, 4};
        int[] cost2 = {3, 4, 3};
        System.out.println(solution.canCompleteCircuit(gas2, cost2));  // Output: -1

        // Example 3
        int[] gas3 = {5};
        int[] cost3 = {4};
        System.out.println(solution.canCompleteCircuit(gas3, cost3));  // Output: -1
    }
}