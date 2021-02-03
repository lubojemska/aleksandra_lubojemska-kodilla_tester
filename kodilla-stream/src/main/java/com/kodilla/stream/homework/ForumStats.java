package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double post = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge()>=40)
                .mapToInt(p -> p.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(post);

        double post2 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() <40)
                .mapToInt(p -> p.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(post2);
    }
}
