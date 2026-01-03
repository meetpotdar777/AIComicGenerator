# 🎨 AI Comic Generator Image (Java)

A lightweight Java application that generates comic book art panels using AI. This project uses the **Pollinations.ai** API to create high-quality, high-contrast comic visuals based on user-provided titles and story descriptions.

## ✨ Features
- **Interactive CLI:** Input your comic title, genre, and story directly into the terminal.
- **Instant Visualization:** Automatically opens the generated image in your default web browser.
- **Free AI Integration:** Powered by Pollinations.ai (Flux model) — no API keys or billing required.
- **Maven-Based:** Easy dependency management and build process.

---

## 🚀 Getting Started

### Prerequisites
- **Java JDK 11** or higher.
- **Apache Maven** installed and configured in your system PATH.

### Installation
1. Clone or download this project to your local machine.
2. Navigate to the project directory:
   ```bash
   cd "C:\Users\Administrator\OneDrive\Desktop\Java Project\AIComicGenerator"
   ```
   Running the Application
Use the following Maven command to compile and run the project:
    ```bash
    mvn clean compile exec:java -Dexec.mainClass="AIComicGenerator"
    ```

---

## 🛠️ Project Structure

```bash
AIComicGenerator/
├── src/
│   └── main/
│       └── java/
│           └── AIComicGenerator.java   # Main source code
├── target/                             # Compiled files (auto-generated)
├──  LICENSE.txt                         # License information
├── pom.xml                             # Maven configuration
└── README.md                           # Documentation
```

## 📖 How It Works

- **User Input:** The program asks for a Title, Genre, and Story Description.

- **Prompt Engineering:** It wraps your input into a specialized prompt: "Detailed comic book art panel, [Type] style, high contrast, ink lines. Title: [Title]. Scene: [Story]"

- **API Call:** It sends this request to the Pollinations AI engine.

- **Result:** The URL is printed to the console, and your browser is triggered to open the image.

## 🧪 Example Input

- **Title:** The Last Circuit

- **Type:** Cyberpunk / Sci-Fi

- **Story:** A glowing robotic eye reflecting a neon city sunset.

---

## 📜 License

This project is open-source and available under the MIT License.This project is open-source and available under the MIT License.
