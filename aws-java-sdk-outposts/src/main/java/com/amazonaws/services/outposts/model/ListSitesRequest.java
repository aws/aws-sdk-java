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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListSites" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSitesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String nextToken;

    private Integer maxResults;
    /**
     * <p>
     * Filters the results by country code.
     * </p>
     */
    private java.util.List<String> operatingAddressCountryCodeFilter;
    /**
     * <p>
     * Filters the results by state or region.
     * </p>
     */
    private java.util.List<String> operatingAddressStateOrRegionFilter;
    /**
     * <p>
     * Filters the results by city.
     * </p>
     */
    private java.util.List<String> operatingAddressCityFilter;

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSitesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSitesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filters the results by country code.
     * </p>
     * 
     * @return Filters the results by country code.
     */

    public java.util.List<String> getOperatingAddressCountryCodeFilter() {
        return operatingAddressCountryCodeFilter;
    }

    /**
     * <p>
     * Filters the results by country code.
     * </p>
     * 
     * @param operatingAddressCountryCodeFilter
     *        Filters the results by country code.
     */

    public void setOperatingAddressCountryCodeFilter(java.util.Collection<String> operatingAddressCountryCodeFilter) {
        if (operatingAddressCountryCodeFilter == null) {
            this.operatingAddressCountryCodeFilter = null;
            return;
        }

        this.operatingAddressCountryCodeFilter = new java.util.ArrayList<String>(operatingAddressCountryCodeFilter);
    }

    /**
     * <p>
     * Filters the results by country code.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperatingAddressCountryCodeFilter(java.util.Collection)} or
     * {@link #withOperatingAddressCountryCodeFilter(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param operatingAddressCountryCodeFilter
     *        Filters the results by country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSitesRequest withOperatingAddressCountryCodeFilter(String... operatingAddressCountryCodeFilter) {
        if (this.operatingAddressCountryCodeFilter == null) {
            setOperatingAddressCountryCodeFilter(new java.util.ArrayList<String>(operatingAddressCountryCodeFilter.length));
        }
        for (String ele : operatingAddressCountryCodeFilter) {
            this.operatingAddressCountryCodeFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by country code.
     * </p>
     * 
     * @param operatingAddressCountryCodeFilter
     *        Filters the results by country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSitesRequest withOperatingAddressCountryCodeFilter(java.util.Collection<String> operatingAddressCountryCodeFilter) {
        setOperatingAddressCountryCodeFilter(operatingAddressCountryCodeFilter);
        return this;
    }

    /**
     * <p>
     * Filters the results by state or region.
     * </p>
     * 
     * @return Filters the results by state or region.
     */

    public java.util.List<String> getOperatingAddressStateOrRegionFilter() {
        return operatingAddressStateOrRegionFilter;
    }

    /**
     * <p>
     * Filters the results by state or region.
     * </p>
     * 
     * @param operatingAddressStateOrRegionFilter
     *        Filters the results by state or region.
     */

    public void setOperatingAddressStateOrRegionFilter(java.util.Collection<String> operatingAddressStateOrRegionFilter) {
        if (operatingAddressStateOrRegionFilter == null) {
            this.operatingAddressStateOrRegionFilter = null;
            return;
        }

        this.operatingAddressStateOrRegionFilter = new java.util.ArrayList<String>(operatingAddressStateOrRegionFilter);
    }

    /**
     * <p>
     * Filters the results by state or region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperatingAddressStateOrRegionFilter(java.util.Collection)} or
     * {@link #withOperatingAddressStateOrRegionFilter(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param operatingAddressStateOrRegionFilter
     *        Filters the results by state or region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSitesRequest withOperatingAddressStateOrRegionFilter(String... operatingAddressStateOrRegionFilter) {
        if (this.operatingAddressStateOrRegionFilter == null) {
            setOperatingAddressStateOrRegionFilter(new java.util.ArrayList<String>(operatingAddressStateOrRegionFilter.length));
        }
        for (String ele : operatingAddressStateOrRegionFilter) {
            this.operatingAddressStateOrRegionFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by state or region.
     * </p>
     * 
     * @param operatingAddressStateOrRegionFilter
     *        Filters the results by state or region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSitesRequest withOperatingAddressStateOrRegionFilter(java.util.Collection<String> operatingAddressStateOrRegionFilter) {
        setOperatingAddressStateOrRegionFilter(operatingAddressStateOrRegionFilter);
        return this;
    }

    /**
     * <p>
     * Filters the results by city.
     * </p>
     * 
     * @return Filters the results by city.
     */

    public java.util.List<String> getOperatingAddressCityFilter() {
        return operatingAddressCityFilter;
    }

    /**
     * <p>
     * Filters the results by city.
     * </p>
     * 
     * @param operatingAddressCityFilter
     *        Filters the results by city.
     */

    public void setOperatingAddressCityFilter(java.util.Collection<String> operatingAddressCityFilter) {
        if (operatingAddressCityFilter == null) {
            this.operatingAddressCityFilter = null;
            return;
        }

        this.operatingAddressCityFilter = new java.util.ArrayList<String>(operatingAddressCityFilter);
    }

    /**
     * <p>
     * Filters the results by city.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperatingAddressCityFilter(java.util.Collection)} or
     * {@link #withOperatingAddressCityFilter(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param operatingAddressCityFilter
     *        Filters the results by city.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSitesRequest withOperatingAddressCityFilter(String... operatingAddressCityFilter) {
        if (this.operatingAddressCityFilter == null) {
            setOperatingAddressCityFilter(new java.util.ArrayList<String>(operatingAddressCityFilter.length));
        }
        for (String ele : operatingAddressCityFilter) {
            this.operatingAddressCityFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by city.
     * </p>
     * 
     * @param operatingAddressCityFilter
     *        Filters the results by city.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSitesRequest withOperatingAddressCityFilter(java.util.Collection<String> operatingAddressCityFilter) {
        setOperatingAddressCityFilter(operatingAddressCityFilter);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getOperatingAddressCountryCodeFilter() != null)
            sb.append("OperatingAddressCountryCodeFilter: ").append(getOperatingAddressCountryCodeFilter()).append(",");
        if (getOperatingAddressStateOrRegionFilter() != null)
            sb.append("OperatingAddressStateOrRegionFilter: ").append(getOperatingAddressStateOrRegionFilter()).append(",");
        if (getOperatingAddressCityFilter() != null)
            sb.append("OperatingAddressCityFilter: ").append(getOperatingAddressCityFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSitesRequest == false)
            return false;
        ListSitesRequest other = (ListSitesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getOperatingAddressCountryCodeFilter() == null ^ this.getOperatingAddressCountryCodeFilter() == null)
            return false;
        if (other.getOperatingAddressCountryCodeFilter() != null
                && other.getOperatingAddressCountryCodeFilter().equals(this.getOperatingAddressCountryCodeFilter()) == false)
            return false;
        if (other.getOperatingAddressStateOrRegionFilter() == null ^ this.getOperatingAddressStateOrRegionFilter() == null)
            return false;
        if (other.getOperatingAddressStateOrRegionFilter() != null
                && other.getOperatingAddressStateOrRegionFilter().equals(this.getOperatingAddressStateOrRegionFilter()) == false)
            return false;
        if (other.getOperatingAddressCityFilter() == null ^ this.getOperatingAddressCityFilter() == null)
            return false;
        if (other.getOperatingAddressCityFilter() != null && other.getOperatingAddressCityFilter().equals(this.getOperatingAddressCityFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getOperatingAddressCountryCodeFilter() == null) ? 0 : getOperatingAddressCountryCodeFilter().hashCode());
        hashCode = prime * hashCode + ((getOperatingAddressStateOrRegionFilter() == null) ? 0 : getOperatingAddressStateOrRegionFilter().hashCode());
        hashCode = prime * hashCode + ((getOperatingAddressCityFilter() == null) ? 0 : getOperatingAddressCityFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListSitesRequest clone() {
        return (ListSitesRequest) super.clone();
    }

}
