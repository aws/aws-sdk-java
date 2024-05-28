/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.GetIpamDiscoveredAccountsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIpamDiscoveredAccountsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetIpamDiscoveredAccountsRequest> {

    /**
     * <p>
     * A resource discovery ID.
     * </p>
     */
    private String ipamResourceDiscoveryId;
    /**
     * <p>
     * The Amazon Web Services Region that the account information is returned from.
     * </p>
     */
    private String discoveryRegion;
    /**
     * <p>
     * Discovered account filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of discovered accounts to return in one page of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A resource discovery ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryId
     *        A resource discovery ID.
     */

    public void setIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
    }

    /**
     * <p>
     * A resource discovery ID.
     * </p>
     * 
     * @return A resource discovery ID.
     */

    public String getIpamResourceDiscoveryId() {
        return this.ipamResourceDiscoveryId;
    }

    /**
     * <p>
     * A resource discovery ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryId
     *        A resource discovery ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamDiscoveredAccountsRequest withIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        setIpamResourceDiscoveryId(ipamResourceDiscoveryId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region that the account information is returned from.
     * </p>
     * 
     * @param discoveryRegion
     *        The Amazon Web Services Region that the account information is returned from.
     */

    public void setDiscoveryRegion(String discoveryRegion) {
        this.discoveryRegion = discoveryRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region that the account information is returned from.
     * </p>
     * 
     * @return The Amazon Web Services Region that the account information is returned from.
     */

    public String getDiscoveryRegion() {
        return this.discoveryRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region that the account information is returned from.
     * </p>
     * 
     * @param discoveryRegion
     *        The Amazon Web Services Region that the account information is returned from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamDiscoveredAccountsRequest withDiscoveryRegion(String discoveryRegion) {
        setDiscoveryRegion(discoveryRegion);
        return this;
    }

    /**
     * <p>
     * Discovered account filters.
     * </p>
     * 
     * @return Discovered account filters.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * Discovered account filters.
     * </p>
     * 
     * @param filters
     *        Discovered account filters.
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
     * Discovered account filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Discovered account filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamDiscoveredAccountsRequest withFilters(Filter... filters) {
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
     * Discovered account filters.
     * </p>
     * 
     * @param filters
     *        Discovered account filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamDiscoveredAccountsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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

    public GetIpamDiscoveredAccountsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of discovered accounts to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of discovered accounts to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of discovered accounts to return in one page of results.
     * </p>
     * 
     * @return The maximum number of discovered accounts to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of discovered accounts to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of discovered accounts to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamDiscoveredAccountsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetIpamDiscoveredAccountsRequest> getDryRunRequest() {
        Request<GetIpamDiscoveredAccountsRequest> request = new GetIpamDiscoveredAccountsRequestMarshaller().marshall(this);
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
        if (getIpamResourceDiscoveryId() != null)
            sb.append("IpamResourceDiscoveryId: ").append(getIpamResourceDiscoveryId()).append(",");
        if (getDiscoveryRegion() != null)
            sb.append("DiscoveryRegion: ").append(getDiscoveryRegion()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIpamDiscoveredAccountsRequest == false)
            return false;
        GetIpamDiscoveredAccountsRequest other = (GetIpamDiscoveredAccountsRequest) obj;
        if (other.getIpamResourceDiscoveryId() == null ^ this.getIpamResourceDiscoveryId() == null)
            return false;
        if (other.getIpamResourceDiscoveryId() != null && other.getIpamResourceDiscoveryId().equals(this.getIpamResourceDiscoveryId()) == false)
            return false;
        if (other.getDiscoveryRegion() == null ^ this.getDiscoveryRegion() == null)
            return false;
        if (other.getDiscoveryRegion() != null && other.getDiscoveryRegion().equals(this.getDiscoveryRegion()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpamResourceDiscoveryId() == null) ? 0 : getIpamResourceDiscoveryId().hashCode());
        hashCode = prime * hashCode + ((getDiscoveryRegion() == null) ? 0 : getDiscoveryRegion().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetIpamDiscoveredAccountsRequest clone() {
        return (GetIpamDiscoveredAccountsRequest) super.clone();
    }
}
