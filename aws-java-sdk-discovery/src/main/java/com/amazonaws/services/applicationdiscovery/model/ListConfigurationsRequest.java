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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A valid configuration identified by Application Discovery Service.
     * </p>
     */
    private String configurationType;
    /**
     * <p>
     * You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * <p>
     * For a complete list of filter options and guidance about using them with this action, see <a href=
     * "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     * >Querying Discovered Configuration Items</a>.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The total number of items to return. The maximum value is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Token to retrieve the next set of results. For example, if a previous call to ListConfigurations returned 100
     * items, but you set <code>ListConfigurationsRequest$maxResults</code> to 10, you received a set of 10 results
     * along with a token. Use that token in this query to get the next set of 10.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Certain filter criteria return output that can be sorted in ascending or descending order. For a list of output
     * characteristics for each filter, see <a href=
     * "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     * >Using the ListConfigurations Action</a>.
     * </p>
     */
    private java.util.List<OrderByElement> orderBy;

    /**
     * <p>
     * A valid configuration identified by Application Discovery Service.
     * </p>
     * 
     * @param configurationType
     *        A valid configuration identified by Application Discovery Service.
     * @see ConfigurationItemType
     */

    public void setConfigurationType(String configurationType) {
        this.configurationType = configurationType;
    }

    /**
     * <p>
     * A valid configuration identified by Application Discovery Service.
     * </p>
     * 
     * @return A valid configuration identified by Application Discovery Service.
     * @see ConfigurationItemType
     */

    public String getConfigurationType() {
        return this.configurationType;
    }

    /**
     * <p>
     * A valid configuration identified by Application Discovery Service.
     * </p>
     * 
     * @param configurationType
     *        A valid configuration identified by Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationItemType
     */

    public ListConfigurationsRequest withConfigurationType(String configurationType) {
        setConfigurationType(configurationType);
        return this;
    }

    /**
     * <p>
     * A valid configuration identified by Application Discovery Service.
     * </p>
     * 
     * @param configurationType
     *        A valid configuration identified by Application Discovery Service.
     * @see ConfigurationItemType
     */

    public void setConfigurationType(ConfigurationItemType configurationType) {
        withConfigurationType(configurationType);
    }

    /**
     * <p>
     * A valid configuration identified by Application Discovery Service.
     * </p>
     * 
     * @param configurationType
     *        A valid configuration identified by Application Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationItemType
     */

    public ListConfigurationsRequest withConfigurationType(ConfigurationItemType configurationType) {
        this.configurationType = configurationType.toString();
        return this;
    }

    /**
     * <p>
     * You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * <p>
     * For a complete list of filter options and guidance about using them with this action, see <a href=
     * "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     * >Querying Discovered Configuration Items</a>.
     * </p>
     * 
     * @return You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For
     *         example: </p>
     *         <p>
     *         <code>{"key": "serverType", "value": "webServer"}</code>
     *         </p>
     *         <p>
     *         For a complete list of filter options and guidance about using them with this action, see <a href=
     *         "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     *         >Querying Discovered Configuration Items</a>.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * <p>
     * For a complete list of filter options and guidance about using them with this action, see <a href=
     * "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     * >Querying Discovered Configuration Items</a>.
     * </p>
     * 
     * @param filters
     *        You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For
     *        example: </p>
     *        <p>
     *        <code>{"key": "serverType", "value": "webServer"}</code>
     *        </p>
     *        <p>
     *        For a complete list of filter options and guidance about using them with this action, see <a href=
     *        "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     *        >Querying Discovered Configuration Items</a>.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * <p>
     * For a complete list of filter options and guidance about using them with this action, see <a href=
     * "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     * >Querying Discovered Configuration Items</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For
     *        example: </p>
     *        <p>
     *        <code>{"key": "serverType", "value": "webServer"}</code>
     *        </p>
     *        <p>
     *        For a complete list of filter options and guidance about using them with this action, see <a href=
     *        "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     *        >Querying Discovered Configuration Items</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * <p>
     * For a complete list of filter options and guidance about using them with this action, see <a href=
     * "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     * >Querying Discovered Configuration Items</a>.
     * </p>
     * 
     * @param filters
     *        You can filter the request using various logical operators and a <i>key</i>-<i>value</i> format. For
     *        example: </p>
     *        <p>
     *        <code>{"key": "serverType", "value": "webServer"}</code>
     *        </p>
     *        <p>
     *        For a complete list of filter options and guidance about using them with this action, see <a href=
     *        "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     *        >Querying Discovered Configuration Items</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The total number of items to return. The maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return. The maximum value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of items to return. The maximum value is 100.
     * </p>
     * 
     * @return The total number of items to return. The maximum value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of items to return. The maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return. The maximum value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if a previous call to ListConfigurations returned 100
     * items, but you set <code>ListConfigurationsRequest$maxResults</code> to 10, you received a set of 10 results
     * along with a token. Use that token in this query to get the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        Token to retrieve the next set of results. For example, if a previous call to ListConfigurations returned
     *        100 items, but you set <code>ListConfigurationsRequest$maxResults</code> to 10, you received a set of 10
     *        results along with a token. Use that token in this query to get the next set of 10.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if a previous call to ListConfigurations returned 100
     * items, but you set <code>ListConfigurationsRequest$maxResults</code> to 10, you received a set of 10 results
     * along with a token. Use that token in this query to get the next set of 10.
     * </p>
     * 
     * @return Token to retrieve the next set of results. For example, if a previous call to ListConfigurations returned
     *         100 items, but you set <code>ListConfigurationsRequest$maxResults</code> to 10, you received a set of 10
     *         results along with a token. Use that token in this query to get the next set of 10.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token to retrieve the next set of results. For example, if a previous call to ListConfigurations returned 100
     * items, but you set <code>ListConfigurationsRequest$maxResults</code> to 10, you received a set of 10 results
     * along with a token. Use that token in this query to get the next set of 10.
     * </p>
     * 
     * @param nextToken
     *        Token to retrieve the next set of results. For example, if a previous call to ListConfigurations returned
     *        100 items, but you set <code>ListConfigurationsRequest$maxResults</code> to 10, you received a set of 10
     *        results along with a token. Use that token in this query to get the next set of 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Certain filter criteria return output that can be sorted in ascending or descending order. For a list of output
     * characteristics for each filter, see <a href=
     * "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     * >Using the ListConfigurations Action</a>.
     * </p>
     * 
     * @return Certain filter criteria return output that can be sorted in ascending or descending order. For a list of
     *         output characteristics for each filter, see <a href=
     *         "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     *         >Using the ListConfigurations Action</a>.
     */

    public java.util.List<OrderByElement> getOrderBy() {
        return orderBy;
    }

    /**
     * <p>
     * Certain filter criteria return output that can be sorted in ascending or descending order. For a list of output
     * characteristics for each filter, see <a href=
     * "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     * >Using the ListConfigurations Action</a>.
     * </p>
     * 
     * @param orderBy
     *        Certain filter criteria return output that can be sorted in ascending or descending order. For a list of
     *        output characteristics for each filter, see <a href=
     *        "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     *        >Using the ListConfigurations Action</a>.
     */

    public void setOrderBy(java.util.Collection<OrderByElement> orderBy) {
        if (orderBy == null) {
            this.orderBy = null;
            return;
        }

        this.orderBy = new java.util.ArrayList<OrderByElement>(orderBy);
    }

    /**
     * <p>
     * Certain filter criteria return output that can be sorted in ascending or descending order. For a list of output
     * characteristics for each filter, see <a href=
     * "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     * >Using the ListConfigurations Action</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrderBy(java.util.Collection)} or {@link #withOrderBy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param orderBy
     *        Certain filter criteria return output that can be sorted in ascending or descending order. For a list of
     *        output characteristics for each filter, see <a href=
     *        "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     *        >Using the ListConfigurations Action</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationsRequest withOrderBy(OrderByElement... orderBy) {
        if (this.orderBy == null) {
            setOrderBy(new java.util.ArrayList<OrderByElement>(orderBy.length));
        }
        for (OrderByElement ele : orderBy) {
            this.orderBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Certain filter criteria return output that can be sorted in ascending or descending order. For a list of output
     * characteristics for each filter, see <a href=
     * "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     * >Using the ListConfigurations Action</a>.
     * </p>
     * 
     * @param orderBy
     *        Certain filter criteria return output that can be sorted in ascending or descending order. For a list of
     *        output characteristics for each filter, see <a href=
     *        "http://docs.aws.amazon.com/application-discovery/latest/APIReference/discovery-api-queries.html#ListConfigurations"
     *        >Using the ListConfigurations Action</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationsRequest withOrderBy(java.util.Collection<OrderByElement> orderBy) {
        setOrderBy(orderBy);
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
        if (getConfigurationType() != null)
            sb.append("ConfigurationType: ").append(getConfigurationType()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOrderBy() != null)
            sb.append("OrderBy: ").append(getOrderBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConfigurationsRequest == false)
            return false;
        ListConfigurationsRequest other = (ListConfigurationsRequest) obj;
        if (other.getConfigurationType() == null ^ this.getConfigurationType() == null)
            return false;
        if (other.getConfigurationType() != null && other.getConfigurationType().equals(this.getConfigurationType()) == false)
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
        if (other.getOrderBy() == null ^ this.getOrderBy() == null)
            return false;
        if (other.getOrderBy() != null && other.getOrderBy().equals(this.getOrderBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationType() == null) ? 0 : getConfigurationType().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOrderBy() == null) ? 0 : getOrderBy().hashCode());
        return hashCode;
    }

    @Override
    public ListConfigurationsRequest clone() {
        return (ListConfigurationsRequest) super.clone();
    }

}
