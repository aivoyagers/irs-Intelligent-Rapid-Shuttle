package com.irsspace.irs;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("irsStudent")
@org.optaplanner.core.api.domain.entity.PlanningEntity(difficultyComparatorClass = irsStudent.DifficultyComparator.class)
public class irsStudent implements java.io.Serializable, irsPickupDropoffPoint {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Student Name")
	private java.lang.String name;

	// Shadow variables
	@org.kie.api.definition.type.Label("Next Student")
	private com.irsspace.irs.irsStudent nextStudent;

	@org.kie.api.definition.type.Label("Student Location")
	private com.irsspace.irs.irsLocation location;

	@org.kie.api.definition.type.Label("Vehicle assigned")
	@org.optaplanner.core.api.domain.variable.AnchorShadowVariable(sourceVariableName = "prevPickupDropoffPoint")
	private com.irsspace.irs.irsVehicle vehicle;

	@org.kie.api.definition.type.Label("Previous Pickup Drop-off Point details")
	@org.optaplanner.core.api.domain.variable.PlanningVariable(graphType = org.optaplanner.core.api.domain.variable.PlanningVariableGraphType.CHAINED, valueRangeProviderRefs = {
			"vehicleRange", "studentRange"})
	private com.irsspace.irs.irsPickupDropoffPoint prevPickupDropoffPoint;

	public irsStudent() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@Override
	public com.irsspace.irs.irsStudent getNextStudent() {
		return this.nextStudent;
	}

	@Override
	public void setNextStudent(com.irsspace.irs.irsStudent nextStudent) {
		this.nextStudent = nextStudent;
	}

	@Override
	public com.irsspace.irs.irsLocation getLocation() {
		return this.location;
	}

	public void setLocation(com.irsspace.irs.irsLocation location) {
		this.location = location;
	}

	@Override
	public com.irsspace.irs.irsVehicle getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(com.irsspace.irs.irsVehicle vehicle) {
		this.vehicle = vehicle;
	}

	public com.irsspace.irs.irsPickupDropoffPoint getPrevPickupDropoffPoint() {
		return this.prevPickupDropoffPoint;
	}

	public void setPrevPickupDropoffPoint(
			com.irsspace.irs.irsPickupDropoffPoint prevPickupDropoffPoint) {
		this.prevPickupDropoffPoint = prevPickupDropoffPoint;
	}

	// ************************************************************************
	// Complex methods
	// ************************************************************************

	/**
	 * @return a positive number, the distance multiplied by 1000 to avoid
	 *         floating point arithmetic rounding errors Euclidean distance to
	 *         be replaced with Google Distance by transit
	 */
	public long getDistanceFromPrevPickupDropoffPoint() {
		if (prevPickupDropoffPoint == null) {
			throw new IllegalStateException(
					"This method must not be called when the prevPickupDropoffPoint ("
							+ prevPickupDropoffPoint
							+ ") is not initialized yet.");
		}
		return getDistanceFrom(prevPickupDropoffPoint);
	}

	/**
	 * @param standstill
	 *            never null
	 * @return a positive number, the distance multiplied by 1000 to avoid
	 *         floating point arithmetic rounding errors
	 */
	public long getDistanceFrom(irsPickupDropoffPoint pickupDropoffPoint) {
		return pickupDropoffPoint.getLocation().getDistanceTo(location);
	}

	public long getDistanceTo(irsPickupDropoffPoint pickupDropoffPoint) {
		return location.getDistanceTo(pickupDropoffPoint.getLocation());
	}

	@Override
	public String toString() {
		if (location.getName() == null) {
			return super.toString();
		}
		return location.getName();
	}

	public irsStudent(java.lang.String name,
			com.irsspace.irs.irsStudent nextStudent,
			com.irsspace.irs.irsLocation location,
			com.irsspace.irs.irsVehicle vehicle,
			com.irsspace.irs.irsPickupDropoffPoint prevPickupDropoffPoint) {
		this.name = name;
		this.nextStudent = nextStudent;
		this.location = location;
		this.vehicle = vehicle;
		this.prevPickupDropoffPoint = prevPickupDropoffPoint;
	}

	@javax.annotation.Generated(value = {"org.optaplanner.workbench.screens.domaineditor.service.ComparatorDefinitionService"})
	@org.optaplanner.workbench.screens.domaineditor.model.ComparatorDefinition
	public static class DifficultyComparator
			implements
				java.io.Serializable,
				java.util.Comparator<com.irsspace.irs.irsStudent> {
		static final long serialVersionUID = 1L;

		@javax.annotation.Generated(value = {"org.optaplanner.workbench.screens.domaineditor.service.ComparatorDefinitionService"})
		public int compare(com.irsspace.irs.irsStudent o1,
				com.irsspace.irs.irsStudent o2) {
			return 0;
		}
	}

}