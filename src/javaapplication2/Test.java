/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;




/**
 *
 * @author quang
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author quang
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





/**
 *
 * @author quang
 */


public class Test extends JFrame {
    private JTable jtable = new JTable();
    private DefaultTableModel tableModel = new DefaultTableModel();
    
    public Test(){
        String []colsName = {"Name", "Age"};
        tableModel.setColumnIdentifiers(colsName);  // đặt tiêu đề cột cho tableModel
        ArrayList<Student> t = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        
        for(int i = 0;i<n;i++){
            
            Student a = new Student();
            System.out.println("Nhap name sinh vien ");
            String name = scanner.nextLine();
            System.out.println("Nhap age sinh vien ");
            int age = scanner.nextInt();
            scanner.nextLine();
            a.setName(name);
            a.setAge(age);
            t.add(a); 
        }
        
        
//        String rows[] = new String[2];
//        rows[0] = "Máy tính"; //   dữ liệu tại ô column[0]rows[0]
//        rows[1] = "Dell laptop"; //dữ liệu tại ô column[0]rows[1]
//        String rows1[] = new String[2];
//        rows1[0] = "2";
//        rows1[1] = "Đây là data dong 2";
        
        
        for(int i = 0;i<t.size();i++){
            String name = t.get(i).getName();
            int age = t.get(i).getAge();
            Vector row = new Vector();
            row.add(name);
            row.add(age);
    
    
            tableModel.addRow(row);
        }
        
//        tableModel.insertRow(0, rows1);
//        tableModel.removeRow(0);
//        tableModel.getValueAt(0, 0);
//        tableModel.setValueAt("My name", 0, 1);
//        
//        
//        
//        
//        System.out.print(tableModel.getValueAt(0, 1));
        
        
        jtable.setModel(tableModel);    // kết nối jtable với tableModel 
        initComponent();    // Khởi tạo các components trên JFrame
    }
    public void initComponent(){
        this.setSize(400, 200);
        // Đưa jtable vào trong thanh cuộn (khi dữ liệu quá nhiều dòng sẽ có thanh cuộn ngang và doc để xem dữ liệu)
        JScrollPane scroll = JTable.createScrollPaneForTable(jtable);   
        this.add(scroll); // Đưa thanh cuộn vào Frame (hiện thanh cuộn trên frame)
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Test();
    }
}
