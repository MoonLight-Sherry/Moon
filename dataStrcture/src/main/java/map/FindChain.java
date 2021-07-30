package map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindChain {

    public static void findChain(Map<String, List<String>> adjacentWorlds, String first, String second)

    {
        Map<String, String> previousWord = new HashMap<String, String>();
        LinkedList<String> q = new LinkedList<String>();

        q.addLast(first);
        while (!q.isEmpty()) {
            String current = q.removeFirst();
            List<String> adj = adjacentWorlds.get(current);

            if (adj != null)
                for (String adjWord : adj )
                    if (previousWord.get(adjWord) == null) {
                        previousWord.put(adjWord, current);
                        q.addLast(adjWord);
                    }
            previousWord.put(first, null);
        }

    }

}
