package com.longbridge.ssmb.key.generation;

import nfp.ssm.core.SSMLib;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.MINUTES;

/**
 * Created By Oluwatobi Ogunwuyi
 * 21/01/20201
 *
 * **/

public class Main {

    /**
     * Before running this program,adhere to the below instructions
     * <p>
     * Go to your file system
     * <p>
     * Create a public.key and private.key in c:\keys\
     * <p>
     * Open the two files and type in a secret text
     * <p>
     * SAVE the files
     **/


    @Test
    public static void main(String[] args) {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter a String");
//        String a = null;
//        try {
//            a = br.readLine();
//            System.out.println("\nEnter the Character you want to search for : ");
//            String ch;
//            ch =  br.readLine();
//            int chr = a.indexOf(ch);
//            System.out.println("\nCharacter "+ch+ " is found at location :" +chr);
//            System.out.println("\n Enter the location and let's see what character is present at that location");
//            int b  = Integer.parseInt(br.readLine());
//            System.out.println(b);
//            System.out.println("\nLocation "+chr+ " in String " + a + " holds character : " + a.charAt(b));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



    //        char gh = '\u0041';
//
//
//        System.out.println("\\U+0031 : " + gh);
//        String originalString = "";
    String publickey = "012F3F6BDF401993203C61058481D635989DF863A9C78CFA5262D0851BD1FD6F";
    String privatekey = "ZT6M1P0VRQWZEI9UDF36R4T12U29DAXB";
    String clientkey = "ZVEQBSAWTTXZKNGWJLCE";
    String authkey = publickey + clientkey + privatekey;
    //
//        LocalDateTime d = LocalDateTime.now();
//        LocalDateTime c = LocalDateTime.now().plusMinutes(5);
//        System.out.println("date here1222 : " + d);
//        System.out.println("newwwwww  : " + c);
//
//        System.out.println("date here244444 : " + d.getMinute());
//
//       LocalDate sweet =  LocalDateTime.now().toLocalDate();
//      // LocalDateTime.now() now = LocalDateTime.parse(sweet);
//
//        int compareValue = sweet.compareTo(LocalDate.parse("2021-05-21"));
//
//      // boolean isbefore = sweet.(LocalDate.parse("2022-04-28"));
//
//        System.out.println("date here : " + sweet);
//        System.out.println("date here2 : " + compareValue);
//
    MessageDigest digest = null;
        try

    {
        digest = MessageDigest.getInstance("SHA-256");
    } catch(
    NoSuchAlgorithmException e)

    {
        e.printStackTrace();
    }

    byte[] hash = digest.digest(
            authkey.getBytes(StandardCharsets.UTF_8));

    StringBuilder hexString = new StringBuilder(2 * hash.length);
        for(
    int i = 0;
    i<hash.length;i++)

    {
        String hex = Integer.toHexString(0xff & hash[i]);
        if (hex.length() == 1) {
            hexString.append('0');
        }
        hexString.append(hex);

    }

        System.out.println("hash code : "+hexString.toString());

}
//
//
//        LocalDateTime dateTime = LocalDateTime.now().plusMinutes(1);
//        LocalDateTime dateTime2 = LocalDateTime.now();
//        System.out.println("NEW DATE : " + dateTime);
//        System.out.println("NEW DATE3 : " + dateTime.isAfter(dateTime2));
//        System.out.println("NEW DATE4 : " + dateTime.isBefore(dateTime2));
//        System.out.println("NEW DATE2 : " + LocalDateTime.now());
//        System.out.println("NEW DATE28888 : " + dateTime.compareTo(dateTime2));
//
//        LocalDateTime generatedTime = LocalDateTime.parse("2021-05-20T11:19:18.313");
//        LocalDateTime currentTime = LocalDateTime.parse("2021-05-20T11:21:18.312");
//
//
//        System.out.println("dateTimeTwo  : " + generatedTime.isAfter(currentTime));
//
//
//
//        Date now2 = new Date();
//
//
//
//
//        long MAX_DURATION = TimeUnit.MILLISECONDS.convert(5, MINUTES);
//
//        LocalDateTime now =  LocalDateTime.parse("2021-05-20T12:19:18.313");
//        Timestamp timestamp = Timestamp.valueOf(now);
//
//        System.out.println("hererer 2: " + now2);
//        System.out.println("hererer 3: " + now2.getTime());
//        //System.out.println("hererer 4: " + timestamp.getTime());
//
//
//
//
//            Instant instant = Instant.now();
//        System.out.println("instance 2: " + instant);
//            Instant old = Instant.ofEpochMilli(timestamp.getTime());
//        System.out.println("instance 3: " + old);
//
//            Instant twentyMinutesAgo = Instant.now().minus(Duration.ofMinutes(5));
//
//
//
//                System.out.println("hererer: " + instant.isBefore(old));
//
//
//
//
//
//
//
//
//
//        if (LocalDateTime.now() == dateTime){
//            System.out.println("get new key");
//        }
//
//        System.out.println("Hello");
//
//        BigDecimal first = new BigDecimal(-1f);
//        BigDecimal second = new BigDecimal(81);
//        Double third = 8100.00;
//        String fourth = String.valueOf(third);
//
//        System.out.println("first " + first.floatValue());
//        System.out.println("second " + second.floatValue());
//        System.out.println("third " + third);
//        System.out.println("fourth " + fourth+"0");
//
//        normalizeAmountIn("" + 1.00);
//
//
//
//        GenerateKeys generateKeys = new GenerateKeys();
//        generateKeys.start();

//        Scanner reader = new Scanner(System.in);
//        int carnumber;
//        System.out.println("please enter how many cars you want to work on:");
//        carnumber = reader.nextInt();
//
//        Cars newcar[] = new Cars[carnumber];
//        int counter = 1;
//        for (int i = 0; i < carnumber; i++) {
//            Cars car = new Cars();
//            System.out.println("please Enter the brand for car  " + counter + " :");
//            car.setBrand(reader.next());
//
//            System.out.println("please Enter the model for car " + counter + " :");
//            car.setModel(reader.next());
//            System.out.println("please Enter the color for car " + counter + " :");
//            car.setColor(reader.next());
//            System.out.println("please Enter the price for car " + counter + " :");
//            car.setPrice(reader.nextFloat());
//            newcar[i] = car;
//            counter++;
//           // System.out.println("result" + newcar[i]);
//
//        }
//
//        //System.out.println("||Carnumber ||Brand ||Model ||Color ||Price");
//       // System.out.format("%32s%10d%16s", "tobi", "ola", "jk");
//        System.out.println("-----------------------------------------------------------------------------");
//        System.out.printf("%15s %15s %15s %15s", "CAR Brand", "CAR Model", "CAR Color", "CAR Price");
//        System.out.println();
//        System.out.println("-----------------------------------------------------------------------------");
//        for(Cars car: newcar){
//            System.out.format("%15s %15s %15s %15f",
//                    car.getBrand(), car.getModel(), car.getColor(), car.getPrice());
//            System.out.println();
//        }
//        System.out.println("-----------------------------------------------------------------------------");
//    }
//        for (int i=0;i<newcar.length;i++) {
//            System.out.println( i + "||Brand ||Model ||Color ||Price");
//            newcar[i].toString();
//           // car.Print();
//
//
//        }



    public static String normalizeAmountIn(String amount){
        double total = Double.valueOf(amount);
        String val = String.format("%017.2f", total);
//        amount = val.replace(".", "");
        amount = val;
        System.out.println(" the amount " + amount);
        return amount;
    }





        //Method to Generate Public and Private keys
//        public void generatePublicAndPrivateKeys()
//        {
//            SSMLib enc = new SSMLib("c:/NMRC_public.key", "c:/NMRC_private.key");
//            enc.generateKeyPair("Any_user_name", "Any_password");
//
//
//        }
//
//        //How to encrypt a request
//    public String encryptRequest(final String dataToEncrypt)
//    {
//        SSMLib enc = new SSMLib("c:/NMRC_public.key", "c:/NMRC_private.key");
//        return enc.encryptMessage(dataToEncrypt);
//    }
//
//    //How to decrypt a request
//    public String decryptRequest(final String dataToDecrypt)
//    {
//        SSMLib enc = new SSMLib("c:/nibss_public.key", "c:/NMRC_private.key");
//        return enc.decryptFile(dataToDecrypt, "Password_Used_To_Generate_Key_Pair");
//    }



}
