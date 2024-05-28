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
import com.amazonaws.services.ec2.model.transform.GetIpamDiscoveredPublicAddressesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIpamDiscoveredPublicAddressesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetIpamDiscoveredPublicAddressesRequest> {

    /**
     * <p>
     * An IPAM resource discovery ID.
     * </p>
     */
    private String ipamResourceDiscoveryId;
    /**
     * <p>
     * The Amazon Web Services Region for the IP address.
     * </p>
     */
    private String addressRegion;
    /**
     * <p>
     * Filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of IPAM discovered public addresses to return in one page of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * An IPAM resource discovery ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryId
     *        An IPAM resource discovery ID.
     */

    public void setIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
    }

    /**
     * <p>
     * An IPAM resource discovery ID.
     * </p>
     * 
     * @return An IPAM resource discovery ID.
     */

    public String getIpamResourceDiscoveryId() {
        return this.ipamResourceDiscoveryId;
    }

    /**
     * <p>
     * An IPAM resource discovery ID.
     * </p>
     * 
     * @param ipamResourceDiscoveryId
     *        An IPAM resource discovery ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamDiscoveredPublicAddressesRequest withIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        setIpamResourceDiscoveryId(ipamResourceDiscoveryId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region for the IP address.
     * </p>
     * 
     * @param addressRegion
     *        The Amazon Web Services Region for the IP address.
     */

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region for the IP address.
     * </p>
     * 
     * @return The Amazon Web Services Region for the IP address.
     */

    public String getAddressRegion() {
        return this.addressRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region for the IP address.
     * </p>
     * 
     * @param addressRegion
     *        The Amazon Web Services Region for the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamDiscoveredPublicAddressesRequest withAddressRegion(String addressRegion) {
        setAddressRegion(addressRegion);
        return this;
    }

    /**
     * <p>
     * Filters.
     * </p>
     * 
     * @return Filters.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * Filters.
     * </p>
     * 
     * @param filters
     *        Filters.
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
     * Filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamDiscoveredPublicAddressesRequest withFilters(Filter... filters) {
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
     * Filters.
     * </p>
     * 
     * @param filters
     *        Filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamDiscoveredPublicAddressesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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

    public GetIpamDiscoveredPublicAddressesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of IPAM discovered public addresses to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of IPAM discovered public addresses to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of IPAM discovered public addresses to return in one page of results.
     * </p>
     * 
     * @return The maximum number of IPAM discovered public addresses to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of IPAM discovered public addresses to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of IPAM discovered public addresses to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIpamDiscoveredPublicAddressesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetIpamDiscoveredPublicAddressesRequest> getDryRunRequest() {
        Request<GetIpamDiscoveredPublicAddressesRequest> request = new GetIpamDiscoveredPublicAddressesRequestMarshaller().marshall(this);
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
        if (getAddressRegion() != null)
            sb.append("AddressRegion: ").append(getAddressRegion()).append(",");
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

        if (obj instanceof GetIpamDiscoveredPublicAddressesRequest == false)
            return false;
        GetIpamDiscoveredPublicAddressesRequest other = (GetIpamDiscoveredPublicAddressesRequest) obj;
        if (other.getIpamResourceDiscoveryId() == null ^ this.getIpamResourceDiscoveryId() == null)
            return false;
        if (other.getIpamResourceDiscoveryId() != null && other.getIpamResourceDiscoveryId().equals(this.getIpamResourceDiscoveryId()) == false)
            return false;
        if (other.getAddressRegion() == null ^ this.getAddressRegion() == null)
            return false;
        if (other.getAddressRegion() != null && other.getAddressRegion().equals(this.getAddressRegion()) == false)
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
        hashCode = prime * hashCode + ((getAddressRegion() == null) ? 0 : getAddressRegion().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetIpamDiscoveredPublicAddressesRequest clone() {
        return (GetIpamDiscoveredPublicAddressesRequest) super.clone();
    }
}
