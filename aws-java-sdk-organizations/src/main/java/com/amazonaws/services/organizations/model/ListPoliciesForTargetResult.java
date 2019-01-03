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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListPoliciesForTarget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPoliciesForTargetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of policies that match the criteria in the request.
     * </p>
     */
    private java.util.List<PolicySummary> policies;
    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of policies that match the criteria in the request.
     * </p>
     * 
     * @return The list of policies that match the criteria in the request.
     */

    public java.util.List<PolicySummary> getPolicies() {
        return policies;
    }

    /**
     * <p>
     * The list of policies that match the criteria in the request.
     * </p>
     * 
     * @param policies
     *        The list of policies that match the criteria in the request.
     */

    public void setPolicies(java.util.Collection<PolicySummary> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }

        this.policies = new java.util.ArrayList<PolicySummary>(policies);
    }

    /**
     * <p>
     * The list of policies that match the criteria in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicies(java.util.Collection)} or {@link #withPolicies(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param policies
     *        The list of policies that match the criteria in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesForTargetResult withPolicies(PolicySummary... policies) {
        if (this.policies == null) {
            setPolicies(new java.util.ArrayList<PolicySummary>(policies.length));
        }
        for (PolicySummary ele : policies) {
            this.policies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of policies that match the criteria in the request.
     * </p>
     * 
     * @param policies
     *        The list of policies that match the criteria in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesForTargetResult withPolicies(java.util.Collection<PolicySummary> policies) {
        setPolicies(policies);
        return this;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that there is more output available than is included in the current
     *        response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *        operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *        response element comes back as <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @return If present, this value indicates that there is more output available than is included in the current
     *         response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *         operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *         response element comes back as <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that there is more output available than is included in the current
     *        response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *        operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *        response element comes back as <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesForTargetResult withNextToken(String nextToken) {
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
        if (getPolicies() != null)
            sb.append("Policies: ").append(getPolicies()).append(",");
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

        if (obj instanceof ListPoliciesForTargetResult == false)
            return false;
        ListPoliciesForTargetResult other = (ListPoliciesForTargetResult) obj;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
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

        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPoliciesForTargetResult clone() {
        try {
            return (ListPoliciesForTargetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
