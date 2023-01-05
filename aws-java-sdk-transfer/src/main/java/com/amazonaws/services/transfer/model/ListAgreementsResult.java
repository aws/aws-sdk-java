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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListAgreements" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAgreementsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a token that you can use to call <code>ListAgreements</code> again and receive additional results, if
     * there are any.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Returns an array, where each item contains the details of an agreement.
     * </p>
     */
    private java.util.List<ListedAgreement> agreements;

    /**
     * <p>
     * Returns a token that you can use to call <code>ListAgreements</code> again and receive additional results, if
     * there are any.
     * </p>
     * 
     * @param nextToken
     *        Returns a token that you can use to call <code>ListAgreements</code> again and receive additional results,
     *        if there are any.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Returns a token that you can use to call <code>ListAgreements</code> again and receive additional results, if
     * there are any.
     * </p>
     * 
     * @return Returns a token that you can use to call <code>ListAgreements</code> again and receive additional
     *         results, if there are any.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Returns a token that you can use to call <code>ListAgreements</code> again and receive additional results, if
     * there are any.
     * </p>
     * 
     * @param nextToken
     *        Returns a token that you can use to call <code>ListAgreements</code> again and receive additional results,
     *        if there are any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgreementsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Returns an array, where each item contains the details of an agreement.
     * </p>
     * 
     * @return Returns an array, where each item contains the details of an agreement.
     */

    public java.util.List<ListedAgreement> getAgreements() {
        return agreements;
    }

    /**
     * <p>
     * Returns an array, where each item contains the details of an agreement.
     * </p>
     * 
     * @param agreements
     *        Returns an array, where each item contains the details of an agreement.
     */

    public void setAgreements(java.util.Collection<ListedAgreement> agreements) {
        if (agreements == null) {
            this.agreements = null;
            return;
        }

        this.agreements = new java.util.ArrayList<ListedAgreement>(agreements);
    }

    /**
     * <p>
     * Returns an array, where each item contains the details of an agreement.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgreements(java.util.Collection)} or {@link #withAgreements(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agreements
     *        Returns an array, where each item contains the details of an agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgreementsResult withAgreements(ListedAgreement... agreements) {
        if (this.agreements == null) {
            setAgreements(new java.util.ArrayList<ListedAgreement>(agreements.length));
        }
        for (ListedAgreement ele : agreements) {
            this.agreements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns an array, where each item contains the details of an agreement.
     * </p>
     * 
     * @param agreements
     *        Returns an array, where each item contains the details of an agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAgreementsResult withAgreements(java.util.Collection<ListedAgreement> agreements) {
        setAgreements(agreements);
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
        if (getAgreements() != null)
            sb.append("Agreements: ").append(getAgreements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAgreementsResult == false)
            return false;
        ListAgreementsResult other = (ListAgreementsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getAgreements() == null ^ this.getAgreements() == null)
            return false;
        if (other.getAgreements() != null && other.getAgreements().equals(this.getAgreements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getAgreements() == null) ? 0 : getAgreements().hashCode());
        return hashCode;
    }

    @Override
    public ListAgreementsResult clone() {
        try {
            return (ListAgreementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
