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
 * Represents the autoscaling settings for a global table or global secondary index.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/AutoScalingSettingsDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingSettingsDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum capacity units that a global table or global secondary index should be scaled down to.
     * </p>
     */
    private Long minimumUnits;
    /**
     * <p>
     * The maximum capacity units that a global table or global secondary index should be scaled up to.
     * </p>
     */
    private Long maximumUnits;
    /**
     * <p>
     * Disabled autoscaling for this global table or global secondary index.
     * </p>
     */
    private Boolean autoScalingDisabled;
    /**
     * <p>
     * Role ARN used for configuring autoScaling policy.
     * </p>
     */
    private String autoScalingRoleArn;
    /**
     * <p>
     * Information about the scaling policies.
     * </p>
     */
    private java.util.List<AutoScalingPolicyDescription> scalingPolicies;

    /**
     * <p>
     * The minimum capacity units that a global table or global secondary index should be scaled down to.
     * </p>
     * 
     * @param minimumUnits
     *        The minimum capacity units that a global table or global secondary index should be scaled down to.
     */

    public void setMinimumUnits(Long minimumUnits) {
        this.minimumUnits = minimumUnits;
    }

    /**
     * <p>
     * The minimum capacity units that a global table or global secondary index should be scaled down to.
     * </p>
     * 
     * @return The minimum capacity units that a global table or global secondary index should be scaled down to.
     */

    public Long getMinimumUnits() {
        return this.minimumUnits;
    }

    /**
     * <p>
     * The minimum capacity units that a global table or global secondary index should be scaled down to.
     * </p>
     * 
     * @param minimumUnits
     *        The minimum capacity units that a global table or global secondary index should be scaled down to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingSettingsDescription withMinimumUnits(Long minimumUnits) {
        setMinimumUnits(minimumUnits);
        return this;
    }

    /**
     * <p>
     * The maximum capacity units that a global table or global secondary index should be scaled up to.
     * </p>
     * 
     * @param maximumUnits
     *        The maximum capacity units that a global table or global secondary index should be scaled up to.
     */

    public void setMaximumUnits(Long maximumUnits) {
        this.maximumUnits = maximumUnits;
    }

    /**
     * <p>
     * The maximum capacity units that a global table or global secondary index should be scaled up to.
     * </p>
     * 
     * @return The maximum capacity units that a global table or global secondary index should be scaled up to.
     */

    public Long getMaximumUnits() {
        return this.maximumUnits;
    }

    /**
     * <p>
     * The maximum capacity units that a global table or global secondary index should be scaled up to.
     * </p>
     * 
     * @param maximumUnits
     *        The maximum capacity units that a global table or global secondary index should be scaled up to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingSettingsDescription withMaximumUnits(Long maximumUnits) {
        setMaximumUnits(maximumUnits);
        return this;
    }

    /**
     * <p>
     * Disabled autoscaling for this global table or global secondary index.
     * </p>
     * 
     * @param autoScalingDisabled
     *        Disabled autoscaling for this global table or global secondary index.
     */

    public void setAutoScalingDisabled(Boolean autoScalingDisabled) {
        this.autoScalingDisabled = autoScalingDisabled;
    }

    /**
     * <p>
     * Disabled autoscaling for this global table or global secondary index.
     * </p>
     * 
     * @return Disabled autoscaling for this global table or global secondary index.
     */

    public Boolean getAutoScalingDisabled() {
        return this.autoScalingDisabled;
    }

    /**
     * <p>
     * Disabled autoscaling for this global table or global secondary index.
     * </p>
     * 
     * @param autoScalingDisabled
     *        Disabled autoscaling for this global table or global secondary index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingSettingsDescription withAutoScalingDisabled(Boolean autoScalingDisabled) {
        setAutoScalingDisabled(autoScalingDisabled);
        return this;
    }

    /**
     * <p>
     * Disabled autoscaling for this global table or global secondary index.
     * </p>
     * 
     * @return Disabled autoscaling for this global table or global secondary index.
     */

    public Boolean isAutoScalingDisabled() {
        return this.autoScalingDisabled;
    }

    /**
     * <p>
     * Role ARN used for configuring autoScaling policy.
     * </p>
     * 
     * @param autoScalingRoleArn
     *        Role ARN used for configuring autoScaling policy.
     */

    public void setAutoScalingRoleArn(String autoScalingRoleArn) {
        this.autoScalingRoleArn = autoScalingRoleArn;
    }

    /**
     * <p>
     * Role ARN used for configuring autoScaling policy.
     * </p>
     * 
     * @return Role ARN used for configuring autoScaling policy.
     */

    public String getAutoScalingRoleArn() {
        return this.autoScalingRoleArn;
    }

    /**
     * <p>
     * Role ARN used for configuring autoScaling policy.
     * </p>
     * 
     * @param autoScalingRoleArn
     *        Role ARN used for configuring autoScaling policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingSettingsDescription withAutoScalingRoleArn(String autoScalingRoleArn) {
        setAutoScalingRoleArn(autoScalingRoleArn);
        return this;
    }

    /**
     * <p>
     * Information about the scaling policies.
     * </p>
     * 
     * @return Information about the scaling policies.
     */

    public java.util.List<AutoScalingPolicyDescription> getScalingPolicies() {
        return scalingPolicies;
    }

    /**
     * <p>
     * Information about the scaling policies.
     * </p>
     * 
     * @param scalingPolicies
     *        Information about the scaling policies.
     */

    public void setScalingPolicies(java.util.Collection<AutoScalingPolicyDescription> scalingPolicies) {
        if (scalingPolicies == null) {
            this.scalingPolicies = null;
            return;
        }

        this.scalingPolicies = new java.util.ArrayList<AutoScalingPolicyDescription>(scalingPolicies);
    }

    /**
     * <p>
     * Information about the scaling policies.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScalingPolicies(java.util.Collection)} or {@link #withScalingPolicies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scalingPolicies
     *        Information about the scaling policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingSettingsDescription withScalingPolicies(AutoScalingPolicyDescription... scalingPolicies) {
        if (this.scalingPolicies == null) {
            setScalingPolicies(new java.util.ArrayList<AutoScalingPolicyDescription>(scalingPolicies.length));
        }
        for (AutoScalingPolicyDescription ele : scalingPolicies) {
            this.scalingPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the scaling policies.
     * </p>
     * 
     * @param scalingPolicies
     *        Information about the scaling policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingSettingsDescription withScalingPolicies(java.util.Collection<AutoScalingPolicyDescription> scalingPolicies) {
        setScalingPolicies(scalingPolicies);
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
        if (getMinimumUnits() != null)
            sb.append("MinimumUnits: ").append(getMinimumUnits()).append(",");
        if (getMaximumUnits() != null)
            sb.append("MaximumUnits: ").append(getMaximumUnits()).append(",");
        if (getAutoScalingDisabled() != null)
            sb.append("AutoScalingDisabled: ").append(getAutoScalingDisabled()).append(",");
        if (getAutoScalingRoleArn() != null)
            sb.append("AutoScalingRoleArn: ").append(getAutoScalingRoleArn()).append(",");
        if (getScalingPolicies() != null)
            sb.append("ScalingPolicies: ").append(getScalingPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingSettingsDescription == false)
            return false;
        AutoScalingSettingsDescription other = (AutoScalingSettingsDescription) obj;
        if (other.getMinimumUnits() == null ^ this.getMinimumUnits() == null)
            return false;
        if (other.getMinimumUnits() != null && other.getMinimumUnits().equals(this.getMinimumUnits()) == false)
            return false;
        if (other.getMaximumUnits() == null ^ this.getMaximumUnits() == null)
            return false;
        if (other.getMaximumUnits() != null && other.getMaximumUnits().equals(this.getMaximumUnits()) == false)
            return false;
        if (other.getAutoScalingDisabled() == null ^ this.getAutoScalingDisabled() == null)
            return false;
        if (other.getAutoScalingDisabled() != null && other.getAutoScalingDisabled().equals(this.getAutoScalingDisabled()) == false)
            return false;
        if (other.getAutoScalingRoleArn() == null ^ this.getAutoScalingRoleArn() == null)
            return false;
        if (other.getAutoScalingRoleArn() != null && other.getAutoScalingRoleArn().equals(this.getAutoScalingRoleArn()) == false)
            return false;
        if (other.getScalingPolicies() == null ^ this.getScalingPolicies() == null)
            return false;
        if (other.getScalingPolicies() != null && other.getScalingPolicies().equals(this.getScalingPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinimumUnits() == null) ? 0 : getMinimumUnits().hashCode());
        hashCode = prime * hashCode + ((getMaximumUnits() == null) ? 0 : getMaximumUnits().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingDisabled() == null) ? 0 : getAutoScalingDisabled().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingRoleArn() == null) ? 0 : getAutoScalingRoleArn().hashCode());
        hashCode = prime * hashCode + ((getScalingPolicies() == null) ? 0 : getScalingPolicies().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingSettingsDescription clone() {
        try {
            return (AutoScalingSettingsDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.AutoScalingSettingsDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
