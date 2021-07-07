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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains an access policy that defines an identity's access to an IoT SiteWise Monitor resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/AccessPolicySummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessPolicySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identity (an Amazon Web Services SSO user, an Amazon Web Services SSO group, or an IAM user).
     * </p>
     */
    private Identity identity;
    /**
     * <p>
     * The IoT SiteWise Monitor resource (a portal or project).
     * </p>
     */
    private Resource resource;
    /**
     * <p>
     * The permissions for the access policy. Note that a project <code>ADMINISTRATOR</code> is also known as a project
     * owner.
     * </p>
     */
    private String permission;
    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date lastUpdateDate;

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * 
     * @param id
     *        The ID of the access policy.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * 
     * @return The ID of the access policy.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the access policy.
     * </p>
     * 
     * @param id
     *        The ID of the access policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPolicySummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identity (an Amazon Web Services SSO user, an Amazon Web Services SSO group, or an IAM user).
     * </p>
     * 
     * @param identity
     *        The identity (an Amazon Web Services SSO user, an Amazon Web Services SSO group, or an IAM user).
     */

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The identity (an Amazon Web Services SSO user, an Amazon Web Services SSO group, or an IAM user).
     * </p>
     * 
     * @return The identity (an Amazon Web Services SSO user, an Amazon Web Services SSO group, or an IAM user).
     */

    public Identity getIdentity() {
        return this.identity;
    }

    /**
     * <p>
     * The identity (an Amazon Web Services SSO user, an Amazon Web Services SSO group, or an IAM user).
     * </p>
     * 
     * @param identity
     *        The identity (an Amazon Web Services SSO user, an Amazon Web Services SSO group, or an IAM user).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPolicySummary withIdentity(Identity identity) {
        setIdentity(identity);
        return this;
    }

    /**
     * <p>
     * The IoT SiteWise Monitor resource (a portal or project).
     * </p>
     * 
     * @param resource
     *        The IoT SiteWise Monitor resource (a portal or project).
     */

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The IoT SiteWise Monitor resource (a portal or project).
     * </p>
     * 
     * @return The IoT SiteWise Monitor resource (a portal or project).
     */

    public Resource getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The IoT SiteWise Monitor resource (a portal or project).
     * </p>
     * 
     * @param resource
     *        The IoT SiteWise Monitor resource (a portal or project).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPolicySummary withResource(Resource resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The permissions for the access policy. Note that a project <code>ADMINISTRATOR</code> is also known as a project
     * owner.
     * </p>
     * 
     * @param permission
     *        The permissions for the access policy. Note that a project <code>ADMINISTRATOR</code> is also known as a
     *        project owner.
     * @see Permission
     */

    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * <p>
     * The permissions for the access policy. Note that a project <code>ADMINISTRATOR</code> is also known as a project
     * owner.
     * </p>
     * 
     * @return The permissions for the access policy. Note that a project <code>ADMINISTRATOR</code> is also known as a
     *         project owner.
     * @see Permission
     */

    public String getPermission() {
        return this.permission;
    }

    /**
     * <p>
     * The permissions for the access policy. Note that a project <code>ADMINISTRATOR</code> is also known as a project
     * owner.
     * </p>
     * 
     * @param permission
     *        The permissions for the access policy. Note that a project <code>ADMINISTRATOR</code> is also known as a
     *        project owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public AccessPolicySummary withPermission(String permission) {
        setPermission(permission);
        return this;
    }

    /**
     * <p>
     * The permissions for the access policy. Note that a project <code>ADMINISTRATOR</code> is also known as a project
     * owner.
     * </p>
     * 
     * @param permission
     *        The permissions for the access policy. Note that a project <code>ADMINISTRATOR</code> is also known as a
     *        project owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public AccessPolicySummary withPermission(Permission permission) {
        this.permission = permission.toString();
        return this;
    }

    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     * 
     * @param creationDate
     *        The date the access policy was created, in Unix epoch time.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     * 
     * @return The date the access policy was created, in Unix epoch time.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the access policy was created, in Unix epoch time.
     * </p>
     * 
     * @param creationDate
     *        The date the access policy was created, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPolicySummary withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the access policy was last updated, in Unix epoch time.
     */

    public void setLastUpdateDate(java.util.Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the access policy was last updated, in Unix epoch time.
     */

    public java.util.Date getLastUpdateDate() {
        return this.lastUpdateDate;
    }

    /**
     * <p>
     * The date the access policy was last updated, in Unix epoch time.
     * </p>
     * 
     * @param lastUpdateDate
     *        The date the access policy was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPolicySummary withLastUpdateDate(java.util.Date lastUpdateDate) {
        setLastUpdateDate(lastUpdateDate);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIdentity() != null)
            sb.append("Identity: ").append(getIdentity()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getPermission() != null)
            sb.append("Permission: ").append(getPermission()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastUpdateDate() != null)
            sb.append("LastUpdateDate: ").append(getLastUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessPolicySummary == false)
            return false;
        AccessPolicySummary other = (AccessPolicySummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getPermission() == null ^ this.getPermission() == null)
            return false;
        if (other.getPermission() != null && other.getPermission().equals(this.getPermission()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastUpdateDate() == null ^ this.getLastUpdateDate() == null)
            return false;
        if (other.getLastUpdateDate() != null && other.getLastUpdateDate().equals(this.getLastUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getPermission() == null) ? 0 : getPermission().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public AccessPolicySummary clone() {
        try {
            return (AccessPolicySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AccessPolicySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
