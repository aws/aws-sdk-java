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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the properties of the scaling policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/AutoScalingPolicyDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingPolicyDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * Represents a target tracking scaling policy configuration.
     * </p>
     */
    private AutoScalingTargetTrackingScalingPolicyConfigurationDescription targetTrackingScalingPolicyConfiguration;

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

    public AutoScalingPolicyDescription withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * Represents a target tracking scaling policy configuration.
     * </p>
     * 
     * @param targetTrackingScalingPolicyConfiguration
     *        Represents a target tracking scaling policy configuration.
     */

    public void setTargetTrackingScalingPolicyConfiguration(
            AutoScalingTargetTrackingScalingPolicyConfigurationDescription targetTrackingScalingPolicyConfiguration) {
        this.targetTrackingScalingPolicyConfiguration = targetTrackingScalingPolicyConfiguration;
    }

    /**
     * <p>
     * Represents a target tracking scaling policy configuration.
     * </p>
     * 
     * @return Represents a target tracking scaling policy configuration.
     */

    public AutoScalingTargetTrackingScalingPolicyConfigurationDescription getTargetTrackingScalingPolicyConfiguration() {
        return this.targetTrackingScalingPolicyConfiguration;
    }

    /**
     * <p>
     * Represents a target tracking scaling policy configuration.
     * </p>
     * 
     * @param targetTrackingScalingPolicyConfiguration
     *        Represents a target tracking scaling policy configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingPolicyDescription withTargetTrackingScalingPolicyConfiguration(
            AutoScalingTargetTrackingScalingPolicyConfigurationDescription targetTrackingScalingPolicyConfiguration) {
        setTargetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration);
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
        if (getTargetTrackingScalingPolicyConfiguration() != null)
            sb.append("TargetTrackingScalingPolicyConfiguration: ").append(getTargetTrackingScalingPolicyConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingPolicyDescription == false)
            return false;
        AutoScalingPolicyDescription other = (AutoScalingPolicyDescription) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getTargetTrackingScalingPolicyConfiguration() == null ^ this.getTargetTrackingScalingPolicyConfiguration() == null)
            return false;
        if (other.getTargetTrackingScalingPolicyConfiguration() != null
                && other.getTargetTrackingScalingPolicyConfiguration().equals(this.getTargetTrackingScalingPolicyConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getTargetTrackingScalingPolicyConfiguration() == null) ? 0 : getTargetTrackingScalingPolicyConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingPolicyDescription clone() {
        try {
            return (AutoScalingPolicyDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.AutoScalingPolicyDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
