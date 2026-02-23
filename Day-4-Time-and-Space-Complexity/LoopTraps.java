public class LoopTraps {

    // O(n)
    void linear(int n) {
        for (int i = 0; i < n; i++) {}
    }

    // O(log n)
    void logarithmic(int n) {
        for (int i = 1; i < n; i *= 2) {}
    }

    // O(n^2)
    void quadratic(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {}
        }
    }
}
