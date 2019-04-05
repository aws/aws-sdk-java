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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListComplianceStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComplianceStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of <code>PolicyComplianceStatus</code> objects.
     * </p>
     */
    private java.util.List<PolicyComplianceStatus> policyComplianceStatusList;
    /**
     * <p>
     * If you have more <code>PolicyComplianceStatus</code> objects than the number that you specified for
     * <code>MaxResults</code> in the request, the response includes a <code>NextToken</code> value. To list more
     * <code>PolicyComplianceStatus</code> objects, submit another <code>ListComplianceStatus</code> request, and
     * specify the <code>NextToken</code> value from the response in the <code>NextToken</code> value in the next
     * request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>PolicyComplianceStatus</code> objects.
     * </p>
     * 
     * @return An array of <code>PolicyComplianceStatus</code> objects.
     */

    public java.util.List<PolicyComplianceStatus> getPolicyComplianceStatusList() {
        return policyComplianceStatusList;
    }

    /**
     * <p>
     * An array of <code>PolicyComplianceStatus</code> objects.
     * </p>
     * 
     * @param policyComplianceStatusList
     *        An array of <code>PolicyComplianceStatus</code> objects.
     */

    public void setPolicyComplianceStatusList(java.util.Collection<PolicyComplianceStatus> policyComplianceStatusList) {
        if (policyComplianceStatusList == null) {
            this.policyComplianceStatusList = null;
            return;
        }

        this.policyComplianceStatusList = new java.util.ArrayList<PolicyComplianceStatus>(policyComplianceStatusList);
    }

    /**
     * <p>
     * An array of <code>PolicyComplianceStatus</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyComplianceStatusList(java.util.Collection)} or
     * {@link #withPolicyComplianceStatusList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param policyComplianceStatusList
     *        An array of <code>PolicyComplianceStatus</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceStatusResult withPolicyComplianceStatusList(PolicyComplianceStatus... policyComplianceStatusList) {
        if (this.policyComplianceStatusList == null) {
            setPolicyComplianceStatusList(new java.util.ArrayList<PolicyComplianceStatus>(policyComplianceStatusList.length));
        }
        for (PolicyComplianceStatus ele : policyComplianceStatusList) {
            this.policyComplianceStatusList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>PolicyComplianceStatus</code> objects.
     * </p>
     * 
     * @param policyComplianceStatusList
     *        An array of <code>PolicyComplianceStatus</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceStatusResult withPolicyComplianceStatusList(java.util.Collection<PolicyComplianceStatus> policyComplianceStatusList) {
        setPolicyComplianceStatusList(policyComplianceStatusList);
        return this;
    }

    /**
     * <p>
     * If you have more <code>PolicyComplianceStatus</code> objects than the number that you specified for
     * <code>MaxResults</code> in the request, the response includes a <code>NextToken</code> value. To list more
     * <code>PolicyComplianceStatus</code> objects, submit another <code>ListComplianceStatus</code> request, and
     * specify the <code>NextToken</code> value from the response in the <code>NextToken</code> value in the next
     * request.
     * </p>
     * 
     * @param nextToken
     *        If you have more <code>PolicyComplianceStatus</code> objects than the number that you specified for
     *        <code>MaxResults</code> in the request, the response includes a <code>NextToken</code> value. To list more
     *        <code>PolicyComplianceStatus</code> objects, submit another <code>ListComplianceStatus</code> request, and
     *        specify the <code>NextToken</code> value from the response in the <code>NextToken</code> value in the next
     *        request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you have more <code>PolicyComplianceStatus</code> objects than the number that you specified for
     * <code>MaxResults</code> in the request, the response includes a <code>NextToken</code> value. To list more
     * <code>PolicyComplianceStatus</code> objects, submit another <code>ListComplianceStatus</code> request, and
     * specify the <code>NextToken</code> value from the response in the <code>NextToken</code> value in the next
     * request.
     * </p>
     * 
     * @return If you have more <code>PolicyComplianceStatus</code> objects than the number that you specified for
     *         <code>MaxResults</code> in the request, the response includes a <code>NextToken</code> value. To list
     *         more <code>PolicyComplianceStatus</code> objects, submit another <code>ListComplianceStatus</code>
     *         request, and specify the <code>NextToken</code> value from the response in the <code>NextToken</code>
     *         value in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you have more <code>PolicyComplianceStatus</code> objects than the number that you specified for
     * <code>MaxResults</code> in the request, the response includes a <code>NextToken</code> value. To list more
     * <code>PolicyComplianceStatus</code> objects, submit another <code>ListComplianceStatus</code> request, and
     * specify the <code>NextToken</code> value from the response in the <code>NextToken</code> value in the next
     * request.
     * </p>
     * 
     * @param nextToken
     *        If you have more <code>PolicyComplianceStatus</code> objects than the number that you specified for
     *        <code>MaxResults</code> in the request, the response includes a <code>NextToken</code> value. To list more
     *        <code>PolicyComplianceStatus</code> objects, submit another <code>ListComplianceStatus</code> request, and
     *        specify the <code>NextToken</code> value from the response in the <code>NextToken</code> value in the next
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceStatusResult withNextToken(String nextToken) {
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
        if (getPolicyComplianceStatusList() != null)
            sb.append("PolicyComplianceStatusList: ").append(getPolicyComplianceStatusList()).append(",");
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

        if (obj instanceof ListComplianceStatusResult == false)
            return false;
        ListComplianceStatusResult other = (ListComplianceStatusResult) obj;
        if (other.getPolicyComplianceStatusList() == null ^ this.getPolicyComplianceStatusList() == null)
            return false;
        if (other.getPolicyComplianceStatusList() != null && other.getPolicyComplianceStatusList().equals(this.getPolicyComplianceStatusList()) == false)
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

        hashCode = prime * hashCode + ((getPolicyComplianceStatusList() == null) ? 0 : getPolicyComplianceStatusList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListComplianceStatusResult clone() {
        try {
            return (ListComplianceStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
