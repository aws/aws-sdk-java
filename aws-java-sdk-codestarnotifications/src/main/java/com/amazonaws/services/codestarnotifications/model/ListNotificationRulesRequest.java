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
package com.amazonaws.services.codestarnotifications.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/ListNotificationRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNotificationRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The filters to use to return information by service or resource type. For valid values, see
     * <a>ListNotificationRulesFilter</a>.
     * </p>
     * <note>
     * <p>
     * A filter with the same name can appear more than once when used with OR statements. Filters with different names
     * should be applied with AND statements.
     * </p>
     * </note>
     */
    private java.util.List<ListNotificationRulesFilter> filters;
    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The maximum number of results that can be
     * returned is 100.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The filters to use to return information by service or resource type. For valid values, see
     * <a>ListNotificationRulesFilter</a>.
     * </p>
     * <note>
     * <p>
     * A filter with the same name can appear more than once when used with OR statements. Filters with different names
     * should be applied with AND statements.
     * </p>
     * </note>
     * 
     * @return The filters to use to return information by service or resource type. For valid values, see
     *         <a>ListNotificationRulesFilter</a>.</p> <note>
     *         <p>
     *         A filter with the same name can appear more than once when used with OR statements. Filters with
     *         different names should be applied with AND statements.
     *         </p>
     */

    public java.util.List<ListNotificationRulesFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters to use to return information by service or resource type. For valid values, see
     * <a>ListNotificationRulesFilter</a>.
     * </p>
     * <note>
     * <p>
     * A filter with the same name can appear more than once when used with OR statements. Filters with different names
     * should be applied with AND statements.
     * </p>
     * </note>
     * 
     * @param filters
     *        The filters to use to return information by service or resource type. For valid values, see
     *        <a>ListNotificationRulesFilter</a>.</p> <note>
     *        <p>
     *        A filter with the same name can appear more than once when used with OR statements. Filters with different
     *        names should be applied with AND statements.
     *        </p>
     */

    public void setFilters(java.util.Collection<ListNotificationRulesFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ListNotificationRulesFilter>(filters);
    }

    /**
     * <p>
     * The filters to use to return information by service or resource type. For valid values, see
     * <a>ListNotificationRulesFilter</a>.
     * </p>
     * <note>
     * <p>
     * A filter with the same name can appear more than once when used with OR statements. Filters with different names
     * should be applied with AND statements.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters to use to return information by service or resource type. For valid values, see
     *        <a>ListNotificationRulesFilter</a>.</p> <note>
     *        <p>
     *        A filter with the same name can appear more than once when used with OR statements. Filters with different
     *        names should be applied with AND statements.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationRulesRequest withFilters(ListNotificationRulesFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ListNotificationRulesFilter>(filters.length));
        }
        for (ListNotificationRulesFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters to use to return information by service or resource type. For valid values, see
     * <a>ListNotificationRulesFilter</a>.
     * </p>
     * <note>
     * <p>
     * A filter with the same name can appear more than once when used with OR statements. Filters with different names
     * should be applied with AND statements.
     * </p>
     * </note>
     * 
     * @param filters
     *        The filters to use to return information by service or resource type. For valid values, see
     *        <a>ListNotificationRulesFilter</a>.</p> <note>
     *        <p>
     *        A filter with the same name can appear more than once when used with OR statements. Filters with different
     *        names should be applied with AND statements.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationRulesRequest withFilters(java.util.Collection<ListNotificationRulesFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that, when provided in a request, returns the next batch of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that, when provided in a request, returns the next batch of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that, when provided in a request, returns the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationRulesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The maximum number of results that can be
     * returned is 100.
     * </p>
     * 
     * @param maxResults
     *        A non-negative integer used to limit the number of returned results. The maximum number of results that
     *        can be returned is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The maximum number of results that can be
     * returned is 100.
     * </p>
     * 
     * @return A non-negative integer used to limit the number of returned results. The maximum number of results that
     *         can be returned is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * A non-negative integer used to limit the number of returned results. The maximum number of results that can be
     * returned is 100.
     * </p>
     * 
     * @param maxResults
     *        A non-negative integer used to limit the number of returned results. The maximum number of results that
     *        can be returned is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotificationRulesRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListNotificationRulesRequest == false)
            return false;
        ListNotificationRulesRequest other = (ListNotificationRulesRequest) obj;
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListNotificationRulesRequest clone() {
        return (ListNotificationRulesRequest) super.clone();
    }

}
