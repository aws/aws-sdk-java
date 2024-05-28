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
package com.amazonaws.services.billingconductor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/GetBillingGroupCostReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBillingGroupCostReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of margin summary reports.
     * </p>
     */
    private java.util.List<BillingGroupCostReportResultElement> billingGroupCostReportResults;
    /**
     * <p>
     * The pagination token used on subsequent calls to get reports.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of margin summary reports.
     * </p>
     * 
     * @return The list of margin summary reports.
     */

    public java.util.List<BillingGroupCostReportResultElement> getBillingGroupCostReportResults() {
        return billingGroupCostReportResults;
    }

    /**
     * <p>
     * The list of margin summary reports.
     * </p>
     * 
     * @param billingGroupCostReportResults
     *        The list of margin summary reports.
     */

    public void setBillingGroupCostReportResults(java.util.Collection<BillingGroupCostReportResultElement> billingGroupCostReportResults) {
        if (billingGroupCostReportResults == null) {
            this.billingGroupCostReportResults = null;
            return;
        }

        this.billingGroupCostReportResults = new java.util.ArrayList<BillingGroupCostReportResultElement>(billingGroupCostReportResults);
    }

    /**
     * <p>
     * The list of margin summary reports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBillingGroupCostReportResults(java.util.Collection)} or
     * {@link #withBillingGroupCostReportResults(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param billingGroupCostReportResults
     *        The list of margin summary reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBillingGroupCostReportResult withBillingGroupCostReportResults(BillingGroupCostReportResultElement... billingGroupCostReportResults) {
        if (this.billingGroupCostReportResults == null) {
            setBillingGroupCostReportResults(new java.util.ArrayList<BillingGroupCostReportResultElement>(billingGroupCostReportResults.length));
        }
        for (BillingGroupCostReportResultElement ele : billingGroupCostReportResults) {
            this.billingGroupCostReportResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of margin summary reports.
     * </p>
     * 
     * @param billingGroupCostReportResults
     *        The list of margin summary reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBillingGroupCostReportResult withBillingGroupCostReportResults(
            java.util.Collection<BillingGroupCostReportResultElement> billingGroupCostReportResults) {
        setBillingGroupCostReportResults(billingGroupCostReportResults);
        return this;
    }

    /**
     * <p>
     * The pagination token used on subsequent calls to get reports.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used on subsequent calls to get reports.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used on subsequent calls to get reports.
     * </p>
     * 
     * @return The pagination token used on subsequent calls to get reports.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used on subsequent calls to get reports.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used on subsequent calls to get reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBillingGroupCostReportResult withNextToken(String nextToken) {
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
        if (getBillingGroupCostReportResults() != null)
            sb.append("BillingGroupCostReportResults: ").append(getBillingGroupCostReportResults()).append(",");
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

        if (obj instanceof GetBillingGroupCostReportResult == false)
            return false;
        GetBillingGroupCostReportResult other = (GetBillingGroupCostReportResult) obj;
        if (other.getBillingGroupCostReportResults() == null ^ this.getBillingGroupCostReportResults() == null)
            return false;
        if (other.getBillingGroupCostReportResults() != null
                && other.getBillingGroupCostReportResults().equals(this.getBillingGroupCostReportResults()) == false)
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

        hashCode = prime * hashCode + ((getBillingGroupCostReportResults() == null) ? 0 : getBillingGroupCostReportResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetBillingGroupCostReportResult clone() {
        try {
            return (GetBillingGroupCostReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
