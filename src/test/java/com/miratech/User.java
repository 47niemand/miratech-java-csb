package com.miratech;

import java.util.Arrays;

/**
 * Created by Roman Zolotarov on 29/4/16.
 */
public final class User {

    String name;
    int age;
    User[] friends;

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        final User user = (User) o;

        if (age != user.age) return false;
        if (!name.equals(user.name)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(friends, user.friends);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + Arrays.hashCode(friends);
        return result;
    }



}

