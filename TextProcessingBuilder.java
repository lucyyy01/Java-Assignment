class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        sb.append(" Java");

        System.out.println(sb);
    }
}

// StringBuilder is not synchronized and faster, while StringBuffer is synchronized and thread-safe