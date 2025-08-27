
package com.mycompany.studentself;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		// 1) 스프링 컨테이너를 띄움 (resources에 있는 XML을 읽음)
        String configLocationstudent = "classpath:applicationCTXstudent.xml";
        AbstractApplicationContext ctxstudent =
                new GenericXmlApplicationContext(configLocationstudent);

        // 2) 컨테이너에서 빈(객체) 꺼내오기: getBean(id, 타입)
        StudentInfo info1 = ctxstudent.getBean("studentInfoByConstructor", StudentInfo.class);
        StudentInfo info2 = ctxstudent.getBean("studentInfoBySetter", StudentInfo.class);
        StudentInfo info3 = ctxstudent.getBean("studentInfoInline", StudentInfo.class);

        // 3) 사용
        info1.printInfo();
        System.out.println();
        info2.printInfo();
        System.out.println();
        info3.printInfo();

        // 4) 컨테이너 종료 (리소스 정리)
        ctxstudent.close();
	}

}
