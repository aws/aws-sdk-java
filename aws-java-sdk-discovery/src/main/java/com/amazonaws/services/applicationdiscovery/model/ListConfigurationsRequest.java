/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A valid configuration identified by the Discovery Service.
     * </p>
     */
    private String configurationType;
    /**
     * <p>
     * You can filter the list using a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * <p>
     * You can separate these items by using logical operators.
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
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A valid configuration identified by the Discovery Service.
     * </p>
     * 
     * @param configurationType
     *        A valid configuration identified by the Discovery Service.
     * @see ConfigurationItemType
     */

    public void setConfigurationType(String configurationType) {
        this.configurationType = configurationType;
    }

    /**
     * <p>
     * A valid configuration identified by the Discovery Service.
     * </p>
     * 
     * @return A valid configuration identified by the Discovery Service.
     * @see ConfigurationItemType
     */

    public String getConfigurationType() {
        return this.configurationType;
    }

    /**
     * <p>
     * A valid configuration identified by the Discovery Service.
     * </p>
     * 
     * @param configurationType
     *        A valid configuration identified by the Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationItemType
     */

    public ListConfigurationsRequest withConfigurationType(String configurationType) {
        setConfigurationType(configurationType);
        return this;
    }

    /**
     * <p>
     * A valid configuration identified by the Discovery Service.
     * </p>
     * 
     * @param configurationType
     *        A valid configuration identified by the Discovery Service.
     * @see ConfigurationItemType
     */

    public void setConfigurationType(ConfigurationItemType configurationType) {
        this.configurationType = configurationType.toString();
    }

    /**
     * <p>
     * A valid configuration identified by the Discovery Service.
     * </p>
     * 
     * @param configurationType
     *        A valid configuration identified by the Discovery Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationItemType
     */

    public ListConfigurationsRequest withConfigurationType(ConfigurationItemType configurationType) {
        setConfigurationType(configurationType);
        return this;
    }

    /**
     * <p>
     * You can filter the list using a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * <p>
     * You can separate these items by using logical operators.
     * </p>
     * 
     * @return You can filter the list using a <i>key</i>-<i>value</i> format. For example: </p>
     *         <p>
     *         <code>{"key": "serverType", "value": "webServer"}</code>
     *         </p>
     *         <p>
     *         You can separate these items by using logical operators.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * You can filter the list using a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * <p>
     * You can separate these items by using logical operators.
     * </p>
     * 
     * @param filters
     *        You can filter the list using a <i>key</i>-<i>value</i> format. For example: </p>
     *        <p>
     *        <code>{"key": "serverType", "value": "webServer"}</code>
     *        </p>
     *        <p>
     *        You can separate these items by using logical operators.
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
     * You can filter the list using a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * <p>
     * You can separate these items by using logical operators.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        You can filter the list using a <i>key</i>-<i>value</i> format. For example: </p>
     *        <p>
     *        <code>{"key": "serverType", "value": "webServer"}</code>
     *        </p>
     *        <p>
     *        You can separate these items by using logical operators.
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
     * You can filter the list using a <i>key</i>-<i>value</i> format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * <p>
     * You can separate these items by using logical operators.
     * </p>
     * 
     * @param filters
     *        You can filter the list using a <i>key</i>-<i>value</i> format. For example: </p>
     *        <p>
     *        <code>{"key": "serverType", "value": "webServer"}</code>
     *        </p>
     *        <p>
     *        You can separate these items by using logical operators.
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
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @return A token to start the list. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ConfigurationType: " + getConfigurationType() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
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
        return hashCode;
    }

    @Override
    public ListConfigurationsRequest clone() {
        return (ListConfigurationsRequest) super.clone();
    }
}
