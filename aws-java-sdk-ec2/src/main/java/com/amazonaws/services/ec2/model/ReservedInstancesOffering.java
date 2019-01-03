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

/**
 * <p>
 * Describes a Reserved Instance offering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReservedInstancesOffering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstancesOffering implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The duration of the Reserved Instance, in seconds.
     * </p>
     */
    private Long duration;
    /**
     * <p>
     * The purchase price of the Reserved Instance.
     * </p>
     */
    private Float fixedPrice;
    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     */
    private String productDescription;
    /**
     * <p>
     * The ID of the Reserved Instance offering. This is the offering ID used in
     * <a>GetReservedInstancesExchangeQuote</a> to confirm that an exchange can be made.
     * </p>
     */
    private String reservedInstancesOfferingId;
    /**
     * <p>
     * The usage price of the Reserved Instance, per hour.
     * </p>
     */
    private Float usagePrice;
    /**
     * <p>
     * The currency of the Reserved Instance offering you are purchasing. It's specified using ISO 4217 standard
     * currency codes. At this time, the only supported currency is <code>USD</code>.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     */
    private String instanceTenancy;
    /**
     * <p>
     * Indicates whether the offering is available through the Reserved Instance Marketplace (resale) or AWS. If it's a
     * Reserved Instance Marketplace offering, this is <code>true</code>.
     * </p>
     */
    private Boolean marketplace;
    /**
     * <p>
     * If <code>convertible</code> it can be exchanged for Reserved Instances of the same or higher monetary value, with
     * different configurations. If <code>standard</code>, it is not possible to perform an exchange.
     * </p>
     */
    private String offeringClass;
    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     */
    private String offeringType;
    /**
     * <p>
     * The pricing details of the Reserved Instance offering.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PricingDetail> pricingDetails;
    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RecurringCharge> recurringCharges;
    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a region or an Availability Zone.
     * </p>
     */
    private String scope;

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the Reserved Instance can be used.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     * 
     * @return The Availability Zone in which the Reserved Instance can be used.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone in which the Reserved Instance can be used.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone in which the Reserved Instance can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesOffering withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The duration of the Reserved Instance, in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the Reserved Instance, in seconds.
     */

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the Reserved Instance, in seconds.
     * </p>
     * 
     * @return The duration of the Reserved Instance, in seconds.
     */

    public Long getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the Reserved Instance, in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the Reserved Instance, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesOffering withDuration(Long duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The purchase price of the Reserved Instance.
     * </p>
     * 
     * @param fixedPrice
     *        The purchase price of the Reserved Instance.
     */

    public void setFixedPrice(Float fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The purchase price of the Reserved Instance.
     * </p>
     * 
     * @return The purchase price of the Reserved Instance.
     */

    public Float getFixedPrice() {
        return this.fixedPrice;
    }

    /**
     * <p>
     * The purchase price of the Reserved Instance.
     * </p>
     * 
     * @param fixedPrice
     *        The purchase price of the Reserved Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesOffering withFixedPrice(Float fixedPrice) {
        setFixedPrice(fixedPrice);
        return this;
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * 
     * @param instanceType
     *        The instance type on which the Reserved Instance can be used.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * 
     * @return The instance type on which the Reserved Instance can be used.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * 
     * @param instanceType
     *        The instance type on which the Reserved Instance can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public ReservedInstancesOffering withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * 
     * @param instanceType
     *        The instance type on which the Reserved Instance can be used.
     * @see InstanceType
     */

    public void setInstanceType(InstanceType instanceType) {
        withInstanceType(instanceType);
    }

    /**
     * <p>
     * The instance type on which the Reserved Instance can be used.
     * </p>
     * 
     * @param instanceType
     *        The instance type on which the Reserved Instance can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public ReservedInstancesOffering withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * 
     * @param productDescription
     *        The Reserved Instance product platform description.
     * @see RIProductDescription
     */

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * 
     * @return The Reserved Instance product platform description.
     * @see RIProductDescription
     */

    public String getProductDescription() {
        return this.productDescription;
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * 
     * @param productDescription
     *        The Reserved Instance product platform description.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RIProductDescription
     */

    public ReservedInstancesOffering withProductDescription(String productDescription) {
        setProductDescription(productDescription);
        return this;
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * 
     * @param productDescription
     *        The Reserved Instance product platform description.
     * @see RIProductDescription
     */

    public void setProductDescription(RIProductDescription productDescription) {
        withProductDescription(productDescription);
    }

    /**
     * <p>
     * The Reserved Instance product platform description.
     * </p>
     * 
     * @param productDescription
     *        The Reserved Instance product platform description.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RIProductDescription
     */

    public ReservedInstancesOffering withProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Reserved Instance offering. This is the offering ID used in
     * <a>GetReservedInstancesExchangeQuote</a> to confirm that an exchange can be made.
     * </p>
     * 
     * @param reservedInstancesOfferingId
     *        The ID of the Reserved Instance offering. This is the offering ID used in
     *        <a>GetReservedInstancesExchangeQuote</a> to confirm that an exchange can be made.
     */

    public void setReservedInstancesOfferingId(String reservedInstancesOfferingId) {
        this.reservedInstancesOfferingId = reservedInstancesOfferingId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance offering. This is the offering ID used in
     * <a>GetReservedInstancesExchangeQuote</a> to confirm that an exchange can be made.
     * </p>
     * 
     * @return The ID of the Reserved Instance offering. This is the offering ID used in
     *         <a>GetReservedInstancesExchangeQuote</a> to confirm that an exchange can be made.
     */

    public String getReservedInstancesOfferingId() {
        return this.reservedInstancesOfferingId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance offering. This is the offering ID used in
     * <a>GetReservedInstancesExchangeQuote</a> to confirm that an exchange can be made.
     * </p>
     * 
     * @param reservedInstancesOfferingId
     *        The ID of the Reserved Instance offering. This is the offering ID used in
     *        <a>GetReservedInstancesExchangeQuote</a> to confirm that an exchange can be made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesOffering withReservedInstancesOfferingId(String reservedInstancesOfferingId) {
        setReservedInstancesOfferingId(reservedInstancesOfferingId);
        return this;
    }

    /**
     * <p>
     * The usage price of the Reserved Instance, per hour.
     * </p>
     * 
     * @param usagePrice
     *        The usage price of the Reserved Instance, per hour.
     */

    public void setUsagePrice(Float usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The usage price of the Reserved Instance, per hour.
     * </p>
     * 
     * @return The usage price of the Reserved Instance, per hour.
     */

    public Float getUsagePrice() {
        return this.usagePrice;
    }

    /**
     * <p>
     * The usage price of the Reserved Instance, per hour.
     * </p>
     * 
     * @param usagePrice
     *        The usage price of the Reserved Instance, per hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesOffering withUsagePrice(Float usagePrice) {
        setUsagePrice(usagePrice);
        return this;
    }

    /**
     * <p>
     * The currency of the Reserved Instance offering you are purchasing. It's specified using ISO 4217 standard
     * currency codes. At this time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the Reserved Instance offering you are purchasing. It's specified using ISO 4217 standard
     *        currency codes. At this time, the only supported currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency of the Reserved Instance offering you are purchasing. It's specified using ISO 4217 standard
     * currency codes. At this time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @return The currency of the Reserved Instance offering you are purchasing. It's specified using ISO 4217 standard
     *         currency codes. At this time, the only supported currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The currency of the Reserved Instance offering you are purchasing. It's specified using ISO 4217 standard
     * currency codes. At this time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the Reserved Instance offering you are purchasing. It's specified using ISO 4217 standard
     *        currency codes. At this time, the only supported currency is <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public ReservedInstancesOffering withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The currency of the Reserved Instance offering you are purchasing. It's specified using ISO 4217 standard
     * currency codes. At this time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the Reserved Instance offering you are purchasing. It's specified using ISO 4217 standard
     *        currency codes. At this time, the only supported currency is <code>USD</code>.
     * @see CurrencyCodeValues
     */

    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        withCurrencyCode(currencyCode);
    }

    /**
     * <p>
     * The currency of the Reserved Instance offering you are purchasing. It's specified using ISO 4217 standard
     * currency codes. At this time, the only supported currency is <code>USD</code>.
     * </p>
     * 
     * @param currencyCode
     *        The currency of the Reserved Instance offering you are purchasing. It's specified using ISO 4217 standard
     *        currency codes. At this time, the only supported currency is <code>USD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCodeValues
     */

    public ReservedInstancesOffering withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy of the instance.
     * @see Tenancy
     */

    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * 
     * @return The tenancy of the instance.
     * @see Tenancy
     */

    public String getInstanceTenancy() {
        return this.instanceTenancy;
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public ReservedInstancesOffering withInstanceTenancy(String instanceTenancy) {
        setInstanceTenancy(instanceTenancy);
        return this;
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy of the instance.
     * @see Tenancy
     */

    public void setInstanceTenancy(Tenancy instanceTenancy) {
        withInstanceTenancy(instanceTenancy);
    }

    /**
     * <p>
     * The tenancy of the instance.
     * </p>
     * 
     * @param instanceTenancy
     *        The tenancy of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tenancy
     */

    public ReservedInstancesOffering withInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the offering is available through the Reserved Instance Marketplace (resale) or AWS. If it's a
     * Reserved Instance Marketplace offering, this is <code>true</code>.
     * </p>
     * 
     * @param marketplace
     *        Indicates whether the offering is available through the Reserved Instance Marketplace (resale) or AWS. If
     *        it's a Reserved Instance Marketplace offering, this is <code>true</code>.
     */

    public void setMarketplace(Boolean marketplace) {
        this.marketplace = marketplace;
    }

    /**
     * <p>
     * Indicates whether the offering is available through the Reserved Instance Marketplace (resale) or AWS. If it's a
     * Reserved Instance Marketplace offering, this is <code>true</code>.
     * </p>
     * 
     * @return Indicates whether the offering is available through the Reserved Instance Marketplace (resale) or AWS. If
     *         it's a Reserved Instance Marketplace offering, this is <code>true</code>.
     */

    public Boolean getMarketplace() {
        return this.marketplace;
    }

    /**
     * <p>
     * Indicates whether the offering is available through the Reserved Instance Marketplace (resale) or AWS. If it's a
     * Reserved Instance Marketplace offering, this is <code>true</code>.
     * </p>
     * 
     * @param marketplace
     *        Indicates whether the offering is available through the Reserved Instance Marketplace (resale) or AWS. If
     *        it's a Reserved Instance Marketplace offering, this is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesOffering withMarketplace(Boolean marketplace) {
        setMarketplace(marketplace);
        return this;
    }

    /**
     * <p>
     * Indicates whether the offering is available through the Reserved Instance Marketplace (resale) or AWS. If it's a
     * Reserved Instance Marketplace offering, this is <code>true</code>.
     * </p>
     * 
     * @return Indicates whether the offering is available through the Reserved Instance Marketplace (resale) or AWS. If
     *         it's a Reserved Instance Marketplace offering, this is <code>true</code>.
     */

    public Boolean isMarketplace() {
        return this.marketplace;
    }

    /**
     * <p>
     * If <code>convertible</code> it can be exchanged for Reserved Instances of the same or higher monetary value, with
     * different configurations. If <code>standard</code>, it is not possible to perform an exchange.
     * </p>
     * 
     * @param offeringClass
     *        If <code>convertible</code> it can be exchanged for Reserved Instances of the same or higher monetary
     *        value, with different configurations. If <code>standard</code>, it is not possible to perform an exchange.
     * @see OfferingClassType
     */

    public void setOfferingClass(String offeringClass) {
        this.offeringClass = offeringClass;
    }

    /**
     * <p>
     * If <code>convertible</code> it can be exchanged for Reserved Instances of the same or higher monetary value, with
     * different configurations. If <code>standard</code>, it is not possible to perform an exchange.
     * </p>
     * 
     * @return If <code>convertible</code> it can be exchanged for Reserved Instances of the same or higher monetary
     *         value, with different configurations. If <code>standard</code>, it is not possible to perform an
     *         exchange.
     * @see OfferingClassType
     */

    public String getOfferingClass() {
        return this.offeringClass;
    }

    /**
     * <p>
     * If <code>convertible</code> it can be exchanged for Reserved Instances of the same or higher monetary value, with
     * different configurations. If <code>standard</code>, it is not possible to perform an exchange.
     * </p>
     * 
     * @param offeringClass
     *        If <code>convertible</code> it can be exchanged for Reserved Instances of the same or higher monetary
     *        value, with different configurations. If <code>standard</code>, it is not possible to perform an exchange.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingClassType
     */

    public ReservedInstancesOffering withOfferingClass(String offeringClass) {
        setOfferingClass(offeringClass);
        return this;
    }

    /**
     * <p>
     * If <code>convertible</code> it can be exchanged for Reserved Instances of the same or higher monetary value, with
     * different configurations. If <code>standard</code>, it is not possible to perform an exchange.
     * </p>
     * 
     * @param offeringClass
     *        If <code>convertible</code> it can be exchanged for Reserved Instances of the same or higher monetary
     *        value, with different configurations. If <code>standard</code>, it is not possible to perform an exchange.
     * @see OfferingClassType
     */

    public void setOfferingClass(OfferingClassType offeringClass) {
        withOfferingClass(offeringClass);
    }

    /**
     * <p>
     * If <code>convertible</code> it can be exchanged for Reserved Instances of the same or higher monetary value, with
     * different configurations. If <code>standard</code>, it is not possible to perform an exchange.
     * </p>
     * 
     * @param offeringClass
     *        If <code>convertible</code> it can be exchanged for Reserved Instances of the same or higher monetary
     *        value, with different configurations. If <code>standard</code>, it is not possible to perform an exchange.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingClassType
     */

    public ReservedInstancesOffering withOfferingClass(OfferingClassType offeringClass) {
        this.offeringClass = offeringClass.toString();
        return this;
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * 
     * @param offeringType
     *        The Reserved Instance offering type.
     * @see OfferingTypeValues
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * 
     * @return The Reserved Instance offering type.
     * @see OfferingTypeValues
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * 
     * @param offeringType
     *        The Reserved Instance offering type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingTypeValues
     */

    public ReservedInstancesOffering withOfferingType(String offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * 
     * @param offeringType
     *        The Reserved Instance offering type.
     * @see OfferingTypeValues
     */

    public void setOfferingType(OfferingTypeValues offeringType) {
        withOfferingType(offeringType);
    }

    /**
     * <p>
     * The Reserved Instance offering type.
     * </p>
     * 
     * @param offeringType
     *        The Reserved Instance offering type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferingTypeValues
     */

    public ReservedInstancesOffering withOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
        return this;
    }

    /**
     * <p>
     * The pricing details of the Reserved Instance offering.
     * </p>
     * 
     * @return The pricing details of the Reserved Instance offering.
     */

    public java.util.List<PricingDetail> getPricingDetails() {
        if (pricingDetails == null) {
            pricingDetails = new com.amazonaws.internal.SdkInternalList<PricingDetail>();
        }
        return pricingDetails;
    }

    /**
     * <p>
     * The pricing details of the Reserved Instance offering.
     * </p>
     * 
     * @param pricingDetails
     *        The pricing details of the Reserved Instance offering.
     */

    public void setPricingDetails(java.util.Collection<PricingDetail> pricingDetails) {
        if (pricingDetails == null) {
            this.pricingDetails = null;
            return;
        }

        this.pricingDetails = new com.amazonaws.internal.SdkInternalList<PricingDetail>(pricingDetails);
    }

    /**
     * <p>
     * The pricing details of the Reserved Instance offering.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPricingDetails(java.util.Collection)} or {@link #withPricingDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param pricingDetails
     *        The pricing details of the Reserved Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesOffering withPricingDetails(PricingDetail... pricingDetails) {
        if (this.pricingDetails == null) {
            setPricingDetails(new com.amazonaws.internal.SdkInternalList<PricingDetail>(pricingDetails.length));
        }
        for (PricingDetail ele : pricingDetails) {
            this.pricingDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The pricing details of the Reserved Instance offering.
     * </p>
     * 
     * @param pricingDetails
     *        The pricing details of the Reserved Instance offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesOffering withPricingDetails(java.util.Collection<PricingDetail> pricingDetails) {
        setPricingDetails(pricingDetails);
        return this;
    }

    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     * 
     * @return The recurring charge tag assigned to the resource.
     */

    public java.util.List<RecurringCharge> getRecurringCharges() {
        if (recurringCharges == null) {
            recurringCharges = new com.amazonaws.internal.SdkInternalList<RecurringCharge>();
        }
        return recurringCharges;
    }

    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charge tag assigned to the resource.
     */

    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }

        this.recurringCharges = new com.amazonaws.internal.SdkInternalList<RecurringCharge>(recurringCharges);
    }

    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecurringCharges(java.util.Collection)} or {@link #withRecurringCharges(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charge tag assigned to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesOffering withRecurringCharges(RecurringCharge... recurringCharges) {
        if (this.recurringCharges == null) {
            setRecurringCharges(new com.amazonaws.internal.SdkInternalList<RecurringCharge>(recurringCharges.length));
        }
        for (RecurringCharge ele : recurringCharges) {
            this.recurringCharges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recurring charge tag assigned to the resource.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring charge tag assigned to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstancesOffering withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
        return this;
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a region or an Availability Zone.
     * </p>
     * 
     * @param scope
     *        Whether the Reserved Instance is applied to instances in a region or an Availability Zone.
     * @see Scope
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a region or an Availability Zone.
     * </p>
     * 
     * @return Whether the Reserved Instance is applied to instances in a region or an Availability Zone.
     * @see Scope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a region or an Availability Zone.
     * </p>
     * 
     * @param scope
     *        Whether the Reserved Instance is applied to instances in a region or an Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public ReservedInstancesOffering withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a region or an Availability Zone.
     * </p>
     * 
     * @param scope
     *        Whether the Reserved Instance is applied to instances in a region or an Availability Zone.
     * @see Scope
     */

    public void setScope(Scope scope) {
        withScope(scope);
    }

    /**
     * <p>
     * Whether the Reserved Instance is applied to instances in a region or an Availability Zone.
     * </p>
     * 
     * @param scope
     *        Whether the Reserved Instance is applied to instances in a region or an Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public ReservedInstancesOffering withScope(Scope scope) {
        this.scope = scope.toString();
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: ").append(getFixedPrice()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getProductDescription() != null)
            sb.append("ProductDescription: ").append(getProductDescription()).append(",");
        if (getReservedInstancesOfferingId() != null)
            sb.append("ReservedInstancesOfferingId: ").append(getReservedInstancesOfferingId()).append(",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: ").append(getUsagePrice()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getInstanceTenancy() != null)
            sb.append("InstanceTenancy: ").append(getInstanceTenancy()).append(",");
        if (getMarketplace() != null)
            sb.append("Marketplace: ").append(getMarketplace()).append(",");
        if (getOfferingClass() != null)
            sb.append("OfferingClass: ").append(getOfferingClass()).append(",");
        if (getOfferingType() != null)
            sb.append("OfferingType: ").append(getOfferingType()).append(",");
        if (getPricingDetails() != null)
            sb.append("PricingDetails: ").append(getPricingDetails()).append(",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: ").append(getRecurringCharges()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedInstancesOffering == false)
            return false;
        ReservedInstancesOffering other = (ReservedInstancesOffering) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null)
            return false;
        if (other.getFixedPrice() != null && other.getFixedPrice().equals(this.getFixedPrice()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getProductDescription() == null ^ this.getProductDescription() == null)
            return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false)
            return false;
        if (other.getReservedInstancesOfferingId() == null ^ this.getReservedInstancesOfferingId() == null)
            return false;
        if (other.getReservedInstancesOfferingId() != null && other.getReservedInstancesOfferingId().equals(this.getReservedInstancesOfferingId()) == false)
            return false;
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null)
            return false;
        if (other.getUsagePrice() != null && other.getUsagePrice().equals(this.getUsagePrice()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null)
            return false;
        if (other.getInstanceTenancy() != null && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false)
            return false;
        if (other.getMarketplace() == null ^ this.getMarketplace() == null)
            return false;
        if (other.getMarketplace() != null && other.getMarketplace().equals(this.getMarketplace()) == false)
            return false;
        if (other.getOfferingClass() == null ^ this.getOfferingClass() == null)
            return false;
        if (other.getOfferingClass() != null && other.getOfferingClass().equals(this.getOfferingClass()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getPricingDetails() == null ^ this.getPricingDetails() == null)
            return false;
        if (other.getPricingDetails() != null && other.getPricingDetails().equals(this.getPricingDetails()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        hashCode = prime * hashCode + ((getReservedInstancesOfferingId() == null) ? 0 : getReservedInstancesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode());
        hashCode = prime * hashCode + ((getMarketplace() == null) ? 0 : getMarketplace().hashCode());
        hashCode = prime * hashCode + ((getOfferingClass() == null) ? 0 : getOfferingClass().hashCode());
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getPricingDetails() == null) ? 0 : getPricingDetails().hashCode());
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public ReservedInstancesOffering clone() {
        try {
            return (ReservedInstancesOffering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
