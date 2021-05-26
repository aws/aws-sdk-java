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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSecurityGroupRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about security group rules.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SecurityGroupRule> securityGroupRules;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about security group rules.
     * </p>
     * 
     * @return Information about security group rules.
     */

    public java.util.List<SecurityGroupRule> getSecurityGroupRules() {
        if (securityGroupRules == null) {
            securityGroupRules = new com.amazonaws.internal.SdkInternalList<SecurityGroupRule>();
        }
        return securityGroupRules;
    }

    /**
     * <p>
     * Information about security group rules.
     * </p>
     * 
     * @param securityGroupRules
     *        Information about security group rules.
     */

    public void setSecurityGroupRules(java.util.Collection<SecurityGroupRule> securityGroupRules) {
        if (securityGroupRules == null) {
            this.securityGroupRules = null;
            return;
        }

        this.securityGroupRules = new com.amazonaws.internal.SdkInternalList<SecurityGroupRule>(securityGroupRules);
    }

    /**
     * <p>
     * Information about security group rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupRules(java.util.Collection)} or {@link #withSecurityGroupRules(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param securityGroupRules
     *        Information about security group rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupRulesResult withSecurityGroupRules(SecurityGroupRule... securityGroupRules) {
        if (this.securityGroupRules == null) {
            setSecurityGroupRules(new com.amazonaws.internal.SdkInternalList<SecurityGroupRule>(securityGroupRules.length));
        }
        for (SecurityGroupRule ele : securityGroupRules) {
            this.securityGroupRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about security group rules.
     * </p>
     * 
     * @param securityGroupRules
     *        Information about security group rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupRulesResult withSecurityGroupRules(java.util.Collection<SecurityGroupRule> securityGroupRules) {
        setSecurityGroupRules(securityGroupRules);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecurityGroupRulesResult withNextToken(String nextToken) {
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
        if (getSecurityGroupRules() != null)
            sb.append("SecurityGroupRules: ").append(getSecurityGroupRules()).append(",");
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

        if (obj instanceof DescribeSecurityGroupRulesResult == false)
            return false;
        DescribeSecurityGroupRulesResult other = (DescribeSecurityGroupRulesResult) obj;
        if (other.getSecurityGroupRules() == null ^ this.getSecurityGroupRules() == null)
            return false;
        if (other.getSecurityGroupRules() != null && other.getSecurityGroupRules().equals(this.getSecurityGroupRules()) == false)
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

        hashCode = prime * hashCode + ((getSecurityGroupRules() == null) ? 0 : getSecurityGroupRules().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSecurityGroupRulesResult clone() {
        try {
            return (DescribeSecurityGroupRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
