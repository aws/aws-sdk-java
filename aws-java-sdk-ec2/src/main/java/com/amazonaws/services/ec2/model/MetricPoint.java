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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Indicates whether the network was healthy or unhealthy at a particular point. The value is aggregated from the
 * <code>startDate</code> to the <code>endDate</code>. Currently only <code>five_minutes</code> is supported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/MetricPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricPoint implements Serializable, Cloneable {

    /**
     * <p>
     * The start date for the metric point. The starting date for the metric point. The starting time must be formatted
     * as <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-10T12:00:00.000Z</code>.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The end date for the metric point. The ending time must be formatted as <code>yyyy-mm-ddThh:mm:ss</code>. For
     * example, <code>2022-06-12T12:00:00.000Z</code>.
     * </p>
     */
    private java.util.Date endDate;

    private Float value;
    /**
     * <p>
     * The status of the metric point.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The start date for the metric point. The starting date for the metric point. The starting time must be formatted
     * as <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-10T12:00:00.000Z</code>.
     * </p>
     * 
     * @param startDate
     *        The start date for the metric point. The starting date for the metric point. The starting time must be
     *        formatted as <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-10T12:00:00.000Z</code>.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The start date for the metric point. The starting date for the metric point. The starting time must be formatted
     * as <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-10T12:00:00.000Z</code>.
     * </p>
     * 
     * @return The start date for the metric point. The starting date for the metric point. The starting time must be
     *         formatted as <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-10T12:00:00.000Z</code>.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The start date for the metric point. The starting date for the metric point. The starting time must be formatted
     * as <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-10T12:00:00.000Z</code>.
     * </p>
     * 
     * @param startDate
     *        The start date for the metric point. The starting date for the metric point. The starting time must be
     *        formatted as <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-10T12:00:00.000Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricPoint withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The end date for the metric point. The ending time must be formatted as <code>yyyy-mm-ddThh:mm:ss</code>. For
     * example, <code>2022-06-12T12:00:00.000Z</code>.
     * </p>
     * 
     * @param endDate
     *        The end date for the metric point. The ending time must be formatted as <code>yyyy-mm-ddThh:mm:ss</code>.
     *        For example, <code>2022-06-12T12:00:00.000Z</code>.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The end date for the metric point. The ending time must be formatted as <code>yyyy-mm-ddThh:mm:ss</code>. For
     * example, <code>2022-06-12T12:00:00.000Z</code>.
     * </p>
     * 
     * @return The end date for the metric point. The ending time must be formatted as <code>yyyy-mm-ddThh:mm:ss</code>.
     *         For example, <code>2022-06-12T12:00:00.000Z</code>.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The end date for the metric point. The ending time must be formatted as <code>yyyy-mm-ddThh:mm:ss</code>. For
     * example, <code>2022-06-12T12:00:00.000Z</code>.
     * </p>
     * 
     * @param endDate
     *        The end date for the metric point. The ending time must be formatted as <code>yyyy-mm-ddThh:mm:ss</code>.
     *        For example, <code>2022-06-12T12:00:00.000Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricPoint withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * @param value
     */

    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * @return
     */

    public Float getValue() {
        return this.value;
    }

    /**
     * @param value
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricPoint withValue(Float value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The status of the metric point.
     * </p>
     * 
     * @param status
     *        The status of the metric point.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the metric point.
     * </p>
     * 
     * @return The status of the metric point.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the metric point.
     * </p>
     * 
     * @param status
     *        The status of the metric point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricPoint withStatus(String status) {
        setStatus(status);
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
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricPoint == false)
            return false;
        MetricPoint other = (MetricPoint) obj;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public MetricPoint clone() {
        try {
            return (MetricPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
