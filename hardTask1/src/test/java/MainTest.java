import com.company.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class MainTest {



    @Test
    public void hasAccess()throws NoEntityException {

         List<User> userRepository=new ArrayList<>();
         List<Authority> authorityRepository=new ArrayList<>();
         List<Role> roleRepository=new ArrayList<>();

        Authority accounting=new Authority(1,"Accounting");
        Authority purchase=new Authority(2,"Purchase");
        Authority cleaning=new Authority(3,"Cleaning");
        Authority securing=new Authority(4,"Securing");
        Authority closingOffice=new Authority(5,"ClosingOffice");

        Role booker = new Role(1, "Booker", Set.of(accounting, purchase));
        Role cleaner=new Role(2,"Cleaner",Set.of(cleaning));
        Role security=new Role(3,"Security",Set.of(securing,closingOffice));

        User vasya = new User(1, "Vasya", Collections.singleton(booker));
        User kolya=new User(2,"Kolya",Set.of(security,cleaner));

        authorityRepository.add(accounting);
        authorityRepository.add(purchase);
        authorityRepository.add(cleaning);
        authorityRepository.add(securing);
        authorityRepository.add(closingOffice);

        roleRepository.add(booker);
        roleRepository.add(cleaner);
        roleRepository.add(security);

        userRepository.add(vasya);
        userRepository.add(kolya);

        Main main=new Main(userRepository,authorityRepository,roleRepository);
        boolean result=main.hasAccess(2,1);
        Assert.assertEquals(result,false);
    }

    @Test
    public  void availableAuthorities() throws NoEntityException {
        List<User> userRepository=new ArrayList<>();
        List<Authority> authorityRepository=new ArrayList<>();
        List<Role> roleRepository=new ArrayList<>();

        Authority accounting=new Authority(1,"Accounting");
        Authority purchase=new Authority(2,"Purchase");
        Authority cleaning=new Authority(3,"Cleaning");
        Authority securing=new Authority(4,"Securing");
        Authority closingOffice=new Authority(5,"ClosingOffice");

        Role booker = new Role(1, "Booker", Set.of(accounting, purchase));
        Role cleaner=new Role(2,"Cleaner",Set.of(cleaning));
        Role security=new Role(3,"Security",Set.of(securing,closingOffice));

        User vasya = new User(1, "Vasya", Collections.singleton(booker));
        User kolya=new User(2,"Kolya",Set.of(security,cleaner));

        authorityRepository.add(accounting);
        authorityRepository.add(purchase);
        authorityRepository.add(cleaning);
        authorityRepository.add(securing);
        authorityRepository.add(closingOffice);

        roleRepository.add(booker);
        roleRepository.add(cleaner);
        roleRepository.add(security);

        userRepository.add(vasya);
        userRepository.add(kolya);

        Main main=new Main(userRepository,authorityRepository,roleRepository);
        Set<Authority> result=main.availableAuthorities(2);
        System.out.println(result);
        Assert.assertEquals(result.size(),3);

    }
}
