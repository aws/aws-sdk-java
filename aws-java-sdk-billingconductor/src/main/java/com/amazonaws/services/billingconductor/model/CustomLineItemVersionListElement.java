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
 * A representation of a custom line item version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/billingconductor-2021-07-30/CustomLineItemVersionListElement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomLineItemVersionListElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the custom line item.
     * </p>
     */
    private String name;

    private ListCustomLineItemChargeDetails chargeDetails;
    /**
     * <p>
     * The charge value currency of the custom line item.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * The description of the custom line item.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The product code that’s associated with the custom line item.
     * </p>
     */
    private String productCode;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the billing group that the custom line item applies to.
     * </p>
     */
    private String billingGroupArn;
    /**
     * <p>
     * The time when the custom line item version was created.
     * </p>
     */
    private Long creationTime;
    /**
     * <p>
     * The most recent time that the custom line item version was modified.
     * </p>
     */
    private Long lastModifiedTime;
    /**
     * <p>
     * The number of resources that are associated with the custom line item.
     * </p>
     */
    private Long associationSize;
    /**
     * <p>
     * The start billing period of the custom line item version.
     * </p>
     */
    private String startBillingPeriod;
    /**
     * <p>
     * The end billing period of the custom line item version.
     * </p>
     */
    private String endBillingPeriod;

    /**
     * <p>
     * The name of the custom line item.
     * </p>
     * 
     * @param name
     *        The name of the custom line item.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the custom line item.
     * </p>
     * 
     * @return The name of the custom line item.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the custom line item.
     * </p>
     * 
     * @param name
     *        The name of the custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemVersionListElement withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param chargeDetails
     */

    public void setChargeDetails(ListCustomLineItemChargeDetails chargeDetails) {
        this.chargeDetails = chargeDetails;
    }

    /**
     * @return
     */

    public ListCustomLineItemChargeDetails getChargeDetails() {
        return this.chargeDetails;
    }

    /**
     * @param chargeDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemVersionListElement withChargeDetails(ListCustomLineItemChargeDetails chargeDetails) {
        setChargeDetails(chargeDetails);
        return this;
    }

    /**
     * <p>
     * The charge value currency of the custom line item.
     * </p>
     * 
     * @param currencyCode
     *        The charge value currency of the custom line item.
     * @see CurrencyCode
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The charge value currency of the custom line item.
     * </p>
     * 
     * @return The charge value currency of the custom line item.
     * @see CurrencyCode
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * The charge value currency of the custom line item.
     * </p>
     * 
     * @param currencyCode
     *        The charge value currency of the custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public CustomLineItemVersionListElement withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * The charge value currency of the custom line item.
     * </p>
     * 
     * @param currencyCode
     *        The charge value currency of the custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrencyCode
     */

    public CustomLineItemVersionListElement withCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * The description of the custom line item.
     * </p>
     * 
     * @param description
     *        The description of the custom line item.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the custom line item.
     * </p>
     * 
     * @return The description of the custom line item.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the custom line item.
     * </p>
     * 
     * @param description
     *        The description of the custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemVersionListElement withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The product code that’s associated with the custom line item.
     * </p>
     * 
     * @param productCode
     *        The product code that’s associated with the custom line item.
     */

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * The product code that’s associated with the custom line item.
     * </p>
     * 
     * @return The product code that’s associated with the custom line item.
     */

    public String getProductCode() {
        return this.productCode;
    }

    /**
     * <p>
     * The product code that’s associated with the custom line item.
     * </p>
     * 
     * @param productCode
     *        The product code that’s associated with the custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemVersionListElement withProductCode(String productCode) {
        setProductCode(productCode);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the billing group that the custom line item applies to.
     * </p>
     * 
     * @param billingGroupArn
     *        The Amazon Resource Name (ARN) of the billing group that the custom line item applies to.
     */

    public void setBillingGroupArn(String billingGroupArn) {
        this.billingGroupArn = billingGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the billing group that the custom line item applies to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the billing group that the custom line item applies to.
     */

    public String getBillingGroupArn() {
        return this.billingGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the billing group that the custom line item applies to.
     * </p>
     * 
     * @param billingGroupArn
     *        The Amazon Resource Name (ARN) of the billing group that the custom line item applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemVersionListElement withBillingGroupArn(String billingGroupArn) {
        setBillingGroupArn(billingGroupArn);
        return this;
    }

    /**
     * <p>
     * The time when the custom line item version was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the custom line item version was created.
     */

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the custom line item version was created.
     * </p>
     * 
     * @return The time when the custom line item version was created.
     */

    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the custom line item version was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the custom line item version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemVersionListElement withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The most recent time that the custom line item version was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The most recent time that the custom line item version was modified.
     */

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time that the custom line item version was modified.
     * </p>
     * 
     * @return The most recent time that the custom line item version was modified.
     */

    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The most recent time that the custom line item version was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The most recent time that the custom line item version was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemVersionListElement withLastModifiedTime(Long lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The number of resources that are associated with the custom line item.
     * </p>
     * 
     * @param associationSize
     *        The number of resources that are associated with the custom line item.
     */

    public void setAssociationSize(Long associationSize) {
        this.associationSize = associationSize;
    }

    /**
     * <p>
     * The number of resources that are associated with the custom line item.
     * </p>
     * 
     * @return The number of resources that are associated with the custom line item.
     */

    public Long getAssociationSize() {
        return this.associationSize;
    }

    /**
     * <p>
     * The number of resources that are associated with the custom line item.
     * </p>
     * 
     * @param associationSize
     *        The number of resources that are associated with the custom line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemVersionListElement withAssociationSize(Long associationSize) {
        setAssociationSize(associationSize);
        return this;
    }

    /**
     * <p>
     * The start billing period of the custom line item version.
     * </p>
     * 
     * @param startBillingPeriod
     *        The start billing period of the custom line item version.
     */

    public void setStartBillingPeriod(String startBillingPeriod) {
        this.startBillingPeriod = startBillingPeriod;
    }

    /**
     * <p>
     * The start billing period of the custom line item version.
     * </p>
     * 
     * @return The start billing period of the custom line item version.
     */

    public String getStartBillingPeriod() {
        return this.startBillingPeriod;
    }

    /**
     * <p>
     * The start billing period of the custom line item version.
     * </p>
     * 
     * @param startBillingPeriod
     *        The start billing period of the custom line item version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemVersionListElement withStartBillingPeriod(String startBillingPeriod) {
        setStartBillingPeriod(startBillingPeriod);
        return this;
    }

    /**
     * <p>
     * The end billing period of the custom line item version.
     * </p>
     * 
     * @param endBillingPeriod
     *        The end billing period of the custom line item version.
     */

    public void setEndBillingPeriod(String endBillingPeriod) {
        this.endBillingPeriod = endBillingPeriod;
    }

    /**
     * <p>
     * The end billing period of the custom line item version.
     * </p>
     * 
     * @return The end billing period of the custom line item version.
     */

    public String getEndBillingPeriod() {
        return this.endBillingPeriod;
    }

    /**
     * <p>
     * The end billing period of the custom line item version.
     * </p>
     * 
     * @param endBillingPeriod
     *        The end billing period of the custom line item version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomLineItemVersionListElement withEndBillingPeriod(String endBillingPeriod) {
        setEndBillingPeriod(endBillingPeriod);
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
            sb.append("AssociationSize: ").append(getAssociationSize()).append(",");
        if (getStartBillingPeriod() != null)
            sb.append("StartBillingPeriod: ").append(getStartBillingPeriod()).append(",");
        if (getEndBillingPeriod() != null)
            sb.append("EndBillingPeriod: ").append(getEndBillingPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomLineItemVersionListElement == false)
            return false;
        CustomLineItemVersionListElement other = (CustomLineItemVersionListElement) obj;
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
        if (other.getStartBillingPeriod() == null ^ this.getStartBillingPeriod() == null)
            return false;
        if (other.getStartBillingPeriod() != null && other.getStartBillingPeriod().equals(this.getStartBillingPeriod()) == false)
            return false;
        if (other.getEndBillingPeriod() == null ^ this.getEndBillingPeriod() == null)
            return false;
        if (other.getEndBillingPeriod() != null && other.getEndBillingPeriod().equals(this.getEndBillingPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getChargeDetails() == null) ? 0 : getChargeDetails().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        hashCode = prime * hashCode + ((getBillingGroupArn() == null) ? 0 : getBillingGroupArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getAssociationSize() == null) ? 0 : getAssociationSize().hashCode());
        hashCode = prime * hashCode + ((getStartBillingPeriod() == null) ? 0 : getStartBillingPeriod().hashCode());
        hashCode = prime * hashCode + ((getEndBillingPeriod() == null) ? 0 : getEndBillingPeriod().hashCode());
        return hashCode;
    }

    @Override
    public CustomLineItemVersionListElement clone() {
        try {
            return (CustomLineItemVersionListElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.billingconductor.model.transform.CustomLineItemVersionListElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
