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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a Savings Plan offering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/SavingsPlanOffering" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlanOffering implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the offering.
     * </p>
     */
    private String offeringId;
    /**
     * <p>
     * The product type.
     * </p>
     */
    private java.util.List<String> productTypes;
    /**
     * <p>
     * The plan type.
     * </p>
     */
    private String planType;
    /**
     * <p>
     * The description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The payment option.
     * </p>
     */
    private String paymentOption;
    /**
     * <p>
     * The duration, in seconds.
     * </p>
     */
    private Long durationSeconds;
    /**
     * <p>
     * The currency.
     * </p>
     */
    private String currency;
    /**
     * <p>
     * The service.
     * </p>
     */
    private String serviceCode;
    /**
     * <p>
     * The usage details of the line item in the billing report.
     * </p>
     */
    private String usageType;
    /**
     * <p>
     * The specific AWS operation for the line item in the billing report.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The properties.
     * </p>
     */
    private java.util.List<SavingsPlanOfferingProperty> properties;

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

    public SavingsPlanOffering withOfferingId(String offeringId) {
        setOfferingId(offeringId);
        return this;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * 
     * @return The product type.
     * @see SavingsPlanProductType
     */

    public java.util.List<String> getProductTypes() {
        return productTypes;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * 
     * @param productTypes
     *        The product type.
     * @see SavingsPlanProductType
     */

    public void setProductTypes(java.util.Collection<String> productTypes) {
        if (productTypes == null) {
            this.productTypes = null;
            return;
        }

        this.productTypes = new java.util.ArrayList<String>(productTypes);
    }

    /**
     * <p>
     * The product type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductTypes(java.util.Collection)} or {@link #withProductTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productTypes
     *        The product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanProductType
     */

    public SavingsPlanOffering withProductTypes(String... productTypes) {
        if (this.productTypes == null) {
            setProductTypes(new java.util.ArrayList<String>(productTypes.length));
        }
        for (String ele : productTypes) {
            this.productTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * 
     * @param productTypes
     *        The product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanProductType
     */

    public SavingsPlanOffering withProductTypes(java.util.Collection<String> productTypes) {
        setProductTypes(productTypes);
        return this;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * 
     * @param productTypes
     *        The product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanProductType
     */

    public SavingsPlanOffering withProductTypes(SavingsPlanProductType... productTypes) {
        java.util.ArrayList<String> productTypesCopy = new java.util.ArrayList<String>(productTypes.length);
        for (SavingsPlanProductType value : productTypes) {
            productTypesCopy.add(value.toString());
        }
        if (getProductTypes() == null) {
            setProductTypes(productTypesCopy);
        } else {
            getProductTypes().addAll(productTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param planType
     *        The plan type.
     * @see SavingsPlanType
     */

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @return The plan type.
     * @see SavingsPlanType
     */

    public String getPlanType() {
        return this.planType;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param planType
     *        The plan type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanType
     */

    public SavingsPlanOffering withPlanType(String planType) {
        setPlanType(planType);
        return this;
    }

    /**
     * <p>
     * The plan type.
     * </p>
     * 
     * @param planType
     *        The plan type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanType
     */

    public SavingsPlanOffering withPlanType(SavingsPlanType planType) {
        this.planType = planType.toString();
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @return The description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlanOffering withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @param paymentOption
     *        The payment option.
     * @see SavingsPlanPaymentOption
     */

    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @return The payment option.
     * @see SavingsPlanPaymentOption
     */

    public String getPaymentOption() {
        return this.paymentOption;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @param paymentOption
     *        The payment option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanPaymentOption
     */

    public SavingsPlanOffering withPaymentOption(String paymentOption) {
        setPaymentOption(paymentOption);
        return this;
    }

    /**
     * <p>
     * The payment option.
     * </p>
     * 
     * @param paymentOption
     *        The payment option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanPaymentOption
     */

    public SavingsPlanOffering withPaymentOption(SavingsPlanPaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The duration, in seconds.
     * </p>
     * 
     * @param durationSeconds
     *        The duration, in seconds.
     */

    public void setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds.
     * </p>
     * 
     * @return The duration, in seconds.
     */

    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds.
     * </p>
     * 
     * @param durationSeconds
     *        The duration, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlanOffering withDurationSeconds(Long durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * The currency.
     * </p>
     * 
     * @param currency
     *        The currency.
     * @see CurrencyCode
     */

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * <p>
     * The currency.
     * </p>
     * 
     * @return The currency.
     * @see CurrencyCode
     */

    public String getCurrency() {
        return this.currency;
    }

    /**
     * <p>
     * The currency.
     * </p>
     * 
     * @param currency
     *        The currency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public SavingsPlanOffering withCurrency(String currency) {
        setCurrency(currency);
        return this;
    }

    /**
     * <p>
     * The currency.
     * </p>
     * 
     * @param currency
     *        The currency.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public SavingsPlanOffering withCurrency(CurrencyCode currency) {
        this.currency = currency.toString();
        return this;
    }

    /**
     * <p>
     * The service.
     * </p>
     * 
     * @param serviceCode
     *        The service.
     */

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * <p>
     * The service.
     * </p>
     * 
     * @return The service.
     */

    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * <p>
     * The service.
     * </p>
     * 
     * @param serviceCode
     *        The service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlanOffering withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The usage details of the line item in the billing report.
     * </p>
     * 
     * @param usageType
     *        The usage details of the line item in the billing report.
     */

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    /**
     * <p>
     * The usage details of the line item in the billing report.
     * </p>
     * 
     * @return The usage details of the line item in the billing report.
     */

    public String getUsageType() {
        return this.usageType;
    }

    /**
     * <p>
     * The usage details of the line item in the billing report.
     * </p>
     * 
     * @param usageType
     *        The usage details of the line item in the billing report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlanOffering withUsageType(String usageType) {
        setUsageType(usageType);
        return this;
    }

    /**
     * <p>
     * The specific AWS operation for the line item in the billing report.
     * </p>
     * 
     * @param operation
     *        The specific AWS operation for the line item in the billing report.
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The specific AWS operation for the line item in the billing report.
     * </p>
     * 
     * @return The specific AWS operation for the line item in the billing report.
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The specific AWS operation for the line item in the billing report.
     * </p>
     * 
     * @param operation
     *        The specific AWS operation for the line item in the billing report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlanOffering withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The properties.
     * </p>
     * 
     * @return The properties.
     */

    public java.util.List<SavingsPlanOfferingProperty> getProperties() {
        return properties;
    }

    /**
     * <p>
     * The properties.
     * </p>
     * 
     * @param properties
     *        The properties.
     */

    public void setProperties(java.util.Collection<SavingsPlanOfferingProperty> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }

        this.properties = new java.util.ArrayList<SavingsPlanOfferingProperty>(properties);
    }

    /**
     * <p>
     * The properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProperties(java.util.Collection)} or {@link #withProperties(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param properties
     *        The properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlanOffering withProperties(SavingsPlanOfferingProperty... properties) {
        if (this.properties == null) {
            setProperties(new java.util.ArrayList<SavingsPlanOfferingProperty>(properties.length));
        }
        for (SavingsPlanOfferingProperty ele : properties) {
            this.properties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The properties.
     * </p>
     * 
     * @param properties
     *        The properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlanOffering withProperties(java.util.Collection<SavingsPlanOfferingProperty> properties) {
        setProperties(properties);
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
        if (getOfferingId() != null)
            sb.append("OfferingId: ").append(getOfferingId()).append(",");
        if (getProductTypes() != null)
            sb.append("ProductTypes: ").append(getProductTypes()).append(",");
        if (getPlanType() != null)
            sb.append("PlanType: ").append(getPlanType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: ").append(getPaymentOption()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
        if (getCurrency() != null)
            sb.append("Currency: ").append(getCurrency()).append(",");
        if (getServiceCode() != null)
            sb.append("ServiceCode: ").append(getServiceCode()).append(",");
        if (getUsageType() != null)
            sb.append("UsageType: ").append(getUsageType()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlanOffering == false)
            return false;
        SavingsPlanOffering other = (SavingsPlanOffering) obj;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        if (other.getProductTypes() == null ^ this.getProductTypes() == null)
            return false;
        if (other.getProductTypes() != null && other.getProductTypes().equals(this.getProductTypes()) == false)
            return false;
        if (other.getPlanType() == null ^ this.getPlanType() == null)
            return false;
        if (other.getPlanType() != null && other.getPlanType().equals(this.getPlanType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getCurrency() == null ^ this.getCurrency() == null)
            return false;
        if (other.getCurrency() != null && other.getCurrency().equals(this.getCurrency()) == false)
            return false;
        if (other.getServiceCode() == null ^ this.getServiceCode() == null)
            return false;
        if (other.getServiceCode() != null && other.getServiceCode().equals(this.getServiceCode()) == false)
            return false;
        if (other.getUsageType() == null ^ this.getUsageType() == null)
            return false;
        if (other.getUsageType() != null && other.getUsageType().equals(this.getUsageType()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode + ((getProductTypes() == null) ? 0 : getProductTypes().hashCode());
        hashCode = prime * hashCode + ((getPlanType() == null) ? 0 : getPlanType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getUsageType() == null) ? 0 : getUsageType().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public SavingsPlanOffering clone() {
        try {
            return (SavingsPlanOffering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.savingsplans.model.transform.SavingsPlanOfferingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
