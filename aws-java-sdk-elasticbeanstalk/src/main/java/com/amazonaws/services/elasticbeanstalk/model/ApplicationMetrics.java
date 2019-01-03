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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Application request metrics for an AWS Elastic Beanstalk environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ApplicationMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationMetrics implements Serializable, Cloneable {

    /**
     * <p>
     * The amount of time that the metrics cover (usually 10 seconds). For example, you might have 5 requests (
     * <code>request_count</code>) within the most recent time slice of 10 seconds (<code>duration</code>).
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * Average number of requests handled by the web server per second over the last 10 seconds.
     * </p>
     */
    private Integer requestCount;
    /**
     * <p>
     * Represents the percentage of requests over the last 10 seconds that resulted in each type of status code
     * response.
     * </p>
     */
    private StatusCodes statusCodes;
    /**
     * <p>
     * Represents the average latency for the slowest X percent of requests over the last 10 seconds. Latencies are in
     * seconds with one millisecond resolution.
     * </p>
     */
    private Latency latency;

    /**
     * <p>
     * The amount of time that the metrics cover (usually 10 seconds). For example, you might have 5 requests (
     * <code>request_count</code>) within the most recent time slice of 10 seconds (<code>duration</code>).
     * </p>
     * 
     * @param duration
     *        The amount of time that the metrics cover (usually 10 seconds). For example, you might have 5 requests (
     *        <code>request_count</code>) within the most recent time slice of 10 seconds (<code>duration</code>).
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The amount of time that the metrics cover (usually 10 seconds). For example, you might have 5 requests (
     * <code>request_count</code>) within the most recent time slice of 10 seconds (<code>duration</code>).
     * </p>
     * 
     * @return The amount of time that the metrics cover (usually 10 seconds). For example, you might have 5 requests (
     *         <code>request_count</code>) within the most recent time slice of 10 seconds (<code>duration</code>).
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The amount of time that the metrics cover (usually 10 seconds). For example, you might have 5 requests (
     * <code>request_count</code>) within the most recent time slice of 10 seconds (<code>duration</code>).
     * </p>
     * 
     * @param duration
     *        The amount of time that the metrics cover (usually 10 seconds). For example, you might have 5 requests (
     *        <code>request_count</code>) within the most recent time slice of 10 seconds (<code>duration</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationMetrics withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * Average number of requests handled by the web server per second over the last 10 seconds.
     * </p>
     * 
     * @param requestCount
     *        Average number of requests handled by the web server per second over the last 10 seconds.
     */

    public void setRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
    }

    /**
     * <p>
     * Average number of requests handled by the web server per second over the last 10 seconds.
     * </p>
     * 
     * @return Average number of requests handled by the web server per second over the last 10 seconds.
     */

    public Integer getRequestCount() {
        return this.requestCount;
    }

    /**
     * <p>
     * Average number of requests handled by the web server per second over the last 10 seconds.
     * </p>
     * 
     * @param requestCount
     *        Average number of requests handled by the web server per second over the last 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationMetrics withRequestCount(Integer requestCount) {
        setRequestCount(requestCount);
        return this;
    }

    /**
     * <p>
     * Represents the percentage of requests over the last 10 seconds that resulted in each type of status code
     * response.
     * </p>
     * 
     * @param statusCodes
     *        Represents the percentage of requests over the last 10 seconds that resulted in each type of status code
     *        response.
     */

    public void setStatusCodes(StatusCodes statusCodes) {
        this.statusCodes = statusCodes;
    }

    /**
     * <p>
     * Represents the percentage of requests over the last 10 seconds that resulted in each type of status code
     * response.
     * </p>
     * 
     * @return Represents the percentage of requests over the last 10 seconds that resulted in each type of status code
     *         response.
     */

    public StatusCodes getStatusCodes() {
        return this.statusCodes;
    }

    /**
     * <p>
     * Represents the percentage of requests over the last 10 seconds that resulted in each type of status code
     * response.
     * </p>
     * 
     * @param statusCodes
     *        Represents the percentage of requests over the last 10 seconds that resulted in each type of status code
     *        response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationMetrics withStatusCodes(StatusCodes statusCodes) {
        setStatusCodes(statusCodes);
        return this;
    }

    /**
     * <p>
     * Represents the average latency for the slowest X percent of requests over the last 10 seconds. Latencies are in
     * seconds with one millisecond resolution.
     * </p>
     * 
     * @param latency
     *        Represents the average latency for the slowest X percent of requests over the last 10 seconds. Latencies
     *        are in seconds with one millisecond resolution.
     */

    public void setLatency(Latency latency) {
        this.latency = latency;
    }

    /**
     * <p>
     * Represents the average latency for the slowest X percent of requests over the last 10 seconds. Latencies are in
     * seconds with one millisecond resolution.
     * </p>
     * 
     * @return Represents the average latency for the slowest X percent of requests over the last 10 seconds. Latencies
     *         are in seconds with one millisecond resolution.
     */

    public Latency getLatency() {
        return this.latency;
    }

    /**
     * <p>
     * Represents the average latency for the slowest X percent of requests over the last 10 seconds. Latencies are in
     * seconds with one millisecond resolution.
     * </p>
     * 
     * @param latency
     *        Represents the average latency for the slowest X percent of requests over the last 10 seconds. Latencies
     *        are in seconds with one millisecond resolution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationMetrics withLatency(Latency latency) {
        setLatency(latency);
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
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getRequestCount() != null)
            sb.append("RequestCount: ").append(getRequestCount()).append(",");
        if (getStatusCodes() != null)
            sb.append("StatusCodes: ").append(getStatusCodes()).append(",");
        if (getLatency() != null)
            sb.append("Latency: ").append(getLatency());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationMetrics == false)
            return false;
        ApplicationMetrics other = (ApplicationMetrics) obj;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getRequestCount() == null ^ this.getRequestCount() == null)
            return false;
        if (other.getRequestCount() != null && other.getRequestCount().equals(this.getRequestCount()) == false)
            return false;
        if (other.getStatusCodes() == null ^ this.getStatusCodes() == null)
            return false;
        if (other.getStatusCodes() != null && other.getStatusCodes().equals(this.getStatusCodes()) == false)
            return false;
        if (other.getLatency() == null ^ this.getLatency() == null)
            return false;
        if (other.getLatency() != null && other.getLatency().equals(this.getLatency()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getRequestCount() == null) ? 0 : getRequestCount().hashCode());
        hashCode = prime * hashCode + ((getStatusCodes() == null) ? 0 : getStatusCodes().hashCode());
        hashCode = prime * hashCode + ((getLatency() == null) ? 0 : getLatency().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationMetrics clone() {
        try {
            return (ApplicationMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
