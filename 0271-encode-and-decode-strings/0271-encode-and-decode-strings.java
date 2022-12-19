public class Codec {

    // Encodes a list of strings to a single string.
    HashMap<String, List<String>> map = new HashMap<>();
    
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        
        String s = "";
        for(int i = 0; i < strs.size(); i++){
            sb.append(strs.get(i));
            // s = s + strs.get(i);
        }
        map.put(sb.toString(),strs);
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        
        return map.get(s);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));