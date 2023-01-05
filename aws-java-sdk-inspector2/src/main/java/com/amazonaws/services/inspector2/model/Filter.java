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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action that is to be applied to the findings that match the filter.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The Amazon Resource Number (ARN) associated with this filter.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time this filter was created at.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Details on the filter criteria associated with this filter.
     * </p>
     */
    private FilterCriteria criteria;
    /**
     * <p>
     * A description of the filter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the filter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Web Services account ID of the account that created the filter.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The reason for the filter.
     * </p>
     */
    private String reason;
    /**
     * <p>
     * The tags attached to the filter.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The date and time the filter was last updated at.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param action
     *        The action that is to be applied to the findings that match the filter.
     * @see FilterAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @return The action that is to be applied to the findings that match the filter.
     * @see FilterAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param action
     *        The action that is to be applied to the findings that match the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterAction
     */

    public Filter withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param action
     *        The action that is to be applied to the findings that match the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterAction
     */

    public Filter withAction(FilterAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) associated with this filter.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Number (ARN) associated with this filter.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) associated with this filter.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) associated with this filter.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) associated with this filter.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Number (ARN) associated with this filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time this filter was created at.
     * </p>
     * 
     * @param createdAt
     *        The date and time this filter was created at.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time this filter was created at.
     * </p>
     * 
     * @return The date and time this filter was created at.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time this filter was created at.
     * </p>
     * 
     * @param createdAt
     *        The date and time this filter was created at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Details on the filter criteria associated with this filter.
     * </p>
     * 
     * @param criteria
     *        Details on the filter criteria associated with this filter.
     */

    public void setCriteria(FilterCriteria criteria) {
        this.criteria = criteria;
    }

    /**
     * <p>
     * Details on the filter criteria associated with this filter.
     * </p>
     * 
     * @return Details on the filter criteria associated with this filter.
     */

    public FilterCriteria getCriteria() {
        return this.criteria;
    }

    /**
     * <p>
     * Details on the filter criteria associated with this filter.
     * </p>
     * 
     * @param criteria
     *        Details on the filter criteria associated with this filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withCriteria(FilterCriteria criteria) {
        setCriteria(criteria);
        return this;
    }

    /**
     * <p>
     * A description of the filter.
     * </p>
     * 
     * @param description
     *        A description of the filter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the filter.
     * </p>
     * 
     * @return A description of the filter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the filter.
     * </p>
     * 
     * @param description
     *        A description of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param name
     *        The name of the filter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @return The name of the filter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param name
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the account that created the filter.
     * </p>
     * 
     * @param ownerId
     *        The Amazon Web Services account ID of the account that created the filter.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the account that created the filter.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the account that created the filter.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the account that created the filter.
     * </p>
     * 
     * @param ownerId
     *        The Amazon Web Services account ID of the account that created the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The reason for the filter.
     * </p>
     * 
     * @param reason
     *        The reason for the filter.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the filter.
     * </p>
     * 
     * @return The reason for the filter.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the filter.
     * </p>
     * 
     * @param reason
     *        The reason for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * <p>
     * The tags attached to the filter.
     * </p>
     * 
     * @return The tags attached to the filter.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags attached to the filter.
     * </p>
     * 
     * @param tags
     *        The tags attached to the filter.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags attached to the filter.
     * </p>
     * 
     * @param tags
     *        The tags attached to the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Filter#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Filter addTagsEntry(String key, String value) {
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

    public Filter clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The date and time the filter was last updated at.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the filter was last updated at.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time the filter was last updated at.
     * </p>
     * 
     * @return The date and time the filter was last updated at.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time the filter was last updated at.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the filter was last updated at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCriteria() != null)
            sb.append("Criteria: ").append(getCriteria()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCriteria() == null ^ this.getCriteria() == null)
            return false;
        if (other.getCriteria() != null && other.getCriteria().equals(this.getCriteria()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCriteria() == null) ? 0 : getCriteria().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
