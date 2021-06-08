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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/ListDevicePositions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDevicePositionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional limit for the number of entries returned in a single call.
     * </p>
     * <p>
     * Default value: <code>100</code>
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The pagination token specifying which page of results to return in the response. If no token is provided, the
     * default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The tracker resource containing the requested devices.
     * </p>
     */
    private String trackerName;

    /**
     * <p>
     * An optional limit for the number of entries returned in a single call.
     * </p>
     * <p>
     * Default value: <code>100</code>
     * </p>
     * 
     * @param maxResults
     *        An optional limit for the number of entries returned in a single call.</p>
     *        <p>
     *        Default value: <code>100</code>
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional limit for the number of entries returned in a single call.
     * </p>
     * <p>
     * Default value: <code>100</code>
     * </p>
     * 
     * @return An optional limit for the number of entries returned in a single call.</p>
     *         <p>
     *         Default value: <code>100</code>
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional limit for the number of entries returned in a single call.
     * </p>
     * <p>
     * Default value: <code>100</code>
     * </p>
     * 
     * @param maxResults
     *        An optional limit for the number of entries returned in a single call.</p>
     *        <p>
     *        Default value: <code>100</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicePositionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the response. If no token is provided, the
     * default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * 
     * @param nextToken
     *        The pagination token specifying which page of results to return in the response. If no token is provided,
     *        the default page is the first page.</p>
     *        <p>
     *        Default value: <code>null</code>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the response. If no token is provided, the
     * default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * 
     * @return The pagination token specifying which page of results to return in the response. If no token is provided,
     *         the default page is the first page.</p>
     *         <p>
     *         Default value: <code>null</code>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token specifying which page of results to return in the response. If no token is provided, the
     * default page is the first page.
     * </p>
     * <p>
     * Default value: <code>null</code>
     * </p>
     * 
     * @param nextToken
     *        The pagination token specifying which page of results to return in the response. If no token is provided,
     *        the default page is the first page.</p>
     *        <p>
     *        Default value: <code>null</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicePositionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The tracker resource containing the requested devices.
     * </p>
     * 
     * @param trackerName
     *        The tracker resource containing the requested devices.
     */

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The tracker resource containing the requested devices.
     * </p>
     * 
     * @return The tracker resource containing the requested devices.
     */

    public String getTrackerName() {
        return this.trackerName;
    }

    /**
     * <p>
     * The tracker resource containing the requested devices.
     * </p>
     * 
     * @param trackerName
     *        The tracker resource containing the requested devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDevicePositionsRequest withTrackerName(String trackerName) {
        setTrackerName(trackerName);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTrackerName() != null)
            sb.append("TrackerName: ").append(getTrackerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDevicePositionsRequest == false)
            return false;
        ListDevicePositionsRequest other = (ListDevicePositionsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        return hashCode;
    }

    @Override
    public ListDevicePositionsRequest clone() {
        return (ListDevicePositionsRequest) super.clone();
    }

}
