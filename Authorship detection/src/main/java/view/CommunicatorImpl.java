package view;

import java.util.Scanner;

public class CommunicatorImpl implements Communicator {
    private Scanner scanner;

    public CommunicatorImpl() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void show(String text) {
        System.out.println(text);
    }

    @Override
    public String getText() {
        return scanner.nextLine();
    }

    @Override
    public int getNumber() {
        return scanner.nextInt();
    }
}
