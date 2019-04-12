package com.irsspace.irs;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.InverseRelationShadowVariable;
import com.irsspace.irs.irsLocation;


public interface irsStandstill {

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
    @InverseRelationShadowVariable(sourceVariableName = "previousStandstill")
    irsStudent getNextStudent();
    void setNextStudent(irsStudent nextStudent);

}