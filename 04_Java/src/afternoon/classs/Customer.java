package afternoon.classs;

public class Customer {
    String name;
    int age;
    int total;
    boolean isBlackList;

    Customer() {
        this.name = "아직 몰라요";
        this.age = 0;
        this.total= 0;
        this.isBlackList = false;
    }

    Customer(String name, int age, int total, boolean isBlackList) {
        this.name = name;
        this.age = age;
        this.total = total;
        this.isBlackList = isBlackList;
    }

    void printCustomerInfo() {
        System.out.println("고객님의 이름은 : " + this.name);
        System.out.println("고객님의 나이는 : " + this.age);
        System.out.println("고객님의 총 사용한 금액은 : " + this.total);
        System.out.println("고객님은 블랙리스트가 맞나요? : " + this.isBlackList);
    }
}