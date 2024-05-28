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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a section from an evaluation form. A section can contain sections and/or questions. Evaluation
 * forms can only contain sections and subsections (two level nesting).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationFormSection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormSection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The title of the section.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The identifier of the section. An identifier must be unique within the evaluation form.
     * </p>
     */
    private String refId;
    /**
     * <p>
     * The instructions of the section.
     * </p>
     */
    private String instructions;
    /**
     * <p>
     * The items of the section.
     * </p>
     */
    private java.util.List<EvaluationFormItem> items;
    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     */
    private Double weight;

    /**
     * <p>
     * The title of the section.
     * </p>
     * 
     * @param title
     *        The title of the section.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the section.
     * </p>
     * 
     * @return The title of the section.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the section.
     * </p>
     * 
     * @param title
     *        The title of the section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSection withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The identifier of the section. An identifier must be unique within the evaluation form.
     * </p>
     * 
     * @param refId
     *        The identifier of the section. An identifier must be unique within the evaluation form.
     */

    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * <p>
     * The identifier of the section. An identifier must be unique within the evaluation form.
     * </p>
     * 
     * @return The identifier of the section. An identifier must be unique within the evaluation form.
     */

    public String getRefId() {
        return this.refId;
    }

    /**
     * <p>
     * The identifier of the section. An identifier must be unique within the evaluation form.
     * </p>
     * 
     * @param refId
     *        The identifier of the section. An identifier must be unique within the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSection withRefId(String refId) {
        setRefId(refId);
        return this;
    }

    /**
     * <p>
     * The instructions of the section.
     * </p>
     * 
     * @param instructions
     *        The instructions of the section.
     */

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * <p>
     * The instructions of the section.
     * </p>
     * 
     * @return The instructions of the section.
     */

    public String getInstructions() {
        return this.instructions;
    }

    /**
     * <p>
     * The instructions of the section.
     * </p>
     * 
     * @param instructions
     *        The instructions of the section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSection withInstructions(String instructions) {
        setInstructions(instructions);
        return this;
    }

    /**
     * <p>
     * The items of the section.
     * </p>
     * 
     * @return The items of the section.
     */

    public java.util.List<EvaluationFormItem> getItems() {
        return items;
    }

    /**
     * <p>
     * The items of the section.
     * </p>
     * 
     * @param items
     *        The items of the section.
     */

    public void setItems(java.util.Collection<EvaluationFormItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<EvaluationFormItem>(items);
    }

    /**
     * <p>
     * The items of the section.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The items of the section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSection withItems(EvaluationFormItem... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<EvaluationFormItem>(items.length));
        }
        for (EvaluationFormItem ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The items of the section.
     * </p>
     * 
     * @param items
     *        The items of the section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSection withItems(java.util.Collection<EvaluationFormItem> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     * 
     * @param weight
     *        The scoring weight of the section.
     */

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     * 
     * @return The scoring weight of the section.
     */

    public Double getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * The scoring weight of the section.
     * </p>
     * 
     * @param weight
     *        The scoring weight of the section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormSection withWeight(Double weight) {
        setWeight(weight);
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
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getRefId() != null)
            sb.append("RefId: ").append(getRefId()).append(",");
        if (getInstructions() != null)
            sb.append("Instructions: ").append(getInstructions()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormSection == false)
            return false;
        EvaluationFormSection other = (EvaluationFormSection) obj;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getRefId() == null ^ this.getRefId() == null)
            return false;
        if (other.getRefId() != null && other.getRefId().equals(this.getRefId()) == false)
            return false;
        if (other.getInstructions() == null ^ this.getInstructions() == null)
            return false;
        if (other.getInstructions() != null && other.getInstructions().equals(this.getInstructions()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getRefId() == null) ? 0 : getRefId().hashCode());
        hashCode = prime * hashCode + ((getInstructions() == null) ? 0 : getInstructions().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationFormSection clone() {
        try {
            return (EvaluationFormSection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationFormSectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
