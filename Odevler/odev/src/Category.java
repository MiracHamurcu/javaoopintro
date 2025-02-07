public class Category {
    private double id;
    private String CategoryName;

    public Category(){

    }

    public Category(double id, String categoryName) {
        this.id = id;
        this.CategoryName = categoryName;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getCategoryName() {
        return CategoryName + "!";
    }

    public void setCategoryName(String categoryName) {
        this.CategoryName = categoryName;
    }
}
