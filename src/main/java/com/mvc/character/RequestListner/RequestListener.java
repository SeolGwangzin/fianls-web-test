package com.mvc.character.RequestListner;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {

    public RequestListener() {
        System.out.println("request listener 인스턴스 생성~~!!!!");
    }

    public void requestDestroyed(ServletRequestEvent sre)  {
        System.out.println("request 소멸!!!!!!");
    }

    public void attributeRemoved(ServletRequestAttributeEvent srae)  {
        System.out.println("request attribute 제거!!!!!");
    }

    public void requestInitialized(ServletRequestEvent sre)  {
        System.out.println("request init!!");
    }

    public void attributeAdded(ServletRequestAttributeEvent srae)  {
        System.out.println("request attribute 추가~!!!!");
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae)  {
        System.out.println("request attribute 교체!!");
        System.out.println(srae.getName() + ", " + srae.getValue());
    }

}