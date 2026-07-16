# 🍦 FROZORA — Ice Cream Ordering App (Android UI Design)

FROZORA is a mobile application UI concept designed for ice cream lovers who want a faster, easier way to explore flavors and place orders — without the long queues and guesswork of a physical store. This project was built entirely using **Android XML** as part of the IT2010 – Mobile Application Development module (SLIIT, 2nd Year), focused purely on UI/UX design and screen navigation, without backend functionality.

---

## 📱 Project Overview

**Target Audience:** Ice cream lovers of all ages — anyone who wants a quicker, more convenient way to browse and order ice cream.

**Problem it Solves:** Waiting in long queues or struggling to explore different ice cream flavors in-store reduces customer satisfaction. FROZORA solves this by letting users browse the full menu, view detailed item descriptions, and place orders directly from their phone — no waiting required.

**Core Features:**
- Friendly onboarding flow introducing the app to first-time users
- Simple sign-up / login flow
- Home screen with search, special offers, and featured categories
- Category-based browsing of ice cream flavors
- Detailed item view with image, description, and price
- Cart system for managing selected items
- Dedicated payment and profile sections

---

## 🎬 App Flow / Screens

| Screen | Purpose |
|---|---|
| Welcome Screen | Displays the FROZORA logo — first screen the user sees |
| Onboarding (x3) | Introduces the app's main features and benefits to new users |
| Sign Up / Login | Allows users to create an account or log in |
| Home | Search bar, special offers, featured categories, popular items |
| Categories | Browse ice cream flavors by category |
| Item Details | Full description, image, and price for each item |
| Cart | Shows items added by the user before checkout |
| Payment | Handles the checkout flow |
| Profile | User account details and settings |

Navigation between all screens is handled using **Android Intents**.

---

## 🎨 Color Palette — 60-30-10 Rule

| Role | Color | Usage |
|---|---|---|
| Primary (60%) | White | Backgrounds, cards — keeps the interface clean and uncluttered |
| Secondary (30%) | Pink | Buttons, key sections, highlights |
| Accent (10%) | Light Pink | Secondary accents, icons, small interactive elements |
| Extras | Pastel tones | Icons and interactive elements for a fresh, playful feel |

All colors are defined centrally in `res/values/colors.xml` for consistency across every screen.

---

## 🧩 Layouts & Views Used

**Layouts:**
- LinearLayout (Vertical / Horizontal) — for structured, stacked content
- ConstraintLayout — for flexible, responsive screen positioning
- ScrollView — for scrollable content on longer screens
- Adequate margin and padding applied throughout for visual breathing room

**Views:**
- TextView
- EditText
- Button
- ImageView
- RecyclerView / GridView (for category & item listings)
- CardView (for item and offer cards)

All static text is managed through `res/values/strings.xml` rather than being hardcoded into layout files.

---

## 🛠️ Tools & Tech

- Android Studio
- Android XML (layouts, drawables, resources)
- `colors.xml` and `strings.xml` resource files
- Intent-based navigation between screens

---

## 📁 Repository Structure

```
FROZORA/
├── app/
│   └── src/main/
│       ├── res/
│       │   ├── layout/          → All XML screen layouts
│       │   ├── values/
│       │   │   ├── colors.xml
│       │   │   └── strings.xml
│       │   └── drawable/        → Icons and images
│       └── java/                → Activity files (navigation via Intent)
├── screenshots/                 → App screenshots
└── README.md
```

---

## 📷 Screenshots

*(Add your screen screenshots here — Welcome, Onboarding, Home, Categories, Cart, etc.)*

```markdown
![Welcome Screen](screenshots/welcome.png)
![Home Screen](screenshots/home.png)
```

---

## 🎓 Course Context

This project was developed for **IT2010 – Mobile Application Development**, BSc (Hons) in Information Technology, 2nd Year, Faculty of Computing, SLIIT — Lab Exam 02, focused on evaluating Android XML UI design skills including layout selection, the 60-30-10 color rule, proper use of views, and screen-to-screen interactivity.

---

## 👤 Author

**Nirasha**
BSc (Hons) IT – Data Science, SLIIT
