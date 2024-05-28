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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateSecurityProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSecurityProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the security profile.
     * </p>
     */
    private String securityProfileName;
    /**
     * <p>
     * The description of the security profile.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Permissions assigned to the security profile. For a list of valid permissions, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security profile
     * permissions</a>.
     * </p>
     */
    private java.util.List<String> permissions;
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The list of tags that a security profile uses to restrict access to resources in Amazon Connect.
     * </p>
     */
    private java.util.Map<String, String> allowedAccessControlTags;
    /**
     * <p>
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect. Following are
     * acceptable ResourceNames: <code>User</code> | <code>SecurityProfile</code> | <code>Queue</code> |
     * <code>RoutingProfile</code>
     * </p>
     */
    private java.util.List<String> tagRestrictedResources;
    /**
     * <p>
     * A list of third-party applications that the security profile will give access to.
     * </p>
     */
    private java.util.List<Application> applications;
    /**
     * <p>
     * The list of resources that a security profile applies hierarchy restrictions to in Amazon Connect. Following are
     * acceptable ResourceNames: <code>User</code>.
     * </p>
     */
    private java.util.List<String> hierarchyRestrictedResources;
    /**
     * <p>
     * The identifier of the hierarchy group that a security profile uses to restrict access to resources in Amazon
     * Connect.
     * </p>
     */
    private String allowedAccessControlHierarchyGroupId;

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * 
     * @param securityProfileName
     *        The name of the security profile.
     */

    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * 
     * @return The name of the security profile.
     */

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * 
     * @param securityProfileName
     *        The name of the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withSecurityProfileName(String securityProfileName) {
        setSecurityProfileName(securityProfileName);
        return this;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * 
     * @param description
     *        The description of the security profile.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * 
     * @return The description of the security profile.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * 
     * @param description
     *        The description of the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Permissions assigned to the security profile. For a list of valid permissions, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security profile
     * permissions</a>.
     * </p>
     * 
     * @return Permissions assigned to the security profile. For a list of valid permissions, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security
     *         profile permissions</a>.
     */

    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * Permissions assigned to the security profile. For a list of valid permissions, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security profile
     * permissions</a>.
     * </p>
     * 
     * @param permissions
     *        Permissions assigned to the security profile. For a list of valid permissions, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security
     *        profile permissions</a>.
     */

    public void setPermissions(java.util.Collection<String> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<String>(permissions);
    }

    /**
     * <p>
     * Permissions assigned to the security profile. For a list of valid permissions, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security profile
     * permissions</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        Permissions assigned to the security profile. For a list of valid permissions, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security
     *        profile permissions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withPermissions(String... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<String>(permissions.length));
        }
        for (String ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Permissions assigned to the security profile. For a list of valid permissions, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security profile
     * permissions</a>.
     * </p>
     * 
     * @param permissions
     *        Permissions assigned to the security profile. For a list of valid permissions, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security
     *        profile permissions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *         ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *         {"key1":"value1", "key2":"value2"} }.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *        {"key1":"value1", "key2":"value2"} }.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSecurityProfileRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest addTagsEntry(String key, String value) {
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

    public CreateSecurityProfileRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The list of tags that a security profile uses to restrict access to resources in Amazon Connect.
     * </p>
     * 
     * @return The list of tags that a security profile uses to restrict access to resources in Amazon Connect.
     */

    public java.util.Map<String, String> getAllowedAccessControlTags() {
        return allowedAccessControlTags;
    }

    /**
     * <p>
     * The list of tags that a security profile uses to restrict access to resources in Amazon Connect.
     * </p>
     * 
     * @param allowedAccessControlTags
     *        The list of tags that a security profile uses to restrict access to resources in Amazon Connect.
     */

    public void setAllowedAccessControlTags(java.util.Map<String, String> allowedAccessControlTags) {
        this.allowedAccessControlTags = allowedAccessControlTags;
    }

    /**
     * <p>
     * The list of tags that a security profile uses to restrict access to resources in Amazon Connect.
     * </p>
     * 
     * @param allowedAccessControlTags
     *        The list of tags that a security profile uses to restrict access to resources in Amazon Connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withAllowedAccessControlTags(java.util.Map<String, String> allowedAccessControlTags) {
        setAllowedAccessControlTags(allowedAccessControlTags);
        return this;
    }

    /**
     * Add a single AllowedAccessControlTags entry
     *
     * @see CreateSecurityProfileRequest#withAllowedAccessControlTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest addAllowedAccessControlTagsEntry(String key, String value) {
        if (null == this.allowedAccessControlTags) {
            this.allowedAccessControlTags = new java.util.HashMap<String, String>();
        }
        if (this.allowedAccessControlTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.allowedAccessControlTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AllowedAccessControlTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest clearAllowedAccessControlTagsEntries() {
        this.allowedAccessControlTags = null;
        return this;
    }

    /**
     * <p>
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect. Following are
     * acceptable ResourceNames: <code>User</code> | <code>SecurityProfile</code> | <code>Queue</code> |
     * <code>RoutingProfile</code>
     * </p>
     * 
     * @return The list of resources that a security profile applies tag restrictions to in Amazon Connect. Following
     *         are acceptable ResourceNames: <code>User</code> | <code>SecurityProfile</code> | <code>Queue</code> |
     *         <code>RoutingProfile</code>
     */

    public java.util.List<String> getTagRestrictedResources() {
        return tagRestrictedResources;
    }

    /**
     * <p>
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect. Following are
     * acceptable ResourceNames: <code>User</code> | <code>SecurityProfile</code> | <code>Queue</code> |
     * <code>RoutingProfile</code>
     * </p>
     * 
     * @param tagRestrictedResources
     *        The list of resources that a security profile applies tag restrictions to in Amazon Connect. Following are
     *        acceptable ResourceNames: <code>User</code> | <code>SecurityProfile</code> | <code>Queue</code> |
     *        <code>RoutingProfile</code>
     */

    public void setTagRestrictedResources(java.util.Collection<String> tagRestrictedResources) {
        if (tagRestrictedResources == null) {
            this.tagRestrictedResources = null;
            return;
        }

        this.tagRestrictedResources = new java.util.ArrayList<String>(tagRestrictedResources);
    }

    /**
     * <p>
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect. Following are
     * acceptable ResourceNames: <code>User</code> | <code>SecurityProfile</code> | <code>Queue</code> |
     * <code>RoutingProfile</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagRestrictedResources(java.util.Collection)} or
     * {@link #withTagRestrictedResources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param tagRestrictedResources
     *        The list of resources that a security profile applies tag restrictions to in Amazon Connect. Following are
     *        acceptable ResourceNames: <code>User</code> | <code>SecurityProfile</code> | <code>Queue</code> |
     *        <code>RoutingProfile</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withTagRestrictedResources(String... tagRestrictedResources) {
        if (this.tagRestrictedResources == null) {
            setTagRestrictedResources(new java.util.ArrayList<String>(tagRestrictedResources.length));
        }
        for (String ele : tagRestrictedResources) {
            this.tagRestrictedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect. Following are
     * acceptable ResourceNames: <code>User</code> | <code>SecurityProfile</code> | <code>Queue</code> |
     * <code>RoutingProfile</code>
     * </p>
     * 
     * @param tagRestrictedResources
     *        The list of resources that a security profile applies tag restrictions to in Amazon Connect. Following are
     *        acceptable ResourceNames: <code>User</code> | <code>SecurityProfile</code> | <code>Queue</code> |
     *        <code>RoutingProfile</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withTagRestrictedResources(java.util.Collection<String> tagRestrictedResources) {
        setTagRestrictedResources(tagRestrictedResources);
        return this;
    }

    /**
     * <p>
     * A list of third-party applications that the security profile will give access to.
     * </p>
     * 
     * @return A list of third-party applications that the security profile will give access to.
     */

    public java.util.List<Application> getApplications() {
        return applications;
    }

    /**
     * <p>
     * A list of third-party applications that the security profile will give access to.
     * </p>
     * 
     * @param applications
     *        A list of third-party applications that the security profile will give access to.
     */

    public void setApplications(java.util.Collection<Application> applications) {
        if (applications == null) {
            this.applications = null;
            return;
        }

        this.applications = new java.util.ArrayList<Application>(applications);
    }

    /**
     * <p>
     * A list of third-party applications that the security profile will give access to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplications(java.util.Collection)} or {@link #withApplications(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param applications
     *        A list of third-party applications that the security profile will give access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withApplications(Application... applications) {
        if (this.applications == null) {
            setApplications(new java.util.ArrayList<Application>(applications.length));
        }
        for (Application ele : applications) {
            this.applications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of third-party applications that the security profile will give access to.
     * </p>
     * 
     * @param applications
     *        A list of third-party applications that the security profile will give access to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withApplications(java.util.Collection<Application> applications) {
        setApplications(applications);
        return this;
    }

    /**
     * <p>
     * The list of resources that a security profile applies hierarchy restrictions to in Amazon Connect. Following are
     * acceptable ResourceNames: <code>User</code>.
     * </p>
     * 
     * @return The list of resources that a security profile applies hierarchy restrictions to in Amazon Connect.
     *         Following are acceptable ResourceNames: <code>User</code>.
     */

    public java.util.List<String> getHierarchyRestrictedResources() {
        return hierarchyRestrictedResources;
    }

    /**
     * <p>
     * The list of resources that a security profile applies hierarchy restrictions to in Amazon Connect. Following are
     * acceptable ResourceNames: <code>User</code>.
     * </p>
     * 
     * @param hierarchyRestrictedResources
     *        The list of resources that a security profile applies hierarchy restrictions to in Amazon Connect.
     *        Following are acceptable ResourceNames: <code>User</code>.
     */

    public void setHierarchyRestrictedResources(java.util.Collection<String> hierarchyRestrictedResources) {
        if (hierarchyRestrictedResources == null) {
            this.hierarchyRestrictedResources = null;
            return;
        }

        this.hierarchyRestrictedResources = new java.util.ArrayList<String>(hierarchyRestrictedResources);
    }

    /**
     * <p>
     * The list of resources that a security profile applies hierarchy restrictions to in Amazon Connect. Following are
     * acceptable ResourceNames: <code>User</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHierarchyRestrictedResources(java.util.Collection)} or
     * {@link #withHierarchyRestrictedResources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param hierarchyRestrictedResources
     *        The list of resources that a security profile applies hierarchy restrictions to in Amazon Connect.
     *        Following are acceptable ResourceNames: <code>User</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withHierarchyRestrictedResources(String... hierarchyRestrictedResources) {
        if (this.hierarchyRestrictedResources == null) {
            setHierarchyRestrictedResources(new java.util.ArrayList<String>(hierarchyRestrictedResources.length));
        }
        for (String ele : hierarchyRestrictedResources) {
            this.hierarchyRestrictedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of resources that a security profile applies hierarchy restrictions to in Amazon Connect. Following are
     * acceptable ResourceNames: <code>User</code>.
     * </p>
     * 
     * @param hierarchyRestrictedResources
     *        The list of resources that a security profile applies hierarchy restrictions to in Amazon Connect.
     *        Following are acceptable ResourceNames: <code>User</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withHierarchyRestrictedResources(java.util.Collection<String> hierarchyRestrictedResources) {
        setHierarchyRestrictedResources(hierarchyRestrictedResources);
        return this;
    }

    /**
     * <p>
     * The identifier of the hierarchy group that a security profile uses to restrict access to resources in Amazon
     * Connect.
     * </p>
     * 
     * @param allowedAccessControlHierarchyGroupId
     *        The identifier of the hierarchy group that a security profile uses to restrict access to resources in
     *        Amazon Connect.
     */

    public void setAllowedAccessControlHierarchyGroupId(String allowedAccessControlHierarchyGroupId) {
        this.allowedAccessControlHierarchyGroupId = allowedAccessControlHierarchyGroupId;
    }

    /**
     * <p>
     * The identifier of the hierarchy group that a security profile uses to restrict access to resources in Amazon
     * Connect.
     * </p>
     * 
     * @return The identifier of the hierarchy group that a security profile uses to restrict access to resources in
     *         Amazon Connect.
     */

    public String getAllowedAccessControlHierarchyGroupId() {
        return this.allowedAccessControlHierarchyGroupId;
    }

    /**
     * <p>
     * The identifier of the hierarchy group that a security profile uses to restrict access to resources in Amazon
     * Connect.
     * </p>
     * 
     * @param allowedAccessControlHierarchyGroupId
     *        The identifier of the hierarchy group that a security profile uses to restrict access to resources in
     *        Amazon Connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityProfileRequest withAllowedAccessControlHierarchyGroupId(String allowedAccessControlHierarchyGroupId) {
        setAllowedAccessControlHierarchyGroupId(allowedAccessControlHierarchyGroupId);
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
        if (getSecurityProfileName() != null)
            sb.append("SecurityProfileName: ").append(getSecurityProfileName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAllowedAccessControlTags() != null)
            sb.append("AllowedAccessControlTags: ").append(getAllowedAccessControlTags()).append(",");
        if (getTagRestrictedResources() != null)
            sb.append("TagRestrictedResources: ").append(getTagRestrictedResources()).append(",");
        if (getApplications() != null)
            sb.append("Applications: ").append(getApplications()).append(",");
        if (getHierarchyRestrictedResources() != null)
            sb.append("HierarchyRestrictedResources: ").append(getHierarchyRestrictedResources()).append(",");
        if (getAllowedAccessControlHierarchyGroupId() != null)
            sb.append("AllowedAccessControlHierarchyGroupId: ").append(getAllowedAccessControlHierarchyGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSecurityProfileRequest == false)
            return false;
        CreateSecurityProfileRequest other = (CreateSecurityProfileRequest) obj;
        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAllowedAccessControlTags() == null ^ this.getAllowedAccessControlTags() == null)
            return false;
        if (other.getAllowedAccessControlTags() != null && other.getAllowedAccessControlTags().equals(this.getAllowedAccessControlTags()) == false)
            return false;
        if (other.getTagRestrictedResources() == null ^ this.getTagRestrictedResources() == null)
            return false;
        if (other.getTagRestrictedResources() != null && other.getTagRestrictedResources().equals(this.getTagRestrictedResources()) == false)
            return false;
        if (other.getApplications() == null ^ this.getApplications() == null)
            return false;
        if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false)
            return false;
        if (other.getHierarchyRestrictedResources() == null ^ this.getHierarchyRestrictedResources() == null)
            return false;
        if (other.getHierarchyRestrictedResources() != null && other.getHierarchyRestrictedResources().equals(this.getHierarchyRestrictedResources()) == false)
            return false;
        if (other.getAllowedAccessControlHierarchyGroupId() == null ^ this.getAllowedAccessControlHierarchyGroupId() == null)
            return false;
        if (other.getAllowedAccessControlHierarchyGroupId() != null
                && other.getAllowedAccessControlHierarchyGroupId().equals(this.getAllowedAccessControlHierarchyGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAllowedAccessControlTags() == null) ? 0 : getAllowedAccessControlTags().hashCode());
        hashCode = prime * hashCode + ((getTagRestrictedResources() == null) ? 0 : getTagRestrictedResources().hashCode());
        hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode());
        hashCode = prime * hashCode + ((getHierarchyRestrictedResources() == null) ? 0 : getHierarchyRestrictedResources().hashCode());
        hashCode = prime * hashCode + ((getAllowedAccessControlHierarchyGroupId() == null) ? 0 : getAllowedAccessControlHierarchyGroupId().hashCode());
        return hashCode;
    }

    @Override
    public CreateSecurityProfileRequest clone() {
        return (CreateSecurityProfileRequest) super.clone();
    }

}
