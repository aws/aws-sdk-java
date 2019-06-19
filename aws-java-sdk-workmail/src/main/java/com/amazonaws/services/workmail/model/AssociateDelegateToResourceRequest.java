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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/AssociateDelegateToResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateDelegateToResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The organization under which the resource exists.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The resource for which members (users or groups) are associated.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The member (user or group) to associate to the resource.
     * </p>
     */
    private String entityId;

    /**
     * <p>
     * The organization under which the resource exists.
     * </p>
     * 
     * @param organizationId
     *        The organization under which the resource exists.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The organization under which the resource exists.
     * </p>
     * 
     * @return The organization under which the resource exists.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The organization under which the resource exists.
     * </p>
     * 
     * @param organizationId
     *        The organization under which the resource exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDelegateToResourceRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The resource for which members (users or groups) are associated.
     * </p>
     * 
     * @param resourceId
     *        The resource for which members (users or groups) are associated.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource for which members (users or groups) are associated.
     * </p>
     * 
     * @return The resource for which members (users or groups) are associated.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource for which members (users or groups) are associated.
     * </p>
     * 
     * @param resourceId
     *        The resource for which members (users or groups) are associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDelegateToResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The member (user or group) to associate to the resource.
     * </p>
     * 
     * @param entityId
     *        The member (user or group) to associate to the resource.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The member (user or group) to associate to the resource.
     * </p>
     * 
     * @return The member (user or group) to associate to the resource.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The member (user or group) to associate to the resource.
     * </p>
     * 
     * @param entityId
     *        The member (user or group) to associate to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateDelegateToResourceRequest withEntityId(String entityId) {
        setEntityId(entityId);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateDelegateToResourceRequest == false)
            return false;
        AssociateDelegateToResourceRequest other = (AssociateDelegateToResourceRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateDelegateToResourceRequest clone() {
        return (AssociateDelegateToResourceRequest) super.clone();
    }

}
