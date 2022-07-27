package sd.test.patterns.builder;

public class Client {
    public static void main(String[] args) {
        System.out.println(Model.getBuilder()
                .setName("Srabana")
                .setId(4)
                .setSection('a')
                .build());
    }
}
