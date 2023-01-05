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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListDevicesJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDevicesJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filter results by the job's target device ID.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The maximum number of device jobs to return in one page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Filter results by the job's target device ID.
     * </p>
     * 
     * @param deviceId
     *        Filter results by the job's target device ID.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * Filter results by the job's target device ID.
     * </p>
     * 
     * @return Filter results by the job's target device ID.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * Filter results by the job's target device ID.
     * </p>
     * 
     * @param deviceId
     *        Filter results by the job's target device ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesJobsRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The maximum number of device jobs to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of device jobs to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of device jobs to return in one page of results.
     * </p>
     * 
     * @return The maximum number of device jobs to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of device jobs to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of device jobs to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicesJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDevicesJobsRequest == false)
            return false;
        ListDevicesJobsRequest other = (ListDevicesJobsRequest) obj;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDevicesJobsRequest clone() {
        return (ListDevicesJobsRequest) super.clone();
    }

}
