class Node{
    public char value;
    public boolean isEnd;
    public Node[] children;
    
    public Node(char val){
        this.value = val;
        this.isEnd = false;
        this.children = new Node[26];
    }
}


class Trie {
    Node root;
    
    public Trie() {
        root = new Node('\0');
    }
    
    public void insert(String word) {
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
        Node cur = root;
        for(char x: word.toCharArray()){
            if(cur.children[x-'a'] == null){
                return false;
            }
            cur = cur.children[x-'a'];
        }
        return cur.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        
        Node cur = root;
        for(char x: prefix.toCharArray()){
            if(cur.children[x-'a'] == null){
                return false;
            }
            cur = cur.children[x-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */