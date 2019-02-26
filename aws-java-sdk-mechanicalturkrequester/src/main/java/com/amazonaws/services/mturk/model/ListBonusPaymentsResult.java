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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ListBonusPayments" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBonusPaymentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of bonus payments on this page in the filtered results list, equivalent to the number of bonus
     * payments being returned by this call.
     * </p>
     */
    private Integer numResults;

    private String nextToken;
    /**
     * <p>
     * A successful request to the ListBonusPayments operation returns a list of BonusPayment objects.
     * </p>
     */
    private java.util.List<BonusPayment> bonusPayments;

    /**
     * <p>
     * The number of bonus payments on this page in the filtered results list, equivalent to the number of bonus
     * payments being returned by this call.
     * </p>
     * 
     * @param numResults
     *        The number of bonus payments on this page in the filtered results list, equivalent to the number of bonus
     *        payments being returned by this call.
     */

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    /**
     * <p>
     * The number of bonus payments on this page in the filtered results list, equivalent to the number of bonus
     * payments being returned by this call.
     * </p>
     * 
     * @return The number of bonus payments on this page in the filtered results list, equivalent to the number of bonus
     *         payments being returned by this call.
     */

    public Integer getNumResults() {
        return this.numResults;
    }

    /**
     * <p>
     * The number of bonus payments on this page in the filtered results list, equivalent to the number of bonus
     * payments being returned by this call.
     * </p>
     * 
     * @param numResults
     *        The number of bonus payments on this page in the filtered results list, equivalent to the number of bonus
     *        payments being returned by this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBonusPaymentsResult withNumResults(Integer numResults) {
        setNumResults(numResults);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBonusPaymentsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A successful request to the ListBonusPayments operation returns a list of BonusPayment objects.
     * </p>
     * 
     * @return A successful request to the ListBonusPayments operation returns a list of BonusPayment objects.
     */

    public java.util.List<BonusPayment> getBonusPayments() {
        return bonusPayments;
    }

    /**
     * <p>
     * A successful request to the ListBonusPayments operation returns a list of BonusPayment objects.
     * </p>
     * 
     * @param bonusPayments
     *        A successful request to the ListBonusPayments operation returns a list of BonusPayment objects.
     */

    public void setBonusPayments(java.util.Collection<BonusPayment> bonusPayments) {
        if (bonusPayments == null) {
            this.bonusPayments = null;
            return;
        }

        this.bonusPayments = new java.util.ArrayList<BonusPayment>(bonusPayments);
    }

    /**
     * <p>
     * A successful request to the ListBonusPayments operation returns a list of BonusPayment objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBonusPayments(java.util.Collection)} or {@link #withBonusPayments(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param bonusPayments
     *        A successful request to the ListBonusPayments operation returns a list of BonusPayment objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBonusPaymentsResult withBonusPayments(BonusPayment... bonusPayments) {
        if (this.bonusPayments == null) {
            setBonusPayments(new java.util.ArrayList<BonusPayment>(bonusPayments.length));
        }
        for (BonusPayment ele : bonusPayments) {
            this.bonusPayments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A successful request to the ListBonusPayments operation returns a list of BonusPayment objects.
     * </p>
     * 
     * @param bonusPayments
     *        A successful request to the ListBonusPayments operation returns a list of BonusPayment objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBonusPaymentsResult withBonusPayments(java.util.Collection<BonusPayment> bonusPayments) {
        setBonusPayments(bonusPayments);
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
        if (getNumResults() != null)
            sb.append("NumResults: ").append(getNumResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getBonusPayments() != null)
            sb.append("BonusPayments: ").append(getBonusPayments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBonusPaymentsResult == false)
            return false;
        ListBonusPaymentsResult other = (ListBonusPaymentsResult) obj;
        if (other.getNumResults() == null ^ this.getNumResults() == null)
            return false;
        if (other.getNumResults() != null && other.getNumResults().equals(this.getNumResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getBonusPayments() == null ^ this.getBonusPayments() == null)
            return false;
        if (other.getBonusPayments() != null && other.getBonusPayments().equals(this.getBonusPayments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumResults() == null) ? 0 : getNumResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getBonusPayments() == null) ? 0 : getBonusPayments().hashCode());
        return hashCode;
    }

    @Override
    public ListBonusPaymentsResult clone() {
        try {
            return (ListBonusPaymentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
