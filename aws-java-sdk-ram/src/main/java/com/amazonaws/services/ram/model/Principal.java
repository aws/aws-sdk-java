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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a principal for use with AWS Resource Access Manager.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/Principal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Principal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the principal.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     */
    private String resourceShareArn;
    /**
     * <p>
     * The time when the principal was associated with the resource share.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time when the association was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * Indicates whether the principal belongs to the same organization as the AWS account that owns the resource share.
     * </p>
     */
    private Boolean external;

    /**
     * <p>
     * The ID of the principal.
     * </p>
     * 
     * @param id
     *        The ID of the principal.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the principal.
     * </p>
     * 
     * @return The ID of the principal.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the principal.
     * </p>
     * 
     * @param id
     *        The ID of the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     * 
     * @param resourceShareArn
     *        The Amazon Resource Name (ARN) of the resource share.
     */

    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource share.
     */

    public String getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource share.
     * </p>
     * 
     * @param resourceShareArn
     *        The Amazon Resource Name (ARN) of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withResourceShareArn(String resourceShareArn) {
        setResourceShareArn(resourceShareArn);
        return this;
    }

    /**
     * <p>
     * The time when the principal was associated with the resource share.
     * </p>
     * 
     * @param creationTime
     *        The time when the principal was associated with the resource share.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the principal was associated with the resource share.
     * </p>
     * 
     * @return The time when the principal was associated with the resource share.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the principal was associated with the resource share.
     * </p>
     * 
     * @param creationTime
     *        The time when the principal was associated with the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time when the association was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the association was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the association was last updated.
     * </p>
     * 
     * @return The time when the association was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the association was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the association was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same organization as the AWS account that owns the resource share.
     * </p>
     * 
     * @param external
     *        Indicates whether the principal belongs to the same organization as the AWS account that owns the resource
     *        share.
     */

    public void setExternal(Boolean external) {
        this.external = external;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same organization as the AWS account that owns the resource share.
     * </p>
     * 
     * @return Indicates whether the principal belongs to the same organization as the AWS account that owns the
     *         resource share.
     */

    public Boolean getExternal() {
        return this.external;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same organization as the AWS account that owns the resource share.
     * </p>
     * 
     * @param external
     *        Indicates whether the principal belongs to the same organization as the AWS account that owns the resource
     *        share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Principal withExternal(Boolean external) {
        setExternal(external);
        return this;
    }

    /**
     * <p>
     * Indicates whether the principal belongs to the same organization as the AWS account that owns the resource share.
     * </p>
     * 
     * @return Indicates whether the principal belongs to the same organization as the AWS account that owns the
     *         resource share.
     */

    public Boolean isExternal() {
        return this.external;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getResourceShareArn() != null)
            sb.append("ResourceShareArn: ").append(getResourceShareArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getExternal() != null)
            sb.append("External: ").append(getExternal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Principal == false)
            return false;
        Principal other = (Principal) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getExternal() == null ^ this.getExternal() == null)
            return false;
        if (other.getExternal() != null && other.getExternal().equals(this.getExternal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getExternal() == null) ? 0 : getExternal().hashCode());
        return hashCode;
    }

    @Override
    public Principal clone() {
        try {
            return (Principal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ram.model.transform.PrincipalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
