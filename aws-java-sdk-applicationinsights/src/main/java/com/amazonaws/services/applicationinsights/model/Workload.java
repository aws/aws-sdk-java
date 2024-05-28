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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the workloads on a component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/Workload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Workload implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the workload.
     * </p>
     */
    private String workloadId;
    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * The name of the workload.
     * </p>
     */
    private String workloadName;
    /**
     * <p>
     * The tier of the workload.
     * </p>
     */
    private String tier;
    /**
     * <p>
     * If logging is supported for the resource type, shows whether the component has configured logs to be monitored.
     * </p>
     */
    private String workloadRemarks;

    /**
     * <p>
     * The ID of the workload.
     * </p>
     * 
     * @param workloadId
     *        The ID of the workload.
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * <p>
     * The ID of the workload.
     * </p>
     * 
     * @return The ID of the workload.
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * <p>
     * The ID of the workload.
     * </p>
     * 
     * @param workloadId
     *        The ID of the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workload withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @return The name of the component.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param componentName
     *        The name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workload withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @param workloadName
     *        The name of the workload.
     */

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @return The name of the workload.
     */

    public String getWorkloadName() {
        return this.workloadName;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @param workloadName
     *        The name of the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workload withWorkloadName(String workloadName) {
        setWorkloadName(workloadName);
        return this;
    }

    /**
     * <p>
     * The tier of the workload.
     * </p>
     * 
     * @param tier
     *        The tier of the workload.
     * @see Tier
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The tier of the workload.
     * </p>
     * 
     * @return The tier of the workload.
     * @see Tier
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The tier of the workload.
     * </p>
     * 
     * @param tier
     *        The tier of the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tier
     */

    public Workload withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * The tier of the workload.
     * </p>
     * 
     * @param tier
     *        The tier of the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tier
     */

    public Workload withTier(Tier tier) {
        this.tier = tier.toString();
        return this;
    }

    /**
     * <p>
     * If logging is supported for the resource type, shows whether the component has configured logs to be monitored.
     * </p>
     * 
     * @param workloadRemarks
     *        If logging is supported for the resource type, shows whether the component has configured logs to be
     *        monitored.
     */

    public void setWorkloadRemarks(String workloadRemarks) {
        this.workloadRemarks = workloadRemarks;
    }

    /**
     * <p>
     * If logging is supported for the resource type, shows whether the component has configured logs to be monitored.
     * </p>
     * 
     * @return If logging is supported for the resource type, shows whether the component has configured logs to be
     *         monitored.
     */

    public String getWorkloadRemarks() {
        return this.workloadRemarks;
    }

    /**
     * <p>
     * If logging is supported for the resource type, shows whether the component has configured logs to be monitored.
     * </p>
     * 
     * @param workloadRemarks
     *        If logging is supported for the resource type, shows whether the component has configured logs to be
     *        monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Workload withWorkloadRemarks(String workloadRemarks) {
        setWorkloadRemarks(workloadRemarks);
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getWorkloadName() != null)
            sb.append("WorkloadName: ").append(getWorkloadName()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getWorkloadRemarks() != null)
            sb.append("WorkloadRemarks: ").append(getWorkloadRemarks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Workload == false)
            return false;
        Workload other = (Workload) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getWorkloadName() == null ^ this.getWorkloadName() == null)
            return false;
        if (other.getWorkloadName() != null && other.getWorkloadName().equals(this.getWorkloadName()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getWorkloadRemarks() == null ^ this.getWorkloadRemarks() == null)
            return false;
        if (other.getWorkloadRemarks() != null && other.getWorkloadRemarks().equals(this.getWorkloadRemarks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getWorkloadName() == null) ? 0 : getWorkloadName().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getWorkloadRemarks() == null) ? 0 : getWorkloadRemarks().hashCode());
        return hashCode;
    }

    @Override
    public Workload clone() {
        try {
            return (Workload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationinsights.model.transform.WorkloadMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
