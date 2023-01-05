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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A representation of a custom line item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CustomLineItemListElement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomLineItemListElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for custom line items.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The custom line item's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A <code>ListCustomLineItemChargeDetails</code> that describes the charge details of a custom line item.
     * </p>
     */
    private ListCustomLineItemChargeDetails chargeDetails;
    /**
     * <p>
     * The custom line item's charge value currency. Only one of the valid values can be used.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The custom line item's description. This is shown on the Bills page in association with the charge value.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The product code that's associated with the custom line item.
     * </p>
     */
    private String productCode;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to.
     * </p>
     */
    private String billingGroupArn;
    /**
     * <p>
     * The time created.
     * </p>
     */
    private Long creationTime;
    /**
     * <p>
     * The most recent time when the custom line item was modified.
     * </p>
     */
    private Long lastModifiedTime;
    /**
     * <p>
     * The number of resources that are associated to the custom line item.
     * </p>
     */
    private Long associationSize;

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for custom line items.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Names (ARNs) for custom line items.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for custom line items.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) for custom line items.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) for custom line items.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Names (ARNs) for custom line items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemListElement withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The custom line item's name.
     * </p>
     * 
     * @param name
     *        The custom line item's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom line item's name.
     * </p>
     * 
     * @return The custom line item's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The custom line item's name.
     * </p>
     * 
     * @param name
     *        The custom line item's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemListElement withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemChargeDetails</code> that describes the charge details of a custom line item.
     * </p>
     * 
     * @param chargeDetails
     *        A <code>ListCustomLineItemChargeDetails</code> that describes the charge details of a custom line item.
     */

    public void setChargeDetails(ListCustomLineItemChargeDetails chargeDetails) {
        this.chargeDetails = chargeDetails;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemChargeDetails</code> that describes the charge details of a custom line item.
     * </p>
     * 
     * @return A <code>ListCustomLineItemChargeDetails</code> that describes the charge details of a custom line item.
     */

    public ListCustomLineItemChargeDetails getChargeDetails() {
        return this.chargeDetails;
    }

    /**
     * <p>
     * A <code>ListCustomLineItemChargeDetails</code> that describes the charge details of a custom line item.
     * </p>
     * 
     * @param chargeDetails
     *        A <code>ListCustomLineItemChargeDetails</code> that describes the charge details of a custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemListElement withChargeDetails(ListCustomLineItemChargeDetails chargeDetails) {
        setChargeDetails(chargeDetails);
        return this;
    }

    /**
     * <p>
     * The custom line item's charge value currency. Only one of the valid values can be used.
     * </p>
     * 
     * @param currencyCode
     *        The custom line item's charge value currency. Only one of the valid values can be used.
     * @see CurrencyCode
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The custom line item's charge value currency. Only one of the valid values can be used.
     * </p>
     * 
     * @return The custom line item's charge value currency. Only one of the valid values can be used.
     * @see CurrencyCode
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The custom line item's charge value currency. Only one of the valid values can be used.
     * </p>
     * 
     * @param currencyCode
     *        The custom line item's charge value currency. Only one of the valid values can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public CustomLineItemListElement withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The custom line item's charge value currency. Only one of the valid values can be used.
     * </p>
     * 
     * @param currencyCode
     *        The custom line item's charge value currency. Only one of the valid values can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public CustomLineItemListElement withCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * The custom line item's description. This is shown on the Bills page in association with the charge value.
     * </p>
     * 
     * @param description
     *        The custom line item's description. This is shown on the Bills page in association with the charge value.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The custom line item's description. This is shown on the Bills page in association with the charge value.
     * </p>
     * 
     * @return The custom line item's description. This is shown on the Bills page in association with the charge value.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The custom line item's description. This is shown on the Bills page in association with the charge value.
     * </p>
     * 
     * @param description
     *        The custom line item's description. This is shown on the Bills page in association with the charge value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemListElement withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The product code that's associated with the custom line item.
     * </p>
     * 
     * @param productCode
     *        The product code that's associated with the custom line item.
     */

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * The product code that's associated with the custom line item.
     * </p>
     * 
     * @return The product code that's associated with the custom line item.
     */

    public String getProductCode() {
        return this.productCode;
    }

    /**
     * <p>
     * The product code that's associated with the custom line item.
     * </p>
     * 
     * @param productCode
     *        The product code that's associated with the custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemListElement withProductCode(String productCode) {
        setProductCode(productCode);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to.
     * </p>
     * 
     * @param billingGroupArn
     *        The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to.
     */

    public void setBillingGroupArn(String billingGroupArn) {
        this.billingGroupArn = billingGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to.
     */

    public String getBillingGroupArn() {
        return this.billingGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to.
     * </p>
     * 
     * @param billingGroupArn
     *        The Amazon Resource Name (ARN) that references the billing group where the custom line item applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemListElement withBillingGroupArn(String billingGroupArn) {
        setBillingGroupArn(billingGroupArn);
        return this;
    }

    /**
     * <p>
     * The time created.
     * </p>
     * 
     * @param creationTime
     *        The time created.
     */

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time created.
     * </p>
     * 
     * @return The time created.
     */

    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time created.
     * </p>
     * 
     * @param creationTime
     *        The time created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemListElement withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The most recent time when the custom line item was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The most recent time when the custom line item was modified.
     */

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time when the custom line item was modified.
     * </p>
     * 
     * @return The most recent time when the custom line item was modified.
     */

    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time when the custom line item was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The most recent time when the custom line item was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemListElement withLastModifiedTime(Long lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The number of resources that are associated to the custom line item.
     * </p>
     * 
     * @param associationSize
     *        The number of resources that are associated to the custom line item.
     */

    public void setAssociationSize(Long associationSize) {
        this.associationSize = associationSize;
    }

    /**
     * <p>
     * The number of resources that are associated to the custom line item.
     * </p>
     * 
     * @return The number of resources that are associated to the custom line item.
     */

    public Long getAssociationSize() {
        return this.associationSize;
    }

    /**
     * <p>
     * The number of resources that are associated to the custom line item.
     * </p>
     * 
     * @param associationSize
     *        The number of resources that are associated to the custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemListElement withAssociationSize(Long associationSize) {
        setAssociationSize(associationSize);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getChargeDetails() != null)
            sb.append("ChargeDetails: ").append(getChargeDetails()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getProductCode() != null)
            sb.append("ProductCode: ").append(getProductCode()).append(",");
        if (getBillingGroupArn() != null)
            sb.append("BillingGroupArn: ").append(getBillingGroupArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getAssociationSize() != null)
            sb.append("AssociationSize: ").append(getAssociationSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomLineItemListElement == false)
            return false;
        CustomLineItemListElement other = (CustomLineItemListElement) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getChargeDetails() == null ^ this.getChargeDetails() == null)
            return false;
        if (other.getChargeDetails() != null && other.getChargeDetails().equals(this.getChargeDetails()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        if (other.getBillingGroupArn() == null ^ this.getBillingGroupArn() == null)
            return false;
        if (other.getBillingGroupArn() != null && other.getBillingGroupArn().equals(this.getBillingGroupArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getAssociationSize() == null ^ this.getAssociationSize() == null)
            return false;
        if (other.getAssociationSize() != null && other.getAssociationSize().equals(this.getAssociationSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getChargeDetails() == null) ? 0 : getChargeDetails().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        hashCode = prime * hashCode + ((getBillingGroupArn() == null) ? 0 : getBillingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getAssociationSize() == null) ? 0 : getAssociationSize().hashCode());
        return hashCode;
    }

    @Override
    public CustomLineItemListElement clone() {
        try {
            return (CustomLineItemListElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.CustomLineItemListElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
