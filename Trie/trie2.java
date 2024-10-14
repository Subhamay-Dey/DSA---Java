public @interface trie2 {
    // Trie Node class
class TrieNode {
    TrieNode[] children = new TrieNode[26];  // Assuming only lowercase letters 'a' to 'z'
    boolean isEndOfWord;

    // Constructor
    TrieNode() {
        isEndOfWord = false;
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }
}

// Trie class
public class Trie {
    private TrieNode root;

    // Constructor
    public Trie() {
        root = new TrieNode();
    }

    // Function to insert a word into the Trie
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    // Function to search for a word in the Trie
    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return (node != null && node.isEndOfWord);
    }

    // Function to check if any word starts with the given prefix
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        // Insert words into Trie
        trie.insert("apple");
        trie.insert("app");

        // Search for words
        System.out.println(trie.search("apple"));   // true
        System.out.println(trie.search("app"));     // true
        System.out.println(trie.search("appl"));    // false

        // Check prefixes
        System.out.println(trie.startsWith("app")); // true
        System.out.println(trie.startsWith("bat")); // false
    }
}

}
