/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The evaluation results for the training of a model.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The F1 score for the evaluation of all labels. The F1 score metric evaluates the overall precision and recall
     * performance of the model as a single value. A higher value indicates better precision and recall performance. A
     * lower score indicates that precision, recall, or both are performing poorly.
     * </p>
     */
    private Float f1Score;
    /**
     * <p>
     * The S3 bucket that contains the training summary.
     * </p>
     */
    private Summary summary;

    /**
     * <p>
     * The F1 score for the evaluation of all labels. The F1 score metric evaluates the overall precision and recall
     * performance of the model as a single value. A higher value indicates better precision and recall performance. A
     * lower score indicates that precision, recall, or both are performing poorly.
     * </p>
     * 
     * @param f1Score
     *        The F1 score for the evaluation of all labels. The F1 score metric evaluates the overall precision and
     *        recall performance of the model as a single value. A higher value indicates better precision and recall
     *        performance. A lower score indicates that precision, recall, or both are performing poorly.
     */

    public void setF1Score(Float f1Score) {
        this.f1Score = f1Score;
    }

    /**
     * <p>
     * The F1 score for the evaluation of all labels. The F1 score metric evaluates the overall precision and recall
     * performance of the model as a single value. A higher value indicates better precision and recall performance. A
     * lower score indicates that precision, recall, or both are performing poorly.
     * </p>
     * 
     * @return The F1 score for the evaluation of all labels. The F1 score metric evaluates the overall precision and
     *         recall performance of the model as a single value. A higher value indicates better precision and recall
     *         performance. A lower score indicates that precision, recall, or both are performing poorly.
     */

    public Float getF1Score() {
        return this.f1Score;
    }

    /**
     * <p>
     * The F1 score for the evaluation of all labels. The F1 score metric evaluates the overall precision and recall
     * performance of the model as a single value. A higher value indicates better precision and recall performance. A
     * lower score indicates that precision, recall, or both are performing poorly.
     * </p>
     * 
     * @param f1Score
     *        The F1 score for the evaluation of all labels. The F1 score metric evaluates the overall precision and
     *        recall performance of the model as a single value. A higher value indicates better precision and recall
     *        performance. A lower score indicates that precision, recall, or both are performing poorly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResult withF1Score(Float f1Score) {
        setF1Score(f1Score);
        return this;
    }

    /**
     * <p>
     * The S3 bucket that contains the training summary.
     * </p>
     * 
     * @param summary
     *        The S3 bucket that contains the training summary.
     */

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * The S3 bucket that contains the training summary.
     * </p>
     * 
     * @return The S3 bucket that contains the training summary.
     */

    public Summary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * The S3 bucket that contains the training summary.
     * </p>
     * 
     * @param summary
     *        The S3 bucket that contains the training summary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResult withSummary(Summary summary) {
        setSummary(summary);
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
        if (getF1Score() != null)
            sb.append("F1Score: ").append(getF1Score()).append(",");
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationResult == false)
            return false;
        EvaluationResult other = (EvaluationResult) obj;
        if (other.getF1Score() == null ^ this.getF1Score() == null)
            return false;
        if (other.getF1Score() != null && other.getF1Score().equals(this.getF1Score()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getF1Score() == null) ? 0 : getF1Score().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationResult clone() {
        try {
            return (EvaluationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.EvaluationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
