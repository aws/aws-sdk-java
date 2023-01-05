/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Business goals that you specify.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/BusinessGoals" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BusinessGoals implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Business goal to reduce license costs.
     * </p>
     */
    private Integer licenseCostReduction;
    /**
     * <p>
     * Business goal to modernize infrastructure by moving to cloud native technologies.
     * </p>
     */
    private Integer modernizeInfrastructureWithCloudNativeTechnologies;
    /**
     * <p>
     * Business goal to reduce the operational overhead on the team by moving into managed services.
     * </p>
     */
    private Integer reduceOperationalOverheadWithManagedServices;
    /**
     * <p>
     * Business goal to achieve migration at a fast pace.
     * </p>
     */
    private Integer speedOfMigration;

    /**
     * <p>
     * Business goal to reduce license costs.
     * </p>
     * 
     * @param licenseCostReduction
     *        Business goal to reduce license costs.
     */

    public void setLicenseCostReduction(Integer licenseCostReduction) {
        this.licenseCostReduction = licenseCostReduction;
    }

    /**
     * <p>
     * Business goal to reduce license costs.
     * </p>
     * 
     * @return Business goal to reduce license costs.
     */

    public Integer getLicenseCostReduction() {
        return this.licenseCostReduction;
    }

    /**
     * <p>
     * Business goal to reduce license costs.
     * </p>
     * 
     * @param licenseCostReduction
     *        Business goal to reduce license costs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BusinessGoals withLicenseCostReduction(Integer licenseCostReduction) {
        setLicenseCostReduction(licenseCostReduction);
        return this;
    }

    /**
     * <p>
     * Business goal to modernize infrastructure by moving to cloud native technologies.
     * </p>
     * 
     * @param modernizeInfrastructureWithCloudNativeTechnologies
     *        Business goal to modernize infrastructure by moving to cloud native technologies.
     */

    public void setModernizeInfrastructureWithCloudNativeTechnologies(Integer modernizeInfrastructureWithCloudNativeTechnologies) {
        this.modernizeInfrastructureWithCloudNativeTechnologies = modernizeInfrastructureWithCloudNativeTechnologies;
    }

    /**
     * <p>
     * Business goal to modernize infrastructure by moving to cloud native technologies.
     * </p>
     * 
     * @return Business goal to modernize infrastructure by moving to cloud native technologies.
     */

    public Integer getModernizeInfrastructureWithCloudNativeTechnologies() {
        return this.modernizeInfrastructureWithCloudNativeTechnologies;
    }

    /**
     * <p>
     * Business goal to modernize infrastructure by moving to cloud native technologies.
     * </p>
     * 
     * @param modernizeInfrastructureWithCloudNativeTechnologies
     *        Business goal to modernize infrastructure by moving to cloud native technologies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BusinessGoals withModernizeInfrastructureWithCloudNativeTechnologies(Integer modernizeInfrastructureWithCloudNativeTechnologies) {
        setModernizeInfrastructureWithCloudNativeTechnologies(modernizeInfrastructureWithCloudNativeTechnologies);
        return this;
    }

    /**
     * <p>
     * Business goal to reduce the operational overhead on the team by moving into managed services.
     * </p>
     * 
     * @param reduceOperationalOverheadWithManagedServices
     *        Business goal to reduce the operational overhead on the team by moving into managed services.
     */

    public void setReduceOperationalOverheadWithManagedServices(Integer reduceOperationalOverheadWithManagedServices) {
        this.reduceOperationalOverheadWithManagedServices = reduceOperationalOverheadWithManagedServices;
    }

    /**
     * <p>
     * Business goal to reduce the operational overhead on the team by moving into managed services.
     * </p>
     * 
     * @return Business goal to reduce the operational overhead on the team by moving into managed services.
     */

    public Integer getReduceOperationalOverheadWithManagedServices() {
        return this.reduceOperationalOverheadWithManagedServices;
    }

    /**
     * <p>
     * Business goal to reduce the operational overhead on the team by moving into managed services.
     * </p>
     * 
     * @param reduceOperationalOverheadWithManagedServices
     *        Business goal to reduce the operational overhead on the team by moving into managed services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BusinessGoals withReduceOperationalOverheadWithManagedServices(Integer reduceOperationalOverheadWithManagedServices) {
        setReduceOperationalOverheadWithManagedServices(reduceOperationalOverheadWithManagedServices);
        return this;
    }

    /**
     * <p>
     * Business goal to achieve migration at a fast pace.
     * </p>
     * 
     * @param speedOfMigration
     *        Business goal to achieve migration at a fast pace.
     */

    public void setSpeedOfMigration(Integer speedOfMigration) {
        this.speedOfMigration = speedOfMigration;
    }

    /**
     * <p>
     * Business goal to achieve migration at a fast pace.
     * </p>
     * 
     * @return Business goal to achieve migration at a fast pace.
     */

    public Integer getSpeedOfMigration() {
        return this.speedOfMigration;
    }

    /**
     * <p>
     * Business goal to achieve migration at a fast pace.
     * </p>
     * 
     * @param speedOfMigration
     *        Business goal to achieve migration at a fast pace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BusinessGoals withSpeedOfMigration(Integer speedOfMigration) {
        setSpeedOfMigration(speedOfMigration);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLicenseCostReduction() != null)
            sb.append("LicenseCostReduction: ").append(getLicenseCostReduction()).append(",");
        if (getModernizeInfrastructureWithCloudNativeTechnologies() != null)
            sb.append("ModernizeInfrastructureWithCloudNativeTechnologies: ").append(getModernizeInfrastructureWithCloudNativeTechnologies()).append(",");
        if (getReduceOperationalOverheadWithManagedServices() != null)
            sb.append("ReduceOperationalOverheadWithManagedServices: ").append(getReduceOperationalOverheadWithManagedServices()).append(",");
        if (getSpeedOfMigration() != null)
            sb.append("SpeedOfMigration: ").append(getSpeedOfMigration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BusinessGoals == false)
            return false;
        BusinessGoals other = (BusinessGoals) obj;
        if (other.getLicenseCostReduction() == null ^ this.getLicenseCostReduction() == null)
            return false;
        if (other.getLicenseCostReduction() != null && other.getLicenseCostReduction().equals(this.getLicenseCostReduction()) == false)
            return false;
        if (other.getModernizeInfrastructureWithCloudNativeTechnologies() == null ^ this.getModernizeInfrastructureWithCloudNativeTechnologies() == null)
            return false;
        if (other.getModernizeInfrastructureWithCloudNativeTechnologies() != null
                && other.getModernizeInfrastructureWithCloudNativeTechnologies().equals(this.getModernizeInfrastructureWithCloudNativeTechnologies()) == false)
            return false;
        if (other.getReduceOperationalOverheadWithManagedServices() == null ^ this.getReduceOperationalOverheadWithManagedServices() == null)
            return false;
        if (other.getReduceOperationalOverheadWithManagedServices() != null
                && other.getReduceOperationalOverheadWithManagedServices().equals(this.getReduceOperationalOverheadWithManagedServices()) == false)
            return false;
        if (other.getSpeedOfMigration() == null ^ this.getSpeedOfMigration() == null)
            return false;
        if (other.getSpeedOfMigration() != null && other.getSpeedOfMigration().equals(this.getSpeedOfMigration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseCostReduction() == null) ? 0 : getLicenseCostReduction().hashCode());
        hashCode = prime * hashCode
                + ((getModernizeInfrastructureWithCloudNativeTechnologies() == null) ? 0 : getModernizeInfrastructureWithCloudNativeTechnologies().hashCode());
        hashCode = prime * hashCode
                + ((getReduceOperationalOverheadWithManagedServices() == null) ? 0 : getReduceOperationalOverheadWithManagedServices().hashCode());
        hashCode = prime * hashCode + ((getSpeedOfMigration() == null) ? 0 : getSpeedOfMigration().hashCode());
        return hashCode;
    }

    @Override
    public BusinessGoals clone() {
        try {
            return (BusinessGoals) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.BusinessGoalsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
