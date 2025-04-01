/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbdriver;

import blood_donatio_management_system.View_Donor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ASHISH
 */
public class DataFetcher {

    public ArrayList getUserData(Statement st, String username) {
        ArrayList a1 = new ArrayList();
        try {
            String qu = "select * from registration_info where user_name='" + username + "'";
            ResultSet rs = st.executeQuery(qu);
            while (rs.next()) {
                String name = rs.getString(1);
                String email = rs.getString(2);
                String mob = rs.getString(3);
                String address = rs.getString(4);
                String pass = rs.getString(6);
                a1.add(name);
                a1.add(email);
                a1.add(mob);
                a1.add(address);
                a1.add(pass);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("A1 is:" + a1);
        return a1;
    }

    public ArrayList getLastDate(Statement st, String adhar) {
        ArrayList a1 = new ArrayList();
        try {
            String qu = "select * from donor_info where Adhar_no='" + adhar + "'";
            ResultSet rs = st.executeQuery(qu);
            while (rs.next()) {
                String Date_Time = rs.getString(14);
                String str[] = Date_Time.split(", ");
                String date = str[0];
                a1.add(date);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("A1 is:" + a1);
        return a1;
    }

    public ArrayList<String> getDonorData(Statement st, String adhar) {
        ArrayList<String> a1 = new ArrayList<>();  // Create a new list instead of calling recursively

        try {
            String query = "SELECT * FROM donor_info WHERE Adhar_no='" + adhar + "'";
            ResultSet rs = st.executeQuery(query);

            if (!rs.next()) {  // Check if the result set is empty
                JOptionPane.showMessageDialog(null, "No donor data found for the provided Aadhar number.");
                return a1;  // Return empty list if no data found
            }

            // Add values to a1 (Using column index based on your table structure)
            a1.add(rs.getString(2));  // Gender
            a1.add(rs.getString(3));  // Height
            a1.add(rs.getString(4));  // Weight
            a1.add(rs.getString(5));  // Blood Group
            a1.add(rs.getString(6));  // Age
            a1.add(rs.getString(8));  // Name
            a1.add(rs.getString(9));  // Mobile
            a1.add(rs.getString(10)); // Email
            a1.add(rs.getString(11)); // Address
            a1.add(rs.getString(12)); // DOB
            a1.add(rs.getString(7));  // BMI
            a1.add(rs.getString(13)); // Token No
            a1.add(rs.getString(15)); // Token Status
            a1.add(rs.getString(14)); // Date Time
            a1.add(rs.getString(16)); // Blood Volume

        } catch (SQLException ex) {
            System.out.println("Error fetching donor data: " + ex.getMessage());
        }

        System.out.println("A1 is: " + a1);
        return a1;
    }

    public void getViewDonorDet() {
        String token_status = "TOKEN GIVEN";
        try {
            Statement st1 = new Dbconnection().getConnection();
            Statement st2 = new Dbconnection().getConnection();
            String qu = "select * from donor_info where Token_Status='" + token_status + "'";
            ResultSet rs1 = st1.executeQuery(qu);
            ResultSet rs2 = st2.executeQuery(qu);
            int row = 0;
            while (rs1.next()) {
                row++;
            }
            int i = 0;
            String data[][] = new String[row][3];
            while (rs2.next()) {
                String addhar = rs2.getString(1);
                data[i][0] = addhar;
                String name = rs2.getString(8);
                data[i][1] = name;
                String t_status = rs2.getString(15);
                data[i][2] = t_status;
                i++;
            }
            View_Donor.data1 = data;
        } catch (Exception e) {
            System.out.println("e =" + e);
        }
    }
}
