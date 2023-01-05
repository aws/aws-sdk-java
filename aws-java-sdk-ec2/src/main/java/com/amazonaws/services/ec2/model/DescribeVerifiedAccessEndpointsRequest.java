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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeVerifiedAccessEndpointsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVerifiedAccessEndpointsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeVerifiedAccessEndpointsRequest> {

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> verifiedAccessEndpointIds;
    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     */
    private String verifiedAccessInstanceId;
    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access group.
     * </p>
     */
    private String verifiedAccessGroupId;
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
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access endpoint.
     */

    public java.util.List<String> getVerifiedAccessEndpointIds() {
        if (verifiedAccessEndpointIds == null) {
            verifiedAccessEndpointIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return verifiedAccessEndpointIds;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param verifiedAccessEndpointIds
     *        The ID of the Amazon Web Services Verified Access endpoint.
     */

    public void setVerifiedAccessEndpointIds(java.util.Collection<String> verifiedAccessEndpointIds) {
        if (verifiedAccessEndpointIds == null) {
            this.verifiedAccessEndpointIds = null;
            return;
        }

        this.verifiedAccessEndpointIds = new com.amazonaws.internal.SdkInternalList<String>(verifiedAccessEndpointIds);
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVerifiedAccessEndpointIds(java.util.Collection)} or
     * {@link #withVerifiedAccessEndpointIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param verifiedAccessEndpointIds
     *        The ID of the Amazon Web Services Verified Access endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessEndpointsRequest withVerifiedAccessEndpointIds(String... verifiedAccessEndpointIds) {
        if (this.verifiedAccessEndpointIds == null) {
            setVerifiedAccessEndpointIds(new com.amazonaws.internal.SdkInternalList<String>(verifiedAccessEndpointIds.length));
        }
        for (String ele : verifiedAccessEndpointIds) {
            this.verifiedAccessEndpointIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param verifiedAccessEndpointIds
     *        The ID of the Amazon Web Services Verified Access endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessEndpointsRequest withVerifiedAccessEndpointIds(java.util.Collection<String> verifiedAccessEndpointIds) {
        setVerifiedAccessEndpointIds(verifiedAccessEndpointIds);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param verifiedAccessInstanceId
     *        The ID of the Amazon Web Services Verified Access instance.
     */

    public void setVerifiedAccessInstanceId(String verifiedAccessInstanceId) {
        this.verifiedAccessInstanceId = verifiedAccessInstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access instance.
     */

    public String getVerifiedAccessInstanceId() {
        return this.verifiedAccessInstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access instance.
     * </p>
     * 
     * @param verifiedAccessInstanceId
     *        The ID of the Amazon Web Services Verified Access instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessEndpointsRequest withVerifiedAccessInstanceId(String verifiedAccessInstanceId) {
        setVerifiedAccessInstanceId(verifiedAccessInstanceId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access group.
     * </p>
     * 
     * @param verifiedAccessGroupId
     *        The ID of the Amazon Web Services Verified Access group.
     */

    public void setVerifiedAccessGroupId(String verifiedAccessGroupId) {
        this.verifiedAccessGroupId = verifiedAccessGroupId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access group.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access group.
     */

    public String getVerifiedAccessGroupId() {
        return this.verifiedAccessGroupId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access group.
     * </p>
     * 
     * @param verifiedAccessGroupId
     *        The ID of the Amazon Web Services Verified Access group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessEndpointsRequest withVerifiedAccessGroupId(String verifiedAccessGroupId) {
        setVerifiedAccessGroupId(verifiedAccessGroupId);
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

    public DescribeVerifiedAccessEndpointsRequest withMaxResults(Integer maxResults) {
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

    public DescribeVerifiedAccessEndpointsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * 
     * @return One or more filters. Filter names and values are case-sensitive.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive.
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
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessEndpointsRequest withFilters(Filter... filters) {
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
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * 
     * @param filters
     *        One or more filters. Filter names and values are case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessEndpointsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeVerifiedAccessEndpointsRequest> getDryRunRequest() {
        Request<DescribeVerifiedAccessEndpointsRequest> request = new DescribeVerifiedAccessEndpointsRequestMarshaller().marshall(this);
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
        if (getVerifiedAccessEndpointIds() != null)
            sb.append("VerifiedAccessEndpointIds: ").append(getVerifiedAccessEndpointIds()).append(",");
        if (getVerifiedAccessInstanceId() != null)
            sb.append("VerifiedAccessInstanceId: ").append(getVerifiedAccessInstanceId()).append(",");
        if (getVerifiedAccessGroupId() != null)
            sb.append("VerifiedAccessGroupId: ").append(getVerifiedAccessGroupId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVerifiedAccessEndpointsRequest == false)
            return false;
        DescribeVerifiedAccessEndpointsRequest other = (DescribeVerifiedAccessEndpointsRequest) obj;
        if (other.getVerifiedAccessEndpointIds() == null ^ this.getVerifiedAccessEndpointIds() == null)
            return false;
        if (other.getVerifiedAccessEndpointIds() != null && other.getVerifiedAccessEndpointIds().equals(this.getVerifiedAccessEndpointIds()) == false)
            return false;
        if (other.getVerifiedAccessInstanceId() == null ^ this.getVerifiedAccessInstanceId() == null)
            return false;
        if (other.getVerifiedAccessInstanceId() != null && other.getVerifiedAccessInstanceId().equals(this.getVerifiedAccessInstanceId()) == false)
            return false;
        if (other.getVerifiedAccessGroupId() == null ^ this.getVerifiedAccessGroupId() == null)
            return false;
        if (other.getVerifiedAccessGroupId() != null && other.getVerifiedAccessGroupId().equals(this.getVerifiedAccessGroupId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifiedAccessEndpointIds() == null) ? 0 : getVerifiedAccessEndpointIds().hashCode());
        hashCode = prime * hashCode + ((getVerifiedAccessInstanceId() == null) ? 0 : getVerifiedAccessInstanceId().hashCode());
        hashCode = prime * hashCode + ((getVerifiedAccessGroupId() == null) ? 0 : getVerifiedAccessGroupId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVerifiedAccessEndpointsRequest clone() {
        return (DescribeVerifiedAccessEndpointsRequest) super.clone();
    }
}
