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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The metadata of the LDAP server used to authenticate and authorize connections to the broker.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/LdapServerMetadataInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LdapServerMetadataInput implements Serializable, Cloneable, StructuredPojo {

    /** Fully qualified domain name of the LDAP server. Optional failover server. */
    private java.util.List<String> hosts;
    /** Fully qualified name of the directory to search for a user’s groups. */
    private String roleBase;
    /**
     * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group
     * membership query.
     */
    private String roleName;
    /** The search criteria for groups. */
    private String roleSearchMatching;
    /** The directory search scope for the role. If set to true, scope is to search the entire sub-tree. */
    private Boolean roleSearchSubtree;
    /** Service account password. */
    private String serviceAccountPassword;
    /** Service account username. */
    private String serviceAccountUsername;
    /** Fully qualified name of the directory where you want to search for users. */
    private String userBase;
    /** Specifies the name of the LDAP attribute for the user group membership. */
    private String userRoleName;
    /** The search criteria for users. */
    private String userSearchMatching;
    /** The directory search scope for the user. If set to true, scope is to search the entire sub-tree. */
    private Boolean userSearchSubtree;

    /**
     * Fully qualified domain name of the LDAP server. Optional failover server.
     * 
     * @return Fully qualified domain name of the LDAP server. Optional failover server.
     */

    public java.util.List<String> getHosts() {
        return hosts;
    }

    /**
     * Fully qualified domain name of the LDAP server. Optional failover server.
     * 
     * @param hosts
     *        Fully qualified domain name of the LDAP server. Optional failover server.
     */

    public void setHosts(java.util.Collection<String> hosts) {
        if (hosts == null) {
            this.hosts = null;
            return;
        }

        this.hosts = new java.util.ArrayList<String>(hosts);
    }

    /**
     * Fully qualified domain name of the LDAP server. Optional failover server.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHosts(java.util.Collection)} or {@link #withHosts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param hosts
     *        Fully qualified domain name of the LDAP server. Optional failover server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataInput withHosts(String... hosts) {
        if (this.hosts == null) {
            setHosts(new java.util.ArrayList<String>(hosts.length));
        }
        for (String ele : hosts) {
            this.hosts.add(ele);
        }
        return this;
    }

    /**
     * Fully qualified domain name of the LDAP server. Optional failover server.
     * 
     * @param hosts
     *        Fully qualified domain name of the LDAP server. Optional failover server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataInput withHosts(java.util.Collection<String> hosts) {
        setHosts(hosts);
        return this;
    }

    /**
     * Fully qualified name of the directory to search for a user’s groups.
     * 
     * @param roleBase
     *        Fully qualified name of the directory to search for a user’s groups.
     */

    public void setRoleBase(String roleBase) {
        this.roleBase = roleBase;
    }

    /**
     * Fully qualified name of the directory to search for a user’s groups.
     * 
     * @return Fully qualified name of the directory to search for a user’s groups.
     */

    public String getRoleBase() {
        return this.roleBase;
    }

    /**
     * Fully qualified name of the directory to search for a user’s groups.
     * 
     * @param roleBase
     *        Fully qualified name of the directory to search for a user’s groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataInput withRoleBase(String roleBase) {
        setRoleBase(roleBase);
        return this;
    }

    /**
     * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group
     * membership query.
     * 
     * @param roleName
     *        Specifies the LDAP attribute that identifies the group name attribute in the object returned from the
     *        group membership query.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group
     * membership query.
     * 
     * @return Specifies the LDAP attribute that identifies the group name attribute in the object returned from the
     *         group membership query.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group
     * membership query.
     * 
     * @param roleName
     *        Specifies the LDAP attribute that identifies the group name attribute in the object returned from the
     *        group membership query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataInput withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * The search criteria for groups.
     * 
     * @param roleSearchMatching
     *        The search criteria for groups.
     */

    public void setRoleSearchMatching(String roleSearchMatching) {
        this.roleSearchMatching = roleSearchMatching;
    }

    /**
     * The search criteria for groups.
     * 
     * @return The search criteria for groups.
     */

    public String getRoleSearchMatching() {
        return this.roleSearchMatching;
    }

    /**
     * The search criteria for groups.
     * 
     * @param roleSearchMatching
     *        The search criteria for groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataInput withRoleSearchMatching(String roleSearchMatching) {
        setRoleSearchMatching(roleSearchMatching);
        return this;
    }

    /**
     * The directory search scope for the role. If set to true, scope is to search the entire sub-tree.
     * 
     * @param roleSearchSubtree
     *        The directory search scope for the role. If set to true, scope is to search the entire sub-tree.
     */

    public void setRoleSearchSubtree(Boolean roleSearchSubtree) {
        this.roleSearchSubtree = roleSearchSubtree;
    }

    /**
     * The directory search scope for the role. If set to true, scope is to search the entire sub-tree.
     * 
     * @return The directory search scope for the role. If set to true, scope is to search the entire sub-tree.
     */

    public Boolean getRoleSearchSubtree() {
        return this.roleSearchSubtree;
    }

    /**
     * The directory search scope for the role. If set to true, scope is to search the entire sub-tree.
     * 
     * @param roleSearchSubtree
     *        The directory search scope for the role. If set to true, scope is to search the entire sub-tree.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataInput withRoleSearchSubtree(Boolean roleSearchSubtree) {
        setRoleSearchSubtree(roleSearchSubtree);
        return this;
    }

    /**
     * The directory search scope for the role. If set to true, scope is to search the entire sub-tree.
     * 
     * @return The directory search scope for the role. If set to true, scope is to search the entire sub-tree.
     */

    public Boolean isRoleSearchSubtree() {
        return this.roleSearchSubtree;
    }

    /**
     * Service account password.
     * 
     * @param serviceAccountPassword
     *        Service account password.
     */

    public void setServiceAccountPassword(String serviceAccountPassword) {
        this.serviceAccountPassword = serviceAccountPassword;
    }

    /**
     * Service account password.
     * 
     * @return Service account password.
     */

    public String getServiceAccountPassword() {
        return this.serviceAccountPassword;
    }

    /**
     * Service account password.
     * 
     * @param serviceAccountPassword
     *        Service account password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataInput withServiceAccountPassword(String serviceAccountPassword) {
        setServiceAccountPassword(serviceAccountPassword);
        return this;
    }

    /**
     * Service account username.
     * 
     * @param serviceAccountUsername
     *        Service account username.
     */

    public void setServiceAccountUsername(String serviceAccountUsername) {
        this.serviceAccountUsername = serviceAccountUsername;
    }

    /**
     * Service account username.
     * 
     * @return Service account username.
     */

    public String getServiceAccountUsername() {
        return this.serviceAccountUsername;
    }

    /**
     * Service account username.
     * 
     * @param serviceAccountUsername
     *        Service account username.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataInput withServiceAccountUsername(String serviceAccountUsername) {
        setServiceAccountUsername(serviceAccountUsername);
        return this;
    }

    /**
     * Fully qualified name of the directory where you want to search for users.
     * 
     * @param userBase
     *        Fully qualified name of the directory where you want to search for users.
     */

    public void setUserBase(String userBase) {
        this.userBase = userBase;
    }

    /**
     * Fully qualified name of the directory where you want to search for users.
     * 
     * @return Fully qualified name of the directory where you want to search for users.
     */

    public String getUserBase() {
        return this.userBase;
    }

    /**
     * Fully qualified name of the directory where you want to search for users.
     * 
     * @param userBase
     *        Fully qualified name of the directory where you want to search for users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataInput withUserBase(String userBase) {
        setUserBase(userBase);
        return this;
    }

    /**
     * Specifies the name of the LDAP attribute for the user group membership.
     * 
     * @param userRoleName
     *        Specifies the name of the LDAP attribute for the user group membership.
     */

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    /**
     * Specifies the name of the LDAP attribute for the user group membership.
     * 
     * @return Specifies the name of the LDAP attribute for the user group membership.
     */

    public String getUserRoleName() {
        return this.userRoleName;
    }

    /**
     * Specifies the name of the LDAP attribute for the user group membership.
     * 
     * @param userRoleName
     *        Specifies the name of the LDAP attribute for the user group membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataInput withUserRoleName(String userRoleName) {
        setUserRoleName(userRoleName);
        return this;
    }

    /**
     * The search criteria for users.
     * 
     * @param userSearchMatching
     *        The search criteria for users.
     */

    public void setUserSearchMatching(String userSearchMatching) {
        this.userSearchMatching = userSearchMatching;
    }

    /**
     * The search criteria for users.
     * 
     * @return The search criteria for users.
     */

    public String getUserSearchMatching() {
        return this.userSearchMatching;
    }

    /**
     * The search criteria for users.
     * 
     * @param userSearchMatching
     *        The search criteria for users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataInput withUserSearchMatching(String userSearchMatching) {
        setUserSearchMatching(userSearchMatching);
        return this;
    }

    /**
     * The directory search scope for the user. If set to true, scope is to search the entire sub-tree.
     * 
     * @param userSearchSubtree
     *        The directory search scope for the user. If set to true, scope is to search the entire sub-tree.
     */

    public void setUserSearchSubtree(Boolean userSearchSubtree) {
        this.userSearchSubtree = userSearchSubtree;
    }

    /**
     * The directory search scope for the user. If set to true, scope is to search the entire sub-tree.
     * 
     * @return The directory search scope for the user. If set to true, scope is to search the entire sub-tree.
     */

    public Boolean getUserSearchSubtree() {
        return this.userSearchSubtree;
    }

    /**
     * The directory search scope for the user. If set to true, scope is to search the entire sub-tree.
     * 
     * @param userSearchSubtree
     *        The directory search scope for the user. If set to true, scope is to search the entire sub-tree.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataInput withUserSearchSubtree(Boolean userSearchSubtree) {
        setUserSearchSubtree(userSearchSubtree);
        return this;
    }

    /**
     * The directory search scope for the user. If set to true, scope is to search the entire sub-tree.
     * 
     * @return The directory search scope for the user. If set to true, scope is to search the entire sub-tree.
     */

    public Boolean isUserSearchSubtree() {
        return this.userSearchSubtree;
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
        if (getHosts() != null)
            sb.append("Hosts: ").append(getHosts()).append(",");
        if (getRoleBase() != null)
            sb.append("RoleBase: ").append(getRoleBase()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getRoleSearchMatching() != null)
            sb.append("RoleSearchMatching: ").append(getRoleSearchMatching()).append(",");
        if (getRoleSearchSubtree() != null)
            sb.append("RoleSearchSubtree: ").append(getRoleSearchSubtree()).append(",");
        if (getServiceAccountPassword() != null)
            sb.append("ServiceAccountPassword: ").append(getServiceAccountPassword()).append(",");
        if (getServiceAccountUsername() != null)
            sb.append("ServiceAccountUsername: ").append(getServiceAccountUsername()).append(",");
        if (getUserBase() != null)
            sb.append("UserBase: ").append(getUserBase()).append(",");
        if (getUserRoleName() != null)
            sb.append("UserRoleName: ").append(getUserRoleName()).append(",");
        if (getUserSearchMatching() != null)
            sb.append("UserSearchMatching: ").append(getUserSearchMatching()).append(",");
        if (getUserSearchSubtree() != null)
            sb.append("UserSearchSubtree: ").append(getUserSearchSubtree());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LdapServerMetadataInput == false)
            return false;
        LdapServerMetadataInput other = (LdapServerMetadataInput) obj;
        if (other.getHosts() == null ^ this.getHosts() == null)
            return false;
        if (other.getHosts() != null && other.getHosts().equals(this.getHosts()) == false)
            return false;
        if (other.getRoleBase() == null ^ this.getRoleBase() == null)
            return false;
        if (other.getRoleBase() != null && other.getRoleBase().equals(this.getRoleBase()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getRoleSearchMatching() == null ^ this.getRoleSearchMatching() == null)
            return false;
        if (other.getRoleSearchMatching() != null && other.getRoleSearchMatching().equals(this.getRoleSearchMatching()) == false)
            return false;
        if (other.getRoleSearchSubtree() == null ^ this.getRoleSearchSubtree() == null)
            return false;
        if (other.getRoleSearchSubtree() != null && other.getRoleSearchSubtree().equals(this.getRoleSearchSubtree()) == false)
            return false;
        if (other.getServiceAccountPassword() == null ^ this.getServiceAccountPassword() == null)
            return false;
        if (other.getServiceAccountPassword() != null && other.getServiceAccountPassword().equals(this.getServiceAccountPassword()) == false)
            return false;
        if (other.getServiceAccountUsername() == null ^ this.getServiceAccountUsername() == null)
            return false;
        if (other.getServiceAccountUsername() != null && other.getServiceAccountUsername().equals(this.getServiceAccountUsername()) == false)
            return false;
        if (other.getUserBase() == null ^ this.getUserBase() == null)
            return false;
        if (other.getUserBase() != null && other.getUserBase().equals(this.getUserBase()) == false)
            return false;
        if (other.getUserRoleName() == null ^ this.getUserRoleName() == null)
            return false;
        if (other.getUserRoleName() != null && other.getUserRoleName().equals(this.getUserRoleName()) == false)
            return false;
        if (other.getUserSearchMatching() == null ^ this.getUserSearchMatching() == null)
            return false;
        if (other.getUserSearchMatching() != null && other.getUserSearchMatching().equals(this.getUserSearchMatching()) == false)
            return false;
        if (other.getUserSearchSubtree() == null ^ this.getUserSearchSubtree() == null)
            return false;
        if (other.getUserSearchSubtree() != null && other.getUserSearchSubtree().equals(this.getUserSearchSubtree()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHosts() == null) ? 0 : getHosts().hashCode());
        hashCode = prime * hashCode + ((getRoleBase() == null) ? 0 : getRoleBase().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getRoleSearchMatching() == null) ? 0 : getRoleSearchMatching().hashCode());
        hashCode = prime * hashCode + ((getRoleSearchSubtree() == null) ? 0 : getRoleSearchSubtree().hashCode());
        hashCode = prime * hashCode + ((getServiceAccountPassword() == null) ? 0 : getServiceAccountPassword().hashCode());
        hashCode = prime * hashCode + ((getServiceAccountUsername() == null) ? 0 : getServiceAccountUsername().hashCode());
        hashCode = prime * hashCode + ((getUserBase() == null) ? 0 : getUserBase().hashCode());
        hashCode = prime * hashCode + ((getUserRoleName() == null) ? 0 : getUserRoleName().hashCode());
        hashCode = prime * hashCode + ((getUserSearchMatching() == null) ? 0 : getUserSearchMatching().hashCode());
        hashCode = prime * hashCode + ((getUserSearchSubtree() == null) ? 0 : getUserSearchSubtree().hashCode());
        return hashCode;
    }

    @Override
    public LdapServerMetadataInput clone() {
        try {
            return (LdapServerMetadataInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.LdapServerMetadataInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
