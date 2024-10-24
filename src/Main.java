public class Main {
    public static void main(String[] args) {
        Container<String> container = new Container<>();

        container.add("Первый");
        container.add("Второй");
        container.add("Третий");

        System.out.println("Элемент по индексу 1: " + container.get(1));
        System.out.println("Размер контейнера: " + container.size());

        container.remove(1);
        System.out.println("Размер контейнера после удаления: " + container.size());

        System.out.println("Элемент по индексу 1 после удаления: " + container.get(1));
    }
}