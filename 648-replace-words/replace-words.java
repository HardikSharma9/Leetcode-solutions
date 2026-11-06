class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        TrieNode root = new TrieNode();

        // Build the trie from dictionary roots
        for (String word : dictionary) {
            TrieNode cur = root;
            for (char c : word.toCharArray()) {
                if (cur.children[c - 'a'] == null) {
                    cur.children[c - 'a'] = new TrieNode();
                }
                cur = cur.children[c - 'a'];
            }
            cur.isEnd = true;
        }

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) result.append(' ');
            result.append(findRoot(root, words[i]));
        }

        return result.toString();
    }

    private String findRoot(TrieNode root, String word) {
        TrieNode cur = root;
        StringBuilder prefix = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (cur.isEnd) {
                return prefix.toString();   // shortest root found
            }
            if (cur.children[c - 'a'] == null) {
                return word;                 // no root matches
            }
            cur = cur.children[c - 'a'];
            prefix.append(c);
        }
        return cur.isEnd ? prefix.toString() : word;
    }
}