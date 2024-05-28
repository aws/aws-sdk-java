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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/CreateCalculatedAttributeDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCalculatedAttributeDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
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
     * Mathematical expression and a list of attribute items specified in that expression.
     * </p>
     */
    private AttributeDetails attributeDetails;
    /**
     * <p>
     * The conditions including range, object count, and threshold for the calculated attribute.
     * </p>
     */
    private Conditions conditions;
    /**
     * <p>
     * The aggregation operation to perform for the calculated attribute.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCalculatedAttributeDefinitionRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

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

    public CreateCalculatedAttributeDefinitionRequest withCalculatedAttributeName(String calculatedAttributeName) {
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

    public CreateCalculatedAttributeDefinitionRequest withDisplayName(String displayName) {
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

    public CreateCalculatedAttributeDefinitionRequest withDescription(String description) {
        setDescription(description);
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

    public CreateCalculatedAttributeDefinitionRequest withAttributeDetails(AttributeDetails attributeDetails) {
        setAttributeDetails(attributeDetails);
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

    public CreateCalculatedAttributeDefinitionRequest withConditions(Conditions conditions) {
        setConditions(conditions);
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

    public CreateCalculatedAttributeDefinitionRequest withStatistic(String statistic) {
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

    public CreateCalculatedAttributeDefinitionRequest withStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
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

    public CreateCalculatedAttributeDefinitionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateCalculatedAttributeDefinitionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateCalculatedAttributeDefinitionRequest addTagsEntry(String key, String value) {
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

    public CreateCalculatedAttributeDefinitionRequest clearTagsEntries() {
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getCalculatedAttributeName() != null)
            sb.append("CalculatedAttributeName: ").append(getCalculatedAttributeName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getAttributeDetails() != null)
            sb.append("AttributeDetails: ").append("***Sensitive Data Redacted***").append(",");
        if (getConditions() != null)
            sb.append("Conditions: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof CreateCalculatedAttributeDefinitionRequest == false)
            return false;
        CreateCalculatedAttributeDefinitionRequest other = (CreateCalculatedAttributeDefinitionRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
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
        if (other.getAttributeDetails() == null ^ this.getAttributeDetails() == null)
            return false;
        if (other.getAttributeDetails() != null && other.getAttributeDetails().equals(this.getAttributeDetails()) == false)
            return false;
        if (other.getConditions() == null ^ this.getConditions() == null)
            return false;
        if (other.getConditions() != null && other.getConditions().equals(this.getConditions()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
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

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getCalculatedAttributeName() == null) ? 0 : getCalculatedAttributeName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAttributeDetails() == null) ? 0 : getAttributeDetails().hashCode());
        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCalculatedAttributeDefinitionRequest clone() {
        return (CreateCalculatedAttributeDefinitionRequest) super.clone();
    }

}
