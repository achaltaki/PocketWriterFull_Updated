# 📱 PocketWriter Android App

PocketWriter is a full-featured Android application designed for creating, customizing, and reading user-generated content using reusable layout templates.

---

## ✨ Features

### 1. 📰 Feed View
- Scrollable list of published articles.
- Each article shows a title, thumbnail, and short preview.
- Tapping opens the full article in reader mode.
- Data fetched from a Spring Boot backend via REST APIs.

### 2. 🧩 Custom Template Builder
- Drag-and-drop UI to create reusable article layouts.
- Add and position multiple images and text blocks.
- Save templates for future use.
- Optional: Resize/crop images and customize fonts, colors, etc.

### 3. 📝 Article Creator
- Use templates or start from scratch.
- Add text, images, and layout components.
- Save and publish articles to the Feed.

---

## 🛠 Tech Stack

- **Frontend:** Android (Java/Kotlin), Jetpack Compose / XML UI
- **Backend:** Spring Boot (REST API)
- **Database:** PostgreSQL / H2 (backend side)
- **Build System:** Gradle
- **Version Control:** Git + GitHub

---

## 🚀 Getting Started

### ✅ Requirements
- Android Studio (Electric Eel or newer)
- Java JDK 11 or 17
- Android SDK (set path correctly)
- Internet connection (for Gradle sync & dependencies)

---

### 📦 How to Run

1. **Clone the project**:

```bash
git clone https://github.com/YOUR_USERNAME/pocketwriter.git
cd pocketwriter
