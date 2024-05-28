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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The evaluation metrics associated with the evaluated model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/FlywheelModelEvaluationMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlywheelModelEvaluationMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The average F1 score from the evaluation metrics.
     * </p>
     */
    private Double averageF1Score;
    /**
     * <p>
     * Average precision metric for the model.
     * </p>
     */
    private Double averagePrecision;
    /**
     * <p>
     * Average recall metric for the model.
     * </p>
     */
    private Double averageRecall;
    /**
     * <p>
     * Average accuracy metric for the model.
     * </p>
     */
    private Double averageAccuracy;

    /**
     * <p>
     * The average F1 score from the evaluation metrics.
     * </p>
     * 
     * @param averageF1Score
     *        The average F1 score from the evaluation metrics.
     */

    public void setAverageF1Score(Double averageF1Score) {
        this.averageF1Score = averageF1Score;
    }

    /**
     * <p>
     * The average F1 score from the evaluation metrics.
     * </p>
     * 
     * @return The average F1 score from the evaluation metrics.
     */

    public Double getAverageF1Score() {
        return this.averageF1Score;
    }

    /**
     * <p>
     * The average F1 score from the evaluation metrics.
     * </p>
     * 
     * @param averageF1Score
     *        The average F1 score from the evaluation metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelModelEvaluationMetrics withAverageF1Score(Double averageF1Score) {
        setAverageF1Score(averageF1Score);
        return this;
    }

    /**
     * <p>
     * Average precision metric for the model.
     * </p>
     * 
     * @param averagePrecision
     *        Average precision metric for the model.
     */

    public void setAveragePrecision(Double averagePrecision) {
        this.averagePrecision = averagePrecision;
    }

    /**
     * <p>
     * Average precision metric for the model.
     * </p>
     * 
     * @return Average precision metric for the model.
     */

    public Double getAveragePrecision() {
        return this.averagePrecision;
    }

    /**
     * <p>
     * Average precision metric for the model.
     * </p>
     * 
     * @param averagePrecision
     *        Average precision metric for the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelModelEvaluationMetrics withAveragePrecision(Double averagePrecision) {
        setAveragePrecision(averagePrecision);
        return this;
    }

    /**
     * <p>
     * Average recall metric for the model.
     * </p>
     * 
     * @param averageRecall
     *        Average recall metric for the model.
     */

    public void setAverageRecall(Double averageRecall) {
        this.averageRecall = averageRecall;
    }

    /**
     * <p>
     * Average recall metric for the model.
     * </p>
     * 
     * @return Average recall metric for the model.
     */

    public Double getAverageRecall() {
        return this.averageRecall;
    }

    /**
     * <p>
     * Average recall metric for the model.
     * </p>
     * 
     * @param averageRecall
     *        Average recall metric for the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelModelEvaluationMetrics withAverageRecall(Double averageRecall) {
        setAverageRecall(averageRecall);
        return this;
    }

    /**
     * <p>
     * Average accuracy metric for the model.
     * </p>
     * 
     * @param averageAccuracy
     *        Average accuracy metric for the model.
     */

    public void setAverageAccuracy(Double averageAccuracy) {
        this.averageAccuracy = averageAccuracy;
    }

    /**
     * <p>
     * Average accuracy metric for the model.
     * </p>
     * 
     * @return Average accuracy metric for the model.
     */

    public Double getAverageAccuracy() {
        return this.averageAccuracy;
    }

    /**
     * <p>
     * Average accuracy metric for the model.
     * </p>
     * 
     * @param averageAccuracy
     *        Average accuracy metric for the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlywheelModelEvaluationMetrics withAverageAccuracy(Double averageAccuracy) {
        setAverageAccuracy(averageAccuracy);
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
        if (getAverageF1Score() != null)
            sb.append("AverageF1Score: ").append(getAverageF1Score()).append(",");
        if (getAveragePrecision() != null)
            sb.append("AveragePrecision: ").append(getAveragePrecision()).append(",");
        if (getAverageRecall() != null)
            sb.append("AverageRecall: ").append(getAverageRecall()).append(",");
        if (getAverageAccuracy() != null)
            sb.append("AverageAccuracy: ").append(getAverageAccuracy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlywheelModelEvaluationMetrics == false)
            return false;
        FlywheelModelEvaluationMetrics other = (FlywheelModelEvaluationMetrics) obj;
        if (other.getAverageF1Score() == null ^ this.getAverageF1Score() == null)
            return false;
        if (other.getAverageF1Score() != null && other.getAverageF1Score().equals(this.getAverageF1Score()) == false)
            return false;
        if (other.getAveragePrecision() == null ^ this.getAveragePrecision() == null)
            return false;
        if (other.getAveragePrecision() != null && other.getAveragePrecision().equals(this.getAveragePrecision()) == false)
            return false;
        if (other.getAverageRecall() == null ^ this.getAverageRecall() == null)
            return false;
        if (other.getAverageRecall() != null && other.getAverageRecall().equals(this.getAverageRecall()) == false)
            return false;
        if (other.getAverageAccuracy() == null ^ this.getAverageAccuracy() == null)
            return false;
        if (other.getAverageAccuracy() != null && other.getAverageAccuracy().equals(this.getAverageAccuracy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAverageF1Score() == null) ? 0 : getAverageF1Score().hashCode());
        hashCode = prime * hashCode + ((getAveragePrecision() == null) ? 0 : getAveragePrecision().hashCode());
        hashCode = prime * hashCode + ((getAverageRecall() == null) ? 0 : getAverageRecall().hashCode());
        hashCode = prime * hashCode + ((getAverageAccuracy() == null) ? 0 : getAverageAccuracy().hashCode());
        return hashCode;
    }

    @Override
    public FlywheelModelEvaluationMetrics clone() {
        try {
            return (FlywheelModelEvaluationMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.FlywheelModelEvaluationMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
