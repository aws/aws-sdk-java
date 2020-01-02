/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/GetEC2RecommendationProjectedMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEC2RecommendationProjectedMetricsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * The statistic of the projected metrics.
     * </p>
     */
    private String stat;
    /**
     * <p>
     * The granularity, in seconds, of the projected metrics data points.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The time stamp of the first projected metrics data point to return.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time stamp of the last projected metrics data point to return.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the instances for which to return recommendation projected metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEC2RecommendationProjectedMetricsRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The statistic of the projected metrics.
     * </p>
     * 
     * @param stat
     *        The statistic of the projected metrics.
     * @see MetricStatistic
     */

    public void setStat(String stat) {
        this.stat = stat;
    }

    /**
     * <p>
     * The statistic of the projected metrics.
     * </p>
     * 
     * @return The statistic of the projected metrics.
     * @see MetricStatistic
     */

    public String getStat() {
        return this.stat;
    }

    /**
     * <p>
     * The statistic of the projected metrics.
     * </p>
     * 
     * @param stat
     *        The statistic of the projected metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetEC2RecommendationProjectedMetricsRequest withStat(String stat) {
        setStat(stat);
        return this;
    }

    /**
     * <p>
     * The statistic of the projected metrics.
     * </p>
     * 
     * @param stat
     *        The statistic of the projected metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetEC2RecommendationProjectedMetricsRequest withStat(MetricStatistic stat) {
        this.stat = stat.toString();
        return this;
    }

    /**
     * <p>
     * The granularity, in seconds, of the projected metrics data points.
     * </p>
     * 
     * @param period
     *        The granularity, in seconds, of the projected metrics data points.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the projected metrics data points.
     * </p>
     * 
     * @return The granularity, in seconds, of the projected metrics data points.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the projected metrics data points.
     * </p>
     * 
     * @param period
     *        The granularity, in seconds, of the projected metrics data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEC2RecommendationProjectedMetricsRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The time stamp of the first projected metrics data point to return.
     * </p>
     * 
     * @param startTime
     *        The time stamp of the first projected metrics data point to return.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time stamp of the first projected metrics data point to return.
     * </p>
     * 
     * @return The time stamp of the first projected metrics data point to return.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time stamp of the first projected metrics data point to return.
     * </p>
     * 
     * @param startTime
     *        The time stamp of the first projected metrics data point to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEC2RecommendationProjectedMetricsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time stamp of the last projected metrics data point to return.
     * </p>
     * 
     * @param endTime
     *        The time stamp of the last projected metrics data point to return.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time stamp of the last projected metrics data point to return.
     * </p>
     * 
     * @return The time stamp of the last projected metrics data point to return.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time stamp of the last projected metrics data point to return.
     * </p>
     * 
     * @param endTime
     *        The time stamp of the last projected metrics data point to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEC2RecommendationProjectedMetricsRequest withEndTime(java.util.Date endTime) {
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
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getStat() != null)
            sb.append("Stat: ").append(getStat()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
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

        if (obj instanceof GetEC2RecommendationProjectedMetricsRequest == false)
            return false;
        GetEC2RecommendationProjectedMetricsRequest other = (GetEC2RecommendationProjectedMetricsRequest) obj;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getStat() == null ^ this.getStat() == null)
            return false;
        if (other.getStat() != null && other.getStat().equals(this.getStat()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
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

        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getStat() == null) ? 0 : getStat().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public GetEC2RecommendationProjectedMetricsRequest clone() {
        return (GetEC2RecommendationProjectedMetricsRequest) super.clone();
    }

}
