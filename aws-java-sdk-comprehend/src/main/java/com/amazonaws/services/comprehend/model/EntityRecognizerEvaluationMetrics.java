/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about the accuracy of an entity recognizer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EntityRecognizerEvaluationMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityRecognizerEvaluationMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data. High precision means that the recognizer
     * returned substantially more relevant results than irrelevant ones.
     * </p>
     */
    private Double precision;
    /**
     * <p>
     * A measure of how complete the recognizer results are for the test data. High recall means that the recognizer
     * returned most of the relevant results.
     * </p>
     */
    private Double recall;
    /**
     * <p>
     * A measure of how accurate the recognizer results are for the test data. It is derived from the
     * <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the harmonic average of the
     * two scores. The highest score is 1, and the worst score is 0.
     * </p>
     */
    private Double f1Score;

    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data. High precision means that the recognizer
     * returned substantially more relevant results than irrelevant ones.
     * </p>
     * 
     * @param precision
     *        A measure of the usefulness of the recognizer results in the test data. High precision means that the
     *        recognizer returned substantially more relevant results than irrelevant ones.
     */

    public void setPrecision(Double precision) {
        this.precision = precision;
    }

    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data. High precision means that the recognizer
     * returned substantially more relevant results than irrelevant ones.
     * </p>
     * 
     * @return A measure of the usefulness of the recognizer results in the test data. High precision means that the
     *         recognizer returned substantially more relevant results than irrelevant ones.
     */

    public Double getPrecision() {
        return this.precision;
    }

    /**
     * <p>
     * A measure of the usefulness of the recognizer results in the test data. High precision means that the recognizer
     * returned substantially more relevant results than irrelevant ones.
     * </p>
     * 
     * @param precision
     *        A measure of the usefulness of the recognizer results in the test data. High precision means that the
     *        recognizer returned substantially more relevant results than irrelevant ones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerEvaluationMetrics withPrecision(Double precision) {
        setPrecision(precision);
        return this;
    }

    /**
     * <p>
     * A measure of how complete the recognizer results are for the test data. High recall means that the recognizer
     * returned most of the relevant results.
     * </p>
     * 
     * @param recall
     *        A measure of how complete the recognizer results are for the test data. High recall means that the
     *        recognizer returned most of the relevant results.
     */

    public void setRecall(Double recall) {
        this.recall = recall;
    }

    /**
     * <p>
     * A measure of how complete the recognizer results are for the test data. High recall means that the recognizer
     * returned most of the relevant results.
     * </p>
     * 
     * @return A measure of how complete the recognizer results are for the test data. High recall means that the
     *         recognizer returned most of the relevant results.
     */

    public Double getRecall() {
        return this.recall;
    }

    /**
     * <p>
     * A measure of how complete the recognizer results are for the test data. High recall means that the recognizer
     * returned most of the relevant results.
     * </p>
     * 
     * @param recall
     *        A measure of how complete the recognizer results are for the test data. High recall means that the
     *        recognizer returned most of the relevant results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerEvaluationMetrics withRecall(Double recall) {
        setRecall(recall);
        return this;
    }

    /**
     * <p>
     * A measure of how accurate the recognizer results are for the test data. It is derived from the
     * <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the harmonic average of the
     * two scores. The highest score is 1, and the worst score is 0.
     * </p>
     * 
     * @param f1Score
     *        A measure of how accurate the recognizer results are for the test data. It is derived from the
     *        <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the harmonic average of
     *        the two scores. The highest score is 1, and the worst score is 0.
     */

    public void setF1Score(Double f1Score) {
        this.f1Score = f1Score;
    }

    /**
     * <p>
     * A measure of how accurate the recognizer results are for the test data. It is derived from the
     * <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the harmonic average of the
     * two scores. The highest score is 1, and the worst score is 0.
     * </p>
     * 
     * @return A measure of how accurate the recognizer results are for the test data. It is derived from the
     *         <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the harmonic average
     *         of the two scores. The highest score is 1, and the worst score is 0.
     */

    public Double getF1Score() {
        return this.f1Score;
    }

    /**
     * <p>
     * A measure of how accurate the recognizer results are for the test data. It is derived from the
     * <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the harmonic average of the
     * two scores. The highest score is 1, and the worst score is 0.
     * </p>
     * 
     * @param f1Score
     *        A measure of how accurate the recognizer results are for the test data. It is derived from the
     *        <code>Precision</code> and <code>Recall</code> values. The <code>F1Score</code> is the harmonic average of
     *        the two scores. The highest score is 1, and the worst score is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerEvaluationMetrics withF1Score(Double f1Score) {
        setF1Score(f1Score);
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
        if (getPrecision() != null)
            sb.append("Precision: ").append(getPrecision()).append(",");
        if (getRecall() != null)
            sb.append("Recall: ").append(getRecall()).append(",");
        if (getF1Score() != null)
            sb.append("F1Score: ").append(getF1Score());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerEvaluationMetrics == false)
            return false;
        EntityRecognizerEvaluationMetrics other = (EntityRecognizerEvaluationMetrics) obj;
        if (other.getPrecision() == null ^ this.getPrecision() == null)
            return false;
        if (other.getPrecision() != null && other.getPrecision().equals(this.getPrecision()) == false)
            return false;
        if (other.getRecall() == null ^ this.getRecall() == null)
            return false;
        if (other.getRecall() != null && other.getRecall().equals(this.getRecall()) == false)
            return false;
        if (other.getF1Score() == null ^ this.getF1Score() == null)
            return false;
        if (other.getF1Score() != null && other.getF1Score().equals(this.getF1Score()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrecision() == null) ? 0 : getPrecision().hashCode());
        hashCode = prime * hashCode + ((getRecall() == null) ? 0 : getRecall().hashCode());
        hashCode = prime * hashCode + ((getF1Score() == null) ? 0 : getF1Score().hashCode());
        return hashCode;
    }

    @Override
    public EntityRecognizerEvaluationMetrics clone() {
        try {
            return (EntityRecognizerEvaluationMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EntityRecognizerEvaluationMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
