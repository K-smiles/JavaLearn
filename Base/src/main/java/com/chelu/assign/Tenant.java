package com.chelu.assign;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

import static com.chelu.assign.Util.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tenant {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private char gender;
    private String phone;
    private double preferredRentingCost;
    private String preferredSuburb;
    private List<Integer> wishList;

    public static void Login()
    {
        String email;
        String password;
        Boolean flag = true;
        while(true)
        {
            System.out.println("Email address");
            email = scanner.nextLine();  // Read user input
            if(email.equals(bConstant))
            {
                return;
            }
            if(validateEmail(email))
            {
                System.out.println("Received");
                break;
            }
            else
            {
                System.out.println("invalid email");
            }
        }
        while(true)
        {
            System.out.println("Password");
            password= scanner.nextLine();  // Read user input
            if(password.equals(bConstant))
            {
                return;
            }
            if(validateTenant(email,password))
            {
                System.out.println("You have successfully logged in");
//                tenant Menu
                break;
            }
            else
            {
                System.out.println("Incorrect please try again");
            }
        }

    }

    public static Boolean validateEmail(String email){
        return pattern.matcher(email).matches();
    }

    private static Boolean validateTenant(String email,String password){
        for (Tenant tenant: tenantList)
        {
            if(tenant.equals(Tenant.builder().email(email).password(password).build()))
            {
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean equals(Object o) {
        Tenant tenant = (Tenant) o;
        return Objects.equals(email, tenant.email) && Objects.equals(password, tenant.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }
}
