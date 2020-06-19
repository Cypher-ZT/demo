import com.alibaba.druid.filter.config.ConfigTools;
import org.junit.Test;

/**
 * @author 闫泽宁
 * @date 2020/6/17 11:35
 */

public class InitDecryptCode {

    /**
     * 生成配置文件加密密码
     * @throws Exception
     */
    @Test
    public void test() throws Exception{
        //密码
        String password = "123456";
        System.out.println("加密前的密码:"+password);

        //生成秘钥对
        String [] keyPair = ConfigTools.genKeyPair(512);
        //私钥
        String privateKey = keyPair[0];
        //公钥
        String publicKey = keyPair[1];

        //用私钥加密后的密文
        password = ConfigTools.encrypt(privateKey, password);

        System.out.println("privateKey:"+privateKey);
        System.out.println("publicKey:"+publicKey);
        System.out.println("加密后的密码:"+password);
        String decryptPassword=ConfigTools.decrypt(publicKey, password);
        System.out.println("解密后的密码："+decryptPassword);
    }
}
