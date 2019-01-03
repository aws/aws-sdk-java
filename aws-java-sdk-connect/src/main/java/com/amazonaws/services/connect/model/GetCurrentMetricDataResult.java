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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetCurrentMetricData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCurrentMetricDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent requests that use the NextToken must
     * use the same request parameters as the request that generated the token.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of <code>CurrentMetricResult</code> objects organized by <code>Dimensions</code> combining with
     * <code>CurrentMetricDataCollections</code>.
     * </p>
     * <p>
     * <code>Dimensions</code> is the resourceId specified in the <code>Filters</code> of the request.
     * </p>
     * <p>
     * <code>Collections</code> is a list of <code>CurrentMetricData</code> objects with corresponding values to the
     * <code>CurrentMetrics</code> specified in the request.
     * </p>
     * <p>
     * If no <code>Grouping</code> is specified in the request, <code>Collections</code> is a summary for the
     * <code>CurrentMetric</code> returned.
     * </p>
     */
    private java.util.List<CurrentMetricResult> metricResults;
    /**
     * <p>
     * The time at which <code>CurrentMetricData</code> was retrieved and cached for pagination.
     * </p>
     */
    private java.util.Date dataSnapshotTime;

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent requests that use the NextToken must
     * use the same request parameters as the request that generated the token.
     * </p>
     * 
     * @param nextToken
     *        A string returned in the response. Use the value returned in the response as the value of the NextToken in
     *        a subsequent request to retrieve the next set of results.</p>
     *        <p>
     *        The token expires after 5 minutes from the time it is created. Subsequent requests that use the NextToken
     *        must use the same request parameters as the request that generated the token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent requests that use the NextToken must
     * use the same request parameters as the request that generated the token.
     * </p>
     * 
     * @return A string returned in the response. Use the value returned in the response as the value of the NextToken
     *         in a subsequent request to retrieve the next set of results.</p>
     *         <p>
     *         The token expires after 5 minutes from the time it is created. Subsequent requests that use the NextToken
     *         must use the same request parameters as the request that generated the token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string returned in the response. Use the value returned in the response as the value of the NextToken in a
     * subsequent request to retrieve the next set of results.
     * </p>
     * <p>
     * The token expires after 5 minutes from the time it is created. Subsequent requests that use the NextToken must
     * use the same request parameters as the request that generated the token.
     * </p>
     * 
     * @param nextToken
     *        A string returned in the response. Use the value returned in the response as the value of the NextToken in
     *        a subsequent request to retrieve the next set of results.</p>
     *        <p>
     *        The token expires after 5 minutes from the time it is created. Subsequent requests that use the NextToken
     *        must use the same request parameters as the request that generated the token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCurrentMetricDataResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of <code>CurrentMetricResult</code> objects organized by <code>Dimensions</code> combining with
     * <code>CurrentMetricDataCollections</code>.
     * </p>
     * <p>
     * <code>Dimensions</code> is the resourceId specified in the <code>Filters</code> of the request.
     * </p>
     * <p>
     * <code>Collections</code> is a list of <code>CurrentMetricData</code> objects with corresponding values to the
     * <code>CurrentMetrics</code> specified in the request.
     * </p>
     * <p>
     * If no <code>Grouping</code> is specified in the request, <code>Collections</code> is a summary for the
     * <code>CurrentMetric</code> returned.
     * </p>
     * 
     * @return A list of <code>CurrentMetricResult</code> objects organized by <code>Dimensions</code> combining with
     *         <code>CurrentMetricDataCollections</code>.</p>
     *         <p>
     *         <code>Dimensions</code> is the resourceId specified in the <code>Filters</code> of the request.
     *         </p>
     *         <p>
     *         <code>Collections</code> is a list of <code>CurrentMetricData</code> objects with corresponding values to
     *         the <code>CurrentMetrics</code> specified in the request.
     *         </p>
     *         <p>
     *         If no <code>Grouping</code> is specified in the request, <code>Collections</code> is a summary for the
     *         <code>CurrentMetric</code> returned.
     */

    public java.util.List<CurrentMetricResult> getMetricResults() {
        return metricResults;
    }

    /**
     * <p>
     * A list of <code>CurrentMetricResult</code> objects organized by <code>Dimensions</code> combining with
     * <code>CurrentMetricDataCollections</code>.
     * </p>
     * <p>
     * <code>Dimensions</code> is the resourceId specified in the <code>Filters</code> of the request.
     * </p>
     * <p>
     * <code>Collections</code> is a list of <code>CurrentMetricData</code> objects with corresponding values to the
     * <code>CurrentMetrics</code> specified in the request.
     * </p>
     * <p>
     * If no <code>Grouping</code> is specified in the request, <code>Collections</code> is a summary for the
     * <code>CurrentMetric</code> returned.
     * </p>
     * 
     * @param metricResults
     *        A list of <code>CurrentMetricResult</code> objects organized by <code>Dimensions</code> combining with
     *        <code>CurrentMetricDataCollections</code>.</p>
     *        <p>
     *        <code>Dimensions</code> is the resourceId specified in the <code>Filters</code> of the request.
     *        </p>
     *        <p>
     *        <code>Collections</code> is a list of <code>CurrentMetricData</code> objects with corresponding values to
     *        the <code>CurrentMetrics</code> specified in the request.
     *        </p>
     *        <p>
     *        If no <code>Grouping</code> is specified in the request, <code>Collections</code> is a summary for the
     *        <code>CurrentMetric</code> returned.
     */

    public void setMetricResults(java.util.Collection<CurrentMetricResult> metricResults) {
        if (metricResults == null) {
            this.metricResults = null;
            return;
        }

        this.metricResults = new java.util.ArrayList<CurrentMetricResult>(metricResults);
    }

    /**
     * <p>
     * A list of <code>CurrentMetricResult</code> objects organized by <code>Dimensions</code> combining with
     * <code>CurrentMetricDataCollections</code>.
     * </p>
     * <p>
     * <code>Dimensions</code> is the resourceId specified in the <code>Filters</code> of the request.
     * </p>
     * <p>
     * <code>Collections</code> is a list of <code>CurrentMetricData</code> objects with corresponding values to the
     * <code>CurrentMetrics</code> specified in the request.
     * </p>
     * <p>
     * If no <code>Grouping</code> is specified in the request, <code>Collections</code> is a summary for the
     * <code>CurrentMetric</code> returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricResults(java.util.Collection)} or {@link #withMetricResults(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param metricResults
     *        A list of <code>CurrentMetricResult</code> objects organized by <code>Dimensions</code> combining with
     *        <code>CurrentMetricDataCollections</code>.</p>
     *        <p>
     *        <code>Dimensions</code> is the resourceId specified in the <code>Filters</code> of the request.
     *        </p>
     *        <p>
     *        <code>Collections</code> is a list of <code>CurrentMetricData</code> objects with corresponding values to
     *        the <code>CurrentMetrics</code> specified in the request.
     *        </p>
     *        <p>
     *        If no <code>Grouping</code> is specified in the request, <code>Collections</code> is a summary for the
     *        <code>CurrentMetric</code> returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCurrentMetricDataResult withMetricResults(CurrentMetricResult... metricResults) {
        if (this.metricResults == null) {
            setMetricResults(new java.util.ArrayList<CurrentMetricResult>(metricResults.length));
        }
        for (CurrentMetricResult ele : metricResults) {
            this.metricResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>CurrentMetricResult</code> objects organized by <code>Dimensions</code> combining with
     * <code>CurrentMetricDataCollections</code>.
     * </p>
     * <p>
     * <code>Dimensions</code> is the resourceId specified in the <code>Filters</code> of the request.
     * </p>
     * <p>
     * <code>Collections</code> is a list of <code>CurrentMetricData</code> objects with corresponding values to the
     * <code>CurrentMetrics</code> specified in the request.
     * </p>
     * <p>
     * If no <code>Grouping</code> is specified in the request, <code>Collections</code> is a summary for the
     * <code>CurrentMetric</code> returned.
     * </p>
     * 
     * @param metricResults
     *        A list of <code>CurrentMetricResult</code> objects organized by <code>Dimensions</code> combining with
     *        <code>CurrentMetricDataCollections</code>.</p>
     *        <p>
     *        <code>Dimensions</code> is the resourceId specified in the <code>Filters</code> of the request.
     *        </p>
     *        <p>
     *        <code>Collections</code> is a list of <code>CurrentMetricData</code> objects with corresponding values to
     *        the <code>CurrentMetrics</code> specified in the request.
     *        </p>
     *        <p>
     *        If no <code>Grouping</code> is specified in the request, <code>Collections</code> is a summary for the
     *        <code>CurrentMetric</code> returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCurrentMetricDataResult withMetricResults(java.util.Collection<CurrentMetricResult> metricResults) {
        setMetricResults(metricResults);
        return this;
    }

    /**
     * <p>
     * The time at which <code>CurrentMetricData</code> was retrieved and cached for pagination.
     * </p>
     * 
     * @param dataSnapshotTime
     *        The time at which <code>CurrentMetricData</code> was retrieved and cached for pagination.
     */

    public void setDataSnapshotTime(java.util.Date dataSnapshotTime) {
        this.dataSnapshotTime = dataSnapshotTime;
    }

    /**
     * <p>
     * The time at which <code>CurrentMetricData</code> was retrieved and cached for pagination.
     * </p>
     * 
     * @return The time at which <code>CurrentMetricData</code> was retrieved and cached for pagination.
     */

    public java.util.Date getDataSnapshotTime() {
        return this.dataSnapshotTime;
    }

    /**
     * <p>
     * The time at which <code>CurrentMetricData</code> was retrieved and cached for pagination.
     * </p>
     * 
     * @param dataSnapshotTime
     *        The time at which <code>CurrentMetricData</code> was retrieved and cached for pagination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCurrentMetricDataResult withDataSnapshotTime(java.util.Date dataSnapshotTime) {
        setDataSnapshotTime(dataSnapshotTime);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMetricResults() != null)
            sb.append("MetricResults: ").append(getMetricResults()).append(",");
        if (getDataSnapshotTime() != null)
            sb.append("DataSnapshotTime: ").append(getDataSnapshotTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCurrentMetricDataResult == false)
            return false;
        GetCurrentMetricDataResult other = (GetCurrentMetricDataResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMetricResults() == null ^ this.getMetricResults() == null)
            return false;
        if (other.getMetricResults() != null && other.getMetricResults().equals(this.getMetricResults()) == false)
            return false;
        if (other.getDataSnapshotTime() == null ^ this.getDataSnapshotTime() == null)
            return false;
        if (other.getDataSnapshotTime() != null && other.getDataSnapshotTime().equals(this.getDataSnapshotTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMetricResults() == null) ? 0 : getMetricResults().hashCode());
        hashCode = prime * hashCode + ((getDataSnapshotTime() == null) ? 0 : getDataSnapshotTime().hashCode());
        return hashCode;
    }

    @Override
    public GetCurrentMetricDataResult clone() {
        try {
            return (GetCurrentMetricDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
