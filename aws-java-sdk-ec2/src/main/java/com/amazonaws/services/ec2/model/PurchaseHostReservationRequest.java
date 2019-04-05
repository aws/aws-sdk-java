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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.PurchaseHostReservationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseHostReservationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<PurchaseHostReservationRequest> {

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
     * The currency in which the <code>totalUpfrontPrice</code>, <code>LimitPrice</code>, and
     * <code>totalHourlyPrice</code> amounts are specified. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation will be associated.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> hostIdSet;
    /**
     * <p>
     * The specified limit is checked against the total upfront cost of the reservation (calculated as the offering's
     * upfront cost multiplied by the host count). If the total upfront cost is greater than the specified price limit,
     * the request fails. This is used to ensure that the purchase does not exceed the expected upfront cost of the
     * purchase. At this time, the only supported currency is <code>USD</code>. For example, to indicate a limit price
     * of USD 100, specify 100.00.
     * </p>
     */
    private String limitPrice;
    /**
     * <p>
     * The ID of the offering.
     * </p>
     */
    private String offeringId;

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

    public PurchaseHostReservationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code>, <code>LimitPrice</code>, and
     * <code>totalHourlyPrice</code> amounts are specified. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>totalUpfrontPrice</code>, <code>LimitPrice</code>, and
     *        <code>totalHourlyPrice</code> amounts are specified. At this time, the only supported currency is
     *        <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code>, <code>LimitPrice</code>, and
     * <code>totalHourlyPrice</code> amounts are specified. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @return The currency in which the <code>totalUpfrontPrice</code>, <code>LimitPrice</code>, and
     *         <code>totalHourlyPrice</code> amounts are specified. At this time, the only supported currency is
     *         <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code>, <code>LimitPrice</code>, and
     * <code>totalHourlyPrice</code> amounts are specified. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>totalUpfrontPrice</code>, <code>LimitPrice</code>, and
     *        <code>totalHourlyPrice</code> amounts are specified. At this time, the only supported currency is
     *        <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public PurchaseHostReservationRequest withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code>, <code>LimitPrice</code>, and
     * <code>totalHourlyPrice</code> amounts are specified. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>totalUpfrontPrice</code>, <code>LimitPrice</code>, and
     *        <code>totalHourlyPrice</code> amounts are specified. At this time, the only supported currency is
     *        <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        withCurrencyCode(currencyCode);
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code>, <code>LimitPrice</code>, and
     * <code>totalHourlyPrice</code> amounts are specified. At this time, the only supported currency is
     * <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency in which the <code>totalUpfrontPrice</code>, <code>LimitPrice</code>, and
     *        <code>totalHourlyPrice</code> amounts are specified. At this time, the only supported currency is
     *        <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public PurchaseHostReservationRequest withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation will be associated.
     * </p>
     * 
     * @return The IDs of the Dedicated Hosts with which the reservation will be associated.
     */

    public java.util.List<String> getHostIdSet() {
        if (hostIdSet == null) {
            hostIdSet = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return hostIdSet;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation will be associated.
     * </p>
     * 
     * @param hostIdSet
     *        The IDs of the Dedicated Hosts with which the reservation will be associated.
     */

    public void setHostIdSet(java.util.Collection<String> hostIdSet) {
        if (hostIdSet == null) {
            this.hostIdSet = null;
            return;
        }

        this.hostIdSet = new com.amazonaws.internal.SdkInternalList<String>(hostIdSet);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation will be associated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHostIdSet(java.util.Collection)} or {@link #withHostIdSet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param hostIdSet
     *        The IDs of the Dedicated Hosts with which the reservation will be associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseHostReservationRequest withHostIdSet(String... hostIdSet) {
        if (this.hostIdSet == null) {
            setHostIdSet(new com.amazonaws.internal.SdkInternalList<String>(hostIdSet.length));
        }
        for (String ele : hostIdSet) {
            this.hostIdSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation will be associated.
     * </p>
     * 
     * @param hostIdSet
     *        The IDs of the Dedicated Hosts with which the reservation will be associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseHostReservationRequest withHostIdSet(java.util.Collection<String> hostIdSet) {
        setHostIdSet(hostIdSet);
        return this;
    }

    /**
     * <p>
     * The specified limit is checked against the total upfront cost of the reservation (calculated as the offering's
     * upfront cost multiplied by the host count). If the total upfront cost is greater than the specified price limit,
     * the request fails. This is used to ensure that the purchase does not exceed the expected upfront cost of the
     * purchase. At this time, the only supported currency is <code>USD</code>. For example, to indicate a limit price
     * of USD 100, specify 100.00.
     * </p>
     * 
     * @param limitPrice
     *        The specified limit is checked against the total upfront cost of the reservation (calculated as the
     *        offering's upfront cost multiplied by the host count). If the total upfront cost is greater than the
     *        specified price limit, the request fails. This is used to ensure that the purchase does not exceed the
     *        expected upfront cost of the purchase. At this time, the only supported currency is <code>USD</code>. For
     *        example, to indicate a limit price of USD 100, specify 100.00.
     */

    public void setLimitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
    }

    /**
     * <p>
     * The specified limit is checked against the total upfront cost of the reservation (calculated as the offering's
     * upfront cost multiplied by the host count). If the total upfront cost is greater than the specified price limit,
     * the request fails. This is used to ensure that the purchase does not exceed the expected upfront cost of the
     * purchase. At this time, the only supported currency is <code>USD</code>. For example, to indicate a limit price
     * of USD 100, specify 100.00.
     * </p>
     * 
     * @return The specified limit is checked against the total upfront cost of the reservation (calculated as the
     *         offering's upfront cost multiplied by the host count). If the total upfront cost is greater than the
     *         specified price limit, the request fails. This is used to ensure that the purchase does not exceed the
     *         expected upfront cost of the purchase. At this time, the only supported currency is <code>USD</code>. For
     *         example, to indicate a limit price of USD 100, specify 100.00.
     */

    public String getLimitPrice() {
        return this.limitPrice;
    }

    /**
     * <p>
     * The specified limit is checked against the total upfront cost of the reservation (calculated as the offering's
     * upfront cost multiplied by the host count). If the total upfront cost is greater than the specified price limit,
     * the request fails. This is used to ensure that the purchase does not exceed the expected upfront cost of the
     * purchase. At this time, the only supported currency is <code>USD</code>. For example, to indicate a limit price
     * of USD 100, specify 100.00.
     * </p>
     * 
     * @param limitPrice
     *        The specified limit is checked against the total upfront cost of the reservation (calculated as the
     *        offering's upfront cost multiplied by the host count). If the total upfront cost is greater than the
     *        specified price limit, the request fails. This is used to ensure that the purchase does not exceed the
     *        expected upfront cost of the purchase. At this time, the only supported currency is <code>USD</code>. For
     *        example, to indicate a limit price of USD 100, specify 100.00.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseHostReservationRequest withLimitPrice(String limitPrice) {
        setLimitPrice(limitPrice);
        return this;
    }

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * 
     * @param offeringId
     *        The ID of the offering.
     */

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * 
     * @return The ID of the offering.
     */

    public String getOfferingId() {
        return this.offeringId;
    }

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * 
     * @param offeringId
     *        The ID of the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseHostReservationRequest withOfferingId(String offeringId) {
        setOfferingId(offeringId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<PurchaseHostReservationRequest> getDryRunRequest() {
        Request<PurchaseHostReservationRequest> request = new PurchaseHostReservationRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getHostIdSet() != null)
            sb.append("HostIdSet: ").append(getHostIdSet()).append(",");
        if (getLimitPrice() != null)
            sb.append("LimitPrice: ").append(getLimitPrice()).append(",");
        if (getOfferingId() != null)
            sb.append("OfferingId: ").append(getOfferingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseHostReservationRequest == false)
            return false;
        PurchaseHostReservationRequest other = (PurchaseHostReservationRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getHostIdSet() == null ^ this.getHostIdSet() == null)
            return false;
        if (other.getHostIdSet() != null && other.getHostIdSet().equals(this.getHostIdSet()) == false)
            return false;
        if (other.getLimitPrice() == null ^ this.getLimitPrice() == null)
            return false;
        if (other.getLimitPrice() != null && other.getLimitPrice().equals(this.getLimitPrice()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getHostIdSet() == null) ? 0 : getHostIdSet().hashCode());
        hashCode = prime * hashCode + ((getLimitPrice() == null) ? 0 : getLimitPrice().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseHostReservationRequest clone() {
        return (PurchaseHostReservationRequest) super.clone();
    }
}
