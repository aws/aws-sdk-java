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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetCalculatedAttributeDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCalculatedAttributeDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The unique name of the calculated attribute.
     * </p>
     */
    private String calculatedAttributeName;
    /**
     * <p>
     * The display name of the calculated attribute.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description of the calculated attribute.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The timestamp of when the calculated attribute definition was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp of when the calculated attribute definition was most recently edited.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The aggregation operation to perform for the calculated attribute.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * The conditions including range, object count, and threshold for the calculated attribute.
     * </p>
     */
    private Conditions conditions;
    /**
     * <p>
     * Mathematical expression and a list of attribute items specified in that expression.
     * </p>
     */
    private AttributeDetails attributeDetails;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique name of the calculated attribute.
     * </p>
     * 
     * @param calculatedAttributeName
     *        The unique name of the calculated attribute.
     */

    public void setCalculatedAttributeName(String calculatedAttributeName) {
        this.calculatedAttributeName = calculatedAttributeName;
    }

    /**
     * <p>
     * The unique name of the calculated attribute.
     * </p>
     * 
     * @return The unique name of the calculated attribute.
     */

    public String getCalculatedAttributeName() {
        return this.calculatedAttributeName;
    }

    /**
     * <p>
     * The unique name of the calculated attribute.
     * </p>
     * 
     * @param calculatedAttributeName
     *        The unique name of the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculatedAttributeDefinitionResult withCalculatedAttributeName(String calculatedAttributeName) {
        setCalculatedAttributeName(calculatedAttributeName);
        return this;
    }

    /**
     * <p>
     * The display name of the calculated attribute.
     * </p>
     * 
     * @param displayName
     *        The display name of the calculated attribute.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the calculated attribute.
     * </p>
     * 
     * @return The display name of the calculated attribute.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the calculated attribute.
     * </p>
     * 
     * @param displayName
     *        The display name of the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculatedAttributeDefinitionResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The description of the calculated attribute.
     * </p>
     * 
     * @param description
     *        The description of the calculated attribute.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the calculated attribute.
     * </p>
     * 
     * @return The description of the calculated attribute.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the calculated attribute.
     * </p>
     * 
     * @param description
     *        The description of the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculatedAttributeDefinitionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the calculated attribute definition was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the calculated attribute definition was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the calculated attribute definition was created.
     * </p>
     * 
     * @return The timestamp of when the calculated attribute definition was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the calculated attribute definition was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the calculated attribute definition was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculatedAttributeDefinitionResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the calculated attribute definition was most recently edited.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp of when the calculated attribute definition was most recently edited.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the calculated attribute definition was most recently edited.
     * </p>
     * 
     * @return The timestamp of when the calculated attribute definition was most recently edited.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The timestamp of when the calculated attribute definition was most recently edited.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The timestamp of when the calculated attribute definition was most recently edited.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculatedAttributeDefinitionResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The aggregation operation to perform for the calculated attribute.
     * </p>
     * 
     * @param statistic
     *        The aggregation operation to perform for the calculated attribute.
     * @see Statistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The aggregation operation to perform for the calculated attribute.
     * </p>
     * 
     * @return The aggregation operation to perform for the calculated attribute.
     * @see Statistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The aggregation operation to perform for the calculated attribute.
     * </p>
     * 
     * @param statistic
     *        The aggregation operation to perform for the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public GetCalculatedAttributeDefinitionResult withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The aggregation operation to perform for the calculated attribute.
     * </p>
     * 
     * @param statistic
     *        The aggregation operation to perform for the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public GetCalculatedAttributeDefinitionResult withStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The conditions including range, object count, and threshold for the calculated attribute.
     * </p>
     * 
     * @param conditions
     *        The conditions including range, object count, and threshold for the calculated attribute.
     */

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    /**
     * <p>
     * The conditions including range, object count, and threshold for the calculated attribute.
     * </p>
     * 
     * @return The conditions including range, object count, and threshold for the calculated attribute.
     */

    public Conditions getConditions() {
        return this.conditions;
    }

    /**
     * <p>
     * The conditions including range, object count, and threshold for the calculated attribute.
     * </p>
     * 
     * @param conditions
     *        The conditions including range, object count, and threshold for the calculated attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculatedAttributeDefinitionResult withConditions(Conditions conditions) {
        setConditions(conditions);
        return this;
    }

    /**
     * <p>
     * Mathematical expression and a list of attribute items specified in that expression.
     * </p>
     * 
     * @param attributeDetails
     *        Mathematical expression and a list of attribute items specified in that expression.
     */

    public void setAttributeDetails(AttributeDetails attributeDetails) {
        this.attributeDetails = attributeDetails;
    }

    /**
     * <p>
     * Mathematical expression and a list of attribute items specified in that expression.
     * </p>
     * 
     * @return Mathematical expression and a list of attribute items specified in that expression.
     */

    public AttributeDetails getAttributeDetails() {
        return this.attributeDetails;
    }

    /**
     * <p>
     * Mathematical expression and a list of attribute items specified in that expression.
     * </p>
     * 
     * @param attributeDetails
     *        Mathematical expression and a list of attribute items specified in that expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculatedAttributeDefinitionResult withAttributeDetails(AttributeDetails attributeDetails) {
        setAttributeDetails(attributeDetails);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculatedAttributeDefinitionResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetCalculatedAttributeDefinitionResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculatedAttributeDefinitionResult addTagsEntry(String key, String value) {
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

    public GetCalculatedAttributeDefinitionResult clearTagsEntries() {
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
        if (getCalculatedAttributeName() != null)
            sb.append("CalculatedAttributeName: ").append(getCalculatedAttributeName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append("***Sensitive Data Redacted***").append(",");
        if (getConditions() != null)
            sb.append("Conditions: ").append("***Sensitive Data Redacted***").append(",");
        if (getAttributeDetails() != null)
            sb.append("AttributeDetails: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof GetCalculatedAttributeDefinitionResult == false)
            return false;
        GetCalculatedAttributeDefinitionResult other = (GetCalculatedAttributeDefinitionResult) obj;
        if (other.getCalculatedAttributeName() == null ^ this.getCalculatedAttributeName() == null)
            return false;
        if (other.getCalculatedAttributeName() != null && other.getCalculatedAttributeName().equals(this.getCalculatedAttributeName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getConditions() == null ^ this.getConditions() == null)
            return false;
        if (other.getConditions() != null && other.getConditions().equals(this.getConditions()) == false)
            return false;
        if (other.getAttributeDetails() == null ^ this.getAttributeDetails() == null)
            return false;
        if (other.getAttributeDetails() != null && other.getAttributeDetails().equals(this.getAttributeDetails()) == false)
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

        hashCode = prime * hashCode + ((getCalculatedAttributeName() == null) ? 0 : getCalculatedAttributeName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        hashCode = prime * hashCode + ((getAttributeDetails() == null) ? 0 : getAttributeDetails().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetCalculatedAttributeDefinitionResult clone() {
        try {
            return (GetCalculatedAttributeDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
