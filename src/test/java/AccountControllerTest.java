import org.junit.Test;
import org.junit.Assert;

import securitydemo.controller.AccountController;

public class AccountControllerTest {

    @Test
    public void testTransfer(){
        AccountController ac = new AccountController();
        String result = "transfersuccess";
        Assert.assertEquals(result, ac.transfer());
    }

}
