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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListPolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>PolicySummary</code> objects.
     * </p>
     */
    private java.util.List<PolicySummary> policyList;
    /**
     * <p>
     * If you have more <code>PolicySummary</code> objects than the number that you specified for
     * <code>MaxResults</code> in the request, the response includes a <code>NextToken</code> value. To list more
     * <code>PolicySummary</code> objects, submit another <code>ListPolicies</code> request, and specify the
     * <code>NextToken</code> value from the response in the <code>NextToken</code> value in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>PolicySummary</code> objects.
     * </p>
     * 
     * @return An array of <code>PolicySummary</code> objects.
     */

    public java.util.List<PolicySummary> getPolicyList() {
        return policyList;
    }

    /**
     * <p>
     * An array of <code>PolicySummary</code> objects.
     * </p>
     * 
     * @param policyList
     *        An array of <code>PolicySummary</code> objects.
     */

    public void setPolicyList(java.util.Collection<PolicySummary> policyList) {
        if (policyList == null) {
            this.policyList = null;
            return;
        }

        this.policyList = new java.util.ArrayList<PolicySummary>(policyList);
    }

    /**
     * <p>
     * An array of <code>PolicySummary</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyList(java.util.Collection)} or {@link #withPolicyList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyList
     *        An array of <code>PolicySummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesResult withPolicyList(PolicySummary... policyList) {
        if (this.policyList == null) {
            setPolicyList(new java.util.ArrayList<PolicySummary>(policyList.length));
        }
        for (PolicySummary ele : policyList) {
            this.policyList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>PolicySummary</code> objects.
     * </p>
     * 
     * @param policyList
     *        An array of <code>PolicySummary</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesResult withPolicyList(java.util.Collection<PolicySummary> policyList) {
        setPolicyList(policyList);
        return this;
    }

    /**
     * <p>
     * If you have more <code>PolicySummary</code> objects than the number that you specified for
     * <code>MaxResults</code> in the request, the response includes a <code>NextToken</code> value. To list more
     * <code>PolicySummary</code> objects, submit another <code>ListPolicies</code> request, and specify the
     * <code>NextToken</code> value from the response in the <code>NextToken</code> value in the next request.
     * </p>
     * 
     * @param nextToken
     *        If you have more <code>PolicySummary</code> objects than the number that you specified for
     *        <code>MaxResults</code> in the request, the response includes a <code>NextToken</code> value. To list more
     *        <code>PolicySummary</code> objects, submit another <code>ListPolicies</code> request, and specify the
     *        <code>NextToken</code> value from the response in the <code>NextToken</code> value in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you have more <code>PolicySummary</code> objects than the number that you specified for
     * <code>MaxResults</code> in the request, the response includes a <code>NextToken</code> value. To list more
     * <code>PolicySummary</code> objects, submit another <code>ListPolicies</code> request, and specify the
     * <code>NextToken</code> value from the response in the <code>NextToken</code> value in the next request.
     * </p>
     * 
     * @return If you have more <code>PolicySummary</code> objects than the number that you specified for
     *         <code>MaxResults</code> in the request, the response includes a <code>NextToken</code> value. To list
     *         more <code>PolicySummary</code> objects, submit another <code>ListPolicies</code> request, and specify
     *         the <code>NextToken</code> value from the response in the <code>NextToken</code> value in the next
     *         request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you have more <code>PolicySummary</code> objects than the number that you specified for
     * <code>MaxResults</code> in the request, the response includes a <code>NextToken</code> value. To list more
     * <code>PolicySummary</code> objects, submit another <code>ListPolicies</code> request, and specify the
     * <code>NextToken</code> value from the response in the <code>NextToken</code> value in the next request.
     * </p>
     * 
     * @param nextToken
     *        If you have more <code>PolicySummary</code> objects than the number that you specified for
     *        <code>MaxResults</code> in the request, the response includes a <code>NextToken</code> value. To list more
     *        <code>PolicySummary</code> objects, submit another <code>ListPolicies</code> request, and specify the
     *        <code>NextToken</code> value from the response in the <code>NextToken</code> value in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesResult withNextToken(String nextToken) {
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
        if (getPolicyList() != null)
            sb.append("PolicyList: ").append(getPolicyList()).append(",");
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

        if (obj instanceof ListPoliciesResult == false)
            return false;
        ListPoliciesResult other = (ListPoliciesResult) obj;
        if (other.getPolicyList() == null ^ this.getPolicyList() == null)
            return false;
        if (other.getPolicyList() != null && other.getPolicyList().equals(this.getPolicyList()) == false)
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

        hashCode = prime * hashCode + ((getPolicyList() == null) ? 0 : getPolicyList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPoliciesResult clone() {
        try {
            return (ListPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
