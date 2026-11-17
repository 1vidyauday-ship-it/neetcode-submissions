class PrefixTree {
    private TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode tNode = root;
        for (Character c : word.toCharArray()) {
            if(!tNode.map.containsKey(c)) {
                tNode.map.put(c, new TrieNode());
            } 
            tNode = tNode.map.get(c);
            
        }
        tNode.end = true;
    }

    public boolean search(String word) {
        TrieNode tNode = root;
        for (Character c : word.toCharArray()) {
            if(!tNode.map.containsKey(c)) {
               return false;
            } 
            tNode = tNode.map.get(c);
            
        }
        return tNode.end == true;
    }

    public boolean startsWith(String prefix) {
        TrieNode tNode = root;
        for (Character c : prefix.toCharArray()) {
            if(!tNode.map.containsKey(c)) {
               return false;
            } 
            tNode = tNode.map.get(c);
            
        }
        return true;
    }

    class TrieNode {
        HashMap<Character, TrieNode> map;
        boolean end = false;

        public TrieNode() {
            map = new HashMap<>();
            end = false;
        }
    }
}
