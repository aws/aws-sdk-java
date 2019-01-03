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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user name in Amazon Connect for the account to create. If you are using SAML for identity management in your
     * Amazon Connect, the value for <code>Username</code> can include up to 64 characters from [a-zA-Z0-9_-.\@]+.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The password for the user account to create. This is required if you are using Amazon Connect for identity
     * management. If you are using SAML for identity management and include this parameter, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     */
    private String password;
    /**
     * <p>
     * Information about the user, including email address, first name, and last name.
     * </p>
     */
    private UserIdentityInfo identityInfo;
    /**
     * <p>
     * Specifies the phone settings for the user, including <code>AfterContactWorkTimeLimit</code>,
     * <code>AutoAccept</code>, <code>DeskPhoneNumber</code>, and <code>PhoneType</code>.
     * </p>
     */
    private UserPhoneConfig phoneConfig;
    /**
     * <p>
     * The unique identifier for the user account in the directory service directory used for identity management. If
     * Amazon Connect is unable to access the existing directory, you can use the <code>DirectoryUserId</code> to
     * authenticate users. If you include the parameter, it is assumed that Amazon Connect cannot access the directory.
     * If the parameter is not included, the <code>UserIdentityInfo</code> is used to authenticate users from your
     * existing directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for identity management in Amazon Connect when
     * Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management
     * and include this parameter, an <code>InvalidRequestException</code> is returned.
     * </p>
     */
    private String directoryUserId;
    /**
     * <p>
     * The unique identifier of the security profile to assign to the user created.
     * </p>
     */
    private java.util.List<String> securityProfileIds;
    /**
     * <p>
     * The unique identifier for the routing profile to assign to the user created.
     * </p>
     */
    private String routingProfileId;
    /**
     * <p>
     * The unique identifier for the hierarchy group to assign to the user created.
     * </p>
     */
    private String hierarchyGroupId;
    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select
     * Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in
     * the Overview section of your instance settings. For example, the instance ID is the set of characters at the end
     * of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The user name in Amazon Connect for the account to create. If you are using SAML for identity management in your
     * Amazon Connect, the value for <code>Username</code> can include up to 64 characters from [a-zA-Z0-9_-.\@]+.
     * </p>
     * 
     * @param username
     *        The user name in Amazon Connect for the account to create. If you are using SAML for identity management
     *        in your Amazon Connect, the value for <code>Username</code> can include up to 64 characters from
     *        [a-zA-Z0-9_-.\@]+.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name in Amazon Connect for the account to create. If you are using SAML for identity management in your
     * Amazon Connect, the value for <code>Username</code> can include up to 64 characters from [a-zA-Z0-9_-.\@]+.
     * </p>
     * 
     * @return The user name in Amazon Connect for the account to create. If you are using SAML for identity management
     *         in your Amazon Connect, the value for <code>Username</code> can include up to 64 characters from
     *         [a-zA-Z0-9_-.\@]+.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name in Amazon Connect for the account to create. If you are using SAML for identity management in your
     * Amazon Connect, the value for <code>Username</code> can include up to 64 characters from [a-zA-Z0-9_-.\@]+.
     * </p>
     * 
     * @param username
     *        The user name in Amazon Connect for the account to create. If you are using SAML for identity management
     *        in your Amazon Connect, the value for <code>Username</code> can include up to 64 characters from
     *        [a-zA-Z0-9_-.\@]+.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The password for the user account to create. This is required if you are using Amazon Connect for identity
     * management. If you are using SAML for identity management and include this parameter, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * 
     * @param password
     *        The password for the user account to create. This is required if you are using Amazon Connect for identity
     *        management. If you are using SAML for identity management and include this parameter, an
     *        <code>InvalidRequestException</code> is returned.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the user account to create. This is required if you are using Amazon Connect for identity
     * management. If you are using SAML for identity management and include this parameter, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * 
     * @return The password for the user account to create. This is required if you are using Amazon Connect for
     *         identity management. If you are using SAML for identity management and include this parameter, an
     *         <code>InvalidRequestException</code> is returned.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password for the user account to create. This is required if you are using Amazon Connect for identity
     * management. If you are using SAML for identity management and include this parameter, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * 
     * @param password
     *        The password for the user account to create. This is required if you are using Amazon Connect for identity
     *        management. If you are using SAML for identity management and include this parameter, an
     *        <code>InvalidRequestException</code> is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * Information about the user, including email address, first name, and last name.
     * </p>
     * 
     * @param identityInfo
     *        Information about the user, including email address, first name, and last name.
     */

    public void setIdentityInfo(UserIdentityInfo identityInfo) {
        this.identityInfo = identityInfo;
    }

    /**
     * <p>
     * Information about the user, including email address, first name, and last name.
     * </p>
     * 
     * @return Information about the user, including email address, first name, and last name.
     */

    public UserIdentityInfo getIdentityInfo() {
        return this.identityInfo;
    }

    /**
     * <p>
     * Information about the user, including email address, first name, and last name.
     * </p>
     * 
     * @param identityInfo
     *        Information about the user, including email address, first name, and last name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withIdentityInfo(UserIdentityInfo identityInfo) {
        setIdentityInfo(identityInfo);
        return this;
    }

    /**
     * <p>
     * Specifies the phone settings for the user, including <code>AfterContactWorkTimeLimit</code>,
     * <code>AutoAccept</code>, <code>DeskPhoneNumber</code>, and <code>PhoneType</code>.
     * </p>
     * 
     * @param phoneConfig
     *        Specifies the phone settings for the user, including <code>AfterContactWorkTimeLimit</code>,
     *        <code>AutoAccept</code>, <code>DeskPhoneNumber</code>, and <code>PhoneType</code>.
     */

    public void setPhoneConfig(UserPhoneConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
    }

    /**
     * <p>
     * Specifies the phone settings for the user, including <code>AfterContactWorkTimeLimit</code>,
     * <code>AutoAccept</code>, <code>DeskPhoneNumber</code>, and <code>PhoneType</code>.
     * </p>
     * 
     * @return Specifies the phone settings for the user, including <code>AfterContactWorkTimeLimit</code>,
     *         <code>AutoAccept</code>, <code>DeskPhoneNumber</code>, and <code>PhoneType</code>.
     */

    public UserPhoneConfig getPhoneConfig() {
        return this.phoneConfig;
    }

    /**
     * <p>
     * Specifies the phone settings for the user, including <code>AfterContactWorkTimeLimit</code>,
     * <code>AutoAccept</code>, <code>DeskPhoneNumber</code>, and <code>PhoneType</code>.
     * </p>
     * 
     * @param phoneConfig
     *        Specifies the phone settings for the user, including <code>AfterContactWorkTimeLimit</code>,
     *        <code>AutoAccept</code>, <code>DeskPhoneNumber</code>, and <code>PhoneType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withPhoneConfig(UserPhoneConfig phoneConfig) {
        setPhoneConfig(phoneConfig);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the user account in the directory service directory used for identity management. If
     * Amazon Connect is unable to access the existing directory, you can use the <code>DirectoryUserId</code> to
     * authenticate users. If you include the parameter, it is assumed that Amazon Connect cannot access the directory.
     * If the parameter is not included, the <code>UserIdentityInfo</code> is used to authenticate users from your
     * existing directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for identity management in Amazon Connect when
     * Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management
     * and include this parameter, an <code>InvalidRequestException</code> is returned.
     * </p>
     * 
     * @param directoryUserId
     *        The unique identifier for the user account in the directory service directory used for identity
     *        management. If Amazon Connect is unable to access the existing directory, you can use the
     *        <code>DirectoryUserId</code> to authenticate users. If you include the parameter, it is assumed that
     *        Amazon Connect cannot access the directory. If the parameter is not included, the
     *        <code>UserIdentityInfo</code> is used to authenticate users from your existing directory.</p>
     *        <p>
     *        This parameter is required if you are using an existing directory for identity management in Amazon
     *        Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for
     *        identity management and include this parameter, an <code>InvalidRequestException</code> is returned.
     */

    public void setDirectoryUserId(String directoryUserId) {
        this.directoryUserId = directoryUserId;
    }

    /**
     * <p>
     * The unique identifier for the user account in the directory service directory used for identity management. If
     * Amazon Connect is unable to access the existing directory, you can use the <code>DirectoryUserId</code> to
     * authenticate users. If you include the parameter, it is assumed that Amazon Connect cannot access the directory.
     * If the parameter is not included, the <code>UserIdentityInfo</code> is used to authenticate users from your
     * existing directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for identity management in Amazon Connect when
     * Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management
     * and include this parameter, an <code>InvalidRequestException</code> is returned.
     * </p>
     * 
     * @return The unique identifier for the user account in the directory service directory used for identity
     *         management. If Amazon Connect is unable to access the existing directory, you can use the
     *         <code>DirectoryUserId</code> to authenticate users. If you include the parameter, it is assumed that
     *         Amazon Connect cannot access the directory. If the parameter is not included, the
     *         <code>UserIdentityInfo</code> is used to authenticate users from your existing directory.</p>
     *         <p>
     *         This parameter is required if you are using an existing directory for identity management in Amazon
     *         Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for
     *         identity management and include this parameter, an <code>InvalidRequestException</code> is returned.
     */

    public String getDirectoryUserId() {
        return this.directoryUserId;
    }

    /**
     * <p>
     * The unique identifier for the user account in the directory service directory used for identity management. If
     * Amazon Connect is unable to access the existing directory, you can use the <code>DirectoryUserId</code> to
     * authenticate users. If you include the parameter, it is assumed that Amazon Connect cannot access the directory.
     * If the parameter is not included, the <code>UserIdentityInfo</code> is used to authenticate users from your
     * existing directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for identity management in Amazon Connect when
     * Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management
     * and include this parameter, an <code>InvalidRequestException</code> is returned.
     * </p>
     * 
     * @param directoryUserId
     *        The unique identifier for the user account in the directory service directory used for identity
     *        management. If Amazon Connect is unable to access the existing directory, you can use the
     *        <code>DirectoryUserId</code> to authenticate users. If you include the parameter, it is assumed that
     *        Amazon Connect cannot access the directory. If the parameter is not included, the
     *        <code>UserIdentityInfo</code> is used to authenticate users from your existing directory.</p>
     *        <p>
     *        This parameter is required if you are using an existing directory for identity management in Amazon
     *        Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for
     *        identity management and include this parameter, an <code>InvalidRequestException</code> is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withDirectoryUserId(String directoryUserId) {
        setDirectoryUserId(directoryUserId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the security profile to assign to the user created.
     * </p>
     * 
     * @return The unique identifier of the security profile to assign to the user created.
     */

    public java.util.List<String> getSecurityProfileIds() {
        return securityProfileIds;
    }

    /**
     * <p>
     * The unique identifier of the security profile to assign to the user created.
     * </p>
     * 
     * @param securityProfileIds
     *        The unique identifier of the security profile to assign to the user created.
     */

    public void setSecurityProfileIds(java.util.Collection<String> securityProfileIds) {
        if (securityProfileIds == null) {
            this.securityProfileIds = null;
            return;
        }

        this.securityProfileIds = new java.util.ArrayList<String>(securityProfileIds);
    }

    /**
     * <p>
     * The unique identifier of the security profile to assign to the user created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityProfileIds(java.util.Collection)} or {@link #withSecurityProfileIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityProfileIds
     *        The unique identifier of the security profile to assign to the user created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withSecurityProfileIds(String... securityProfileIds) {
        if (this.securityProfileIds == null) {
            setSecurityProfileIds(new java.util.ArrayList<String>(securityProfileIds.length));
        }
        for (String ele : securityProfileIds) {
            this.securityProfileIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifier of the security profile to assign to the user created.
     * </p>
     * 
     * @param securityProfileIds
     *        The unique identifier of the security profile to assign to the user created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withSecurityProfileIds(java.util.Collection<String> securityProfileIds) {
        setSecurityProfileIds(securityProfileIds);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the routing profile to assign to the user created.
     * </p>
     * 
     * @param routingProfileId
     *        The unique identifier for the routing profile to assign to the user created.
     */

    public void setRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
    }

    /**
     * <p>
     * The unique identifier for the routing profile to assign to the user created.
     * </p>
     * 
     * @return The unique identifier for the routing profile to assign to the user created.
     */

    public String getRoutingProfileId() {
        return this.routingProfileId;
    }

    /**
     * <p>
     * The unique identifier for the routing profile to assign to the user created.
     * </p>
     * 
     * @param routingProfileId
     *        The unique identifier for the routing profile to assign to the user created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withRoutingProfileId(String routingProfileId) {
        setRoutingProfileId(routingProfileId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the hierarchy group to assign to the user created.
     * </p>
     * 
     * @param hierarchyGroupId
     *        The unique identifier for the hierarchy group to assign to the user created.
     */

    public void setHierarchyGroupId(String hierarchyGroupId) {
        this.hierarchyGroupId = hierarchyGroupId;
    }

    /**
     * <p>
     * The unique identifier for the hierarchy group to assign to the user created.
     * </p>
     * 
     * @return The unique identifier for the hierarchy group to assign to the user created.
     */

    public String getHierarchyGroupId() {
        return this.hierarchyGroupId;
    }

    /**
     * <p>
     * The unique identifier for the hierarchy group to assign to the user created.
     * </p>
     * 
     * @param hierarchyGroupId
     *        The unique identifier for the hierarchy group to assign to the user created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withHierarchyGroupId(String hierarchyGroupId) {
        setHierarchyGroupId(hierarchyGroupId);
        return this;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select
     * Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in
     * the Overview section of your instance settings. For example, the instance ID is the set of characters at the end
     * of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * 
     * @param instanceId
     *        The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and
     *        select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is
     *        displayed in the Overview section of your instance settings. For example, the instance ID is the set of
     *        characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select
     * Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in
     * the Overview section of your instance settings. For example, the instance ID is the set of characters at the end
     * of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * 
     * @return The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console
     *         and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID
     *         is displayed in the Overview section of your instance settings. For example, the instance ID is the set
     *         of characters at the end of the instance ARN, after instance/, such as
     *         10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select
     * Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in
     * the Overview section of your instance settings. For example, the instance ID is the set of characters at the end
     * of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * 
     * @param instanceId
     *        The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and
     *        select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is
     *        displayed in the Overview section of your instance settings. For example, the instance ID is the set of
     *        characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword()).append(",");
        if (getIdentityInfo() != null)
            sb.append("IdentityInfo: ").append(getIdentityInfo()).append(",");
        if (getPhoneConfig() != null)
            sb.append("PhoneConfig: ").append(getPhoneConfig()).append(",");
        if (getDirectoryUserId() != null)
            sb.append("DirectoryUserId: ").append(getDirectoryUserId()).append(",");
        if (getSecurityProfileIds() != null)
            sb.append("SecurityProfileIds: ").append(getSecurityProfileIds()).append(",");
        if (getRoutingProfileId() != null)
            sb.append("RoutingProfileId: ").append(getRoutingProfileId()).append(",");
        if (getHierarchyGroupId() != null)
            sb.append("HierarchyGroupId: ").append(getHierarchyGroupId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserRequest == false)
            return false;
        CreateUserRequest other = (CreateUserRequest) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getIdentityInfo() == null ^ this.getIdentityInfo() == null)
            return false;
        if (other.getIdentityInfo() != null && other.getIdentityInfo().equals(this.getIdentityInfo()) == false)
            return false;
        if (other.getPhoneConfig() == null ^ this.getPhoneConfig() == null)
            return false;
        if (other.getPhoneConfig() != null && other.getPhoneConfig().equals(this.getPhoneConfig()) == false)
            return false;
        if (other.getDirectoryUserId() == null ^ this.getDirectoryUserId() == null)
            return false;
        if (other.getDirectoryUserId() != null && other.getDirectoryUserId().equals(this.getDirectoryUserId()) == false)
            return false;
        if (other.getSecurityProfileIds() == null ^ this.getSecurityProfileIds() == null)
            return false;
        if (other.getSecurityProfileIds() != null && other.getSecurityProfileIds().equals(this.getSecurityProfileIds()) == false)
            return false;
        if (other.getRoutingProfileId() == null ^ this.getRoutingProfileId() == null)
            return false;
        if (other.getRoutingProfileId() != null && other.getRoutingProfileId().equals(this.getRoutingProfileId()) == false)
            return false;
        if (other.getHierarchyGroupId() == null ^ this.getHierarchyGroupId() == null)
            return false;
        if (other.getHierarchyGroupId() != null && other.getHierarchyGroupId().equals(this.getHierarchyGroupId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getIdentityInfo() == null) ? 0 : getIdentityInfo().hashCode());
        hashCode = prime * hashCode + ((getPhoneConfig() == null) ? 0 : getPhoneConfig().hashCode());
        hashCode = prime * hashCode + ((getDirectoryUserId() == null) ? 0 : getDirectoryUserId().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileIds() == null) ? 0 : getSecurityProfileIds().hashCode());
        hashCode = prime * hashCode + ((getRoutingProfileId() == null) ? 0 : getRoutingProfileId().hashCode());
        hashCode = prime * hashCode + ((getHierarchyGroupId() == null) ? 0 : getHierarchyGroupId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserRequest clone() {
        return (CreateUserRequest) super.clone();
    }

}
