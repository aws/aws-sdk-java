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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ListNetworkResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNetworkResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORDER</code> - The Amazon Resource Name (ARN) of the order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATUS</code> - The status (<code>AVAILABLE</code> | <code>DELETED</code> | <code>DELETING</code> |
     * <code>PENDING</code> | <code>PENDING_RETURN</code> | <code>PROVISIONING</code> | <code>SHIPPED</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> filters;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     */
    private String networkArn;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String startToken;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORDER</code> - The Amazon Resource Name (ARN) of the order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATUS</code> - The status (<code>AVAILABLE</code> | <code>DELETED</code> | <code>DELETING</code> |
     * <code>PENDING</code> | <code>PENDING_RETURN</code> | <code>PROVISIONING</code> | <code>SHIPPED</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ORDER</code> - The Amazon Resource Name (ARN) of the order.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STATUS</code> - The status (<code>AVAILABLE</code> | <code>DELETED</code> | <code>DELETING</code> |
     *         <code>PENDING</code> | <code>PENDING_RETURN</code> | <code>PROVISIONING</code> | <code>SHIPPED</code>).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *         an <code>OR</code>, and the request returns all results that match any of the specified values.
     */

    public java.util.Map<String, java.util.List<String>> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORDER</code> - The Amazon Resource Name (ARN) of the order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATUS</code> - The status (<code>AVAILABLE</code> | <code>DELETED</code> | <code>DELETING</code> |
     * <code>PENDING</code> | <code>PENDING_RETURN</code> | <code>PROVISIONING</code> | <code>SHIPPED</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ORDER</code> - The Amazon Resource Name (ARN) of the order.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STATUS</code> - The status (<code>AVAILABLE</code> | <code>DELETED</code> | <code>DELETING</code> |
     *        <code>PENDING</code> | <code>PENDING_RETURN</code> | <code>PROVISIONING</code> | <code>SHIPPED</code>).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *        an <code>OR</code>, and the request returns all results that match any of the specified values.
     */

    public void setFilters(java.util.Map<String, java.util.List<String>> filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ORDER</code> - The Amazon Resource Name (ARN) of the order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATUS</code> - The status (<code>AVAILABLE</code> | <code>DELETED</code> | <code>DELETING</code> |
     * <code>PENDING</code> | <code>PENDING_RETURN</code> | <code>PROVISIONING</code> | <code>SHIPPED</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an
     * <code>OR</code>, and the request returns all results that match any of the specified values.
     * </p>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ORDER</code> - The Amazon Resource Name (ARN) of the order.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STATUS</code> - The status (<code>AVAILABLE</code> | <code>DELETED</code> | <code>DELETING</code> |
     *        <code>PENDING</code> | <code>PENDING_RETURN</code> | <code>PROVISIONING</code> | <code>SHIPPED</code>).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with
     *        an <code>OR</code>, and the request returns all results that match any of the specified values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkResourcesRequest withFilters(java.util.Map<String, java.util.List<String>> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * Add a single Filters entry
     *
     * @see ListNetworkResourcesRequest#withFilters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkResourcesRequest addFiltersEntry(String key, java.util.List<String> value) {
        if (null == this.filters) {
            this.filters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.filters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkResourcesRequest clearFiltersEntries() {
        this.filters = null;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkResourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network.
     */

    public void setNetworkArn(String networkArn) {
        this.networkArn = networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network.
     */

    public String getNetworkArn() {
        return this.networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkResourcesRequest withNetworkArn(String networkArn) {
        setNetworkArn(networkArn);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param startToken
     *        The token for the next page of results.
     */

    public void setStartToken(String startToken) {
        this.startToken = startToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getStartToken() {
        return this.startToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param startToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkResourcesRequest withStartToken(String startToken) {
        setStartToken(startToken);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNetworkArn() != null)
            sb.append("NetworkArn: ").append(getNetworkArn()).append(",");
        if (getStartToken() != null)
            sb.append("StartToken: ").append(getStartToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNetworkResourcesRequest == false)
            return false;
        ListNetworkResourcesRequest other = (ListNetworkResourcesRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNetworkArn() == null ^ this.getNetworkArn() == null)
            return false;
        if (other.getNetworkArn() != null && other.getNetworkArn().equals(this.getNetworkArn()) == false)
            return false;
        if (other.getStartToken() == null ^ this.getStartToken() == null)
            return false;
        if (other.getStartToken() != null && other.getStartToken().equals(this.getStartToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNetworkArn() == null) ? 0 : getNetworkArn().hashCode());
        hashCode = prime * hashCode + ((getStartToken() == null) ? 0 : getStartToken().hashCode());
        return hashCode;
    }

    @Override
    public ListNetworkResourcesRequest clone() {
        return (ListNetworkResourcesRequest) super.clone();
    }

}
