/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rickyyudha.latihanmvc.controller;

import edu.rickyyudha.latihanmvc.model.PelangganModel;
import edu.rickyyudha.latihanmvc.view.Pelangganview;
import javax.swing.JOptionPane;

/**
 NIM : 10117910
 Nama : Ricky Yudha P K
 Kelas : PBO6K
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
    public void resetForm(Pelangganview view){
        String nama = view.getTxtnama().getText();
        String email = view.getTxtemail().getText();
        String noTlp = view.getTxttelpon().getText();
        
        if (nama.equals("")&& email.equals("")&& noTlp.equals("")) {
            
        }else {
            model.resetForm();
        }
    }
    public void simpanForm(Pelangganview view){
        
        String nama = view.getTxtnama().getText();
        String email = view.getTxtemail().getText();
        String noTlp = view.getTxttelpon().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        }else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        }else if (noTlp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nomor Telpon Masih Kosong");
        }else{
            model.simpanForm();
        }
    }
}
