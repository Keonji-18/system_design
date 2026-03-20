You have a Simple Factory that creates DatabaseConnection objects (MySQL, PostgreSQL, MongoDB).
The factory currently uses a long if-else chain. Refactor it using a Map<String, Supplier<DatabaseConnection>> to eliminate
the chain. Then explain: why is this still considered Simple Factory and not Factory Method, even after the refactor?
