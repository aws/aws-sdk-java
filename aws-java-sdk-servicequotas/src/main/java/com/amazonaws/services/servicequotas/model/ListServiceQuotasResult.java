/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListServiceQuotas" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServiceQuotasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The response information for a quota lists all attribute information for the quota.
     * </p>
     */
    private java.util.List<ServiceQuota> quotas;

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

    public ListServiceQuotasResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The response information for a quota lists all attribute information for the quota.
     * </p>
     * 
     * @return The response information for a quota lists all attribute information for the quota.
     */

    public java.util.List<ServiceQuota> getQuotas() {
        return quotas;
    }

    /**
     * <p>
     * The response information for a quota lists all attribute information for the quota.
     * </p>
     * 
     * @param quotas
     *        The response information for a quota lists all attribute information for the quota.
     */

    public void setQuotas(java.util.Collection<ServiceQuota> quotas) {
        if (quotas == null) {
            this.quotas = null;
            return;
        }

        this.quotas = new java.util.ArrayList<ServiceQuota>(quotas);
    }

    /**
     * <p>
     * The response information for a quota lists all attribute information for the quota.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQuotas(java.util.Collection)} or {@link #withQuotas(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param quotas
     *        The response information for a quota lists all attribute information for the quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceQuotasResult withQuotas(ServiceQuota... quotas) {
        if (this.quotas == null) {
            setQuotas(new java.util.ArrayList<ServiceQuota>(quotas.length));
        }
        for (ServiceQuota ele : quotas) {
            this.quotas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The response information for a quota lists all attribute information for the quota.
     * </p>
     * 
     * @param quotas
     *        The response information for a quota lists all attribute information for the quota.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServiceQuotasResult withQuotas(java.util.Collection<ServiceQuota> quotas) {
        setQuotas(quotas);
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
        if (getQuotas() != null)
            sb.append("Quotas: ").append(getQuotas());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServiceQuotasResult == false)
            return false;
        ListServiceQuotasResult other = (ListServiceQuotasResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getQuotas() == null ^ this.getQuotas() == null)
            return false;
        if (other.getQuotas() != null && other.getQuotas().equals(this.getQuotas()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getQuotas() == null) ? 0 : getQuotas().hashCode());
        return hashCode;
    }

    @Override
    public ListServiceQuotasResult clone() {
        try {
            return (ListServiceQuotasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
