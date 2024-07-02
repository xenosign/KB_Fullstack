package afternoon.nested.local;

public class LocalOuter {
    private String outerInstance = "outerInstance";

    public void outerMethod(String methodParameter) {
        String methodString = "methodString";

        class LocalInner {
            String localInstance = "localInstance";

            public void printLocal() {
                System.out.println("outerInstance = " + outerInstance);
                System.out.println("methodString = " + methodString);
                System.out.println("methodParameter = " + methodParameter);
                System.out.println("localInstance = " + localInstance);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.printLocal();
    }

    public static void main(String[] args) {
        LocalOuter localOuter = new LocalOuter();
        localOuter.outerMethod("methodParameter");
    }
}
