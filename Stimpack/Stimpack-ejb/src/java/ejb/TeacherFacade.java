/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Rowan
 */
@Stateless
public class TeacherFacade extends AbstractFacade<Teacher> implements TeacherFacadeLocal {
    @PersistenceContext(unitName = "Stimpack-ejbPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public TeacherFacade() {
        super(Teacher.class);
    }
    
}