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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateSecurityProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecurityProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the security profile.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The permissions granted to a security profile. For a list of valid permissions, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security profile
     * permissions</a>.
     * </p>
     */
    private java.util.List<String> permissions;
    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     */
    private String securityProfileId;
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The list of tags that a security profile uses to restrict access to resources in Amazon Connect.
     * </p>
     */
    private java.util.Map<String, String> allowedAccessControlTags;
    /**
     * <p>
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
     * </p>
     */
    private java.util.List<String> tagRestrictedResources;

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

    public UpdateSecurityProfileRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The permissions granted to a security profile. For a list of valid permissions, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security profile
     * permissions</a>.
     * </p>
     * 
     * @return The permissions granted to a security profile. For a list of valid permissions, see <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security
     *         profile permissions</a>.
     */

    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * The permissions granted to a security profile. For a list of valid permissions, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security profile
     * permissions</a>.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to a security profile. For a list of valid permissions, see <a
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
     * The permissions granted to a security profile. For a list of valid permissions, see <a
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
     *        The permissions granted to a security profile. For a list of valid permissions, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security
     *        profile permissions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withPermissions(String... permissions) {
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
     * The permissions granted to a security profile. For a list of valid permissions, see <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security profile
     * permissions</a>.
     * </p>
     * 
     * @param permissions
     *        The permissions granted to a security profile. For a list of valid permissions, see <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html">List of security
     *        profile permissions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     * 
     * @param securityProfileId
     *        The identifier for the security profle.
     */

    public void setSecurityProfileId(String securityProfileId) {
        this.securityProfileId = securityProfileId;
    }

    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     * 
     * @return The identifier for the security profle.
     */

    public String getSecurityProfileId() {
        return this.securityProfileId;
    }

    /**
     * <p>
     * The identifier for the security profle.
     * </p>
     * 
     * @param securityProfileId
     *        The identifier for the security profle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withSecurityProfileId(String securityProfileId) {
        setSecurityProfileId(securityProfileId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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

    public UpdateSecurityProfileRequest withAllowedAccessControlTags(java.util.Map<String, String> allowedAccessControlTags) {
        setAllowedAccessControlTags(allowedAccessControlTags);
        return this;
    }

    /**
     * Add a single AllowedAccessControlTags entry
     *
     * @see UpdateSecurityProfileRequest#withAllowedAccessControlTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest addAllowedAccessControlTagsEntry(String key, String value) {
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

    public UpdateSecurityProfileRequest clearAllowedAccessControlTagsEntries() {
        this.allowedAccessControlTags = null;
        return this;
    }

    /**
     * <p>
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
     * </p>
     * 
     * @return The list of resources that a security profile applies tag restrictions to in Amazon Connect.
     */

    public java.util.List<String> getTagRestrictedResources() {
        return tagRestrictedResources;
    }

    /**
     * <p>
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
     * </p>
     * 
     * @param tagRestrictedResources
     *        The list of resources that a security profile applies tag restrictions to in Amazon Connect.
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
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagRestrictedResources(java.util.Collection)} or
     * {@link #withTagRestrictedResources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param tagRestrictedResources
     *        The list of resources that a security profile applies tag restrictions to in Amazon Connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withTagRestrictedResources(String... tagRestrictedResources) {
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
     * The list of resources that a security profile applies tag restrictions to in Amazon Connect.
     * </p>
     * 
     * @param tagRestrictedResources
     *        The list of resources that a security profile applies tag restrictions to in Amazon Connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityProfileRequest withTagRestrictedResources(java.util.Collection<String> tagRestrictedResources) {
        setTagRestrictedResources(tagRestrictedResources);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getSecurityProfileId() != null)
            sb.append("SecurityProfileId: ").append(getSecurityProfileId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getAllowedAccessControlTags() != null)
            sb.append("AllowedAccessControlTags: ").append(getAllowedAccessControlTags()).append(",");
        if (getTagRestrictedResources() != null)
            sb.append("TagRestrictedResources: ").append(getTagRestrictedResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecurityProfileRequest == false)
            return false;
        UpdateSecurityProfileRequest other = (UpdateSecurityProfileRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getSecurityProfileId() == null ^ this.getSecurityProfileId() == null)
            return false;
        if (other.getSecurityProfileId() != null && other.getSecurityProfileId().equals(this.getSecurityProfileId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAllowedAccessControlTags() == null ^ this.getAllowedAccessControlTags() == null)
            return false;
        if (other.getAllowedAccessControlTags() != null && other.getAllowedAccessControlTags().equals(this.getAllowedAccessControlTags()) == false)
            return false;
        if (other.getTagRestrictedResources() == null ^ this.getTagRestrictedResources() == null)
            return false;
        if (other.getTagRestrictedResources() != null && other.getTagRestrictedResources().equals(this.getTagRestrictedResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileId() == null) ? 0 : getSecurityProfileId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAllowedAccessControlTags() == null) ? 0 : getAllowedAccessControlTags().hashCode());
        hashCode = prime * hashCode + ((getTagRestrictedResources() == null) ? 0 : getTagRestrictedResources().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSecurityProfileRequest clone() {
        return (UpdateSecurityProfileRequest) super.clone();
    }

}
