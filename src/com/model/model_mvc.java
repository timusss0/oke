/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

import com.controller.controller_mvc;
import com.koneksi.koneksi;
import com.view.sabut;
import java.sql.*;
import javax.swing.JOptionPane;



public class model_mvc implements controller_mvc{
    String jk;

    @Override
    public void Simpan(sabut but) throws SQLException {
        if (but.rblaki.isSelected()) {
            jk = "Laki laki";
            
        } else {
            jk = "perempuan";
        }
          try {
            Connection con = koneksi.getcon();
            String sql = "INSERT INTO siswa Values(?,?,?,?)"; 
            PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(1, but.txtNIS.getText());
            prepare.setString(2, but.txtNama.getText());
            prepare.setString(3, jk);
            prepare.setString(4, (String) but.cbjurusan.getSelectedItem());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATA UDIN MASUK");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void Baru(sabut but) throws SQLException {
       but.txtNIS.setText("");
       but.txtNama.setText("");
       but.rblaki.setSelected(true);
       but.cbjurusan.setSelectedIndex(0);
       
    }

    @Override
    public void Ubah(sabut but) throws SQLException {
     if (sabut.rblaki.isSelected()){
         jk = "Laki-laki";
     } else{
         jk = "perempuan";
     }
     try {
         Connection con = koneksi.getcon();
         String sql = "UPDATE  sebut SET nama=?, jenis_kelamin=?, "  + "jurusan=? WHERE NIS=?";
           PreparedStatement prepare = con.prepareStatement(sql);
            prepare.setString(4, but.txtNIS.getText());
            prepare.setString(1, but.txtNama.getText());
            prepare.setString(2, jk);
            prepare.setString(3, (String) but.cbjurusan.getSelectedItem());
            prepare.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATA UDIN MASUK");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     }
         
    
    


