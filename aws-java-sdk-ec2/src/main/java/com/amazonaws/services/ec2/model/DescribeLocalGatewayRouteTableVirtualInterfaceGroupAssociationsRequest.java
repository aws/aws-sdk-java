/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest> {

    /**
     * <p>
     * The IDs of the associations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> localGatewayRouteTableVirtualInterfaceGroupAssociationIds;
    /**
     * <p>
     * One or more filters.
     * </p>
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
     * The IDs of the associations.
     * </p>
     * 
     * @return The IDs of the associations.
     */

    public java.util.List<String> getLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds() {
        if (localGatewayRouteTableVirtualInterfaceGroupAssociationIds == null) {
            localGatewayRouteTableVirtualInterfaceGroupAssociationIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return localGatewayRouteTableVirtualInterfaceGroupAssociationIds;
    }

    /**
     * <p>
     * The IDs of the associations.
     * </p>
     * 
     * @param localGatewayRouteTableVirtualInterfaceGroupAssociationIds
     *        The IDs of the associations.
     */

    public void setLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds(
            java.util.Collection<String> localGatewayRouteTableVirtualInterfaceGroupAssociationIds) {
        if (localGatewayRouteTableVirtualInterfaceGroupAssociationIds == null) {
            this.localGatewayRouteTableVirtualInterfaceGroupAssociationIds = null;
            return;
        }

        this.localGatewayRouteTableVirtualInterfaceGroupAssociationIds = new com.amazonaws.internal.SdkInternalList<String>(
                localGatewayRouteTableVirtualInterfaceGroupAssociationIds);
    }

    /**
     * <p>
     * The IDs of the associations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds(java.util.Collection)} or
     * {@link #withLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param localGatewayRouteTableVirtualInterfaceGroupAssociationIds
     *        The IDs of the associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest withLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds(
            String... localGatewayRouteTableVirtualInterfaceGroupAssociationIds) {
        if (this.localGatewayRouteTableVirtualInterfaceGroupAssociationIds == null) {
            setLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds(new com.amazonaws.internal.SdkInternalList<String>(
                    localGatewayRouteTableVirtualInterfaceGroupAssociationIds.length));
        }
        for (String ele : localGatewayRouteTableVirtualInterfaceGroupAssociationIds) {
            this.localGatewayRouteTableVirtualInterfaceGroupAssociationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the associations.
     * </p>
     * 
     * @param localGatewayRouteTableVirtualInterfaceGroupAssociationIds
     *        The IDs of the associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest withLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds(
            java.util.Collection<String> localGatewayRouteTableVirtualInterfaceGroupAssociationIds) {
        setLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds(localGatewayRouteTableVirtualInterfaceGroupAssociationIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * 
     * @return One or more filters.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * 
     * @param filters
     *        One or more filters.
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
     * One or more filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest withFilters(Filter... filters) {
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
     * One or more filters.
     * </p>
     * 
     * @param filters
     *        One or more filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest withFilters(java.util.Collection<Filter> filters) {
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

    public DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest withMaxResults(Integer maxResults) {
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

    public DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest> getDryRunRequest() {
        Request<DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest> request = new DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequestMarshaller()
                .marshall(this);
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
        if (getLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds() != null)
            sb.append("LocalGatewayRouteTableVirtualInterfaceGroupAssociationIds: ").append(getLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds())
                    .append(",");
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

        if (obj instanceof DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest == false)
            return false;
        DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest other = (DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest) obj;
        if (other.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds() == null
                ^ this.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds() == null)
            return false;
        if (other.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds() != null
                && other.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds().equals(
                        this.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds()) == false)
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

        hashCode = prime
                * hashCode
                + ((getLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds() == null) ? 0
                        : getLocalGatewayRouteTableVirtualInterfaceGroupAssociationIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest clone() {
        return (DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest) super.clone();
    }
}
