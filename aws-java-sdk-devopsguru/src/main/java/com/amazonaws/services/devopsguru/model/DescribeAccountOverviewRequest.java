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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/DescribeAccountOverview"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountOverviewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The start of the time range passed in. The start time granularity is at the day level. The floor of the start
     * time is used. Returned information occurred after this day.
     * </p>
     */
    private java.util.Date fromTime;
    /**
     * <p>
     * The end of the time range passed in. The start time granularity is at the day level. The floor of the start time
     * is used. Returned information occurred before this day. If this is not specified, then the current day is used.
     * </p>
     */
    private java.util.Date toTime;

    /**
     * <p>
     * The start of the time range passed in. The start time granularity is at the day level. The floor of the start
     * time is used. Returned information occurred after this day.
     * </p>
     * 
     * @param fromTime
     *        The start of the time range passed in. The start time granularity is at the day level. The floor of the
     *        start time is used. Returned information occurred after this day.
     */

    public void setFromTime(java.util.Date fromTime) {
        this.fromTime = fromTime;
    }

    /**
     * <p>
     * The start of the time range passed in. The start time granularity is at the day level. The floor of the start
     * time is used. Returned information occurred after this day.
     * </p>
     * 
     * @return The start of the time range passed in. The start time granularity is at the day level. The floor of the
     *         start time is used. Returned information occurred after this day.
     */

    public java.util.Date getFromTime() {
        return this.fromTime;
    }

    /**
     * <p>
     * The start of the time range passed in. The start time granularity is at the day level. The floor of the start
     * time is used. Returned information occurred after this day.
     * </p>
     * 
     * @param fromTime
     *        The start of the time range passed in. The start time granularity is at the day level. The floor of the
     *        start time is used. Returned information occurred after this day.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountOverviewRequest withFromTime(java.util.Date fromTime) {
        setFromTime(fromTime);
        return this;
    }

    /**
     * <p>
     * The end of the time range passed in. The start time granularity is at the day level. The floor of the start time
     * is used. Returned information occurred before this day. If this is not specified, then the current day is used.
     * </p>
     * 
     * @param toTime
     *        The end of the time range passed in. The start time granularity is at the day level. The floor of the
     *        start time is used. Returned information occurred before this day. If this is not specified, then the
     *        current day is used.
     */

    public void setToTime(java.util.Date toTime) {
        this.toTime = toTime;
    }

    /**
     * <p>
     * The end of the time range passed in. The start time granularity is at the day level. The floor of the start time
     * is used. Returned information occurred before this day. If this is not specified, then the current day is used.
     * </p>
     * 
     * @return The end of the time range passed in. The start time granularity is at the day level. The floor of the
     *         start time is used. Returned information occurred before this day. If this is not specified, then the
     *         current day is used.
     */

    public java.util.Date getToTime() {
        return this.toTime;
    }

    /**
     * <p>
     * The end of the time range passed in. The start time granularity is at the day level. The floor of the start time
     * is used. Returned information occurred before this day. If this is not specified, then the current day is used.
     * </p>
     * 
     * @param toTime
     *        The end of the time range passed in. The start time granularity is at the day level. The floor of the
     *        start time is used. Returned information occurred before this day. If this is not specified, then the
     *        current day is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountOverviewRequest withToTime(java.util.Date toTime) {
        setToTime(toTime);
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
        if (getFromTime() != null)
            sb.append("FromTime: ").append(getFromTime()).append(",");
        if (getToTime() != null)
            sb.append("ToTime: ").append(getToTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountOverviewRequest == false)
            return false;
        DescribeAccountOverviewRequest other = (DescribeAccountOverviewRequest) obj;
        if (other.getFromTime() == null ^ this.getFromTime() == null)
            return false;
        if (other.getFromTime() != null && other.getFromTime().equals(this.getFromTime()) == false)
            return false;
        if (other.getToTime() == null ^ this.getToTime() == null)
            return false;
        if (other.getToTime() != null && other.getToTime().equals(this.getToTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromTime() == null) ? 0 : getFromTime().hashCode());
        hashCode = prime * hashCode + ((getToTime() == null) ? 0 : getToTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountOverviewRequest clone() {
        return (DescribeAccountOverviewRequest) super.clone();
    }

}
