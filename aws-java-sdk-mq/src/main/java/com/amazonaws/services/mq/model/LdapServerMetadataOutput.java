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
 * <p>
 * Optional. The metadata of the LDAP server used to authenticate and authorize connections to the broker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/LdapServerMetadataOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LdapServerMetadataOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the location of the LDAP server such as AWS Directory Service for Microsoft Active Directory . Optional
     * failover server.
     * </p>
     */
    private java.util.List<String> hosts;
    /**
     * <p>
     * The distinguished name of the node in the directory information tree (DIT) to search for roles or groups. For
     * example, ou=group, ou=corp, dc=corp, dc=example, dc=com.
     * </p>
     */
    private String roleBase;
    /**
     * <p>
     * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group
     * membership query.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The LDAP search filter used to find roles within the roleBase. The distinguished name of the user matched by
     * userSearchMatching is substituted into the {0} placeholder in the search filter. The client's username is
     * substituted into the {1} placeholder. For example, if you set this option to (member=uid={1})for the user
     * janedoe, the search filter becomes (member=uid=janedoe) after string substitution. It matches all role entries
     * that have a member attribute equal to uid=janedoe under the subtree selected by the roleBase.
     * </p>
     */
    private String roleSearchMatching;
    /**
     * <p>
     * The directory search scope for the role. If set to true, scope is to search the entire subtree.
     * </p>
     */
    private Boolean roleSearchSubtree;
    /**
     * <p>
     * Service account username. A service account is an account in your LDAP server that has access to initiate a
     * connection. For example, cn=admin,dc=corp, dc=example, dc=com.
     * </p>
     */
    private String serviceAccountUsername;
    /**
     * <p>
     * Select a particular subtree of the directory information tree (DIT) to search for user entries. The subtree is
     * specified by a DN, which specifies the base node of the subtree. For example, by setting this option to
     * ou=Users,ou=corp, dc=corp, dc=example, dc=com, the search for user entries is restricted to the subtree beneath
     * ou=Users, ou=corp, dc=corp, dc=example, dc=com.
     * </p>
     */
    private String userBase;
    /**
     * <p>
     * Specifies the name of the LDAP attribute for the user group membership.
     * </p>
     */
    private String userRoleName;
    /**
     * <p>
     * The LDAP search filter used to find users within the userBase. The client's username is substituted into the {0}
     * placeholder in the search filter. For example, if this option is set to (uid={0}) and the received username is
     * janedoe, the search filter becomes (uid=janedoe) after string substitution. It will result in matching an entry
     * like uid=janedoe, ou=Users,ou=corp, dc=corp, dc=example, dc=com.
     * </p>
     */
    private String userSearchMatching;
    /**
     * <p>
     * The directory search scope for the user. If set to true, scope is to search the entire subtree.
     * </p>
     */
    private Boolean userSearchSubtree;

    /**
     * <p>
     * Specifies the location of the LDAP server such as AWS Directory Service for Microsoft Active Directory . Optional
     * failover server.
     * </p>
     * 
     * @return Specifies the location of the LDAP server such as AWS Directory Service for Microsoft Active Directory .
     *         Optional failover server.
     */

    public java.util.List<String> getHosts() {
        return hosts;
    }

    /**
     * <p>
     * Specifies the location of the LDAP server such as AWS Directory Service for Microsoft Active Directory . Optional
     * failover server.
     * </p>
     * 
     * @param hosts
     *        Specifies the location of the LDAP server such as AWS Directory Service for Microsoft Active Directory .
     *        Optional failover server.
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
     * Specifies the location of the LDAP server such as AWS Directory Service for Microsoft Active Directory . Optional
     * failover server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHosts(java.util.Collection)} or {@link #withHosts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param hosts
     *        Specifies the location of the LDAP server such as AWS Directory Service for Microsoft Active Directory .
     *        Optional failover server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataOutput withHosts(String... hosts) {
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
     * Specifies the location of the LDAP server such as AWS Directory Service for Microsoft Active Directory . Optional
     * failover server.
     * </p>
     * 
     * @param hosts
     *        Specifies the location of the LDAP server such as AWS Directory Service for Microsoft Active Directory .
     *        Optional failover server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataOutput withHosts(java.util.Collection<String> hosts) {
        setHosts(hosts);
        return this;
    }

    /**
     * <p>
     * The distinguished name of the node in the directory information tree (DIT) to search for roles or groups. For
     * example, ou=group, ou=corp, dc=corp, dc=example, dc=com.
     * </p>
     * 
     * @param roleBase
     *        The distinguished name of the node in the directory information tree (DIT) to search for roles or groups.
     *        For example, ou=group, ou=corp, dc=corp, dc=example, dc=com.
     */

    public void setRoleBase(String roleBase) {
        this.roleBase = roleBase;
    }

    /**
     * <p>
     * The distinguished name of the node in the directory information tree (DIT) to search for roles or groups. For
     * example, ou=group, ou=corp, dc=corp, dc=example, dc=com.
     * </p>
     * 
     * @return The distinguished name of the node in the directory information tree (DIT) to search for roles or groups.
     *         For example, ou=group, ou=corp, dc=corp, dc=example, dc=com.
     */

    public String getRoleBase() {
        return this.roleBase;
    }

    /**
     * <p>
     * The distinguished name of the node in the directory information tree (DIT) to search for roles or groups. For
     * example, ou=group, ou=corp, dc=corp, dc=example, dc=com.
     * </p>
     * 
     * @param roleBase
     *        The distinguished name of the node in the directory information tree (DIT) to search for roles or groups.
     *        For example, ou=group, ou=corp, dc=corp, dc=example, dc=com.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataOutput withRoleBase(String roleBase) {
        setRoleBase(roleBase);
        return this;
    }

    /**
     * <p>
     * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group
     * membership query.
     * </p>
     * 
     * @param roleName
     *        Specifies the LDAP attribute that identifies the group name attribute in the object returned from the
     *        group membership query.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group
     * membership query.
     * </p>
     * 
     * @return Specifies the LDAP attribute that identifies the group name attribute in the object returned from the
     *         group membership query.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * Specifies the LDAP attribute that identifies the group name attribute in the object returned from the group
     * membership query.
     * </p>
     * 
     * @param roleName
     *        Specifies the LDAP attribute that identifies the group name attribute in the object returned from the
     *        group membership query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataOutput withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The LDAP search filter used to find roles within the roleBase. The distinguished name of the user matched by
     * userSearchMatching is substituted into the {0} placeholder in the search filter. The client's username is
     * substituted into the {1} placeholder. For example, if you set this option to (member=uid={1})for the user
     * janedoe, the search filter becomes (member=uid=janedoe) after string substitution. It matches all role entries
     * that have a member attribute equal to uid=janedoe under the subtree selected by the roleBase.
     * </p>
     * 
     * @param roleSearchMatching
     *        The LDAP search filter used to find roles within the roleBase. The distinguished name of the user matched
     *        by userSearchMatching is substituted into the {0} placeholder in the search filter. The client's username
     *        is substituted into the {1} placeholder. For example, if you set this option to (member=uid={1})for the
     *        user janedoe, the search filter becomes (member=uid=janedoe) after string substitution. It matches all
     *        role entries that have a member attribute equal to uid=janedoe under the subtree selected by the roleBase.
     */

    public void setRoleSearchMatching(String roleSearchMatching) {
        this.roleSearchMatching = roleSearchMatching;
    }

    /**
     * <p>
     * The LDAP search filter used to find roles within the roleBase. The distinguished name of the user matched by
     * userSearchMatching is substituted into the {0} placeholder in the search filter. The client's username is
     * substituted into the {1} placeholder. For example, if you set this option to (member=uid={1})for the user
     * janedoe, the search filter becomes (member=uid=janedoe) after string substitution. It matches all role entries
     * that have a member attribute equal to uid=janedoe under the subtree selected by the roleBase.
     * </p>
     * 
     * @return The LDAP search filter used to find roles within the roleBase. The distinguished name of the user matched
     *         by userSearchMatching is substituted into the {0} placeholder in the search filter. The client's username
     *         is substituted into the {1} placeholder. For example, if you set this option to (member=uid={1})for the
     *         user janedoe, the search filter becomes (member=uid=janedoe) after string substitution. It matches all
     *         role entries that have a member attribute equal to uid=janedoe under the subtree selected by the
     *         roleBase.
     */

    public String getRoleSearchMatching() {
        return this.roleSearchMatching;
    }

    /**
     * <p>
     * The LDAP search filter used to find roles within the roleBase. The distinguished name of the user matched by
     * userSearchMatching is substituted into the {0} placeholder in the search filter. The client's username is
     * substituted into the {1} placeholder. For example, if you set this option to (member=uid={1})for the user
     * janedoe, the search filter becomes (member=uid=janedoe) after string substitution. It matches all role entries
     * that have a member attribute equal to uid=janedoe under the subtree selected by the roleBase.
     * </p>
     * 
     * @param roleSearchMatching
     *        The LDAP search filter used to find roles within the roleBase. The distinguished name of the user matched
     *        by userSearchMatching is substituted into the {0} placeholder in the search filter. The client's username
     *        is substituted into the {1} placeholder. For example, if you set this option to (member=uid={1})for the
     *        user janedoe, the search filter becomes (member=uid=janedoe) after string substitution. It matches all
     *        role entries that have a member attribute equal to uid=janedoe under the subtree selected by the roleBase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataOutput withRoleSearchMatching(String roleSearchMatching) {
        setRoleSearchMatching(roleSearchMatching);
        return this;
    }

    /**
     * <p>
     * The directory search scope for the role. If set to true, scope is to search the entire subtree.
     * </p>
     * 
     * @param roleSearchSubtree
     *        The directory search scope for the role. If set to true, scope is to search the entire subtree.
     */

    public void setRoleSearchSubtree(Boolean roleSearchSubtree) {
        this.roleSearchSubtree = roleSearchSubtree;
    }

    /**
     * <p>
     * The directory search scope for the role. If set to true, scope is to search the entire subtree.
     * </p>
     * 
     * @return The directory search scope for the role. If set to true, scope is to search the entire subtree.
     */

    public Boolean getRoleSearchSubtree() {
        return this.roleSearchSubtree;
    }

    /**
     * <p>
     * The directory search scope for the role. If set to true, scope is to search the entire subtree.
     * </p>
     * 
     * @param roleSearchSubtree
     *        The directory search scope for the role. If set to true, scope is to search the entire subtree.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataOutput withRoleSearchSubtree(Boolean roleSearchSubtree) {
        setRoleSearchSubtree(roleSearchSubtree);
        return this;
    }

    /**
     * <p>
     * The directory search scope for the role. If set to true, scope is to search the entire subtree.
     * </p>
     * 
     * @return The directory search scope for the role. If set to true, scope is to search the entire subtree.
     */

    public Boolean isRoleSearchSubtree() {
        return this.roleSearchSubtree;
    }

    /**
     * <p>
     * Service account username. A service account is an account in your LDAP server that has access to initiate a
     * connection. For example, cn=admin,dc=corp, dc=example, dc=com.
     * </p>
     * 
     * @param serviceAccountUsername
     *        Service account username. A service account is an account in your LDAP server that has access to initiate
     *        a connection. For example, cn=admin,dc=corp, dc=example, dc=com.
     */

    public void setServiceAccountUsername(String serviceAccountUsername) {
        this.serviceAccountUsername = serviceAccountUsername;
    }

    /**
     * <p>
     * Service account username. A service account is an account in your LDAP server that has access to initiate a
     * connection. For example, cn=admin,dc=corp, dc=example, dc=com.
     * </p>
     * 
     * @return Service account username. A service account is an account in your LDAP server that has access to initiate
     *         a connection. For example, cn=admin,dc=corp, dc=example, dc=com.
     */

    public String getServiceAccountUsername() {
        return this.serviceAccountUsername;
    }

    /**
     * <p>
     * Service account username. A service account is an account in your LDAP server that has access to initiate a
     * connection. For example, cn=admin,dc=corp, dc=example, dc=com.
     * </p>
     * 
     * @param serviceAccountUsername
     *        Service account username. A service account is an account in your LDAP server that has access to initiate
     *        a connection. For example, cn=admin,dc=corp, dc=example, dc=com.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataOutput withServiceAccountUsername(String serviceAccountUsername) {
        setServiceAccountUsername(serviceAccountUsername);
        return this;
    }

    /**
     * <p>
     * Select a particular subtree of the directory information tree (DIT) to search for user entries. The subtree is
     * specified by a DN, which specifies the base node of the subtree. For example, by setting this option to
     * ou=Users,ou=corp, dc=corp, dc=example, dc=com, the search for user entries is restricted to the subtree beneath
     * ou=Users, ou=corp, dc=corp, dc=example, dc=com.
     * </p>
     * 
     * @param userBase
     *        Select a particular subtree of the directory information tree (DIT) to search for user entries. The
     *        subtree is specified by a DN, which specifies the base node of the subtree. For example, by setting this
     *        option to ou=Users,ou=corp, dc=corp, dc=example, dc=com, the search for user entries is restricted to the
     *        subtree beneath ou=Users, ou=corp, dc=corp, dc=example, dc=com.
     */

    public void setUserBase(String userBase) {
        this.userBase = userBase;
    }

    /**
     * <p>
     * Select a particular subtree of the directory information tree (DIT) to search for user entries. The subtree is
     * specified by a DN, which specifies the base node of the subtree. For example, by setting this option to
     * ou=Users,ou=corp, dc=corp, dc=example, dc=com, the search for user entries is restricted to the subtree beneath
     * ou=Users, ou=corp, dc=corp, dc=example, dc=com.
     * </p>
     * 
     * @return Select a particular subtree of the directory information tree (DIT) to search for user entries. The
     *         subtree is specified by a DN, which specifies the base node of the subtree. For example, by setting this
     *         option to ou=Users,ou=corp, dc=corp, dc=example, dc=com, the search for user entries is restricted to the
     *         subtree beneath ou=Users, ou=corp, dc=corp, dc=example, dc=com.
     */

    public String getUserBase() {
        return this.userBase;
    }

    /**
     * <p>
     * Select a particular subtree of the directory information tree (DIT) to search for user entries. The subtree is
     * specified by a DN, which specifies the base node of the subtree. For example, by setting this option to
     * ou=Users,ou=corp, dc=corp, dc=example, dc=com, the search for user entries is restricted to the subtree beneath
     * ou=Users, ou=corp, dc=corp, dc=example, dc=com.
     * </p>
     * 
     * @param userBase
     *        Select a particular subtree of the directory information tree (DIT) to search for user entries. The
     *        subtree is specified by a DN, which specifies the base node of the subtree. For example, by setting this
     *        option to ou=Users,ou=corp, dc=corp, dc=example, dc=com, the search for user entries is restricted to the
     *        subtree beneath ou=Users, ou=corp, dc=corp, dc=example, dc=com.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataOutput withUserBase(String userBase) {
        setUserBase(userBase);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the LDAP attribute for the user group membership.
     * </p>
     * 
     * @param userRoleName
     *        Specifies the name of the LDAP attribute for the user group membership.
     */

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    /**
     * <p>
     * Specifies the name of the LDAP attribute for the user group membership.
     * </p>
     * 
     * @return Specifies the name of the LDAP attribute for the user group membership.
     */

    public String getUserRoleName() {
        return this.userRoleName;
    }

    /**
     * <p>
     * Specifies the name of the LDAP attribute for the user group membership.
     * </p>
     * 
     * @param userRoleName
     *        Specifies the name of the LDAP attribute for the user group membership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataOutput withUserRoleName(String userRoleName) {
        setUserRoleName(userRoleName);
        return this;
    }

    /**
     * <p>
     * The LDAP search filter used to find users within the userBase. The client's username is substituted into the {0}
     * placeholder in the search filter. For example, if this option is set to (uid={0}) and the received username is
     * janedoe, the search filter becomes (uid=janedoe) after string substitution. It will result in matching an entry
     * like uid=janedoe, ou=Users,ou=corp, dc=corp, dc=example, dc=com.
     * </p>
     * 
     * @param userSearchMatching
     *        The LDAP search filter used to find users within the userBase. The client's username is substituted into
     *        the {0} placeholder in the search filter. For example, if this option is set to (uid={0}) and the received
     *        username is janedoe, the search filter becomes (uid=janedoe) after string substitution. It will result in
     *        matching an entry like uid=janedoe, ou=Users,ou=corp, dc=corp, dc=example, dc=com.
     */

    public void setUserSearchMatching(String userSearchMatching) {
        this.userSearchMatching = userSearchMatching;
    }

    /**
     * <p>
     * The LDAP search filter used to find users within the userBase. The client's username is substituted into the {0}
     * placeholder in the search filter. For example, if this option is set to (uid={0}) and the received username is
     * janedoe, the search filter becomes (uid=janedoe) after string substitution. It will result in matching an entry
     * like uid=janedoe, ou=Users,ou=corp, dc=corp, dc=example, dc=com.
     * </p>
     * 
     * @return The LDAP search filter used to find users within the userBase. The client's username is substituted into
     *         the {0} placeholder in the search filter. For example, if this option is set to (uid={0}) and the
     *         received username is janedoe, the search filter becomes (uid=janedoe) after string substitution. It will
     *         result in matching an entry like uid=janedoe, ou=Users,ou=corp, dc=corp, dc=example, dc=com.
     */

    public String getUserSearchMatching() {
        return this.userSearchMatching;
    }

    /**
     * <p>
     * The LDAP search filter used to find users within the userBase. The client's username is substituted into the {0}
     * placeholder in the search filter. For example, if this option is set to (uid={0}) and the received username is
     * janedoe, the search filter becomes (uid=janedoe) after string substitution. It will result in matching an entry
     * like uid=janedoe, ou=Users,ou=corp, dc=corp, dc=example, dc=com.
     * </p>
     * 
     * @param userSearchMatching
     *        The LDAP search filter used to find users within the userBase. The client's username is substituted into
     *        the {0} placeholder in the search filter. For example, if this option is set to (uid={0}) and the received
     *        username is janedoe, the search filter becomes (uid=janedoe) after string substitution. It will result in
     *        matching an entry like uid=janedoe, ou=Users,ou=corp, dc=corp, dc=example, dc=com.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataOutput withUserSearchMatching(String userSearchMatching) {
        setUserSearchMatching(userSearchMatching);
        return this;
    }

    /**
     * <p>
     * The directory search scope for the user. If set to true, scope is to search the entire subtree.
     * </p>
     * 
     * @param userSearchSubtree
     *        The directory search scope for the user. If set to true, scope is to search the entire subtree.
     */

    public void setUserSearchSubtree(Boolean userSearchSubtree) {
        this.userSearchSubtree = userSearchSubtree;
    }

    /**
     * <p>
     * The directory search scope for the user. If set to true, scope is to search the entire subtree.
     * </p>
     * 
     * @return The directory search scope for the user. If set to true, scope is to search the entire subtree.
     */

    public Boolean getUserSearchSubtree() {
        return this.userSearchSubtree;
    }

    /**
     * <p>
     * The directory search scope for the user. If set to true, scope is to search the entire subtree.
     * </p>
     * 
     * @param userSearchSubtree
     *        The directory search scope for the user. If set to true, scope is to search the entire subtree.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LdapServerMetadataOutput withUserSearchSubtree(Boolean userSearchSubtree) {
        setUserSearchSubtree(userSearchSubtree);
        return this;
    }

    /**
     * <p>
     * The directory search scope for the user. If set to true, scope is to search the entire subtree.
     * </p>
     * 
     * @return The directory search scope for the user. If set to true, scope is to search the entire subtree.
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

        if (obj instanceof LdapServerMetadataOutput == false)
            return false;
        LdapServerMetadataOutput other = (LdapServerMetadataOutput) obj;
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
    public LdapServerMetadataOutput clone() {
        try {
            return (LdapServerMetadataOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.LdapServerMetadataOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
