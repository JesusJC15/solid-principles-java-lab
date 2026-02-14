# SOLID Principles Java Lab

This project is a compact Java lab that demonstrates each SOLID principle with simple, focused classes and unit tests. Each principle lives in its own package, and tests validate the expected behavior.

## Author
- Jesus Alberto Jauregui Conde

## Tech Stack
- Java 17
- Maven
- JUnit 5

## Project Structure
```
src/
	main/java/com/example/solid/
		dip/
		isp/
		lsp/
		ocp/
		srp/
	test/java/com/example/solid/
		dip/
		isp/
		lsp/
		ocp/
		srp/
```

## How to Run
### Build
```
mvn clean package
```

### Run Tests
```
mvn test
```

## Principles and Examples

### SRP (Single Responsibility Principle)
Responsibility is separated across these classes:
- `Invoice`: holds invoice data.
- `InvoiceCalculator`: calculates totals (VAT 21%).
- `InvoicePrinter`: formats a printable invoice.
- `InvoiceRepository`: saves the invoice.

**Tests**
- Calculates totals correctly.
- Prints invoice text with total.
- Saves invoice without errors.

### OCP (Open/Closed Principle)
The discount behavior is extended using a strategy interface:
- `DiscountStrategy` defines the contract.
- `RegularDiscount` and `VipDiscount` provide implementations.
- `DiscountCalculator` consumes any strategy.

**Tests**
- Applies VIP discount (20%).
- Applies Regular discount (10%).

### LSP (Liskov Substitution Principle)
Interfaces are split to avoid invalid substitutions:
- `Drivable` for driving behavior.
- `Refuelable` for refuel behavior.
- `ElectricCar` only drives, `GasCar` drives and refuels.

**Tests**
- `ElectricCar` can drive.
- `GasCar` can drive and refuel.

### ISP (Interface Segregation Principle)
Interfaces are narrow and specific:
- `Workable` and `Eatable` instead of a single fat interface.
- `Developer` only works.
- `HumanWorker` works and eats.

**Tests**
- `Developer` can work.
- `HumanWorker` can work and eat.

### DIP (Dependency Inversion Principle)
High-level modules depend on abstractions, not concretions:
- `OrderProcessor` depends on `Database`.
- `MySQLDatabase` implements `Database`.

**Tests**
- Order processing does not throw.
- A fake database verifies `saveOrder()` is invoked.

## Design Patterns Used
- Strategy (OCP)
- Dependency Injection (DIP)
- Repository (SRP)