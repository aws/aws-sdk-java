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

/**
 * <p>
 * The structure representing the BatchGetFrameMetricDataResponse.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/BatchGetFrameMetricData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetFrameMetricDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The end time of the time period for the returned time series values. This is specified using the ISO 8601 format.
     * For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * List of instances, or time steps, in the time series. For example, if the <code>period</code> is one day (
     * <code>PT24H)</code>), and the <code>resolution</code> is five minutes (<code>PT5M</code>), then there are 288
     * <code>endTimes</code> in the list that are each five minutes appart.
     * </p>
     */
    private java.util.List<TimestampStructure> endTimes;
    /**
     * <p>
     * Details of the metrics to request a time series of values. The metric includes the name of the frame, the
     * aggregation type to calculate the metric value for the frame, and the thread states to use to get the count for
     * the metric value of the frame.
     * </p>
     */
    private java.util.List<FrameMetricDatum> frameMetricData;
    /**
     * <p>
     * Resolution or granularity of the profile data used to generate the time series. This is the value used to jump
     * through time steps in a time series. There are 3 valid values.
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
    private String resolution;
    /**
     * <p>
     * The start time of the time period for the returned time series values. This is specified using the ISO 8601
     * format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * List of instances which remained unprocessed. This will create a missing time step in the list of end times.
     * </p>
     */
    private java.util.Map<String, java.util.List<TimestampStructure>> unprocessedEndTimes;

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

    public BatchGetFrameMetricDataResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * List of instances, or time steps, in the time series. For example, if the <code>period</code> is one day (
     * <code>PT24H)</code>), and the <code>resolution</code> is five minutes (<code>PT5M</code>), then there are 288
     * <code>endTimes</code> in the list that are each five minutes appart.
     * </p>
     * 
     * @return List of instances, or time steps, in the time series. For example, if the <code>period</code> is one day
     *         (<code>PT24H)</code>), and the <code>resolution</code> is five minutes (<code>PT5M</code>), then there
     *         are 288 <code>endTimes</code> in the list that are each five minutes appart.
     */

    public java.util.List<TimestampStructure> getEndTimes() {
        return endTimes;
    }

    /**
     * <p>
     * List of instances, or time steps, in the time series. For example, if the <code>period</code> is one day (
     * <code>PT24H)</code>), and the <code>resolution</code> is five minutes (<code>PT5M</code>), then there are 288
     * <code>endTimes</code> in the list that are each five minutes appart.
     * </p>
     * 
     * @param endTimes
     *        List of instances, or time steps, in the time series. For example, if the <code>period</code> is one day (
     *        <code>PT24H)</code>), and the <code>resolution</code> is five minutes (<code>PT5M</code>), then there are
     *        288 <code>endTimes</code> in the list that are each five minutes appart.
     */

    public void setEndTimes(java.util.Collection<TimestampStructure> endTimes) {
        if (endTimes == null) {
            this.endTimes = null;
            return;
        }

        this.endTimes = new java.util.ArrayList<TimestampStructure>(endTimes);
    }

    /**
     * <p>
     * List of instances, or time steps, in the time series. For example, if the <code>period</code> is one day (
     * <code>PT24H)</code>), and the <code>resolution</code> is five minutes (<code>PT5M</code>), then there are 288
     * <code>endTimes</code> in the list that are each five minutes appart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndTimes(java.util.Collection)} or {@link #withEndTimes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param endTimes
     *        List of instances, or time steps, in the time series. For example, if the <code>period</code> is one day (
     *        <code>PT24H)</code>), and the <code>resolution</code> is five minutes (<code>PT5M</code>), then there are
     *        288 <code>endTimes</code> in the list that are each five minutes appart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFrameMetricDataResult withEndTimes(TimestampStructure... endTimes) {
        if (this.endTimes == null) {
            setEndTimes(new java.util.ArrayList<TimestampStructure>(endTimes.length));
        }
        for (TimestampStructure ele : endTimes) {
            this.endTimes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of instances, or time steps, in the time series. For example, if the <code>period</code> is one day (
     * <code>PT24H)</code>), and the <code>resolution</code> is five minutes (<code>PT5M</code>), then there are 288
     * <code>endTimes</code> in the list that are each five minutes appart.
     * </p>
     * 
     * @param endTimes
     *        List of instances, or time steps, in the time series. For example, if the <code>period</code> is one day (
     *        <code>PT24H)</code>), and the <code>resolution</code> is five minutes (<code>PT5M</code>), then there are
     *        288 <code>endTimes</code> in the list that are each five minutes appart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFrameMetricDataResult withEndTimes(java.util.Collection<TimestampStructure> endTimes) {
        setEndTimes(endTimes);
        return this;
    }

    /**
     * <p>
     * Details of the metrics to request a time series of values. The metric includes the name of the frame, the
     * aggregation type to calculate the metric value for the frame, and the thread states to use to get the count for
     * the metric value of the frame.
     * </p>
     * 
     * @return Details of the metrics to request a time series of values. The metric includes the name of the frame, the
     *         aggregation type to calculate the metric value for the frame, and the thread states to use to get the
     *         count for the metric value of the frame.
     */

    public java.util.List<FrameMetricDatum> getFrameMetricData() {
        return frameMetricData;
    }

    /**
     * <p>
     * Details of the metrics to request a time series of values. The metric includes the name of the frame, the
     * aggregation type to calculate the metric value for the frame, and the thread states to use to get the count for
     * the metric value of the frame.
     * </p>
     * 
     * @param frameMetricData
     *        Details of the metrics to request a time series of values. The metric includes the name of the frame, the
     *        aggregation type to calculate the metric value for the frame, and the thread states to use to get the
     *        count for the metric value of the frame.
     */

    public void setFrameMetricData(java.util.Collection<FrameMetricDatum> frameMetricData) {
        if (frameMetricData == null) {
            this.frameMetricData = null;
            return;
        }

        this.frameMetricData = new java.util.ArrayList<FrameMetricDatum>(frameMetricData);
    }

    /**
     * <p>
     * Details of the metrics to request a time series of values. The metric includes the name of the frame, the
     * aggregation type to calculate the metric value for the frame, and the thread states to use to get the count for
     * the metric value of the frame.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFrameMetricData(java.util.Collection)} or {@link #withFrameMetricData(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param frameMetricData
     *        Details of the metrics to request a time series of values. The metric includes the name of the frame, the
     *        aggregation type to calculate the metric value for the frame, and the thread states to use to get the
     *        count for the metric value of the frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFrameMetricDataResult withFrameMetricData(FrameMetricDatum... frameMetricData) {
        if (this.frameMetricData == null) {
            setFrameMetricData(new java.util.ArrayList<FrameMetricDatum>(frameMetricData.length));
        }
        for (FrameMetricDatum ele : frameMetricData) {
            this.frameMetricData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of the metrics to request a time series of values. The metric includes the name of the frame, the
     * aggregation type to calculate the metric value for the frame, and the thread states to use to get the count for
     * the metric value of the frame.
     * </p>
     * 
     * @param frameMetricData
     *        Details of the metrics to request a time series of values. The metric includes the name of the frame, the
     *        aggregation type to calculate the metric value for the frame, and the thread states to use to get the
     *        count for the metric value of the frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFrameMetricDataResult withFrameMetricData(java.util.Collection<FrameMetricDatum> frameMetricData) {
        setFrameMetricData(frameMetricData);
        return this;
    }

    /**
     * <p>
     * Resolution or granularity of the profile data used to generate the time series. This is the value used to jump
     * through time steps in a time series. There are 3 valid values.
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
     * @param resolution
     *        Resolution or granularity of the profile data used to generate the time series. This is the value used to
     *        jump through time steps in a time series. There are 3 valid values. </p>
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

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * <p>
     * Resolution or granularity of the profile data used to generate the time series. This is the value used to jump
     * through time steps in a time series. There are 3 valid values.
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
     * @return Resolution or granularity of the profile data used to generate the time series. This is the value used to
     *         jump through time steps in a time series. There are 3 valid values. </p>
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

    public String getResolution() {
        return this.resolution;
    }

    /**
     * <p>
     * Resolution or granularity of the profile data used to generate the time series. This is the value used to jump
     * through time steps in a time series. There are 3 valid values.
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
     * @param resolution
     *        Resolution or granularity of the profile data used to generate the time series. This is the value used to
     *        jump through time steps in a time series. There are 3 valid values. </p>
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

    public BatchGetFrameMetricDataResult withResolution(String resolution) {
        setResolution(resolution);
        return this;
    }

    /**
     * <p>
     * Resolution or granularity of the profile data used to generate the time series. This is the value used to jump
     * through time steps in a time series. There are 3 valid values.
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
     * @param resolution
     *        Resolution or granularity of the profile data used to generate the time series. This is the value used to
     *        jump through time steps in a time series. There are 3 valid values. </p>
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

    public BatchGetFrameMetricDataResult withResolution(AggregationPeriod resolution) {
        this.resolution = resolution.toString();
        return this;
    }

    /**
     * <p>
     * The start time of the time period for the returned time series values. This is specified using the ISO 8601
     * format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param startTime
     *        The start time of the time period for the returned time series values. This is specified using the ISO
     *        8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM
     *        UTC.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the time period for the returned time series values. This is specified using the ISO 8601
     * format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @return The start time of the time period for the returned time series values. This is specified using the ISO
     *         8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM
     *         UTC.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the time period for the returned time series values. This is specified using the ISO 8601
     * format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
     * </p>
     * 
     * @param startTime
     *        The start time of the time period for the returned time series values. This is specified using the ISO
     *        8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM
     *        UTC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFrameMetricDataResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * List of instances which remained unprocessed. This will create a missing time step in the list of end times.
     * </p>
     * 
     * @return List of instances which remained unprocessed. This will create a missing time step in the list of end
     *         times.
     */

    public java.util.Map<String, java.util.List<TimestampStructure>> getUnprocessedEndTimes() {
        return unprocessedEndTimes;
    }

    /**
     * <p>
     * List of instances which remained unprocessed. This will create a missing time step in the list of end times.
     * </p>
     * 
     * @param unprocessedEndTimes
     *        List of instances which remained unprocessed. This will create a missing time step in the list of end
     *        times.
     */

    public void setUnprocessedEndTimes(java.util.Map<String, java.util.List<TimestampStructure>> unprocessedEndTimes) {
        this.unprocessedEndTimes = unprocessedEndTimes;
    }

    /**
     * <p>
     * List of instances which remained unprocessed. This will create a missing time step in the list of end times.
     * </p>
     * 
     * @param unprocessedEndTimes
     *        List of instances which remained unprocessed. This will create a missing time step in the list of end
     *        times.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFrameMetricDataResult withUnprocessedEndTimes(java.util.Map<String, java.util.List<TimestampStructure>> unprocessedEndTimes) {
        setUnprocessedEndTimes(unprocessedEndTimes);
        return this;
    }

    /**
     * Add a single UnprocessedEndTimes entry
     *
     * @see BatchGetFrameMetricDataResult#withUnprocessedEndTimes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFrameMetricDataResult addUnprocessedEndTimesEntry(String key, java.util.List<TimestampStructure> value) {
        if (null == this.unprocessedEndTimes) {
            this.unprocessedEndTimes = new java.util.HashMap<String, java.util.List<TimestampStructure>>();
        }
        if (this.unprocessedEndTimes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.unprocessedEndTimes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UnprocessedEndTimes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFrameMetricDataResult clearUnprocessedEndTimesEntries() {
        this.unprocessedEndTimes = null;
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
        if (getEndTimes() != null)
            sb.append("EndTimes: ").append(getEndTimes()).append(",");
        if (getFrameMetricData() != null)
            sb.append("FrameMetricData: ").append(getFrameMetricData()).append(",");
        if (getResolution() != null)
            sb.append("Resolution: ").append(getResolution()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getUnprocessedEndTimes() != null)
            sb.append("UnprocessedEndTimes: ").append(getUnprocessedEndTimes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetFrameMetricDataResult == false)
            return false;
        BatchGetFrameMetricDataResult other = (BatchGetFrameMetricDataResult) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getEndTimes() == null ^ this.getEndTimes() == null)
            return false;
        if (other.getEndTimes() != null && other.getEndTimes().equals(this.getEndTimes()) == false)
            return false;
        if (other.getFrameMetricData() == null ^ this.getFrameMetricData() == null)
            return false;
        if (other.getFrameMetricData() != null && other.getFrameMetricData().equals(this.getFrameMetricData()) == false)
            return false;
        if (other.getResolution() == null ^ this.getResolution() == null)
            return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getUnprocessedEndTimes() == null ^ this.getUnprocessedEndTimes() == null)
            return false;
        if (other.getUnprocessedEndTimes() != null && other.getUnprocessedEndTimes().equals(this.getUnprocessedEndTimes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getEndTimes() == null) ? 0 : getEndTimes().hashCode());
        hashCode = prime * hashCode + ((getFrameMetricData() == null) ? 0 : getFrameMetricData().hashCode());
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedEndTimes() == null) ? 0 : getUnprocessedEndTimes().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetFrameMetricDataResult clone() {
        try {
            return (BatchGetFrameMetricDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
