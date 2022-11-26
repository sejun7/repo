package study.spring.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import study.spring.practice.Entity.Memo;
import study.spring.practice.repository.MemoRepository;

import java.util.List;

@Controller
@RequestMapping("memo")
public class MemoController {

    @Autowired
    MemoRepository memoRepository;

    @PostMapping("save")
    public String savememo(Memo memo){
        System.out.println(memo);
        memoRepository.save(memo);
        return "redirect:/";
    }

    @GetMapping("list")
    public String list(Model model){
        List list = memoRepository.findAll();
        model.addAttribute("list",list);
        return "list";
    }
}
