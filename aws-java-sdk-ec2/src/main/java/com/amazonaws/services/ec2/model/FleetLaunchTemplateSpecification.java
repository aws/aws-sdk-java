/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the Amazon EC2 launch template and the launch template version that can be used by a Spot Fleet request to
 * configure Amazon EC2 instances. For information about launch templates, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html">Launching an instance from a
 * launch template</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FleetLaunchTemplateSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetLaunchTemplateSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the launch template. If you specify the template ID, you can't specify the template name.
     * </p>
     */
    private String launchTemplateId;
    /**
     * <p>
     * The name of the launch template. If you specify the template name, you can't specify the template ID.
     * </p>
     */
    private String launchTemplateName;
    /**
     * <p>
     * The launch template version number, <code>$Latest</code>, or <code>$Default</code>. You must specify a value,
     * otherwise the request fails.
     * </p>
     * <p>
     * If the value is <code>$Latest</code>, Amazon EC2 uses the latest version of the launch template.
     * </p>
     * <p>
     * If the value is <code>$Default</code>, Amazon EC2 uses the default version of the launch template.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The ID of the launch template. If you specify the template ID, you can't specify the template name.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template. If you specify the template ID, you can't specify the template name.
     */

    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template. If you specify the template ID, you can't specify the template name.
     * </p>
     * 
     * @return The ID of the launch template. If you specify the template ID, you can't specify the template name.
     */

    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template. If you specify the template ID, you can't specify the template name.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template. If you specify the template ID, you can't specify the template name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetLaunchTemplateSpecification withLaunchTemplateId(String launchTemplateId) {
        setLaunchTemplateId(launchTemplateId);
        return this;
    }

    /**
     * <p>
     * The name of the launch template. If you specify the template name, you can't specify the template ID.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template. If you specify the template name, you can't specify the template ID.
     */

    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template. If you specify the template name, you can't specify the template ID.
     * </p>
     * 
     * @return The name of the launch template. If you specify the template name, you can't specify the template ID.
     */

    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template. If you specify the template name, you can't specify the template ID.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template. If you specify the template name, you can't specify the template ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetLaunchTemplateSpecification withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * The launch template version number, <code>$Latest</code>, or <code>$Default</code>. You must specify a value,
     * otherwise the request fails.
     * </p>
     * <p>
     * If the value is <code>$Latest</code>, Amazon EC2 uses the latest version of the launch template.
     * </p>
     * <p>
     * If the value is <code>$Default</code>, Amazon EC2 uses the default version of the launch template.
     * </p>
     * 
     * @param version
     *        The launch template version number, <code>$Latest</code>, or <code>$Default</code>. You must specify a
     *        value, otherwise the request fails.</p>
     *        <p>
     *        If the value is <code>$Latest</code>, Amazon EC2 uses the latest version of the launch template.
     *        </p>
     *        <p>
     *        If the value is <code>$Default</code>, Amazon EC2 uses the default version of the launch template.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The launch template version number, <code>$Latest</code>, or <code>$Default</code>. You must specify a value,
     * otherwise the request fails.
     * </p>
     * <p>
     * If the value is <code>$Latest</code>, Amazon EC2 uses the latest version of the launch template.
     * </p>
     * <p>
     * If the value is <code>$Default</code>, Amazon EC2 uses the default version of the launch template.
     * </p>
     * 
     * @return The launch template version number, <code>$Latest</code>, or <code>$Default</code>. You must specify a
     *         value, otherwise the request fails.</p>
     *         <p>
     *         If the value is <code>$Latest</code>, Amazon EC2 uses the latest version of the launch template.
     *         </p>
     *         <p>
     *         If the value is <code>$Default</code>, Amazon EC2 uses the default version of the launch template.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The launch template version number, <code>$Latest</code>, or <code>$Default</code>. You must specify a value,
     * otherwise the request fails.
     * </p>
     * <p>
     * If the value is <code>$Latest</code>, Amazon EC2 uses the latest version of the launch template.
     * </p>
     * <p>
     * If the value is <code>$Default</code>, Amazon EC2 uses the default version of the launch template.
     * </p>
     * 
     * @param version
     *        The launch template version number, <code>$Latest</code>, or <code>$Default</code>. You must specify a
     *        value, otherwise the request fails.</p>
     *        <p>
     *        If the value is <code>$Latest</code>, Amazon EC2 uses the latest version of the launch template.
     *        </p>
     *        <p>
     *        If the value is <code>$Default</code>, Amazon EC2 uses the default version of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetLaunchTemplateSpecification withVersion(String version) {
        setVersion(version);
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
        if (getLaunchTemplateId() != null)
            sb.append("LaunchTemplateId: ").append(getLaunchTemplateId()).append(",");
        if (getLaunchTemplateName() != null)
            sb.append("LaunchTemplateName: ").append(getLaunchTemplateName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetLaunchTemplateSpecification == false)
            return false;
        FleetLaunchTemplateSpecification other = (FleetLaunchTemplateSpecification) obj;
        if (other.getLaunchTemplateId() == null ^ this.getLaunchTemplateId() == null)
            return false;
        if (other.getLaunchTemplateId() != null && other.getLaunchTemplateId().equals(this.getLaunchTemplateId()) == false)
            return false;
        if (other.getLaunchTemplateName() == null ^ this.getLaunchTemplateName() == null)
            return false;
        if (other.getLaunchTemplateName() != null && other.getLaunchTemplateName().equals(this.getLaunchTemplateName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public FleetLaunchTemplateSpecification clone() {
        try {
            return (FleetLaunchTemplateSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
