/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.controller;

import com.view.sabut;
import java.sql.*;

public interface controller_mvc {
     public void Simpan(sabut but) throws SQLException;
     public void Baru(sabut but) throws SQLException;
     public void Ubah(sabut but) throws SQLException;
     
}
