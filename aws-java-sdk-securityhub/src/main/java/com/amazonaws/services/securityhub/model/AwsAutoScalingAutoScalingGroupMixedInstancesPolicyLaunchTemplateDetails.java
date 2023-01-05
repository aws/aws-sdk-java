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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a launch template and overrides for a mixed instances policy.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The launch template to use for a mixed instances policy.
     * </p>
     */
    private AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification launchTemplateSpecification;
    /**
     * <p>
     * Property values to use to override the values in the launch template.
     * </p>
     */
    private java.util.List<AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails> overrides;

    /**
     * <p>
     * The launch template to use for a mixed instances policy.
     * </p>
     * 
     * @param launchTemplateSpecification
     *        The launch template to use for a mixed instances policy.
     */

    public void setLaunchTemplateSpecification(
            AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
    }

    /**
     * <p>
     * The launch template to use for a mixed instances policy.
     * </p>
     * 
     * @return The launch template to use for a mixed instances policy.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification getLaunchTemplateSpecification() {
        return this.launchTemplateSpecification;
    }

    /**
     * <p>
     * The launch template to use for a mixed instances policy.
     * </p>
     * 
     * @param launchTemplateSpecification
     *        The launch template to use for a mixed instances policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails withLaunchTemplateSpecification(
            AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification launchTemplateSpecification) {
        setLaunchTemplateSpecification(launchTemplateSpecification);
        return this;
    }

    /**
     * <p>
     * Property values to use to override the values in the launch template.
     * </p>
     * 
     * @return Property values to use to override the values in the launch template.
     */

    public java.util.List<AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails> getOverrides() {
        return overrides;
    }

    /**
     * <p>
     * Property values to use to override the values in the launch template.
     * </p>
     * 
     * @param overrides
     *        Property values to use to override the values in the launch template.
     */

    public void setOverrides(java.util.Collection<AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails> overrides) {
        if (overrides == null) {
            this.overrides = null;
            return;
        }

        this.overrides = new java.util.ArrayList<AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails>(overrides);
    }

    /**
     * <p>
     * Property values to use to override the values in the launch template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOverrides(java.util.Collection)} or {@link #withOverrides(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param overrides
     *        Property values to use to override the values in the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails withOverrides(
            AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails... overrides) {
        if (this.overrides == null) {
            setOverrides(new java.util.ArrayList<AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails>(overrides.length));
        }
        for (AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails ele : overrides) {
            this.overrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Property values to use to override the values in the launch template.
     * </p>
     * 
     * @param overrides
     *        Property values to use to override the values in the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails withOverrides(
            java.util.Collection<AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateOverridesListDetails> overrides) {
        setOverrides(overrides);
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
        if (getLaunchTemplateSpecification() != null)
            sb.append("LaunchTemplateSpecification: ").append(getLaunchTemplateSpecification()).append(",");
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails == false)
            return false;
        AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails other = (AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails) obj;
        if (other.getLaunchTemplateSpecification() == null ^ this.getLaunchTemplateSpecification() == null)
            return false;
        if (other.getLaunchTemplateSpecification() != null && other.getLaunchTemplateSpecification().equals(this.getLaunchTemplateSpecification()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplateSpecification() == null) ? 0 : getLaunchTemplateSpecification().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        return hashCode;
    }

    @Override
    public AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails clone() {
        try {
            return (AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAutoScalingAutoScalingGroupMixedInstancesPolicyLaunchTemplateDetailsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
