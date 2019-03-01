/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscalingplans.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a scaling policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-plans-2018-01-06/ScalingPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The type of scaling policy.
     * </p>
     */
    private String policyType;
    /**
     * <p>
     * The target tracking scaling policy. Includes support for predefined or customized metrics.
     * </p>
     */
    private TargetTrackingConfiguration targetTrackingConfiguration;

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * 
     * @param policyName
     *        The name of the scaling policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * 
     * @return The name of the scaling policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * 
     * @param policyName
     *        The name of the scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The type of scaling policy.
     * </p>
     * 
     * @param policyType
     *        The type of scaling policy.
     * @see PolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The type of scaling policy.
     * </p>
     * 
     * @return The type of scaling policy.
     * @see PolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The type of scaling policy.
     * </p>
     * 
     * @param policyType
     *        The type of scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public ScalingPolicy withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The type of scaling policy.
     * </p>
     * 
     * @param policyType
     *        The type of scaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public ScalingPolicy withPolicyType(PolicyType policyType) {
        this.policyType = policyType.toString();
        return this;
    }

    /**
     * <p>
     * The target tracking scaling policy. Includes support for predefined or customized metrics.
     * </p>
     * 
     * @param targetTrackingConfiguration
     *        The target tracking scaling policy. Includes support for predefined or customized metrics.
     */

    public void setTargetTrackingConfiguration(TargetTrackingConfiguration targetTrackingConfiguration) {
        this.targetTrackingConfiguration = targetTrackingConfiguration;
    }

    /**
     * <p>
     * The target tracking scaling policy. Includes support for predefined or customized metrics.
     * </p>
     * 
     * @return The target tracking scaling policy. Includes support for predefined or customized metrics.
     */

    public TargetTrackingConfiguration getTargetTrackingConfiguration() {
        return this.targetTrackingConfiguration;
    }

    /**
     * <p>
     * The target tracking scaling policy. Includes support for predefined or customized metrics.
     * </p>
     * 
     * @param targetTrackingConfiguration
     *        The target tracking scaling policy. Includes support for predefined or customized metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScalingPolicy withTargetTrackingConfiguration(TargetTrackingConfiguration targetTrackingConfiguration) {
        setTargetTrackingConfiguration(targetTrackingConfiguration);
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
        if (getPolicyName() != null)
            sb.append("PolicyName: ").append(getPolicyName()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType()).append(",");
        if (getTargetTrackingConfiguration() != null)
            sb.append("TargetTrackingConfiguration: ").append(getTargetTrackingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingPolicy == false)
            return false;
        ScalingPolicy other = (ScalingPolicy) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getTargetTrackingConfiguration() == null ^ this.getTargetTrackingConfiguration() == null)
            return false;
        if (other.getTargetTrackingConfiguration() != null && other.getTargetTrackingConfiguration().equals(this.getTargetTrackingConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode + ((getTargetTrackingConfiguration() == null) ? 0 : getTargetTrackingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ScalingPolicy clone() {
        try {
            return (ScalingPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.autoscalingplans.model.transform.ScalingPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
