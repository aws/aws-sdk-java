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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a phone number order created for Amazon Chime.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PhoneNumberOrder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumberOrder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The phone number order ID.
     * </p>
     */
    private String phoneNumberOrderId;
    /**
     * <p>
     * The phone number order product type.
     * </p>
     */
    private String productType;
    /**
     * <p>
     * The status of the phone number order.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ordered phone number details, such as the phone number in E.164 format and the phone number status.
     * </p>
     */
    private java.util.List<OrderedPhoneNumber> orderedPhoneNumbers;
    /**
     * <p>
     * The phone number order creation timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The updated phone number order timestamp, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The phone number order ID.
     * </p>
     * 
     * @param phoneNumberOrderId
     *        The phone number order ID.
     */

    public void setPhoneNumberOrderId(String phoneNumberOrderId) {
        this.phoneNumberOrderId = phoneNumberOrderId;
    }

    /**
     * <p>
     * The phone number order ID.
     * </p>
     * 
     * @return The phone number order ID.
     */

    public String getPhoneNumberOrderId() {
        return this.phoneNumberOrderId;
    }

    /**
     * <p>
     * The phone number order ID.
     * </p>
     * 
     * @param phoneNumberOrderId
     *        The phone number order ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberOrder withPhoneNumberOrderId(String phoneNumberOrderId) {
        setPhoneNumberOrderId(phoneNumberOrderId);
        return this;
    }

    /**
     * <p>
     * The phone number order product type.
     * </p>
     * 
     * @param productType
     *        The phone number order product type.
     * @see PhoneNumberProductType
     */

    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The phone number order product type.
     * </p>
     * 
     * @return The phone number order product type.
     * @see PhoneNumberProductType
     */

    public String getProductType() {
        return this.productType;
    }

    /**
     * <p>
     * The phone number order product type.
     * </p>
     * 
     * @param productType
     *        The phone number order product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberProductType
     */

    public PhoneNumberOrder withProductType(String productType) {
        setProductType(productType);
        return this;
    }

    /**
     * <p>
     * The phone number order product type.
     * </p>
     * 
     * @param productType
     *        The phone number order product type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberProductType
     */

    public PhoneNumberOrder withProductType(PhoneNumberProductType productType) {
        this.productType = productType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the phone number order.
     * </p>
     * 
     * @param status
     *        The status of the phone number order.
     * @see PhoneNumberOrderStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the phone number order.
     * </p>
     * 
     * @return The status of the phone number order.
     * @see PhoneNumberOrderStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the phone number order.
     * </p>
     * 
     * @param status
     *        The status of the phone number order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberOrderStatus
     */

    public PhoneNumberOrder withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the phone number order.
     * </p>
     * 
     * @param status
     *        The status of the phone number order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberOrderStatus
     */

    public PhoneNumberOrder withStatus(PhoneNumberOrderStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ordered phone number details, such as the phone number in E.164 format and the phone number status.
     * </p>
     * 
     * @return The ordered phone number details, such as the phone number in E.164 format and the phone number status.
     */

    public java.util.List<OrderedPhoneNumber> getOrderedPhoneNumbers() {
        return orderedPhoneNumbers;
    }

    /**
     * <p>
     * The ordered phone number details, such as the phone number in E.164 format and the phone number status.
     * </p>
     * 
     * @param orderedPhoneNumbers
     *        The ordered phone number details, such as the phone number in E.164 format and the phone number status.
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
     * The ordered phone number details, such as the phone number in E.164 format and the phone number status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrderedPhoneNumbers(java.util.Collection)} or {@link #withOrderedPhoneNumbers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param orderedPhoneNumbers
     *        The ordered phone number details, such as the phone number in E.164 format and the phone number status.
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
     * <p>
     * The ordered phone number details, such as the phone number in E.164 format and the phone number status.
     * </p>
     * 
     * @param orderedPhoneNumbers
     *        The ordered phone number details, such as the phone number in E.164 format and the phone number status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberOrder withOrderedPhoneNumbers(java.util.Collection<OrderedPhoneNumber> orderedPhoneNumbers) {
        setOrderedPhoneNumbers(orderedPhoneNumbers);
        return this;
    }

    /**
     * <p>
     * The phone number order creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The phone number order creation timestamp, in ISO 8601 format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The phone number order creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The phone number order creation timestamp, in ISO 8601 format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The phone number order creation timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param createdTimestamp
     *        The phone number order creation timestamp, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberOrder withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The updated phone number order timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The updated phone number order timestamp, in ISO 8601 format.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The updated phone number order timestamp, in ISO 8601 format.
     * </p>
     * 
     * @return The updated phone number order timestamp, in ISO 8601 format.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The updated phone number order timestamp, in ISO 8601 format.
     * </p>
     * 
     * @param updatedTimestamp
     *        The updated phone number order timestamp, in ISO 8601 format.
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
        com.amazonaws.services.chime.model.transform.PhoneNumberOrderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
