/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Model performance metrics data points.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/MetricDataPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDataPoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The false positive rate. This is the percentage of total legitimate events that are incorrectly predicted as
     * fraud.
     * </p>
     */
    private Float fpr;
    /**
     * <p>
     * The percentage of fraud events correctly predicted as fraudulent as compared to all events predicted as
     * fraudulent.
     * </p>
     */
    private Float precision;
    /**
     * <p>
     * The true positive rate. This is the percentage of total fraud the model detects. Also known as capture rate.
     * </p>
     */
    private Float tpr;
    /**
     * <p>
     * The model threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500 means any
     * model score 500 or above is labeled as fraud.
     * </p>
     */
    private Float threshold;

    /**
     * <p>
     * The false positive rate. This is the percentage of total legitimate events that are incorrectly predicted as
     * fraud.
     * </p>
     * 
     * @param fpr
     *        The false positive rate. This is the percentage of total legitimate events that are incorrectly predicted
     *        as fraud.
     */

    public void setFpr(Float fpr) {
        this.fpr = fpr;
    }

    /**
     * <p>
     * The false positive rate. This is the percentage of total legitimate events that are incorrectly predicted as
     * fraud.
     * </p>
     * 
     * @return The false positive rate. This is the percentage of total legitimate events that are incorrectly predicted
     *         as fraud.
     */

    public Float getFpr() {
        return this.fpr;
    }

    /**
     * <p>
     * The false positive rate. This is the percentage of total legitimate events that are incorrectly predicted as
     * fraud.
     * </p>
     * 
     * @param fpr
     *        The false positive rate. This is the percentage of total legitimate events that are incorrectly predicted
     *        as fraud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataPoint withFpr(Float fpr) {
        setFpr(fpr);
        return this;
    }

    /**
     * <p>
     * The percentage of fraud events correctly predicted as fraudulent as compared to all events predicted as
     * fraudulent.
     * </p>
     * 
     * @param precision
     *        The percentage of fraud events correctly predicted as fraudulent as compared to all events predicted as
     *        fraudulent.
     */

    public void setPrecision(Float precision) {
        this.precision = precision;
    }

    /**
     * <p>
     * The percentage of fraud events correctly predicted as fraudulent as compared to all events predicted as
     * fraudulent.
     * </p>
     * 
     * @return The percentage of fraud events correctly predicted as fraudulent as compared to all events predicted as
     *         fraudulent.
     */

    public Float getPrecision() {
        return this.precision;
    }

    /**
     * <p>
     * The percentage of fraud events correctly predicted as fraudulent as compared to all events predicted as
     * fraudulent.
     * </p>
     * 
     * @param precision
     *        The percentage of fraud events correctly predicted as fraudulent as compared to all events predicted as
     *        fraudulent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataPoint withPrecision(Float precision) {
        setPrecision(precision);
        return this;
    }

    /**
     * <p>
     * The true positive rate. This is the percentage of total fraud the model detects. Also known as capture rate.
     * </p>
     * 
     * @param tpr
     *        The true positive rate. This is the percentage of total fraud the model detects. Also known as capture
     *        rate.
     */

    public void setTpr(Float tpr) {
        this.tpr = tpr;
    }

    /**
     * <p>
     * The true positive rate. This is the percentage of total fraud the model detects. Also known as capture rate.
     * </p>
     * 
     * @return The true positive rate. This is the percentage of total fraud the model detects. Also known as capture
     *         rate.
     */

    public Float getTpr() {
        return this.tpr;
    }

    /**
     * <p>
     * The true positive rate. This is the percentage of total fraud the model detects. Also known as capture rate.
     * </p>
     * 
     * @param tpr
     *        The true positive rate. This is the percentage of total fraud the model detects. Also known as capture
     *        rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataPoint withTpr(Float tpr) {
        setTpr(tpr);
        return this;
    }

    /**
     * <p>
     * The model threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500 means any
     * model score 500 or above is labeled as fraud.
     * </p>
     * 
     * @param threshold
     *        The model threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500 means
     *        any model score 500 or above is labeled as fraud.
     */

    public void setThreshold(Float threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The model threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500 means any
     * model score 500 or above is labeled as fraud.
     * </p>
     * 
     * @return The model threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500
     *         means any model score 500 or above is labeled as fraud.
     */

    public Float getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The model threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500 means any
     * model score 500 or above is labeled as fraud.
     * </p>
     * 
     * @param threshold
     *        The model threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500 means
     *        any model score 500 or above is labeled as fraud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDataPoint withThreshold(Float threshold) {
        setThreshold(threshold);
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
        if (getFpr() != null)
            sb.append("Fpr: ").append(getFpr()).append(",");
        if (getPrecision() != null)
            sb.append("Precision: ").append(getPrecision()).append(",");
        if (getTpr() != null)
            sb.append("Tpr: ").append(getTpr()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricDataPoint == false)
            return false;
        MetricDataPoint other = (MetricDataPoint) obj;
        if (other.getFpr() == null ^ this.getFpr() == null)
            return false;
        if (other.getFpr() != null && other.getFpr().equals(this.getFpr()) == false)
            return false;
        if (other.getPrecision() == null ^ this.getPrecision() == null)
            return false;
        if (other.getPrecision() != null && other.getPrecision().equals(this.getPrecision()) == false)
            return false;
        if (other.getTpr() == null ^ this.getTpr() == null)
            return false;
        if (other.getTpr() != null && other.getTpr().equals(this.getTpr()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFpr() == null) ? 0 : getFpr().hashCode());
        hashCode = prime * hashCode + ((getPrecision() == null) ? 0 : getPrecision().hashCode());
        hashCode = prime * hashCode + ((getTpr() == null) ? 0 : getTpr().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        return hashCode;
    }

    @Override
    public MetricDataPoint clone() {
        try {
            return (MetricDataPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.MetricDataPointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
