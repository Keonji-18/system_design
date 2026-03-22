You have a DocumentParser abstract class with factory method createParser().
Subclasses return XMLParser and JSONParser.
A new requirement: parsers must be created based on the file extension
detected at runtime (.xml → XML, .json → JSON), but the detection logic should NOT live in the client.
Design a solution using Factory Method where the abstract class itself detects the extension and
calls the right subclass factory method.
Is this still pure Factory Method? Discuss.