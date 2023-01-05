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
import com.amazonaws.services.ec2.model.transform.DescribeIpamScopesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIpamScopesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeIpamScopesRequest> {

    /**
     * <p>
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return in the request.
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
     * The IDs of the scopes you want information on.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ipamScopeIds;

    /**
     * <p>
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     * 
     * @return One or more filters for the request. For more information about filtering, see <a
     *         href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     * 
     * @param filters
     *        One or more filters for the request. For more information about filtering, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
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
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters for the request. For more information about filtering, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamScopesRequest withFilters(Filter... filters) {
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
     * One or more filters for the request. For more information about filtering, see <a
     * href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * </p>
     * 
     * @param filters
     *        One or more filters for the request. For more information about filtering, see <a
     *        href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamScopesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the request.
     * </p>
     * 
     * @return The maximum number of results to return in the request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamScopesRequest withMaxResults(Integer maxResults) {
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

    public DescribeIpamScopesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The IDs of the scopes you want information on.
     * </p>
     * 
     * @return The IDs of the scopes you want information on.
     */

    public java.util.List<String> getIpamScopeIds() {
        if (ipamScopeIds == null) {
            ipamScopeIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ipamScopeIds;
    }

    /**
     * <p>
     * The IDs of the scopes you want information on.
     * </p>
     * 
     * @param ipamScopeIds
     *        The IDs of the scopes you want information on.
     */

    public void setIpamScopeIds(java.util.Collection<String> ipamScopeIds) {
        if (ipamScopeIds == null) {
            this.ipamScopeIds = null;
            return;
        }

        this.ipamScopeIds = new com.amazonaws.internal.SdkInternalList<String>(ipamScopeIds);
    }

    /**
     * <p>
     * The IDs of the scopes you want information on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpamScopeIds(java.util.Collection)} or {@link #withIpamScopeIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipamScopeIds
     *        The IDs of the scopes you want information on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamScopesRequest withIpamScopeIds(String... ipamScopeIds) {
        if (this.ipamScopeIds == null) {
            setIpamScopeIds(new com.amazonaws.internal.SdkInternalList<String>(ipamScopeIds.length));
        }
        for (String ele : ipamScopeIds) {
            this.ipamScopeIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the scopes you want information on.
     * </p>
     * 
     * @param ipamScopeIds
     *        The IDs of the scopes you want information on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamScopesRequest withIpamScopeIds(java.util.Collection<String> ipamScopeIds) {
        setIpamScopeIds(ipamScopeIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeIpamScopesRequest> getDryRunRequest() {
        Request<DescribeIpamScopesRequest> request = new DescribeIpamScopesRequestMarshaller().marshall(this);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getIpamScopeIds() != null)
            sb.append("IpamScopeIds: ").append(getIpamScopeIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeIpamScopesRequest == false)
            return false;
        DescribeIpamScopesRequest other = (DescribeIpamScopesRequest) obj;
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
        if (other.getIpamScopeIds() == null ^ this.getIpamScopeIds() == null)
            return false;
        if (other.getIpamScopeIds() != null && other.getIpamScopeIds().equals(this.getIpamScopeIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getIpamScopeIds() == null) ? 0 : getIpamScopeIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIpamScopesRequest clone() {
        return (DescribeIpamScopesRequest) super.clone();
    }
}
