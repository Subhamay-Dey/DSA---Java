import java.util.*;

class WordSquares {
    class TrieNode {
        TrieNode[] children;
        List<String> startWith;

        TrieNode() {
            children = new TrieNode[26];
            startWith = new ArrayList<>();
        }
    }

    class Trie {
        TrieNode root;

        Trie(List<String> words) {
            root = new TrieNode();
            for (String word : words) {
                TrieNode node = root;
                for (char ch : word.toCharArray()) {
                    if (node.children[ch - 'a'] == null) {
                        node.children[ch - 'a'] = new TrieNode();
                    }
                    node = node.children[ch - 'a'];
                    node.startWith.add(word);
                }
            }
        }

        List<String> findByPrefix(String prefix) {
            TrieNode node = root;
            for (char ch : prefix.toCharArray()) {
                if (node.children[ch - 'a'] == null) {
                    return new ArrayList<>();
                }
                node = node.children[ch - 'a'];
            }
            return node.startWith;
        }
    }

    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> result = new ArrayList<>();
        if (words == null || words.length == 0) return result;

        int wordLen = words[0].length();
        Trie trie = new Trie(Arrays.asList(words));

        List<String> square = new ArrayList<>();
        for (String word : words) {
            square.add(word);
            search(trie, wordLen, square, result);
            square.remove(square.size() - 1);
        }

        return result;
    }

    private void search(Trie trie, int wordLen, List<String> square, List<List<String>> result) {
        if (square.size() == wordLen) {
            result.add(new ArrayList<>(square));
            return;
        }

        StringBuilder prefix = new StringBuilder();
        int step = square.size();
        for (String word : square) {
            prefix.append(word.charAt(step));
        }

        List<String> startWith = trie.findByPrefix(prefix.toString());
        for (String candidate : startWith) {
            square.add(candidate);
            search(trie, wordLen, square, result);
            square.remove(square.size() - 1);
        }
    }

    public static void main(String[] args) {
        WordSquares ws = new WordSquares();
        String[] words = {"area", "lead", "wall", "lady", "ball"};
        List<List<String>> squares = ws.wordSquares(words);
        for (List<String> square : squares) {
            for (String word : square) {
                System.out.println(word);
            }
            System.out.println();
        }
    }
}
