package in.ashokit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.dto.Courses;
import in.ashokit.dto.Student;
import in.ashokit.dto.Timing;
import in.ashokit.repo.CoursesRepo;
import in.ashokit.repo.StudentRepo;
import in.ashokit.repo.TimingRepo;

@Controller
public class StudentController {
	@Autowired
    private StudentRepo stRepo;
	@Autowired
	private CoursesRepo couRepo;
	@Autowired
	private TimingRepo timRepo;
	

	@GetMapping("/view")
	public String showView(Model model) {
		
		model.addAttribute("studDto", new Student());
		
	    model.addAttribute("course" , couRepo.findAll());
	    
	    model.addAttribute("timings", timRepo.findAll() );
	    
		return "index";

    }
	
	@PostMapping("/register")
	public String saveViewData(@ModelAttribute("studDto") Student studDto) {
		
		stRepo.save(studDto);
		
		return "index";
		
	}
}
