An e-commerce platform uses Abstract Factory to support two payment ecosystems:
StripeEcosystem (creates StripePaymentProcessor + StripeInvoice) and PayPalEcosystem (creates PayPalPaymentProcessor + PayPalInvoice).
Mid-development, a requirement is added: each ecosystem must also produce a RefundHandler.
What changes are needed across the entire pattern? Why does Abstract Factory make this kind of extension costly?