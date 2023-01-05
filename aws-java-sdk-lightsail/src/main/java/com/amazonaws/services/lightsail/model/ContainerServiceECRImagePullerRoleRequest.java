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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a request to activate or deactivate the role that you can use to grant an Amazon Lightsail container
 * service access to Amazon Elastic Container Registry (Amazon ECR) private repositories.
 * </p>
 * <p>
 * When activated, Lightsail creates an Identity and Access Management (IAM) role for the specified Lightsail container
 * service. You can use the ARN of the role to create a trust relationship between your Lightsail container service and
 * an Amazon ECR private repository in your Amazon Web Services account. This allows your container service to pull
 * images from Amazon ECR private repositories. For more information, see <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-container-service-ecr-private-repo-access"
 * >Configuring access to an Amazon ECR private repository for an Amazon Lightsail container service</a> in the
 * <i>Amazon Lightsail Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ContainerServiceECRImagePullerRoleRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerServiceECRImagePullerRoleRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean value that indicates whether to activate the role.
     * </p>
     */
    private Boolean isActive;

    /**
     * <p>
     * A Boolean value that indicates whether to activate the role.
     * </p>
     * 
     * @param isActive
     *        A Boolean value that indicates whether to activate the role.
     */

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to activate the role.
     * </p>
     * 
     * @return A Boolean value that indicates whether to activate the role.
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to activate the role.
     * </p>
     * 
     * @param isActive
     *        A Boolean value that indicates whether to activate the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerServiceECRImagePullerRoleRequest withIsActive(Boolean isActive) {
        setIsActive(isActive);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to activate the role.
     * </p>
     * 
     * @return A Boolean value that indicates whether to activate the role.
     */

    public Boolean isActive() {
        return this.isActive;
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
        if (getIsActive() != null)
            sb.append("IsActive: ").append(getIsActive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerServiceECRImagePullerRoleRequest == false)
            return false;
        ContainerServiceECRImagePullerRoleRequest other = (ContainerServiceECRImagePullerRoleRequest) obj;
        if (other.getIsActive() == null ^ this.getIsActive() == null)
            return false;
        if (other.getIsActive() != null && other.getIsActive().equals(this.getIsActive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        return hashCode;
    }

    @Override
    public ContainerServiceECRImagePullerRoleRequest clone() {
        try {
            return (ContainerServiceECRImagePullerRoleRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ContainerServiceECRImagePullerRoleRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
