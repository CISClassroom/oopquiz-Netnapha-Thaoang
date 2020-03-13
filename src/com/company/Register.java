package com.company;

import java.util.Scanner;

public class Register {

    public static void main(String[] args) {
        // write your code here
        Scanner st = new Scanner(System.in);
        System.out.println("รหัสนักศึกษา :");
        int idcard = st.nextInt();
        System.out.println("ชื่อสาขา :");
        String Major = st.nextLine();
        System.out.println("ชื่อมหาลัย :");
        String University = st.nextLine();

        System.out.println(idcard + Major + University);



        Scanner pr = new Scanner(System.in);
        System.out.println("ชื่อ - นามสกุล :");
        String name = pr.nextLine();
        System.out.println("ที่อยู่ :");
        int Address = pr.nextInt();
        System.out.println("เบอร์โทรศัพท์ :");
        int number = pr.nextInt();
        System.out.println("อีเมลล์ :");
        String Email = pr.nextLine();

        System.out.println(name + Address + number + Email);



        Scanner ps = new Scanner(System.in);
        System.out.println("หน่วยงานที่สังกัด :");
        String Department = ps.nextLine();
        System.out.println("สาขาและตำแหน่งงาน :");
        String Position = ps.nextLine();

        System.out.println(Department + Position);
    }

    public void Register() {
    }
}




