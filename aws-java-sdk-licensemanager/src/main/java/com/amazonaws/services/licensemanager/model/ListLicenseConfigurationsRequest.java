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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListLicenseConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLicenseConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Names (ARN) of the license configurations.
     * </p>
     */
    private java.util.List<String> licenseConfigurationArns;
    /**
     * <p>
     * Maximum number of results to return in a single call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Filters to scope the results. The following filters and logical operators are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>licenseCountingType</code> - The dimension on which licenses are counted (vCPU). Logical operators are
     * <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>enforceLicenseCount</code> - A Boolean value that indicates whether hard license enforcement is used.
     * Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usagelimitExceeded</code> - A Boolean value that indicates whether the available licenses have been
     * exceeded. Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * Amazon Resource Names (ARN) of the license configurations.
     * </p>
     * 
     * @return Amazon Resource Names (ARN) of the license configurations.
     */

    public java.util.List<String> getLicenseConfigurationArns() {
        return licenseConfigurationArns;
    }

    /**
     * <p>
     * Amazon Resource Names (ARN) of the license configurations.
     * </p>
     * 
     * @param licenseConfigurationArns
     *        Amazon Resource Names (ARN) of the license configurations.
     */

    public void setLicenseConfigurationArns(java.util.Collection<String> licenseConfigurationArns) {
        if (licenseConfigurationArns == null) {
            this.licenseConfigurationArns = null;
            return;
        }

        this.licenseConfigurationArns = new java.util.ArrayList<String>(licenseConfigurationArns);
    }

    /**
     * <p>
     * Amazon Resource Names (ARN) of the license configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLicenseConfigurationArns(java.util.Collection)} or
     * {@link #withLicenseConfigurationArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param licenseConfigurationArns
     *        Amazon Resource Names (ARN) of the license configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseConfigurationsRequest withLicenseConfigurationArns(String... licenseConfigurationArns) {
        if (this.licenseConfigurationArns == null) {
            setLicenseConfigurationArns(new java.util.ArrayList<String>(licenseConfigurationArns.length));
        }
        for (String ele : licenseConfigurationArns) {
            this.licenseConfigurationArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Amazon Resource Names (ARN) of the license configurations.
     * </p>
     * 
     * @param licenseConfigurationArns
     *        Amazon Resource Names (ARN) of the license configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseConfigurationsRequest withLicenseConfigurationArns(java.util.Collection<String> licenseConfigurationArns) {
        setLicenseConfigurationArns(licenseConfigurationArns);
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

    public ListLicenseConfigurationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public ListLicenseConfigurationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Filters to scope the results. The following filters and logical operators are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>licenseCountingType</code> - The dimension on which licenses are counted (vCPU). Logical operators are
     * <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>enforceLicenseCount</code> - A Boolean value that indicates whether hard license enforcement is used.
     * Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usagelimitExceeded</code> - A Boolean value that indicates whether the available licenses have been
     * exceeded. Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Filters to scope the results. The following filters and logical operators are supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>licenseCountingType</code> - The dimension on which licenses are counted (vCPU). Logical operators
     *         are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>enforceLicenseCount</code> - A Boolean value that indicates whether hard license enforcement is
     *         used. Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>usagelimitExceeded</code> - A Boolean value that indicates whether the available licenses have been
     *         exceeded. Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters to scope the results. The following filters and logical operators are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>licenseCountingType</code> - The dimension on which licenses are counted (vCPU). Logical operators are
     * <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>enforceLicenseCount</code> - A Boolean value that indicates whether hard license enforcement is used.
     * Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usagelimitExceeded</code> - A Boolean value that indicates whether the available licenses have been
     * exceeded. Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters to scope the results. The following filters and logical operators are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>licenseCountingType</code> - The dimension on which licenses are counted (vCPU). Logical operators
     *        are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>enforceLicenseCount</code> - A Boolean value that indicates whether hard license enforcement is
     *        used. Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>usagelimitExceeded</code> - A Boolean value that indicates whether the available licenses have been
     *        exceeded. Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
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
     * Filters to scope the results. The following filters and logical operators are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>licenseCountingType</code> - The dimension on which licenses are counted (vCPU). Logical operators are
     * <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>enforceLicenseCount</code> - A Boolean value that indicates whether hard license enforcement is used.
     * Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usagelimitExceeded</code> - A Boolean value that indicates whether the available licenses have been
     * exceeded. Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
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
     *        Filters to scope the results. The following filters and logical operators are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>licenseCountingType</code> - The dimension on which licenses are counted (vCPU). Logical operators
     *        are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>enforceLicenseCount</code> - A Boolean value that indicates whether hard license enforcement is
     *        used. Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>usagelimitExceeded</code> - A Boolean value that indicates whether the available licenses have been
     *        exceeded. Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseConfigurationsRequest withFilters(Filter... filters) {
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
     * Filters to scope the results. The following filters and logical operators are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>licenseCountingType</code> - The dimension on which licenses are counted (vCPU). Logical operators are
     * <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>enforceLicenseCount</code> - A Boolean value that indicates whether hard license enforcement is used.
     * Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>usagelimitExceeded</code> - A Boolean value that indicates whether the available licenses have been
     * exceeded. Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters to scope the results. The following filters and logical operators are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>licenseCountingType</code> - The dimension on which licenses are counted (vCPU). Logical operators
     *        are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>enforceLicenseCount</code> - A Boolean value that indicates whether hard license enforcement is
     *        used. Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>usagelimitExceeded</code> - A Boolean value that indicates whether the available licenses have been
     *        exceeded. Logical operators are <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLicenseConfigurationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
        if (getLicenseConfigurationArns() != null)
            sb.append("LicenseConfigurationArns: ").append(getLicenseConfigurationArns()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLicenseConfigurationsRequest == false)
            return false;
        ListLicenseConfigurationsRequest other = (ListLicenseConfigurationsRequest) obj;
        if (other.getLicenseConfigurationArns() == null ^ this.getLicenseConfigurationArns() == null)
            return false;
        if (other.getLicenseConfigurationArns() != null && other.getLicenseConfigurationArns().equals(this.getLicenseConfigurationArns()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseConfigurationArns() == null) ? 0 : getLicenseConfigurationArns().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListLicenseConfigurationsRequest clone() {
        return (ListLicenseConfigurationsRequest) super.clone();
    }

}
