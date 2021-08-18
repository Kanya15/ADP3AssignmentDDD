/*ConsultationController.java
Controller for Consultation
Author: Kanya Ramncwana (218297521)
Date: 18 August 2021
 */

package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.Entity.Consultation;
import za.ac.cput.Factory.ConsultationFactory;
import za.ac.cput.Service.ConsultationService;

import java.util.Set;

@RestController
@RequestMapping("/consultation")
public class ConsultationController {

    @Autowired
    private ConsultationService ConsultationService;


    @PostMapping("/create")
    public Consultation create (@RequestBody Consultation consultation)
    {
        Consultation newConsultation = ConsultationFactory.createConsultation
                (
                        consultation.getConsultID(),
                        consultation.getConsultDate(),
                        consultation.getConsultReport()
                );
        return ConsultationService.create(newConsultation);
    }

    @GetMapping("/read/{consultReport}")
    public Consultation read (@PathVariable String consultReport)
    {
        return ConsultationService.read(consultReport);
    }

    @PostMapping ("/update")
    public Consultation update (@RequestBody Consultation consultation)
    {
        Consultation update = ConsultationService.update(consultation);

        return update;
    }

    @DeleteMapping ("/delete/{consultID}")
    public String delete (@RequestBody Consultation consultation)
    {
        if (ConsultationService.delete(consultation.getConsultID()))

            return "Deleted";
        else
            return "Not Deleted";
    }

    @GetMapping ("/getall")
    public Set<Consultation> getAll()
    {
        return ConsultationService.getAllConsultation();
    }
}


