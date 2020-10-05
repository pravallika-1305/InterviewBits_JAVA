public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        Map <Integer, ArrayList<Integer>> map = new HashMap<>();
        
        int m = A.size();
        int n = A.get(0).size();
        int i,j;
        
        for(i = 0;i < m;i++){
            for(j = 0;j < n; j++){
                ArrayList<Integer> arraylist;
                if(map.containsKey(i + j)){
                    arraylist = map.get(i + j);
                    
                } else{
                    arraylist = new ArrayList<>();
                    
                }
                arraylist.add(A.get(i).get(j));
                map.put(i + j, arraylist);
            }
        }
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int k : map.keySet()){
            result.add(map.get(k));
        }
       return(result); 
    }
}
