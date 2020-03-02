/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The user name for the account. For instances not using SAML for identity management, the user name can include up
     * to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters
     * from [a-zA-Z0-9_-.\@]+.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The password for the user account. A password is required if you are using Amazon Connect for identity
     * management. Otherwise, it is an error to include a password.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The information about the identity of the user.
     * </p>
     */
    private UserIdentityInfo identityInfo;
    /**
     * <p>
     * The phone settings for the user.
     * </p>
     */
    private UserPhoneConfig phoneConfig;
    /**
     * <p>
     * The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access
     * the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume
     * that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate
     * users from your directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for identity management in Amazon Connect when
     * Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management
     * and include this parameter, an error is returned.
     * </p>
     */
    private String directoryUserId;
    /**
     * <p>
     * The identifier of the security profile for the user.
     * </p>
     */
    private java.util.List<String> securityProfileIds;
    /**
     * <p>
     * The identifier of the routing profile for the user.
     * </p>
     */
    private String routingProfileId;
    /**
     * <p>
     * The identifier of the hierarchy group for the user.
     * </p>
     */
    private String hierarchyGroupId;
    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The user name for the account. For instances not using SAML for identity management, the user name can include up
     * to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters
     * from [a-zA-Z0-9_-.\@]+.
     * </p>
     * 
     * @param username
     *        The user name for the account. For instances not using SAML for identity management, the user name can
     *        include up to 20 characters. If you are using SAML for identity management, the user name can include up
     *        to 64 characters from [a-zA-Z0-9_-.\@]+.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name for the account. For instances not using SAML for identity management, the user name can include up
     * to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters
     * from [a-zA-Z0-9_-.\@]+.
     * </p>
     * 
     * @return The user name for the account. For instances not using SAML for identity management, the user name can
     *         include up to 20 characters. If you are using SAML for identity management, the user name can include up
     *         to 64 characters from [a-zA-Z0-9_-.\@]+.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name for the account. For instances not using SAML for identity management, the user name can include up
     * to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters
     * from [a-zA-Z0-9_-.\@]+.
     * </p>
     * 
     * @param username
     *        The user name for the account. For instances not using SAML for identity management, the user name can
     *        include up to 20 characters. If you are using SAML for identity management, the user name can include up
     *        to 64 characters from [a-zA-Z0-9_-.\@]+.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The password for the user account. A password is required if you are using Amazon Connect for identity
     * management. Otherwise, it is an error to include a password.
     * </p>
     * 
     * @param password
     *        The password for the user account. A password is required if you are using Amazon Connect for identity
     *        management. Otherwise, it is an error to include a password.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the user account. A password is required if you are using Amazon Connect for identity
     * management. Otherwise, it is an error to include a password.
     * </p>
     * 
     * @return The password for the user account. A password is required if you are using Amazon Connect for identity
     *         management. Otherwise, it is an error to include a password.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password for the user account. A password is required if you are using Amazon Connect for identity
     * management. Otherwise, it is an error to include a password.
     * </p>
     * 
     * @param password
     *        The password for the user account. A password is required if you are using Amazon Connect for identity
     *        management. Otherwise, it is an error to include a password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The information about the identity of the user.
     * </p>
     * 
     * @param identityInfo
     *        The information about the identity of the user.
     */

    public void setIdentityInfo(UserIdentityInfo identityInfo) {
        this.identityInfo = identityInfo;
    }

    /**
     * <p>
     * The information about the identity of the user.
     * </p>
     * 
     * @return The information about the identity of the user.
     */

    public UserIdentityInfo getIdentityInfo() {
        return this.identityInfo;
    }

    /**
     * <p>
     * The information about the identity of the user.
     * </p>
     * 
     * @param identityInfo
     *        The information about the identity of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withIdentityInfo(UserIdentityInfo identityInfo) {
        setIdentityInfo(identityInfo);
        return this;
    }

    /**
     * <p>
     * The phone settings for the user.
     * </p>
     * 
     * @param phoneConfig
     *        The phone settings for the user.
     */

    public void setPhoneConfig(UserPhoneConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
    }

    /**
     * <p>
     * The phone settings for the user.
     * </p>
     * 
     * @return The phone settings for the user.
     */

    public UserPhoneConfig getPhoneConfig() {
        return this.phoneConfig;
    }

    /**
     * <p>
     * The phone settings for the user.
     * </p>
     * 
     * @param phoneConfig
     *        The phone settings for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withPhoneConfig(UserPhoneConfig phoneConfig) {
        setPhoneConfig(phoneConfig);
        return this;
    }

    /**
     * <p>
     * The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access
     * the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume
     * that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate
     * users from your directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for identity management in Amazon Connect when
     * Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management
     * and include this parameter, an error is returned.
     * </p>
     * 
     * @param directoryUserId
     *        The identifier of the user account in the directory used for identity management. If Amazon Connect cannot
     *        access the directory, you can specify this identifier to authenticate users. If you include the
     *        identifier, we assume that Amazon Connect cannot access the directory. Otherwise, the identity information
     *        is used to authenticate users from your directory.</p>
     *        <p>
     *        This parameter is required if you are using an existing directory for identity management in Amazon
     *        Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for
     *        identity management and include this parameter, an error is returned.
     */

    public void setDirectoryUserId(String directoryUserId) {
        this.directoryUserId = directoryUserId;
    }

    /**
     * <p>
     * The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access
     * the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume
     * that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate
     * users from your directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for identity management in Amazon Connect when
     * Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management
     * and include this parameter, an error is returned.
     * </p>
     * 
     * @return The identifier of the user account in the directory used for identity management. If Amazon Connect
     *         cannot access the directory, you can specify this identifier to authenticate users. If you include the
     *         identifier, we assume that Amazon Connect cannot access the directory. Otherwise, the identity
     *         information is used to authenticate users from your directory.</p>
     *         <p>
     *         This parameter is required if you are using an existing directory for identity management in Amazon
     *         Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for
     *         identity management and include this parameter, an error is returned.
     */

    public String getDirectoryUserId() {
        return this.directoryUserId;
    }

    /**
     * <p>
     * The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access
     * the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume
     * that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate
     * users from your directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for identity management in Amazon Connect when
     * Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management
     * and include this parameter, an error is returned.
     * </p>
     * 
     * @param directoryUserId
     *        The identifier of the user account in the directory used for identity management. If Amazon Connect cannot
     *        access the directory, you can specify this identifier to authenticate users. If you include the
     *        identifier, we assume that Amazon Connect cannot access the directory. Otherwise, the identity information
     *        is used to authenticate users from your directory.</p>
     *        <p>
     *        This parameter is required if you are using an existing directory for identity management in Amazon
     *        Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for
     *        identity management and include this parameter, an error is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withDirectoryUserId(String directoryUserId) {
        setDirectoryUserId(directoryUserId);
        return this;
    }

    /**
     * <p>
     * The identifier of the security profile for the user.
     * </p>
     * 
     * @return The identifier of the security profile for the user.
     */

    public java.util.List<String> getSecurityProfileIds() {
        return securityProfileIds;
    }

    /**
     * <p>
     * The identifier of the security profile for the user.
     * </p>
     * 
     * @param securityProfileIds
     *        The identifier of the security profile for the user.
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
     * The identifier of the security profile for the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityProfileIds(java.util.Collection)} or {@link #withSecurityProfileIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityProfileIds
     *        The identifier of the security profile for the user.
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
     * The identifier of the security profile for the user.
     * </p>
     * 
     * @param securityProfileIds
     *        The identifier of the security profile for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withSecurityProfileIds(java.util.Collection<String> securityProfileIds) {
        setSecurityProfileIds(securityProfileIds);
        return this;
    }

    /**
     * <p>
     * The identifier of the routing profile for the user.
     * </p>
     * 
     * @param routingProfileId
     *        The identifier of the routing profile for the user.
     */

    public void setRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
    }

    /**
     * <p>
     * The identifier of the routing profile for the user.
     * </p>
     * 
     * @return The identifier of the routing profile for the user.
     */

    public String getRoutingProfileId() {
        return this.routingProfileId;
    }

    /**
     * <p>
     * The identifier of the routing profile for the user.
     * </p>
     * 
     * @param routingProfileId
     *        The identifier of the routing profile for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withRoutingProfileId(String routingProfileId) {
        setRoutingProfileId(routingProfileId);
        return this;
    }

    /**
     * <p>
     * The identifier of the hierarchy group for the user.
     * </p>
     * 
     * @param hierarchyGroupId
     *        The identifier of the hierarchy group for the user.
     */

    public void setHierarchyGroupId(String hierarchyGroupId) {
        this.hierarchyGroupId = hierarchyGroupId;
    }

    /**
     * <p>
     * The identifier of the hierarchy group for the user.
     * </p>
     * 
     * @return The identifier of the hierarchy group for the user.
     */

    public String getHierarchyGroupId() {
        return this.hierarchyGroupId;
    }

    /**
     * <p>
     * The identifier of the hierarchy group for the user.
     * </p>
     * 
     * @param hierarchyGroupId
     *        The identifier of the hierarchy group for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withHierarchyGroupId(String hierarchyGroupId) {
        setHierarchyGroupId(hierarchyGroupId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @return One or more tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * 
     * @param tags
     *        One or more tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateUserRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserRequest clearTagsEntries() {
        this.tags = null;
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
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserRequest clone() {
        return (CreateUserRequest) super.clone();
    }

}
