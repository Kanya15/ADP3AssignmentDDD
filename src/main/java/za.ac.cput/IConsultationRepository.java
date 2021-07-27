/*IConsultationRepository.java
Repository for Consultation
Author: Kanya Ramncwana (218297521)
Date: 24 July 2021
 */

package za.ac.cput;

import za.ac.cput.Entity.Consultation;

public interface IConsultationRepository extends IRepository<Consultation,String>
{
    Consultation create(Consultation consultation);
    Consultation read(String id);
    Consultation update(Consultation consultation);
    boolean delete(String id);
}
