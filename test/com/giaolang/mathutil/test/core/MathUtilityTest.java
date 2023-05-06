/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.giaolang.mathutil.test.core;

import com.giaolang.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Quang Hung
 */
public class MathUtilityTest {
    //đây là class sẽ sử dụng các hàm của thư viện/framework JUnit 
    //để kiểm thử / kiểm tra code chính - hàm tínhGiaiThừa() bên 
    //class core.MathUtil
    //viết code để test code chính bên kia!
    
    
    //có nhiều quy tắc đặt tên hàm kiểm thử
    //nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại!
    
    //hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    //ta sẽ xài hàm kiểu well - đưa 5!, 6!, không chơi đưa -5!, 30!
    
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; // Test thử tình huống tử tế đầu vào, mày phải chạy đúng
        long exptected = 1; //hy vọng 0! = 1
        //long actual = ;   //gọi hàm cần test bên core/app chính/code chính
        long actual = MathUtil.getFactorial(n);
        
        //so sánh expected vs. actual dùng xanh xanh đỏ đỏ, framework 
        Assert.assertEquals(exptected, actual); //hàm giúp so sánh 2 giá trị nào đó có giống nhau không
                                                //nếu giống nhau -> ra màu xanh đèn đường - đường thông, code ngon
                                                                 //ít nhất cho case đang test
                                                //nếu không giống nhau -> ra màu đỏ đèn đường 
                                                                       //hàm ý expected và actual không giống nhau 
                                                                       
        //gộp thêm vài case thành công/đưa đầu vào ngon! hàm phải tính ngon
        Assert.assertEquals(1, MathUtil.getFactorial(1)); //tôi muốn 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); //tôi muốn 2! == 2
        Assert.assertEquals(6, MathUtil.getFactorial(3)); //tôi muốn 3! == 6
        Assert.assertEquals(24, MathUtil.getFactorial(4)); //tôi muốn 4! == 24
        Assert.assertEquals(120, MathUtil.getFactorial(5)); //tôi muốn 5! == 120
        Assert.assertEquals(720, MathUtil.getFactorial(6)); //tôi muốn 6! == 720
    }
    
    //Hàm getF() ta thiết kế có 2 tình huống xử lý
    //1. đưa data tử tế trong [0..20] -> tính đúng được n! - done
    //2. đưa data vào cà chớn , âm , >20; THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ
    //TAO KÌ VỌNG NGOẠI LỆ XUẤT HIỆN KHI N < 0 || N > 20
    //rất mong ngoại lệ xuất hiện với n cà chớn này
    
    //nếu hàm nhận vòa n <0 hoặc n > 20 và hàm ném ra ngoại lệ
    //HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ -> XANH PHẢI XUẤT HIỆN
    
    //nếu hàm nhận vào n < 0 hoặc n > 20 và hàm không ném ra ngoại lệ
    //sure, HÀM CHẠY SAI THIẾT KẾ, SAI KỲ VỌNG, MÀU ĐỎ
    
    //Test case:
    //input: -5
    //expected: IllegalArgumentException xuất hiện
    //tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu
    //là những thứ không thể đo lường so sánh theo kiểu value
    //mà chỉ có thể đo lường = cách chúng có xuất hiện hay không 
    //assertEquals() không dùng để so sánh 2 ngoại lệ
    //      equals() là bằng nhau hay không trên value!
    
    
    //MÀU ĐỎ ĐÓ EM, DO HÀM ĐÚNG LÀ CÓ NÉM NGOẠI LỆ THẬT SỰ
    //              NHƯNG KHÔNG PHẢI LÀ NGOẠI LỆ KỲ VỌNG - THỰC SỰ KỲ VỌNG SAI 
    //              KHÔNG PHẢI HÀM NÉM SAI
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy 
//                                   //sẽ ném về ngoại lệ NumberFormat. . .
//    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy 
                                   //sẽ ném về ngoại lệ NumberFormat. . .
    }
    
    //cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn.
    //xài Lambda
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21 
    //tui cần thấy màu xanh khi chơi với 21!
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrows_LambdaVesion() {
        
//        Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh, 
//                            tham số 2: đoạn code chạy văng ra ngoại lệ đó);

          Assert.assertThrows(IllegalArgumentException.class, 
                              () -> MathUtil.getFactorial(-5));
          
          
          
       // MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy 
                                   //sẽ ném về ngoại lệ NumberFormat. . .
    }

    
    
    //Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay không khi n cà chớn
    //có ném, tức là hàm chạy đúng thiết kế -> xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrows_TryCatch() {
        //chủ động kiểm soát ngoại lệ!!
        try {
           MathUtil.getFactorial(-5); 
        } catch (Exception e) {
            //bắt try-catch là Junit sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ 
            //nhưng không chắc ngoại lệ mình cần có xuất hiện hay không?
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xuất hiện
            Assert.assertEquals("Invalid argument. N must be between 0..20", 
                               e.getMessage());
        }     
    }
    
}
