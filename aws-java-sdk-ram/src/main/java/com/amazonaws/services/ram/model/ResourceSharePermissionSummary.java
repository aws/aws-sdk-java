/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a permission that is associated with a resource share.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ResourceSharePermissionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceSharePermissionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the permission.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The identifier for the version of the permission.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The identifier for the version of the permission that is set as the default version.
     * </p>
     */
    private Boolean defaultVersion;
    /**
     * <p>
     * The name of the permission.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of resource to which the permission applies.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The current status of the permission.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time when the permission was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time when the permission was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The ARN of the permission.
     * </p>
     * 
     * @param arn
     *        The ARN of the permission.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the permission.
     * </p>
     * 
     * @return The ARN of the permission.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the permission.
     * </p>
     * 
     * @param arn
     *        The ARN of the permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The identifier for the version of the permission.
     * </p>
     * 
     * @param version
     *        The identifier for the version of the permission.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The identifier for the version of the permission.
     * </p>
     * 
     * @return The identifier for the version of the permission.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The identifier for the version of the permission.
     * </p>
     * 
     * @param version
     *        The identifier for the version of the permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionSummary withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The identifier for the version of the permission that is set as the default version.
     * </p>
     * 
     * @param defaultVersion
     *        The identifier for the version of the permission that is set as the default version.
     */

    public void setDefaultVersion(Boolean defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    /**
     * <p>
     * The identifier for the version of the permission that is set as the default version.
     * </p>
     * 
     * @return The identifier for the version of the permission that is set as the default version.
     */

    public Boolean getDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * <p>
     * The identifier for the version of the permission that is set as the default version.
     * </p>
     * 
     * @param defaultVersion
     *        The identifier for the version of the permission that is set as the default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionSummary withDefaultVersion(Boolean defaultVersion) {
        setDefaultVersion(defaultVersion);
        return this;
    }

    /**
     * <p>
     * The identifier for the version of the permission that is set as the default version.
     * </p>
     * 
     * @return The identifier for the version of the permission that is set as the default version.
     */

    public Boolean isDefaultVersion() {
        return this.defaultVersion;
    }

    /**
     * <p>
     * The name of the permission.
     * </p>
     * 
     * @param name
     *        The name of the permission.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the permission.
     * </p>
     * 
     * @return The name of the permission.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the permission.
     * </p>
     * 
     * @param name
     *        The name of the permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of resource to which the permission applies.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to which the permission applies.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource to which the permission applies.
     * </p>
     * 
     * @return The type of resource to which the permission applies.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource to which the permission applies.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to which the permission applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionSummary withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The current status of the permission.
     * </p>
     * 
     * @param status
     *        The current status of the permission.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the permission.
     * </p>
     * 
     * @return The current status of the permission.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the permission.
     * </p>
     * 
     * @param status
     *        The current status of the permission.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date and time when the permission was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time when the permission was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time when the permission was created.
     * </p>
     * 
     * @return The date and time when the permission was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time when the permission was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time when the permission was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the permission was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time when the permission was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the permission was last updated.
     * </p>
     * 
     * @return The date and time when the permission was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The date and time when the permission was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The date and time when the permission was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSharePermissionSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getDefaultVersion() != null)
            sb.append("DefaultVersion: ").append(getDefaultVersion()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceSharePermissionSummary == false)
            return false;
        ResourceSharePermissionSummary other = (ResourceSharePermissionSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getDefaultVersion() == null ^ this.getDefaultVersion() == null)
            return false;
        if (other.getDefaultVersion() != null && other.getDefaultVersion().equals(this.getDefaultVersion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getDefaultVersion() == null) ? 0 : getDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public ResourceSharePermissionSummary clone() {
        try {
            return (ResourceSharePermissionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ram.model.transform.ResourceSharePermissionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
