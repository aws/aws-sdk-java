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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/SearchAgreements"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchAgreementsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A summary of the agreement, including top-level attributes (for example, the agreement ID, version, proposer, and
     * acceptor).
     * </p>
     */
    private java.util.List<AgreementViewSummary> agreementViewSummaries;
    /**
     * <p>
     * The token used for pagination. The field is <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A summary of the agreement, including top-level attributes (for example, the agreement ID, version, proposer, and
     * acceptor).
     * </p>
     * 
     * @return A summary of the agreement, including top-level attributes (for example, the agreement ID, version,
     *         proposer, and acceptor).
     */

    public java.util.List<AgreementViewSummary> getAgreementViewSummaries() {
        return agreementViewSummaries;
    }

    /**
     * <p>
     * A summary of the agreement, including top-level attributes (for example, the agreement ID, version, proposer, and
     * acceptor).
     * </p>
     * 
     * @param agreementViewSummaries
     *        A summary of the agreement, including top-level attributes (for example, the agreement ID, version,
     *        proposer, and acceptor).
     */

    public void setAgreementViewSummaries(java.util.Collection<AgreementViewSummary> agreementViewSummaries) {
        if (agreementViewSummaries == null) {
            this.agreementViewSummaries = null;
            return;
        }

        this.agreementViewSummaries = new java.util.ArrayList<AgreementViewSummary>(agreementViewSummaries);
    }

    /**
     * <p>
     * A summary of the agreement, including top-level attributes (for example, the agreement ID, version, proposer, and
     * acceptor).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgreementViewSummaries(java.util.Collection)} or
     * {@link #withAgreementViewSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param agreementViewSummaries
     *        A summary of the agreement, including top-level attributes (for example, the agreement ID, version,
     *        proposer, and acceptor).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAgreementsResult withAgreementViewSummaries(AgreementViewSummary... agreementViewSummaries) {
        if (this.agreementViewSummaries == null) {
            setAgreementViewSummaries(new java.util.ArrayList<AgreementViewSummary>(agreementViewSummaries.length));
        }
        for (AgreementViewSummary ele : agreementViewSummaries) {
            this.agreementViewSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A summary of the agreement, including top-level attributes (for example, the agreement ID, version, proposer, and
     * acceptor).
     * </p>
     * 
     * @param agreementViewSummaries
     *        A summary of the agreement, including top-level attributes (for example, the agreement ID, version,
     *        proposer, and acceptor).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAgreementsResult withAgreementViewSummaries(java.util.Collection<AgreementViewSummary> agreementViewSummaries) {
        setAgreementViewSummaries(agreementViewSummaries);
        return this;
    }

    /**
     * <p>
     * The token used for pagination. The field is <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token used for pagination. The field is <code>null</code> if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used for pagination. The field is <code>null</code> if there are no more results.
     * </p>
     * 
     * @return The token used for pagination. The field is <code>null</code> if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used for pagination. The field is <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token used for pagination. The field is <code>null</code> if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAgreementsResult withNextToken(String nextToken) {
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
        if (getAgreementViewSummaries() != null)
            sb.append("AgreementViewSummaries: ").append(getAgreementViewSummaries()).append(",");
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

        if (obj instanceof SearchAgreementsResult == false)
            return false;
        SearchAgreementsResult other = (SearchAgreementsResult) obj;
        if (other.getAgreementViewSummaries() == null ^ this.getAgreementViewSummaries() == null)
            return false;
        if (other.getAgreementViewSummaries() != null && other.getAgreementViewSummaries().equals(this.getAgreementViewSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAgreementViewSummaries() == null) ? 0 : getAgreementViewSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchAgreementsResult clone() {
        try {
            return (SearchAgreementsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
