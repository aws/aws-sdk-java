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
 * Information about a Savings Plan offering rate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/savingsplans-2019-06-28/SavingsPlanOfferingRate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlanOfferingRate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Savings Plan offering.
     * </p>
     */
    private ParentSavingsPlanOffering savingsPlanOffering;
    /**
     * <p>
     * The Savings Plan rate.
     * </p>
     */
    private String rate;
    /**
     * <p>
     * The unit.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The product type.
     * </p>
     */
    private String productType;
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
    private java.util.List<SavingsPlanOfferingRateProperty> properties;

    /**
     * <p>
     * The Savings Plan offering.
     * </p>
     * 
     * @param savingsPlanOffering
     *        The Savings Plan offering.
     */

    public void setSavingsPlanOffering(ParentSavingsPlanOffering savingsPlanOffering) {
        this.savingsPlanOffering = savingsPlanOffering;
    }

    /**
     * <p>
     * The Savings Plan offering.
     * </p>
     * 
     * @return The Savings Plan offering.
     */

    public ParentSavingsPlanOffering getSavingsPlanOffering() {
        return this.savingsPlanOffering;
    }

    /**
     * <p>
     * The Savings Plan offering.
     * </p>
     * 
     * @param savingsPlanOffering
     *        The Savings Plan offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlanOfferingRate withSavingsPlanOffering(ParentSavingsPlanOffering savingsPlanOffering) {
        setSavingsPlanOffering(savingsPlanOffering);
        return this;
    }

    /**
     * <p>
     * The Savings Plan rate.
     * </p>
     * 
     * @param rate
     *        The Savings Plan rate.
     */

    public void setRate(String rate) {
        this.rate = rate;
    }

    /**
     * <p>
     * The Savings Plan rate.
     * </p>
     * 
     * @return The Savings Plan rate.
     */

    public String getRate() {
        return this.rate;
    }

    /**
     * <p>
     * The Savings Plan rate.
     * </p>
     * 
     * @param rate
     *        The Savings Plan rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SavingsPlanOfferingRate withRate(String rate) {
        setRate(rate);
        return this;
    }

    /**
     * <p>
     * The unit.
     * </p>
     * 
     * @param unit
     *        The unit.
     * @see SavingsPlanRateUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit.
     * </p>
     * 
     * @return The unit.
     * @see SavingsPlanRateUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit.
     * </p>
     * 
     * @param unit
     *        The unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanRateUnit
     */

    public SavingsPlanOfferingRate withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit.
     * </p>
     * 
     * @param unit
     *        The unit.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanRateUnit
     */

    public SavingsPlanOfferingRate withUnit(SavingsPlanRateUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * 
     * @param productType
     *        The product type.
     * @see SavingsPlanProductType
     */

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * 
     * @return The product type.
     * @see SavingsPlanProductType
     */

    public String getProductType() {
        return this.productType;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * 
     * @param productType
     *        The product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanProductType
     */

    public SavingsPlanOfferingRate withProductType(String productType) {
        setProductType(productType);
        return this;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * 
     * @param productType
     *        The product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanProductType
     */

    public SavingsPlanOfferingRate withProductType(SavingsPlanProductType productType) {
        this.productType = productType.toString();
        return this;
    }

    /**
     * <p>
     * The service.
     * </p>
     * 
     * @param serviceCode
     *        The service.
     * @see SavingsPlanRateServiceCode
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
     * @see SavingsPlanRateServiceCode
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
     * @see SavingsPlanRateServiceCode
     */

    public SavingsPlanOfferingRate withServiceCode(String serviceCode) {
        setServiceCode(serviceCode);
        return this;
    }

    /**
     * <p>
     * The service.
     * </p>
     * 
     * @param serviceCode
     *        The service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SavingsPlanRateServiceCode
     */

    public SavingsPlanOfferingRate withServiceCode(SavingsPlanRateServiceCode serviceCode) {
        this.serviceCode = serviceCode.toString();
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

    public SavingsPlanOfferingRate withUsageType(String usageType) {
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

    public SavingsPlanOfferingRate withOperation(String operation) {
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

    public java.util.List<SavingsPlanOfferingRateProperty> getProperties() {
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

    public void setProperties(java.util.Collection<SavingsPlanOfferingRateProperty> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }

        this.properties = new java.util.ArrayList<SavingsPlanOfferingRateProperty>(properties);
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

    public SavingsPlanOfferingRate withProperties(SavingsPlanOfferingRateProperty... properties) {
        if (this.properties == null) {
            setProperties(new java.util.ArrayList<SavingsPlanOfferingRateProperty>(properties.length));
        }
        for (SavingsPlanOfferingRateProperty ele : properties) {
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

    public SavingsPlanOfferingRate withProperties(java.util.Collection<SavingsPlanOfferingRateProperty> properties) {
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
        if (getSavingsPlanOffering() != null)
            sb.append("SavingsPlanOffering: ").append(getSavingsPlanOffering()).append(",");
        if (getRate() != null)
            sb.append("Rate: ").append(getRate()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getProductType() != null)
            sb.append("ProductType: ").append(getProductType()).append(",");
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

        if (obj instanceof SavingsPlanOfferingRate == false)
            return false;
        SavingsPlanOfferingRate other = (SavingsPlanOfferingRate) obj;
        if (other.getSavingsPlanOffering() == null ^ this.getSavingsPlanOffering() == null)
            return false;
        if (other.getSavingsPlanOffering() != null && other.getSavingsPlanOffering().equals(this.getSavingsPlanOffering()) == false)
            return false;
        if (other.getRate() == null ^ this.getRate() == null)
            return false;
        if (other.getRate() != null && other.getRate().equals(this.getRate()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null && other.getProductType().equals(this.getProductType()) == false)
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

        hashCode = prime * hashCode + ((getSavingsPlanOffering() == null) ? 0 : getSavingsPlanOffering().hashCode());
        hashCode = prime * hashCode + ((getRate() == null) ? 0 : getRate().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getProductType() == null) ? 0 : getProductType().hashCode());
        hashCode = prime * hashCode + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        hashCode = prime * hashCode + ((getUsageType() == null) ? 0 : getUsageType().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public SavingsPlanOfferingRate clone() {
        try {
            return (SavingsPlanOfferingRate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.savingsplans.model.transform.SavingsPlanOfferingRateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
