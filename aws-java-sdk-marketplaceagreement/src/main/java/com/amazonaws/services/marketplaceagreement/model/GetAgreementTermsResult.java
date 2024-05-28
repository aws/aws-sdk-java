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
package com.amazonaws.services.marketplaceagreement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/GetAgreementTerms"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAgreementTermsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A subset of terms proposed by the proposer that have been accepted by the acceptor as part of the agreement
     * creation.
     * </p>
     */
    private java.util.List<AcceptedTerm> acceptedTerms;
    /**
     * <p>
     * A token to specify where to start pagination
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A subset of terms proposed by the proposer that have been accepted by the acceptor as part of the agreement
     * creation.
     * </p>
     * 
     * @return A subset of terms proposed by the proposer that have been accepted by the acceptor as part of the
     *         agreement creation.
     */

    public java.util.List<AcceptedTerm> getAcceptedTerms() {
        return acceptedTerms;
    }

    /**
     * <p>
     * A subset of terms proposed by the proposer that have been accepted by the acceptor as part of the agreement
     * creation.
     * </p>
     * 
     * @param acceptedTerms
     *        A subset of terms proposed by the proposer that have been accepted by the acceptor as part of the
     *        agreement creation.
     */

    public void setAcceptedTerms(java.util.Collection<AcceptedTerm> acceptedTerms) {
        if (acceptedTerms == null) {
            this.acceptedTerms = null;
            return;
        }

        this.acceptedTerms = new java.util.ArrayList<AcceptedTerm>(acceptedTerms);
    }

    /**
     * <p>
     * A subset of terms proposed by the proposer that have been accepted by the acceptor as part of the agreement
     * creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceptedTerms(java.util.Collection)} or {@link #withAcceptedTerms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param acceptedTerms
     *        A subset of terms proposed by the proposer that have been accepted by the acceptor as part of the
     *        agreement creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgreementTermsResult withAcceptedTerms(AcceptedTerm... acceptedTerms) {
        if (this.acceptedTerms == null) {
            setAcceptedTerms(new java.util.ArrayList<AcceptedTerm>(acceptedTerms.length));
        }
        for (AcceptedTerm ele : acceptedTerms) {
            this.acceptedTerms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A subset of terms proposed by the proposer that have been accepted by the acceptor as part of the agreement
     * creation.
     * </p>
     * 
     * @param acceptedTerms
     *        A subset of terms proposed by the proposer that have been accepted by the acceptor as part of the
     *        agreement creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgreementTermsResult withAcceptedTerms(java.util.Collection<AcceptedTerm> acceptedTerms) {
        setAcceptedTerms(acceptedTerms);
        return this;
    }

    /**
     * <p>
     * A token to specify where to start pagination
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start pagination
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start pagination
     * </p>
     * 
     * @return A token to specify where to start pagination
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to specify where to start pagination
     * </p>
     * 
     * @param nextToken
     *        A token to specify where to start pagination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgreementTermsResult withNextToken(String nextToken) {
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
        if (getAcceptedTerms() != null)
            sb.append("AcceptedTerms: ").append(getAcceptedTerms()).append(",");
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

        if (obj instanceof GetAgreementTermsResult == false)
            return false;
        GetAgreementTermsResult other = (GetAgreementTermsResult) obj;
        if (other.getAcceptedTerms() == null ^ this.getAcceptedTerms() == null)
            return false;
        if (other.getAcceptedTerms() != null && other.getAcceptedTerms().equals(this.getAcceptedTerms()) == false)
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

        hashCode = prime * hashCode + ((getAcceptedTerms() == null) ? 0 : getAcceptedTerms().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAgreementTermsResult clone() {
        try {
            return (GetAgreementTermsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
