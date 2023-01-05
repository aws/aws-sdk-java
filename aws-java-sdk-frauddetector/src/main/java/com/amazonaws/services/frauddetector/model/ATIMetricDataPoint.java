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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Account Takeover Insights (ATI) model performance metrics data points.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ATIMetricDataPoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ATIMetricDataPoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The challenge rate. This indicates the percentage of login events that the model recommends to challenge such as
     * one-time password, multi-factor authentication, and investigations.
     * </p>
     */
    private Float cr;
    /**
     * <p>
     * The anomaly discovery rate. This metric quantifies the percentage of anomalies that can be detected by the model
     * at the selected score threshold. A lower score threshold increases the percentage of anomalies captured by the
     * model, but would also require challenging a larger percentage of login events, leading to a higher customer
     * friction.
     * </p>
     */
    private Float adr;
    /**
     * <p>
     * The model's threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500 means any
     * model score 500 or above is labeled as fraud.
     * </p>
     */
    private Float threshold;
    /**
     * <p>
     * The account takeover discovery rate. This metric quantifies the percentage of account compromise events that can
     * be detected by the model at the selected score threshold. This metric is only available if 50 or more entities
     * with at-least one labeled account takeover event is present in the ingested dataset.
     * </p>
     */
    private Float atodr;

    /**
     * <p>
     * The challenge rate. This indicates the percentage of login events that the model recommends to challenge such as
     * one-time password, multi-factor authentication, and investigations.
     * </p>
     * 
     * @param cr
     *        The challenge rate. This indicates the percentage of login events that the model recommends to challenge
     *        such as one-time password, multi-factor authentication, and investigations.
     */

    public void setCr(Float cr) {
        this.cr = cr;
    }

    /**
     * <p>
     * The challenge rate. This indicates the percentage of login events that the model recommends to challenge such as
     * one-time password, multi-factor authentication, and investigations.
     * </p>
     * 
     * @return The challenge rate. This indicates the percentage of login events that the model recommends to challenge
     *         such as one-time password, multi-factor authentication, and investigations.
     */

    public Float getCr() {
        return this.cr;
    }

    /**
     * <p>
     * The challenge rate. This indicates the percentage of login events that the model recommends to challenge such as
     * one-time password, multi-factor authentication, and investigations.
     * </p>
     * 
     * @param cr
     *        The challenge rate. This indicates the percentage of login events that the model recommends to challenge
     *        such as one-time password, multi-factor authentication, and investigations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ATIMetricDataPoint withCr(Float cr) {
        setCr(cr);
        return this;
    }

    /**
     * <p>
     * The anomaly discovery rate. This metric quantifies the percentage of anomalies that can be detected by the model
     * at the selected score threshold. A lower score threshold increases the percentage of anomalies captured by the
     * model, but would also require challenging a larger percentage of login events, leading to a higher customer
     * friction.
     * </p>
     * 
     * @param adr
     *        The anomaly discovery rate. This metric quantifies the percentage of anomalies that can be detected by the
     *        model at the selected score threshold. A lower score threshold increases the percentage of anomalies
     *        captured by the model, but would also require challenging a larger percentage of login events, leading to
     *        a higher customer friction.
     */

    public void setAdr(Float adr) {
        this.adr = adr;
    }

    /**
     * <p>
     * The anomaly discovery rate. This metric quantifies the percentage of anomalies that can be detected by the model
     * at the selected score threshold. A lower score threshold increases the percentage of anomalies captured by the
     * model, but would also require challenging a larger percentage of login events, leading to a higher customer
     * friction.
     * </p>
     * 
     * @return The anomaly discovery rate. This metric quantifies the percentage of anomalies that can be detected by
     *         the model at the selected score threshold. A lower score threshold increases the percentage of anomalies
     *         captured by the model, but would also require challenging a larger percentage of login events, leading to
     *         a higher customer friction.
     */

    public Float getAdr() {
        return this.adr;
    }

    /**
     * <p>
     * The anomaly discovery rate. This metric quantifies the percentage of anomalies that can be detected by the model
     * at the selected score threshold. A lower score threshold increases the percentage of anomalies captured by the
     * model, but would also require challenging a larger percentage of login events, leading to a higher customer
     * friction.
     * </p>
     * 
     * @param adr
     *        The anomaly discovery rate. This metric quantifies the percentage of anomalies that can be detected by the
     *        model at the selected score threshold. A lower score threshold increases the percentage of anomalies
     *        captured by the model, but would also require challenging a larger percentage of login events, leading to
     *        a higher customer friction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ATIMetricDataPoint withAdr(Float adr) {
        setAdr(adr);
        return this;
    }

    /**
     * <p>
     * The model's threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500 means any
     * model score 500 or above is labeled as fraud.
     * </p>
     * 
     * @param threshold
     *        The model's threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500
     *        means any model score 500 or above is labeled as fraud.
     */

    public void setThreshold(Float threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The model's threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500 means any
     * model score 500 or above is labeled as fraud.
     * </p>
     * 
     * @return The model's threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500
     *         means any model score 500 or above is labeled as fraud.
     */

    public Float getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The model's threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500 means any
     * model score 500 or above is labeled as fraud.
     * </p>
     * 
     * @param threshold
     *        The model's threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500
     *        means any model score 500 or above is labeled as fraud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ATIMetricDataPoint withThreshold(Float threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * The account takeover discovery rate. This metric quantifies the percentage of account compromise events that can
     * be detected by the model at the selected score threshold. This metric is only available if 50 or more entities
     * with at-least one labeled account takeover event is present in the ingested dataset.
     * </p>
     * 
     * @param atodr
     *        The account takeover discovery rate. This metric quantifies the percentage of account compromise events
     *        that can be detected by the model at the selected score threshold. This metric is only available if 50 or
     *        more entities with at-least one labeled account takeover event is present in the ingested dataset.
     */

    public void setAtodr(Float atodr) {
        this.atodr = atodr;
    }

    /**
     * <p>
     * The account takeover discovery rate. This metric quantifies the percentage of account compromise events that can
     * be detected by the model at the selected score threshold. This metric is only available if 50 or more entities
     * with at-least one labeled account takeover event is present in the ingested dataset.
     * </p>
     * 
     * @return The account takeover discovery rate. This metric quantifies the percentage of account compromise events
     *         that can be detected by the model at the selected score threshold. This metric is only available if 50 or
     *         more entities with at-least one labeled account takeover event is present in the ingested dataset.
     */

    public Float getAtodr() {
        return this.atodr;
    }

    /**
     * <p>
     * The account takeover discovery rate. This metric quantifies the percentage of account compromise events that can
     * be detected by the model at the selected score threshold. This metric is only available if 50 or more entities
     * with at-least one labeled account takeover event is present in the ingested dataset.
     * </p>
     * 
     * @param atodr
     *        The account takeover discovery rate. This metric quantifies the percentage of account compromise events
     *        that can be detected by the model at the selected score threshold. This metric is only available if 50 or
     *        more entities with at-least one labeled account takeover event is present in the ingested dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ATIMetricDataPoint withAtodr(Float atodr) {
        setAtodr(atodr);
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
        if (getCr() != null)
            sb.append("Cr: ").append(getCr()).append(",");
        if (getAdr() != null)
            sb.append("Adr: ").append(getAdr()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getAtodr() != null)
            sb.append("Atodr: ").append(getAtodr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ATIMetricDataPoint == false)
            return false;
        ATIMetricDataPoint other = (ATIMetricDataPoint) obj;
        if (other.getCr() == null ^ this.getCr() == null)
            return false;
        if (other.getCr() != null && other.getCr().equals(this.getCr()) == false)
            return false;
        if (other.getAdr() == null ^ this.getAdr() == null)
            return false;
        if (other.getAdr() != null && other.getAdr().equals(this.getAdr()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getAtodr() == null ^ this.getAtodr() == null)
            return false;
        if (other.getAtodr() != null && other.getAtodr().equals(this.getAtodr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCr() == null) ? 0 : getCr().hashCode());
        hashCode = prime * hashCode + ((getAdr() == null) ? 0 : getAdr().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getAtodr() == null) ? 0 : getAtodr().hashCode());
        return hashCode;
    }

    @Override
    public ATIMetricDataPoint clone() {
        try {
            return (ATIMetricDataPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.ATIMetricDataPointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
