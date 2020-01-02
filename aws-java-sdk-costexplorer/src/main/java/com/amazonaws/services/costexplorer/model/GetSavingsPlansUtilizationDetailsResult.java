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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetSavingsPlansUtilizationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSavingsPlansUtilizationDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Retrieves a single daily or monthly Savings Plans utilization rate and details for your account.
     * </p>
     */
    private java.util.List<SavingsPlansUtilizationDetail> savingsPlansUtilizationDetails;
    /**
     * <p>
     * The total Savings Plans utilization, regardless of time period.
     * </p>
     */
    private SavingsPlansUtilizationAggregates total;

    private DateInterval timePeriod;
    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Retrieves a single daily or monthly Savings Plans utilization rate and details for your account.
     * </p>
     * 
     * @return Retrieves a single daily or monthly Savings Plans utilization rate and details for your account.
     */

    public java.util.List<SavingsPlansUtilizationDetail> getSavingsPlansUtilizationDetails() {
        return savingsPlansUtilizationDetails;
    }

    /**
     * <p>
     * Retrieves a single daily or monthly Savings Plans utilization rate and details for your account.
     * </p>
     * 
     * @param savingsPlansUtilizationDetails
     *        Retrieves a single daily or monthly Savings Plans utilization rate and details for your account.
     */

    public void setSavingsPlansUtilizationDetails(java.util.Collection<SavingsPlansUtilizationDetail> savingsPlansUtilizationDetails) {
        if (savingsPlansUtilizationDetails == null) {
            this.savingsPlansUtilizationDetails = null;
            return;
        }

        this.savingsPlansUtilizationDetails = new java.util.ArrayList<SavingsPlansUtilizationDetail>(savingsPlansUtilizationDetails);
    }

    /**
     * <p>
     * Retrieves a single daily or monthly Savings Plans utilization rate and details for your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSavingsPlansUtilizationDetails(java.util.Collection)} or
     * {@link #withSavingsPlansUtilizationDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param savingsPlansUtilizationDetails
     *        Retrieves a single daily or monthly Savings Plans utilization rate and details for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansUtilizationDetailsResult withSavingsPlansUtilizationDetails(SavingsPlansUtilizationDetail... savingsPlansUtilizationDetails) {
        if (this.savingsPlansUtilizationDetails == null) {
            setSavingsPlansUtilizationDetails(new java.util.ArrayList<SavingsPlansUtilizationDetail>(savingsPlansUtilizationDetails.length));
        }
        for (SavingsPlansUtilizationDetail ele : savingsPlansUtilizationDetails) {
            this.savingsPlansUtilizationDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Retrieves a single daily or monthly Savings Plans utilization rate and details for your account.
     * </p>
     * 
     * @param savingsPlansUtilizationDetails
     *        Retrieves a single daily or monthly Savings Plans utilization rate and details for your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansUtilizationDetailsResult withSavingsPlansUtilizationDetails(
            java.util.Collection<SavingsPlansUtilizationDetail> savingsPlansUtilizationDetails) {
        setSavingsPlansUtilizationDetails(savingsPlansUtilizationDetails);
        return this;
    }

    /**
     * <p>
     * The total Savings Plans utilization, regardless of time period.
     * </p>
     * 
     * @param total
     *        The total Savings Plans utilization, regardless of time period.
     */

    public void setTotal(SavingsPlansUtilizationAggregates total) {
        this.total = total;
    }

    /**
     * <p>
     * The total Savings Plans utilization, regardless of time period.
     * </p>
     * 
     * @return The total Savings Plans utilization, regardless of time period.
     */

    public SavingsPlansUtilizationAggregates getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total Savings Plans utilization, regardless of time period.
     * </p>
     * 
     * @param total
     *        The total Savings Plans utilization, regardless of time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansUtilizationDetailsResult withTotal(SavingsPlansUtilizationAggregates total) {
        setTotal(total);
        return this;
    }

    /**
     * @param timePeriod
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * @return
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * @param timePeriod
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansUtilizationDetailsResult withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @return The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *         from a previous call has more results than the maximum page size.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a
     * previous call has more results than the maximum page size.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results. Amazon Web Services provides the token when the response
     *        from a previous call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSavingsPlansUtilizationDetailsResult withNextToken(String nextToken) {
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
        if (getSavingsPlansUtilizationDetails() != null)
            sb.append("SavingsPlansUtilizationDetails: ").append(getSavingsPlansUtilizationDetails()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod()).append(",");
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

        if (obj instanceof GetSavingsPlansUtilizationDetailsResult == false)
            return false;
        GetSavingsPlansUtilizationDetailsResult other = (GetSavingsPlansUtilizationDetailsResult) obj;
        if (other.getSavingsPlansUtilizationDetails() == null ^ this.getSavingsPlansUtilizationDetails() == null)
            return false;
        if (other.getSavingsPlansUtilizationDetails() != null
                && other.getSavingsPlansUtilizationDetails().equals(this.getSavingsPlansUtilizationDetails()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
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

        hashCode = prime * hashCode + ((getSavingsPlansUtilizationDetails() == null) ? 0 : getSavingsPlansUtilizationDetails().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetSavingsPlansUtilizationDetailsResult clone() {
        try {
            return (GetSavingsPlansUtilizationDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
