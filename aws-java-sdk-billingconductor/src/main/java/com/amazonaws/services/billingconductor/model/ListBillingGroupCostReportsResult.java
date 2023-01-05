/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/ListBillingGroupCostReports"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBillingGroupCostReportsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>BillingGroupCostReportElement</code> retrieved.
     * </p>
     */
    private java.util.List<BillingGroupCostReportElement> billingGroupCostReports;
    /**
     * <p>
     * The pagination token that's used on subsequent calls to get reports.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>BillingGroupCostReportElement</code> retrieved.
     * </p>
     * 
     * @return A list of <code>BillingGroupCostReportElement</code> retrieved.
     */

    public java.util.List<BillingGroupCostReportElement> getBillingGroupCostReports() {
        return billingGroupCostReports;
    }

    /**
     * <p>
     * A list of <code>BillingGroupCostReportElement</code> retrieved.
     * </p>
     * 
     * @param billingGroupCostReports
     *        A list of <code>BillingGroupCostReportElement</code> retrieved.
     */

    public void setBillingGroupCostReports(java.util.Collection<BillingGroupCostReportElement> billingGroupCostReports) {
        if (billingGroupCostReports == null) {
            this.billingGroupCostReports = null;
            return;
        }

        this.billingGroupCostReports = new java.util.ArrayList<BillingGroupCostReportElement>(billingGroupCostReports);
    }

    /**
     * <p>
     * A list of <code>BillingGroupCostReportElement</code> retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBillingGroupCostReports(java.util.Collection)} or
     * {@link #withBillingGroupCostReports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param billingGroupCostReports
     *        A list of <code>BillingGroupCostReportElement</code> retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBillingGroupCostReportsResult withBillingGroupCostReports(BillingGroupCostReportElement... billingGroupCostReports) {
        if (this.billingGroupCostReports == null) {
            setBillingGroupCostReports(new java.util.ArrayList<BillingGroupCostReportElement>(billingGroupCostReports.length));
        }
        for (BillingGroupCostReportElement ele : billingGroupCostReports) {
            this.billingGroupCostReports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>BillingGroupCostReportElement</code> retrieved.
     * </p>
     * 
     * @param billingGroupCostReports
     *        A list of <code>BillingGroupCostReportElement</code> retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBillingGroupCostReportsResult withBillingGroupCostReports(java.util.Collection<BillingGroupCostReportElement> billingGroupCostReports) {
        setBillingGroupCostReports(billingGroupCostReports);
        return this;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get reports.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to get reports.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get reports.
     * </p>
     * 
     * @return The pagination token that's used on subsequent calls to get reports.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's used on subsequent calls to get reports.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's used on subsequent calls to get reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBillingGroupCostReportsResult withNextToken(String nextToken) {
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
        if (getBillingGroupCostReports() != null)
            sb.append("BillingGroupCostReports: ").append(getBillingGroupCostReports()).append(",");
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

        if (obj instanceof ListBillingGroupCostReportsResult == false)
            return false;
        ListBillingGroupCostReportsResult other = (ListBillingGroupCostReportsResult) obj;
        if (other.getBillingGroupCostReports() == null ^ this.getBillingGroupCostReports() == null)
            return false;
        if (other.getBillingGroupCostReports() != null && other.getBillingGroupCostReports().equals(this.getBillingGroupCostReports()) == false)
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

        hashCode = prime * hashCode + ((getBillingGroupCostReports() == null) ? 0 : getBillingGroupCostReports().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBillingGroupCostReportsResult clone() {
        try {
            return (ListBillingGroupCostReportsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
