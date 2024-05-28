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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata of the Lightweight Directory Access Protocol (LDAP) server used to authenticate and authorize
 * connections to the broker. This is an optional failover server.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAmazonMqBrokerLdapServerMetadataDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAmazonMqBrokerLdapServerMetadataDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the location of the LDAP server, such as Amazon Web Services Directory Service for Microsoft Active
     * Directory.
     * </p>
     */
    private java.util.List<String> hosts;
    /**
     * <p>
     * The distinguished name of the node in the directory information tree (DIT) to search for roles or groups.
     * </p>
     */
    private String roleBase;
    /**
     * <p>
     * The group name attribute in a role entry whose value is the name of that role.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The LDAP search filter used to find roles within the <code>roleBase</code>.
     * </p>
     */
    private String roleSearchMatching;
    /**
     * <p>
     * The directory search scope for the role. If set to <code>true</code>, the scope is to search the entire subtree.
     * </p>
     */
    private Boolean roleSearchSubtree;
    /**
     * <p>
     * A username for the service account, which is an account in your LDAP server that has access to initiate a
     * connection.
     * </p>
     */
    private String serviceAccountUsername;
    /**
     * <p>
     * Selects a particular subtree of the directory information tree (DIT) to search for user entries.
     * </p>
     */
    private String userBase;
    /**
     * <p>
     * The name of the LDAP attribute in the user's directory entry for the user's group membership.
     * </p>
     */
    private String userRoleName;
    /**
     * <p>
     * The LDAP search filter used to find users within the <code>userBase</code>.
     * </p>
     */
    private String userSearchMatching;
    /**
     * <p>
     * The directory search scope for the user. If set to true, the scope is to search the entire subtree.
     * </p>
     */
    private Boolean userSearchSubtree;

    /**
     * <p>
     * Specifies the location of the LDAP server, such as Amazon Web Services Directory Service for Microsoft Active
     * Directory.
     * </p>
     * 
     * @return Specifies the location of the LDAP server, such as Amazon Web Services Directory Service for Microsoft
     *         Active Directory.
     */

    public java.util.List<String> getHosts() {
        return hosts;
    }

    /**
     * <p>
     * Specifies the location of the LDAP server, such as Amazon Web Services Directory Service for Microsoft Active
     * Directory.
     * </p>
     * 
     * @param hosts
     *        Specifies the location of the LDAP server, such as Amazon Web Services Directory Service for Microsoft
     *        Active Directory.
     */

    public void setHosts(java.util.Collection<String> hosts) {
        if (hosts == null) {
            this.hosts = null;
            return;
        }

        this.hosts = new java.util.ArrayList<String>(hosts);
    }

    /**
     * <p>
     * Specifies the location of the LDAP server, such as Amazon Web Services Directory Service for Microsoft Active
     * Directory.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHosts(java.util.Collection)} or {@link #withHosts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param hosts
     *        Specifies the location of the LDAP server, such as Amazon Web Services Directory Service for Microsoft
     *        Active Directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerLdapServerMetadataDetails withHosts(String... hosts) {
        if (this.hosts == null) {
            setHosts(new java.util.ArrayList<String>(hosts.length));
        }
        for (String ele : hosts) {
            this.hosts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the location of the LDAP server, such as Amazon Web Services Directory Service for Microsoft Active
     * Directory.
     * </p>
     * 
     * @param hosts
     *        Specifies the location of the LDAP server, such as Amazon Web Services Directory Service for Microsoft
     *        Active Directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerLdapServerMetadataDetails withHosts(java.util.Collection<String> hosts) {
        setHosts(hosts);
        return this;
    }

    /**
     * <p>
     * The distinguished name of the node in the directory information tree (DIT) to search for roles or groups.
     * </p>
     * 
     * @param roleBase
     *        The distinguished name of the node in the directory information tree (DIT) to search for roles or groups.
     */

    public void setRoleBase(String roleBase) {
        this.roleBase = roleBase;
    }

    /**
     * <p>
     * The distinguished name of the node in the directory information tree (DIT) to search for roles or groups.
     * </p>
     * 
     * @return The distinguished name of the node in the directory information tree (DIT) to search for roles or groups.
     */

    public String getRoleBase() {
        return this.roleBase;
    }

    /**
     * <p>
     * The distinguished name of the node in the directory information tree (DIT) to search for roles or groups.
     * </p>
     * 
     * @param roleBase
     *        The distinguished name of the node in the directory information tree (DIT) to search for roles or groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerLdapServerMetadataDetails withRoleBase(String roleBase) {
        setRoleBase(roleBase);
        return this;
    }

    /**
     * <p>
     * The group name attribute in a role entry whose value is the name of that role.
     * </p>
     * 
     * @param roleName
     *        The group name attribute in a role entry whose value is the name of that role.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The group name attribute in a role entry whose value is the name of that role.
     * </p>
     * 
     * @return The group name attribute in a role entry whose value is the name of that role.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The group name attribute in a role entry whose value is the name of that role.
     * </p>
     * 
     * @param roleName
     *        The group name attribute in a role entry whose value is the name of that role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerLdapServerMetadataDetails withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The LDAP search filter used to find roles within the <code>roleBase</code>.
     * </p>
     * 
     * @param roleSearchMatching
     *        The LDAP search filter used to find roles within the <code>roleBase</code>.
     */

    public void setRoleSearchMatching(String roleSearchMatching) {
        this.roleSearchMatching = roleSearchMatching;
    }

    /**
     * <p>
     * The LDAP search filter used to find roles within the <code>roleBase</code>.
     * </p>
     * 
     * @return The LDAP search filter used to find roles within the <code>roleBase</code>.
     */

    public String getRoleSearchMatching() {
        return this.roleSearchMatching;
    }

    /**
     * <p>
     * The LDAP search filter used to find roles within the <code>roleBase</code>.
     * </p>
     * 
     * @param roleSearchMatching
     *        The LDAP search filter used to find roles within the <code>roleBase</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerLdapServerMetadataDetails withRoleSearchMatching(String roleSearchMatching) {
        setRoleSearchMatching(roleSearchMatching);
        return this;
    }

    /**
     * <p>
     * The directory search scope for the role. If set to <code>true</code>, the scope is to search the entire subtree.
     * </p>
     * 
     * @param roleSearchSubtree
     *        The directory search scope for the role. If set to <code>true</code>, the scope is to search the entire
     *        subtree.
     */

    public void setRoleSearchSubtree(Boolean roleSearchSubtree) {
        this.roleSearchSubtree = roleSearchSubtree;
    }

    /**
     * <p>
     * The directory search scope for the role. If set to <code>true</code>, the scope is to search the entire subtree.
     * </p>
     * 
     * @return The directory search scope for the role. If set to <code>true</code>, the scope is to search the entire
     *         subtree.
     */

    public Boolean getRoleSearchSubtree() {
        return this.roleSearchSubtree;
    }

    /**
     * <p>
     * The directory search scope for the role. If set to <code>true</code>, the scope is to search the entire subtree.
     * </p>
     * 
     * @param roleSearchSubtree
     *        The directory search scope for the role. If set to <code>true</code>, the scope is to search the entire
     *        subtree.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerLdapServerMetadataDetails withRoleSearchSubtree(Boolean roleSearchSubtree) {
        setRoleSearchSubtree(roleSearchSubtree);
        return this;
    }

    /**
     * <p>
     * The directory search scope for the role. If set to <code>true</code>, the scope is to search the entire subtree.
     * </p>
     * 
     * @return The directory search scope for the role. If set to <code>true</code>, the scope is to search the entire
     *         subtree.
     */

    public Boolean isRoleSearchSubtree() {
        return this.roleSearchSubtree;
    }

    /**
     * <p>
     * A username for the service account, which is an account in your LDAP server that has access to initiate a
     * connection.
     * </p>
     * 
     * @param serviceAccountUsername
     *        A username for the service account, which is an account in your LDAP server that has access to initiate a
     *        connection.
     */

    public void setServiceAccountUsername(String serviceAccountUsername) {
        this.serviceAccountUsername = serviceAccountUsername;
    }

    /**
     * <p>
     * A username for the service account, which is an account in your LDAP server that has access to initiate a
     * connection.
     * </p>
     * 
     * @return A username for the service account, which is an account in your LDAP server that has access to initiate a
     *         connection.
     */

    public String getServiceAccountUsername() {
        return this.serviceAccountUsername;
    }

    /**
     * <p>
     * A username for the service account, which is an account in your LDAP server that has access to initiate a
     * connection.
     * </p>
     * 
     * @param serviceAccountUsername
     *        A username for the service account, which is an account in your LDAP server that has access to initiate a
     *        connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerLdapServerMetadataDetails withServiceAccountUsername(String serviceAccountUsername) {
        setServiceAccountUsername(serviceAccountUsername);
        return this;
    }

    /**
     * <p>
     * Selects a particular subtree of the directory information tree (DIT) to search for user entries.
     * </p>
     * 
     * @param userBase
     *        Selects a particular subtree of the directory information tree (DIT) to search for user entries.
     */

    public void setUserBase(String userBase) {
        this.userBase = userBase;
    }

    /**
     * <p>
     * Selects a particular subtree of the directory information tree (DIT) to search for user entries.
     * </p>
     * 
     * @return Selects a particular subtree of the directory information tree (DIT) to search for user entries.
     */

    public String getUserBase() {
        return this.userBase;
    }

    /**
     * <p>
     * Selects a particular subtree of the directory information tree (DIT) to search for user entries.
     * </p>
     * 
     * @param userBase
     *        Selects a particular subtree of the directory information tree (DIT) to search for user entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerLdapServerMetadataDetails withUserBase(String userBase) {
        setUserBase(userBase);
        return this;
    }

    /**
     * <p>
     * The name of the LDAP attribute in the user's directory entry for the user's group membership.
     * </p>
     * 
     * @param userRoleName
     *        The name of the LDAP attribute in the user's directory entry for the user's group membership.
     */

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    /**
     * <p>
     * The name of the LDAP attribute in the user's directory entry for the user's group membership.
     * </p>
     * 
     * @return The name of the LDAP attribute in the user's directory entry for the user's group membership.
     */

    public String getUserRoleName() {
        return this.userRoleName;
    }

    /**
     * <p>
     * The name of the LDAP attribute in the user's directory entry for the user's group membership.
     * </p>
     * 
     * @param userRoleName
     *        The name of the LDAP attribute in the user's directory entry for the user's group membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerLdapServerMetadataDetails withUserRoleName(String userRoleName) {
        setUserRoleName(userRoleName);
        return this;
    }

    /**
     * <p>
     * The LDAP search filter used to find users within the <code>userBase</code>.
     * </p>
     * 
     * @param userSearchMatching
     *        The LDAP search filter used to find users within the <code>userBase</code>.
     */

    public void setUserSearchMatching(String userSearchMatching) {
        this.userSearchMatching = userSearchMatching;
    }

    /**
     * <p>
     * The LDAP search filter used to find users within the <code>userBase</code>.
     * </p>
     * 
     * @return The LDAP search filter used to find users within the <code>userBase</code>.
     */

    public String getUserSearchMatching() {
        return this.userSearchMatching;
    }

    /**
     * <p>
     * The LDAP search filter used to find users within the <code>userBase</code>.
     * </p>
     * 
     * @param userSearchMatching
     *        The LDAP search filter used to find users within the <code>userBase</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerLdapServerMetadataDetails withUserSearchMatching(String userSearchMatching) {
        setUserSearchMatching(userSearchMatching);
        return this;
    }

    /**
     * <p>
     * The directory search scope for the user. If set to true, the scope is to search the entire subtree.
     * </p>
     * 
     * @param userSearchSubtree
     *        The directory search scope for the user. If set to true, the scope is to search the entire subtree.
     */

    public void setUserSearchSubtree(Boolean userSearchSubtree) {
        this.userSearchSubtree = userSearchSubtree;
    }

    /**
     * <p>
     * The directory search scope for the user. If set to true, the scope is to search the entire subtree.
     * </p>
     * 
     * @return The directory search scope for the user. If set to true, the scope is to search the entire subtree.
     */

    public Boolean getUserSearchSubtree() {
        return this.userSearchSubtree;
    }

    /**
     * <p>
     * The directory search scope for the user. If set to true, the scope is to search the entire subtree.
     * </p>
     * 
     * @param userSearchSubtree
     *        The directory search scope for the user. If set to true, the scope is to search the entire subtree.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerLdapServerMetadataDetails withUserSearchSubtree(Boolean userSearchSubtree) {
        setUserSearchSubtree(userSearchSubtree);
        return this;
    }

    /**
     * <p>
     * The directory search scope for the user. If set to true, the scope is to search the entire subtree.
     * </p>
     * 
     * @return The directory search scope for the user. If set to true, the scope is to search the entire subtree.
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

        if (obj instanceof AwsAmazonMqBrokerLdapServerMetadataDetails == false)
            return false;
        AwsAmazonMqBrokerLdapServerMetadataDetails other = (AwsAmazonMqBrokerLdapServerMetadataDetails) obj;
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
        hashCode = prime * hashCode + ((getServiceAccountUsername() == null) ? 0 : getServiceAccountUsername().hashCode());
        hashCode = prime * hashCode + ((getUserBase() == null) ? 0 : getUserBase().hashCode());
        hashCode = prime * hashCode + ((getUserRoleName() == null) ? 0 : getUserRoleName().hashCode());
        hashCode = prime * hashCode + ((getUserSearchMatching() == null) ? 0 : getUserSearchMatching().hashCode());
        hashCode = prime * hashCode + ((getUserSearchSubtree() == null) ? 0 : getUserSearchSubtree().hashCode());
        return hashCode;
    }

    @Override
    public AwsAmazonMqBrokerLdapServerMetadataDetails clone() {
        try {
            return (AwsAmazonMqBrokerLdapServerMetadataDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAmazonMqBrokerLdapServerMetadataDetailsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
