package com.sunha.book.chap11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultMappingController {
	Logger logger =  LogManager.getLogger();
	
	/**
	 * 다른 컨트롤러에서 매핑되지 않은 URL은 이 메서드를 실행
	 */
	@RequestMapping("/**")
	public void mapDefault() {
		logger.debug("Default mapping");
	}
}
