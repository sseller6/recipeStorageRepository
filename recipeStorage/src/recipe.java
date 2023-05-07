public class recipe {
//    member variables: Name & ingredients.
    private String name;
    public recipe() {
        this.name = "Default";
    }
    public recipe(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}