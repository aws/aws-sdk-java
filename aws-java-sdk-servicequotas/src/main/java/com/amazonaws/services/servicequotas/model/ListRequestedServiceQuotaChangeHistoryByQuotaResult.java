/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicequotas.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListRequestedServiceQuotaChangeHistoryByQuota"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRequestedServiceQuotaChangeHistoryByQuotaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about the quota increase requests.
     * </p>
     */
    private java.util.List<RequestedServiceQuotaChange> requestedQuotas;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is null when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRequestedServiceQuotaChangeHistoryByQuotaResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about the quota increase requests.
     * </p>
     * 
     * @return Information about the quota increase requests.
     */

    public java.util.List<RequestedServiceQuotaChange> getRequestedQuotas() {
        return requestedQuotas;
    }

    /**
     * <p>
     * Information about the quota increase requests.
     * </p>
     * 
     * @param requestedQuotas
     *        Information about the quota increase requests.
     */

    public void setRequestedQuotas(java.util.Collection<RequestedServiceQuotaChange> requestedQuotas) {
        if (requestedQuotas == null) {
            this.requestedQuotas = null;
            return;
        }

        this.requestedQuotas = new java.util.ArrayList<RequestedServiceQuotaChange>(requestedQuotas);
    }

    /**
     * <p>
     * Information about the quota increase requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequestedQuotas(java.util.Collection)} or {@link #withRequestedQuotas(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param requestedQuotas
     *        Information about the quota increase requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRequestedServiceQuotaChangeHistoryByQuotaResult withRequestedQuotas(RequestedServiceQuotaChange... requestedQuotas) {
        if (this.requestedQuotas == null) {
            setRequestedQuotas(new java.util.ArrayList<RequestedServiceQuotaChange>(requestedQuotas.length));
        }
        for (RequestedServiceQuotaChange ele : requestedQuotas) {
            this.requestedQuotas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the quota increase requests.
     * </p>
     * 
     * @param requestedQuotas
     *        Information about the quota increase requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRequestedServiceQuotaChangeHistoryByQuotaResult withRequestedQuotas(java.util.Collection<RequestedServiceQuotaChange> requestedQuotas) {
        setRequestedQuotas(requestedQuotas);
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
        if (getRequestedQuotas() != null)
            sb.append("RequestedQuotas: ").append(getRequestedQuotas());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRequestedServiceQuotaChangeHistoryByQuotaResult == false)
            return false;
        ListRequestedServiceQuotaChangeHistoryByQuotaResult other = (ListRequestedServiceQuotaChangeHistoryByQuotaResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRequestedQuotas() == null ^ this.getRequestedQuotas() == null)
            return false;
        if (other.getRequestedQuotas() != null && other.getRequestedQuotas().equals(this.getRequestedQuotas()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRequestedQuotas() == null) ? 0 : getRequestedQuotas().hashCode());
        return hashCode;
    }

    @Override
    public ListRequestedServiceQuotaChangeHistoryByQuotaResult clone() {
        try {
            return (ListRequestedServiceQuotaChangeHistoryByQuotaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
