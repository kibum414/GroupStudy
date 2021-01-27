package Homework.Twentyoneth;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ThreadChatClient {
    // 포트 번호 7777
    final static int SERVPORT = 7777;

    public static void main(String[] args)
            throws UnknownHostException, IOException {
        Scanner scan = new Scanner(System.in);

        // localhost의 IP 가져옴
        InetAddress ip = InetAddress.getByName("localhost");

        // 특정 IP를 가지고 서비스(포트 번호)에 접속 요청
        Socket sock = new Socket(ip, SERVPORT);

        // 송신 및 수신 채널 할당
        DataInputStream in = new DataInputStream(sock.getInputStream());
        DataOutputStream out = new DataOutputStream(sock.getOutputStream());

        // transfer(송신) 스레드 생성
        Thread tx = new Thread(new Runnable() {
            @Override
            // 스레드가 실행되면
            public void run() {
                // 무한 반복하며
                for (;;) {
                    // 클라이언트로부터 입력 받음
                    String msg = scan.nextLine();

                    try {
                        // 입력 값을 송신 채널을 통해 내보냄
                        out.writeUTF(msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // receive(수신) 스레드 생성
        Thread rx = new Thread(new Runnable() {
            @Override
            // 스레드가 실행되면
            public void run() {
                // 무한 반복하며
                for (;;) {
                    try {
                        // 입력 값이 있을 시 읽어 오고
                        String msg = in.readUTF();
                        // 읽어 온 값을 화면에 출력함
                        System.out.println("rx : " + msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // 송신 및 수신 스레드 시작
        tx.start();
        rx.start();
    }
}
