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
 * The resource used to provision CIDRs to a resource planning pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/IpamPoolSourceResourceRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamPoolSourceResourceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The source resource ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The source resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The source resource Region.
     * </p>
     */
    private String resourceRegion;
    /**
     * <p>
     * The source resource owner.
     * </p>
     */
    private String resourceOwner;

    /**
     * <p>
     * The source resource ID.
     * </p>
     * 
     * @param resourceId
     *        The source resource ID.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The source resource ID.
     * </p>
     * 
     * @return The source resource ID.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The source resource ID.
     * </p>
     * 
     * @param resourceId
     *        The source resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPoolSourceResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The source resource type.
     * </p>
     * 
     * @param resourceType
     *        The source resource type.
     * @see IpamPoolSourceResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The source resource type.
     * </p>
     * 
     * @return The source resource type.
     * @see IpamPoolSourceResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The source resource type.
     * </p>
     * 
     * @param resourceType
     *        The source resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPoolSourceResourceType
     */

    public IpamPoolSourceResourceRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The source resource type.
     * </p>
     * 
     * @param resourceType
     *        The source resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpamPoolSourceResourceType
     */

    public IpamPoolSourceResourceRequest withResourceType(IpamPoolSourceResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The source resource Region.
     * </p>
     * 
     * @param resourceRegion
     *        The source resource Region.
     */

    public void setResourceRegion(String resourceRegion) {
        this.resourceRegion = resourceRegion;
    }

    /**
     * <p>
     * The source resource Region.
     * </p>
     * 
     * @return The source resource Region.
     */

    public String getResourceRegion() {
        return this.resourceRegion;
    }

    /**
     * <p>
     * The source resource Region.
     * </p>
     * 
     * @param resourceRegion
     *        The source resource Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPoolSourceResourceRequest withResourceRegion(String resourceRegion) {
        setResourceRegion(resourceRegion);
        return this;
    }

    /**
     * <p>
     * The source resource owner.
     * </p>
     * 
     * @param resourceOwner
     *        The source resource owner.
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * The source resource owner.
     * </p>
     * 
     * @return The source resource owner.
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * The source resource owner.
     * </p>
     * 
     * @param resourceOwner
     *        The source resource owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpamPoolSourceResourceRequest withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceRegion() != null)
            sb.append("ResourceRegion: ").append(getResourceRegion()).append(",");
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: ").append(getResourceOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpamPoolSourceResourceRequest == false)
            return false;
        IpamPoolSourceResourceRequest other = (IpamPoolSourceResourceRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceRegion() == null ^ this.getResourceRegion() == null)
            return false;
        if (other.getResourceRegion() != null && other.getResourceRegion().equals(this.getResourceRegion()) == false)
            return false;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceRegion() == null) ? 0 : getResourceRegion().hashCode());
        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        return hashCode;
    }

    @Override
    public IpamPoolSourceResourceRequest clone() {
        try {
            return (IpamPoolSourceResourceRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
