import java.net.URI;
import java.awt.Desktop;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class AIComicGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("   WELCOME TO AI COMIC GENERATOR    ");
        System.out.println("====================================\n");

        // --- STEP 1: USER INPUTS ---
        System.out.print("Enter Comic Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Type (e.g., Horror, Sci-Fi, Funny): ");
        String type = scanner.nextLine();

        System.out.print("Enter the Story/Scene: ");
        String story = scanner.nextLine();

        System.out.println("\n--- Generating your comic... ---");
        
        try {
            // --- STEP 2: BUILD THE ART PROMPT ---
            String fullPrompt = String.format(
                "Detailed comic book art panel, %s style, high contrast, ink lines. Title: %s. Scene: %s",
                type, title, story
            );

            // --- STEP 3: GENERATE AND OPEN ---
            String imageUrl = generateComicImage(fullPrompt);

            System.out.println("\nSUCCESS!");
            System.out.println("Image URL: " + imageUrl);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); // Clean up the scanner
        }
    }

    public static String generateComicImage(String prompt) throws Exception {
        // Encode characters for the URL
        String encodedPrompt = URLEncoder.encode(prompt, StandardCharsets.UTF_8);
        
        // Use the Free Pollinations AI URL
        String imageUrl = "https://image.pollinations.ai/prompt/" + encodedPrompt + "?width=1024&height=1024&nologo=true&seed=" + (int)(Math.random() * 1000);

        // Open browser automatically
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(new URI(imageUrl));
            System.out.println("Opening your comic in your web browser now...");
        }

        return imageUrl;
    }
}