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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DeleteMailboxPermissions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMailboxPermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the organization under which the member (user or group) exists.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The identifier of the entity that owns the mailbox.
     * </p>
     * <p>
     * The identifier can be <i>UserId or Group Id</i>, <i>Username or Groupname</i>, or <i>email</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Entity ID: 12345678-1234-1234-1234-123456789012, r-0123456789a0123456789b0123456789, or
     * S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: entity@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * Entity name: entity
     * </p>
     * </li>
     * </ul>
     */
    private String entityId;
    /**
     * <p>
     * The identifier of the entity for which to delete granted permissions.
     * </p>
     * <p>
     * The identifier can be <i>UserId, ResourceID, or Group Id</i>, <i>Username or Groupname</i>, or <i>email</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Grantee ID: 12345678-1234-1234-1234-123456789012,r-0123456789a0123456789b0123456789, or
     * S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: grantee@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * Grantee name: grantee
     * </p>
     * </li>
     * </ul>
     */
    private String granteeId;

    /**
     * <p>
     * The identifier of the organization under which the member (user or group) exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier of the organization under which the member (user or group) exists.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier of the organization under which the member (user or group) exists.
     * </p>
     * 
     * @return The identifier of the organization under which the member (user or group) exists.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier of the organization under which the member (user or group) exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier of the organization under which the member (user or group) exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMailboxPermissionsRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the entity that owns the mailbox.
     * </p>
     * <p>
     * The identifier can be <i>UserId or Group Id</i>, <i>Username or Groupname</i>, or <i>email</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Entity ID: 12345678-1234-1234-1234-123456789012, r-0123456789a0123456789b0123456789, or
     * S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: entity@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * Entity name: entity
     * </p>
     * </li>
     * </ul>
     * 
     * @param entityId
     *        The identifier of the entity that owns the mailbox.</p>
     *        <p>
     *        The identifier can be <i>UserId or Group Id</i>, <i>Username or Groupname</i>, or <i>email</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Entity ID: 12345678-1234-1234-1234-123456789012, r-0123456789a0123456789b0123456789, or
     *        S-1-1-12-1234567890-123456789-123456789-1234
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Email address: entity@domain.tld
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Entity name: entity
     *        </p>
     *        </li>
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier of the entity that owns the mailbox.
     * </p>
     * <p>
     * The identifier can be <i>UserId or Group Id</i>, <i>Username or Groupname</i>, or <i>email</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Entity ID: 12345678-1234-1234-1234-123456789012, r-0123456789a0123456789b0123456789, or
     * S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: entity@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * Entity name: entity
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the entity that owns the mailbox.</p>
     *         <p>
     *         The identifier can be <i>UserId or Group Id</i>, <i>Username or Groupname</i>, or <i>email</i>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Entity ID: 12345678-1234-1234-1234-123456789012, r-0123456789a0123456789b0123456789, or
     *         S-1-1-12-1234567890-123456789-123456789-1234
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Email address: entity@domain.tld
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Entity name: entity
     *         </p>
     *         </li>
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The identifier of the entity that owns the mailbox.
     * </p>
     * <p>
     * The identifier can be <i>UserId or Group Id</i>, <i>Username or Groupname</i>, or <i>email</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Entity ID: 12345678-1234-1234-1234-123456789012, r-0123456789a0123456789b0123456789, or
     * S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: entity@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * Entity name: entity
     * </p>
     * </li>
     * </ul>
     * 
     * @param entityId
     *        The identifier of the entity that owns the mailbox.</p>
     *        <p>
     *        The identifier can be <i>UserId or Group Id</i>, <i>Username or Groupname</i>, or <i>email</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Entity ID: 12345678-1234-1234-1234-123456789012, r-0123456789a0123456789b0123456789, or
     *        S-1-1-12-1234567890-123456789-123456789-1234
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Email address: entity@domain.tld
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Entity name: entity
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMailboxPermissionsRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The identifier of the entity for which to delete granted permissions.
     * </p>
     * <p>
     * The identifier can be <i>UserId, ResourceID, or Group Id</i>, <i>Username or Groupname</i>, or <i>email</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Grantee ID: 12345678-1234-1234-1234-123456789012,r-0123456789a0123456789b0123456789, or
     * S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: grantee@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * Grantee name: grantee
     * </p>
     * </li>
     * </ul>
     * 
     * @param granteeId
     *        The identifier of the entity for which to delete granted permissions.</p>
     *        <p>
     *        The identifier can be <i>UserId, ResourceID, or Group Id</i>, <i>Username or Groupname</i>, or
     *        <i>email</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Grantee ID: 12345678-1234-1234-1234-123456789012,r-0123456789a0123456789b0123456789, or
     *        S-1-1-12-1234567890-123456789-123456789-1234
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Email address: grantee@domain.tld
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Grantee name: grantee
     *        </p>
     *        </li>
     */

    public void setGranteeId(String granteeId) {
        this.granteeId = granteeId;
    }

    /**
     * <p>
     * The identifier of the entity for which to delete granted permissions.
     * </p>
     * <p>
     * The identifier can be <i>UserId, ResourceID, or Group Id</i>, <i>Username or Groupname</i>, or <i>email</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Grantee ID: 12345678-1234-1234-1234-123456789012,r-0123456789a0123456789b0123456789, or
     * S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: grantee@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * Grantee name: grantee
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the entity for which to delete granted permissions.</p>
     *         <p>
     *         The identifier can be <i>UserId, ResourceID, or Group Id</i>, <i>Username or Groupname</i>, or
     *         <i>email</i>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Grantee ID: 12345678-1234-1234-1234-123456789012,r-0123456789a0123456789b0123456789, or
     *         S-1-1-12-1234567890-123456789-123456789-1234
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Email address: grantee@domain.tld
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Grantee name: grantee
     *         </p>
     *         </li>
     */

    public String getGranteeId() {
        return this.granteeId;
    }

    /**
     * <p>
     * The identifier of the entity for which to delete granted permissions.
     * </p>
     * <p>
     * The identifier can be <i>UserId, ResourceID, or Group Id</i>, <i>Username or Groupname</i>, or <i>email</i>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Grantee ID: 12345678-1234-1234-1234-123456789012,r-0123456789a0123456789b0123456789, or
     * S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: grantee@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * Grantee name: grantee
     * </p>
     * </li>
     * </ul>
     * 
     * @param granteeId
     *        The identifier of the entity for which to delete granted permissions.</p>
     *        <p>
     *        The identifier can be <i>UserId, ResourceID, or Group Id</i>, <i>Username or Groupname</i>, or
     *        <i>email</i>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Grantee ID: 12345678-1234-1234-1234-123456789012,r-0123456789a0123456789b0123456789, or
     *        S-1-1-12-1234567890-123456789-123456789-1234
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Email address: grantee@domain.tld
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Grantee name: grantee
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMailboxPermissionsRequest withGranteeId(String granteeId) {
        setGranteeId(granteeId);
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
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getGranteeId() != null)
            sb.append("GranteeId: ").append(getGranteeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMailboxPermissionsRequest == false)
            return false;
        DeleteMailboxPermissionsRequest other = (DeleteMailboxPermissionsRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getGranteeId() == null ^ this.getGranteeId() == null)
            return false;
        if (other.getGranteeId() != null && other.getGranteeId().equals(this.getGranteeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getGranteeId() == null) ? 0 : getGranteeId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMailboxPermissionsRequest clone() {
        return (DeleteMailboxPermissionsRequest) super.clone();
    }

}
