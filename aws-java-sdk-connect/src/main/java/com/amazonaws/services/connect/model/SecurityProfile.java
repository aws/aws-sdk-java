/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about a security profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SecurityProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the security profile.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The organization resource identifier for the security profile.
     * </p>
     */
    private String organizationResourceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secruity profile.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name for the security profile.
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
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier for the security profile.
     * </p>
     * 
     * @param id
     *        The identifier for the security profile.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the security profile.
     * </p>
     * 
     * @return The identifier for the security profile.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the security profile.
     * </p>
     * 
     * @param id
     *        The identifier for the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfile withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The organization resource identifier for the security profile.
     * </p>
     * 
     * @param organizationResourceId
     *        The organization resource identifier for the security profile.
     */

    public void setOrganizationResourceId(String organizationResourceId) {
        this.organizationResourceId = organizationResourceId;
    }

    /**
     * <p>
     * The organization resource identifier for the security profile.
     * </p>
     * 
     * @return The organization resource identifier for the security profile.
     */

    public String getOrganizationResourceId() {
        return this.organizationResourceId;
    }

    /**
     * <p>
     * The organization resource identifier for the security profile.
     * </p>
     * 
     * @param organizationResourceId
     *        The organization resource identifier for the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfile withOrganizationResourceId(String organizationResourceId) {
        setOrganizationResourceId(organizationResourceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secruity profile.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the secruity profile.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secruity profile.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the secruity profile.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the secruity profile.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the secruity profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfile withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name for the security profile.
     * </p>
     * 
     * @param securityProfileName
     *        The name for the security profile.
     */

    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name for the security profile.
     * </p>
     * 
     * @return The name for the security profile.
     */

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    /**
     * <p>
     * The name for the security profile.
     * </p>
     * 
     * @param securityProfileName
     *        The name for the security profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfile withSecurityProfileName(String securityProfileName) {
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

    public SecurityProfile withDescription(String description) {
        setDescription(description);
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

    public SecurityProfile withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see SecurityProfile#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfile addTagsEntry(String key, String value) {
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

    public SecurityProfile clearTagsEntries() {
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
        if (getOrganizationResourceId() != null)
            sb.append("OrganizationResourceId: ").append(getOrganizationResourceId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getSecurityProfileName() != null)
            sb.append("SecurityProfileName: ").append(getSecurityProfileName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof SecurityProfile == false)
            return false;
        SecurityProfile other = (SecurityProfile) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getOrganizationResourceId() == null ^ this.getOrganizationResourceId() == null)
            return false;
        if (other.getOrganizationResourceId() != null && other.getOrganizationResourceId().equals(this.getOrganizationResourceId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        hashCode = prime * hashCode + ((getOrganizationResourceId() == null) ? 0 : getOrganizationResourceId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public SecurityProfile clone() {
        try {
            return (SecurityProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.SecurityProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
