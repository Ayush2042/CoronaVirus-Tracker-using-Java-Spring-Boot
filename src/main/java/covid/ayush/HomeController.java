package covid.ayush;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
	
	@Autowired
	CoronavirusService coronavirusService;
	
	@GetMapping("/")
     public String home(Model model)
     {
		List<LocationStats> allStats=coronavirusService.getAllStats();
		int totalReportedCases=allStats.stream().mapToInt(State -> State.getLatestTotalCases()).sum();
		int totalNewCases=allStats.stream().mapToInt(State -> State.getDiffFromPrevDay()).sum();
		 model.addAttribute("locationStats",allStats);
		 model.addAttribute("totalReportedCases",totalReportedCases);
		 model.addAttribute("totalNewCases",totalNewCases);
    	 return "home";
     }
}

