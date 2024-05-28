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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/CreateReviewTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReviewTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the review template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The review template description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Lenses applied to the review template.
     * </p>
     */
    private java.util.List<String> lenses;

    private String notes;
    /**
     * <p>
     * The tags assigned to the review template.
     * </p>
     */
    private java.util.Map<String, String> tags;

    private String clientRequestToken;

    /**
     * <p>
     * Name of the review template.
     * </p>
     * 
     * @param templateName
     *        Name of the review template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * Name of the review template.
     * </p>
     * 
     * @return Name of the review template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * Name of the review template.
     * </p>
     * 
     * @param templateName
     *        Name of the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReviewTemplateRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The review template description.
     * </p>
     * 
     * @param description
     *        The review template description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The review template description.
     * </p>
     * 
     * @return The review template description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The review template description.
     * </p>
     * 
     * @param description
     *        The review template description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReviewTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Lenses applied to the review template.
     * </p>
     * 
     * @return Lenses applied to the review template.
     */

    public java.util.List<String> getLenses() {
        return lenses;
    }

    /**
     * <p>
     * Lenses applied to the review template.
     * </p>
     * 
     * @param lenses
     *        Lenses applied to the review template.
     */

    public void setLenses(java.util.Collection<String> lenses) {
        if (lenses == null) {
            this.lenses = null;
            return;
        }

        this.lenses = new java.util.ArrayList<String>(lenses);
    }

    /**
     * <p>
     * Lenses applied to the review template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLenses(java.util.Collection)} or {@link #withLenses(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param lenses
     *        Lenses applied to the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReviewTemplateRequest withLenses(String... lenses) {
        if (this.lenses == null) {
            setLenses(new java.util.ArrayList<String>(lenses.length));
        }
        for (String ele : lenses) {
            this.lenses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lenses applied to the review template.
     * </p>
     * 
     * @param lenses
     *        Lenses applied to the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReviewTemplateRequest withLenses(java.util.Collection<String> lenses) {
        setLenses(lenses);
        return this;
    }

    /**
     * @param notes
     */

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @return
     */

    public String getNotes() {
        return this.notes;
    }

    /**
     * @param notes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReviewTemplateRequest withNotes(String notes) {
        setNotes(notes);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the review template.
     * </p>
     * 
     * @return The tags assigned to the review template.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the review template.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the review template.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the review template.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReviewTemplateRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateReviewTemplateRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateReviewTemplateRequest addTagsEntry(String key, String value) {
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

    public CreateReviewTemplateRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReviewTemplateRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLenses() != null)
            sb.append("Lenses: ").append(getLenses()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReviewTemplateRequest == false)
            return false;
        CreateReviewTemplateRequest other = (CreateReviewTemplateRequest) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLenses() == null ^ this.getLenses() == null)
            return false;
        if (other.getLenses() != null && other.getLenses().equals(this.getLenses()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLenses() == null) ? 0 : getLenses().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateReviewTemplateRequest clone() {
        return (CreateReviewTemplateRequest) super.clone();
    }

}
