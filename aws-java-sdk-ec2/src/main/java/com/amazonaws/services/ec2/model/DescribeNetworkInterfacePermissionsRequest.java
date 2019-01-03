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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeNetworkInterfacePermissionsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeNetworkInterfacePermissions.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInterfacePermissionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeNetworkInterfacePermissionsRequest> {

    /**
     * <p>
     * One or more network interface permission IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> networkInterfacePermissionIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-permission-id</code> - The ID of the permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-account-id</code> - The AWS account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-service</code> - The AWS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.permission</code> - The type of permission (<code>INSTANCE-ATTACH</code> |
     * <code>EIP-ASSOCIATE</code>).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. If this parameter is not specified, up to 50 results are returned
     * by default.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more network interface permission IDs.
     * </p>
     * 
     * @return One or more network interface permission IDs.
     */

    public java.util.List<String> getNetworkInterfacePermissionIds() {
        if (networkInterfacePermissionIds == null) {
            networkInterfacePermissionIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return networkInterfacePermissionIds;
    }

    /**
     * <p>
     * One or more network interface permission IDs.
     * </p>
     * 
     * @param networkInterfacePermissionIds
     *        One or more network interface permission IDs.
     */

    public void setNetworkInterfacePermissionIds(java.util.Collection<String> networkInterfacePermissionIds) {
        if (networkInterfacePermissionIds == null) {
            this.networkInterfacePermissionIds = null;
            return;
        }

        this.networkInterfacePermissionIds = new com.amazonaws.internal.SdkInternalList<String>(networkInterfacePermissionIds);
    }

    /**
     * <p>
     * One or more network interface permission IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfacePermissionIds(java.util.Collection)} or
     * {@link #withNetworkInterfacePermissionIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfacePermissionIds
     *        One or more network interface permission IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfacePermissionsRequest withNetworkInterfacePermissionIds(String... networkInterfacePermissionIds) {
        if (this.networkInterfacePermissionIds == null) {
            setNetworkInterfacePermissionIds(new com.amazonaws.internal.SdkInternalList<String>(networkInterfacePermissionIds.length));
        }
        for (String ele : networkInterfacePermissionIds) {
            this.networkInterfacePermissionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more network interface permission IDs.
     * </p>
     * 
     * @param networkInterfacePermissionIds
     *        One or more network interface permission IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfacePermissionsRequest withNetworkInterfacePermissionIds(java.util.Collection<String> networkInterfacePermissionIds) {
        setNetworkInterfacePermissionIds(networkInterfacePermissionIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-permission-id</code> - The ID of the permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-account-id</code> - The AWS account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-service</code> - The AWS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.permission</code> - The type of permission (<code>INSTANCE-ATTACH</code> |
     * <code>EIP-ASSOCIATE</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>network-interface-permission.network-interface-permission-id</code> - The ID of the permission.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface-permission.network-interface-id</code> - The ID of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface-permission.aws-account-id</code> - The AWS account ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface-permission.aws-service</code> - The AWS service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface-permission.permission</code> - The type of permission (
     *         <code>INSTANCE-ATTACH</code> | <code>EIP-ASSOCIATE</code>).
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-permission-id</code> - The ID of the permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-account-id</code> - The AWS account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-service</code> - The AWS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.permission</code> - The type of permission (<code>INSTANCE-ATTACH</code> |
     * <code>EIP-ASSOCIATE</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.network-interface-permission-id</code> - The ID of the permission.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.network-interface-id</code> - The ID of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.aws-account-id</code> - The AWS account ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.aws-service</code> - The AWS service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.permission</code> - The type of permission (
     *        <code>INSTANCE-ATTACH</code> | <code>EIP-ASSOCIATE</code>).
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-permission-id</code> - The ID of the permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-account-id</code> - The AWS account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-service</code> - The AWS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.permission</code> - The type of permission (<code>INSTANCE-ATTACH</code> |
     * <code>EIP-ASSOCIATE</code>).
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
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.network-interface-permission-id</code> - The ID of the permission.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.network-interface-id</code> - The ID of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.aws-account-id</code> - The AWS account ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.aws-service</code> - The AWS service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.permission</code> - The type of permission (
     *        <code>INSTANCE-ATTACH</code> | <code>EIP-ASSOCIATE</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfacePermissionsRequest withFilters(Filter... filters) {
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
     * <ul>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-permission-id</code> - The ID of the permission.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-account-id</code> - The AWS account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.aws-service</code> - The AWS service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-permission.permission</code> - The type of permission (<code>INSTANCE-ATTACH</code> |
     * <code>EIP-ASSOCIATE</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.network-interface-permission-id</code> - The ID of the permission.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.network-interface-id</code> - The ID of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.aws-account-id</code> - The AWS account ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.aws-service</code> - The AWS service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-permission.permission</code> - The type of permission (
     *        <code>INSTANCE-ATTACH</code> | <code>EIP-ASSOCIATE</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfacePermissionsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @return The token to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfacePermissionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. If this parameter is not specified, up to 50 results are returned
     * by default.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>NextToken</code> value. If this parameter is not specified, up to 50 results
     *        are returned by default.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. If this parameter is not specified, up to 50 results are returned
     * by default.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *         call with the returned <code>NextToken</code> value. If this parameter is not specified, up to 50 results
     *         are returned by default.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the remaining results, make another call
     * with the returned <code>NextToken</code> value. If this parameter is not specified, up to 50 results are returned
     * by default.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. To retrieve the remaining results, make another
     *        call with the returned <code>NextToken</code> value. If this parameter is not specified, up to 50 results
     *        are returned by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfacePermissionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeNetworkInterfacePermissionsRequest> getDryRunRequest() {
        Request<DescribeNetworkInterfacePermissionsRequest> request = new DescribeNetworkInterfacePermissionsRequestMarshaller().marshall(this);
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
        if (getNetworkInterfacePermissionIds() != null)
            sb.append("NetworkInterfacePermissionIds: ").append(getNetworkInterfacePermissionIds()).append(",");
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

        if (obj instanceof DescribeNetworkInterfacePermissionsRequest == false)
            return false;
        DescribeNetworkInterfacePermissionsRequest other = (DescribeNetworkInterfacePermissionsRequest) obj;
        if (other.getNetworkInterfacePermissionIds() == null ^ this.getNetworkInterfacePermissionIds() == null)
            return false;
        if (other.getNetworkInterfacePermissionIds() != null
                && other.getNetworkInterfacePermissionIds().equals(this.getNetworkInterfacePermissionIds()) == false)
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

        hashCode = prime * hashCode + ((getNetworkInterfacePermissionIds() == null) ? 0 : getNetworkInterfacePermissionIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNetworkInterfacePermissionsRequest clone() {
        return (DescribeNetworkInterfacePermissionsRequest) super.clone();
    }
}
