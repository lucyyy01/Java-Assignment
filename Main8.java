interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

class ImageProcessor implements Filterable {
    public void apply_filter(String filter_type) {
        System.out.println("Applying image filter: " + filter_type);
    }

    public void reset_filter() {
        System.out.println("Resetting image filters");
    }
}

class DataAnalyzer implements Filterable {
    public void apply_filter(String filter_type) {
        System.out.println("Applying data filter: " + filter_type);
    }

    public void reset_filter() {
        System.out.println("Resetting data filters");
    }
}

public class Main8 {
    public static void main(String[] args) {
        ImageProcessor img = new ImageProcessor();
        DataAnalyzer data = new DataAnalyzer();

        img.apply_filter("blur");
        img.reset_filter();

        data.apply_filter("outlier_removal");
        data.reset_filter();
    }
}