package com.SunYang.CompanyHr;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2016/7/8.
 */
public class PersonTest extends TestCase {
    public void testCreat() {
          Person [] p = new Person[2];

         p[0] = new Employee ("Sun Yang",     32000, 1989, 10, 20);
         p[1] = new Student("Judy","Music");

        for (Person people : p) {
            System.out.println(people.getName() + people.getDescription());
        }
    }
}