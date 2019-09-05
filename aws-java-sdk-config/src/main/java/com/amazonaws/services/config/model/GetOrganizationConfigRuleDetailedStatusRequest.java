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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetOrganizationConfigRuleDetailedStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOrganizationConfigRuleDetailedStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of organization config rule for which you want status details for member accounts.
     * </p>
     */
    private String organizationConfigRuleName;
    /**
     * <p>
     * A <code>StatusDetailFilters</code> object.
     * </p>
     */
    private StatusDetailFilters filters;
    /**
     * <p>
     * The maximum number of <code>OrganizationConfigRuleDetailedStatus</code> returned on each page. If you do not
     * specify a number, AWS Config uses the default. The default is 100.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of organization config rule for which you want status details for member accounts.
     * </p>
     * 
     * @param organizationConfigRuleName
     *        The name of organization config rule for which you want status details for member accounts.
     */

    public void setOrganizationConfigRuleName(String organizationConfigRuleName) {
        this.organizationConfigRuleName = organizationConfigRuleName;
    }

    /**
     * <p>
     * The name of organization config rule for which you want status details for member accounts.
     * </p>
     * 
     * @return The name of organization config rule for which you want status details for member accounts.
     */

    public String getOrganizationConfigRuleName() {
        return this.organizationConfigRuleName;
    }

    /**
     * <p>
     * The name of organization config rule for which you want status details for member accounts.
     * </p>
     * 
     * @param organizationConfigRuleName
     *        The name of organization config rule for which you want status details for member accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationConfigRuleDetailedStatusRequest withOrganizationConfigRuleName(String organizationConfigRuleName) {
        setOrganizationConfigRuleName(organizationConfigRuleName);
        return this;
    }

    /**
     * <p>
     * A <code>StatusDetailFilters</code> object.
     * </p>
     * 
     * @param filters
     *        A <code>StatusDetailFilters</code> object.
     */

    public void setFilters(StatusDetailFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * A <code>StatusDetailFilters</code> object.
     * </p>
     * 
     * @return A <code>StatusDetailFilters</code> object.
     */

    public StatusDetailFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * A <code>StatusDetailFilters</code> object.
     * </p>
     * 
     * @param filters
     *        A <code>StatusDetailFilters</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationConfigRuleDetailedStatusRequest withFilters(StatusDetailFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of <code>OrganizationConfigRuleDetailedStatus</code> returned on each page. If you do not
     * specify a number, AWS Config uses the default. The default is 100.
     * </p>
     * 
     * @param limit
     *        The maximum number of <code>OrganizationConfigRuleDetailedStatus</code> returned on each page. If you do
     *        not specify a number, AWS Config uses the default. The default is 100.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of <code>OrganizationConfigRuleDetailedStatus</code> returned on each page. If you do not
     * specify a number, AWS Config uses the default. The default is 100.
     * </p>
     * 
     * @return The maximum number of <code>OrganizationConfigRuleDetailedStatus</code> returned on each page. If you do
     *         not specify a number, AWS Config uses the default. The default is 100.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of <code>OrganizationConfigRuleDetailedStatus</code> returned on each page. If you do not
     * specify a number, AWS Config uses the default. The default is 100.
     * </p>
     * 
     * @param limit
     *        The maximum number of <code>OrganizationConfigRuleDetailedStatus</code> returned on each page. If you do
     *        not specify a number, AWS Config uses the default. The default is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationConfigRuleDetailedStatusRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page that you use to get the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrganizationConfigRuleDetailedStatusRequest withNextToken(String nextToken) {
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
        if (getOrganizationConfigRuleName() != null)
            sb.append("OrganizationConfigRuleName: ").append(getOrganizationConfigRuleName()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
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

        if (obj instanceof GetOrganizationConfigRuleDetailedStatusRequest == false)
            return false;
        GetOrganizationConfigRuleDetailedStatusRequest other = (GetOrganizationConfigRuleDetailedStatusRequest) obj;
        if (other.getOrganizationConfigRuleName() == null ^ this.getOrganizationConfigRuleName() == null)
            return false;
        if (other.getOrganizationConfigRuleName() != null && other.getOrganizationConfigRuleName().equals(this.getOrganizationConfigRuleName()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationConfigRuleName() == null) ? 0 : getOrganizationConfigRuleName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetOrganizationConfigRuleDetailedStatusRequest clone() {
        return (GetOrganizationConfigRuleDetailedStatusRequest) super.clone();
    }

}
