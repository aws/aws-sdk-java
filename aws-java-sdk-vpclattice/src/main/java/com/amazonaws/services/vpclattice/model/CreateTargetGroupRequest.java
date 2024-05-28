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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateTargetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTargetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The target group configuration.
     * </p>
     */
    private TargetGroupConfig config;
    /**
     * <p>
     * The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The tags for the target group.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The type of target group.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *        retry a request that completed successfully using the same client token and parameters, the retry succeeds
     *        without performing any actions. If the parameters aren't identical, the retry fails.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *         retry a request that completed successfully using the same client token and parameters, the retry
     *         succeeds without performing any actions. If the parameters aren't identical, the retry fails.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *        retry a request that completed successfully using the same client token and parameters, the retry succeeds
     *        without performing any actions. If the parameters aren't identical, the retry fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The target group configuration.
     * </p>
     * 
     * @param config
     *        The target group configuration.
     */

    public void setConfig(TargetGroupConfig config) {
        this.config = config;
    }

    /**
     * <p>
     * The target group configuration.
     * </p>
     * 
     * @return The target group configuration.
     */

    public TargetGroupConfig getConfig() {
        return this.config;
    }

    /**
     * <p>
     * The target group configuration.
     * </p>
     * 
     * @param config
     *        The target group configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withConfig(TargetGroupConfig config) {
        setConfig(config);
        return this;
    }

    /**
     * <p>
     * The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @param name
     *        The name of the target group. The name must be unique within the account. The valid characters are a-z,
     *        0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     *        hyphen.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @return The name of the target group. The name must be unique within the account. The valid characters are a-z,
     *         0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     *         hyphen.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @param name
     *        The name of the target group. The name must be unique within the account. The valid characters are a-z,
     *        0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     *        hyphen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The tags for the target group.
     * </p>
     * 
     * @return The tags for the target group.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the target group.
     * </p>
     * 
     * @param tags
     *        The tags for the target group.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the target group.
     * </p>
     * 
     * @param tags
     *        The tags for the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateTargetGroupRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateTargetGroupRequest addTagsEntry(String key, String value) {
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

    public CreateTargetGroupRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of target group.
     * </p>
     * 
     * @param type
     *        The type of target group.
     * @see TargetGroupType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of target group.
     * </p>
     * 
     * @return The type of target group.
     * @see TargetGroupType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of target group.
     * </p>
     * 
     * @param type
     *        The type of target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupType
     */

    public CreateTargetGroupRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of target group.
     * </p>
     * 
     * @param type
     *        The type of target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetGroupType
     */

    public CreateTargetGroupRequest withType(TargetGroupType type) {
        this.type = type.toString();
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getConfig() != null)
            sb.append("Config: ").append(getConfig()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTargetGroupRequest == false)
            return false;
        CreateTargetGroupRequest other = (CreateTargetGroupRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateTargetGroupRequest clone() {
        return (CreateTargetGroupRequest) super.clone();
    }

}
