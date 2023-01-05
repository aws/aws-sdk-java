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
import com.amazonaws.services.ec2.model.transform.DescribeVerifiedAccessTrustProvidersRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVerifiedAccessTrustProvidersRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeVerifiedAccessTrustProvidersRequest> {

    /**
     * <p>
     * The IDs of the Amazon Web Services Verified Access trust providers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> verifiedAccessTrustProviderIds;
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
     * The IDs of the Amazon Web Services Verified Access trust providers.
     * </p>
     * 
     * @return The IDs of the Amazon Web Services Verified Access trust providers.
     */

    public java.util.List<String> getVerifiedAccessTrustProviderIds() {
        if (verifiedAccessTrustProviderIds == null) {
            verifiedAccessTrustProviderIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return verifiedAccessTrustProviderIds;
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services Verified Access trust providers.
     * </p>
     * 
     * @param verifiedAccessTrustProviderIds
     *        The IDs of the Amazon Web Services Verified Access trust providers.
     */

    public void setVerifiedAccessTrustProviderIds(java.util.Collection<String> verifiedAccessTrustProviderIds) {
        if (verifiedAccessTrustProviderIds == null) {
            this.verifiedAccessTrustProviderIds = null;
            return;
        }

        this.verifiedAccessTrustProviderIds = new com.amazonaws.internal.SdkInternalList<String>(verifiedAccessTrustProviderIds);
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services Verified Access trust providers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVerifiedAccessTrustProviderIds(java.util.Collection)} or
     * {@link #withVerifiedAccessTrustProviderIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param verifiedAccessTrustProviderIds
     *        The IDs of the Amazon Web Services Verified Access trust providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessTrustProvidersRequest withVerifiedAccessTrustProviderIds(String... verifiedAccessTrustProviderIds) {
        if (this.verifiedAccessTrustProviderIds == null) {
            setVerifiedAccessTrustProviderIds(new com.amazonaws.internal.SdkInternalList<String>(verifiedAccessTrustProviderIds.length));
        }
        for (String ele : verifiedAccessTrustProviderIds) {
            this.verifiedAccessTrustProviderIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Amazon Web Services Verified Access trust providers.
     * </p>
     * 
     * @param verifiedAccessTrustProviderIds
     *        The IDs of the Amazon Web Services Verified Access trust providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVerifiedAccessTrustProvidersRequest withVerifiedAccessTrustProviderIds(java.util.Collection<String> verifiedAccessTrustProviderIds) {
        setVerifiedAccessTrustProviderIds(verifiedAccessTrustProviderIds);
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

    public DescribeVerifiedAccessTrustProvidersRequest withMaxResults(Integer maxResults) {
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

    public DescribeVerifiedAccessTrustProvidersRequest withNextToken(String nextToken) {
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

    public DescribeVerifiedAccessTrustProvidersRequest withFilters(Filter... filters) {
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

    public DescribeVerifiedAccessTrustProvidersRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeVerifiedAccessTrustProvidersRequest> getDryRunRequest() {
        Request<DescribeVerifiedAccessTrustProvidersRequest> request = new DescribeVerifiedAccessTrustProvidersRequestMarshaller().marshall(this);
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
        if (getVerifiedAccessTrustProviderIds() != null)
            sb.append("VerifiedAccessTrustProviderIds: ").append(getVerifiedAccessTrustProviderIds()).append(",");
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

        if (obj instanceof DescribeVerifiedAccessTrustProvidersRequest == false)
            return false;
        DescribeVerifiedAccessTrustProvidersRequest other = (DescribeVerifiedAccessTrustProvidersRequest) obj;
        if (other.getVerifiedAccessTrustProviderIds() == null ^ this.getVerifiedAccessTrustProviderIds() == null)
            return false;
        if (other.getVerifiedAccessTrustProviderIds() != null
                && other.getVerifiedAccessTrustProviderIds().equals(this.getVerifiedAccessTrustProviderIds()) == false)
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

        hashCode = prime * hashCode + ((getVerifiedAccessTrustProviderIds() == null) ? 0 : getVerifiedAccessTrustProviderIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVerifiedAccessTrustProvidersRequest clone() {
        return (DescribeVerifiedAccessTrustProvidersRequest) super.clone();
    }
}
