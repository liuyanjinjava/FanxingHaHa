package com.lyj;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class StudyFoundationTest {

    @Test
    public void testGenericAndExtends(){
        Object [] objs=new Object[10];
        Person [] persons=new Person[10];
        //Object是Person的父类，则Object的数组也是Person数组的父类；
        objs=persons;

        List<Object> objectList=new ArrayList<>();
        List<Person> personList=new ArrayList<>();
       //Object是Person的父类，但List<Object> 却不是List<Person>的父类；
        //用反证法：若可以,则意味着可以向objectList中放入任何的对象，而从personList中
        //获取到的却是Person类型的对象，这不可能；
//        objectList=personList;
    }
   public void testGenericClass(){
       Dao<Person> dao=new Dao<>();
       Person p=new Person();
       dao.save(p);
   }
   @Test
    public void testFan(){
        List<? extends Object> list=new ArrayList<>();
        list.add(null);

        //一定要理解其意义;
        List<? super Person> list1=new ArrayList<>();
        list1.add(new Person());
   }
}