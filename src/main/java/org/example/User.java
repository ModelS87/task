package org.example;

import java.util.*;

public class User {
    private int age;
    private String name;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static void Main() {
        User user = new User("John", 33);
        User user1 = new User("John", 39);
        User user2 = new User("Natasha", 25);
        User user3 = new User("Natasha", 35);

        User[] users = new User[]{user, user1, user2, user3};
        List<User> List = new ArrayList<>();

        Optional<User> oldest = Arrays.stream(users)
                .distinct()
                .sorted(Comparator.comparing(User::getAge)
                        .thenComparing(User::getName))
                .max(Comparator.comparing(User::getAge));
    }
}


