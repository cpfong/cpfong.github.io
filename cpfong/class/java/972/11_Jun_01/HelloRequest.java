public class HelloRequest implements IRequest {
    private String name;
 
    public HelloRequest(String name) {
        this.name = name;
    }
 
    public void execute() {
        System.out.printf("Hello! %s!%n", name);
    }
}
