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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeNetworkInsightsPathsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInsightsPathsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeNetworkInsightsPathsRequest> {

    /**
     * <p>
     * The IDs of the paths.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> networkInsightsPathIds;
    /**
     * <p>
     * The filters. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Destination - The ID of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * DestinationPort - The destination port.
     * </p>
     * </li>
     * <li>
     * <p>
     * Name - The path name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Protocol - The protocol.
     * </p>
     * </li>
     * <li>
     * <p>
     * Source - The ID of the resource.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IDs of the paths.
     * </p>
     * 
     * @return The IDs of the paths.
     */

    public java.util.List<String> getNetworkInsightsPathIds() {
        if (networkInsightsPathIds == null) {
            networkInsightsPathIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return networkInsightsPathIds;
    }

    /**
     * <p>
     * The IDs of the paths.
     * </p>
     * 
     * @param networkInsightsPathIds
     *        The IDs of the paths.
     */

    public void setNetworkInsightsPathIds(java.util.Collection<String> networkInsightsPathIds) {
        if (networkInsightsPathIds == null) {
            this.networkInsightsPathIds = null;
            return;
        }

        this.networkInsightsPathIds = new com.amazonaws.internal.SdkInternalList<String>(networkInsightsPathIds);
    }

    /**
     * <p>
     * The IDs of the paths.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInsightsPathIds(java.util.Collection)} or
     * {@link #withNetworkInsightsPathIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkInsightsPathIds
     *        The IDs of the paths.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsPathsRequest withNetworkInsightsPathIds(String... networkInsightsPathIds) {
        if (this.networkInsightsPathIds == null) {
            setNetworkInsightsPathIds(new com.amazonaws.internal.SdkInternalList<String>(networkInsightsPathIds.length));
        }
        for (String ele : networkInsightsPathIds) {
            this.networkInsightsPathIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the paths.
     * </p>
     * 
     * @param networkInsightsPathIds
     *        The IDs of the paths.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsPathsRequest withNetworkInsightsPathIds(java.util.Collection<String> networkInsightsPathIds) {
        setNetworkInsightsPathIds(networkInsightsPathIds);
        return this;
    }

    /**
     * <p>
     * The filters. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Destination - The ID of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * DestinationPort - The destination port.
     * </p>
     * </li>
     * <li>
     * <p>
     * Name - The path name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Protocol - The protocol.
     * </p>
     * </li>
     * <li>
     * <p>
     * Source - The ID of the resource.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters. The following are possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Destination - The ID of the resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DestinationPort - The destination port.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Name - The path name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Protocol - The protocol.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Source - The ID of the resource.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * The filters. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Destination - The ID of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * DestinationPort - The destination port.
     * </p>
     * </li>
     * <li>
     * <p>
     * Name - The path name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Protocol - The protocol.
     * </p>
     * </li>
     * <li>
     * <p>
     * Source - The ID of the resource.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Destination - The ID of the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DestinationPort - The destination port.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Name - The path name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Protocol - The protocol.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Source - The ID of the resource.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * The filters. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Destination - The ID of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * DestinationPort - The destination port.
     * </p>
     * </li>
     * <li>
     * <p>
     * Name - The path name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Protocol - The protocol.
     * </p>
     * </li>
     * <li>
     * <p>
     * Source - The ID of the resource.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Destination - The ID of the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DestinationPort - The destination port.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Name - The path name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Protocol - The protocol.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Source - The ID of the resource.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsPathsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Destination - The ID of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * DestinationPort - The destination port.
     * </p>
     * </li>
     * <li>
     * <p>
     * Name - The path name.
     * </p>
     * </li>
     * <li>
     * <p>
     * Protocol - The protocol.
     * </p>
     * </li>
     * <li>
     * <p>
     * Source - The ID of the resource.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Destination - The ID of the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DestinationPort - The destination port.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Name - The path name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Protocol - The protocol.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Source - The ID of the resource.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsPathsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsPathsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInsightsPathsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeNetworkInsightsPathsRequest> getDryRunRequest() {
        Request<DescribeNetworkInsightsPathsRequest> request = new DescribeNetworkInsightsPathsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getNetworkInsightsPathIds() != null)
            sb.append("NetworkInsightsPathIds: ").append(getNetworkInsightsPathIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeNetworkInsightsPathsRequest == false)
            return false;
        DescribeNetworkInsightsPathsRequest other = (DescribeNetworkInsightsPathsRequest) obj;
        if (other.getNetworkInsightsPathIds() == null ^ this.getNetworkInsightsPathIds() == null)
            return false;
        if (other.getNetworkInsightsPathIds() != null && other.getNetworkInsightsPathIds().equals(this.getNetworkInsightsPathIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getNetworkInsightsPathIds() == null) ? 0 : getNetworkInsightsPathIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNetworkInsightsPathsRequest clone() {
        return (DescribeNetworkInsightsPathsRequest) super.clone();
    }
}
