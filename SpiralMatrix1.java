public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
          int m = A.size();
          int n = A.get(0).size();
          int t = 0;
          int b = m - 1;
          int l = 0;
          int r = n - 1;
          int dir = 0;
          ArrayList<Integer> result = new ArrayList<>();
          while(l <= r && t <= b) {
              if(dir == 0){
                  for(int i = t;i <= r; i ++) {
                      result.add(A.get(t).get(i));
                  }
                  t++;
                  }
              else if(dir == 1){
                  for(int i = t;i <= b; i ++) {
                      result.add(A.get(i).get(r));
                  }
                  r--;
              } 
              else if(dir == 2){
                  for(int i = r;i >= l ; i --) {
                      result.add(A.get(b).get(i));
                  }
                  b--;
              }
              else if(dir == 3){
                  for(int i = b;i >= t ; i --) {
                      result.add(A.get(i).get(l));
                  }
                  l++;
              }
              dir = (dir + 1) % 4;
          }
        return(result);
    }
}
