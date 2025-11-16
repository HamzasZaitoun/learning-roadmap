import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class DBOperation {
    public void save(Object o )
    {
//        if(o.getClass().getSimpleName().equals("Payment"));
        if(o instanceof AuditTag)
        {
            System.out.println("Auditing....");

            try {
                FileWriter fileWriter = new FileWriter("audits",true);
                PrintWriter printWriter= new PrintWriter(fileWriter);
                printWriter.println("time: "+ LocalDateTime.now() +"clss: "+o.getClass().getSimpleName()+" "+o.toString());
                printWriter.flush();
                printWriter.close();
            }catch (Exception e)
            {

            }
        }
        System.out.println(o.toString());
    }
}