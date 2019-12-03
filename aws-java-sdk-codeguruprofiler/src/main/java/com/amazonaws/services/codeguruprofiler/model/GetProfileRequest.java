/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Request for GetProfile operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/GetProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The format of the profile to return. Supports application/json or application/x-amzn-ion. Defaults to
     * application/x-amzn-ion.
     * </p>
     */
    private String accept;
    /**
     * <p>
     * The end time of the profile to get. Either period or endTime must be specified. Must be greater than start and
     * the overall time range to be in the past and not larger than a week.
     * </p>
     */
    private java.util.Date endTime;

    private Integer maxDepth;
    /**
     * <p>
     * The period of the profile to get. Exactly two of <code>startTime</code>, <code>period</code> and
     * <code>endTime</code> must be specified. Must be positive and the overall time range to be in the past and not
     * larger than a week.
     * </p>
     */
    private String period;

    private String profilingGroupName;
    /**
     * <p>
     * The start time of the profile to get.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The format of the profile to return. Supports application/json or application/x-amzn-ion. Defaults to
     * application/x-amzn-ion.
     * </p>
     * 
     * @param accept
     *        The format of the profile to return. Supports application/json or application/x-amzn-ion. Defaults to
     *        application/x-amzn-ion.
     */

    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * <p>
     * The format of the profile to return. Supports application/json or application/x-amzn-ion. Defaults to
     * application/x-amzn-ion.
     * </p>
     * 
     * @return The format of the profile to return. Supports application/json or application/x-amzn-ion. Defaults to
     *         application/x-amzn-ion.
     */

    public String getAccept() {
        return this.accept;
    }

    /**
     * <p>
     * The format of the profile to return. Supports application/json or application/x-amzn-ion. Defaults to
     * application/x-amzn-ion.
     * </p>
     * 
     * @param accept
     *        The format of the profile to return. Supports application/json or application/x-amzn-ion. Defaults to
     *        application/x-amzn-ion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileRequest withAccept(String accept) {
        setAccept(accept);
        return this;
    }

    /**
     * <p>
     * The end time of the profile to get. Either period or endTime must be specified. Must be greater than start and
     * the overall time range to be in the past and not larger than a week.
     * </p>
     * 
     * @param endTime
     *        The end time of the profile to get. Either period or endTime must be specified. Must be greater than start
     *        and the overall time range to be in the past and not larger than a week.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the profile to get. Either period or endTime must be specified. Must be greater than start and
     * the overall time range to be in the past and not larger than a week.
     * </p>
     * 
     * @return The end time of the profile to get. Either period or endTime must be specified. Must be greater than
     *         start and the overall time range to be in the past and not larger than a week.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the profile to get. Either period or endTime must be specified. Must be greater than start and
     * the overall time range to be in the past and not larger than a week.
     * </p>
     * 
     * @param endTime
     *        The end time of the profile to get. Either period or endTime must be specified. Must be greater than start
     *        and the overall time range to be in the past and not larger than a week.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * @param maxDepth
     */

    public void setMaxDepth(Integer maxDepth) {
        this.maxDepth = maxDepth;
    }

    /**
     * @return
     */

    public Integer getMaxDepth() {
        return this.maxDepth;
    }

    /**
     * @param maxDepth
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileRequest withMaxDepth(Integer maxDepth) {
        setMaxDepth(maxDepth);
        return this;
    }

    /**
     * <p>
     * The period of the profile to get. Exactly two of <code>startTime</code>, <code>period</code> and
     * <code>endTime</code> must be specified. Must be positive and the overall time range to be in the past and not
     * larger than a week.
     * </p>
     * 
     * @param period
     *        The period of the profile to get. Exactly two of <code>startTime</code>, <code>period</code> and
     *        <code>endTime</code> must be specified. Must be positive and the overall time range to be in the past and
     *        not larger than a week.
     */

    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * <p>
     * The period of the profile to get. Exactly two of <code>startTime</code>, <code>period</code> and
     * <code>endTime</code> must be specified. Must be positive and the overall time range to be in the past and not
     * larger than a week.
     * </p>
     * 
     * @return The period of the profile to get. Exactly two of <code>startTime</code>, <code>period</code> and
     *         <code>endTime</code> must be specified. Must be positive and the overall time range to be in the past and
     *         not larger than a week.
     */

    public String getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The period of the profile to get. Exactly two of <code>startTime</code>, <code>period</code> and
     * <code>endTime</code> must be specified. Must be positive and the overall time range to be in the past and not
     * larger than a week.
     * </p>
     * 
     * @param period
     *        The period of the profile to get. Exactly two of <code>startTime</code>, <code>period</code> and
     *        <code>endTime</code> must be specified. Must be positive and the overall time range to be in the past and
     *        not larger than a week.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileRequest withPeriod(String period) {
        setPeriod(period);
        return this;
    }

    /**
     * @param profilingGroupName
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * @return
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * @param profilingGroupName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileRequest withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
        return this;
    }

    /**
     * <p>
     * The start time of the profile to get.
     * </p>
     * 
     * @param startTime
     *        The start time of the profile to get.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the profile to get.
     * </p>
     * 
     * @return The start time of the profile to get.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the profile to get.
     * </p>
     * 
     * @param startTime
     *        The start time of the profile to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetProfileRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getAccept() != null)
            sb.append("Accept: ").append(getAccept()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getMaxDepth() != null)
            sb.append("MaxDepth: ").append(getMaxDepth()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getProfilingGroupName() != null)
            sb.append("ProfilingGroupName: ").append(getProfilingGroupName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProfileRequest == false)
            return false;
        GetProfileRequest other = (GetProfileRequest) obj;
        if (other.getAccept() == null ^ this.getAccept() == null)
            return false;
        if (other.getAccept() != null && other.getAccept().equals(this.getAccept()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getMaxDepth() == null ^ this.getMaxDepth() == null)
            return false;
        if (other.getMaxDepth() != null && other.getMaxDepth().equals(this.getMaxDepth()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMaxDepth() == null) ? 0 : getMaxDepth().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public GetProfileRequest clone() {
        return (GetProfileRequest) super.clone();
    }

}
