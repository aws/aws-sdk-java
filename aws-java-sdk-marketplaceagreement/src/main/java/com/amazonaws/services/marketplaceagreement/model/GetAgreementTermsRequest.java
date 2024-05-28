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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/GetAgreementTerms"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAgreementTermsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     */
    private String agreementId;
    /**
     * <p>
     * The maximum number of agreements to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to specify where to start pagination
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     * 
     * @param agreementId
     *        The unique identifier of the agreement.
     */

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     * 
     * @return The unique identifier of the agreement.
     */

    public String getAgreementId() {
        return this.agreementId;
    }

    /**
     * <p>
     * The unique identifier of the agreement.
     * </p>
     * 
     * @param agreementId
     *        The unique identifier of the agreement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgreementTermsRequest withAgreementId(String agreementId) {
        setAgreementId(agreementId);
        return this;
    }

    /**
     * <p>
     * The maximum number of agreements to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of agreements to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of agreements to return in the response.
     * </p>
     * 
     * @return The maximum number of agreements to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of agreements to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of agreements to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAgreementTermsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public GetAgreementTermsRequest withNextToken(String nextToken) {
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
        if (getAgreementId() != null)
            sb.append("AgreementId: ").append(getAgreementId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof GetAgreementTermsRequest == false)
            return false;
        GetAgreementTermsRequest other = (GetAgreementTermsRequest) obj;
        if (other.getAgreementId() == null ^ this.getAgreementId() == null)
            return false;
        if (other.getAgreementId() != null && other.getAgreementId().equals(this.getAgreementId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getAgreementId() == null) ? 0 : getAgreementId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAgreementTermsRequest clone() {
        return (GetAgreementTermsRequest) super.clone();
    }

}
