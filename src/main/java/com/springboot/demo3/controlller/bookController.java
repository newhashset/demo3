package com.springboot.demo3.controlller;


import com.springboot.demo3.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


@Controller
@RequestMapping("/book")  //请求跳转页面路径
public class bookController {



    @RequestMapping("/query") //请求跳转页面路径

    //model 是数据
    public String queryBookPage(int bookId, Model model){



        //创建一个数组
        ArrayList<Book> books = new ArrayList<>();


        //在数组中添加对象
        books.add(new Book(1,"Java","小明"));
        books.add(new Book(2,"mysql","小明2"));

        Book book = new Book(bookId,"java","小明");


        //在页面中设置属性，和相关值  也就是设置key和value键值对
       model.addAttribute("str","hello");

       model.addAttribute("stack",100);

       model.addAttribute("book",book);

       model.addAttribute("price",3.22);


        model.addAttribute("books",books);

         //只能跳转到test.html（template模板）页面，不能跳转到static文件夹下
        return "test";
    }
}
