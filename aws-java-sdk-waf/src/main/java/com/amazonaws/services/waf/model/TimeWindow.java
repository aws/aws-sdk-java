/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.waf.model;

import java.io.Serializable;

/**
 * <p>
 * In a <a>GetSampledRequests</a> request, the <code>StartTime</code> and <code>EndTime</code> objects specify the time
 * range for which you want AWS WAF to return a sample of web requests.
 * </p>
 * <p>
 * In a <a>GetSampledRequests</a> response, the <code>StartTime</code> and <code>EndTime</code> objects specify the time
 * range for which AWS WAF actually returned a sample of web requests. AWS WAF gets the specified number of requests
 * from among the first 5,000 requests that your AWS resource receives during the specified time period. If your
 * resource receives more than 5,000 requests during that period, AWS WAF stops sampling after the 5,000th request. In
 * that case, <code>EndTime</code> is the time that AWS WAF received the 5,000th request.
 * </p>
 */
public class TimeWindow implements Serializable, Cloneable {

    /**
     * <p>
     * The beginning of the time range from which you want <code>GetSampledRequests</code> to return a sample of the
     * requests that your AWS resource received. You can specify any time range in the previous three hours.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time range from which you want <code>GetSampledRequests</code> to return a sample of the requests
     * that your AWS resource received. You can specify any time range in the previous three hours.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The beginning of the time range from which you want <code>GetSampledRequests</code> to return a sample of the
     * requests that your AWS resource received. You can specify any time range in the previous three hours.
     * </p>
     * 
     * @param startTime
     *        The beginning of the time range from which you want <code>GetSampledRequests</code> to return a sample of
     *        the requests that your AWS resource received. You can specify any time range in the previous three hours.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The beginning of the time range from which you want <code>GetSampledRequests</code> to return a sample of the
     * requests that your AWS resource received. You can specify any time range in the previous three hours.
     * </p>
     * 
     * @return The beginning of the time range from which you want <code>GetSampledRequests</code> to return a sample of
     *         the requests that your AWS resource received. You can specify any time range in the previous three hours.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The beginning of the time range from which you want <code>GetSampledRequests</code> to return a sample of the
     * requests that your AWS resource received. You can specify any time range in the previous three hours.
     * </p>
     * 
     * @param startTime
     *        The beginning of the time range from which you want <code>GetSampledRequests</code> to return a sample of
     *        the requests that your AWS resource received. You can specify any time range in the previous three hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeWindow withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time range from which you want <code>GetSampledRequests</code> to return a sample of the requests
     * that your AWS resource received. You can specify any time range in the previous three hours.
     * </p>
     * 
     * @param endTime
     *        The end of the time range from which you want <code>GetSampledRequests</code> to return a sample of the
     *        requests that your AWS resource received. You can specify any time range in the previous three hours.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time range from which you want <code>GetSampledRequests</code> to return a sample of the requests
     * that your AWS resource received. You can specify any time range in the previous three hours.
     * </p>
     * 
     * @return The end of the time range from which you want <code>GetSampledRequests</code> to return a sample of the
     *         requests that your AWS resource received. You can specify any time range in the previous three hours.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time range from which you want <code>GetSampledRequests</code> to return a sample of the requests
     * that your AWS resource received. You can specify any time range in the previous three hours.
     * </p>
     * 
     * @param endTime
     *        The end of the time range from which you want <code>GetSampledRequests</code> to return a sample of the
     *        requests that your AWS resource received. You can specify any time range in the previous three hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeWindow withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeWindow == false)
            return false;
        TimeWindow other = (TimeWindow) obj;
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

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public TimeWindow clone() {
        try {
            return (TimeWindow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
