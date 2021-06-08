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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The structure representing the BatchGetFrameMetricDataRequest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/BatchGetFrameMetricData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetFrameMetricDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The end time of the time period for the returned time series values. This is specified using the ISO 8601 format.
     * For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The details of the metrics that are used to request a time series of values. The metric includes the name of the
     * frame, the aggregation type to calculate the metric value for the frame, and the thread states to use to get the
     * count for the metric value of the frame.
     * </p>
     */
    private java.util.List<FrameMetric> frameMetrics;
    /**
     * <p>
     * The duration of the frame metrics used to return the time series values. Specify using the ISO 8601 format. The
     * maximum period duration is one day (<code>PT24H</code> or <code>P1D</code>).
     * </p>
     */
    private String period;
    /**
     * <p>
     * The name of the profiling group associated with the the frame metrics used to return the time series values.
     * </p>
     */
    private String profilingGroupName;
    /**
     * <p>
     * The start time of the time period for the frame metrics used to return the time series values. This is specified
     * using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020
     * 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The requested resolution of time steps for the returned time series of values. If the requested target resolution
     * is not available due to data not being retained we provide a best effort result by falling back to the most
     * granular available resolution after the target resolution. There are 3 valid values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>P1D</code> — 1 day
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PT1H</code> — 1 hour
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PT5M</code> — 5 minutes
     * </p>
     * </li>
     * </ul>
     */
    private String targetResolution;

    /**
     * <p>
     * The end time of the time period for the returned time series values. This is specified using the ISO 8601 format.
     * For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param endTime
     *        The end time of the time period for the returned time series values. This is specified using the ISO 8601
     *        format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the time period for the returned time series values. This is specified using the ISO 8601 format.
     * For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @return The end time of the time period for the returned time series values. This is specified using the ISO 8601
     *         format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the time period for the returned time series values. This is specified using the ISO 8601 format.
     * For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param endTime
     *        The end time of the time period for the returned time series values. This is specified using the ISO 8601
     *        format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFrameMetricDataRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The details of the metrics that are used to request a time series of values. The metric includes the name of the
     * frame, the aggregation type to calculate the metric value for the frame, and the thread states to use to get the
     * count for the metric value of the frame.
     * </p>
     * 
     * @return The details of the metrics that are used to request a time series of values. The metric includes the name
     *         of the frame, the aggregation type to calculate the metric value for the frame, and the thread states to
     *         use to get the count for the metric value of the frame.
     */

    public java.util.List<FrameMetric> getFrameMetrics() {
        return frameMetrics;
    }

    /**
     * <p>
     * The details of the metrics that are used to request a time series of values. The metric includes the name of the
     * frame, the aggregation type to calculate the metric value for the frame, and the thread states to use to get the
     * count for the metric value of the frame.
     * </p>
     * 
     * @param frameMetrics
     *        The details of the metrics that are used to request a time series of values. The metric includes the name
     *        of the frame, the aggregation type to calculate the metric value for the frame, and the thread states to
     *        use to get the count for the metric value of the frame.
     */

    public void setFrameMetrics(java.util.Collection<FrameMetric> frameMetrics) {
        if (frameMetrics == null) {
            this.frameMetrics = null;
            return;
        }

        this.frameMetrics = new java.util.ArrayList<FrameMetric>(frameMetrics);
    }

    /**
     * <p>
     * The details of the metrics that are used to request a time series of values. The metric includes the name of the
     * frame, the aggregation type to calculate the metric value for the frame, and the thread states to use to get the
     * count for the metric value of the frame.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFrameMetrics(java.util.Collection)} or {@link #withFrameMetrics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param frameMetrics
     *        The details of the metrics that are used to request a time series of values. The metric includes the name
     *        of the frame, the aggregation type to calculate the metric value for the frame, and the thread states to
     *        use to get the count for the metric value of the frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFrameMetricDataRequest withFrameMetrics(FrameMetric... frameMetrics) {
        if (this.frameMetrics == null) {
            setFrameMetrics(new java.util.ArrayList<FrameMetric>(frameMetrics.length));
        }
        for (FrameMetric ele : frameMetrics) {
            this.frameMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of the metrics that are used to request a time series of values. The metric includes the name of the
     * frame, the aggregation type to calculate the metric value for the frame, and the thread states to use to get the
     * count for the metric value of the frame.
     * </p>
     * 
     * @param frameMetrics
     *        The details of the metrics that are used to request a time series of values. The metric includes the name
     *        of the frame, the aggregation type to calculate the metric value for the frame, and the thread states to
     *        use to get the count for the metric value of the frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFrameMetricDataRequest withFrameMetrics(java.util.Collection<FrameMetric> frameMetrics) {
        setFrameMetrics(frameMetrics);
        return this;
    }

    /**
     * <p>
     * The duration of the frame metrics used to return the time series values. Specify using the ISO 8601 format. The
     * maximum period duration is one day (<code>PT24H</code> or <code>P1D</code>).
     * </p>
     * 
     * @param period
     *        The duration of the frame metrics used to return the time series values. Specify using the ISO 8601
     *        format. The maximum period duration is one day (<code>PT24H</code> or <code>P1D</code>).
     */

    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * <p>
     * The duration of the frame metrics used to return the time series values. Specify using the ISO 8601 format. The
     * maximum period duration is one day (<code>PT24H</code> or <code>P1D</code>).
     * </p>
     * 
     * @return The duration of the frame metrics used to return the time series values. Specify using the ISO 8601
     *         format. The maximum period duration is one day (<code>PT24H</code> or <code>P1D</code>).
     */

    public String getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The duration of the frame metrics used to return the time series values. Specify using the ISO 8601 format. The
     * maximum period duration is one day (<code>PT24H</code> or <code>P1D</code>).
     * </p>
     * 
     * @param period
     *        The duration of the frame metrics used to return the time series values. Specify using the ISO 8601
     *        format. The maximum period duration is one day (<code>PT24H</code> or <code>P1D</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFrameMetricDataRequest withPeriod(String period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The name of the profiling group associated with the the frame metrics used to return the time series values.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group associated with the the frame metrics used to return the time series
     *        values.
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group associated with the the frame metrics used to return the time series values.
     * </p>
     * 
     * @return The name of the profiling group associated with the the frame metrics used to return the time series
     *         values.
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group associated with the the frame metrics used to return the time series values.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group associated with the the frame metrics used to return the time series
     *        values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFrameMetricDataRequest withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
        return this;
    }

    /**
     * <p>
     * The start time of the time period for the frame metrics used to return the time series values. This is specified
     * using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020
     * 1:15:02 PM UTC.
     * </p>
     * 
     * @param startTime
     *        The start time of the time period for the frame metrics used to return the time series values. This is
     *        specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past
     *        June 1, 2020 1:15:02 PM UTC.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the time period for the frame metrics used to return the time series values. This is specified
     * using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020
     * 1:15:02 PM UTC.
     * </p>
     * 
     * @return The start time of the time period for the frame metrics used to return the time series values. This is
     *         specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past
     *         June 1, 2020 1:15:02 PM UTC.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the time period for the frame metrics used to return the time series values. This is specified
     * using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020
     * 1:15:02 PM UTC.
     * </p>
     * 
     * @param startTime
     *        The start time of the time period for the frame metrics used to return the time series values. This is
     *        specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past
     *        June 1, 2020 1:15:02 PM UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFrameMetricDataRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The requested resolution of time steps for the returned time series of values. If the requested target resolution
     * is not available due to data not being retained we provide a best effort result by falling back to the most
     * granular available resolution after the target resolution. There are 3 valid values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>P1D</code> — 1 day
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PT1H</code> — 1 hour
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PT5M</code> — 5 minutes
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetResolution
     *        The requested resolution of time steps for the returned time series of values. If the requested target
     *        resolution is not available due to data not being retained we provide a best effort result by falling back
     *        to the most granular available resolution after the target resolution. There are 3 valid values. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>P1D</code> — 1 day
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PT1H</code> — 1 hour
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PT5M</code> — 5 minutes
     *        </p>
     *        </li>
     * @see AggregationPeriod
     */

    public void setTargetResolution(String targetResolution) {
        this.targetResolution = targetResolution;
    }

    /**
     * <p>
     * The requested resolution of time steps for the returned time series of values. If the requested target resolution
     * is not available due to data not being retained we provide a best effort result by falling back to the most
     * granular available resolution after the target resolution. There are 3 valid values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>P1D</code> — 1 day
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PT1H</code> — 1 hour
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PT5M</code> — 5 minutes
     * </p>
     * </li>
     * </ul>
     * 
     * @return The requested resolution of time steps for the returned time series of values. If the requested target
     *         resolution is not available due to data not being retained we provide a best effort result by falling
     *         back to the most granular available resolution after the target resolution. There are 3 valid values.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>P1D</code> — 1 day
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PT1H</code> — 1 hour
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PT5M</code> — 5 minutes
     *         </p>
     *         </li>
     * @see AggregationPeriod
     */

    public String getTargetResolution() {
        return this.targetResolution;
    }

    /**
     * <p>
     * The requested resolution of time steps for the returned time series of values. If the requested target resolution
     * is not available due to data not being retained we provide a best effort result by falling back to the most
     * granular available resolution after the target resolution. There are 3 valid values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>P1D</code> — 1 day
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PT1H</code> — 1 hour
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PT5M</code> — 5 minutes
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetResolution
     *        The requested resolution of time steps for the returned time series of values. If the requested target
     *        resolution is not available due to data not being retained we provide a best effort result by falling back
     *        to the most granular available resolution after the target resolution. There are 3 valid values. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>P1D</code> — 1 day
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PT1H</code> — 1 hour
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PT5M</code> — 5 minutes
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationPeriod
     */

    public BatchGetFrameMetricDataRequest withTargetResolution(String targetResolution) {
        setTargetResolution(targetResolution);
        return this;
    }

    /**
     * <p>
     * The requested resolution of time steps for the returned time series of values. If the requested target resolution
     * is not available due to data not being retained we provide a best effort result by falling back to the most
     * granular available resolution after the target resolution. There are 3 valid values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>P1D</code> — 1 day
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PT1H</code> — 1 hour
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PT5M</code> — 5 minutes
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetResolution
     *        The requested resolution of time steps for the returned time series of values. If the requested target
     *        resolution is not available due to data not being retained we provide a best effort result by falling back
     *        to the most granular available resolution after the target resolution. There are 3 valid values. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>P1D</code> — 1 day
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PT1H</code> — 1 hour
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PT5M</code> — 5 minutes
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationPeriod
     */

    public BatchGetFrameMetricDataRequest withTargetResolution(AggregationPeriod targetResolution) {
        this.targetResolution = targetResolution.toString();
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
        if (getFrameMetrics() != null)
            sb.append("FrameMetrics: ").append(getFrameMetrics()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getProfilingGroupName() != null)
            sb.append("ProfilingGroupName: ").append(getProfilingGroupName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getTargetResolution() != null)
            sb.append("TargetResolution: ").append(getTargetResolution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetFrameMetricDataRequest == false)
            return false;
        BatchGetFrameMetricDataRequest other = (BatchGetFrameMetricDataRequest) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getFrameMetrics() == null ^ this.getFrameMetrics() == null)
            return false;
        if (other.getFrameMetrics() != null && other.getFrameMetrics().equals(this.getFrameMetrics()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getProfilingGroupName() == null ^ this.getProfilingGroupName() == null)
            return false;
        if (other.getProfilingGroupName() != null && other.getProfilingGroupName().equals(this.getProfilingGroupName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getTargetResolution() == null ^ this.getTargetResolution() == null)
            return false;
        if (other.getTargetResolution() != null && other.getTargetResolution().equals(this.getTargetResolution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getFrameMetrics() == null) ? 0 : getFrameMetrics().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTargetResolution() == null) ? 0 : getTargetResolution().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetFrameMetricDataRequest clone() {
        return (BatchGetFrameMetricDataRequest) super.clone();
    }

}
