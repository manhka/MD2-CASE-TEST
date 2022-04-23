package model;

import java.io.Serializable;

public class NameCategory implements Serializable {
    String categoryName;

    public NameCategory() {
    }

    public NameCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public NameCategory setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return null;
    }

    @Override
    public String toString() {
        return "NameCategory{" +
                "categoryName='" + categoryName + '\'' +
                '}'+"\n";
    }
}
