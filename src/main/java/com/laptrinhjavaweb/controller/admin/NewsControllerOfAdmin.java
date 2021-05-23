
package com.laptrinhjavaweb.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.dao.INewsDao;
import com.laptrinhjavaweb.model.News;
@Controller(value  = "NewsControllerOfAdmin")
public class NewsControllerOfAdmin {
//	@Autowired
//	private INewsDao newDao;
   @RequestMapping(value = "admin/news/list", method = RequestMethod.GET)
   public ModelAndView showList(@ModelAttribute("model") News model) {
      ModelAndView mav = new ModelAndView("admin/news/list");
//      model.setList(newDao.findAllNews());
//      mav.addObject("model",model);
      
      return mav;
   }
   @RequestMapping(value = "admin/news/edit", method = RequestMethod.GET)
   public ModelAndView EditNews() {
      ModelAndView mav = new ModelAndView("admin/news/edit");
      return mav;
   }
  
}