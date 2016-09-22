/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

/**
 * <p>
 * The ViewBilling response includes the following elements.
 * </p>
 */
public class ViewBillingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more billing records than you specified for <code>MaxItems</code> in the request, submit another
     * request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Parent: <code>BillingRecords</code>
     * </p>
     */
    private String nextPageMarker;
    /**
     * <p>
     * A summary of billing records.
     * </p>
     * <p>
     * Type: Complex type containing a list of billing record summaries.
     * </p>
     * <p>
     * Children: <code>DomainName</code>, <code>Operation</code>, <code>InvoiceId</code>, <code>BillDate</code> and
     * <code>Price</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BillingRecord> billingRecords;

    /**
     * <p>
     * If there are more billing records than you specified for <code>MaxItems</code> in the request, submit another
     * request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Parent: <code>BillingRecords</code>
     * </p>
     * 
     * @param nextPageMarker
     *        If there are more billing records than you specified for <code>MaxItems</code> in the request, submit
     *        another request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>
     *        .</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Parent: <code>BillingRecords</code>
     */

    public void setNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
    }

    /**
     * <p>
     * If there are more billing records than you specified for <code>MaxItems</code> in the request, submit another
     * request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Parent: <code>BillingRecords</code>
     * </p>
     * 
     * @return If there are more billing records than you specified for <code>MaxItems</code> in the request, submit
     *         another request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>
     *         .</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Parent: <code>BillingRecords</code>
     */

    public String getNextPageMarker() {
        return this.nextPageMarker;
    }

    /**
     * <p>
     * If there are more billing records than you specified for <code>MaxItems</code> in the request, submit another
     * request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Parent: <code>BillingRecords</code>
     * </p>
     * 
     * @param nextPageMarker
     *        If there are more billing records than you specified for <code>MaxItems</code> in the request, submit
     *        another request and include the value of <code>NextPageMarker</code> in the value of <code>Marker</code>
     *        .</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Parent: <code>BillingRecords</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewBillingResult withNextPageMarker(String nextPageMarker) {
        setNextPageMarker(nextPageMarker);
        return this;
    }

    /**
     * <p>
     * A summary of billing records.
     * </p>
     * <p>
     * Type: Complex type containing a list of billing record summaries.
     * </p>
     * <p>
     * Children: <code>DomainName</code>, <code>Operation</code>, <code>InvoiceId</code>, <code>BillDate</code> and
     * <code>Price</code>
     * </p>
     * 
     * @return A summary of billing records.</p>
     *         <p>
     *         Type: Complex type containing a list of billing record summaries.
     *         </p>
     *         <p>
     *         Children: <code>DomainName</code>, <code>Operation</code>, <code>InvoiceId</code>, <code>BillDate</code>
     *         and <code>Price</code>
     */

    public java.util.List<BillingRecord> getBillingRecords() {
        if (billingRecords == null) {
            billingRecords = new com.amazonaws.internal.SdkInternalList<BillingRecord>();
        }
        return billingRecords;
    }

    /**
     * <p>
     * A summary of billing records.
     * </p>
     * <p>
     * Type: Complex type containing a list of billing record summaries.
     * </p>
     * <p>
     * Children: <code>DomainName</code>, <code>Operation</code>, <code>InvoiceId</code>, <code>BillDate</code> and
     * <code>Price</code>
     * </p>
     * 
     * @param billingRecords
     *        A summary of billing records.</p>
     *        <p>
     *        Type: Complex type containing a list of billing record summaries.
     *        </p>
     *        <p>
     *        Children: <code>DomainName</code>, <code>Operation</code>, <code>InvoiceId</code>, <code>BillDate</code>
     *        and <code>Price</code>
     */

    public void setBillingRecords(java.util.Collection<BillingRecord> billingRecords) {
        if (billingRecords == null) {
            this.billingRecords = null;
            return;
        }

        this.billingRecords = new com.amazonaws.internal.SdkInternalList<BillingRecord>(billingRecords);
    }

    /**
     * <p>
     * A summary of billing records.
     * </p>
     * <p>
     * Type: Complex type containing a list of billing record summaries.
     * </p>
     * <p>
     * Children: <code>DomainName</code>, <code>Operation</code>, <code>InvoiceId</code>, <code>BillDate</code> and
     * <code>Price</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBillingRecords(java.util.Collection)} or {@link #withBillingRecords(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param billingRecords
     *        A summary of billing records.</p>
     *        <p>
     *        Type: Complex type containing a list of billing record summaries.
     *        </p>
     *        <p>
     *        Children: <code>DomainName</code>, <code>Operation</code>, <code>InvoiceId</code>, <code>BillDate</code>
     *        and <code>Price</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewBillingResult withBillingRecords(BillingRecord... billingRecords) {
        if (this.billingRecords == null) {
            setBillingRecords(new com.amazonaws.internal.SdkInternalList<BillingRecord>(billingRecords.length));
        }
        for (BillingRecord ele : billingRecords) {
            this.billingRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A summary of billing records.
     * </p>
     * <p>
     * Type: Complex type containing a list of billing record summaries.
     * </p>
     * <p>
     * Children: <code>DomainName</code>, <code>Operation</code>, <code>InvoiceId</code>, <code>BillDate</code> and
     * <code>Price</code>
     * </p>
     * 
     * @param billingRecords
     *        A summary of billing records.</p>
     *        <p>
     *        Type: Complex type containing a list of billing record summaries.
     *        </p>
     *        <p>
     *        Children: <code>DomainName</code>, <code>Operation</code>, <code>InvoiceId</code>, <code>BillDate</code>
     *        and <code>Price</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ViewBillingResult withBillingRecords(java.util.Collection<BillingRecord> billingRecords) {
        setBillingRecords(billingRecords);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNextPageMarker() != null)
            sb.append("NextPageMarker: " + getNextPageMarker() + ",");
        if (getBillingRecords() != null)
            sb.append("BillingRecords: " + getBillingRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ViewBillingResult == false)
            return false;
        ViewBillingResult other = (ViewBillingResult) obj;
        if (other.getNextPageMarker() == null ^ this.getNextPageMarker() == null)
            return false;
        if (other.getNextPageMarker() != null && other.getNextPageMarker().equals(this.getNextPageMarker()) == false)
            return false;
        if (other.getBillingRecords() == null ^ this.getBillingRecords() == null)
            return false;
        if (other.getBillingRecords() != null && other.getBillingRecords().equals(this.getBillingRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextPageMarker() == null) ? 0 : getNextPageMarker().hashCode());
        hashCode = prime * hashCode + ((getBillingRecords() == null) ? 0 : getBillingRecords().hashCode());
        return hashCode;
    }

    @Override
    public ViewBillingResult clone() {
        try {
            return (ViewBillingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
