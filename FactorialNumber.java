public int factorial(int n) {
    if (n < 0) {
        return -1; // Factorial not defined for negative numbers
    }
    
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result = result * i;
    }
    return result;
}