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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata about the ruleset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/RulesetItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RulesetItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the ruleset.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the ruleset.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The date and time that the ruleset was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The description of the ruleset.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last modified the ruleset.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The modification date and time of the ruleset.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The name of the ruleset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ruleset.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The number of rules that are defined in the ruleset.
     * </p>
     */
    private Integer ruleCount;
    /**
     * <p>
     * Metadata tags that have been applied to the ruleset.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     * </p>
     */
    private String targetArn;

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the ruleset.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that owns the ruleset.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the ruleset.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that owns the ruleset.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the ruleset.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that owns the ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesetItem withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the ruleset.
     * </p>
     * 
     * @param createdBy
     *        The Amazon Resource Name (ARN) of the user who created the ruleset.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the ruleset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who created the ruleset.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the ruleset.
     * </p>
     * 
     * @param createdBy
     *        The Amazon Resource Name (ARN) of the user who created the ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesetItem withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The date and time that the ruleset was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the ruleset was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time that the ruleset was created.
     * </p>
     * 
     * @return The date and time that the ruleset was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time that the ruleset was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the ruleset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesetItem withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The description of the ruleset.
     * </p>
     * 
     * @param description
     *        The description of the ruleset.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the ruleset.
     * </p>
     * 
     * @return The description of the ruleset.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the ruleset.
     * </p>
     * 
     * @param description
     *        The description of the ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesetItem withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last modified the ruleset.
     * </p>
     * 
     * @param lastModifiedBy
     *        The Amazon Resource Name (ARN) of the user who last modified the ruleset.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last modified the ruleset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who last modified the ruleset.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last modified the ruleset.
     * </p>
     * 
     * @param lastModifiedBy
     *        The Amazon Resource Name (ARN) of the user who last modified the ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesetItem withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The modification date and time of the ruleset.
     * </p>
     * 
     * @param lastModifiedDate
     *        The modification date and time of the ruleset.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The modification date and time of the ruleset.
     * </p>
     * 
     * @return The modification date and time of the ruleset.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The modification date and time of the ruleset.
     * </p>
     * 
     * @param lastModifiedDate
     *        The modification date and time of the ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesetItem withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The name of the ruleset.
     * </p>
     * 
     * @param name
     *        The name of the ruleset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ruleset.
     * </p>
     * 
     * @return The name of the ruleset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the ruleset.
     * </p>
     * 
     * @param name
     *        The name of the ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesetItem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ruleset.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) for the ruleset.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ruleset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the ruleset.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ruleset.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) for the ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesetItem withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The number of rules that are defined in the ruleset.
     * </p>
     * 
     * @param ruleCount
     *        The number of rules that are defined in the ruleset.
     */

    public void setRuleCount(Integer ruleCount) {
        this.ruleCount = ruleCount;
    }

    /**
     * <p>
     * The number of rules that are defined in the ruleset.
     * </p>
     * 
     * @return The number of rules that are defined in the ruleset.
     */

    public Integer getRuleCount() {
        return this.ruleCount;
    }

    /**
     * <p>
     * The number of rules that are defined in the ruleset.
     * </p>
     * 
     * @param ruleCount
     *        The number of rules that are defined in the ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesetItem withRuleCount(Integer ruleCount) {
        setRuleCount(ruleCount);
        return this;
    }

    /**
     * <p>
     * Metadata tags that have been applied to the ruleset.
     * </p>
     * 
     * @return Metadata tags that have been applied to the ruleset.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata tags that have been applied to the ruleset.
     * </p>
     * 
     * @param tags
     *        Metadata tags that have been applied to the ruleset.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata tags that have been applied to the ruleset.
     * </p>
     * 
     * @param tags
     *        Metadata tags that have been applied to the ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesetItem withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see RulesetItem#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RulesetItem addTagsEntry(String key, String value) {
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

    public RulesetItem clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) of a resource (dataset) that the ruleset is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RulesetItem withTargetArn(String targetArn) {
        setTargetArn(targetArn);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getRuleCount() != null)
            sb.append("RuleCount: ").append(getRuleCount()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RulesetItem == false)
            return false;
        RulesetItem other = (RulesetItem) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getRuleCount() == null ^ this.getRuleCount() == null)
            return false;
        if (other.getRuleCount() != null && other.getRuleCount().equals(this.getRuleCount()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getRuleCount() == null) ? 0 : getRuleCount().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        return hashCode;
    }

    @Override
    public RulesetItem clone() {
        try {
            return (RulesetItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.RulesetItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
