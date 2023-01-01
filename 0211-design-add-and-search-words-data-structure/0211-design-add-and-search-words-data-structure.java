
class WordDictionary {
    Node root;
    private class Node{
        char val;
        boolean isEnd;
        Node[] children;
        
        public Node(char val){
            this.val = val;
            isEnd = false;
            children = new Node[26];
        }
    }
    
    public WordDictionary() {
        root = new Node('\0');
    }
    
    public void addWord(String word) {
        Node cur = root;
        for(char x: word.toCharArray()){
            if(cur.children[x-'a'] == null){
                cur.children[x-'a'] = new Node(x);
            }
            
            cur = cur.children[x-'a'];
        }
        cur.isEnd = true;
    }
    
    public boolean search(String word) {
        return searchHelper(word,root,0);
    }
    private boolean searchHelper(String word, Node curr, int index) {
        for (int i = index; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == '.') {
                for (Node temp : curr.children) {
                    if (temp != null && searchHelper(word, temp, i + 1)) {
                        return true;
                    }
                }

                return false;
            }

            if (curr.children[ch - 'a'] == null) {
                return false;
            }

            curr = curr.children[ch - 'a'];
        }

        return curr.isEnd;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */