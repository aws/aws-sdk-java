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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing information about an Lake Formation resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ResourceInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The IAM role that registered a resource.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The date and time the resource was last modified.
     * </p>
     */
    private java.util.Date lastModified;
    /**
     * <p>
     * Whether or not the resource is a federated resource.
     * </p>
     */
    private Boolean withFederation;
    /**
     * <p>
     * Indicates whether the data access of tables pointing to the location can be managed by both Lake Formation
     * permissions as well as Amazon S3 bucket policies.
     * </p>
     */
    private Boolean hybridAccessEnabled;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInfo withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The IAM role that registered a resource.
     * </p>
     * 
     * @param roleArn
     *        The IAM role that registered a resource.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role that registered a resource.
     * </p>
     * 
     * @return The IAM role that registered a resource.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role that registered a resource.
     * </p>
     * 
     * @param roleArn
     *        The IAM role that registered a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInfo withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The date and time the resource was last modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time the resource was last modified.
     */

    public void setLastModified(java.util.Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time the resource was last modified.
     * </p>
     * 
     * @return The date and time the resource was last modified.
     */

    public java.util.Date getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time the resource was last modified.
     * </p>
     * 
     * @param lastModified
     *        The date and time the resource was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInfo withLastModified(java.util.Date lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * Whether or not the resource is a federated resource.
     * </p>
     * 
     * @param withFederation
     *        Whether or not the resource is a federated resource.
     */

    public void setWithFederation(Boolean withFederation) {
        this.withFederation = withFederation;
    }

    /**
     * <p>
     * Whether or not the resource is a federated resource.
     * </p>
     * 
     * @return Whether or not the resource is a federated resource.
     */

    public Boolean getWithFederation() {
        return this.withFederation;
    }

    /**
     * <p>
     * Whether or not the resource is a federated resource.
     * </p>
     * 
     * @param withFederation
     *        Whether or not the resource is a federated resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInfo withWithFederation(Boolean withFederation) {
        setWithFederation(withFederation);
        return this;
    }

    /**
     * <p>
     * Whether or not the resource is a federated resource.
     * </p>
     * 
     * @return Whether or not the resource is a federated resource.
     */

    public Boolean isWithFederation() {
        return this.withFederation;
    }

    /**
     * <p>
     * Indicates whether the data access of tables pointing to the location can be managed by both Lake Formation
     * permissions as well as Amazon S3 bucket policies.
     * </p>
     * 
     * @param hybridAccessEnabled
     *        Indicates whether the data access of tables pointing to the location can be managed by both Lake Formation
     *        permissions as well as Amazon S3 bucket policies.
     */

    public void setHybridAccessEnabled(Boolean hybridAccessEnabled) {
        this.hybridAccessEnabled = hybridAccessEnabled;
    }

    /**
     * <p>
     * Indicates whether the data access of tables pointing to the location can be managed by both Lake Formation
     * permissions as well as Amazon S3 bucket policies.
     * </p>
     * 
     * @return Indicates whether the data access of tables pointing to the location can be managed by both Lake
     *         Formation permissions as well as Amazon S3 bucket policies.
     */

    public Boolean getHybridAccessEnabled() {
        return this.hybridAccessEnabled;
    }

    /**
     * <p>
     * Indicates whether the data access of tables pointing to the location can be managed by both Lake Formation
     * permissions as well as Amazon S3 bucket policies.
     * </p>
     * 
     * @param hybridAccessEnabled
     *        Indicates whether the data access of tables pointing to the location can be managed by both Lake Formation
     *        permissions as well as Amazon S3 bucket policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceInfo withHybridAccessEnabled(Boolean hybridAccessEnabled) {
        setHybridAccessEnabled(hybridAccessEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the data access of tables pointing to the location can be managed by both Lake Formation
     * permissions as well as Amazon S3 bucket policies.
     * </p>
     * 
     * @return Indicates whether the data access of tables pointing to the location can be managed by both Lake
     *         Formation permissions as well as Amazon S3 bucket policies.
     */

    public Boolean isHybridAccessEnabled() {
        return this.hybridAccessEnabled;
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getWithFederation() != null)
            sb.append("WithFederation: ").append(getWithFederation()).append(",");
        if (getHybridAccessEnabled() != null)
            sb.append("HybridAccessEnabled: ").append(getHybridAccessEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceInfo == false)
            return false;
        ResourceInfo other = (ResourceInfo) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getWithFederation() == null ^ this.getWithFederation() == null)
            return false;
        if (other.getWithFederation() != null && other.getWithFederation().equals(this.getWithFederation()) == false)
            return false;
        if (other.getHybridAccessEnabled() == null ^ this.getHybridAccessEnabled() == null)
            return false;
        if (other.getHybridAccessEnabled() != null && other.getHybridAccessEnabled().equals(this.getHybridAccessEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getWithFederation() == null) ? 0 : getWithFederation().hashCode());
        hashCode = prime * hashCode + ((getHybridAccessEnabled() == null) ? 0 : getHybridAccessEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ResourceInfo clone() {
        try {
            return (ResourceInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.ResourceInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
