package service;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.setOut;

public class AuditService {
    String path = "/home/xnx/java/TicketSeller/data/logs.csv";

    public void auditAction(String Action){
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new java.util.Date());
        String content = Action + "," + timeStamp;

        Writer writer = new Writer();
        try {
            writer.writeContentToFile(content, path);
        }
        catch (Exception e ){
            System.out.println("Scrierea in fisier a esuat!");;
        }
    }

}
