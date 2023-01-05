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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A choice available to answer question.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/Choice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Choice implements Serializable, Cloneable, StructuredPojo {

    private String choiceId;

    private String title;

    private String description;
    /**
     * <p>
     * The choice level helpful resource.
     * </p>
     */
    private ChoiceContent helpfulResource;
    /**
     * <p>
     * The choice level improvement plan.
     * </p>
     */
    private ChoiceContent improvementPlan;
    /**
     * <p>
     * The additional resources for a choice. A choice can have up to two additional resources: one of type
     * <code>HELPFUL_RESOURCE</code>, one of type <code>IMPROVEMENT_PLAN</code>, or both.
     * </p>
     */
    private java.util.List<AdditionalResources> additionalResources;

    /**
     * @param choiceId
     */

    public void setChoiceId(String choiceId) {
        this.choiceId = choiceId;
    }

    /**
     * @return
     */

    public String getChoiceId() {
        return this.choiceId;
    }

    /**
     * @param choiceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Choice withChoiceId(String choiceId) {
        setChoiceId(choiceId);
        return this;
    }

    /**
     * @param title
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * @param title
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Choice withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Choice withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The choice level helpful resource.
     * </p>
     * 
     * @param helpfulResource
     *        The choice level helpful resource.
     */

    public void setHelpfulResource(ChoiceContent helpfulResource) {
        this.helpfulResource = helpfulResource;
    }

    /**
     * <p>
     * The choice level helpful resource.
     * </p>
     * 
     * @return The choice level helpful resource.
     */

    public ChoiceContent getHelpfulResource() {
        return this.helpfulResource;
    }

    /**
     * <p>
     * The choice level helpful resource.
     * </p>
     * 
     * @param helpfulResource
     *        The choice level helpful resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Choice withHelpfulResource(ChoiceContent helpfulResource) {
        setHelpfulResource(helpfulResource);
        return this;
    }

    /**
     * <p>
     * The choice level improvement plan.
     * </p>
     * 
     * @param improvementPlan
     *        The choice level improvement plan.
     */

    public void setImprovementPlan(ChoiceContent improvementPlan) {
        this.improvementPlan = improvementPlan;
    }

    /**
     * <p>
     * The choice level improvement plan.
     * </p>
     * 
     * @return The choice level improvement plan.
     */

    public ChoiceContent getImprovementPlan() {
        return this.improvementPlan;
    }

    /**
     * <p>
     * The choice level improvement plan.
     * </p>
     * 
     * @param improvementPlan
     *        The choice level improvement plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Choice withImprovementPlan(ChoiceContent improvementPlan) {
        setImprovementPlan(improvementPlan);
        return this;
    }

    /**
     * <p>
     * The additional resources for a choice. A choice can have up to two additional resources: one of type
     * <code>HELPFUL_RESOURCE</code>, one of type <code>IMPROVEMENT_PLAN</code>, or both.
     * </p>
     * 
     * @return The additional resources for a choice. A choice can have up to two additional resources: one of type
     *         <code>HELPFUL_RESOURCE</code>, one of type <code>IMPROVEMENT_PLAN</code>, or both.
     */

    public java.util.List<AdditionalResources> getAdditionalResources() {
        return additionalResources;
    }

    /**
     * <p>
     * The additional resources for a choice. A choice can have up to two additional resources: one of type
     * <code>HELPFUL_RESOURCE</code>, one of type <code>IMPROVEMENT_PLAN</code>, or both.
     * </p>
     * 
     * @param additionalResources
     *        The additional resources for a choice. A choice can have up to two additional resources: one of type
     *        <code>HELPFUL_RESOURCE</code>, one of type <code>IMPROVEMENT_PLAN</code>, or both.
     */

    public void setAdditionalResources(java.util.Collection<AdditionalResources> additionalResources) {
        if (additionalResources == null) {
            this.additionalResources = null;
            return;
        }

        this.additionalResources = new java.util.ArrayList<AdditionalResources>(additionalResources);
    }

    /**
     * <p>
     * The additional resources for a choice. A choice can have up to two additional resources: one of type
     * <code>HELPFUL_RESOURCE</code>, one of type <code>IMPROVEMENT_PLAN</code>, or both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalResources(java.util.Collection)} or {@link #withAdditionalResources(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param additionalResources
     *        The additional resources for a choice. A choice can have up to two additional resources: one of type
     *        <code>HELPFUL_RESOURCE</code>, one of type <code>IMPROVEMENT_PLAN</code>, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Choice withAdditionalResources(AdditionalResources... additionalResources) {
        if (this.additionalResources == null) {
            setAdditionalResources(new java.util.ArrayList<AdditionalResources>(additionalResources.length));
        }
        for (AdditionalResources ele : additionalResources) {
            this.additionalResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The additional resources for a choice. A choice can have up to two additional resources: one of type
     * <code>HELPFUL_RESOURCE</code>, one of type <code>IMPROVEMENT_PLAN</code>, or both.
     * </p>
     * 
     * @param additionalResources
     *        The additional resources for a choice. A choice can have up to two additional resources: one of type
     *        <code>HELPFUL_RESOURCE</code>, one of type <code>IMPROVEMENT_PLAN</code>, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Choice withAdditionalResources(java.util.Collection<AdditionalResources> additionalResources) {
        setAdditionalResources(additionalResources);
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
        if (getChoiceId() != null)
            sb.append("ChoiceId: ").append(getChoiceId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getHelpfulResource() != null)
            sb.append("HelpfulResource: ").append(getHelpfulResource()).append(",");
        if (getImprovementPlan() != null)
            sb.append("ImprovementPlan: ").append(getImprovementPlan()).append(",");
        if (getAdditionalResources() != null)
            sb.append("AdditionalResources: ").append(getAdditionalResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Choice == false)
            return false;
        Choice other = (Choice) obj;
        if (other.getChoiceId() == null ^ this.getChoiceId() == null)
            return false;
        if (other.getChoiceId() != null && other.getChoiceId().equals(this.getChoiceId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getHelpfulResource() == null ^ this.getHelpfulResource() == null)
            return false;
        if (other.getHelpfulResource() != null && other.getHelpfulResource().equals(this.getHelpfulResource()) == false)
            return false;
        if (other.getImprovementPlan() == null ^ this.getImprovementPlan() == null)
            return false;
        if (other.getImprovementPlan() != null && other.getImprovementPlan().equals(this.getImprovementPlan()) == false)
            return false;
        if (other.getAdditionalResources() == null ^ this.getAdditionalResources() == null)
            return false;
        if (other.getAdditionalResources() != null && other.getAdditionalResources().equals(this.getAdditionalResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChoiceId() == null) ? 0 : getChoiceId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getHelpfulResource() == null) ? 0 : getHelpfulResource().hashCode());
        hashCode = prime * hashCode + ((getImprovementPlan() == null) ? 0 : getImprovementPlan().hashCode());
        hashCode = prime * hashCode + ((getAdditionalResources() == null) ? 0 : getAdditionalResources().hashCode());
        return hashCode;
    }

    @Override
    public Choice clone() {
        try {
            return (Choice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ChoiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
