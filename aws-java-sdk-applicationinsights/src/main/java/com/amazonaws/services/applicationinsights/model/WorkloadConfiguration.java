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
 * The configuration of the workload.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/WorkloadConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkloadConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the workload.
     * </p>
     */
    private String workloadName;
    /**
     * <p>
     * The configuration of the workload tier.
     * </p>
     */
    private String tier;
    /**
     * <p>
     * The configuration settings of the workload.
     * </p>
     */
    private String configuration;

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

    public WorkloadConfiguration withWorkloadName(String workloadName) {
        setWorkloadName(workloadName);
        return this;
    }

    /**
     * <p>
     * The configuration of the workload tier.
     * </p>
     * 
     * @param tier
     *        The configuration of the workload tier.
     * @see Tier
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The configuration of the workload tier.
     * </p>
     * 
     * @return The configuration of the workload tier.
     * @see Tier
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The configuration of the workload tier.
     * </p>
     * 
     * @param tier
     *        The configuration of the workload tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tier
     */

    public WorkloadConfiguration withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * The configuration of the workload tier.
     * </p>
     * 
     * @param tier
     *        The configuration of the workload tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tier
     */

    public WorkloadConfiguration withTier(Tier tier) {
        this.tier = tier.toString();
        return this;
    }

    /**
     * <p>
     * The configuration settings of the workload.
     * </p>
     * 
     * @param configuration
     *        The configuration settings of the workload.
     */

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration settings of the workload.
     * </p>
     * 
     * @return The configuration settings of the workload.
     */

    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration settings of the workload.
     * </p>
     * 
     * @param configuration
     *        The configuration settings of the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadConfiguration withConfiguration(String configuration) {
        setConfiguration(configuration);
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
        if (getWorkloadName() != null)
            sb.append("WorkloadName: ").append(getWorkloadName()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkloadConfiguration == false)
            return false;
        WorkloadConfiguration other = (WorkloadConfiguration) obj;
        if (other.getWorkloadName() == null ^ this.getWorkloadName() == null)
            return false;
        if (other.getWorkloadName() != null && other.getWorkloadName().equals(this.getWorkloadName()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadName() == null) ? 0 : getWorkloadName().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public WorkloadConfiguration clone() {
        try {
            return (WorkloadConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationinsights.model.transform.WorkloadConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
