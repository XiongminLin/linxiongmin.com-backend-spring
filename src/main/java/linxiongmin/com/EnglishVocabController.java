package linxiongmin.com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnglishVocabController {

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/english-vocabulary")
	public List<EnglishVocab> getEnglishVocab() {
		return geneEnglishVocab();
	}
	
	private List<EnglishVocab> geneEnglishVocab() {
		List<EnglishVocab> evList = new ArrayList<EnglishVocab>();
		
		for(int i = 1; i < 10; i++) {
			EnglishVocab ev = new EnglishVocab(Integer.toString(i+1990), 1000 * i);
			evList.add(ev);
		}
		return evList;
		
	}
}
