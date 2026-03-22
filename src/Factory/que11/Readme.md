You have a CompressionFactory that creates ZIPCompressor, RARCompressor, and GZIPCompressor.
A developer suggests registering compressors dynamically at runtime so new types can be added without
touching the factory class.
Implement this self-registering factory using a Map<String, Supplier<Compressor>> where each
compressor registers itself using a static block.
Then explain: does this fully solve the OCP problem of Simple Factory? Why or why not?