/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetResourcePolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourcePoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of the <code>Policy</code> object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GetResourcePoliciesResponseEntry> policies;

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @return The token for the next set of items to return. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePoliciesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of the <code>Policy</code> object.
     * </p>
     * 
     * @return An array of the <code>Policy</code> object.
     */

    public java.util.List<GetResourcePoliciesResponseEntry> getPolicies() {
        if (policies == null) {
            policies = new com.amazonaws.internal.SdkInternalList<GetResourcePoliciesResponseEntry>();
        }
        return policies;
    }

    /**
     * <p>
     * An array of the <code>Policy</code> object.
     * </p>
     * 
     * @param policies
     *        An array of the <code>Policy</code> object.
     */

    public void setPolicies(java.util.Collection<GetResourcePoliciesResponseEntry> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }

        this.policies = new com.amazonaws.internal.SdkInternalList<GetResourcePoliciesResponseEntry>(policies);
    }

    /**
     * <p>
     * An array of the <code>Policy</code> object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicies(java.util.Collection)} or {@link #withPolicies(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param policies
     *        An array of the <code>Policy</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePoliciesResult withPolicies(GetResourcePoliciesResponseEntry... policies) {
        if (this.policies == null) {
            setPolicies(new com.amazonaws.internal.SdkInternalList<GetResourcePoliciesResponseEntry>(policies.length));
        }
        for (GetResourcePoliciesResponseEntry ele : policies) {
            this.policies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the <code>Policy</code> object.
     * </p>
     * 
     * @param policies
     *        An array of the <code>Policy</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePoliciesResult withPolicies(java.util.Collection<GetResourcePoliciesResponseEntry> policies) {
        setPolicies(policies);
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
        if (getPolicies() != null)
            sb.append("Policies: ").append(getPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourcePoliciesResult == false)
            return false;
        GetResourcePoliciesResult other = (GetResourcePoliciesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        return hashCode;
    }

    @Override
    public GetResourcePoliciesResult clone() {
        try {
            return (GetResourcePoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
