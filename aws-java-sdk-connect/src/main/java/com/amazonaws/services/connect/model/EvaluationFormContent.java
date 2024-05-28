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
 * Information about an evaluation form used in a contact evaluation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationFormContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationFormContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A version of the evaluation form.
     * </p>
     */
    private Integer evaluationFormVersion;
    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     */
    private String evaluationFormId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     */
    private String evaluationFormArn;
    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     */
    private java.util.List<EvaluationFormItem> items;
    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     */
    private EvaluationFormScoringStrategy scoringStrategy;

    /**
     * <p>
     * A version of the evaluation form.
     * </p>
     * 
     * @param evaluationFormVersion
     *        A version of the evaluation form.
     */

    public void setEvaluationFormVersion(Integer evaluationFormVersion) {
        this.evaluationFormVersion = evaluationFormVersion;
    }

    /**
     * <p>
     * A version of the evaluation form.
     * </p>
     * 
     * @return A version of the evaluation form.
     */

    public Integer getEvaluationFormVersion() {
        return this.evaluationFormVersion;
    }

    /**
     * <p>
     * A version of the evaluation form.
     * </p>
     * 
     * @param evaluationFormVersion
     *        A version of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormContent withEvaluationFormVersion(Integer evaluationFormVersion) {
        setEvaluationFormVersion(evaluationFormVersion);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * 
     * @param evaluationFormId
     *        The unique identifier for the evaluation form.
     */

    public void setEvaluationFormId(String evaluationFormId) {
        this.evaluationFormId = evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * 
     * @return The unique identifier for the evaluation form.
     */

    public String getEvaluationFormId() {
        return this.evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * 
     * @param evaluationFormId
     *        The unique identifier for the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormContent withEvaluationFormId(String evaluationFormId) {
        setEvaluationFormId(evaluationFormId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     * 
     * @param evaluationFormArn
     *        The Amazon Resource Name (ARN) for the evaluation form resource.
     */

    public void setEvaluationFormArn(String evaluationFormArn) {
        this.evaluationFormArn = evaluationFormArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the evaluation form resource.
     */

    public String getEvaluationFormArn() {
        return this.evaluationFormArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     * 
     * @param evaluationFormArn
     *        The Amazon Resource Name (ARN) for the evaluation form resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormContent withEvaluationFormArn(String evaluationFormArn) {
        setEvaluationFormArn(evaluationFormArn);
        return this;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * 
     * @param title
     *        A title of the evaluation form.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * 
     * @return A title of the evaluation form.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * 
     * @param title
     *        A title of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormContent withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     * 
     * @param description
     *        The description of the evaluation form.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     * 
     * @return The description of the evaluation form.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     * 
     * @param description
     *        The description of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormContent withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     * 
     * @return Items that are part of the evaluation form. The total number of sections and questions must not exceed
     *         100 each. Questions must be contained in a section.
     */

    public java.util.List<EvaluationFormItem> getItems() {
        return items;
    }

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     * 
     * @param items
     *        Items that are part of the evaluation form. The total number of sections and questions must not exceed 100
     *        each. Questions must be contained in a section.
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
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Items that are part of the evaluation form. The total number of sections and questions must not exceed 100
     *        each. Questions must be contained in a section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormContent withItems(EvaluationFormItem... items) {
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
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     * 
     * @param items
     *        Items that are part of the evaluation form. The total number of sections and questions must not exceed 100
     *        each. Questions must be contained in a section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormContent withItems(java.util.Collection<EvaluationFormItem> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     * 
     * @param scoringStrategy
     *        A scoring strategy of the evaluation form.
     */

    public void setScoringStrategy(EvaluationFormScoringStrategy scoringStrategy) {
        this.scoringStrategy = scoringStrategy;
    }

    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     * 
     * @return A scoring strategy of the evaluation form.
     */

    public EvaluationFormScoringStrategy getScoringStrategy() {
        return this.scoringStrategy;
    }

    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     * 
     * @param scoringStrategy
     *        A scoring strategy of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationFormContent withScoringStrategy(EvaluationFormScoringStrategy scoringStrategy) {
        setScoringStrategy(scoringStrategy);
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
        if (getEvaluationFormVersion() != null)
            sb.append("EvaluationFormVersion: ").append(getEvaluationFormVersion()).append(",");
        if (getEvaluationFormId() != null)
            sb.append("EvaluationFormId: ").append(getEvaluationFormId()).append(",");
        if (getEvaluationFormArn() != null)
            sb.append("EvaluationFormArn: ").append(getEvaluationFormArn()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
        if (getScoringStrategy() != null)
            sb.append("ScoringStrategy: ").append(getScoringStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationFormContent == false)
            return false;
        EvaluationFormContent other = (EvaluationFormContent) obj;
        if (other.getEvaluationFormVersion() == null ^ this.getEvaluationFormVersion() == null)
            return false;
        if (other.getEvaluationFormVersion() != null && other.getEvaluationFormVersion().equals(this.getEvaluationFormVersion()) == false)
            return false;
        if (other.getEvaluationFormId() == null ^ this.getEvaluationFormId() == null)
            return false;
        if (other.getEvaluationFormId() != null && other.getEvaluationFormId().equals(this.getEvaluationFormId()) == false)
            return false;
        if (other.getEvaluationFormArn() == null ^ this.getEvaluationFormArn() == null)
            return false;
        if (other.getEvaluationFormArn() != null && other.getEvaluationFormArn().equals(this.getEvaluationFormArn()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getScoringStrategy() == null ^ this.getScoringStrategy() == null)
            return false;
        if (other.getScoringStrategy() != null && other.getScoringStrategy().equals(this.getScoringStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationFormVersion() == null) ? 0 : getEvaluationFormVersion().hashCode());
        hashCode = prime * hashCode + ((getEvaluationFormId() == null) ? 0 : getEvaluationFormId().hashCode());
        hashCode = prime * hashCode + ((getEvaluationFormArn() == null) ? 0 : getEvaluationFormArn().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getScoringStrategy() == null) ? 0 : getScoringStrategy().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationFormContent clone() {
        try {
            return (EvaluationFormContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationFormContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
