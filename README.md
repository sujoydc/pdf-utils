# PDF Utilities

A Spring Boot application for PDF processing and manipulation built with Java 17.

## Features

- PDF processing and manipulation using Apache PDFBox
- RESTful API endpoints for PDF operations
- Spring Boot Actuator for monitoring and management
- FreeMarker template engine support
- Reactive and traditional web service capabilities

## Prerequisites

- Java 17 or higher
- Gradle 7.x or higher

## Getting Started

### Building the Project

```bash
./gradlew build
```

### Running the Application

```bash
./gradlew bootRun
```

The application will start on the default port (8080).

## Project Structure

```
pdf-utils/
├── src/                 # Source code
├── build/              # Build output
├── gradle/             # Gradle wrapper
├── bin/                # Executable scripts
└── build.gradle        # Project configuration
```

## Dependencies

- Spring Boot 3.0.5
- Apache PDFBox 2.0.24
- Spring Web
- Spring Web Services
- Spring WebFlux
- FreeMarker
- Lombok
- Spring Boot Actuator

## Development

The project uses Spring Boot DevTools for enhanced development experience. Changes to source files will automatically trigger application restarts.

## Testing

Run the test suite with:

```bash
./gradlew test
```

## API Documentation

API documentation will be available at:
- Actuator endpoints: `http://localhost:8080/actuator`
- Swagger UI (if configured): `http://localhost:8080/swagger-ui.html`

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Support

For support, please open an issue in the GitHub repository. 