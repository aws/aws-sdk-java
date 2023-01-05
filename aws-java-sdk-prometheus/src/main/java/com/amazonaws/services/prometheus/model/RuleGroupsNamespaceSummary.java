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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a summary of the rule groups namespace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/RuleGroupsNamespaceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleGroupsNamespaceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this rule groups namespace.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time when the rule groups namespace was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time when the rule groups namespace was modified.
     * </p>
     */
    private java.util.Date modifiedAt;
    /**
     * <p>
     * The rule groups namespace name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of rule groups namespace.
     * </p>
     */
    private RuleGroupsNamespaceStatus status;
    /**
     * <p>
     * The tags of this rule groups namespace.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this rule groups namespace.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of this rule groups namespace.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this rule groups namespace.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of this rule groups namespace.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this rule groups namespace.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of this rule groups namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupsNamespaceSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time when the rule groups namespace was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the rule groups namespace was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the rule groups namespace was created.
     * </p>
     * 
     * @return The time when the rule groups namespace was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the rule groups namespace was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the rule groups namespace was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupsNamespaceSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time when the rule groups namespace was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time when the rule groups namespace was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * The time when the rule groups namespace was modified.
     * </p>
     * 
     * @return The time when the rule groups namespace was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * The time when the rule groups namespace was modified.
     * </p>
     * 
     * @param modifiedAt
     *        The time when the rule groups namespace was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupsNamespaceSummary withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * <p>
     * The rule groups namespace name.
     * </p>
     * 
     * @param name
     *        The rule groups namespace name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The rule groups namespace name.
     * </p>
     * 
     * @return The rule groups namespace name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The rule groups namespace name.
     * </p>
     * 
     * @param name
     *        The rule groups namespace name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupsNamespaceSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of rule groups namespace.
     * </p>
     * 
     * @param status
     *        The status of rule groups namespace.
     */

    public void setStatus(RuleGroupsNamespaceStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of rule groups namespace.
     * </p>
     * 
     * @return The status of rule groups namespace.
     */

    public RuleGroupsNamespaceStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of rule groups namespace.
     * </p>
     * 
     * @param status
     *        The status of rule groups namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupsNamespaceSummary withStatus(RuleGroupsNamespaceStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The tags of this rule groups namespace.
     * </p>
     * 
     * @return The tags of this rule groups namespace.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of this rule groups namespace.
     * </p>
     * 
     * @param tags
     *        The tags of this rule groups namespace.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of this rule groups namespace.
     * </p>
     * 
     * @param tags
     *        The tags of this rule groups namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupsNamespaceSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see RuleGroupsNamespaceSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RuleGroupsNamespaceSummary addTagsEntry(String key, String value) {
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

    public RuleGroupsNamespaceSummary clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof RuleGroupsNamespaceSummary == false)
            return false;
        RuleGroupsNamespaceSummary other = (RuleGroupsNamespaceSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public RuleGroupsNamespaceSummary clone() {
        try {
            return (RuleGroupsNamespaceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.prometheus.model.transform.RuleGroupsNamespaceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
