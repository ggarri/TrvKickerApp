package com.trv.kicker.web;

import com.trv.kicker.model.Player;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/players")
@Controller
@RooWebScaffold(path = "players", formBackingObject = Player.class)
public class PlayerController {
}
