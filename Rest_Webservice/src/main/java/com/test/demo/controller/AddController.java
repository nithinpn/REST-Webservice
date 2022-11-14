package com.test.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.test.demo.dao.AddDAO;
import com.test.demo.model.ItemDTO;

@Controller

public class AddController 
{
	@Autowired
	private AddDAO dao;
	
	@RequestMapping("/")
	public String add()
	{ 
		
		
		return "home.jsp";
	}
	
	@RequestMapping("/addItem")
	public String addItems(ItemDTO dto)
	{
		dao.save(dto);
		return "home.jsp";
	}
	
	
	@RequestMapping("/getItem")
	public ModelAndView displayItems(@RequestParam int id)
	{
		ItemDTO fromdb =dao.findById(id).orElse(null);
		return new ModelAndView("display.jsp","fro",fromdb);
	}
	
	@RequestMapping("/items")
	@ResponseBody
	public List<ItemDTO> getItems()
	{
		
		return dao.findByPrice();
	}
	

	@RequestMapping("/item/{aid}")
	@ResponseBody
	public Optional<ItemDTO> getItemById(@PathVariable("aid") int aid)
	{
		return dao.findById(aid);
	}
	
	
	
	
}
