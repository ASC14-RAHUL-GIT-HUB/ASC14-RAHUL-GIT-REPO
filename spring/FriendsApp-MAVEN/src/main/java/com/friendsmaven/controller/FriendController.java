package com.friendsmaven.controller;

import com.friendsmaven.entity.Friend;
import com.friendsmaven.service.FriendService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/friends")
public class FriendController {
    private final FriendService friendService;
    public FriendController(FriendService friendService) { this.friendService = friendService; }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("friends", friendService.findAll());
        return "friends-list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("friend", new Friend());
        return "friend-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Friend friend) {
        friendService.save(friend);
        return "redirect:/friends";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        friendService.findById(id).ifPresent(f -> model.addAttribute("friend", f));
        return "friend-form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        friendService.deleteById(id);
        return "redirect:/friends";
    }
}
