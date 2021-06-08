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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListSecurityPolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSecurityPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When you can get additional results from the <code>ListSecurityPolicies</code> operation, a
     * <code>NextToken</code> parameter is returned in the output. In a following command, you can pass in the
     * <code>NextToken</code> parameter to continue listing security policies.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of security policies that were listed.
     * </p>
     */
    private java.util.List<String> securityPolicyNames;

    /**
     * <p>
     * When you can get additional results from the <code>ListSecurityPolicies</code> operation, a
     * <code>NextToken</code> parameter is returned in the output. In a following command, you can pass in the
     * <code>NextToken</code> parameter to continue listing security policies.
     * </p>
     * 
     * @param nextToken
     *        When you can get additional results from the <code>ListSecurityPolicies</code> operation, a
     *        <code>NextToken</code> parameter is returned in the output. In a following command, you can pass in the
     *        <code>NextToken</code> parameter to continue listing security policies.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListSecurityPolicies</code> operation, a
     * <code>NextToken</code> parameter is returned in the output. In a following command, you can pass in the
     * <code>NextToken</code> parameter to continue listing security policies.
     * </p>
     * 
     * @return When you can get additional results from the <code>ListSecurityPolicies</code> operation, a
     *         <code>NextToken</code> parameter is returned in the output. In a following command, you can pass in the
     *         <code>NextToken</code> parameter to continue listing security policies.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListSecurityPolicies</code> operation, a
     * <code>NextToken</code> parameter is returned in the output. In a following command, you can pass in the
     * <code>NextToken</code> parameter to continue listing security policies.
     * </p>
     * 
     * @param nextToken
     *        When you can get additional results from the <code>ListSecurityPolicies</code> operation, a
     *        <code>NextToken</code> parameter is returned in the output. In a following command, you can pass in the
     *        <code>NextToken</code> parameter to continue listing security policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityPoliciesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of security policies that were listed.
     * </p>
     * 
     * @return An array of security policies that were listed.
     */

    public java.util.List<String> getSecurityPolicyNames() {
        return securityPolicyNames;
    }

    /**
     * <p>
     * An array of security policies that were listed.
     * </p>
     * 
     * @param securityPolicyNames
     *        An array of security policies that were listed.
     */

    public void setSecurityPolicyNames(java.util.Collection<String> securityPolicyNames) {
        if (securityPolicyNames == null) {
            this.securityPolicyNames = null;
            return;
        }

        this.securityPolicyNames = new java.util.ArrayList<String>(securityPolicyNames);
    }

    /**
     * <p>
     * An array of security policies that were listed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityPolicyNames(java.util.Collection)} or {@link #withSecurityPolicyNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param securityPolicyNames
     *        An array of security policies that were listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityPoliciesResult withSecurityPolicyNames(String... securityPolicyNames) {
        if (this.securityPolicyNames == null) {
            setSecurityPolicyNames(new java.util.ArrayList<String>(securityPolicyNames.length));
        }
        for (String ele : securityPolicyNames) {
            this.securityPolicyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of security policies that were listed.
     * </p>
     * 
     * @param securityPolicyNames
     *        An array of security policies that were listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSecurityPoliciesResult withSecurityPolicyNames(java.util.Collection<String> securityPolicyNames) {
        setSecurityPolicyNames(securityPolicyNames);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSecurityPolicyNames() != null)
            sb.append("SecurityPolicyNames: ").append(getSecurityPolicyNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSecurityPoliciesResult == false)
            return false;
        ListSecurityPoliciesResult other = (ListSecurityPoliciesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSecurityPolicyNames() == null ^ this.getSecurityPolicyNames() == null)
            return false;
        if (other.getSecurityPolicyNames() != null && other.getSecurityPolicyNames().equals(this.getSecurityPolicyNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSecurityPolicyNames() == null) ? 0 : getSecurityPolicyNames().hashCode());
        return hashCode;
    }

    @Override
    public ListSecurityPoliciesResult clone() {
        try {
            return (ListSecurityPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
