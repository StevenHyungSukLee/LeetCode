class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Pair,Set<Character>> map = new HashMap<>();

        for(int i = 0; i < 9; i++){
            HashSet<Character> setR = new HashSet<>();
            HashSet<Character> setD = new HashSet<>();
            for(int j = 0; j < 9; j++){
                // System.out.println(board[j][i]);

                if(board[i][j] != '.'){
                    if(setR.contains(board[i][j])){
                        return false;
                    }
                    setR.add(board[i][j]);
                    int x = i/3;
                    int y = j/3;
                
                    if(map.containsKey(new Pair(x,y))){
                        if(map.get(new Pair(x,y)).contains(board[i][j])){
                            return false;
                        }
                        map.get(new Pair(x,y)).add(board[i][j]);
                    }else{
                        map.put(new Pair(x,y),new HashSet<Character>());
                        map.get(new Pair(x,y)).add(board[i][j]);
                    }
                }
                if(board[j][i] != '.'){
                    if(setD.contains(board[j][i])){
                        return false;
                    }
                    setD.add(board[j][i]);
                }


            }
        }
        return true;
           
    }
}