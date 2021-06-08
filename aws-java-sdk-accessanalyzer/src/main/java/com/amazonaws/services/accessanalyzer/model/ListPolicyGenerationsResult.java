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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/ListPolicyGenerations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPolicyGenerationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A <code>PolicyGeneration</code> object that contains details about the generated policy.
     * </p>
     */
    private java.util.List<PolicyGeneration> policyGenerations;

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @return A token used for pagination of results returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used for pagination of results returned.
     * </p>
     * 
     * @param nextToken
     *        A token used for pagination of results returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPolicyGenerationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A <code>PolicyGeneration</code> object that contains details about the generated policy.
     * </p>
     * 
     * @return A <code>PolicyGeneration</code> object that contains details about the generated policy.
     */

    public java.util.List<PolicyGeneration> getPolicyGenerations() {
        return policyGenerations;
    }

    /**
     * <p>
     * A <code>PolicyGeneration</code> object that contains details about the generated policy.
     * </p>
     * 
     * @param policyGenerations
     *        A <code>PolicyGeneration</code> object that contains details about the generated policy.
     */

    public void setPolicyGenerations(java.util.Collection<PolicyGeneration> policyGenerations) {
        if (policyGenerations == null) {
            this.policyGenerations = null;
            return;
        }

        this.policyGenerations = new java.util.ArrayList<PolicyGeneration>(policyGenerations);
    }

    /**
     * <p>
     * A <code>PolicyGeneration</code> object that contains details about the generated policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyGenerations(java.util.Collection)} or {@link #withPolicyGenerations(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param policyGenerations
     *        A <code>PolicyGeneration</code> object that contains details about the generated policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPolicyGenerationsResult withPolicyGenerations(PolicyGeneration... policyGenerations) {
        if (this.policyGenerations == null) {
            setPolicyGenerations(new java.util.ArrayList<PolicyGeneration>(policyGenerations.length));
        }
        for (PolicyGeneration ele : policyGenerations) {
            this.policyGenerations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A <code>PolicyGeneration</code> object that contains details about the generated policy.
     * </p>
     * 
     * @param policyGenerations
     *        A <code>PolicyGeneration</code> object that contains details about the generated policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPolicyGenerationsResult withPolicyGenerations(java.util.Collection<PolicyGeneration> policyGenerations) {
        setPolicyGenerations(policyGenerations);
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
        if (getPolicyGenerations() != null)
            sb.append("PolicyGenerations: ").append(getPolicyGenerations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPolicyGenerationsResult == false)
            return false;
        ListPolicyGenerationsResult other = (ListPolicyGenerationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPolicyGenerations() == null ^ this.getPolicyGenerations() == null)
            return false;
        if (other.getPolicyGenerations() != null && other.getPolicyGenerations().equals(this.getPolicyGenerations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPolicyGenerations() == null) ? 0 : getPolicyGenerations().hashCode());
        return hashCode;
    }

    @Override
    public ListPolicyGenerationsResult clone() {
        try {
            return (ListPolicyGenerationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
