try {
    int result = 10 / 0; // Pembagian oleh nol
    System.out.println(result);
} catch (ArithmeticException e) {
    System.out.println("Error: Pembagian oleh nol tidak diizinkan.");
}
