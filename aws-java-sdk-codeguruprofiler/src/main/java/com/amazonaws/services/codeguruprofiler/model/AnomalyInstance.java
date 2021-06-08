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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The specific duration in which the metric is flagged as anomalous.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/AnomalyInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The end time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601
     * format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The universally unique identifier (UUID) of an instance of an anomaly in a metric.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The start time of the period during which the metric is flagged as anomalous. This is specified using the ISO
     * 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Feedback type on a specific instance of anomaly submitted by the user.
     * </p>
     */
    private UserFeedback userFeedback;

    /**
     * <p>
     * The end time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601
     * format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param endTime
     *        The end time of the period during which the metric is flagged as anomalous. This is specified using the
     *        ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02
     *        PM UTC.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601
     * format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @return The end time of the period during which the metric is flagged as anomalous. This is specified using the
     *         ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02
     *         PM UTC.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the period during which the metric is flagged as anomalous. This is specified using the ISO 8601
     * format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param endTime
     *        The end time of the period during which the metric is flagged as anomalous. This is specified using the
     *        ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02
     *        PM UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyInstance withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of an instance of an anomaly in a metric.
     * </p>
     * 
     * @param id
     *        The universally unique identifier (UUID) of an instance of an anomaly in a metric.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of an instance of an anomaly in a metric.
     * </p>
     * 
     * @return The universally unique identifier (UUID) of an instance of an anomaly in a metric.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of an instance of an anomaly in a metric.
     * </p>
     * 
     * @param id
     *        The universally unique identifier (UUID) of an instance of an anomaly in a metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyInstance withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The start time of the period during which the metric is flagged as anomalous. This is specified using the ISO
     * 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param startTime
     *        The start time of the period during which the metric is flagged as anomalous. This is specified using the
     *        ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02
     *        PM UTC.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the period during which the metric is flagged as anomalous. This is specified using the ISO
     * 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @return The start time of the period during which the metric is flagged as anomalous. This is specified using the
     *         ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02
     *         PM UTC.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the period during which the metric is flagged as anomalous. This is specified using the ISO
     * 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param startTime
     *        The start time of the period during which the metric is flagged as anomalous. This is specified using the
     *        ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02
     *        PM UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyInstance withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Feedback type on a specific instance of anomaly submitted by the user.
     * </p>
     * 
     * @param userFeedback
     *        Feedback type on a specific instance of anomaly submitted by the user.
     */

    public void setUserFeedback(UserFeedback userFeedback) {
        this.userFeedback = userFeedback;
    }

    /**
     * <p>
     * Feedback type on a specific instance of anomaly submitted by the user.
     * </p>
     * 
     * @return Feedback type on a specific instance of anomaly submitted by the user.
     */

    public UserFeedback getUserFeedback() {
        return this.userFeedback;
    }

    /**
     * <p>
     * Feedback type on a specific instance of anomaly submitted by the user.
     * </p>
     * 
     * @param userFeedback
     *        Feedback type on a specific instance of anomaly submitted by the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyInstance withUserFeedback(UserFeedback userFeedback) {
        setUserFeedback(userFeedback);
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getUserFeedback() != null)
            sb.append("UserFeedback: ").append(getUserFeedback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyInstance == false)
            return false;
        AnomalyInstance other = (AnomalyInstance) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getUserFeedback() == null ^ this.getUserFeedback() == null)
            return false;
        if (other.getUserFeedback() != null && other.getUserFeedback().equals(this.getUserFeedback()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getUserFeedback() == null) ? 0 : getUserFeedback().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyInstance clone() {
        try {
            return (AnomalyInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.AnomalyInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
