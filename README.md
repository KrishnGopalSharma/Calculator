# 🧮 Calculator Application

A web-based calculator application developed using J2EE, JSP, and Servlets. This application performs basic arithmetic operations including addition, subtraction, multiplication, and division.

## Features

- ➕ Addition
- ➖ Subtraction
- ✖️ Multiplication
- ➗ Division

## Prerequisites

Before you begin, ensure you have met the following requirements:

- ☕ Java 8 or higher
- 🌐 Apache Tomcat 9 or higher
- 🐱‍💻 Maven 3.6.0 or higher

## Installation

1. **Clone the Repository**

    ```bash
    git clone https://github.com/yourusername/calculator-app.git
    ```

2. **Navigate to the Project Directory**

    ```bash
    cd calculator-app
    ```

3. **Build the Project**

    Use Maven to build the project:

    ```bash
    mvn clean install
    ```

4. **Deploy to Tomcat**

    Copy the generated WAR file from the `target` directory to the `webapps` directory of your Apache Tomcat server.

5. **Start Tomcat**

    Start your Apache Tomcat server to deploy the application.

6. **Access the Application**

    Open your web browser and go to [http://localhost:8080/calculator-app](http://localhost:8080/calculator-app) to view the application.

## Usage

1. **Home Page**

    The home page displays a simple calculator interface where you can input two numbers and select an operation.

    ![Home Page](screenshots/home_page.png)

2. **Perform Calculations**

    Input two numbers, select an arithmetic operation (Addition, Subtraction, Multiplication, Division), and click the "Calculate" button to see the result.

    ![Calculate](screenshots/calculate.png)

## Project Structure

    ```
    calculator-app/
    ├── src/
    │   ├── main/
    │   │   ├── java/com/example/calculator/
    │   │   │   ├── servlet/
    │   │   │   │   └── CalculatorServlet.java
    │   │   ├── webapp/
    │   │   │   ├── WEB-INF/
    │   │   │   │   └── web.xml
    │   │   │   ├── index.jsp
    │   │   │   └── result.jsp
    ├── pom.xml
    └── README.md
    ```

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch.
3. Make your changes.
4. Submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries, please contact [Krishn Gopal Sharma](mailto:panditgopal800@gmail.com).

---
