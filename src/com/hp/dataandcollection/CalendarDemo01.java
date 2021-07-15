package com.hp.dataandcollection;

import java.util.Calendar;

/*日历类  可以做日期的计算
// 使用场景 项目中：预约功能  。日期计算功能
//常用APP  美柚  疫苗预算  入职日期计算 旅游模块
//创建对象  ----> new  出来的
   对象如果不能被(无参)new  ：1）无参构造私有化了 可能是单例模式
                             2）该类可能是个接口 /抽象类 必须new他的实现类


*/
public class CalendarDemo01 {
    public static void main(String[] args) {
        //创建对象 不仅仅只有new，还有 类的实例方法
        //calendar 比date 牛 calendar功能上包含了date 的大部分功能 是date的升级版
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);
 //日历可以进行计算  比如 增加 add
        //增加一个年份  比如增加10年  场景  卖保险 ， 结婚纪念日
        calendar.add(Calendar.YEAR,10);
        System.out.println("calendar.getTime() = " + calendar.getTime());
        //加月
       //  calendar.add(Calendar.MONTH,1);

        //加天
       // calendar.add(Calendar.DAY_OF_YEAR,1);
        //减去1天
       // calendar.add(Calendar.DAY_OF_YEAR,-1);
        //设置当周的周五日期
       // calendar.set(Calendar.DAY_OF_YEAR,calendar.FRIDAY);
        //还能计算每个月分的最大值  求月底的时间
       int days =  calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("days= " + days);//31 天
        //  -------  -- 日期的其他获取方法
           //如 ：查询今年多少天 。
         int i = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("i = " + i);
  //  如  查询 今天是周几   因为阳历是国外的  从周日开始
          int i1 = calendar.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("今天是周 " + i1);
   //今天是 周3
   //今天是 周三
           String[] weeks ={"周日","周一","周二","周三","周四","周五","周六"};
  int i2 = calendar.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("今天是："+weeks[i2]);
                        //获取月份 注意 月份从0 开始
            int i3 = calendar.get(Calendar.MONTH)+1;
        System.out.println("i3 = " + i3);
        //   日历  set....
          //设置  2008年
            calendar.set(Calendar.YEAR,2008);
        System.out.println("calendar = " + calendar);
//设置月份
        calendar.set(Calendar.MONTH,Calendar.APRIL);//月份从零开始
        System.out.println("calendar = " + calendar.getTime());
        // 设置  week.....





    }
}
