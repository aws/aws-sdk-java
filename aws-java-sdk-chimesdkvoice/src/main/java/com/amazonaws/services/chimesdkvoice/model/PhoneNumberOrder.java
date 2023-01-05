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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PhoneNumberOrder" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumberOrder implements Serializable, Cloneable, StructuredPojo {

    private String phoneNumberOrderId;

    private String productType;

    private String status;

    private String orderType;

    private java.util.List<OrderedPhoneNumber> orderedPhoneNumbers;

    private java.util.Date createdTimestamp;

    private java.util.Date updatedTimestamp;

    /**
     * @param phoneNumberOrderId
     */

    public void setPhoneNumberOrderId(String phoneNumberOrderId) {
        this.phoneNumberOrderId = phoneNumberOrderId;
    }

    /**
     * @return
     */

    public String getPhoneNumberOrderId() {
        return this.phoneNumberOrderId;
    }

    /**
     * @param phoneNumberOrderId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberOrder withPhoneNumberOrderId(String phoneNumberOrderId) {
        setPhoneNumberOrderId(phoneNumberOrderId);
        return this;
    }

    /**
     * @param productType
     * @see PhoneNumberProductType
     */

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * @return
     * @see PhoneNumberProductType
     */

    public String getProductType() {
        return this.productType;
    }

    /**
     * @param productType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberProductType
     */

    public PhoneNumberOrder withProductType(String productType) {
        setProductType(productType);
        return this;
    }

    /**
     * @param productType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberProductType
     */

    public PhoneNumberOrder withProductType(PhoneNumberProductType productType) {
        this.productType = productType.toString();
        return this;
    }

    /**
     * @param status
     * @see PhoneNumberOrderStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     * @see PhoneNumberOrderStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberOrderStatus
     */

    public PhoneNumberOrder withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberOrderStatus
     */

    public PhoneNumberOrder withStatus(PhoneNumberOrderStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param orderType
     * @see PhoneNumberOrderType
     */

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * @return
     * @see PhoneNumberOrderType
     */

    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @param orderType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberOrderType
     */

    public PhoneNumberOrder withOrderType(String orderType) {
        setOrderType(orderType);
        return this;
    }

    /**
     * @param orderType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberOrderType
     */

    public PhoneNumberOrder withOrderType(PhoneNumberOrderType orderType) {
        this.orderType = orderType.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<OrderedPhoneNumber> getOrderedPhoneNumbers() {
        return orderedPhoneNumbers;
    }

    /**
     * @param orderedPhoneNumbers
     */

    public void setOrderedPhoneNumbers(java.util.Collection<OrderedPhoneNumber> orderedPhoneNumbers) {
        if (orderedPhoneNumbers == null) {
            this.orderedPhoneNumbers = null;
            return;
        }

        this.orderedPhoneNumbers = new java.util.ArrayList<OrderedPhoneNumber>(orderedPhoneNumbers);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrderedPhoneNumbers(java.util.Collection)} or {@link #withOrderedPhoneNumbers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param orderedPhoneNumbers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberOrder withOrderedPhoneNumbers(OrderedPhoneNumber... orderedPhoneNumbers) {
        if (this.orderedPhoneNumbers == null) {
            setOrderedPhoneNumbers(new java.util.ArrayList<OrderedPhoneNumber>(orderedPhoneNumbers.length));
        }
        for (OrderedPhoneNumber ele : orderedPhoneNumbers) {
            this.orderedPhoneNumbers.add(ele);
        }
        return this;
    }

    /**
     * @param orderedPhoneNumbers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberOrder withOrderedPhoneNumbers(java.util.Collection<OrderedPhoneNumber> orderedPhoneNumbers) {
        setOrderedPhoneNumbers(orderedPhoneNumbers);
        return this;
    }

    /**
     * @param createdTimestamp
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * @param createdTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberOrder withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * @param updatedTimestamp
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * @param updatedTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberOrder withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
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
        if (getPhoneNumberOrderId() != null)
            sb.append("PhoneNumberOrderId: ").append(getPhoneNumberOrderId()).append(",");
        if (getProductType() != null)
            sb.append("ProductType: ").append(getProductType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getOrderType() != null)
            sb.append("OrderType: ").append(getOrderType()).append(",");
        if (getOrderedPhoneNumbers() != null)
            sb.append("OrderedPhoneNumbers: ").append(getOrderedPhoneNumbers()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumberOrder == false)
            return false;
        PhoneNumberOrder other = (PhoneNumberOrder) obj;
        if (other.getPhoneNumberOrderId() == null ^ this.getPhoneNumberOrderId() == null)
            return false;
        if (other.getPhoneNumberOrderId() != null && other.getPhoneNumberOrderId().equals(this.getPhoneNumberOrderId()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null && other.getProductType().equals(this.getProductType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOrderType() == null ^ this.getOrderType() == null)
            return false;
        if (other.getOrderType() != null && other.getOrderType().equals(this.getOrderType()) == false)
            return false;
        if (other.getOrderedPhoneNumbers() == null ^ this.getOrderedPhoneNumbers() == null)
            return false;
        if (other.getOrderedPhoneNumbers() != null && other.getOrderedPhoneNumbers().equals(this.getOrderedPhoneNumbers()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumberOrderId() == null) ? 0 : getPhoneNumberOrderId().hashCode());
        hashCode = prime * hashCode + ((getProductType() == null) ? 0 : getProductType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOrderType() == null) ? 0 : getOrderType().hashCode());
        hashCode = prime * hashCode + ((getOrderedPhoneNumbers() == null) ? 0 : getOrderedPhoneNumbers().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public PhoneNumberOrder clone() {
        try {
            return (PhoneNumberOrder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.PhoneNumberOrderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
