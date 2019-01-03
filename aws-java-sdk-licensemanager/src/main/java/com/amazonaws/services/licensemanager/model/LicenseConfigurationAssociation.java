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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a server resource that is associated with a license configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/LicenseConfigurationAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseConfigurationAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the resource associated with the license configuration.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Type of server resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * ID of the AWS account that owns the resource consuming licenses.
     * </p>
     */
    private String resourceOwnerId;
    /**
     * <p>
     * Time when the license configuration was associated with the resource.
     * </p>
     */
    private java.util.Date associationTime;

    /**
     * <p>
     * ARN of the resource associated with the license configuration.
     * </p>
     * 
     * @param resourceArn
     *        ARN of the resource associated with the license configuration.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * ARN of the resource associated with the license configuration.
     * </p>
     * 
     * @return ARN of the resource associated with the license configuration.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * ARN of the resource associated with the license configuration.
     * </p>
     * 
     * @param resourceArn
     *        ARN of the resource associated with the license configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfigurationAssociation withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Type of server resource.
     * </p>
     * 
     * @param resourceType
     *        Type of server resource.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Type of server resource.
     * </p>
     * 
     * @return Type of server resource.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Type of server resource.
     * </p>
     * 
     * @param resourceType
     *        Type of server resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LicenseConfigurationAssociation withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Type of server resource.
     * </p>
     * 
     * @param resourceType
     *        Type of server resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LicenseConfigurationAssociation withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * ID of the AWS account that owns the resource consuming licenses.
     * </p>
     * 
     * @param resourceOwnerId
     *        ID of the AWS account that owns the resource consuming licenses.
     */

    public void setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
    }

    /**
     * <p>
     * ID of the AWS account that owns the resource consuming licenses.
     * </p>
     * 
     * @return ID of the AWS account that owns the resource consuming licenses.
     */

    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * <p>
     * ID of the AWS account that owns the resource consuming licenses.
     * </p>
     * 
     * @param resourceOwnerId
     *        ID of the AWS account that owns the resource consuming licenses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfigurationAssociation withResourceOwnerId(String resourceOwnerId) {
        setResourceOwnerId(resourceOwnerId);
        return this;
    }

    /**
     * <p>
     * Time when the license configuration was associated with the resource.
     * </p>
     * 
     * @param associationTime
     *        Time when the license configuration was associated with the resource.
     */

    public void setAssociationTime(java.util.Date associationTime) {
        this.associationTime = associationTime;
    }

    /**
     * <p>
     * Time when the license configuration was associated with the resource.
     * </p>
     * 
     * @return Time when the license configuration was associated with the resource.
     */

    public java.util.Date getAssociationTime() {
        return this.associationTime;
    }

    /**
     * <p>
     * Time when the license configuration was associated with the resource.
     * </p>
     * 
     * @param associationTime
     *        Time when the license configuration was associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConfigurationAssociation withAssociationTime(java.util.Date associationTime) {
        setAssociationTime(associationTime);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceOwnerId() != null)
            sb.append("ResourceOwnerId: ").append(getResourceOwnerId()).append(",");
        if (getAssociationTime() != null)
            sb.append("AssociationTime: ").append(getAssociationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LicenseConfigurationAssociation == false)
            return false;
        LicenseConfigurationAssociation other = (LicenseConfigurationAssociation) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceOwnerId() == null ^ this.getResourceOwnerId() == null)
            return false;
        if (other.getResourceOwnerId() != null && other.getResourceOwnerId().equals(this.getResourceOwnerId()) == false)
            return false;
        if (other.getAssociationTime() == null ^ this.getAssociationTime() == null)
            return false;
        if (other.getAssociationTime() != null && other.getAssociationTime().equals(this.getAssociationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceOwnerId() == null) ? 0 : getResourceOwnerId().hashCode());
        hashCode = prime * hashCode + ((getAssociationTime() == null) ? 0 : getAssociationTime().hashCode());
        return hashCode;
    }

    @Override
    public LicenseConfigurationAssociation clone() {
        try {
            return (LicenseConfigurationAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.LicenseConfigurationAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
