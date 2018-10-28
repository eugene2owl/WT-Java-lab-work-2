package entity.book;

public enum BookType {

    PAPER_BOOK("paper book"),
    DIGITAL_BOOK("e-book");

    private String type;

    BookType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}