package com.in.pizza.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in.pizza.vo.*;

@Controller
@SessionAttributes("sid")
public class MainController {
	
	@RequestMapping("login")
	public String Login(@RequestParam String userId, @RequestParam String userPw, UserVO uvo, Model model){
		if(userId.equals("admin")&&userPw.equals("1111")){
			model.addAttribute("sid", userId);
		}
		return "listProduct";
	}
	
	public String Logout(HttpSession session){
		session.removeAttribute("sid");
		
		return "/pizza/index";
	}
	
	public String joinUser(UserVO uvo){
		
		return null;
	}
	
	public String infoUser(UserVO uvo, Model model){
		
		return null;
	}
	
	public String updateUser(UserVO uvo){
		
		return null;
	}
	
	public String deleteUser(UserVO uvo){
		
		return null;
	}
	
	public String insertProduct(ProductVO pvo){
		
		return null;
	}
	
	public String updateProduct(ProductVO pvo){
		
		return null;
	}
	

	@RequestMapping("listProduct")
	public String infoProduct(@RequestParam String listType, @RequestParam String productNm, ProductVO pvo, Model model){
		model.addAttribute("productNm", productNm);
		switch (listType) {
		case "main":
			return "mainList";
		case "side":
			return "sideList";
		case "drink":
			return "drinkList";
		}
		model.addAttribute("listType", listType);
		return "listProduct";
	}
	
	public String deleteProduct(ProductVO pvo){
		
		return null;
	}
	
	public String insertCoupon(CouponVO cvo){
		
		return null;
	}
	
	public String deleteCoupon(CouponVO cvo){
		
		return null;
	}
	
	public String updateCoupon(CouponVO cvo){
		
		return null;
	}
	
	public String infoCoupon(CouponVO cvo, Model model){
		
		return null;
	}
	
	public String orderForm(HttpSession session, UserVO uvo, CouponVO cvo, OrderVO ovo, Model model){
		
		return null;
	}
	
	public String insertOrder(OrderVO ovo){
		
		return null;
	}
	
	public String infoOrder(OrderVO ovo, Model model){
		
		return null;
	}
	
	public String updateOrder(OrderVO ovo){
		
		return null;
	}
	
	public String insertQnA(QnAVO qvo){
		
		return null;
	}
	
	public String updateQnA(QnAVO qvo){
		
		return null;
	}
	
	public String deleteQnA(QnAVO qvo){
		
		return null;
	}
	
	public String infoQnA(QnAVO qvo, Model model){
		
		return null;
	}
	
	public String insertNotice(NoticeVO nvo){
		
		return null;
	}
	
	public String updateNotice(NoticeVO nvo){
		
		return null;
	}
	
	public String deleteNotice(NoticeVO nvo){
		
		return null;
	}
	
	public String infoNotice(NoticeVO nvo, Model model){
		
		return null;
	}
	
	public String insertCart(@RequestParam String product, HttpSession session){
		
		return null;
	}
	
	public String updateCart(HttpSession session){
		
		return null;
	}
	
	public String deleteCart(HttpSession session){
		
		return null;
	}
	
	public String infoCart(HttpSession session, Model model){
		
		return null;
	}
}
