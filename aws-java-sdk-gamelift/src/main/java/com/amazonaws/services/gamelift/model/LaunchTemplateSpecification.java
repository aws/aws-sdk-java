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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>This data type is used with the GameLift FleetIQ and game server groups.</b>
 * </p>
 * <p>
 * An EC2 launch template that contains configuration settings and game server code to be deployed to all instances in a
 * game server group. The launch template is specified when creating a new game server group with
 * <a>CreateGameServerGroup</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/LaunchTemplateSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for an existing EC2 launch template.
     * </p>
     */
    private String launchTemplateId;
    /**
     * <p>
     * A readable identifier for an existing EC2 launch template.
     * </p>
     */
    private String launchTemplateName;
    /**
     * <p>
     * The version of the EC2 launch template to use. If no version is specified, the default version will be used. With
     * Amazon EC2, you can specify a default version for a launch template. If none is set, the default is the first
     * version created.
     * </p>
     */
    private String version;

    /**
     * <p>
     * A unique identifier for an existing EC2 launch template.
     * </p>
     * 
     * @param launchTemplateId
     *        A unique identifier for an existing EC2 launch template.
     */

    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * A unique identifier for an existing EC2 launch template.
     * </p>
     * 
     * @return A unique identifier for an existing EC2 launch template.
     */

    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * <p>
     * A unique identifier for an existing EC2 launch template.
     * </p>
     * 
     * @param launchTemplateId
     *        A unique identifier for an existing EC2 launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateSpecification withLaunchTemplateId(String launchTemplateId) {
        setLaunchTemplateId(launchTemplateId);
        return this;
    }

    /**
     * <p>
     * A readable identifier for an existing EC2 launch template.
     * </p>
     * 
     * @param launchTemplateName
     *        A readable identifier for an existing EC2 launch template.
     */

    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * A readable identifier for an existing EC2 launch template.
     * </p>
     * 
     * @return A readable identifier for an existing EC2 launch template.
     */

    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    /**
     * <p>
     * A readable identifier for an existing EC2 launch template.
     * </p>
     * 
     * @param launchTemplateName
     *        A readable identifier for an existing EC2 launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateSpecification withLaunchTemplateName(String launchTemplateName) {
        setLaunchTemplateName(launchTemplateName);
        return this;
    }

    /**
     * <p>
     * The version of the EC2 launch template to use. If no version is specified, the default version will be used. With
     * Amazon EC2, you can specify a default version for a launch template. If none is set, the default is the first
     * version created.
     * </p>
     * 
     * @param version
     *        The version of the EC2 launch template to use. If no version is specified, the default version will be
     *        used. With Amazon EC2, you can specify a default version for a launch template. If none is set, the
     *        default is the first version created.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the EC2 launch template to use. If no version is specified, the default version will be used. With
     * Amazon EC2, you can specify a default version for a launch template. If none is set, the default is the first
     * version created.
     * </p>
     * 
     * @return The version of the EC2 launch template to use. If no version is specified, the default version will be
     *         used. With Amazon EC2, you can specify a default version for a launch template. If none is set, the
     *         default is the first version created.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the EC2 launch template to use. If no version is specified, the default version will be used. With
     * Amazon EC2, you can specify a default version for a launch template. If none is set, the default is the first
     * version created.
     * </p>
     * 
     * @param version
     *        The version of the EC2 launch template to use. If no version is specified, the default version will be
     *        used. With Amazon EC2, you can specify a default version for a launch template. If none is set, the
     *        default is the first version created.
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
        com.amazonaws.services.gamelift.model.transform.LaunchTemplateSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
