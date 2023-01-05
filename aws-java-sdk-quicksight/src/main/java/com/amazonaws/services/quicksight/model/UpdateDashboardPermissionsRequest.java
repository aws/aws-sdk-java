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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboardPermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDashboardPermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the dashboard whose permissions you're updating.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * The permissions that you want to grant on this resource.
     * </p>
     */
    private java.util.List<ResourcePermission> grantPermissions;
    /**
     * <p>
     * The permissions that you want to revoke from this resource.
     * </p>
     */
    private java.util.List<ResourcePermission> revokePermissions;
    /**
     * <p>
     * Grants link permissions to all users in a defined namespace.
     * </p>
     */
    private java.util.List<ResourcePermission> grantLinkPermissions;
    /**
     * <p>
     * Revokes link permissions from all users in a defined namespace.
     * </p>
     */
    private java.util.List<ResourcePermission> revokeLinkPermissions;

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the dashboard whose permissions you're updating.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the dashboard whose permissions you're updating.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the dashboard whose permissions you're updating.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that contains the dashboard whose permissions you're updating.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that contains the dashboard whose permissions you're updating.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that contains the dashboard whose permissions you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @return The ID for the dashboard.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsRequest withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * The permissions that you want to grant on this resource.
     * </p>
     * 
     * @return The permissions that you want to grant on this resource.
     */

    public java.util.List<ResourcePermission> getGrantPermissions() {
        return grantPermissions;
    }

    /**
     * <p>
     * The permissions that you want to grant on this resource.
     * </p>
     * 
     * @param grantPermissions
     *        The permissions that you want to grant on this resource.
     */

    public void setGrantPermissions(java.util.Collection<ResourcePermission> grantPermissions) {
        if (grantPermissions == null) {
            this.grantPermissions = null;
            return;
        }

        this.grantPermissions = new java.util.ArrayList<ResourcePermission>(grantPermissions);
    }

    /**
     * <p>
     * The permissions that you want to grant on this resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGrantPermissions(java.util.Collection)} or {@link #withGrantPermissions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param grantPermissions
     *        The permissions that you want to grant on this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsRequest withGrantPermissions(ResourcePermission... grantPermissions) {
        if (this.grantPermissions == null) {
            setGrantPermissions(new java.util.ArrayList<ResourcePermission>(grantPermissions.length));
        }
        for (ResourcePermission ele : grantPermissions) {
            this.grantPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permissions that you want to grant on this resource.
     * </p>
     * 
     * @param grantPermissions
     *        The permissions that you want to grant on this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsRequest withGrantPermissions(java.util.Collection<ResourcePermission> grantPermissions) {
        setGrantPermissions(grantPermissions);
        return this;
    }

    /**
     * <p>
     * The permissions that you want to revoke from this resource.
     * </p>
     * 
     * @return The permissions that you want to revoke from this resource.
     */

    public java.util.List<ResourcePermission> getRevokePermissions() {
        return revokePermissions;
    }

    /**
     * <p>
     * The permissions that you want to revoke from this resource.
     * </p>
     * 
     * @param revokePermissions
     *        The permissions that you want to revoke from this resource.
     */

    public void setRevokePermissions(java.util.Collection<ResourcePermission> revokePermissions) {
        if (revokePermissions == null) {
            this.revokePermissions = null;
            return;
        }

        this.revokePermissions = new java.util.ArrayList<ResourcePermission>(revokePermissions);
    }

    /**
     * <p>
     * The permissions that you want to revoke from this resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevokePermissions(java.util.Collection)} or {@link #withRevokePermissions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param revokePermissions
     *        The permissions that you want to revoke from this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsRequest withRevokePermissions(ResourcePermission... revokePermissions) {
        if (this.revokePermissions == null) {
            setRevokePermissions(new java.util.ArrayList<ResourcePermission>(revokePermissions.length));
        }
        for (ResourcePermission ele : revokePermissions) {
            this.revokePermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permissions that you want to revoke from this resource.
     * </p>
     * 
     * @param revokePermissions
     *        The permissions that you want to revoke from this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsRequest withRevokePermissions(java.util.Collection<ResourcePermission> revokePermissions) {
        setRevokePermissions(revokePermissions);
        return this;
    }

    /**
     * <p>
     * Grants link permissions to all users in a defined namespace.
     * </p>
     * 
     * @return Grants link permissions to all users in a defined namespace.
     */

    public java.util.List<ResourcePermission> getGrantLinkPermissions() {
        return grantLinkPermissions;
    }

    /**
     * <p>
     * Grants link permissions to all users in a defined namespace.
     * </p>
     * 
     * @param grantLinkPermissions
     *        Grants link permissions to all users in a defined namespace.
     */

    public void setGrantLinkPermissions(java.util.Collection<ResourcePermission> grantLinkPermissions) {
        if (grantLinkPermissions == null) {
            this.grantLinkPermissions = null;
            return;
        }

        this.grantLinkPermissions = new java.util.ArrayList<ResourcePermission>(grantLinkPermissions);
    }

    /**
     * <p>
     * Grants link permissions to all users in a defined namespace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGrantLinkPermissions(java.util.Collection)} or {@link #withGrantLinkPermissions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param grantLinkPermissions
     *        Grants link permissions to all users in a defined namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsRequest withGrantLinkPermissions(ResourcePermission... grantLinkPermissions) {
        if (this.grantLinkPermissions == null) {
            setGrantLinkPermissions(new java.util.ArrayList<ResourcePermission>(grantLinkPermissions.length));
        }
        for (ResourcePermission ele : grantLinkPermissions) {
            this.grantLinkPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Grants link permissions to all users in a defined namespace.
     * </p>
     * 
     * @param grantLinkPermissions
     *        Grants link permissions to all users in a defined namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsRequest withGrantLinkPermissions(java.util.Collection<ResourcePermission> grantLinkPermissions) {
        setGrantLinkPermissions(grantLinkPermissions);
        return this;
    }

    /**
     * <p>
     * Revokes link permissions from all users in a defined namespace.
     * </p>
     * 
     * @return Revokes link permissions from all users in a defined namespace.
     */

    public java.util.List<ResourcePermission> getRevokeLinkPermissions() {
        return revokeLinkPermissions;
    }

    /**
     * <p>
     * Revokes link permissions from all users in a defined namespace.
     * </p>
     * 
     * @param revokeLinkPermissions
     *        Revokes link permissions from all users in a defined namespace.
     */

    public void setRevokeLinkPermissions(java.util.Collection<ResourcePermission> revokeLinkPermissions) {
        if (revokeLinkPermissions == null) {
            this.revokeLinkPermissions = null;
            return;
        }

        this.revokeLinkPermissions = new java.util.ArrayList<ResourcePermission>(revokeLinkPermissions);
    }

    /**
     * <p>
     * Revokes link permissions from all users in a defined namespace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevokeLinkPermissions(java.util.Collection)} or
     * {@link #withRevokeLinkPermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param revokeLinkPermissions
     *        Revokes link permissions from all users in a defined namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsRequest withRevokeLinkPermissions(ResourcePermission... revokeLinkPermissions) {
        if (this.revokeLinkPermissions == null) {
            setRevokeLinkPermissions(new java.util.ArrayList<ResourcePermission>(revokeLinkPermissions.length));
        }
        for (ResourcePermission ele : revokeLinkPermissions) {
            this.revokeLinkPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Revokes link permissions from all users in a defined namespace.
     * </p>
     * 
     * @param revokeLinkPermissions
     *        Revokes link permissions from all users in a defined namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardPermissionsRequest withRevokeLinkPermissions(java.util.Collection<ResourcePermission> revokeLinkPermissions) {
        setRevokeLinkPermissions(revokeLinkPermissions);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getDashboardId() != null)
            sb.append("DashboardId: ").append(getDashboardId()).append(",");
        if (getGrantPermissions() != null)
            sb.append("GrantPermissions: ").append(getGrantPermissions()).append(",");
        if (getRevokePermissions() != null)
            sb.append("RevokePermissions: ").append(getRevokePermissions()).append(",");
        if (getGrantLinkPermissions() != null)
            sb.append("GrantLinkPermissions: ").append(getGrantLinkPermissions()).append(",");
        if (getRevokeLinkPermissions() != null)
            sb.append("RevokeLinkPermissions: ").append(getRevokeLinkPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDashboardPermissionsRequest == false)
            return false;
        UpdateDashboardPermissionsRequest other = (UpdateDashboardPermissionsRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getGrantPermissions() == null ^ this.getGrantPermissions() == null)
            return false;
        if (other.getGrantPermissions() != null && other.getGrantPermissions().equals(this.getGrantPermissions()) == false)
            return false;
        if (other.getRevokePermissions() == null ^ this.getRevokePermissions() == null)
            return false;
        if (other.getRevokePermissions() != null && other.getRevokePermissions().equals(this.getRevokePermissions()) == false)
            return false;
        if (other.getGrantLinkPermissions() == null ^ this.getGrantLinkPermissions() == null)
            return false;
        if (other.getGrantLinkPermissions() != null && other.getGrantLinkPermissions().equals(this.getGrantLinkPermissions()) == false)
            return false;
        if (other.getRevokeLinkPermissions() == null ^ this.getRevokeLinkPermissions() == null)
            return false;
        if (other.getRevokeLinkPermissions() != null && other.getRevokeLinkPermissions().equals(this.getRevokeLinkPermissions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getGrantPermissions() == null) ? 0 : getGrantPermissions().hashCode());
        hashCode = prime * hashCode + ((getRevokePermissions() == null) ? 0 : getRevokePermissions().hashCode());
        hashCode = prime * hashCode + ((getGrantLinkPermissions() == null) ? 0 : getGrantLinkPermissions().hashCode());
        hashCode = prime * hashCode + ((getRevokeLinkPermissions() == null) ? 0 : getRevokeLinkPermissions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDashboardPermissionsRequest clone() {
        return (UpdateDashboardPermissionsRequest) super.clone();
    }

}
