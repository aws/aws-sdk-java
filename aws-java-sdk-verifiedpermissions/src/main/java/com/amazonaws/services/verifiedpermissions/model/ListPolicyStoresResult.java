/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ListPolicyStores"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPolicyStoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of policy stores in the account.
     * </p>
     */
    private java.util.List<PolicyStoreItem> policyStores;

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that more output is available than is included in the current response.
     *        Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *        get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *        comes back as <code>null</code>. This indicates that this is the last page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @return If present, this value indicates that more output is available than is included in the current response.
     *         Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *         get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *         comes back as <code>null</code>. This indicates that this is the last page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that more output is available than is included in the current response.
     *        Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *        get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *        comes back as <code>null</code>. This indicates that this is the last page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPolicyStoresResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of policy stores in the account.
     * </p>
     * 
     * @return The list of policy stores in the account.
     */

    public java.util.List<PolicyStoreItem> getPolicyStores() {
        return policyStores;
    }

    /**
     * <p>
     * The list of policy stores in the account.
     * </p>
     * 
     * @param policyStores
     *        The list of policy stores in the account.
     */

    public void setPolicyStores(java.util.Collection<PolicyStoreItem> policyStores) {
        if (policyStores == null) {
            this.policyStores = null;
            return;
        }

        this.policyStores = new java.util.ArrayList<PolicyStoreItem>(policyStores);
    }

    /**
     * <p>
     * The list of policy stores in the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyStores(java.util.Collection)} or {@link #withPolicyStores(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyStores
     *        The list of policy stores in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPolicyStoresResult withPolicyStores(PolicyStoreItem... policyStores) {
        if (this.policyStores == null) {
            setPolicyStores(new java.util.ArrayList<PolicyStoreItem>(policyStores.length));
        }
        for (PolicyStoreItem ele : policyStores) {
            this.policyStores.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of policy stores in the account.
     * </p>
     * 
     * @param policyStores
     *        The list of policy stores in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPolicyStoresResult withPolicyStores(java.util.Collection<PolicyStoreItem> policyStores) {
        setPolicyStores(policyStores);
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
        if (getPolicyStores() != null)
            sb.append("PolicyStores: ").append(getPolicyStores());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPolicyStoresResult == false)
            return false;
        ListPolicyStoresResult other = (ListPolicyStoresResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPolicyStores() == null ^ this.getPolicyStores() == null)
            return false;
        if (other.getPolicyStores() != null && other.getPolicyStores().equals(this.getPolicyStores()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPolicyStores() == null) ? 0 : getPolicyStores().hashCode());
        return hashCode;
    }

    @Override
    public ListPolicyStoresResult clone() {
        try {
            return (ListPolicyStoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
