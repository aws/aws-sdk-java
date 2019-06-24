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
package com.amazonaws.services.servicequotas.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListRequestedServiceQuotaChangeHistory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRequestedServiceQuotaChangeHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * If present in the response, this value indicates there's more output available that what's included in the
     * current response. This can occur even when the response includes no values at all, such as when you ask for a
     * filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent
     * call to the operation to continue processing and get the next part of the output. You should repeat this until
     * the <code>NextToken</code> response element comes back empty (as <code>null</code>).
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Returns a list of service quota requests.
     * </p>
     */
    private java.util.List<RequestedServiceQuotaChange> requestedQuotas;

    /**
     * <p>
     * If present in the response, this value indicates there's more output available that what's included in the
     * current response. This can occur even when the response includes no values at all, such as when you ask for a
     * filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent
     * call to the operation to continue processing and get the next part of the output. You should repeat this until
     * the <code>NextToken</code> response element comes back empty (as <code>null</code>).
     * </p>
     * 
     * @param nextToken
     *        If present in the response, this value indicates there's more output available that what's included in the
     *        current response. This can occur even when the response includes no values at all, such as when you ask
     *        for a filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in
     *        a subsequent call to the operation to continue processing and get the next part of the output. You should
     *        repeat this until the <code>NextToken</code> response element comes back empty (as <code>null</code>).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present in the response, this value indicates there's more output available that what's included in the
     * current response. This can occur even when the response includes no values at all, such as when you ask for a
     * filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent
     * call to the operation to continue processing and get the next part of the output. You should repeat this until
     * the <code>NextToken</code> response element comes back empty (as <code>null</code>).
     * </p>
     * 
     * @return If present in the response, this value indicates there's more output available that what's included in
     *         the current response. This can occur even when the response includes no values at all, such as when you
     *         ask for a filtered view of a very long list. Use this value in the <code>NextToken</code> request
     *         parameter in a subsequent call to the operation to continue processing and get the next part of the
     *         output. You should repeat this until the <code>NextToken</code> response element comes back empty (as
     *         <code>null</code>).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present in the response, this value indicates there's more output available that what's included in the
     * current response. This can occur even when the response includes no values at all, such as when you ask for a
     * filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in a subsequent
     * call to the operation to continue processing and get the next part of the output. You should repeat this until
     * the <code>NextToken</code> response element comes back empty (as <code>null</code>).
     * </p>
     * 
     * @param nextToken
     *        If present in the response, this value indicates there's more output available that what's included in the
     *        current response. This can occur even when the response includes no values at all, such as when you ask
     *        for a filtered view of a very long list. Use this value in the <code>NextToken</code> request parameter in
     *        a subsequent call to the operation to continue processing and get the next part of the output. You should
     *        repeat this until the <code>NextToken</code> response element comes back empty (as <code>null</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRequestedServiceQuotaChangeHistoryResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Returns a list of service quota requests.
     * </p>
     * 
     * @return Returns a list of service quota requests.
     */

    public java.util.List<RequestedServiceQuotaChange> getRequestedQuotas() {
        return requestedQuotas;
    }

    /**
     * <p>
     * Returns a list of service quota requests.
     * </p>
     * 
     * @param requestedQuotas
     *        Returns a list of service quota requests.
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
     * Returns a list of service quota requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequestedQuotas(java.util.Collection)} or {@link #withRequestedQuotas(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param requestedQuotas
     *        Returns a list of service quota requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRequestedServiceQuotaChangeHistoryResult withRequestedQuotas(RequestedServiceQuotaChange... requestedQuotas) {
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
     * Returns a list of service quota requests.
     * </p>
     * 
     * @param requestedQuotas
     *        Returns a list of service quota requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRequestedServiceQuotaChangeHistoryResult withRequestedQuotas(java.util.Collection<RequestedServiceQuotaChange> requestedQuotas) {
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

        if (obj instanceof ListRequestedServiceQuotaChangeHistoryResult == false)
            return false;
        ListRequestedServiceQuotaChangeHistoryResult other = (ListRequestedServiceQuotaChangeHistoryResult) obj;
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
    public ListRequestedServiceQuotaChangeHistoryResult clone() {
        try {
            return (ListRequestedServiceQuotaChangeHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
