/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oraclejava.app;

import java.lang.reflect.Type;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

/**
 *
 * @author Erick
 */
public class Database {

      public static Database getConnection(){
      
      String url = "jdbc:sqlserver://ERICK-PC\\SQLEXPRESS:1433;"
      + "database=Oracle;"
      + "user=se;"
      + "pasword=1234;";

      try{
          java.sql.Connection con = DriverManager.getConnection(url);
          return (Database) con;
      }catch(SQLException e){
        System.out.println(e.toString());
        return null;
      }

      }//Get connection


      public String InsertREQ_HEADER(REQ_HEADER obj){
            try {
             Database con = null;
             con = getConnection();

            CallableStatement cs;
            cs = con.prepareCall("{CALL InsertREQ_HEADER(?,?,?,?,?,?)}");
            cs.setString(1,obj.getStatus_CD());
            cs.setString(2,obj.getDescription());
            cs.setString(3,obj.getRequestor_CD());
            cs.setString(4,obj.getRequired_By_Date());
            cs.setString(5,obj.getBuyer_CD());
            cs.setString(6,obj.getVendor_ID());
            cs.registerOutParameter(7, Types.NUMERIC);
            cs.execute();
            ResultSet rs2 = cs.getResultSet();

             if(rs2.next()){
                 System.out.println(true);
             }
             con.close();

         } catch (Exception e) {
          System.out.println(e.getMessage());
          return "Error";     
         }

      return "Succes";
      }

      public String InsertREQ_LINE(REQ_LINE obj){
            try {
             Database con = null;
             con = getConnection();

            CallableStatement cs;
            cs = con.prepareCall("{CALL InsertREQ_LINE(?,?,?,?,?,?)}");
            cs.setString(1,obj.getPR_Header());
            cs.setString(2,obj.getStatus_CD());
            cs.setString(3,obj.getDescription());
            cs.setLong(4,obj.getQuantity());
            cs.setLong(5,obj.getUnit_Price());
            cs.registerOutParameter(6,Types.NUMERIC);
            cs.execute();
            ResultSet rs2 = cs.getResultSet();
            con.close();

         } catch (Exception e) {
          System.out.println(e.getMessage());
          return "Error";         
         }

      return "Succes";
      }

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private CallableStatement prepareCall(String call_InsertREQ_LINE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
