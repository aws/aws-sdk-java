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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConfigRuleStatuses"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationConfigRuleStatusesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names of organization config rules for which you want status details. If you do not specify any names, AWS
     * Config returns details for all your organization AWS Confg rules.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> organizationConfigRuleNames;
    /**
     * <p>
     * The maximum number of <code>OrganizationConfigRuleStatuses</code> returned on each page. If you do no specify a
     * number, AWS Config uses the default. The default is 100.
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
     * The names of organization config rules for which you want status details. If you do not specify any names, AWS
     * Config returns details for all your organization AWS Confg rules.
     * </p>
     * 
     * @return The names of organization config rules for which you want status details. If you do not specify any
     *         names, AWS Config returns details for all your organization AWS Confg rules.
     */

    public java.util.List<String> getOrganizationConfigRuleNames() {
        if (organizationConfigRuleNames == null) {
            organizationConfigRuleNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return organizationConfigRuleNames;
    }

    /**
     * <p>
     * The names of organization config rules for which you want status details. If you do not specify any names, AWS
     * Config returns details for all your organization AWS Confg rules.
     * </p>
     * 
     * @param organizationConfigRuleNames
     *        The names of organization config rules for which you want status details. If you do not specify any names,
     *        AWS Config returns details for all your organization AWS Confg rules.
     */

    public void setOrganizationConfigRuleNames(java.util.Collection<String> organizationConfigRuleNames) {
        if (organizationConfigRuleNames == null) {
            this.organizationConfigRuleNames = null;
            return;
        }

        this.organizationConfigRuleNames = new com.amazonaws.internal.SdkInternalList<String>(organizationConfigRuleNames);
    }

    /**
     * <p>
     * The names of organization config rules for which you want status details. If you do not specify any names, AWS
     * Config returns details for all your organization AWS Confg rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationConfigRuleNames(java.util.Collection)} or
     * {@link #withOrganizationConfigRuleNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param organizationConfigRuleNames
     *        The names of organization config rules for which you want status details. If you do not specify any names,
     *        AWS Config returns details for all your organization AWS Confg rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigRuleStatusesRequest withOrganizationConfigRuleNames(String... organizationConfigRuleNames) {
        if (this.organizationConfigRuleNames == null) {
            setOrganizationConfigRuleNames(new com.amazonaws.internal.SdkInternalList<String>(organizationConfigRuleNames.length));
        }
        for (String ele : organizationConfigRuleNames) {
            this.organizationConfigRuleNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of organization config rules for which you want status details. If you do not specify any names, AWS
     * Config returns details for all your organization AWS Confg rules.
     * </p>
     * 
     * @param organizationConfigRuleNames
     *        The names of organization config rules for which you want status details. If you do not specify any names,
     *        AWS Config returns details for all your organization AWS Confg rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigRuleStatusesRequest withOrganizationConfigRuleNames(java.util.Collection<String> organizationConfigRuleNames) {
        setOrganizationConfigRuleNames(organizationConfigRuleNames);
        return this;
    }

    /**
     * <p>
     * The maximum number of <code>OrganizationConfigRuleStatuses</code> returned on each page. If you do no specify a
     * number, AWS Config uses the default. The default is 100.
     * </p>
     * 
     * @param limit
     *        The maximum number of <code>OrganizationConfigRuleStatuses</code> returned on each page. If you do no
     *        specify a number, AWS Config uses the default. The default is 100.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of <code>OrganizationConfigRuleStatuses</code> returned on each page. If you do no specify a
     * number, AWS Config uses the default. The default is 100.
     * </p>
     * 
     * @return The maximum number of <code>OrganizationConfigRuleStatuses</code> returned on each page. If you do no
     *         specify a number, AWS Config uses the default. The default is 100.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of <code>OrganizationConfigRuleStatuses</code> returned on each page. If you do no specify a
     * number, AWS Config uses the default. The default is 100.
     * </p>
     * 
     * @param limit
     *        The maximum number of <code>OrganizationConfigRuleStatuses</code> returned on each page. If you do no
     *        specify a number, AWS Config uses the default. The default is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigRuleStatusesRequest withLimit(Integer limit) {
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

    public DescribeOrganizationConfigRuleStatusesRequest withNextToken(String nextToken) {
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
        if (getOrganizationConfigRuleNames() != null)
            sb.append("OrganizationConfigRuleNames: ").append(getOrganizationConfigRuleNames()).append(",");
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

        if (obj instanceof DescribeOrganizationConfigRuleStatusesRequest == false)
            return false;
        DescribeOrganizationConfigRuleStatusesRequest other = (DescribeOrganizationConfigRuleStatusesRequest) obj;
        if (other.getOrganizationConfigRuleNames() == null ^ this.getOrganizationConfigRuleNames() == null)
            return false;
        if (other.getOrganizationConfigRuleNames() != null && other.getOrganizationConfigRuleNames().equals(this.getOrganizationConfigRuleNames()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationConfigRuleNames() == null) ? 0 : getOrganizationConfigRuleNames().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationConfigRuleStatusesRequest clone() {
        return (DescribeOrganizationConfigRuleStatusesRequest) super.clone();
    }

}
