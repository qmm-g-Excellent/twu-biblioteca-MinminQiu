package com.twu.biblioteca.common;

import com.twu.biblioteca.user.entity.User;

import java.util.*;

public class InitUser {

    public static Map<Integer, User> users = new HashMap<Integer, User>() {{
        put(1, new User(1, "080216-001", "123456", " 范冰冰", "123 @qq.com ", " 18829290276 "));
        put(2, new User(2, "080216-002", "123456", "李文", "123@qq.com", "18829290276"));
        put(3, new User(3, "080216-003", "123456", "浪子", "123@qq.com", "18829290276"));
    }};

}
