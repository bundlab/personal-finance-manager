# 💰 Personal Finance Manager

A modern **Personal Finance Management System** built with **Java 21** and **Spring Boot 3.3.4**.  
Track your income, expenses, manage categories, and monitor your financial health with a clean and responsive UI.

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.4-brightgreen)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1.2-green)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5.3.3-purple)

---

## ✨ Features

- **Dashboard** – Overview of current balance, monthly income & expenses
- **Transaction Management** – Add, view, and delete income/expense transactions
- **Category Management** – Create custom categories with color coding
- **Responsive UI** – Built with Bootstrap 5 + clean Thymeleaf templates
- **Data Persistence** – H2 in-memory database (easy to switch to MySQL/PostgreSQL)
- **Validation** – Form validation using Jakarta Validation
- **Java 21** – Modern Java features with Spring Boot best practices

---

## 🛠️ Technologies Used

| Technology          | Version     |
|---------------------|-------------|
| Java                | 21          |
| Spring Boot         | 3.3.4       |
| Spring Data JPA     | -           |
| Thymeleaf           | 3.1.2       |
| Bootstrap           | 5.3.3       |
| H2 Database         | -           |
| Lombok              | -           |
| Maven               | 3.8.7+      |

---


## 📌 How to Use

Dashboard (/)
View your current balance, monthly income, and expenses at a glance.
Transactions (/transactions)
Add new income or expense transactions with description and date.
Categories (/categories)
Manage your spending categories (Salary, Food, Rent, Transport, etc.) with custom colors.

---

## 🗄️ Database

Currently uses H2 in-memory database (data resets on restart).
Ready to switch to MySQL or PostgreSQL by updating application.properties.

---

## 📁 Project Structure
textsrc/main/java/com/bundlab/finance/
├── controller/          # MVC Controllers
├── model/               # JPA Entities
├── repository/          # Spring Data JPA Repositories
├── service/             # Business Logic
└── PersonalFinanceApplication.java

src/main/resources/
├── templates/           # Thymeleaf HTML pages
└── application.properties

---

## 🔮 Future Enhancements (Planned)

User Authentication & Registration (Spring Security)
Monthly Budget Planning per Category
Reports & Charts (Income vs Expense)
Export to PDF/Excel
Docker Support
MySQL/PostgreSQL Integration
REST APIs for Mobile App

---

## 🤝 Contributing
Contributions, issues, and feature requests are welcome!

Fork the project
Create your feature branch (git checkout -b feature/amazing-feature)
Commit your changes (git commit -m 'Add amazing feature')
Push to the branch (git push origin feature/amazing-feature)
Open a Pull Request

---

## 📄 License
This project is open-source and available under the MIT License.

---

## 🚀 Quick Start

### Prerequisites
- Java 21
- Maven 3.8+

### Clone the repository
```bash
git clone https://github.com/bundlab_/personal-finance-manager.git
cd personal-finance-manager
