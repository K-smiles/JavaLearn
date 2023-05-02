package com.chelu.assign;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Util {
    public static Scanner scanner = new Scanner(System.in);  // Create a Scanner object

    public static final String bConstant = "q";

    public static List<Tenant> tenantList = new ArrayList<>();

    public static String regEmail = ".+@student.monash.edu";
    public static Pattern pattern = Pattern.compile(regEmail);
    static {
        String testEmail = "tenant@student.monash.edu";
        String password = " Monash1234";

        Tenant tenant = Tenant.builder().email(testEmail).password(password).build();
        tenantList.add(tenant);
        tenantList.add(Tenant.builder().email("email").password("password").build());

//        get tenant list from txt
        String pathname = "failename";
        File filename = new File(pathname);
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(
                    new FileInputStream(filename));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(reader);
        String line = "";
        try {
            line = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (line != null) {
            try {
                line = br.readLine();
                tenantList.add(parseTeant(line));
//                parse data
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static Tenant parseTeant(String line)
    {
        return new Tenant();
    }

    public static Tenant test()
    {
        return new Tenant();
    }

    public static void main(String[] args) {

    }
}
