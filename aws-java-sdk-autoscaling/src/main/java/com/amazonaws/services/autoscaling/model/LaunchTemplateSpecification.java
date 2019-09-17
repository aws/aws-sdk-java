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
 * Describes a launch template and the launch template version.
 * </p>
 * <p>
 * The launch template that is specified must be configured for use with an Auto Scaling group. For more information,
 * see <a href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html">Creating a Launch
 * Template for an Auto Scaling Group</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/LaunchTemplateSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the launch template. You must specify either a template ID or a template name.
     * </p>
     */
    private String launchTemplateId;
    /**
     * <p>
     * The name of the launch template. You must specify either a template name or a template ID.
     * </p>
     */
    private String launchTemplateName;
    /**
     * <p>
     * The version number, <code>$Latest</code>, or <code>$Default</code>. If the value is <code>$Latest</code>, Amazon
     * EC2 Auto Scaling selects the latest version of the launch template when launching instances. If the value is
     * <code>$Default</code>, Amazon EC2 Auto Scaling selects the default version of the launch template when launching
     * instances. The default value is <code>$Default</code>.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The ID of the launch template. You must specify either a template ID or a template name.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template. You must specify either a template ID or a template name.
     */

    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either a template ID or a template name.
     * </p>
     * 
     * @return The ID of the launch template. You must specify either a template ID or a template name.
     */

    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template. You must specify either a template ID or a template name.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template. You must specify either a template ID or a template name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateSpecification withLaunchTemplateId(String launchTemplateId) {
        setLaunchTemplateId(launchTemplateId);
        return this;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either a template name or a template ID.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template. You must specify either a template name or a template ID.
     */

    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either a template name or a template ID.
     * </p>
     * 
     * @return The name of the launch template. You must specify either a template name or a template ID.
     */

    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template. You must specify either a template name or a template ID.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template. You must specify either a template name or a template ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateSpecification withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * The version number, <code>$Latest</code>, or <code>$Default</code>. If the value is <code>$Latest</code>, Amazon
     * EC2 Auto Scaling selects the latest version of the launch template when launching instances. If the value is
     * <code>$Default</code>, Amazon EC2 Auto Scaling selects the default version of the launch template when launching
     * instances. The default value is <code>$Default</code>.
     * </p>
     * 
     * @param version
     *        The version number, <code>$Latest</code>, or <code>$Default</code>. If the value is <code>$Latest</code>,
     *        Amazon EC2 Auto Scaling selects the latest version of the launch template when launching instances. If the
     *        value is <code>$Default</code>, Amazon EC2 Auto Scaling selects the default version of the launch template
     *        when launching instances. The default value is <code>$Default</code>.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number, <code>$Latest</code>, or <code>$Default</code>. If the value is <code>$Latest</code>, Amazon
     * EC2 Auto Scaling selects the latest version of the launch template when launching instances. If the value is
     * <code>$Default</code>, Amazon EC2 Auto Scaling selects the default version of the launch template when launching
     * instances. The default value is <code>$Default</code>.
     * </p>
     * 
     * @return The version number, <code>$Latest</code>, or <code>$Default</code>. If the value is <code>$Latest</code>,
     *         Amazon EC2 Auto Scaling selects the latest version of the launch template when launching instances. If
     *         the value is <code>$Default</code>, Amazon EC2 Auto Scaling selects the default version of the launch
     *         template when launching instances. The default value is <code>$Default</code>.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number, <code>$Latest</code>, or <code>$Default</code>. If the value is <code>$Latest</code>, Amazon
     * EC2 Auto Scaling selects the latest version of the launch template when launching instances. If the value is
     * <code>$Default</code>, Amazon EC2 Auto Scaling selects the default version of the launch template when launching
     * instances. The default value is <code>$Default</code>.
     * </p>
     * 
     * @param version
     *        The version number, <code>$Latest</code>, or <code>$Default</code>. If the value is <code>$Latest</code>,
     *        Amazon EC2 Auto Scaling selects the latest version of the launch template when launching instances. If the
     *        value is <code>$Default</code>, Amazon EC2 Auto Scaling selects the default version of the launch template
     *        when launching instances. The default value is <code>$Default</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateSpecification withVersion(String version) {
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

        if (obj instanceof LaunchTemplateSpecification == false)
            return false;
        LaunchTemplateSpecification other = (LaunchTemplateSpecification) obj;
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
    public LaunchTemplateSpecification clone() {
        try {
            return (LaunchTemplateSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
