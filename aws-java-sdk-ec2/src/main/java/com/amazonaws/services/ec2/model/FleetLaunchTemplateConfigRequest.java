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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a launch template and overrides.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FleetLaunchTemplateConfigRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetLaunchTemplateConfigRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The launch template to use. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     */
    private FleetLaunchTemplateSpecificationRequest launchTemplateSpecification;
    /**
     * <p>
     * Any parameters that you specify override the same parameters in the launch template.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateOverridesRequest> overrides;

    /**
     * <p>
     * The launch template to use. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @param launchTemplateSpecification
     *        The launch template to use. You must specify either the launch template ID or launch template name in the
     *        request.
     */

    public void setLaunchTemplateSpecification(FleetLaunchTemplateSpecificationRequest launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
    }

    /**
     * <p>
     * The launch template to use. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @return The launch template to use. You must specify either the launch template ID or launch template name in the
     *         request.
     */

    public FleetLaunchTemplateSpecificationRequest getLaunchTemplateSpecification() {
        return this.launchTemplateSpecification;
    }

    /**
     * <p>
     * The launch template to use. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     * 
     * @param launchTemplateSpecification
     *        The launch template to use. You must specify either the launch template ID or launch template name in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetLaunchTemplateConfigRequest withLaunchTemplateSpecification(FleetLaunchTemplateSpecificationRequest launchTemplateSpecification) {
        setLaunchTemplateSpecification(launchTemplateSpecification);
        return this;
    }

    /**
     * <p>
     * Any parameters that you specify override the same parameters in the launch template.
     * </p>
     * 
     * @return Any parameters that you specify override the same parameters in the launch template.
     */

    public java.util.List<FleetLaunchTemplateOverridesRequest> getOverrides() {
        if (overrides == null) {
            overrides = new com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateOverridesRequest>();
        }
        return overrides;
    }

    /**
     * <p>
     * Any parameters that you specify override the same parameters in the launch template.
     * </p>
     * 
     * @param overrides
     *        Any parameters that you specify override the same parameters in the launch template.
     */

    public void setOverrides(java.util.Collection<FleetLaunchTemplateOverridesRequest> overrides) {
        if (overrides == null) {
            this.overrides = null;
            return;
        }

        this.overrides = new com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateOverridesRequest>(overrides);
    }

    /**
     * <p>
     * Any parameters that you specify override the same parameters in the launch template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOverrides(java.util.Collection)} or {@link #withOverrides(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param overrides
     *        Any parameters that you specify override the same parameters in the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetLaunchTemplateConfigRequest withOverrides(FleetLaunchTemplateOverridesRequest... overrides) {
        if (this.overrides == null) {
            setOverrides(new com.amazonaws.internal.SdkInternalList<FleetLaunchTemplateOverridesRequest>(overrides.length));
        }
        for (FleetLaunchTemplateOverridesRequest ele : overrides) {
            this.overrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any parameters that you specify override the same parameters in the launch template.
     * </p>
     * 
     * @param overrides
     *        Any parameters that you specify override the same parameters in the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetLaunchTemplateConfigRequest withOverrides(java.util.Collection<FleetLaunchTemplateOverridesRequest> overrides) {
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

        if (obj instanceof FleetLaunchTemplateConfigRequest == false)
            return false;
        FleetLaunchTemplateConfigRequest other = (FleetLaunchTemplateConfigRequest) obj;
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
    public FleetLaunchTemplateConfigRequest clone() {
        try {
            return (FleetLaunchTemplateConfigRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
