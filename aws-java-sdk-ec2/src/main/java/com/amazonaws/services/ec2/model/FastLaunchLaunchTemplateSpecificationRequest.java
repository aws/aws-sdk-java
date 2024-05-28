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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Request to create a launch template for a Windows fast launch enabled AMI.
 * </p>
 * <note>
 * <p>
 * Note - You can specify either the <code>LaunchTemplateName</code> or the <code>LaunchTemplateId</code>, but not both.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FastLaunchLaunchTemplateSpecificationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FastLaunchLaunchTemplateSpecificationRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify the ID of the launch template that the AMI should use for Windows fast launch.
     * </p>
     */
    private String launchTemplateId;
    /**
     * <p>
     * Specify the name of the launch template that the AMI should use for Windows fast launch.
     * </p>
     */
    private String launchTemplateName;
    /**
     * <p>
     * Specify the version of the launch template that the AMI should use for Windows fast launch.
     * </p>
     */
    private String version;

    /**
     * <p>
     * Specify the ID of the launch template that the AMI should use for Windows fast launch.
     * </p>
     * 
     * @param launchTemplateId
     *        Specify the ID of the launch template that the AMI should use for Windows fast launch.
     */

    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * Specify the ID of the launch template that the AMI should use for Windows fast launch.
     * </p>
     * 
     * @return Specify the ID of the launch template that the AMI should use for Windows fast launch.
     */

    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * <p>
     * Specify the ID of the launch template that the AMI should use for Windows fast launch.
     * </p>
     * 
     * @param launchTemplateId
     *        Specify the ID of the launch template that the AMI should use for Windows fast launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastLaunchLaunchTemplateSpecificationRequest withLaunchTemplateId(String launchTemplateId) {
        setLaunchTemplateId(launchTemplateId);
        return this;
    }

    /**
     * <p>
     * Specify the name of the launch template that the AMI should use for Windows fast launch.
     * </p>
     * 
     * @param launchTemplateName
     *        Specify the name of the launch template that the AMI should use for Windows fast launch.
     */

    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * Specify the name of the launch template that the AMI should use for Windows fast launch.
     * </p>
     * 
     * @return Specify the name of the launch template that the AMI should use for Windows fast launch.
     */

    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * <p>
     * Specify the name of the launch template that the AMI should use for Windows fast launch.
     * </p>
     * 
     * @param launchTemplateName
     *        Specify the name of the launch template that the AMI should use for Windows fast launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastLaunchLaunchTemplateSpecificationRequest withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * Specify the version of the launch template that the AMI should use for Windows fast launch.
     * </p>
     * 
     * @param version
     *        Specify the version of the launch template that the AMI should use for Windows fast launch.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Specify the version of the launch template that the AMI should use for Windows fast launch.
     * </p>
     * 
     * @return Specify the version of the launch template that the AMI should use for Windows fast launch.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Specify the version of the launch template that the AMI should use for Windows fast launch.
     * </p>
     * 
     * @param version
     *        Specify the version of the launch template that the AMI should use for Windows fast launch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastLaunchLaunchTemplateSpecificationRequest withVersion(String version) {
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

        if (obj instanceof FastLaunchLaunchTemplateSpecificationRequest == false)
            return false;
        FastLaunchLaunchTemplateSpecificationRequest other = (FastLaunchLaunchTemplateSpecificationRequest) obj;
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
    public FastLaunchLaunchTemplateSpecificationRequest clone() {
        try {
            return (FastLaunchLaunchTemplateSpecificationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
