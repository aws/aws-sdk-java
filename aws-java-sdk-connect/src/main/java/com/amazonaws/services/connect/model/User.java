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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a user account for a Amazon Connect instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/User" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class User implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the user account.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user account.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The user name assigned to the user account.
     * </p>
     */
    private String username;
    /**
     * <p>
     * Information about the user identity.
     * </p>
     */
    private UserIdentityInfo identityInfo;
    /**
     * <p>
     * Information about the phone configuration for the user.
     * </p>
     */
    private UserPhoneConfig phoneConfig;
    /**
     * <p>
     * The identifier of the user account in the directory used for identity management.
     * </p>
     */
    private String directoryUserId;
    /**
     * <p>
     * The identifiers of the security profiles for the user.
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
     * The tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of the user account.
     * </p>
     * 
     * @param id
     *        The identifier of the user account.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the user account.
     * </p>
     * 
     * @return The identifier of the user account.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the user account.
     * </p>
     * 
     * @param id
     *        The identifier of the user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user account.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the user account.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user account.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user account.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The user name assigned to the user account.
     * </p>
     * 
     * @param username
     *        The user name assigned to the user account.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name assigned to the user account.
     * </p>
     * 
     * @return The user name assigned to the user account.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name assigned to the user account.
     * </p>
     * 
     * @param username
     *        The user name assigned to the user account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * Information about the user identity.
     * </p>
     * 
     * @param identityInfo
     *        Information about the user identity.
     */

    public void setIdentityInfo(UserIdentityInfo identityInfo) {
        this.identityInfo = identityInfo;
    }

    /**
     * <p>
     * Information about the user identity.
     * </p>
     * 
     * @return Information about the user identity.
     */

    public UserIdentityInfo getIdentityInfo() {
        return this.identityInfo;
    }

    /**
     * <p>
     * Information about the user identity.
     * </p>
     * 
     * @param identityInfo
     *        Information about the user identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withIdentityInfo(UserIdentityInfo identityInfo) {
        setIdentityInfo(identityInfo);
        return this;
    }

    /**
     * <p>
     * Information about the phone configuration for the user.
     * </p>
     * 
     * @param phoneConfig
     *        Information about the phone configuration for the user.
     */

    public void setPhoneConfig(UserPhoneConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
    }

    /**
     * <p>
     * Information about the phone configuration for the user.
     * </p>
     * 
     * @return Information about the phone configuration for the user.
     */

    public UserPhoneConfig getPhoneConfig() {
        return this.phoneConfig;
    }

    /**
     * <p>
     * Information about the phone configuration for the user.
     * </p>
     * 
     * @param phoneConfig
     *        Information about the phone configuration for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withPhoneConfig(UserPhoneConfig phoneConfig) {
        setPhoneConfig(phoneConfig);
        return this;
    }

    /**
     * <p>
     * The identifier of the user account in the directory used for identity management.
     * </p>
     * 
     * @param directoryUserId
     *        The identifier of the user account in the directory used for identity management.
     */

    public void setDirectoryUserId(String directoryUserId) {
        this.directoryUserId = directoryUserId;
    }

    /**
     * <p>
     * The identifier of the user account in the directory used for identity management.
     * </p>
     * 
     * @return The identifier of the user account in the directory used for identity management.
     */

    public String getDirectoryUserId() {
        return this.directoryUserId;
    }

    /**
     * <p>
     * The identifier of the user account in the directory used for identity management.
     * </p>
     * 
     * @param directoryUserId
     *        The identifier of the user account in the directory used for identity management.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withDirectoryUserId(String directoryUserId) {
        setDirectoryUserId(directoryUserId);
        return this;
    }

    /**
     * <p>
     * The identifiers of the security profiles for the user.
     * </p>
     * 
     * @return The identifiers of the security profiles for the user.
     */

    public java.util.List<String> getSecurityProfileIds() {
        return securityProfileIds;
    }

    /**
     * <p>
     * The identifiers of the security profiles for the user.
     * </p>
     * 
     * @param securityProfileIds
     *        The identifiers of the security profiles for the user.
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
     * The identifiers of the security profiles for the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityProfileIds(java.util.Collection)} or {@link #withSecurityProfileIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityProfileIds
     *        The identifiers of the security profiles for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withSecurityProfileIds(String... securityProfileIds) {
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
     * The identifiers of the security profiles for the user.
     * </p>
     * 
     * @param securityProfileIds
     *        The identifiers of the security profiles for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withSecurityProfileIds(java.util.Collection<String> securityProfileIds) {
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

    public User withRoutingProfileId(String routingProfileId) {
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

    public User withHierarchyGroupId(String hierarchyGroupId) {
        setHierarchyGroupId(hierarchyGroupId);
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see User#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public User addTagsEntry(String key, String value) {
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

    public User clearTagsEntries() {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
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

        if (obj instanceof User == false)
            return false;
        User other = (User) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getIdentityInfo() == null) ? 0 : getIdentityInfo().hashCode());
        hashCode = prime * hashCode + ((getPhoneConfig() == null) ? 0 : getPhoneConfig().hashCode());
        hashCode = prime * hashCode + ((getDirectoryUserId() == null) ? 0 : getDirectoryUserId().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileIds() == null) ? 0 : getSecurityProfileIds().hashCode());
        hashCode = prime * hashCode + ((getRoutingProfileId() == null) ? 0 : getRoutingProfileId().hashCode());
        hashCode = prime * hashCode + ((getHierarchyGroupId() == null) ? 0 : getHierarchyGroupId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.UserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
