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
 * The interval period with the start and end time for the metrics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/MetricInterval" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricInterval implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The interval period provided in the API request.
     * </p>
     */
    private String interval;
    /**
     * <p>
     * The timestamp, in UNIX Epoch time format. Start time is based on the interval period selected.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The timestamp, in UNIX Epoch time format. End time is based on the interval period selected. For example, If
     * <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code> and <code>EndTime</code>
     * in the API request differs by 1 day, then 48 results are returned in the response. Each result is aggregated by
     * the 30 minutes period, with each <code>StartTime</code> and <code>EndTime</code> differing by 30 minutes.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The interval period provided in the API request.
     * </p>
     * 
     * @param interval
     *        The interval period provided in the API request.
     * @see IntervalPeriod
     */

    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The interval period provided in the API request.
     * </p>
     * 
     * @return The interval period provided in the API request.
     * @see IntervalPeriod
     */

    public String getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The interval period provided in the API request.
     * </p>
     * 
     * @param interval
     *        The interval period provided in the API request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntervalPeriod
     */

    public MetricInterval withInterval(String interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The interval period provided in the API request.
     * </p>
     * 
     * @param interval
     *        The interval period provided in the API request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntervalPeriod
     */

    public MetricInterval withInterval(IntervalPeriod interval) {
        this.interval = interval.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format. Start time is based on the interval period selected.
     * </p>
     * 
     * @param startTime
     *        The timestamp, in UNIX Epoch time format. Start time is based on the interval period selected.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format. Start time is based on the interval period selected.
     * </p>
     * 
     * @return The timestamp, in UNIX Epoch time format. Start time is based on the interval period selected.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format. Start time is based on the interval period selected.
     * </p>
     * 
     * @param startTime
     *        The timestamp, in UNIX Epoch time format. Start time is based on the interval period selected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricInterval withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format. End time is based on the interval period selected. For example, If
     * <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code> and <code>EndTime</code>
     * in the API request differs by 1 day, then 48 results are returned in the response. Each result is aggregated by
     * the 30 minutes period, with each <code>StartTime</code> and <code>EndTime</code> differing by 30 minutes.
     * </p>
     * 
     * @param endTime
     *        The timestamp, in UNIX Epoch time format. End time is based on the interval period selected. For example,
     *        If <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code> and
     *        <code>EndTime</code> in the API request differs by 1 day, then 48 results are returned in the response.
     *        Each result is aggregated by the 30 minutes period, with each <code>StartTime</code> and
     *        <code>EndTime</code> differing by 30 minutes.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format. End time is based on the interval period selected. For example, If
     * <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code> and <code>EndTime</code>
     * in the API request differs by 1 day, then 48 results are returned in the response. Each result is aggregated by
     * the 30 minutes period, with each <code>StartTime</code> and <code>EndTime</code> differing by 30 minutes.
     * </p>
     * 
     * @return The timestamp, in UNIX Epoch time format. End time is based on the interval period selected. For example,
     *         If <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code> and
     *         <code>EndTime</code> in the API request differs by 1 day, then 48 results are returned in the response.
     *         Each result is aggregated by the 30 minutes period, with each <code>StartTime</code> and
     *         <code>EndTime</code> differing by 30 minutes.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The timestamp, in UNIX Epoch time format. End time is based on the interval period selected. For example, If
     * <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code> and <code>EndTime</code>
     * in the API request differs by 1 day, then 48 results are returned in the response. Each result is aggregated by
     * the 30 minutes period, with each <code>StartTime</code> and <code>EndTime</code> differing by 30 minutes.
     * </p>
     * 
     * @param endTime
     *        The timestamp, in UNIX Epoch time format. End time is based on the interval period selected. For example,
     *        If <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code> and
     *        <code>EndTime</code> in the API request differs by 1 day, then 48 results are returned in the response.
     *        Each result is aggregated by the 30 minutes period, with each <code>StartTime</code> and
     *        <code>EndTime</code> differing by 30 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricInterval withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricInterval == false)
            return false;
        MetricInterval other = (MetricInterval) obj;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public MetricInterval clone() {
        try {
            return (MetricInterval) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.MetricIntervalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
