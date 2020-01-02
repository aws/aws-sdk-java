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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DescribeOrganizationConfigRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeOrganizationConfigRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Returns a list of <code>OrganizationConfigRule</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OrganizationConfigRule> organizationConfigRules;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a list of <code>OrganizationConfigRule</code> objects.
     * </p>
     * 
     * @return Returns a list of <code>OrganizationConfigRule</code> objects.
     */

    public java.util.List<OrganizationConfigRule> getOrganizationConfigRules() {
        if (organizationConfigRules == null) {
            organizationConfigRules = new com.amazonaws.internal.SdkInternalList<OrganizationConfigRule>();
        }
        return organizationConfigRules;
    }

    /**
     * <p>
     * Returns a list of <code>OrganizationConfigRule</code> objects.
     * </p>
     * 
     * @param organizationConfigRules
     *        Returns a list of <code>OrganizationConfigRule</code> objects.
     */

    public void setOrganizationConfigRules(java.util.Collection<OrganizationConfigRule> organizationConfigRules) {
        if (organizationConfigRules == null) {
            this.organizationConfigRules = null;
            return;
        }

        this.organizationConfigRules = new com.amazonaws.internal.SdkInternalList<OrganizationConfigRule>(organizationConfigRules);
    }

    /**
     * <p>
     * Returns a list of <code>OrganizationConfigRule</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrganizationConfigRules(java.util.Collection)} or
     * {@link #withOrganizationConfigRules(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param organizationConfigRules
     *        Returns a list of <code>OrganizationConfigRule</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigRulesResult withOrganizationConfigRules(OrganizationConfigRule... organizationConfigRules) {
        if (this.organizationConfigRules == null) {
            setOrganizationConfigRules(new com.amazonaws.internal.SdkInternalList<OrganizationConfigRule>(organizationConfigRules.length));
        }
        for (OrganizationConfigRule ele : organizationConfigRules) {
            this.organizationConfigRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a list of <code>OrganizationConfigRule</code> objects.
     * </p>
     * 
     * @param organizationConfigRules
     *        Returns a list of <code>OrganizationConfigRule</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeOrganizationConfigRulesResult withOrganizationConfigRules(java.util.Collection<OrganizationConfigRule> organizationConfigRules) {
        setOrganizationConfigRules(organizationConfigRules);
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

    public DescribeOrganizationConfigRulesResult withNextToken(String nextToken) {
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
        if (getOrganizationConfigRules() != null)
            sb.append("OrganizationConfigRules: ").append(getOrganizationConfigRules()).append(",");
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

        if (obj instanceof DescribeOrganizationConfigRulesResult == false)
            return false;
        DescribeOrganizationConfigRulesResult other = (DescribeOrganizationConfigRulesResult) obj;
        if (other.getOrganizationConfigRules() == null ^ this.getOrganizationConfigRules() == null)
            return false;
        if (other.getOrganizationConfigRules() != null && other.getOrganizationConfigRules().equals(this.getOrganizationConfigRules()) == false)
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

        hashCode = prime * hashCode + ((getOrganizationConfigRules() == null) ? 0 : getOrganizationConfigRules().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeOrganizationConfigRulesResult clone() {
        try {
            return (DescribeOrganizationConfigRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
