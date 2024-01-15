package com.bipul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController
{
    @Autowired
    FormRepo repo;

    @RequestMapping("/view")
    public String viewForm()
    {
        return "index";
    }
    @RequestMapping("/save")
    public String saveForm(@ModelAttribute FormData formData)
    {
        String course = formData.getCourseName();
        String name = formData.getStudentName();
        String email = formData.getStudentEmail();
        String mob = formData.getStudentMobile();

        FormData f1 = new FormData();
        f1.setCourseName(course);
        f1.setStudentEmail(email);
        f1.setStudentMobile(mob);
        f1.setStudentName(name);
        repo.save(f1);
        return "saved";
    }




}
