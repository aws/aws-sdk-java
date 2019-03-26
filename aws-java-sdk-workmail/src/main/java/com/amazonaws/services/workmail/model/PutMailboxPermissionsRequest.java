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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/PutMailboxPermissions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutMailboxPermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the organization under which the user, group, or resource exists.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The identifier of the user, group, or resource for which to update mailbox permissions.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The identifier of the user, group, or resource to which to grant the permissions.
     * </p>
     */
    private String granteeId;
    /**
     * <p>
     * The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the mailbox (the
     * grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on behalf of the owner
     * of the mailbox (the grantee is not mentioned as the physical sender of these emails). FULL_ACCESS allows the
     * grantee full access to the mailbox, irrespective of other folder-level permissions set on the mailbox.
     * </p>
     */
    private java.util.List<String> permissionValues;

    /**
     * <p>
     * The identifier of the organization under which the user, group, or resource exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier of the organization under which the user, group, or resource exists.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier of the organization under which the user, group, or resource exists.
     * </p>
     * 
     * @return The identifier of the organization under which the user, group, or resource exists.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier of the organization under which the user, group, or resource exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier of the organization under which the user, group, or resource exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMailboxPermissionsRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the user, group, or resource for which to update mailbox permissions.
     * </p>
     * 
     * @param entityId
     *        The identifier of the user, group, or resource for which to update mailbox permissions.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier of the user, group, or resource for which to update mailbox permissions.
     * </p>
     * 
     * @return The identifier of the user, group, or resource for which to update mailbox permissions.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The identifier of the user, group, or resource for which to update mailbox permissions.
     * </p>
     * 
     * @param entityId
     *        The identifier of the user, group, or resource for which to update mailbox permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMailboxPermissionsRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The identifier of the user, group, or resource to which to grant the permissions.
     * </p>
     * 
     * @param granteeId
     *        The identifier of the user, group, or resource to which to grant the permissions.
     */

    public void setGranteeId(String granteeId) {
        this.granteeId = granteeId;
    }

    /**
     * <p>
     * The identifier of the user, group, or resource to which to grant the permissions.
     * </p>
     * 
     * @return The identifier of the user, group, or resource to which to grant the permissions.
     */

    public String getGranteeId() {
        return this.granteeId;
    }

    /**
     * <p>
     * The identifier of the user, group, or resource to which to grant the permissions.
     * </p>
     * 
     * @param granteeId
     *        The identifier of the user, group, or resource to which to grant the permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMailboxPermissionsRequest withGranteeId(String granteeId) {
        setGranteeId(granteeId);
        return this;
    }

    /**
     * <p>
     * The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the mailbox (the
     * grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on behalf of the owner
     * of the mailbox (the grantee is not mentioned as the physical sender of these emails). FULL_ACCESS allows the
     * grantee full access to the mailbox, irrespective of other folder-level permissions set on the mailbox.
     * </p>
     * 
     * @return The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the
     *         mailbox (the grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email
     *         on behalf of the owner of the mailbox (the grantee is not mentioned as the physical sender of these
     *         emails). FULL_ACCESS allows the grantee full access to the mailbox, irrespective of other folder-level
     *         permissions set on the mailbox.
     * @see PermissionType
     */

    public java.util.List<String> getPermissionValues() {
        return permissionValues;
    }

    /**
     * <p>
     * The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the mailbox (the
     * grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on behalf of the owner
     * of the mailbox (the grantee is not mentioned as the physical sender of these emails). FULL_ACCESS allows the
     * grantee full access to the mailbox, irrespective of other folder-level permissions set on the mailbox.
     * </p>
     * 
     * @param permissionValues
     *        The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the
     *        mailbox (the grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on
     *        behalf of the owner of the mailbox (the grantee is not mentioned as the physical sender of these emails).
     *        FULL_ACCESS allows the grantee full access to the mailbox, irrespective of other folder-level permissions
     *        set on the mailbox.
     * @see PermissionType
     */

    public void setPermissionValues(java.util.Collection<String> permissionValues) {
        if (permissionValues == null) {
            this.permissionValues = null;
            return;
        }

        this.permissionValues = new java.util.ArrayList<String>(permissionValues);
    }

    /**
     * <p>
     * The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the mailbox (the
     * grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on behalf of the owner
     * of the mailbox (the grantee is not mentioned as the physical sender of these emails). FULL_ACCESS allows the
     * grantee full access to the mailbox, irrespective of other folder-level permissions set on the mailbox.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissionValues(java.util.Collection)} or {@link #withPermissionValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param permissionValues
     *        The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the
     *        mailbox (the grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on
     *        behalf of the owner of the mailbox (the grantee is not mentioned as the physical sender of these emails).
     *        FULL_ACCESS allows the grantee full access to the mailbox, irrespective of other folder-level permissions
     *        set on the mailbox.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public PutMailboxPermissionsRequest withPermissionValues(String... permissionValues) {
        if (this.permissionValues == null) {
            setPermissionValues(new java.util.ArrayList<String>(permissionValues.length));
        }
        for (String ele : permissionValues) {
            this.permissionValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the mailbox (the
     * grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on behalf of the owner
     * of the mailbox (the grantee is not mentioned as the physical sender of these emails). FULL_ACCESS allows the
     * grantee full access to the mailbox, irrespective of other folder-level permissions set on the mailbox.
     * </p>
     * 
     * @param permissionValues
     *        The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the
     *        mailbox (the grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on
     *        behalf of the owner of the mailbox (the grantee is not mentioned as the physical sender of these emails).
     *        FULL_ACCESS allows the grantee full access to the mailbox, irrespective of other folder-level permissions
     *        set on the mailbox.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public PutMailboxPermissionsRequest withPermissionValues(java.util.Collection<String> permissionValues) {
        setPermissionValues(permissionValues);
        return this;
    }

    /**
     * <p>
     * The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the mailbox (the
     * grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on behalf of the owner
     * of the mailbox (the grantee is not mentioned as the physical sender of these emails). FULL_ACCESS allows the
     * grantee full access to the mailbox, irrespective of other folder-level permissions set on the mailbox.
     * </p>
     * 
     * @param permissionValues
     *        The permissions granted to the grantee. SEND_AS allows the grantee to send email as the owner of the
     *        mailbox (the grantee is not mentioned on these emails). SEND_ON_BEHALF allows the grantee to send email on
     *        behalf of the owner of the mailbox (the grantee is not mentioned as the physical sender of these emails).
     *        FULL_ACCESS allows the grantee full access to the mailbox, irrespective of other folder-level permissions
     *        set on the mailbox.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public PutMailboxPermissionsRequest withPermissionValues(PermissionType... permissionValues) {
        java.util.ArrayList<String> permissionValuesCopy = new java.util.ArrayList<String>(permissionValues.length);
        for (PermissionType value : permissionValues) {
            permissionValuesCopy.add(value.toString());
        }
        if (getPermissionValues() == null) {
            setPermissionValues(permissionValuesCopy);
        } else {
            getPermissionValues().addAll(permissionValuesCopy);
        }
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
            sb.append("GranteeId: ").append(getGranteeId()).append(",");
        if (getPermissionValues() != null)
            sb.append("PermissionValues: ").append(getPermissionValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMailboxPermissionsRequest == false)
            return false;
        PutMailboxPermissionsRequest other = (PutMailboxPermissionsRequest) obj;
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
        if (other.getPermissionValues() == null ^ this.getPermissionValues() == null)
            return false;
        if (other.getPermissionValues() != null && other.getPermissionValues().equals(this.getPermissionValues()) == false)
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
        hashCode = prime * hashCode + ((getPermissionValues() == null) ? 0 : getPermissionValues().hashCode());
        return hashCode;
    }

    @Override
    public PutMailboxPermissionsRequest clone() {
        return (PutMailboxPermissionsRequest) super.clone();
    }

}
