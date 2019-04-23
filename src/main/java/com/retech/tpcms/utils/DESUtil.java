package com.retech.tpcms.utils;

import com.alibaba.fastjson.JSONObject;
import com.retech.tpcms.aspect.LogAspect;
import com.retech.tpcms.entity.Log;
import org.apache.commons.lang3.time.DateFormatUtils;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Date;

/**
 * @author qinc
 * @date 2019/4/22
 */
public class DESUtil {

    private static String password = "9588888888880288";
    //测试
    public static void main(String args[]) {
        Log log = new Log();
        log.setType("web");
        log.setOptType(LogAspect.LOG_TYPE_OTHER);
        log.setModuleName("用户");
        log.setContent("用户退出登录");
        log.setCreateTime(DateFormatUtils.format(new Date(), "yyyy-MM-dd hh:mm:ss"));
        String str = JSONObject.toJSONString(log);
        //待加密内容
        String result = DESUtil.encryptString(str);
        System.out.println("加密后："+result);
        //直接将如上内容解密
        try {
            String decryResult = DESUtil.decryptString(result);
            System.out.println("解密后："+new String(decryResult));
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    /**
     * @Description: 加密数据
     */
    public static String encryptString(String data) {  //对string进行BASE64Encoder转换
        byte[] bt = encrypt(data.getBytes(), password);
        BASE64Encoder base64en = new BASE64Encoder();
        return new String(base64en.encode(bt));
    }

    /**
     * @Description: 解密数据
     */
    public static String decryptString(String data) {  //对string进行BASE64Encoder转换
        BASE64Decoder base64en = new BASE64Decoder();
        byte[] bt = new byte[0];
        try {
            bt = decrypt(base64en.decodeBuffer(data), password);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  new String(bt);
    }

    /**
     * 加密
     */
    private static byte[] encrypt(byte[] datasource, String key) {
        try{
            SecureRandom random = new SecureRandom();

            DESKeySpec desKey = new DESKeySpec(key.getBytes());
            //创建一个密匙工厂，然后用它把DESKeySpec转换成
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = keyFactory.generateSecret(desKey);
            //Cipher对象实际完成加密操作
            Cipher cipher = Cipher.getInstance("DES");
            //用密匙初始化Cipher对象
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, random);
            //现在，获取数据并加密
            //正式执行加密操作
            return cipher.doFinal(datasource);
        }catch(Throwable e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解密
     */
    private static byte[] decrypt(byte[] src, String key) {
        // DES算法要求有一个可信任的随机数源
        SecureRandom random = new SecureRandom();
        try {
            // 创建一个DESKeySpec对象
            DESKeySpec desKey = new DESKeySpec(key.getBytes());
            // 创建一个密匙工厂
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            // 将DESKeySpec对象转换成SecretKey对象
            SecretKey secretKey = keyFactory.generateSecret(desKey);
            // Cipher对象实际完成解密操作
            Cipher cipher = Cipher.getInstance("DES");
            // 用密匙初始化Cipher对象
            cipher.init(Cipher.DECRYPT_MODE, secretKey, random);
            // 真正开始解密操作
            return cipher.doFinal(src);
        } catch (Exception e) {
            e.printStackTrace();
        }
       return null;
    }
}
