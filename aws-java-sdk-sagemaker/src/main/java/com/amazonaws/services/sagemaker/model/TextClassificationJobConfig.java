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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The collection of settings used by an AutoML job V2 for the text classification problem type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TextClassificationJobConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextClassificationJobConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed to generate.
     * </p>
     */
    private AutoMLJobCompletionCriteria completionCriteria;
    /**
     * <p>
     * The name of the column used to provide the sentences to be classified. It should not be the same as the target
     * column.
     * </p>
     */
    private String contentColumn;
    /**
     * <p>
     * The name of the column used to provide the class labels. It should not be same as the content column.
     * </p>
     */
    private String targetLabelColumn;

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed to generate.
     * </p>
     * 
     * @param completionCriteria
     *        How long a job is allowed to run, or how many candidates a job is allowed to generate.
     */

    public void setCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        this.completionCriteria = completionCriteria;
    }

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed to generate.
     * </p>
     * 
     * @return How long a job is allowed to run, or how many candidates a job is allowed to generate.
     */

    public AutoMLJobCompletionCriteria getCompletionCriteria() {
        return this.completionCriteria;
    }

    /**
     * <p>
     * How long a job is allowed to run, or how many candidates a job is allowed to generate.
     * </p>
     * 
     * @param completionCriteria
     *        How long a job is allowed to run, or how many candidates a job is allowed to generate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextClassificationJobConfig withCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        setCompletionCriteria(completionCriteria);
        return this;
    }

    /**
     * <p>
     * The name of the column used to provide the sentences to be classified. It should not be the same as the target
     * column.
     * </p>
     * 
     * @param contentColumn
     *        The name of the column used to provide the sentences to be classified. It should not be the same as the
     *        target column.
     */

    public void setContentColumn(String contentColumn) {
        this.contentColumn = contentColumn;
    }

    /**
     * <p>
     * The name of the column used to provide the sentences to be classified. It should not be the same as the target
     * column.
     * </p>
     * 
     * @return The name of the column used to provide the sentences to be classified. It should not be the same as the
     *         target column.
     */

    public String getContentColumn() {
        return this.contentColumn;
    }

    /**
     * <p>
     * The name of the column used to provide the sentences to be classified. It should not be the same as the target
     * column.
     * </p>
     * 
     * @param contentColumn
     *        The name of the column used to provide the sentences to be classified. It should not be the same as the
     *        target column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextClassificationJobConfig withContentColumn(String contentColumn) {
        setContentColumn(contentColumn);
        return this;
    }

    /**
     * <p>
     * The name of the column used to provide the class labels. It should not be same as the content column.
     * </p>
     * 
     * @param targetLabelColumn
     *        The name of the column used to provide the class labels. It should not be same as the content column.
     */

    public void setTargetLabelColumn(String targetLabelColumn) {
        this.targetLabelColumn = targetLabelColumn;
    }

    /**
     * <p>
     * The name of the column used to provide the class labels. It should not be same as the content column.
     * </p>
     * 
     * @return The name of the column used to provide the class labels. It should not be same as the content column.
     */

    public String getTargetLabelColumn() {
        return this.targetLabelColumn;
    }

    /**
     * <p>
     * The name of the column used to provide the class labels. It should not be same as the content column.
     * </p>
     * 
     * @param targetLabelColumn
     *        The name of the column used to provide the class labels. It should not be same as the content column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextClassificationJobConfig withTargetLabelColumn(String targetLabelColumn) {
        setTargetLabelColumn(targetLabelColumn);
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
        if (getCompletionCriteria() != null)
            sb.append("CompletionCriteria: ").append(getCompletionCriteria()).append(",");
        if (getContentColumn() != null)
            sb.append("ContentColumn: ").append(getContentColumn()).append(",");
        if (getTargetLabelColumn() != null)
            sb.append("TargetLabelColumn: ").append(getTargetLabelColumn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextClassificationJobConfig == false)
            return false;
        TextClassificationJobConfig other = (TextClassificationJobConfig) obj;
        if (other.getCompletionCriteria() == null ^ this.getCompletionCriteria() == null)
            return false;
        if (other.getCompletionCriteria() != null && other.getCompletionCriteria().equals(this.getCompletionCriteria()) == false)
            return false;
        if (other.getContentColumn() == null ^ this.getContentColumn() == null)
            return false;
        if (other.getContentColumn() != null && other.getContentColumn().equals(this.getContentColumn()) == false)
            return false;
        if (other.getTargetLabelColumn() == null ^ this.getTargetLabelColumn() == null)
            return false;
        if (other.getTargetLabelColumn() != null && other.getTargetLabelColumn().equals(this.getTargetLabelColumn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletionCriteria() == null) ? 0 : getCompletionCriteria().hashCode());
        hashCode = prime * hashCode + ((getContentColumn() == null) ? 0 : getContentColumn().hashCode());
        hashCode = prime * hashCode + ((getTargetLabelColumn() == null) ? 0 : getTargetLabelColumn().hashCode());
        return hashCode;
    }

    @Override
    public TextClassificationJobConfig clone() {
        try {
            return (TextClassificationJobConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TextClassificationJobConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
