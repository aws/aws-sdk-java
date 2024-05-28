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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ListPolicyTemplates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPolicyTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The list of the policy templates in the specified policy store.
     * </p>
     */
    private java.util.List<PolicyTemplateItem> policyTemplates;

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

    public ListPolicyTemplatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of the policy templates in the specified policy store.
     * </p>
     * 
     * @return The list of the policy templates in the specified policy store.
     */

    public java.util.List<PolicyTemplateItem> getPolicyTemplates() {
        return policyTemplates;
    }

    /**
     * <p>
     * The list of the policy templates in the specified policy store.
     * </p>
     * 
     * @param policyTemplates
     *        The list of the policy templates in the specified policy store.
     */

    public void setPolicyTemplates(java.util.Collection<PolicyTemplateItem> policyTemplates) {
        if (policyTemplates == null) {
            this.policyTemplates = null;
            return;
        }

        this.policyTemplates = new java.util.ArrayList<PolicyTemplateItem>(policyTemplates);
    }

    /**
     * <p>
     * The list of the policy templates in the specified policy store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyTemplates(java.util.Collection)} or {@link #withPolicyTemplates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param policyTemplates
     *        The list of the policy templates in the specified policy store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPolicyTemplatesResult withPolicyTemplates(PolicyTemplateItem... policyTemplates) {
        if (this.policyTemplates == null) {
            setPolicyTemplates(new java.util.ArrayList<PolicyTemplateItem>(policyTemplates.length));
        }
        for (PolicyTemplateItem ele : policyTemplates) {
            this.policyTemplates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of the policy templates in the specified policy store.
     * </p>
     * 
     * @param policyTemplates
     *        The list of the policy templates in the specified policy store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPolicyTemplatesResult withPolicyTemplates(java.util.Collection<PolicyTemplateItem> policyTemplates) {
        setPolicyTemplates(policyTemplates);
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
        if (getPolicyTemplates() != null)
            sb.append("PolicyTemplates: ").append(getPolicyTemplates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPolicyTemplatesResult == false)
            return false;
        ListPolicyTemplatesResult other = (ListPolicyTemplatesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPolicyTemplates() == null ^ this.getPolicyTemplates() == null)
            return false;
        if (other.getPolicyTemplates() != null && other.getPolicyTemplates().equals(this.getPolicyTemplates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPolicyTemplates() == null) ? 0 : getPolicyTemplates().hashCode());
        return hashCode;
    }

    @Override
    public ListPolicyTemplatesResult clone() {
        try {
            return (ListPolicyTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
