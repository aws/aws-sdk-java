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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a node group launch template specification. The launch template cannot include <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateNetworkInterface.html"> <code>SubnetId</code>
 * </a>, <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_IamInstanceProfile.html">
 * <code>IamInstanceProfile</code> </a>, <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">
 * <code>RequestSpotInstances</code> </a>, <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_HibernationOptionsRequest.html">
 * <code>HibernationOptions</code> </a>, or <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_TerminateInstances.html">
 * <code>TerminateInstances</code> </a>, or the node group deployment or update will fail. For more information about
 * launch templates, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateLaunchTemplate.html">
 * <code>CreateLaunchTemplate</code> </a> in the Amazon EC2 API Reference. For more information about using launch
 * templates with Amazon EKS, see <a
 * href="https://docs.aws.amazon.com/eks/latest/userguide/launch-templates.html">Launch template support</a> in the
 * Amazon EKS User Guide.
 * </p>
 * <p>
 * Specify either <code>name</code> or <code>id</code>, but not both.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/LaunchTemplateSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the launch template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the launch template to use. If no version is specified, then the template's default version is
     * used.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The ID of the launch template.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * 
     * @param name
     *        The name of the launch template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * 
     * @return The name of the launch template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * 
     * @param name
     *        The name of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateSpecification withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the launch template to use. If no version is specified, then the template's default version is
     * used.
     * </p>
     * 
     * @param version
     *        The version of the launch template to use. If no version is specified, then the template's default version
     *        is used.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the launch template to use. If no version is specified, then the template's default version is
     * used.
     * </p>
     * 
     * @return The version of the launch template to use. If no version is specified, then the template's default
     *         version is used.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the launch template to use. If no version is specified, then the template's default version is
     * used.
     * </p>
     * 
     * @param version
     *        The version of the launch template to use. If no version is specified, then the template's default version
     *        is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateSpecification withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     * 
     * @param id
     *        The ID of the launch template.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     * 
     * @return The ID of the launch template.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     * 
     * @param id
     *        The ID of the launch template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateSpecification withId(String id) {
        setId(id);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
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
        com.amazonaws.services.eks.model.transform.LaunchTemplateSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
