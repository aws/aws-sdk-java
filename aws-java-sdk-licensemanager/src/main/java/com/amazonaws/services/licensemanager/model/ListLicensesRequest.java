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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenses" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLicensesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Names (ARNs) of the licenses.
     * </p>
     */
    private java.util.List<String> licenseArns;
    /**
     * <p>
     * Filters to scope the results. The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Beneficiary</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProductSKU</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fingerprint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of results to return in a single call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Amazon Resource Names (ARNs) of the licenses.
     * </p>
     * 
     * @return Amazon Resource Names (ARNs) of the licenses.
     */

    public java.util.List<String> getLicenseArns() {
        return licenseArns;
    }

    /**
     * <p>
     * Amazon Resource Names (ARNs) of the licenses.
     * </p>
     * 
     * @param licenseArns
     *        Amazon Resource Names (ARNs) of the licenses.
     */

    public void setLicenseArns(java.util.Collection<String> licenseArns) {
        if (licenseArns == null) {
            this.licenseArns = null;
            return;
        }

        this.licenseArns = new java.util.ArrayList<String>(licenseArns);
    }

    /**
     * <p>
     * Amazon Resource Names (ARNs) of the licenses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseArns(java.util.Collection)} or {@link #withLicenseArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param licenseArns
     *        Amazon Resource Names (ARNs) of the licenses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicensesRequest withLicenseArns(String... licenseArns) {
        if (this.licenseArns == null) {
            setLicenseArns(new java.util.ArrayList<String>(licenseArns.length));
        }
        for (String ele : licenseArns) {
            this.licenseArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Amazon Resource Names (ARNs) of the licenses.
     * </p>
     * 
     * @param licenseArns
     *        Amazon Resource Names (ARNs) of the licenses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicensesRequest withLicenseArns(java.util.Collection<String> licenseArns) {
        setLicenseArns(licenseArns);
        return this;
    }

    /**
     * <p>
     * Filters to scope the results. The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Beneficiary</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProductSKU</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fingerprint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Filters to scope the results. The following filters are supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Beneficiary</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ProductSKU</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Fingerprint</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Status</code>
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters to scope the results. The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Beneficiary</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProductSKU</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fingerprint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters to scope the results. The following filters are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Beneficiary</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProductSKU</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fingerprint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>
     *        </p>
     *        </li>
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
     * Filters to scope the results. The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Beneficiary</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProductSKU</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fingerprint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
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
     *        Filters to scope the results. The following filters are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Beneficiary</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProductSKU</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fingerprint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicensesRequest withFilters(Filter... filters) {
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
     * Filters to scope the results. The following filters are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Beneficiary</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProductSKU</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Fingerprint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters to scope the results. The following filters are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Beneficiary</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProductSKU</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Fingerprint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Status</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicensesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @return Token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicensesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return in a single call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return in a single call.
     * </p>
     * 
     * @return Maximum number of results to return in a single call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return in a single call.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return in a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicensesRequest withMaxResults(Integer maxResults) {
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
        if (getLicenseArns() != null)
            sb.append("LicenseArns: ").append(getLicenseArns()).append(",");
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

        if (obj instanceof ListLicensesRequest == false)
            return false;
        ListLicensesRequest other = (ListLicensesRequest) obj;
        if (other.getLicenseArns() == null ^ this.getLicenseArns() == null)
            return false;
        if (other.getLicenseArns() != null && other.getLicenseArns().equals(this.getLicenseArns()) == false)
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

        hashCode = prime * hashCode + ((getLicenseArns() == null) ? 0 : getLicenseArns().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListLicensesRequest clone() {
        return (ListLicensesRequest) super.clone();
    }

}
