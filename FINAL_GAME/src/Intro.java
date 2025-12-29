/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Philip
 */
import java.util.*;

public class Intro {
    Scanner sc = new Scanner(System.in);

    public void gameStart() throws InterruptedException {

        System.out.println("Welcome to Fight of Characters!!");
        System.out.print("User: ");
        String user = sc.nextLine();

        Info objInfo = new Info();

        System.out.println("Press any key to continue.. ");
        sc.nextLine();
        System.out.println("Choose your Hero");
        System.out.println("[1] Naruto Uzumaki\t\t[2] Sasuke Uchiha");
        System.out.println("[3] Monkey D. Luffy\t\t[4] Gojo Saturo");
        System.out.println("[5] Sukuna\t\t\t\t[6] Megumi Fushiguro");
        System.out.println("[7] Madara Uchiha\t\t[8] Pain");
        System.out.println();
        System.out.print("Input: ");
        int input = sc.nextInt();
        System.out.println("Hero Info:");
        switch (input) {
            case 1:
                objInfo.Naruto();
                break;
            case 2:
                objInfo.Sasuke();
                break;
            case 3:
                objInfo.Luffy();
                break;
            case 4:
                objInfo.Gojo();
                break;
            case 5:
                objInfo.Sukuna();
                break;
            case 6:
                objInfo.Megumi();
                break;
            case 7:
                objInfo.Madara();
                break;
            case 8:
                objInfo.Pain();
                break;
        }
        System.out.println("Select your Opponent..");
        System.out.println("[1] Naruto Uzumaki\t\t[2] Sasuke Uchiha");
        System.out.println("[3] Monkey D. Luffy\t\t[4] Gojo Saturo");
        System.out.println("[5] Sukuna\t\t\t\t[6] Megumi Fushiguro");
        System.out.println("[7] Madara Uchiha\t\t[8] Pain");
        System.out.println();
        System.out.print("Input: ");
        int inputOpponent = sc.nextInt();
        System.out.println("Opponent Info:");
        switch (inputOpponent) {
            case 1:
                objInfo.Naruto();
                break;
            case 2:
                objInfo.Sasuke();
                break;
            case 3:
                objInfo.Luffy();
                break;
            case 4:
                objInfo.Gojo();
                break;
            case 5:
                objInfo.Sukuna();
                break;
            case 6:
                objInfo.Megumi();
                break;
            case 7:
                objInfo.Madara();
                break;
            case 8:
                objInfo.Pain();
                break;
        }


    }

    }

