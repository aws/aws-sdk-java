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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ListResourceInventory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceInventoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * <code>account_id</code> - The ID of the AWS account that owns the resource. Logical operators are
     * <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application_name</code> - The name of the application. Logical operators are <code>EQUALS</code> |
     * <code>BEGINS_WITH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>license_included</code> - The type of license included. Logical operators are <code>EQUALS</code> |
     * <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     * <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform of the resource. Logical operators are <code>EQUALS</code> |
     * <code>BEGINS_WITH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource_id</code> - The ID of the resource. Logical operators are <code>EQUALS</code> |
     * <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<InventoryFilter> filters;

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

    public ListResourceInventoryRequest withMaxResults(Integer maxResults) {
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

    public ListResourceInventoryRequest withNextToken(String nextToken) {
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
     * <code>account_id</code> - The ID of the AWS account that owns the resource. Logical operators are
     * <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application_name</code> - The name of the application. Logical operators are <code>EQUALS</code> |
     * <code>BEGINS_WITH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>license_included</code> - The type of license included. Logical operators are <code>EQUALS</code> |
     * <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     * <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform of the resource. Logical operators are <code>EQUALS</code> |
     * <code>BEGINS_WITH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource_id</code> - The ID of the resource. Logical operators are <code>EQUALS</code> |
     * <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Filters to scope the results. The following filters and logical operators are supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>account_id</code> - The ID of the AWS account that owns the resource. Logical operators are
     *         <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>application_name</code> - The name of the application. Logical operators are <code>EQUALS</code> |
     *         <code>BEGINS_WITH</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>license_included</code> - The type of license included. Logical operators are <code>EQUALS</code> |
     *         <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     *         <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>platform</code> - The platform of the resource. Logical operators are <code>EQUALS</code> |
     *         <code>BEGINS_WITH</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resource_id</code> - The ID of the resource. Logical operators are <code>EQUALS</code> |
     *         <code>NOT_EQUALS</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<InventoryFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Filters to scope the results. The following filters and logical operators are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>account_id</code> - The ID of the AWS account that owns the resource. Logical operators are
     * <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application_name</code> - The name of the application. Logical operators are <code>EQUALS</code> |
     * <code>BEGINS_WITH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>license_included</code> - The type of license included. Logical operators are <code>EQUALS</code> |
     * <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     * <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform of the resource. Logical operators are <code>EQUALS</code> |
     * <code>BEGINS_WITH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource_id</code> - The ID of the resource. Logical operators are <code>EQUALS</code> |
     * <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters to scope the results. The following filters and logical operators are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>account_id</code> - The ID of the AWS account that owns the resource. Logical operators are
     *        <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>application_name</code> - The name of the application. Logical operators are <code>EQUALS</code> |
     *        <code>BEGINS_WITH</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>license_included</code> - The type of license included. Logical operators are <code>EQUALS</code> |
     *        <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     *        <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform</code> - The platform of the resource. Logical operators are <code>EQUALS</code> |
     *        <code>BEGINS_WITH</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resource_id</code> - The ID of the resource. Logical operators are <code>EQUALS</code> |
     *        <code>NOT_EQUALS</code>.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<InventoryFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<InventoryFilter>(filters);
    }

    /**
     * <p>
     * Filters to scope the results. The following filters and logical operators are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>account_id</code> - The ID of the AWS account that owns the resource. Logical operators are
     * <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application_name</code> - The name of the application. Logical operators are <code>EQUALS</code> |
     * <code>BEGINS_WITH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>license_included</code> - The type of license included. Logical operators are <code>EQUALS</code> |
     * <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     * <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform of the resource. Logical operators are <code>EQUALS</code> |
     * <code>BEGINS_WITH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource_id</code> - The ID of the resource. Logical operators are <code>EQUALS</code> |
     * <code>NOT_EQUALS</code>.
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
     *        <code>account_id</code> - The ID of the AWS account that owns the resource. Logical operators are
     *        <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>application_name</code> - The name of the application. Logical operators are <code>EQUALS</code> |
     *        <code>BEGINS_WITH</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>license_included</code> - The type of license included. Logical operators are <code>EQUALS</code> |
     *        <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     *        <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform</code> - The platform of the resource. Logical operators are <code>EQUALS</code> |
     *        <code>BEGINS_WITH</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resource_id</code> - The ID of the resource. Logical operators are <code>EQUALS</code> |
     *        <code>NOT_EQUALS</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceInventoryRequest withFilters(InventoryFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<InventoryFilter>(filters.length));
        }
        for (InventoryFilter ele : filters) {
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
     * <code>account_id</code> - The ID of the AWS account that owns the resource. Logical operators are
     * <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>application_name</code> - The name of the application. Logical operators are <code>EQUALS</code> |
     * <code>BEGINS_WITH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>license_included</code> - The type of license included. Logical operators are <code>EQUALS</code> |
     * <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     * <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>platform</code> - The platform of the resource. Logical operators are <code>EQUALS</code> |
     * <code>BEGINS_WITH</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource_id</code> - The ID of the resource. Logical operators are <code>EQUALS</code> |
     * <code>NOT_EQUALS</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        Filters to scope the results. The following filters and logical operators are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>account_id</code> - The ID of the AWS account that owns the resource. Logical operators are
     *        <code>EQUALS</code> | <code>NOT_EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>application_name</code> - The name of the application. Logical operators are <code>EQUALS</code> |
     *        <code>BEGINS_WITH</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>license_included</code> - The type of license included. Logical operators are <code>EQUALS</code> |
     *        <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     *        <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>platform</code> - The platform of the resource. Logical operators are <code>EQUALS</code> |
     *        <code>BEGINS_WITH</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resource_id</code> - The ID of the resource. Logical operators are <code>EQUALS</code> |
     *        <code>NOT_EQUALS</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceInventoryRequest withFilters(java.util.Collection<InventoryFilter> filters) {
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

        if (obj instanceof ListResourceInventoryRequest == false)
            return false;
        ListResourceInventoryRequest other = (ListResourceInventoryRequest) obj;
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

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceInventoryRequest clone() {
        return (ListResourceInventoryRequest) super.clone();
    }

}
