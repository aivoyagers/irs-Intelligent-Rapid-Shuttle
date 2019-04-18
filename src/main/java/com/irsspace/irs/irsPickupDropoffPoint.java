package com.irsspace.irs;

//import org.optaplanner.core.api.domain.entity.PlanningEntity;
//import org.optaplanner.core.api.domain.variable.InverseRelationShadowVariable;
//import com.irsspace.irs.irsLocation;

@org.optaplanner.core.api.domain.entity.PlanningEntity
public interface irsPickupDropoffPoint {

    /**
     * @return never null
     */
    com.irsspace.irs.irsLocation getLocation();

    /**
     * @return sometimes null
     */
    com.irsspace.irs.irsVehicle getVehicle();

    /**
     * @return sometimes null
     */
    //@InverseRelationShadowVariable(sourceVariableName = "prevPickupDropoffPoint")
	@org.optaplanner.core.api.domain.variable.InverseRelationShadowVariable(sourceVariableName = "prevPickupDropoffPoint")    
    com.irsspace.irs.irsStudent getNextStudent();
    void setNextStudent(irsStudent nextStudent);

}