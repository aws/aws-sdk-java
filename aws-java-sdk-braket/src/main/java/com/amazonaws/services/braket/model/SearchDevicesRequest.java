/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchDevicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The filter values to use to search for a device.
     * </p>
     */
    private java.util.List<SearchDevicesFilter> filters;
    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token used for pagination of results returned in the response. Use the token returned from the previous request
     * continue results where the previous request ended.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The filter values to use to search for a device.
     * </p>
     * 
     * @return The filter values to use to search for a device.
     */

    public java.util.List<SearchDevicesFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filter values to use to search for a device.
     * </p>
     * 
     * @param filters
     *        The filter values to use to search for a device.
     */

    public void setFilters(java.util.Collection<SearchDevicesFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<SearchDevicesFilter>(filters);
    }

    /**
     * <p>
     * The filter values to use to search for a device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filter values to use to search for a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDevicesRequest withFilters(SearchDevicesFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<SearchDevicesFilter>(filters.length));
        }
        for (SearchDevicesFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filter values to use to search for a device.
     * </p>
     * 
     * @param filters
     *        The filter values to use to search for a device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDevicesRequest withFilters(java.util.Collection<SearchDevicesFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @return The maximum number of results to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDevicesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token used for pagination of results returned in the response. Use the token returned from the previous request
     * continue results where the previous request ended.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned in the response. Use the token returned from the previous
     *        request continue results where the previous request ended.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned in the response. Use the token returned from the previous request
     * continue results where the previous request ended.
     * </p>
     * 
     * @return A token used for pagination of results returned in the response. Use the token returned from the previous
     *         request continue results where the previous request ended.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned in the response. Use the token returned from the previous request
     * continue results where the previous request ended.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned in the response. Use the token returned from the previous
     *        request continue results where the previous request ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchDevicesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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

        if (obj instanceof SearchDevicesRequest == false)
            return false;
        SearchDevicesRequest other = (SearchDevicesRequest) obj;
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchDevicesRequest clone() {
        return (SearchDevicesRequest) super.clone();
    }

}
