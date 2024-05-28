/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that describes a recommendation of a target engine on Amazon RDS.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RdsRecommendation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsRecommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Supplemental information about the requirements to the recommended target database on Amazon RDS.
     * </p>
     */
    private RdsRequirements requirementsToTarget;
    /**
     * <p>
     * Supplemental information about the configuration of the recommended target database on Amazon RDS.
     * </p>
     */
    private RdsConfiguration targetConfiguration;

    /**
     * <p>
     * Supplemental information about the requirements to the recommended target database on Amazon RDS.
     * </p>
     * 
     * @param requirementsToTarget
     *        Supplemental information about the requirements to the recommended target database on Amazon RDS.
     */

    public void setRequirementsToTarget(RdsRequirements requirementsToTarget) {
        this.requirementsToTarget = requirementsToTarget;
    }

    /**
     * <p>
     * Supplemental information about the requirements to the recommended target database on Amazon RDS.
     * </p>
     * 
     * @return Supplemental information about the requirements to the recommended target database on Amazon RDS.
     */

    public RdsRequirements getRequirementsToTarget() {
        return this.requirementsToTarget;
    }

    /**
     * <p>
     * Supplemental information about the requirements to the recommended target database on Amazon RDS.
     * </p>
     * 
     * @param requirementsToTarget
     *        Supplemental information about the requirements to the recommended target database on Amazon RDS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsRecommendation withRequirementsToTarget(RdsRequirements requirementsToTarget) {
        setRequirementsToTarget(requirementsToTarget);
        return this;
    }

    /**
     * <p>
     * Supplemental information about the configuration of the recommended target database on Amazon RDS.
     * </p>
     * 
     * @param targetConfiguration
     *        Supplemental information about the configuration of the recommended target database on Amazon RDS.
     */

    public void setTargetConfiguration(RdsConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
    }

    /**
     * <p>
     * Supplemental information about the configuration of the recommended target database on Amazon RDS.
     * </p>
     * 
     * @return Supplemental information about the configuration of the recommended target database on Amazon RDS.
     */

    public RdsConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    /**
     * <p>
     * Supplemental information about the configuration of the recommended target database on Amazon RDS.
     * </p>
     * 
     * @param targetConfiguration
     *        Supplemental information about the configuration of the recommended target database on Amazon RDS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsRecommendation withTargetConfiguration(RdsConfiguration targetConfiguration) {
        setTargetConfiguration(targetConfiguration);
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
        if (getRequirementsToTarget() != null)
            sb.append("RequirementsToTarget: ").append(getRequirementsToTarget()).append(",");
        if (getTargetConfiguration() != null)
            sb.append("TargetConfiguration: ").append(getTargetConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RdsRecommendation == false)
            return false;
        RdsRecommendation other = (RdsRecommendation) obj;
        if (other.getRequirementsToTarget() == null ^ this.getRequirementsToTarget() == null)
            return false;
        if (other.getRequirementsToTarget() != null && other.getRequirementsToTarget().equals(this.getRequirementsToTarget()) == false)
            return false;
        if (other.getTargetConfiguration() == null ^ this.getTargetConfiguration() == null)
            return false;
        if (other.getTargetConfiguration() != null && other.getTargetConfiguration().equals(this.getTargetConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequirementsToTarget() == null) ? 0 : getRequirementsToTarget().hashCode());
        hashCode = prime * hashCode + ((getTargetConfiguration() == null) ? 0 : getTargetConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public RdsRecommendation clone() {
        try {
            return (RdsRecommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.RdsRecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
