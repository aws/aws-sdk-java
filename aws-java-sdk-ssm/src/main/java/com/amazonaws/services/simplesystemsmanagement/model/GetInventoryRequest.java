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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetInventory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInventoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of results.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InventoryFilter> filters;
    /**
     * <p>
     * Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an
     * expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of how many
     * Windows and Linux instances exist in your inventoried fleet.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InventoryAggregator> aggregators;
    /**
     * <p>
     * The list of inventory item types to return.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResultAttribute> resultAttributes;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of results.
     * </p>
     * 
     * @return One or more filters. Use a filter to return a more specific list of results.
     */

    public java.util.List<InventoryFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<InventoryFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of results.
     * </p>
     * 
     * @param filters
     *        One or more filters. Use a filter to return a more specific list of results.
     */

    public void setFilters(java.util.Collection<InventoryFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<InventoryFilter>(filters);
    }

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters. Use a filter to return a more specific list of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventoryRequest withFilters(InventoryFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<InventoryFilter>(filters.length));
        }
        for (InventoryFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of results.
     * </p>
     * 
     * @param filters
     *        One or more filters. Use a filter to return a more specific list of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventoryRequest withFilters(java.util.Collection<InventoryFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an
     * expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of how many
     * Windows and Linux instances exist in your inventoried fleet.
     * </p>
     * 
     * @return Returns counts of inventory types based on one or more expressions. For example, if you aggregate by
     *         using an expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a
     *         count of how many Windows and Linux instances exist in your inventoried fleet.
     */

    public java.util.List<InventoryAggregator> getAggregators() {
        if (aggregators == null) {
            aggregators = new com.amazonaws.internal.SdkInternalList<InventoryAggregator>();
        }
        return aggregators;
    }

    /**
     * <p>
     * Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an
     * expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of how many
     * Windows and Linux instances exist in your inventoried fleet.
     * </p>
     * 
     * @param aggregators
     *        Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using
     *        an expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of
     *        how many Windows and Linux instances exist in your inventoried fleet.
     */

    public void setAggregators(java.util.Collection<InventoryAggregator> aggregators) {
        if (aggregators == null) {
            this.aggregators = null;
            return;
        }

        this.aggregators = new com.amazonaws.internal.SdkInternalList<InventoryAggregator>(aggregators);
    }

    /**
     * <p>
     * Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an
     * expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of how many
     * Windows and Linux instances exist in your inventoried fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregators(java.util.Collection)} or {@link #withAggregators(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param aggregators
     *        Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using
     *        an expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of
     *        how many Windows and Linux instances exist in your inventoried fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventoryRequest withAggregators(InventoryAggregator... aggregators) {
        if (this.aggregators == null) {
            setAggregators(new com.amazonaws.internal.SdkInternalList<InventoryAggregator>(aggregators.length));
        }
        for (InventoryAggregator ele : aggregators) {
            this.aggregators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using an
     * expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of how many
     * Windows and Linux instances exist in your inventoried fleet.
     * </p>
     * 
     * @param aggregators
     *        Returns counts of inventory types based on one or more expressions. For example, if you aggregate by using
     *        an expression that uses the <code>AWS:InstanceInformation.PlatformType</code> type, you can see a count of
     *        how many Windows and Linux instances exist in your inventoried fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventoryRequest withAggregators(java.util.Collection<InventoryAggregator> aggregators) {
        setAggregators(aggregators);
        return this;
    }

    /**
     * <p>
     * The list of inventory item types to return.
     * </p>
     * 
     * @return The list of inventory item types to return.
     */

    public java.util.List<ResultAttribute> getResultAttributes() {
        if (resultAttributes == null) {
            resultAttributes = new com.amazonaws.internal.SdkInternalList<ResultAttribute>();
        }
        return resultAttributes;
    }

    /**
     * <p>
     * The list of inventory item types to return.
     * </p>
     * 
     * @param resultAttributes
     *        The list of inventory item types to return.
     */

    public void setResultAttributes(java.util.Collection<ResultAttribute> resultAttributes) {
        if (resultAttributes == null) {
            this.resultAttributes = null;
            return;
        }

        this.resultAttributes = new com.amazonaws.internal.SdkInternalList<ResultAttribute>(resultAttributes);
    }

    /**
     * <p>
     * The list of inventory item types to return.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultAttributes(java.util.Collection)} or {@link #withResultAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resultAttributes
     *        The list of inventory item types to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventoryRequest withResultAttributes(ResultAttribute... resultAttributes) {
        if (this.resultAttributes == null) {
            setResultAttributes(new com.amazonaws.internal.SdkInternalList<ResultAttribute>(resultAttributes.length));
        }
        for (ResultAttribute ele : resultAttributes) {
            this.resultAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of inventory item types to return.
     * </p>
     * 
     * @param resultAttributes
     *        The list of inventory item types to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventoryRequest withResultAttributes(java.util.Collection<ResultAttribute> resultAttributes) {
        setResultAttributes(resultAttributes);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventoryRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInventoryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getAggregators() != null)
            sb.append("Aggregators: ").append(getAggregators()).append(",");
        if (getResultAttributes() != null)
            sb.append("ResultAttributes: ").append(getResultAttributes()).append(",");
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

        if (obj instanceof GetInventoryRequest == false)
            return false;
        GetInventoryRequest other = (GetInventoryRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getAggregators() == null ^ this.getAggregators() == null)
            return false;
        if (other.getAggregators() != null && other.getAggregators().equals(this.getAggregators()) == false)
            return false;
        if (other.getResultAttributes() == null ^ this.getResultAttributes() == null)
            return false;
        if (other.getResultAttributes() != null && other.getResultAttributes().equals(this.getResultAttributes()) == false)
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getAggregators() == null) ? 0 : getAggregators().hashCode());
        hashCode = prime * hashCode + ((getResultAttributes() == null) ? 0 : getResultAttributes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetInventoryRequest clone() {
        return (GetInventoryRequest) super.clone();
    }

}
