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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that grants Amazon QuickSight access to your cluster and make a call to the
 * <code>redshift:GetClusterCredentials</code> API. For more information on the
 * <code>redshift:GetClusterCredentials</code> API, see <a
 * href="https://docs.aws.amazon.com/redshift/latest/APIReference/API_GetClusterCredentials.html">
 * <code>GetClusterCredentials</code> </a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RedshiftIAMParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftIAMParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use the <code>RoleArn</code> structure to allow Amazon QuickSight to call
     * <code>redshift:GetClusterCredentials</code> on your cluster. The calling principal must have
     * <code>iam:PassRole</code> access to pass the role to Amazon QuickSight. The role's trust policy must allow the
     * Amazon QuickSight service principal to assume the role.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The user whose permissions and group memberships will be used by Amazon QuickSight to access the cluster. If this
     * user already exists in your database, Amazon QuickSight is granted the same permissions that the user has. If the
     * user doesn't exist, set the value of <code>AutoCreateDatabaseUser</code> to <code>True</code> to create a new
     * user with PUBLIC permissions.
     * </p>
     */
    private String databaseUser;
    /**
     * <p>
     * A list of groups whose permissions will be granted to Amazon QuickSight to access the cluster. These permissions
     * are combined with the permissions granted to Amazon QuickSight by the <code>DatabaseUser</code>. If you choose to
     * include this parameter, the <code>RoleArn</code> must grant access to <code>redshift:JoinGroup</code>.
     * </p>
     */
    private java.util.List<String> databaseGroups;
    /**
     * <p>
     * Automatically creates a database user. If your database doesn't have a <code>DatabaseUser</code>, set this
     * parameter to <code>True</code>. If there is no <code>DatabaseUser</code>, Amazon QuickSight can't connect to your
     * cluster. The <code>RoleArn</code> that you use for this operation must grant access to
     * <code>redshift:CreateClusterUser</code> to successfully create the user.
     * </p>
     */
    private Boolean autoCreateDatabaseUser;

    /**
     * <p>
     * Use the <code>RoleArn</code> structure to allow Amazon QuickSight to call
     * <code>redshift:GetClusterCredentials</code> on your cluster. The calling principal must have
     * <code>iam:PassRole</code> access to pass the role to Amazon QuickSight. The role's trust policy must allow the
     * Amazon QuickSight service principal to assume the role.
     * </p>
     * 
     * @param roleArn
     *        Use the <code>RoleArn</code> structure to allow Amazon QuickSight to call
     *        <code>redshift:GetClusterCredentials</code> on your cluster. The calling principal must have
     *        <code>iam:PassRole</code> access to pass the role to Amazon QuickSight. The role's trust policy must allow
     *        the Amazon QuickSight service principal to assume the role.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * Use the <code>RoleArn</code> structure to allow Amazon QuickSight to call
     * <code>redshift:GetClusterCredentials</code> on your cluster. The calling principal must have
     * <code>iam:PassRole</code> access to pass the role to Amazon QuickSight. The role's trust policy must allow the
     * Amazon QuickSight service principal to assume the role.
     * </p>
     * 
     * @return Use the <code>RoleArn</code> structure to allow Amazon QuickSight to call
     *         <code>redshift:GetClusterCredentials</code> on your cluster. The calling principal must have
     *         <code>iam:PassRole</code> access to pass the role to Amazon QuickSight. The role's trust policy must
     *         allow the Amazon QuickSight service principal to assume the role.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * Use the <code>RoleArn</code> structure to allow Amazon QuickSight to call
     * <code>redshift:GetClusterCredentials</code> on your cluster. The calling principal must have
     * <code>iam:PassRole</code> access to pass the role to Amazon QuickSight. The role's trust policy must allow the
     * Amazon QuickSight service principal to assume the role.
     * </p>
     * 
     * @param roleArn
     *        Use the <code>RoleArn</code> structure to allow Amazon QuickSight to call
     *        <code>redshift:GetClusterCredentials</code> on your cluster. The calling principal must have
     *        <code>iam:PassRole</code> access to pass the role to Amazon QuickSight. The role's trust policy must allow
     *        the Amazon QuickSight service principal to assume the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIAMParameters withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The user whose permissions and group memberships will be used by Amazon QuickSight to access the cluster. If this
     * user already exists in your database, Amazon QuickSight is granted the same permissions that the user has. If the
     * user doesn't exist, set the value of <code>AutoCreateDatabaseUser</code> to <code>True</code> to create a new
     * user with PUBLIC permissions.
     * </p>
     * 
     * @param databaseUser
     *        The user whose permissions and group memberships will be used by Amazon QuickSight to access the cluster.
     *        If this user already exists in your database, Amazon QuickSight is granted the same permissions that the
     *        user has. If the user doesn't exist, set the value of <code>AutoCreateDatabaseUser</code> to
     *        <code>True</code> to create a new user with PUBLIC permissions.
     */

    public void setDatabaseUser(String databaseUser) {
        this.databaseUser = databaseUser;
    }

    /**
     * <p>
     * The user whose permissions and group memberships will be used by Amazon QuickSight to access the cluster. If this
     * user already exists in your database, Amazon QuickSight is granted the same permissions that the user has. If the
     * user doesn't exist, set the value of <code>AutoCreateDatabaseUser</code> to <code>True</code> to create a new
     * user with PUBLIC permissions.
     * </p>
     * 
     * @return The user whose permissions and group memberships will be used by Amazon QuickSight to access the cluster.
     *         If this user already exists in your database, Amazon QuickSight is granted the same permissions that the
     *         user has. If the user doesn't exist, set the value of <code>AutoCreateDatabaseUser</code> to
     *         <code>True</code> to create a new user with PUBLIC permissions.
     */

    public String getDatabaseUser() {
        return this.databaseUser;
    }

    /**
     * <p>
     * The user whose permissions and group memberships will be used by Amazon QuickSight to access the cluster. If this
     * user already exists in your database, Amazon QuickSight is granted the same permissions that the user has. If the
     * user doesn't exist, set the value of <code>AutoCreateDatabaseUser</code> to <code>True</code> to create a new
     * user with PUBLIC permissions.
     * </p>
     * 
     * @param databaseUser
     *        The user whose permissions and group memberships will be used by Amazon QuickSight to access the cluster.
     *        If this user already exists in your database, Amazon QuickSight is granted the same permissions that the
     *        user has. If the user doesn't exist, set the value of <code>AutoCreateDatabaseUser</code> to
     *        <code>True</code> to create a new user with PUBLIC permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIAMParameters withDatabaseUser(String databaseUser) {
        setDatabaseUser(databaseUser);
        return this;
    }

    /**
     * <p>
     * A list of groups whose permissions will be granted to Amazon QuickSight to access the cluster. These permissions
     * are combined with the permissions granted to Amazon QuickSight by the <code>DatabaseUser</code>. If you choose to
     * include this parameter, the <code>RoleArn</code> must grant access to <code>redshift:JoinGroup</code>.
     * </p>
     * 
     * @return A list of groups whose permissions will be granted to Amazon QuickSight to access the cluster. These
     *         permissions are combined with the permissions granted to Amazon QuickSight by the
     *         <code>DatabaseUser</code>. If you choose to include this parameter, the <code>RoleArn</code> must grant
     *         access to <code>redshift:JoinGroup</code>.
     */

    public java.util.List<String> getDatabaseGroups() {
        return databaseGroups;
    }

    /**
     * <p>
     * A list of groups whose permissions will be granted to Amazon QuickSight to access the cluster. These permissions
     * are combined with the permissions granted to Amazon QuickSight by the <code>DatabaseUser</code>. If you choose to
     * include this parameter, the <code>RoleArn</code> must grant access to <code>redshift:JoinGroup</code>.
     * </p>
     * 
     * @param databaseGroups
     *        A list of groups whose permissions will be granted to Amazon QuickSight to access the cluster. These
     *        permissions are combined with the permissions granted to Amazon QuickSight by the
     *        <code>DatabaseUser</code>. If you choose to include this parameter, the <code>RoleArn</code> must grant
     *        access to <code>redshift:JoinGroup</code>.
     */

    public void setDatabaseGroups(java.util.Collection<String> databaseGroups) {
        if (databaseGroups == null) {
            this.databaseGroups = null;
            return;
        }

        this.databaseGroups = new java.util.ArrayList<String>(databaseGroups);
    }

    /**
     * <p>
     * A list of groups whose permissions will be granted to Amazon QuickSight to access the cluster. These permissions
     * are combined with the permissions granted to Amazon QuickSight by the <code>DatabaseUser</code>. If you choose to
     * include this parameter, the <code>RoleArn</code> must grant access to <code>redshift:JoinGroup</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatabaseGroups(java.util.Collection)} or {@link #withDatabaseGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param databaseGroups
     *        A list of groups whose permissions will be granted to Amazon QuickSight to access the cluster. These
     *        permissions are combined with the permissions granted to Amazon QuickSight by the
     *        <code>DatabaseUser</code>. If you choose to include this parameter, the <code>RoleArn</code> must grant
     *        access to <code>redshift:JoinGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIAMParameters withDatabaseGroups(String... databaseGroups) {
        if (this.databaseGroups == null) {
            setDatabaseGroups(new java.util.ArrayList<String>(databaseGroups.length));
        }
        for (String ele : databaseGroups) {
            this.databaseGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of groups whose permissions will be granted to Amazon QuickSight to access the cluster. These permissions
     * are combined with the permissions granted to Amazon QuickSight by the <code>DatabaseUser</code>. If you choose to
     * include this parameter, the <code>RoleArn</code> must grant access to <code>redshift:JoinGroup</code>.
     * </p>
     * 
     * @param databaseGroups
     *        A list of groups whose permissions will be granted to Amazon QuickSight to access the cluster. These
     *        permissions are combined with the permissions granted to Amazon QuickSight by the
     *        <code>DatabaseUser</code>. If you choose to include this parameter, the <code>RoleArn</code> must grant
     *        access to <code>redshift:JoinGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIAMParameters withDatabaseGroups(java.util.Collection<String> databaseGroups) {
        setDatabaseGroups(databaseGroups);
        return this;
    }

    /**
     * <p>
     * Automatically creates a database user. If your database doesn't have a <code>DatabaseUser</code>, set this
     * parameter to <code>True</code>. If there is no <code>DatabaseUser</code>, Amazon QuickSight can't connect to your
     * cluster. The <code>RoleArn</code> that you use for this operation must grant access to
     * <code>redshift:CreateClusterUser</code> to successfully create the user.
     * </p>
     * 
     * @param autoCreateDatabaseUser
     *        Automatically creates a database user. If your database doesn't have a <code>DatabaseUser</code>, set this
     *        parameter to <code>True</code>. If there is no <code>DatabaseUser</code>, Amazon QuickSight can't connect
     *        to your cluster. The <code>RoleArn</code> that you use for this operation must grant access to
     *        <code>redshift:CreateClusterUser</code> to successfully create the user.
     */

    public void setAutoCreateDatabaseUser(Boolean autoCreateDatabaseUser) {
        this.autoCreateDatabaseUser = autoCreateDatabaseUser;
    }

    /**
     * <p>
     * Automatically creates a database user. If your database doesn't have a <code>DatabaseUser</code>, set this
     * parameter to <code>True</code>. If there is no <code>DatabaseUser</code>, Amazon QuickSight can't connect to your
     * cluster. The <code>RoleArn</code> that you use for this operation must grant access to
     * <code>redshift:CreateClusterUser</code> to successfully create the user.
     * </p>
     * 
     * @return Automatically creates a database user. If your database doesn't have a <code>DatabaseUser</code>, set
     *         this parameter to <code>True</code>. If there is no <code>DatabaseUser</code>, Amazon QuickSight can't
     *         connect to your cluster. The <code>RoleArn</code> that you use for this operation must grant access to
     *         <code>redshift:CreateClusterUser</code> to successfully create the user.
     */

    public Boolean getAutoCreateDatabaseUser() {
        return this.autoCreateDatabaseUser;
    }

    /**
     * <p>
     * Automatically creates a database user. If your database doesn't have a <code>DatabaseUser</code>, set this
     * parameter to <code>True</code>. If there is no <code>DatabaseUser</code>, Amazon QuickSight can't connect to your
     * cluster. The <code>RoleArn</code> that you use for this operation must grant access to
     * <code>redshift:CreateClusterUser</code> to successfully create the user.
     * </p>
     * 
     * @param autoCreateDatabaseUser
     *        Automatically creates a database user. If your database doesn't have a <code>DatabaseUser</code>, set this
     *        parameter to <code>True</code>. If there is no <code>DatabaseUser</code>, Amazon QuickSight can't connect
     *        to your cluster. The <code>RoleArn</code> that you use for this operation must grant access to
     *        <code>redshift:CreateClusterUser</code> to successfully create the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedshiftIAMParameters withAutoCreateDatabaseUser(Boolean autoCreateDatabaseUser) {
        setAutoCreateDatabaseUser(autoCreateDatabaseUser);
        return this;
    }

    /**
     * <p>
     * Automatically creates a database user. If your database doesn't have a <code>DatabaseUser</code>, set this
     * parameter to <code>True</code>. If there is no <code>DatabaseUser</code>, Amazon QuickSight can't connect to your
     * cluster. The <code>RoleArn</code> that you use for this operation must grant access to
     * <code>redshift:CreateClusterUser</code> to successfully create the user.
     * </p>
     * 
     * @return Automatically creates a database user. If your database doesn't have a <code>DatabaseUser</code>, set
     *         this parameter to <code>True</code>. If there is no <code>DatabaseUser</code>, Amazon QuickSight can't
     *         connect to your cluster. The <code>RoleArn</code> that you use for this operation must grant access to
     *         <code>redshift:CreateClusterUser</code> to successfully create the user.
     */

    public Boolean isAutoCreateDatabaseUser() {
        return this.autoCreateDatabaseUser;
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getDatabaseUser() != null)
            sb.append("DatabaseUser: ").append(getDatabaseUser()).append(",");
        if (getDatabaseGroups() != null)
            sb.append("DatabaseGroups: ").append(getDatabaseGroups()).append(",");
        if (getAutoCreateDatabaseUser() != null)
            sb.append("AutoCreateDatabaseUser: ").append(getAutoCreateDatabaseUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftIAMParameters == false)
            return false;
        RedshiftIAMParameters other = (RedshiftIAMParameters) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDatabaseUser() == null ^ this.getDatabaseUser() == null)
            return false;
        if (other.getDatabaseUser() != null && other.getDatabaseUser().equals(this.getDatabaseUser()) == false)
            return false;
        if (other.getDatabaseGroups() == null ^ this.getDatabaseGroups() == null)
            return false;
        if (other.getDatabaseGroups() != null && other.getDatabaseGroups().equals(this.getDatabaseGroups()) == false)
            return false;
        if (other.getAutoCreateDatabaseUser() == null ^ this.getAutoCreateDatabaseUser() == null)
            return false;
        if (other.getAutoCreateDatabaseUser() != null && other.getAutoCreateDatabaseUser().equals(this.getAutoCreateDatabaseUser()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDatabaseUser() == null) ? 0 : getDatabaseUser().hashCode());
        hashCode = prime * hashCode + ((getDatabaseGroups() == null) ? 0 : getDatabaseGroups().hashCode());
        hashCode = prime * hashCode + ((getAutoCreateDatabaseUser() == null) ? 0 : getAutoCreateDatabaseUser().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftIAMParameters clone() {
        try {
            return (RedshiftIAMParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RedshiftIAMParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
