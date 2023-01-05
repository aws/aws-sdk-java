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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a launch permission.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchPermission implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String group;
    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * <p>
     * Constraints: Up to 10 000 account IDs can be specified in a single request.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organization.
     * </p>
     */
    private String organizationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organizational unit (OU).
     * </p>
     */
    private String organizationalUnitArn;

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param group
     *        The name of the group.
     * @see PermissionGroup
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     * @see PermissionGroup
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param group
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionGroup
     */

    public LaunchPermission withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param group
     *        The name of the group.
     * @see PermissionGroup
     */

    public void setGroup(PermissionGroup group) {
        withGroup(group);
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param group
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionGroup
     */

    public LaunchPermission withGroup(PermissionGroup group) {
        this.group = group.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * <p>
     * Constraints: Up to 10 000 account IDs can be specified in a single request.
     * </p>
     * 
     * @param userId
     *        The Amazon Web Services account ID.</p>
     *        <p>
     *        Constraints: Up to 10 000 account IDs can be specified in a single request.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * <p>
     * Constraints: Up to 10 000 account IDs can be specified in a single request.
     * </p>
     * 
     * @return The Amazon Web Services account ID.</p>
     *         <p>
     *         Constraints: Up to 10 000 account IDs can be specified in a single request.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID.
     * </p>
     * <p>
     * Constraints: Up to 10 000 account IDs can be specified in a single request.
     * </p>
     * 
     * @param userId
     *        The Amazon Web Services account ID.</p>
     *        <p>
     *        Constraints: Up to 10 000 account IDs can be specified in a single request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermission withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organization.
     * </p>
     * 
     * @param organizationArn
     *        The Amazon Resource Name (ARN) of an organization.
     */

    public void setOrganizationArn(String organizationArn) {
        this.organizationArn = organizationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organization.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an organization.
     */

    public String getOrganizationArn() {
        return this.organizationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organization.
     * </p>
     * 
     * @param organizationArn
     *        The Amazon Resource Name (ARN) of an organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermission withOrganizationArn(String organizationArn) {
        setOrganizationArn(organizationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organizational unit (OU).
     * </p>
     * 
     * @param organizationalUnitArn
     *        The Amazon Resource Name (ARN) of an organizational unit (OU).
     */

    public void setOrganizationalUnitArn(String organizationalUnitArn) {
        this.organizationalUnitArn = organizationalUnitArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organizational unit (OU).
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an organizational unit (OU).
     */

    public String getOrganizationalUnitArn() {
        return this.organizationalUnitArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an organizational unit (OU).
     * </p>
     * 
     * @param organizationalUnitArn
     *        The Amazon Resource Name (ARN) of an organizational unit (OU).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchPermission withOrganizationalUnitArn(String organizationalUnitArn) {
        setOrganizationalUnitArn(organizationalUnitArn);
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
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getOrganizationArn() != null)
            sb.append("OrganizationArn: ").append(getOrganizationArn()).append(",");
        if (getOrganizationalUnitArn() != null)
            sb.append("OrganizationalUnitArn: ").append(getOrganizationalUnitArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchPermission == false)
            return false;
        LaunchPermission other = (LaunchPermission) obj;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getOrganizationArn() == null ^ this.getOrganizationArn() == null)
            return false;
        if (other.getOrganizationArn() != null && other.getOrganizationArn().equals(this.getOrganizationArn()) == false)
            return false;
        if (other.getOrganizationalUnitArn() == null ^ this.getOrganizationalUnitArn() == null)
            return false;
        if (other.getOrganizationalUnitArn() != null && other.getOrganizationalUnitArn().equals(this.getOrganizationalUnitArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getOrganizationArn() == null) ? 0 : getOrganizationArn().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitArn() == null) ? 0 : getOrganizationalUnitArn().hashCode());
        return hashCode;
    }

    @Override
    public LaunchPermission clone() {
        try {
            return (LaunchPermission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
