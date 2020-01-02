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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConformancePackStatuses"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationConformancePackStatusesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names of organization conformance packs for which you want status details. If you do not specify any names,
     * AWS Config returns details for all your organization conformance packs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> organizationConformancePackNames;
    /**
     * <p>
     * The maximum number of OrganizationConformancePackStatuses returned on each page. If you do no specify a number,
     * AWS Config uses the default. The default is 100.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of organization conformance packs for which you want status details. If you do not specify any names,
     * AWS Config returns details for all your organization conformance packs.
     * </p>
     * 
     * @return The names of organization conformance packs for which you want status details. If you do not specify any
     *         names, AWS Config returns details for all your organization conformance packs.
     */

    public java.util.List<String> getOrganizationConformancePackNames() {
        if (organizationConformancePackNames == null) {
            organizationConformancePackNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return organizationConformancePackNames;
    }

    /**
     * <p>
     * The names of organization conformance packs for which you want status details. If you do not specify any names,
     * AWS Config returns details for all your organization conformance packs.
     * </p>
     * 
     * @param organizationConformancePackNames
     *        The names of organization conformance packs for which you want status details. If you do not specify any
     *        names, AWS Config returns details for all your organization conformance packs.
     */

    public void setOrganizationConformancePackNames(java.util.Collection<String> organizationConformancePackNames) {
        if (organizationConformancePackNames == null) {
            this.organizationConformancePackNames = null;
            return;
        }

        this.organizationConformancePackNames = new com.amazonaws.internal.SdkInternalList<String>(organizationConformancePackNames);
    }

    /**
     * <p>
     * The names of organization conformance packs for which you want status details. If you do not specify any names,
     * AWS Config returns details for all your organization conformance packs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationConformancePackNames(java.util.Collection)} or
     * {@link #withOrganizationConformancePackNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param organizationConformancePackNames
     *        The names of organization conformance packs for which you want status details. If you do not specify any
     *        names, AWS Config returns details for all your organization conformance packs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConformancePackStatusesRequest withOrganizationConformancePackNames(String... organizationConformancePackNames) {
        if (this.organizationConformancePackNames == null) {
            setOrganizationConformancePackNames(new com.amazonaws.internal.SdkInternalList<String>(organizationConformancePackNames.length));
        }
        for (String ele : organizationConformancePackNames) {
            this.organizationConformancePackNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of organization conformance packs for which you want status details. If you do not specify any names,
     * AWS Config returns details for all your organization conformance packs.
     * </p>
     * 
     * @param organizationConformancePackNames
     *        The names of organization conformance packs for which you want status details. If you do not specify any
     *        names, AWS Config returns details for all your organization conformance packs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConformancePackStatusesRequest withOrganizationConformancePackNames(java.util.Collection<String> organizationConformancePackNames) {
        setOrganizationConformancePackNames(organizationConformancePackNames);
        return this;
    }

    /**
     * <p>
     * The maximum number of OrganizationConformancePackStatuses returned on each page. If you do no specify a number,
     * AWS Config uses the default. The default is 100.
     * </p>
     * 
     * @param limit
     *        The maximum number of OrganizationConformancePackStatuses returned on each page. If you do no specify a
     *        number, AWS Config uses the default. The default is 100.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of OrganizationConformancePackStatuses returned on each page. If you do no specify a number,
     * AWS Config uses the default. The default is 100.
     * </p>
     * 
     * @return The maximum number of OrganizationConformancePackStatuses returned on each page. If you do no specify a
     *         number, AWS Config uses the default. The default is 100.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of OrganizationConformancePackStatuses returned on each page. If you do no specify a number,
     * AWS Config uses the default. The default is 100.
     * </p>
     * 
     * @param limit
     *        The maximum number of OrganizationConformancePackStatuses returned on each page. If you do no specify a
     *        number, AWS Config uses the default. The default is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConformancePackStatusesRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @return The nextToken string returned on a previous page that you use to get the next page of results in a
     *         paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The nextToken string returned on a previous page that you use to get the next page of results in a paginated
     * response.
     * </p>
     * 
     * @param nextToken
     *        The nextToken string returned on a previous page that you use to get the next page of results in a
     *        paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConformancePackStatusesRequest withNextToken(String nextToken) {
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
        if (getOrganizationConformancePackNames() != null)
            sb.append("OrganizationConformancePackNames: ").append(getOrganizationConformancePackNames()).append(",");
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

        if (obj instanceof DescribeOrganizationConformancePackStatusesRequest == false)
            return false;
        DescribeOrganizationConformancePackStatusesRequest other = (DescribeOrganizationConformancePackStatusesRequest) obj;
        if (other.getOrganizationConformancePackNames() == null ^ this.getOrganizationConformancePackNames() == null)
            return false;
        if (other.getOrganizationConformancePackNames() != null
                && other.getOrganizationConformancePackNames().equals(this.getOrganizationConformancePackNames()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationConformancePackNames() == null) ? 0 : getOrganizationConformancePackNames().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationConformancePackStatusesRequest clone() {
        return (DescribeOrganizationConformancePackStatusesRequest) super.clone();
    }

}
