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
 * Provides information about the required target engine settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RecommendationSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The size of your target instance. Fleet Advisor calculates this value based on your data collection type, such as
     * total capacity and resource utilization. Valid values include <code>"total-capacity"</code> and
     * <code>"utilization"</code>.
     * </p>
     */
    private String instanceSizingType;
    /**
     * <p>
     * The deployment option for your target engine. For production databases, Fleet Advisor chooses Multi-AZ
     * deployment. For development or test databases, Fleet Advisor chooses Single-AZ deployment. Valid values include
     * <code>"development"</code> and <code>"production"</code>.
     * </p>
     */
    private String workloadType;

    /**
     * <p>
     * The size of your target instance. Fleet Advisor calculates this value based on your data collection type, such as
     * total capacity and resource utilization. Valid values include <code>"total-capacity"</code> and
     * <code>"utilization"</code>.
     * </p>
     * 
     * @param instanceSizingType
     *        The size of your target instance. Fleet Advisor calculates this value based on your data collection type,
     *        such as total capacity and resource utilization. Valid values include <code>"total-capacity"</code> and
     *        <code>"utilization"</code>.
     */

    public void setInstanceSizingType(String instanceSizingType) {
        this.instanceSizingType = instanceSizingType;
    }

    /**
     * <p>
     * The size of your target instance. Fleet Advisor calculates this value based on your data collection type, such as
     * total capacity and resource utilization. Valid values include <code>"total-capacity"</code> and
     * <code>"utilization"</code>.
     * </p>
     * 
     * @return The size of your target instance. Fleet Advisor calculates this value based on your data collection type,
     *         such as total capacity and resource utilization. Valid values include <code>"total-capacity"</code> and
     *         <code>"utilization"</code>.
     */

    public String getInstanceSizingType() {
        return this.instanceSizingType;
    }

    /**
     * <p>
     * The size of your target instance. Fleet Advisor calculates this value based on your data collection type, such as
     * total capacity and resource utilization. Valid values include <code>"total-capacity"</code> and
     * <code>"utilization"</code>.
     * </p>
     * 
     * @param instanceSizingType
     *        The size of your target instance. Fleet Advisor calculates this value based on your data collection type,
     *        such as total capacity and resource utilization. Valid values include <code>"total-capacity"</code> and
     *        <code>"utilization"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationSettings withInstanceSizingType(String instanceSizingType) {
        setInstanceSizingType(instanceSizingType);
        return this;
    }

    /**
     * <p>
     * The deployment option for your target engine. For production databases, Fleet Advisor chooses Multi-AZ
     * deployment. For development or test databases, Fleet Advisor chooses Single-AZ deployment. Valid values include
     * <code>"development"</code> and <code>"production"</code>.
     * </p>
     * 
     * @param workloadType
     *        The deployment option for your target engine. For production databases, Fleet Advisor chooses Multi-AZ
     *        deployment. For development or test databases, Fleet Advisor chooses Single-AZ deployment. Valid values
     *        include <code>"development"</code> and <code>"production"</code>.
     */

    public void setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
    }

    /**
     * <p>
     * The deployment option for your target engine. For production databases, Fleet Advisor chooses Multi-AZ
     * deployment. For development or test databases, Fleet Advisor chooses Single-AZ deployment. Valid values include
     * <code>"development"</code> and <code>"production"</code>.
     * </p>
     * 
     * @return The deployment option for your target engine. For production databases, Fleet Advisor chooses Multi-AZ
     *         deployment. For development or test databases, Fleet Advisor chooses Single-AZ deployment. Valid values
     *         include <code>"development"</code> and <code>"production"</code>.
     */

    public String getWorkloadType() {
        return this.workloadType;
    }

    /**
     * <p>
     * The deployment option for your target engine. For production databases, Fleet Advisor chooses Multi-AZ
     * deployment. For development or test databases, Fleet Advisor chooses Single-AZ deployment. Valid values include
     * <code>"development"</code> and <code>"production"</code>.
     * </p>
     * 
     * @param workloadType
     *        The deployment option for your target engine. For production databases, Fleet Advisor chooses Multi-AZ
     *        deployment. For development or test databases, Fleet Advisor chooses Single-AZ deployment. Valid values
     *        include <code>"development"</code> and <code>"production"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationSettings withWorkloadType(String workloadType) {
        setWorkloadType(workloadType);
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
        if (getInstanceSizingType() != null)
            sb.append("InstanceSizingType: ").append(getInstanceSizingType()).append(",");
        if (getWorkloadType() != null)
            sb.append("WorkloadType: ").append(getWorkloadType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationSettings == false)
            return false;
        RecommendationSettings other = (RecommendationSettings) obj;
        if (other.getInstanceSizingType() == null ^ this.getInstanceSizingType() == null)
            return false;
        if (other.getInstanceSizingType() != null && other.getInstanceSizingType().equals(this.getInstanceSizingType()) == false)
            return false;
        if (other.getWorkloadType() == null ^ this.getWorkloadType() == null)
            return false;
        if (other.getWorkloadType() != null && other.getWorkloadType().equals(this.getWorkloadType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceSizingType() == null) ? 0 : getInstanceSizingType().hashCode());
        hashCode = prime * hashCode + ((getWorkloadType() == null) ? 0 : getWorkloadType().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationSettings clone() {
        try {
            return (RecommendationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.RecommendationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
