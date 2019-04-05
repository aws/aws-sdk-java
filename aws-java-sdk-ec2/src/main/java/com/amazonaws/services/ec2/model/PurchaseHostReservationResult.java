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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseHostReservationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code> and <code>totalHourlyPrice</code> amounts are specified.
     * At this time, the only supported currency is <code>USD</code>.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * Describes the details of the purchase.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Purchase> purchase;
    /**
     * <p>
     * The total hourly price of the reservation calculated per hour.
     * </p>
     */
    private String totalHourlyPrice;
    /**
     * <p>
     * The total amount charged to your account when you purchase the reservation.
     * </p>
     */
    private String totalUpfrontPrice;

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to
     *        Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *         see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to
     *         Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information,
     *        see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to
     *        Ensure Idempotency</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseHostReservationResult withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code> and <code>totalHourlyPrice</code> amounts are specified.
     * At this time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>totalUpfrontPrice</code> and <code>totalHourlyPrice</code> amounts are
     *        specified. At this time, the only supported currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code> and <code>totalHourlyPrice</code> amounts are specified.
     * At this time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @return The currency in which the <code>totalUpfrontPrice</code> and <code>totalHourlyPrice</code> amounts are
     *         specified. At this time, the only supported currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code> and <code>totalHourlyPrice</code> amounts are specified.
     * At this time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>totalUpfrontPrice</code> and <code>totalHourlyPrice</code> amounts are
     *        specified. At this time, the only supported currency is <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public PurchaseHostReservationResult withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code> and <code>totalHourlyPrice</code> amounts are specified.
     * At this time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>totalUpfrontPrice</code> and <code>totalHourlyPrice</code> amounts are
     *        specified. At this time, the only supported currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        withCurrencyCode(currencyCode);
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code> and <code>totalHourlyPrice</code> amounts are specified.
     * At this time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>totalUpfrontPrice</code> and <code>totalHourlyPrice</code> amounts are
     *        specified. At this time, the only supported currency is <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public PurchaseHostReservationResult withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * Describes the details of the purchase.
     * </p>
     * 
     * @return Describes the details of the purchase.
     */

    public java.util.List<Purchase> getPurchase() {
        if (purchase == null) {
            purchase = new com.amazonaws.internal.SdkInternalList<Purchase>();
        }
        return purchase;
    }

    /**
     * <p>
     * Describes the details of the purchase.
     * </p>
     * 
     * @param purchase
     *        Describes the details of the purchase.
     */

    public void setPurchase(java.util.Collection<Purchase> purchase) {
        if (purchase == null) {
            this.purchase = null;
            return;
        }

        this.purchase = new com.amazonaws.internal.SdkInternalList<Purchase>(purchase);
    }

    /**
     * <p>
     * Describes the details of the purchase.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPurchase(java.util.Collection)} or {@link #withPurchase(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param purchase
     *        Describes the details of the purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseHostReservationResult withPurchase(Purchase... purchase) {
        if (this.purchase == null) {
            setPurchase(new com.amazonaws.internal.SdkInternalList<Purchase>(purchase.length));
        }
        for (Purchase ele : purchase) {
            this.purchase.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the details of the purchase.
     * </p>
     * 
     * @param purchase
     *        Describes the details of the purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseHostReservationResult withPurchase(java.util.Collection<Purchase> purchase) {
        setPurchase(purchase);
        return this;
    }

    /**
     * <p>
     * The total hourly price of the reservation calculated per hour.
     * </p>
     * 
     * @param totalHourlyPrice
     *        The total hourly price of the reservation calculated per hour.
     */

    public void setTotalHourlyPrice(String totalHourlyPrice) {
        this.totalHourlyPrice = totalHourlyPrice;
    }

    /**
     * <p>
     * The total hourly price of the reservation calculated per hour.
     * </p>
     * 
     * @return The total hourly price of the reservation calculated per hour.
     */

    public String getTotalHourlyPrice() {
        return this.totalHourlyPrice;
    }

    /**
     * <p>
     * The total hourly price of the reservation calculated per hour.
     * </p>
     * 
     * @param totalHourlyPrice
     *        The total hourly price of the reservation calculated per hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseHostReservationResult withTotalHourlyPrice(String totalHourlyPrice) {
        setTotalHourlyPrice(totalHourlyPrice);
        return this;
    }

    /**
     * <p>
     * The total amount charged to your account when you purchase the reservation.
     * </p>
     * 
     * @param totalUpfrontPrice
     *        The total amount charged to your account when you purchase the reservation.
     */

    public void setTotalUpfrontPrice(String totalUpfrontPrice) {
        this.totalUpfrontPrice = totalUpfrontPrice;
    }

    /**
     * <p>
     * The total amount charged to your account when you purchase the reservation.
     * </p>
     * 
     * @return The total amount charged to your account when you purchase the reservation.
     */

    public String getTotalUpfrontPrice() {
        return this.totalUpfrontPrice;
    }

    /**
     * <p>
     * The total amount charged to your account when you purchase the reservation.
     * </p>
     * 
     * @param totalUpfrontPrice
     *        The total amount charged to your account when you purchase the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseHostReservationResult withTotalUpfrontPrice(String totalUpfrontPrice) {
        setTotalUpfrontPrice(totalUpfrontPrice);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getPurchase() != null)
            sb.append("Purchase: ").append(getPurchase()).append(",");
        if (getTotalHourlyPrice() != null)
            sb.append("TotalHourlyPrice: ").append(getTotalHourlyPrice()).append(",");
        if (getTotalUpfrontPrice() != null)
            sb.append("TotalUpfrontPrice: ").append(getTotalUpfrontPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseHostReservationResult == false)
            return false;
        PurchaseHostReservationResult other = (PurchaseHostReservationResult) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getPurchase() == null ^ this.getPurchase() == null)
            return false;
        if (other.getPurchase() != null && other.getPurchase().equals(this.getPurchase()) == false)
            return false;
        if (other.getTotalHourlyPrice() == null ^ this.getTotalHourlyPrice() == null)
            return false;
        if (other.getTotalHourlyPrice() != null && other.getTotalHourlyPrice().equals(this.getTotalHourlyPrice()) == false)
            return false;
        if (other.getTotalUpfrontPrice() == null ^ this.getTotalUpfrontPrice() == null)
            return false;
        if (other.getTotalUpfrontPrice() != null && other.getTotalUpfrontPrice().equals(this.getTotalUpfrontPrice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getPurchase() == null) ? 0 : getPurchase().hashCode());
        hashCode = prime * hashCode + ((getTotalHourlyPrice() == null) ? 0 : getTotalHourlyPrice().hashCode());
        hashCode = prime * hashCode + ((getTotalUpfrontPrice() == null) ? 0 : getTotalUpfrontPrice().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseHostReservationResult clone() {
        try {
            return (PurchaseHostReservationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
