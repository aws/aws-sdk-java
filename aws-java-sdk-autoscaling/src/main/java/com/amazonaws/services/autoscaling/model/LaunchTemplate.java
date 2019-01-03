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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a launch template and overrides.
 * </p>
 * <p>
 * The overrides are used to override the instance type specified by the launch template with multiple instance types
 * that can be used to launch On-Demand Instances and Spot Instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/LaunchTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplate implements Serializable, Cloneable {

    /**
     * <p>
     * The launch template to use. You must specify either the launch template ID or launch template name in the
     * request.
     * </p>
     */
    private LaunchTemplateSpecification launchTemplateSpecification;
    /**
     * <p>
     * Any parameters that you specify override the same parameters in the launch template. Currently, the only
     * supported override is instance type.
     * </p>
     * <p>
     * You must specify between 2 and 20 overrides.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides> overrides;

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

    public void setLaunchTemplateSpecification(LaunchTemplateSpecification launchTemplateSpecification) {
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

    public LaunchTemplateSpecification getLaunchTemplateSpecification() {
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

    public LaunchTemplate withLaunchTemplateSpecification(LaunchTemplateSpecification launchTemplateSpecification) {
        setLaunchTemplateSpecification(launchTemplateSpecification);
        return this;
    }

    /**
     * <p>
     * Any parameters that you specify override the same parameters in the launch template. Currently, the only
     * supported override is instance type.
     * </p>
     * <p>
     * You must specify between 2 and 20 overrides.
     * </p>
     * 
     * @return Any parameters that you specify override the same parameters in the launch template. Currently, the only
     *         supported override is instance type. </p>
     *         <p>
     *         You must specify between 2 and 20 overrides.
     */

    public java.util.List<LaunchTemplateOverrides> getOverrides() {
        if (overrides == null) {
            overrides = new com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides>();
        }
        return overrides;
    }

    /**
     * <p>
     * Any parameters that you specify override the same parameters in the launch template. Currently, the only
     * supported override is instance type.
     * </p>
     * <p>
     * You must specify between 2 and 20 overrides.
     * </p>
     * 
     * @param overrides
     *        Any parameters that you specify override the same parameters in the launch template. Currently, the only
     *        supported override is instance type. </p>
     *        <p>
     *        You must specify between 2 and 20 overrides.
     */

    public void setOverrides(java.util.Collection<LaunchTemplateOverrides> overrides) {
        if (overrides == null) {
            this.overrides = null;
            return;
        }

        this.overrides = new com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides>(overrides);
    }

    /**
     * <p>
     * Any parameters that you specify override the same parameters in the launch template. Currently, the only
     * supported override is instance type.
     * </p>
     * <p>
     * You must specify between 2 and 20 overrides.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOverrides(java.util.Collection)} or {@link #withOverrides(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param overrides
     *        Any parameters that you specify override the same parameters in the launch template. Currently, the only
     *        supported override is instance type. </p>
     *        <p>
     *        You must specify between 2 and 20 overrides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplate withOverrides(LaunchTemplateOverrides... overrides) {
        if (this.overrides == null) {
            setOverrides(new com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides>(overrides.length));
        }
        for (LaunchTemplateOverrides ele : overrides) {
            this.overrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any parameters that you specify override the same parameters in the launch template. Currently, the only
     * supported override is instance type.
     * </p>
     * <p>
     * You must specify between 2 and 20 overrides.
     * </p>
     * 
     * @param overrides
     *        Any parameters that you specify override the same parameters in the launch template. Currently, the only
     *        supported override is instance type. </p>
     *        <p>
     *        You must specify between 2 and 20 overrides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplate withOverrides(java.util.Collection<LaunchTemplateOverrides> overrides) {
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

        if (obj instanceof LaunchTemplate == false)
            return false;
        LaunchTemplate other = (LaunchTemplate) obj;
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
    public LaunchTemplate clone() {
        try {
            return (LaunchTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
