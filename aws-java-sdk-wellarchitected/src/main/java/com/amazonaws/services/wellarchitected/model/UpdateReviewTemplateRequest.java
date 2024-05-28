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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateReviewTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReviewTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The review template ARN.
     * </p>
     */
    private String templateArn;
    /**
     * <p>
     * The review template name.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The review template description.
     * </p>
     */
    private String description;

    private String notes;
    /**
     * <p>
     * A list of lens aliases or ARNs to apply to the review template.
     * </p>
     */
    private java.util.List<String> lensesToAssociate;
    /**
     * <p>
     * A list of lens aliases or ARNs to unapply to the review template. The <code>wellarchitected</code> lens cannot be
     * unapplied.
     * </p>
     */
    private java.util.List<String> lensesToDisassociate;

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @param templateArn
     *        The review template ARN.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @return The review template ARN.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @param templateArn
     *        The review template ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReviewTemplateRequest withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * The review template name.
     * </p>
     * 
     * @param templateName
     *        The review template name.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The review template name.
     * </p>
     * 
     * @return The review template name.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The review template name.
     * </p>
     * 
     * @param templateName
     *        The review template name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReviewTemplateRequest withTemplateName(String templateName) {
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

    public UpdateReviewTemplateRequest withDescription(String description) {
        setDescription(description);
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

    public UpdateReviewTemplateRequest withNotes(String notes) {
        setNotes(notes);
        return this;
    }

    /**
     * <p>
     * A list of lens aliases or ARNs to apply to the review template.
     * </p>
     * 
     * @return A list of lens aliases or ARNs to apply to the review template.
     */

    public java.util.List<String> getLensesToAssociate() {
        return lensesToAssociate;
    }

    /**
     * <p>
     * A list of lens aliases or ARNs to apply to the review template.
     * </p>
     * 
     * @param lensesToAssociate
     *        A list of lens aliases or ARNs to apply to the review template.
     */

    public void setLensesToAssociate(java.util.Collection<String> lensesToAssociate) {
        if (lensesToAssociate == null) {
            this.lensesToAssociate = null;
            return;
        }

        this.lensesToAssociate = new java.util.ArrayList<String>(lensesToAssociate);
    }

    /**
     * <p>
     * A list of lens aliases or ARNs to apply to the review template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLensesToAssociate(java.util.Collection)} or {@link #withLensesToAssociate(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param lensesToAssociate
     *        A list of lens aliases or ARNs to apply to the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReviewTemplateRequest withLensesToAssociate(String... lensesToAssociate) {
        if (this.lensesToAssociate == null) {
            setLensesToAssociate(new java.util.ArrayList<String>(lensesToAssociate.length));
        }
        for (String ele : lensesToAssociate) {
            this.lensesToAssociate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of lens aliases or ARNs to apply to the review template.
     * </p>
     * 
     * @param lensesToAssociate
     *        A list of lens aliases or ARNs to apply to the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReviewTemplateRequest withLensesToAssociate(java.util.Collection<String> lensesToAssociate) {
        setLensesToAssociate(lensesToAssociate);
        return this;
    }

    /**
     * <p>
     * A list of lens aliases or ARNs to unapply to the review template. The <code>wellarchitected</code> lens cannot be
     * unapplied.
     * </p>
     * 
     * @return A list of lens aliases or ARNs to unapply to the review template. The <code>wellarchitected</code> lens
     *         cannot be unapplied.
     */

    public java.util.List<String> getLensesToDisassociate() {
        return lensesToDisassociate;
    }

    /**
     * <p>
     * A list of lens aliases or ARNs to unapply to the review template. The <code>wellarchitected</code> lens cannot be
     * unapplied.
     * </p>
     * 
     * @param lensesToDisassociate
     *        A list of lens aliases or ARNs to unapply to the review template. The <code>wellarchitected</code> lens
     *        cannot be unapplied.
     */

    public void setLensesToDisassociate(java.util.Collection<String> lensesToDisassociate) {
        if (lensesToDisassociate == null) {
            this.lensesToDisassociate = null;
            return;
        }

        this.lensesToDisassociate = new java.util.ArrayList<String>(lensesToDisassociate);
    }

    /**
     * <p>
     * A list of lens aliases or ARNs to unapply to the review template. The <code>wellarchitected</code> lens cannot be
     * unapplied.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLensesToDisassociate(java.util.Collection)} or {@link #withLensesToDisassociate(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param lensesToDisassociate
     *        A list of lens aliases or ARNs to unapply to the review template. The <code>wellarchitected</code> lens
     *        cannot be unapplied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReviewTemplateRequest withLensesToDisassociate(String... lensesToDisassociate) {
        if (this.lensesToDisassociate == null) {
            setLensesToDisassociate(new java.util.ArrayList<String>(lensesToDisassociate.length));
        }
        for (String ele : lensesToDisassociate) {
            this.lensesToDisassociate.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of lens aliases or ARNs to unapply to the review template. The <code>wellarchitected</code> lens cannot be
     * unapplied.
     * </p>
     * 
     * @param lensesToDisassociate
     *        A list of lens aliases or ARNs to unapply to the review template. The <code>wellarchitected</code> lens
     *        cannot be unapplied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReviewTemplateRequest withLensesToDisassociate(java.util.Collection<String> lensesToDisassociate) {
        setLensesToDisassociate(lensesToDisassociate);
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
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes()).append(",");
        if (getLensesToAssociate() != null)
            sb.append("LensesToAssociate: ").append(getLensesToAssociate()).append(",");
        if (getLensesToDisassociate() != null)
            sb.append("LensesToDisassociate: ").append(getLensesToDisassociate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReviewTemplateRequest == false)
            return false;
        UpdateReviewTemplateRequest other = (UpdateReviewTemplateRequest) obj;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        if (other.getLensesToAssociate() == null ^ this.getLensesToAssociate() == null)
            return false;
        if (other.getLensesToAssociate() != null && other.getLensesToAssociate().equals(this.getLensesToAssociate()) == false)
            return false;
        if (other.getLensesToDisassociate() == null ^ this.getLensesToDisassociate() == null)
            return false;
        if (other.getLensesToDisassociate() != null && other.getLensesToDisassociate().equals(this.getLensesToDisassociate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getLensesToAssociate() == null) ? 0 : getLensesToAssociate().hashCode());
        hashCode = prime * hashCode + ((getLensesToDisassociate() == null) ? 0 : getLensesToDisassociate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReviewTemplateRequest clone() {
        return (UpdateReviewTemplateRequest) super.clone();
    }

}
