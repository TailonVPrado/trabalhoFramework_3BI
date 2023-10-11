/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singleton;

/**
 *
 * @author tailon.prado
 */
public class Singleton {

    public static void main(String[] args) {
        UserManager user = UserManager.getInstance();
        Usuario users =  new Usuario("login", "teste123", "Tailon Prado");
        user.set(users, users.getNome());
        UserManager otherUser = UserManager.getInstance();
        System.out.println(otherUser.get(users));
        user.set(users, users.getLogin());
        otherUser = UserManager.getInstance();
        System.out.println(otherUser.get(users));
    }
}
