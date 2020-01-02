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
package com.amazonaws.services.savingsplans.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/DescribeSavingsPlans" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSavingsPlansResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the Savings Plans.
     * </p>
     */
    private java.util.List<SavingsPlan> savingsPlans;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the Savings Plans.
     * </p>
     * 
     * @return Information about the Savings Plans.
     */

    public java.util.List<SavingsPlan> getSavingsPlans() {
        return savingsPlans;
    }

    /**
     * <p>
     * Information about the Savings Plans.
     * </p>
     * 
     * @param savingsPlans
     *        Information about the Savings Plans.
     */

    public void setSavingsPlans(java.util.Collection<SavingsPlan> savingsPlans) {
        if (savingsPlans == null) {
            this.savingsPlans = null;
            return;
        }

        this.savingsPlans = new java.util.ArrayList<SavingsPlan>(savingsPlans);
    }

    /**
     * <p>
     * Information about the Savings Plans.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSavingsPlans(java.util.Collection)} or {@link #withSavingsPlans(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param savingsPlans
     *        Information about the Savings Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansResult withSavingsPlans(SavingsPlan... savingsPlans) {
        if (this.savingsPlans == null) {
            setSavingsPlans(new java.util.ArrayList<SavingsPlan>(savingsPlans.length));
        }
        for (SavingsPlan ele : savingsPlans) {
            this.savingsPlans.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Savings Plans.
     * </p>
     * 
     * @param savingsPlans
     *        Information about the Savings Plans.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSavingsPlansResult withSavingsPlans(java.util.Collection<SavingsPlan> savingsPlans) {
        setSavingsPlans(savingsPlans);
        return this;
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

    public DescribeSavingsPlansResult withNextToken(String nextToken) {
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
        if (getSavingsPlans() != null)
            sb.append("SavingsPlans: ").append(getSavingsPlans()).append(",");
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

        if (obj instanceof DescribeSavingsPlansResult == false)
            return false;
        DescribeSavingsPlansResult other = (DescribeSavingsPlansResult) obj;
        if (other.getSavingsPlans() == null ^ this.getSavingsPlans() == null)
            return false;
        if (other.getSavingsPlans() != null && other.getSavingsPlans().equals(this.getSavingsPlans()) == false)
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

        hashCode = prime * hashCode + ((getSavingsPlans() == null) ? 0 : getSavingsPlans().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSavingsPlansResult clone() {
        try {
            return (DescribeSavingsPlansResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
