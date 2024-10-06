import java.util.HashMap;
import java.util.Map;

public class KeyValueExtractor {

    public static Map<String, String> extractKeyValuePairs(String inputText) {
        Map<String, String> keyValueMap = new HashMap<>();

        // Split input text by new lines (each line is a key-value pair)
        String[] lines = inputText.split("\\r?\\n");

        for (String line : lines) {
            // Split each line by "=" to get key and value
            String[] parts = line.split("=", 2);  // Limit to 2 parts to avoid issues if value contains "="

            if (parts.length == 2) {
                String key = parts[0].trim();
                String value = parts[1].trim();

                // Store the key-value pair in the map
                keyValueMap.put(key, value);
            } else {
                System.out.println("Skipping invalid line: " + line);
            }
        }

        return keyValueMap;
    }

    public static void main(String[] args) {
        // Example input text
        String inputText = "name=John Doe\nage=29\nemail=john.doe@example.com";

        // Extract key-value pairs
        Map<String, String> keyValuePairs = extractKeyValuePairs(inputText);

        // Print the key-value pairs
        for (Map.Entry<String, String> entry : keyValuePairs.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
