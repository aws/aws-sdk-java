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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the returned users.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UserSearchSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserSearchSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The directory identifier of the user.
     * </p>
     */
    private String directoryUserId;
    /**
     * <p>
     * The identifier of the user's hierarchy group.
     * </p>
     */
    private String hierarchyGroupId;
    /**
     * <p>
     * The identifier of the user's summary.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The user's first name and last name.
     * </p>
     */
    private UserIdentityInfoLite identityInfo;

    private UserPhoneConfig phoneConfig;
    /**
     * <p>
     * The identifier of the user's routing profile.
     * </p>
     */
    private String routingProfileId;
    /**
     * <p>
     * The identifiers of the user's security profiles.
     * </p>
     */
    private java.util.List<String> securityProfileIds;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The name of the user.
     * </p>
     */
    private String username;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the user.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSearchSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The directory identifier of the user.
     * </p>
     * 
     * @param directoryUserId
     *        The directory identifier of the user.
     */

    public void setDirectoryUserId(String directoryUserId) {
        this.directoryUserId = directoryUserId;
    }

    /**
     * <p>
     * The directory identifier of the user.
     * </p>
     * 
     * @return The directory identifier of the user.
     */

    public String getDirectoryUserId() {
        return this.directoryUserId;
    }

    /**
     * <p>
     * The directory identifier of the user.
     * </p>
     * 
     * @param directoryUserId
     *        The directory identifier of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSearchSummary withDirectoryUserId(String directoryUserId) {
        setDirectoryUserId(directoryUserId);
        return this;
    }

    /**
     * <p>
     * The identifier of the user's hierarchy group.
     * </p>
     * 
     * @param hierarchyGroupId
     *        The identifier of the user's hierarchy group.
     */

    public void setHierarchyGroupId(String hierarchyGroupId) {
        this.hierarchyGroupId = hierarchyGroupId;
    }

    /**
     * <p>
     * The identifier of the user's hierarchy group.
     * </p>
     * 
     * @return The identifier of the user's hierarchy group.
     */

    public String getHierarchyGroupId() {
        return this.hierarchyGroupId;
    }

    /**
     * <p>
     * The identifier of the user's hierarchy group.
     * </p>
     * 
     * @param hierarchyGroupId
     *        The identifier of the user's hierarchy group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSearchSummary withHierarchyGroupId(String hierarchyGroupId) {
        setHierarchyGroupId(hierarchyGroupId);
        return this;
    }

    /**
     * <p>
     * The identifier of the user's summary.
     * </p>
     * 
     * @param id
     *        The identifier of the user's summary.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the user's summary.
     * </p>
     * 
     * @return The identifier of the user's summary.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the user's summary.
     * </p>
     * 
     * @param id
     *        The identifier of the user's summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSearchSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The user's first name and last name.
     * </p>
     * 
     * @param identityInfo
     *        The user's first name and last name.
     */

    public void setIdentityInfo(UserIdentityInfoLite identityInfo) {
        this.identityInfo = identityInfo;
    }

    /**
     * <p>
     * The user's first name and last name.
     * </p>
     * 
     * @return The user's first name and last name.
     */

    public UserIdentityInfoLite getIdentityInfo() {
        return this.identityInfo;
    }

    /**
     * <p>
     * The user's first name and last name.
     * </p>
     * 
     * @param identityInfo
     *        The user's first name and last name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSearchSummary withIdentityInfo(UserIdentityInfoLite identityInfo) {
        setIdentityInfo(identityInfo);
        return this;
    }

    /**
     * @param phoneConfig
     */

    public void setPhoneConfig(UserPhoneConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
    }

    /**
     * @return
     */

    public UserPhoneConfig getPhoneConfig() {
        return this.phoneConfig;
    }

    /**
     * @param phoneConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSearchSummary withPhoneConfig(UserPhoneConfig phoneConfig) {
        setPhoneConfig(phoneConfig);
        return this;
    }

    /**
     * <p>
     * The identifier of the user's routing profile.
     * </p>
     * 
     * @param routingProfileId
     *        The identifier of the user's routing profile.
     */

    public void setRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
    }

    /**
     * <p>
     * The identifier of the user's routing profile.
     * </p>
     * 
     * @return The identifier of the user's routing profile.
     */

    public String getRoutingProfileId() {
        return this.routingProfileId;
    }

    /**
     * <p>
     * The identifier of the user's routing profile.
     * </p>
     * 
     * @param routingProfileId
     *        The identifier of the user's routing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSearchSummary withRoutingProfileId(String routingProfileId) {
        setRoutingProfileId(routingProfileId);
        return this;
    }

    /**
     * <p>
     * The identifiers of the user's security profiles.
     * </p>
     * 
     * @return The identifiers of the user's security profiles.
     */

    public java.util.List<String> getSecurityProfileIds() {
        return securityProfileIds;
    }

    /**
     * <p>
     * The identifiers of the user's security profiles.
     * </p>
     * 
     * @param securityProfileIds
     *        The identifiers of the user's security profiles.
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
     * The identifiers of the user's security profiles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityProfileIds(java.util.Collection)} or {@link #withSecurityProfileIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityProfileIds
     *        The identifiers of the user's security profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSearchSummary withSecurityProfileIds(String... securityProfileIds) {
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
     * The identifiers of the user's security profiles.
     * </p>
     * 
     * @param securityProfileIds
     *        The identifiers of the user's security profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSearchSummary withSecurityProfileIds(java.util.Collection<String> securityProfileIds) {
        setSecurityProfileIds(securityProfileIds);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource. For example, { "tags":
     *         {"key1":"value1", "key2":"value2"} }.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSearchSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see UserSearchSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UserSearchSummary addTagsEntry(String key, String value) {
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

    public UserSearchSummary clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param username
     *        The name of the user.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @return The name of the user.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param username
     *        The name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSearchSummary withUsername(String username) {
        setUsername(username);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDirectoryUserId() != null)
            sb.append("DirectoryUserId: ").append(getDirectoryUserId()).append(",");
        if (getHierarchyGroupId() != null)
            sb.append("HierarchyGroupId: ").append(getHierarchyGroupId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIdentityInfo() != null)
            sb.append("IdentityInfo: ").append(getIdentityInfo()).append(",");
        if (getPhoneConfig() != null)
            sb.append("PhoneConfig: ").append(getPhoneConfig()).append(",");
        if (getRoutingProfileId() != null)
            sb.append("RoutingProfileId: ").append(getRoutingProfileId()).append(",");
        if (getSecurityProfileIds() != null)
            sb.append("SecurityProfileIds: ").append(getSecurityProfileIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserSearchSummary == false)
            return false;
        UserSearchSummary other = (UserSearchSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDirectoryUserId() == null ^ this.getDirectoryUserId() == null)
            return false;
        if (other.getDirectoryUserId() != null && other.getDirectoryUserId().equals(this.getDirectoryUserId()) == false)
            return false;
        if (other.getHierarchyGroupId() == null ^ this.getHierarchyGroupId() == null)
            return false;
        if (other.getHierarchyGroupId() != null && other.getHierarchyGroupId().equals(this.getHierarchyGroupId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIdentityInfo() == null ^ this.getIdentityInfo() == null)
            return false;
        if (other.getIdentityInfo() != null && other.getIdentityInfo().equals(this.getIdentityInfo()) == false)
            return false;
        if (other.getPhoneConfig() == null ^ this.getPhoneConfig() == null)
            return false;
        if (other.getPhoneConfig() != null && other.getPhoneConfig().equals(this.getPhoneConfig()) == false)
            return false;
        if (other.getRoutingProfileId() == null ^ this.getRoutingProfileId() == null)
            return false;
        if (other.getRoutingProfileId() != null && other.getRoutingProfileId().equals(this.getRoutingProfileId()) == false)
            return false;
        if (other.getSecurityProfileIds() == null ^ this.getSecurityProfileIds() == null)
            return false;
        if (other.getSecurityProfileIds() != null && other.getSecurityProfileIds().equals(this.getSecurityProfileIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDirectoryUserId() == null) ? 0 : getDirectoryUserId().hashCode());
        hashCode = prime * hashCode + ((getHierarchyGroupId() == null) ? 0 : getHierarchyGroupId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIdentityInfo() == null) ? 0 : getIdentityInfo().hashCode());
        hashCode = prime * hashCode + ((getPhoneConfig() == null) ? 0 : getPhoneConfig().hashCode());
        hashCode = prime * hashCode + ((getRoutingProfileId() == null) ? 0 : getRoutingProfileId().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileIds() == null) ? 0 : getSecurityProfileIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public UserSearchSummary clone() {
        try {
            return (UserSearchSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.UserSearchSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
