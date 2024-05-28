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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary of a review template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ReviewTemplateSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReviewTemplateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Description of the review template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Lenses associated with the review template.
     * </p>
     */
    private java.util.List<String> lenses;

    private String owner;

    private java.util.Date updatedAt;
    /**
     * <p>
     * The review template ARN.
     * </p>
     */
    private String templateArn;
    /**
     * <p>
     * The name of the review template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The latest status of a review template.
     * </p>
     */
    private String updateStatus;

    /**
     * <p>
     * Description of the review template.
     * </p>
     * 
     * @param description
     *        Description of the review template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the review template.
     * </p>
     * 
     * @return Description of the review template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the review template.
     * </p>
     * 
     * @param description
     *        Description of the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Lenses associated with the review template.
     * </p>
     * 
     * @return Lenses associated with the review template.
     */

    public java.util.List<String> getLenses() {
        return lenses;
    }

    /**
     * <p>
     * Lenses associated with the review template.
     * </p>
     * 
     * @param lenses
     *        Lenses associated with the review template.
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
     * Lenses associated with the review template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLenses(java.util.Collection)} or {@link #withLenses(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param lenses
     *        Lenses associated with the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateSummary withLenses(String... lenses) {
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
     * Lenses associated with the review template.
     * </p>
     * 
     * @param lenses
     *        Lenses associated with the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateSummary withLenses(java.util.Collection<String> lenses) {
        setLenses(lenses);
        return this;
    }

    /**
     * @param owner
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * @param owner
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateSummary withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * @param updatedAt
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @param updatedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

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

    public ReviewTemplateSummary withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * The name of the review template.
     * </p>
     * 
     * @param templateName
     *        The name of the review template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the review template.
     * </p>
     * 
     * @return The name of the review template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the review template.
     * </p>
     * 
     * @param templateName
     *        The name of the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplateSummary withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The latest status of a review template.
     * </p>
     * 
     * @param updateStatus
     *        The latest status of a review template.
     * @see ReviewTemplateUpdateStatus
     */

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The latest status of a review template.
     * </p>
     * 
     * @return The latest status of a review template.
     * @see ReviewTemplateUpdateStatus
     */

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * The latest status of a review template.
     * </p>
     * 
     * @param updateStatus
     *        The latest status of a review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewTemplateUpdateStatus
     */

    public ReviewTemplateSummary withUpdateStatus(String updateStatus) {
        setUpdateStatus(updateStatus);
        return this;
    }

    /**
     * <p>
     * The latest status of a review template.
     * </p>
     * 
     * @param updateStatus
     *        The latest status of a review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewTemplateUpdateStatus
     */

    public ReviewTemplateSummary withUpdateStatus(ReviewTemplateUpdateStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
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
        if (getLenses() != null)
            sb.append("Lenses: ").append(getLenses()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReviewTemplateSummary == false)
            return false;
        ReviewTemplateSummary other = (ReviewTemplateSummary) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLenses() == null ^ this.getLenses() == null)
            return false;
        if (other.getLenses() != null && other.getLenses().equals(this.getLenses()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLenses() == null) ? 0 : getLenses().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        return hashCode;
    }

    @Override
    public ReviewTemplateSummary clone() {
        try {
            return (ReviewTemplateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ReviewTemplateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
