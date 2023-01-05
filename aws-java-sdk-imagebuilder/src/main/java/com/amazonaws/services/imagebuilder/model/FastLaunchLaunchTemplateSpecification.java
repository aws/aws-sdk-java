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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies the launch template that the associated Windows AMI uses for launching an instance when faster launching
 * is enabled.
 * </p>
 * <note>
 * <p>
 * You can specify either the <code>launchTemplateName</code> or the <code>launchTemplateId</code>, but not both.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/FastLaunchLaunchTemplateSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FastLaunchLaunchTemplateSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the launch template to use for faster launching for a Windows AMI.
     * </p>
     */
    private String launchTemplateId;
    /**
     * <p>
     * The name of the launch template to use for faster launching for a Windows AMI.
     * </p>
     */
    private String launchTemplateName;
    /**
     * <p>
     * The version of the launch template to use for faster launching for a Windows AMI.
     * </p>
     */
    private String launchTemplateVersion;

    /**
     * <p>
     * The ID of the launch template to use for faster launching for a Windows AMI.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template to use for faster launching for a Windows AMI.
     */

    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template to use for faster launching for a Windows AMI.
     * </p>
     * 
     * @return The ID of the launch template to use for faster launching for a Windows AMI.
     */

    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template to use for faster launching for a Windows AMI.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template to use for faster launching for a Windows AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastLaunchLaunchTemplateSpecification withLaunchTemplateId(String launchTemplateId) {
        setLaunchTemplateId(launchTemplateId);
        return this;
    }

    /**
     * <p>
     * The name of the launch template to use for faster launching for a Windows AMI.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template to use for faster launching for a Windows AMI.
     */

    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template to use for faster launching for a Windows AMI.
     * </p>
     * 
     * @return The name of the launch template to use for faster launching for a Windows AMI.
     */

    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template to use for faster launching for a Windows AMI.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template to use for faster launching for a Windows AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastLaunchLaunchTemplateSpecification withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * The version of the launch template to use for faster launching for a Windows AMI.
     * </p>
     * 
     * @param launchTemplateVersion
     *        The version of the launch template to use for faster launching for a Windows AMI.
     */

    public void setLaunchTemplateVersion(String launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
    }

    /**
     * <p>
     * The version of the launch template to use for faster launching for a Windows AMI.
     * </p>
     * 
     * @return The version of the launch template to use for faster launching for a Windows AMI.
     */

    public String getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    /**
     * <p>
     * The version of the launch template to use for faster launching for a Windows AMI.
     * </p>
     * 
     * @param launchTemplateVersion
     *        The version of the launch template to use for faster launching for a Windows AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FastLaunchLaunchTemplateSpecification withLaunchTemplateVersion(String launchTemplateVersion) {
        setLaunchTemplateVersion(launchTemplateVersion);
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
        if (getLaunchTemplateVersion() != null)
            sb.append("LaunchTemplateVersion: ").append(getLaunchTemplateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FastLaunchLaunchTemplateSpecification == false)
            return false;
        FastLaunchLaunchTemplateSpecification other = (FastLaunchLaunchTemplateSpecification) obj;
        if (other.getLaunchTemplateId() == null ^ this.getLaunchTemplateId() == null)
            return false;
        if (other.getLaunchTemplateId() != null && other.getLaunchTemplateId().equals(this.getLaunchTemplateId()) == false)
            return false;
        if (other.getLaunchTemplateName() == null ^ this.getLaunchTemplateName() == null)
            return false;
        if (other.getLaunchTemplateName() != null && other.getLaunchTemplateName().equals(this.getLaunchTemplateName()) == false)
            return false;
        if (other.getLaunchTemplateVersion() == null ^ this.getLaunchTemplateVersion() == null)
            return false;
        if (other.getLaunchTemplateVersion() != null && other.getLaunchTemplateVersion().equals(this.getLaunchTemplateVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode + ((getLaunchTemplateVersion() == null) ? 0 : getLaunchTemplateVersion().hashCode());
        return hashCode;
    }

    @Override
    public FastLaunchLaunchTemplateSpecification clone() {
        try {
            return (FastLaunchLaunchTemplateSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.FastLaunchLaunchTemplateSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
