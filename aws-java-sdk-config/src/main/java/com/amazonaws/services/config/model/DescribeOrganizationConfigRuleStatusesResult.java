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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConfigRuleStatuses"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationConfigRuleStatusesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of <code>OrganizationConfigRuleStatus</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OrganizationConfigRuleStatus> organizationConfigRuleStatuses;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>OrganizationConfigRuleStatus</code> objects.
     * </p>
     * 
     * @return A list of <code>OrganizationConfigRuleStatus</code> objects.
     */

    public java.util.List<OrganizationConfigRuleStatus> getOrganizationConfigRuleStatuses() {
        if (organizationConfigRuleStatuses == null) {
            organizationConfigRuleStatuses = new com.amazonaws.internal.SdkInternalList<OrganizationConfigRuleStatus>();
        }
        return organizationConfigRuleStatuses;
    }

    /**
     * <p>
     * A list of <code>OrganizationConfigRuleStatus</code> objects.
     * </p>
     * 
     * @param organizationConfigRuleStatuses
     *        A list of <code>OrganizationConfigRuleStatus</code> objects.
     */

    public void setOrganizationConfigRuleStatuses(java.util.Collection<OrganizationConfigRuleStatus> organizationConfigRuleStatuses) {
        if (organizationConfigRuleStatuses == null) {
            this.organizationConfigRuleStatuses = null;
            return;
        }

        this.organizationConfigRuleStatuses = new com.amazonaws.internal.SdkInternalList<OrganizationConfigRuleStatus>(organizationConfigRuleStatuses);
    }

    /**
     * <p>
     * A list of <code>OrganizationConfigRuleStatus</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationConfigRuleStatuses(java.util.Collection)} or
     * {@link #withOrganizationConfigRuleStatuses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param organizationConfigRuleStatuses
     *        A list of <code>OrganizationConfigRuleStatus</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigRuleStatusesResult withOrganizationConfigRuleStatuses(OrganizationConfigRuleStatus... organizationConfigRuleStatuses) {
        if (this.organizationConfigRuleStatuses == null) {
            setOrganizationConfigRuleStatuses(new com.amazonaws.internal.SdkInternalList<OrganizationConfigRuleStatus>(organizationConfigRuleStatuses.length));
        }
        for (OrganizationConfigRuleStatus ele : organizationConfigRuleStatuses) {
            this.organizationConfigRuleStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>OrganizationConfigRuleStatus</code> objects.
     * </p>
     * 
     * @param organizationConfigRuleStatuses
     *        A list of <code>OrganizationConfigRuleStatus</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigRuleStatusesResult withOrganizationConfigRuleStatuses(
            java.util.Collection<OrganizationConfigRuleStatus> organizationConfigRuleStatuses) {
        setOrganizationConfigRuleStatuses(organizationConfigRuleStatuses);
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

    public DescribeOrganizationConfigRuleStatusesResult withNextToken(String nextToken) {
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
        if (getOrganizationConfigRuleStatuses() != null)
            sb.append("OrganizationConfigRuleStatuses: ").append(getOrganizationConfigRuleStatuses()).append(",");
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

        if (obj instanceof DescribeOrganizationConfigRuleStatusesResult == false)
            return false;
        DescribeOrganizationConfigRuleStatusesResult other = (DescribeOrganizationConfigRuleStatusesResult) obj;
        if (other.getOrganizationConfigRuleStatuses() == null ^ this.getOrganizationConfigRuleStatuses() == null)
            return false;
        if (other.getOrganizationConfigRuleStatuses() != null
                && other.getOrganizationConfigRuleStatuses().equals(this.getOrganizationConfigRuleStatuses()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationConfigRuleStatuses() == null) ? 0 : getOrganizationConfigRuleStatuses().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationConfigRuleStatusesResult clone() {
        try {
            return (DescribeOrganizationConfigRuleStatusesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
