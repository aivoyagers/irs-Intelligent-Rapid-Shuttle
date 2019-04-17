package com.irsspace.irs;

//import org.optaplanner.core.api.domain.entity.PlanningEntity;
//import org.optaplanner.core.api.domain.variable.InverseRelationShadowVariable;
import com.irsspace.irs.irsLocation;

//@org.optaplanner.core.api.domain.entity.PlanningEntity
public interface irsPickupDropoffPoint {

    /**
     * @return never null
     */
    irsLocation getLocation();

    /**
     * @return sometimes null
     */
    irsVehicle getVehicle();

    /**
     * @return sometimes null
     */
    //@InverseRelationShadowVariable(sourceVariableName = "prevPickupDropoffPoint")
    irsStudent getNextStudent();
    void setNextStudent(irsStudent nextStudent);

}