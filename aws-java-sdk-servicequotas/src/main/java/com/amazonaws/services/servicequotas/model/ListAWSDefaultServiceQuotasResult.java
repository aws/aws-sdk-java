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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/service-quotas-2019-06-24/ListAWSDefaultServiceQuotas"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAWSDefaultServiceQuotasResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * that indicates that there's more output available. In a subsequent call, set it to the value of the previous
     * call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of the quotas in the account with the AWS default values.
     * </p>
     */
    private java.util.List<ServiceQuota> quotas;

    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * that indicates that there's more output available. In a subsequent call, set it to the value of the previous
     * call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous
     *        request that indicates that there's more output available. In a subsequent call, set it to the value of
     *        the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * that indicates that there's more output available. In a subsequent call, set it to the value of the previous
     * call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @return (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous
     *         request that indicates that there's more output available. In a subsequent call, set it to the value of
     *         the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous request
     * that indicates that there's more output available. In a subsequent call, set it to the value of the previous
     * call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        (Optional) Use this parameter in a request if you receive a <code>NextToken</code> response in a previous
     *        request that indicates that there's more output available. In a subsequent call, set it to the value of
     *        the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAWSDefaultServiceQuotasResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of the quotas in the account with the AWS default values.
     * </p>
     * 
     * @return A list of the quotas in the account with the AWS default values.
     */

    public java.util.List<ServiceQuota> getQuotas() {
        return quotas;
    }

    /**
     * <p>
     * A list of the quotas in the account with the AWS default values.
     * </p>
     * 
     * @param quotas
     *        A list of the quotas in the account with the AWS default values.
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
     * A list of the quotas in the account with the AWS default values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQuotas(java.util.Collection)} or {@link #withQuotas(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param quotas
     *        A list of the quotas in the account with the AWS default values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAWSDefaultServiceQuotasResult withQuotas(ServiceQuota... quotas) {
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
     * A list of the quotas in the account with the AWS default values.
     * </p>
     * 
     * @param quotas
     *        A list of the quotas in the account with the AWS default values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAWSDefaultServiceQuotasResult withQuotas(java.util.Collection<ServiceQuota> quotas) {
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

        if (obj instanceof ListAWSDefaultServiceQuotasResult == false)
            return false;
        ListAWSDefaultServiceQuotasResult other = (ListAWSDefaultServiceQuotasResult) obj;
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
    public ListAWSDefaultServiceQuotasResult clone() {
        try {
            return (ListAWSDefaultServiceQuotasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
