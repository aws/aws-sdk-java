/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a request to return a network resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/ReturnInformation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReturnInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replacement order.
     * </p>
     */
    private String replacementOrderArn;
    /**
     * <p>
     * The reason for the return. If the return request did not include a reason for the return, this value is null.
     * </p>
     */
    private String returnReason;
    /**
     * <p>
     * The shipping address.
     * </p>
     */
    private Address shippingAddress;
    /**
     * <p>
     * The URL of the shipping label. The shipping label is available for download only if the status of the network
     * resource is <code>PENDING_RETURN</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/private-networks/latest/userguide/radio-units.html#return-radio-unit">Return a
     * radio unit</a>.
     * </p>
     */
    private String shippingLabel;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replacement order.
     * </p>
     * 
     * @param replacementOrderArn
     *        The Amazon Resource Name (ARN) of the replacement order.
     */

    public void setReplacementOrderArn(String replacementOrderArn) {
        this.replacementOrderArn = replacementOrderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replacement order.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replacement order.
     */

    public String getReplacementOrderArn() {
        return this.replacementOrderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replacement order.
     * </p>
     * 
     * @param replacementOrderArn
     *        The Amazon Resource Name (ARN) of the replacement order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReturnInformation withReplacementOrderArn(String replacementOrderArn) {
        setReplacementOrderArn(replacementOrderArn);
        return this;
    }

    /**
     * <p>
     * The reason for the return. If the return request did not include a reason for the return, this value is null.
     * </p>
     * 
     * @param returnReason
     *        The reason for the return. If the return request did not include a reason for the return, this value is
     *        null.
     */

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    /**
     * <p>
     * The reason for the return. If the return request did not include a reason for the return, this value is null.
     * </p>
     * 
     * @return The reason for the return. If the return request did not include a reason for the return, this value is
     *         null.
     */

    public String getReturnReason() {
        return this.returnReason;
    }

    /**
     * <p>
     * The reason for the return. If the return request did not include a reason for the return, this value is null.
     * </p>
     * 
     * @param returnReason
     *        The reason for the return. If the return request did not include a reason for the return, this value is
     *        null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReturnInformation withReturnReason(String returnReason) {
        setReturnReason(returnReason);
        return this;
    }

    /**
     * <p>
     * The shipping address.
     * </p>
     * 
     * @param shippingAddress
     *        The shipping address.
     */

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * <p>
     * The shipping address.
     * </p>
     * 
     * @return The shipping address.
     */

    public Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     * <p>
     * The shipping address.
     * </p>
     * 
     * @param shippingAddress
     *        The shipping address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReturnInformation withShippingAddress(Address shippingAddress) {
        setShippingAddress(shippingAddress);
        return this;
    }

    /**
     * <p>
     * The URL of the shipping label. The shipping label is available for download only if the status of the network
     * resource is <code>PENDING_RETURN</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/private-networks/latest/userguide/radio-units.html#return-radio-unit">Return a
     * radio unit</a>.
     * </p>
     * 
     * @param shippingLabel
     *        The URL of the shipping label. The shipping label is available for download only if the status of the
     *        network resource is <code>PENDING_RETURN</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/private-networks/latest/userguide/radio-units.html#return-radio-unit"
     *        >Return a radio unit</a>.
     */

    public void setShippingLabel(String shippingLabel) {
        this.shippingLabel = shippingLabel;
    }

    /**
     * <p>
     * The URL of the shipping label. The shipping label is available for download only if the status of the network
     * resource is <code>PENDING_RETURN</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/private-networks/latest/userguide/radio-units.html#return-radio-unit">Return a
     * radio unit</a>.
     * </p>
     * 
     * @return The URL of the shipping label. The shipping label is available for download only if the status of the
     *         network resource is <code>PENDING_RETURN</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/private-networks/latest/userguide/radio-units.html#return-radio-unit"
     *         >Return a radio unit</a>.
     */

    public String getShippingLabel() {
        return this.shippingLabel;
    }

    /**
     * <p>
     * The URL of the shipping label. The shipping label is available for download only if the status of the network
     * resource is <code>PENDING_RETURN</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/private-networks/latest/userguide/radio-units.html#return-radio-unit">Return a
     * radio unit</a>.
     * </p>
     * 
     * @param shippingLabel
     *        The URL of the shipping label. The shipping label is available for download only if the status of the
     *        network resource is <code>PENDING_RETURN</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/private-networks/latest/userguide/radio-units.html#return-radio-unit"
     *        >Return a radio unit</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReturnInformation withShippingLabel(String shippingLabel) {
        setShippingLabel(shippingLabel);
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
        if (getReplacementOrderArn() != null)
            sb.append("ReplacementOrderArn: ").append(getReplacementOrderArn()).append(",");
        if (getReturnReason() != null)
            sb.append("ReturnReason: ").append(getReturnReason()).append(",");
        if (getShippingAddress() != null)
            sb.append("ShippingAddress: ").append(getShippingAddress()).append(",");
        if (getShippingLabel() != null)
            sb.append("ShippingLabel: ").append(getShippingLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReturnInformation == false)
            return false;
        ReturnInformation other = (ReturnInformation) obj;
        if (other.getReplacementOrderArn() == null ^ this.getReplacementOrderArn() == null)
            return false;
        if (other.getReplacementOrderArn() != null && other.getReplacementOrderArn().equals(this.getReplacementOrderArn()) == false)
            return false;
        if (other.getReturnReason() == null ^ this.getReturnReason() == null)
            return false;
        if (other.getReturnReason() != null && other.getReturnReason().equals(this.getReturnReason()) == false)
            return false;
        if (other.getShippingAddress() == null ^ this.getShippingAddress() == null)
            return false;
        if (other.getShippingAddress() != null && other.getShippingAddress().equals(this.getShippingAddress()) == false)
            return false;
        if (other.getShippingLabel() == null ^ this.getShippingLabel() == null)
            return false;
        if (other.getShippingLabel() != null && other.getShippingLabel().equals(this.getShippingLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplacementOrderArn() == null) ? 0 : getReplacementOrderArn().hashCode());
        hashCode = prime * hashCode + ((getReturnReason() == null) ? 0 : getReturnReason().hashCode());
        hashCode = prime * hashCode + ((getShippingAddress() == null) ? 0 : getShippingAddress().hashCode());
        hashCode = prime * hashCode + ((getShippingLabel() == null) ? 0 : getShippingLabel().hashCode());
        return hashCode;
    }

    @Override
    public ReturnInformation clone() {
        try {
            return (ReturnInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.private5g.model.transform.ReturnInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
