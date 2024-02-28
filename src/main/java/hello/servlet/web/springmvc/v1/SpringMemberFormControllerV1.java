package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //스프링이 자동으로 스프링빈으로 등록한다, 애노테이션 기반 컨트롤러로 인식한다.(class레벨에 위치)
public class SpringMemberFormControllerV1 {
    @RequestMapping("/springmvc/v1/members/new-form")//요청정보를 매핑한다. 해당 url이 호출되면 이 메서드가 호출된다.
    public ModelAndView process(){ //모델과 뷰 정보를 담아서 반환
        return new ModelAndView("new-form");
    }
}
