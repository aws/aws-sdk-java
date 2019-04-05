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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/LookupPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LookupPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides list of path to policies. Policies contain <code>PolicyId</code>, <code>ObjectIdentifier</code>, and
     * <code>PolicyType</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     */
    private java.util.List<PolicyToPath> policyToPathList;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Provides list of path to policies. Policies contain <code>PolicyId</code>, <code>ObjectIdentifier</code>, and
     * <code>PolicyType</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * 
     * @return Provides list of path to policies. Policies contain <code>PolicyId</code>, <code>ObjectIdentifier</code>,
     *         and <code>PolicyType</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     *         >Policies</a>.
     */

    public java.util.List<PolicyToPath> getPolicyToPathList() {
        return policyToPathList;
    }

    /**
     * <p>
     * Provides list of path to policies. Policies contain <code>PolicyId</code>, <code>ObjectIdentifier</code>, and
     * <code>PolicyType</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * 
     * @param policyToPathList
     *        Provides list of path to policies. Policies contain <code>PolicyId</code>, <code>ObjectIdentifier</code>,
     *        and <code>PolicyType</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     *        >Policies</a>.
     */

    public void setPolicyToPathList(java.util.Collection<PolicyToPath> policyToPathList) {
        if (policyToPathList == null) {
            this.policyToPathList = null;
            return;
        }

        this.policyToPathList = new java.util.ArrayList<PolicyToPath>(policyToPathList);
    }

    /**
     * <p>
     * Provides list of path to policies. Policies contain <code>PolicyId</code>, <code>ObjectIdentifier</code>, and
     * <code>PolicyType</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyToPathList(java.util.Collection)} or {@link #withPolicyToPathList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param policyToPathList
     *        Provides list of path to policies. Policies contain <code>PolicyId</code>, <code>ObjectIdentifier</code>,
     *        and <code>PolicyType</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     *        >Policies</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupPolicyResult withPolicyToPathList(PolicyToPath... policyToPathList) {
        if (this.policyToPathList == null) {
            setPolicyToPathList(new java.util.ArrayList<PolicyToPath>(policyToPathList.length));
        }
        for (PolicyToPath ele : policyToPathList) {
            this.policyToPathList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides list of path to policies. Policies contain <code>PolicyId</code>, <code>ObjectIdentifier</code>, and
     * <code>PolicyType</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     * >Policies</a>.
     * </p>
     * 
     * @param policyToPathList
     *        Provides list of path to policies. Policies contain <code>PolicyId</code>, <code>ObjectIdentifier</code>,
     *        and <code>PolicyType</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies"
     *        >Policies</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupPolicyResult withPolicyToPathList(java.util.Collection<PolicyToPath> policyToPathList) {
        setPolicyToPathList(policyToPathList);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupPolicyResult withNextToken(String nextToken) {
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
        if (getPolicyToPathList() != null)
            sb.append("PolicyToPathList: ").append(getPolicyToPathList()).append(",");
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

        if (obj instanceof LookupPolicyResult == false)
            return false;
        LookupPolicyResult other = (LookupPolicyResult) obj;
        if (other.getPolicyToPathList() == null ^ this.getPolicyToPathList() == null)
            return false;
        if (other.getPolicyToPathList() != null && other.getPolicyToPathList().equals(this.getPolicyToPathList()) == false)
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

        hashCode = prime * hashCode + ((getPolicyToPathList() == null) ? 0 : getPolicyToPathList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public LookupPolicyResult clone() {
        try {
            return (LookupPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
