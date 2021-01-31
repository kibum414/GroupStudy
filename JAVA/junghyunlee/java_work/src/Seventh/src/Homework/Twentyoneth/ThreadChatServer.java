package Homework.Twentyoneth;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ThreadChatServer {
    // 접속한 클라이언트의 정보를 저장할 벡터 배열
    static Vector<ClientHandler> chv = new Vector<ClientHandler>();

    // 클라이언트에 차례대로 번호 부여
    static int i = 0;

    public static void main(String[] args) throws IOException {
        // 서버의 서비스(7777)를 시작
        ServerSocket servSock = new ServerSocket(7777);

        Socket sock;

        for (;;) {
            System.out.println("지금부터 클라이언트의 입장을 대기합니다.");

            // 대기 하고 있다가 클라이언트가 접속 요청을 하면 승인
            sock = servSock.accept();

            System.out.println("새로운 클라이언트 입장 : " + sock);

            // 송신 및 수신 채널 할당
            DataInputStream in = new DataInputStream(sock.getInputStream());
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());

            System.out.println("클라이언트의 요청을 처리하기 위한 핸들러 !");

            // 클라이언트 용 핸들러 작성 필요
            // 서버와 클라이언트 요청에 대한 응답 처리
            // 클라이언트 이름을 부여하고 송수신 채널과 소켓을 매개변수로 전달하며 생성자 호출
            ClientHandler ch = new ClientHandler(in, out, "client" + i, sock);

            // 해당 클라이언트에 대한 스레드 생성
            Thread t = new Thread(ch);

            System.out.println("클라이언트 리스트 관리 !");

            // 클라이언트 리스트에 추가
            chv.add(ch);

            // 클라이언트 핸들러 스레드 시작
            t.start();

            // 번호 증가
            i++;
        }
    }
}
