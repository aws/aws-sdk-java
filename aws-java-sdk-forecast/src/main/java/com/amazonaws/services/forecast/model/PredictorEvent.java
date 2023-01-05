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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about a predictor event, such as a retraining.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/PredictorEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictorEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of event. For example, <code>Retrain</code>. A retraining event denotes the timepoint when a predictor
     * was retrained. Any monitor results from before the <code>Datetime</code> are from the previous predictor. Any new
     * metrics are for the newly retrained predictor.
     * </p>
     */
    private String detail;
    /**
     * <p>
     * The timestamp for when the event occurred.
     * </p>
     */
    private java.util.Date datetime;

    /**
     * <p>
     * The type of event. For example, <code>Retrain</code>. A retraining event denotes the timepoint when a predictor
     * was retrained. Any monitor results from before the <code>Datetime</code> are from the previous predictor. Any new
     * metrics are for the newly retrained predictor.
     * </p>
     * 
     * @param detail
     *        The type of event. For example, <code>Retrain</code>. A retraining event denotes the timepoint when a
     *        predictor was retrained. Any monitor results from before the <code>Datetime</code> are from the previous
     *        predictor. Any new metrics are for the newly retrained predictor.
     */

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * <p>
     * The type of event. For example, <code>Retrain</code>. A retraining event denotes the timepoint when a predictor
     * was retrained. Any monitor results from before the <code>Datetime</code> are from the previous predictor. Any new
     * metrics are for the newly retrained predictor.
     * </p>
     * 
     * @return The type of event. For example, <code>Retrain</code>. A retraining event denotes the timepoint when a
     *         predictor was retrained. Any monitor results from before the <code>Datetime</code> are from the previous
     *         predictor. Any new metrics are for the newly retrained predictor.
     */

    public String getDetail() {
        return this.detail;
    }

    /**
     * <p>
     * The type of event. For example, <code>Retrain</code>. A retraining event denotes the timepoint when a predictor
     * was retrained. Any monitor results from before the <code>Datetime</code> are from the previous predictor. Any new
     * metrics are for the newly retrained predictor.
     * </p>
     * 
     * @param detail
     *        The type of event. For example, <code>Retrain</code>. A retraining event denotes the timepoint when a
     *        predictor was retrained. Any monitor results from before the <code>Datetime</code> are from the previous
     *        predictor. Any new metrics are for the newly retrained predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorEvent withDetail(String detail) {
        setDetail(detail);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the event occurred.
     * </p>
     * 
     * @param datetime
     *        The timestamp for when the event occurred.
     */

    public void setDatetime(java.util.Date datetime) {
        this.datetime = datetime;
    }

    /**
     * <p>
     * The timestamp for when the event occurred.
     * </p>
     * 
     * @return The timestamp for when the event occurred.
     */

    public java.util.Date getDatetime() {
        return this.datetime;
    }

    /**
     * <p>
     * The timestamp for when the event occurred.
     * </p>
     * 
     * @param datetime
     *        The timestamp for when the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorEvent withDatetime(java.util.Date datetime) {
        setDatetime(datetime);
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
        if (getDetail() != null)
            sb.append("Detail: ").append(getDetail()).append(",");
        if (getDatetime() != null)
            sb.append("Datetime: ").append(getDatetime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictorEvent == false)
            return false;
        PredictorEvent other = (PredictorEvent) obj;
        if (other.getDetail() == null ^ this.getDetail() == null)
            return false;
        if (other.getDetail() != null && other.getDetail().equals(this.getDetail()) == false)
            return false;
        if (other.getDatetime() == null ^ this.getDatetime() == null)
            return false;
        if (other.getDatetime() != null && other.getDatetime().equals(this.getDatetime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetail() == null) ? 0 : getDetail().hashCode());
        hashCode = prime * hashCode + ((getDatetime() == null) ? 0 : getDatetime().hashCode());
        return hashCode;
    }

    @Override
    public PredictorEvent clone() {
        try {
            return (PredictorEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.PredictorEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
