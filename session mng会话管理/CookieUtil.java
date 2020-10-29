package org.chwin.firefighting.apiserver.data;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class CookieUtil {

    private static Map<String,Cookie> ReadCookieMap(HttpServletRequest request){ //私有静态方法

        Map<String, javax.servlet.http.Cookie> cookieMap =new HashMap<String,Cookie>();

 Cookie[] cookies = request.getCookies();

 if(null!=cookies){

          for(Cookie cookie : cookies){
                 cookieMap.put(cookie.getName(),cookie);

         }

  }

  return cookieMap;

 }



    public static java.lang.String getValue(HttpServletRequest req, java.lang.String cookieName) {
        //调用ReadCookies 方法取值

        Map<String,Cookie> cookieMap =ReadCookieMap(req);

         if(cookieMap.containsKey(cookieName)){ //cookieName 为cookie名称

          Cookie cookie = (Cookie)cookieMap.get(cookieName);

          return cookie.getValue();

          }
         throw new RuntimeException("ex:cantfind_cookie,cookiename:"+cookieName);

    }
}
