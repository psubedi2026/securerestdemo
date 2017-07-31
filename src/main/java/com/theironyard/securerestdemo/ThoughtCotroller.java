package com.theironyard.securerestdemo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ThoughtCotroller {

	@GetMapping("/thought")
	public HashMap<String, String> getThoughts() {
		@SuppressWarnings("unchecked")
		HashMap<String, String> thoughts = new HashMap();
		
		thoughts.put("health1", "Go to gym");
		thoughts.put("health2", "Meditate on scenic views");
		thoughts.put("wealth1", "Find a job that pays more than bills.");
		thoughts.put("wealth2", "Stop being robbed by banks.");
		thoughts.put("wisdom1", "Envision success");
		thoughts.put("wisdom2", "Take action");
		thoughts.put("wisdom3", "Avoid distractions");
		
		return thoughts;
	}
	
}
