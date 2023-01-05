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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/ListRumMetricsDestinations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRumMetricsDestinationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the app monitor associated with the destinations that you want to retrieve.
     * </p>
     */
    private String appMonitorName;
    /**
     * <p>
     * The maximum number of results to return in one operation. The default is 50. The maximum that you can specify is
     * 100.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the app monitor associated with the destinations that you want to retrieve.
     * </p>
     * 
     * @param appMonitorName
     *        The name of the app monitor associated with the destinations that you want to retrieve.
     */

    public void setAppMonitorName(String appMonitorName) {
        this.appMonitorName = appMonitorName;
    }

    /**
     * <p>
     * The name of the app monitor associated with the destinations that you want to retrieve.
     * </p>
     * 
     * @return The name of the app monitor associated with the destinations that you want to retrieve.
     */

    public String getAppMonitorName() {
        return this.appMonitorName;
    }

    /**
     * <p>
     * The name of the app monitor associated with the destinations that you want to retrieve.
     * </p>
     * 
     * @param appMonitorName
     *        The name of the app monitor associated with the destinations that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRumMetricsDestinationsRequest withAppMonitorName(String appMonitorName) {
        setAppMonitorName(appMonitorName);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. The default is 50. The maximum that you can specify is
     * 100.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in one operation. The default is 50. The maximum that you can
     *        specify is 100.</p>
     *        <p>
     *        To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. The default is 50. The maximum that you can specify is
     * 100.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in one operation. The default is 50. The maximum that you can
     *         specify is 100.</p>
     *         <p>
     *         To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. The default is 50. The maximum that you can specify is
     * 100.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in one operation. The default is 50. The maximum that you can
     *        specify is 100.</p>
     *        <p>
     *        To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRumMetricsDestinationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Use the token returned by the previous operation to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     * 
     * @return Use the token returned by the previous operation to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Use the token returned by the previous operation to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRumMetricsDestinationsRequest withNextToken(String nextToken) {
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
        if (getAppMonitorName() != null)
            sb.append("AppMonitorName: ").append(getAppMonitorName()).append(",");
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

        if (obj instanceof ListRumMetricsDestinationsRequest == false)
            return false;
        ListRumMetricsDestinationsRequest other = (ListRumMetricsDestinationsRequest) obj;
        if (other.getAppMonitorName() == null ^ this.getAppMonitorName() == null)
            return false;
        if (other.getAppMonitorName() != null && other.getAppMonitorName().equals(this.getAppMonitorName()) == false)
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

        hashCode = prime * hashCode + ((getAppMonitorName() == null) ? 0 : getAppMonitorName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRumMetricsDestinationsRequest clone() {
        return (ListRumMetricsDestinationsRequest) super.clone();
    }

}
