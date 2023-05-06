/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtil;
    // com.tên thương hiệu.tên dự án.lõi.class
/**
 *
 * @author Quang Hung
 */
public class Main {
    public static void main(String[] args) {
        //thực nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay không!
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tế.
        //ví dụ: -5 coi tính được không!
        //       20 cói tính ra mấy!
        //       21 coi tính ra mấy!
        //gọi là TEST CASE: một tình huống hàm/app/màn hình/tính năng được đưa vào sử dụng
        //giả lập hành vi xài của ai đó!
        
        //TEST CASE: là 1 tình huống sử dụng, xài app(hàm) hay xài hàm mà nó bao gồm:  
        //INPUT: DATA đầu vào cụ thể nào đó
        //OUTPUT: đầu ra ứng với xử lý của hàm/chức năng của app, dĩ nhiên dùng đầu vào để xử lý
        //KỲ VỌNG: mong hàm sẽ trả về value nào đó ứng với INPUT  ở trên
        //so sánh để xem kết quả có như kỳ vọng hay không!
        
        long expected =120;//tao kỳ vọng hàm ói về 120 nếu tính 5!
        int n = 5;         //input 
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
    }
}
