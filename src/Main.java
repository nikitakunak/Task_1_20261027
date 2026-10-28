class Main {
    void main() {
        int x = 3;
        String out = "";

        if (x % 2 == 0) {
            out = "x is even";
        } else {
            out = "x is odd";
        }

        if (x > 0) {
            out += " and positive";
        } else if (x < 0) {
            out += " and negative";
        } else {
            out += " and zero";
        }

        System.out.println(out);
    }
}