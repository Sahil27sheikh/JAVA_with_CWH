public class CWH_32_methods_overloading {
    static void tellme(){  // void is use when nothing to return.
        System.out.println("Hii, I am  a sahil form umred city");
    }
    public static void main(String[] args) {
        tellme();
        // output: Hii, I am  a sahil form umred city

        System.out.print("Who are you? ");tellme();
        // Output: Who are you? Hii, I am  a sahil form umred city
    }
}
