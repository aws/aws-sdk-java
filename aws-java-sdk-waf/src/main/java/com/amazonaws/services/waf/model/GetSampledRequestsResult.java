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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSampledRequests" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSampledRequestsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains detailed information about each of the requests in the sample.
     * </p>
     */
    private java.util.List<SampledHTTPRequest> sampledRequests;
    /**
     * <p>
     * The total number of requests from which <code>GetSampledRequests</code> got a sample of <code>MaxItems</code>
     * requests. If <code>PopulationSize</code> is less than <code>MaxItems</code>, the sample includes every request
     * that your AWS resource received during the specified time range.
     * </p>
     */
    private Long populationSize;
    /**
     * <p>
     * Usually, <code>TimeWindow</code> is the time range that you specified in the <code>GetSampledRequests</code>
     * request. However, if your AWS resource received more than 5,000 requests during the time range that you specified
     * in the request, <code>GetSampledRequests</code> returns the time range for the first 5,000 requests.
     * </p>
     */
    private TimeWindow timeWindow;

    /**
     * <p>
     * A complex type that contains detailed information about each of the requests in the sample.
     * </p>
     * 
     * @return A complex type that contains detailed information about each of the requests in the sample.
     */

    public java.util.List<SampledHTTPRequest> getSampledRequests() {
        return sampledRequests;
    }

    /**
     * <p>
     * A complex type that contains detailed information about each of the requests in the sample.
     * </p>
     * 
     * @param sampledRequests
     *        A complex type that contains detailed information about each of the requests in the sample.
     */

    public void setSampledRequests(java.util.Collection<SampledHTTPRequest> sampledRequests) {
        if (sampledRequests == null) {
            this.sampledRequests = null;
            return;
        }

        this.sampledRequests = new java.util.ArrayList<SampledHTTPRequest>(sampledRequests);
    }

    /**
     * <p>
     * A complex type that contains detailed information about each of the requests in the sample.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSampledRequests(java.util.Collection)} or {@link #withSampledRequests(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sampledRequests
     *        A complex type that contains detailed information about each of the requests in the sample.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampledRequestsResult withSampledRequests(SampledHTTPRequest... sampledRequests) {
        if (this.sampledRequests == null) {
            setSampledRequests(new java.util.ArrayList<SampledHTTPRequest>(sampledRequests.length));
        }
        for (SampledHTTPRequest ele : sampledRequests) {
            this.sampledRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains detailed information about each of the requests in the sample.
     * </p>
     * 
     * @param sampledRequests
     *        A complex type that contains detailed information about each of the requests in the sample.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampledRequestsResult withSampledRequests(java.util.Collection<SampledHTTPRequest> sampledRequests) {
        setSampledRequests(sampledRequests);
        return this;
    }

    /**
     * <p>
     * The total number of requests from which <code>GetSampledRequests</code> got a sample of <code>MaxItems</code>
     * requests. If <code>PopulationSize</code> is less than <code>MaxItems</code>, the sample includes every request
     * that your AWS resource received during the specified time range.
     * </p>
     * 
     * @param populationSize
     *        The total number of requests from which <code>GetSampledRequests</code> got a sample of
     *        <code>MaxItems</code> requests. If <code>PopulationSize</code> is less than <code>MaxItems</code>, the
     *        sample includes every request that your AWS resource received during the specified time range.
     */

    public void setPopulationSize(Long populationSize) {
        this.populationSize = populationSize;
    }

    /**
     * <p>
     * The total number of requests from which <code>GetSampledRequests</code> got a sample of <code>MaxItems</code>
     * requests. If <code>PopulationSize</code> is less than <code>MaxItems</code>, the sample includes every request
     * that your AWS resource received during the specified time range.
     * </p>
     * 
     * @return The total number of requests from which <code>GetSampledRequests</code> got a sample of
     *         <code>MaxItems</code> requests. If <code>PopulationSize</code> is less than <code>MaxItems</code>, the
     *         sample includes every request that your AWS resource received during the specified time range.
     */

    public Long getPopulationSize() {
        return this.populationSize;
    }

    /**
     * <p>
     * The total number of requests from which <code>GetSampledRequests</code> got a sample of <code>MaxItems</code>
     * requests. If <code>PopulationSize</code> is less than <code>MaxItems</code>, the sample includes every request
     * that your AWS resource received during the specified time range.
     * </p>
     * 
     * @param populationSize
     *        The total number of requests from which <code>GetSampledRequests</code> got a sample of
     *        <code>MaxItems</code> requests. If <code>PopulationSize</code> is less than <code>MaxItems</code>, the
     *        sample includes every request that your AWS resource received during the specified time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampledRequestsResult withPopulationSize(Long populationSize) {
        setPopulationSize(populationSize);
        return this;
    }

    /**
     * <p>
     * Usually, <code>TimeWindow</code> is the time range that you specified in the <code>GetSampledRequests</code>
     * request. However, if your AWS resource received more than 5,000 requests during the time range that you specified
     * in the request, <code>GetSampledRequests</code> returns the time range for the first 5,000 requests.
     * </p>
     * 
     * @param timeWindow
     *        Usually, <code>TimeWindow</code> is the time range that you specified in the
     *        <code>GetSampledRequests</code> request. However, if your AWS resource received more than 5,000 requests
     *        during the time range that you specified in the request, <code>GetSampledRequests</code> returns the time
     *        range for the first 5,000 requests.
     */

    public void setTimeWindow(TimeWindow timeWindow) {
        this.timeWindow = timeWindow;
    }

    /**
     * <p>
     * Usually, <code>TimeWindow</code> is the time range that you specified in the <code>GetSampledRequests</code>
     * request. However, if your AWS resource received more than 5,000 requests during the time range that you specified
     * in the request, <code>GetSampledRequests</code> returns the time range for the first 5,000 requests.
     * </p>
     * 
     * @return Usually, <code>TimeWindow</code> is the time range that you specified in the
     *         <code>GetSampledRequests</code> request. However, if your AWS resource received more than 5,000 requests
     *         during the time range that you specified in the request, <code>GetSampledRequests</code> returns the time
     *         range for the first 5,000 requests.
     */

    public TimeWindow getTimeWindow() {
        return this.timeWindow;
    }

    /**
     * <p>
     * Usually, <code>TimeWindow</code> is the time range that you specified in the <code>GetSampledRequests</code>
     * request. However, if your AWS resource received more than 5,000 requests during the time range that you specified
     * in the request, <code>GetSampledRequests</code> returns the time range for the first 5,000 requests.
     * </p>
     * 
     * @param timeWindow
     *        Usually, <code>TimeWindow</code> is the time range that you specified in the
     *        <code>GetSampledRequests</code> request. However, if your AWS resource received more than 5,000 requests
     *        during the time range that you specified in the request, <code>GetSampledRequests</code> returns the time
     *        range for the first 5,000 requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampledRequestsResult withTimeWindow(TimeWindow timeWindow) {
        setTimeWindow(timeWindow);
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
        if (getSampledRequests() != null)
            sb.append("SampledRequests: ").append(getSampledRequests()).append(",");
        if (getPopulationSize() != null)
            sb.append("PopulationSize: ").append(getPopulationSize()).append(",");
        if (getTimeWindow() != null)
            sb.append("TimeWindow: ").append(getTimeWindow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSampledRequestsResult == false)
            return false;
        GetSampledRequestsResult other = (GetSampledRequestsResult) obj;
        if (other.getSampledRequests() == null ^ this.getSampledRequests() == null)
            return false;
        if (other.getSampledRequests() != null && other.getSampledRequests().equals(this.getSampledRequests()) == false)
            return false;
        if (other.getPopulationSize() == null ^ this.getPopulationSize() == null)
            return false;
        if (other.getPopulationSize() != null && other.getPopulationSize().equals(this.getPopulationSize()) == false)
            return false;
        if (other.getTimeWindow() == null ^ this.getTimeWindow() == null)
            return false;
        if (other.getTimeWindow() != null && other.getTimeWindow().equals(this.getTimeWindow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSampledRequests() == null) ? 0 : getSampledRequests().hashCode());
        hashCode = prime * hashCode + ((getPopulationSize() == null) ? 0 : getPopulationSize().hashCode());
        hashCode = prime * hashCode + ((getTimeWindow() == null) ? 0 : getTimeWindow().hashCode());
        return hashCode;
    }

    @Override
    public GetSampledRequestsResult clone() {
        try {
            return (GetSampledRequestsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
