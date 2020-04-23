import com.company.Main;
import com.company.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class MainTest {

    @Test
    public  void freeIp(){
        Main main=new Main();
        List<Integer> ip=new ArrayList<>();
        ip.add(5);
        ip.add(12);
        ip.add(10);
        List<Integer> result=main.freeIp(ip,1,15);
        System.out.println(result);
        Assert.assertEquals(12,result.size());
        Assert.assertEquals(result.get(5),(Integer)7);
    }

    @Test
    public  void mostOccurringWord() {
        String testLine="Hello, my name is Antonio. My favourite drink is mohito." +
                " What is your favourite drink and favourite dish?";

        Main main=new Main();
        String result=main.mostOccurringWord(testLine);
        Assert.assertEquals("is",result);

    }

    @Test
    public  void sumNumbers() {
        String testLine="Hello, its my favourite number -1245,what is yours? Maybe 541?";

        Main main=new Main();
        int result=main.sumNumbers(testLine);
        Assert.assertEquals(result,-704);
    }

    @Test
    public void getDatesFromLine(){
        String testLine="Start date 11/30/2013 , end date Friday, Sept. 7, 2013";

        Main main=new Main();
        List<Date> result=main.getDatesFromLine(testLine);
        System.out.println(result);
        Assert.assertEquals(2,result.size());
    }

    @Test
    public void countOfLeafs() {
        Node root=new Node();
        Node left1=new Node();
        Node right1=new Node();
        Node lleft=new Node();
        Node lright=new Node();
        Node rright=new Node();
        Node rleft=new Node();

        left1.setLeft(lleft);
        left1.setRight(lright);
        right1.setRight(rright);
        right1.setLeft(rleft);
        root.setRight(right1);
        root.setLeft(left1);

        Main main=new Main();
        int result=main.countOfLeafs(root);
        Assert.assertEquals(4,result);
    }
    @Test
    public void getDatesFromLine2(){
        String line="Start date 30/11/2013 , end date Friday, Sept. 7, 2013";
        String dateFormat="dd/MM/yyyy";

        Main main=new Main();
        Set<Date> result=main.getDatesFromLine2(line,dateFormat);
        Date date=new GregorianCalendar(2013,10,30).getTime();
        System.out.println(result);
        System.out.println(date);
        Assert.assertEquals(true, result.contains(date));
    }
}
