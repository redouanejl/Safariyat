package ma.cigma.Safariyat.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.cigma.Safariyat.models.Offre;
import ma.cigma.Safariyat.services.MapValidationErrorService;
import ma.cigma.Safariyat.services.OffreService;

@RestController
@RequestMapping("/api/offres")
public class OffreController {

	@Autowired
	private OffreService offreService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;

	
	@PostMapping("")
	public ResponseEntity<?> createUtlisateur(@Valid @RequestBody Offre Offre, BindingResult result){
		
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);

		if (errorMap != null)
			return errorMap;
		
		offreService.createOrUpdate(Offre);
		
		return new ResponseEntity<Offre>(Offre, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getOffreByUsername(@PathVariable("id") Long id){
		
		Offre Offre= offreService.findOffre(id);
		
		return new ResponseEntity<Offre>(Offre, HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public Iterable<Offre> getAllOffres(){
		return offreService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteOffre(@PathVariable("id") Long id){
		
		offreService.deleteOffre(id);
		
		return new ResponseEntity<String>("Offre avec id '"+id+"' est supprimé avec succés!", HttpStatus.OK);
	}

}
