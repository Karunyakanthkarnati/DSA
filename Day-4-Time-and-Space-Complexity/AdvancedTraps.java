public class AdvancedTraps {

    // O(n log n)
    void trap1(int n) {
        for (int i = n; i > 0; i /= 2) {
            for (int j = 0; j < n; j++) {}
        }
    }

    // O(n)
    void trap2(int n) {
        for (int i = n; i > 0; i /= 2) {
            for (int j = 0; j < i; j++) {}
        }
    }

    // O(log^2 n)
    void trap3(int n) {
        for (int i = 1; i < n; i *= 2) {
            for (int j = 1; j < i; j *= 2) {}
        }
    }
}
