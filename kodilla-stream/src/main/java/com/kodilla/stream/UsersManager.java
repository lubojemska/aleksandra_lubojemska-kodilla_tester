package com.kodilla.stream;

public class UsersManager {
    public static void main(String[] args) {
        UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .forEach(un -> System.out.println(un));
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
