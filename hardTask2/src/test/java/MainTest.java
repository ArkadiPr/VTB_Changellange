import com.company.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.swing.plaf.multi.MultiSeparatorUI;
import java.util.*;

public class MainTest {


    @Test
    public void sumOfBills() throws NoEntityException {
        List<User> userRepository =new ArrayList<>();
        List<Bill> billRepository =new ArrayList<>();
        List<Installation> installationRepository=new ArrayList<>();

        Bill firstBill=new Bill(1,"123478",5000);
        Bill secondBill=new Bill(2,"456178",3255);
        Bill thirdBill=new Bill(3,"458712",14700);
        Bill fourthBill=new Bill(4,"258741",12780);
        Bill fifthBill=new Bill(5,"369852",1400);

        User Antonio=new User(1, Set.of(firstBill,secondBill));
        User Arnold=new User(2,Set.of(thirdBill));
        User Karolina=new User(3,Set.of(fourthBill,fifthBill));

        Installation fromAntonioToArnold=new Installation(1,new GregorianCalendar(2012,6,22).getTime(),firstBill,thirdBill,500);
        Installation fromKarolinaToArnold=new Installation(2,new GregorianCalendar(2012,6,23).getTime(),fifthBill,thirdBill,2000);
        Installation fromAntonioToKarolina=new Installation(3,new GregorianCalendar(2012,7,12).getTime(),secondBill,fourthBill,2500);
        Installation fromArnoldToKarolina=new Installation(4,new GregorianCalendar(2012,7,12).getTime(),thirdBill,fifthBill,5600);

        userRepository.add(Antonio);
        userRepository.add(Karolina);
        userRepository.add(Arnold);

        billRepository.add(firstBill);
        billRepository.add(secondBill);
        billRepository.add(thirdBill);
        billRepository.add(fourthBill);
        billRepository.add(fifthBill);

        installationRepository.add(fromAntonioToArnold);
        installationRepository.add(fromKarolinaToArnold);
        installationRepository.add(fromAntonioToKarolina);
        installationRepository.add(fromArnoldToKarolina);

        Date date = new GregorianCalendar(2012, 6, 23).getTime();

        Main main = new Main(userRepository, billRepository, installationRepository);
        int result = main.sumOfBills(2, date);
        Assert.assertEquals(2000, result);
    }

    @Test
    public void getInformationOfBill() throws NoEntityException {
        List<User> userRepository =new ArrayList<>();
        List<Bill> billRepository =new ArrayList<>();
        List<Installation> installationRepository=new ArrayList<>();

        Bill firstBill=new Bill(1,"123478",5000);
        Bill secondBill=new Bill(2,"456178",3255);
        Bill thirdBill=new Bill(3,"458712",14700);
        Bill fourthBill=new Bill(4,"258741",12780);
        Bill fifthBill=new Bill(5,"369852",1400);

        User Antonio=new User(1, Set.of(firstBill,secondBill));
        User Arnold=new User(2,Set.of(thirdBill));
        User Karolina=new User(3,Set.of(fourthBill,fifthBill));

        Installation fromAntonioToArnold=new Installation(1,new GregorianCalendar(2012,6,22).getTime(),firstBill,thirdBill,500);
        Installation fromKarolinaToArnold=new Installation(2,new GregorianCalendar(2012,6,23).getTime(),fifthBill,thirdBill,2000);
        Installation fromAntonioToKarolina=new Installation(3,new GregorianCalendar(2012,7,12).getTime(),secondBill,fourthBill,2500);
        Installation fromArnoldToKarolina=new Installation(4,new GregorianCalendar(2012,7,12).getTime(),thirdBill,fifthBill,5600);

        userRepository.add(Antonio);
        userRepository.add(Karolina);
        userRepository.add(Arnold);

        billRepository.add(firstBill);
        billRepository.add(secondBill);
        billRepository.add(thirdBill);
        billRepository.add(fourthBill);
        billRepository.add(fifthBill);

        installationRepository.add(fromAntonioToArnold);
        installationRepository.add(fromKarolinaToArnold);
        installationRepository.add(fromAntonioToKarolina);
        installationRepository.add(fromArnoldToKarolina);


        Main main=new Main(userRepository,billRepository,installationRepository);
        List<Information> result=main.getInformationOfBill(3);
        System.out.println(result);
        Assert.assertEquals(3,result.size());
    }


}
