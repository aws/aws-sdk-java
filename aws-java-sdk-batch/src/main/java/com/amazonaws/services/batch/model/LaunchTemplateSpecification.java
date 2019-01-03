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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a launch template associated with a compute resource. You must specify either the launch
 * template ID or launch template name in the request, but not both.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/LaunchTemplateSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     */
    private String launchTemplateId;
    /**
     * <p>
     * The name of the launch template.
     * </p>
     */
    private String launchTemplateName;
    /**
     * <p>
     * The version number of the launch template.
     * </p>
     * <p>
     * Default: The default version of the launch template.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template.
     */

    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     * 
     * @return The ID of the launch template.
     */

    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     * 
     * @param launchTemplateId
     *        The ID of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateSpecification withLaunchTemplateId(String launchTemplateId) {
        setLaunchTemplateId(launchTemplateId);
        return this;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template.
     */

    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * 
     * @return The name of the launch template.
     */

    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * 
     * @param launchTemplateName
     *        The name of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateSpecification withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * The version number of the launch template.
     * </p>
     * <p>
     * Default: The default version of the launch template.
     * </p>
     * 
     * @param version
     *        The version number of the launch template.</p>
     *        <p>
     *        Default: The default version of the launch template.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the launch template.
     * </p>
     * <p>
     * Default: The default version of the launch template.
     * </p>
     * 
     * @return The version number of the launch template.</p>
     *         <p>
     *         Default: The default version of the launch template.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number of the launch template.
     * </p>
     * <p>
     * Default: The default version of the launch template.
     * </p>
     * 
     * @param version
     *        The version number of the launch template.</p>
     *        <p>
     *        Default: The default version of the launch template.
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.LaunchTemplateSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
