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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an order.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/Order" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Order implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The acknowledgement status of the order.
     * </p>
     */
    private String acknowledgmentStatus;
    /**
     * <p>
     * The creation time of the order.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network associated with this order.
     * </p>
     */
    private String networkArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site associated with this order.
     * </p>
     */
    private String networkSiteArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order.
     * </p>
     */
    private String orderArn;
    /**
     * <p>
     * The shipping address of the order.
     * </p>
     */
    private Address shippingAddress;
    /**
     * <p>
     * The tracking information of the order.
     * </p>
     */
    private java.util.List<TrackingInformation> trackingInformation;

    /**
     * <p>
     * The acknowledgement status of the order.
     * </p>
     * 
     * @param acknowledgmentStatus
     *        The acknowledgement status of the order.
     * @see AcknowledgmentStatus
     */

    public void setAcknowledgmentStatus(String acknowledgmentStatus) {
        this.acknowledgmentStatus = acknowledgmentStatus;
    }

    /**
     * <p>
     * The acknowledgement status of the order.
     * </p>
     * 
     * @return The acknowledgement status of the order.
     * @see AcknowledgmentStatus
     */

    public String getAcknowledgmentStatus() {
        return this.acknowledgmentStatus;
    }

    /**
     * <p>
     * The acknowledgement status of the order.
     * </p>
     * 
     * @param acknowledgmentStatus
     *        The acknowledgement status of the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcknowledgmentStatus
     */

    public Order withAcknowledgmentStatus(String acknowledgmentStatus) {
        setAcknowledgmentStatus(acknowledgmentStatus);
        return this;
    }

    /**
     * <p>
     * The acknowledgement status of the order.
     * </p>
     * 
     * @param acknowledgmentStatus
     *        The acknowledgement status of the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcknowledgmentStatus
     */

    public Order withAcknowledgmentStatus(AcknowledgmentStatus acknowledgmentStatus) {
        this.acknowledgmentStatus = acknowledgmentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The creation time of the order.
     * </p>
     * 
     * @param createdAt
     *        The creation time of the order.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The creation time of the order.
     * </p>
     * 
     * @return The creation time of the order.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The creation time of the order.
     * </p>
     * 
     * @param createdAt
     *        The creation time of the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Order withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network associated with this order.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network associated with this order.
     */

    public void setNetworkArn(String networkArn) {
        this.networkArn = networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network associated with this order.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network associated with this order.
     */

    public String getNetworkArn() {
        return this.networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network associated with this order.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network associated with this order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Order withNetworkArn(String networkArn) {
        setNetworkArn(networkArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site associated with this order.
     * </p>
     * 
     * @param networkSiteArn
     *        The Amazon Resource Name (ARN) of the network site associated with this order.
     */

    public void setNetworkSiteArn(String networkSiteArn) {
        this.networkSiteArn = networkSiteArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site associated with this order.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network site associated with this order.
     */

    public String getNetworkSiteArn() {
        return this.networkSiteArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site associated with this order.
     * </p>
     * 
     * @param networkSiteArn
     *        The Amazon Resource Name (ARN) of the network site associated with this order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Order withNetworkSiteArn(String networkSiteArn) {
        setNetworkSiteArn(networkSiteArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order.
     * </p>
     * 
     * @param orderArn
     *        The Amazon Resource Name (ARN) of the order.
     */

    public void setOrderArn(String orderArn) {
        this.orderArn = orderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the order.
     */

    public String getOrderArn() {
        return this.orderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order.
     * </p>
     * 
     * @param orderArn
     *        The Amazon Resource Name (ARN) of the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Order withOrderArn(String orderArn) {
        setOrderArn(orderArn);
        return this;
    }

    /**
     * <p>
     * The shipping address of the order.
     * </p>
     * 
     * @param shippingAddress
     *        The shipping address of the order.
     */

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * <p>
     * The shipping address of the order.
     * </p>
     * 
     * @return The shipping address of the order.
     */

    public Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     * <p>
     * The shipping address of the order.
     * </p>
     * 
     * @param shippingAddress
     *        The shipping address of the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Order withShippingAddress(Address shippingAddress) {
        setShippingAddress(shippingAddress);
        return this;
    }

    /**
     * <p>
     * The tracking information of the order.
     * </p>
     * 
     * @return The tracking information of the order.
     */

    public java.util.List<TrackingInformation> getTrackingInformation() {
        return trackingInformation;
    }

    /**
     * <p>
     * The tracking information of the order.
     * </p>
     * 
     * @param trackingInformation
     *        The tracking information of the order.
     */

    public void setTrackingInformation(java.util.Collection<TrackingInformation> trackingInformation) {
        if (trackingInformation == null) {
            this.trackingInformation = null;
            return;
        }

        this.trackingInformation = new java.util.ArrayList<TrackingInformation>(trackingInformation);
    }

    /**
     * <p>
     * The tracking information of the order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrackingInformation(java.util.Collection)} or {@link #withTrackingInformation(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param trackingInformation
     *        The tracking information of the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Order withTrackingInformation(TrackingInformation... trackingInformation) {
        if (this.trackingInformation == null) {
            setTrackingInformation(new java.util.ArrayList<TrackingInformation>(trackingInformation.length));
        }
        for (TrackingInformation ele : trackingInformation) {
            this.trackingInformation.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tracking information of the order.
     * </p>
     * 
     * @param trackingInformation
     *        The tracking information of the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Order withTrackingInformation(java.util.Collection<TrackingInformation> trackingInformation) {
        setTrackingInformation(trackingInformation);
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
        if (getAcknowledgmentStatus() != null)
            sb.append("AcknowledgmentStatus: ").append(getAcknowledgmentStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getNetworkArn() != null)
            sb.append("NetworkArn: ").append(getNetworkArn()).append(",");
        if (getNetworkSiteArn() != null)
            sb.append("NetworkSiteArn: ").append(getNetworkSiteArn()).append(",");
        if (getOrderArn() != null)
            sb.append("OrderArn: ").append(getOrderArn()).append(",");
        if (getShippingAddress() != null)
            sb.append("ShippingAddress: ").append(getShippingAddress()).append(",");
        if (getTrackingInformation() != null)
            sb.append("TrackingInformation: ").append(getTrackingInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Order == false)
            return false;
        Order other = (Order) obj;
        if (other.getAcknowledgmentStatus() == null ^ this.getAcknowledgmentStatus() == null)
            return false;
        if (other.getAcknowledgmentStatus() != null && other.getAcknowledgmentStatus().equals(this.getAcknowledgmentStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getNetworkArn() == null ^ this.getNetworkArn() == null)
            return false;
        if (other.getNetworkArn() != null && other.getNetworkArn().equals(this.getNetworkArn()) == false)
            return false;
        if (other.getNetworkSiteArn() == null ^ this.getNetworkSiteArn() == null)
            return false;
        if (other.getNetworkSiteArn() != null && other.getNetworkSiteArn().equals(this.getNetworkSiteArn()) == false)
            return false;
        if (other.getOrderArn() == null ^ this.getOrderArn() == null)
            return false;
        if (other.getOrderArn() != null && other.getOrderArn().equals(this.getOrderArn()) == false)
            return false;
        if (other.getShippingAddress() == null ^ this.getShippingAddress() == null)
            return false;
        if (other.getShippingAddress() != null && other.getShippingAddress().equals(this.getShippingAddress()) == false)
            return false;
        if (other.getTrackingInformation() == null ^ this.getTrackingInformation() == null)
            return false;
        if (other.getTrackingInformation() != null && other.getTrackingInformation().equals(this.getTrackingInformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcknowledgmentStatus() == null) ? 0 : getAcknowledgmentStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getNetworkArn() == null) ? 0 : getNetworkArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkSiteArn() == null) ? 0 : getNetworkSiteArn().hashCode());
        hashCode = prime * hashCode + ((getOrderArn() == null) ? 0 : getOrderArn().hashCode());
        hashCode = prime * hashCode + ((getShippingAddress() == null) ? 0 : getShippingAddress().hashCode());
        hashCode = prime * hashCode + ((getTrackingInformation() == null) ? 0 : getTrackingInformation().hashCode());
        return hashCode;
    }

    @Override
    public Order clone() {
        try {
            return (Order) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.private5g.model.transform.OrderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
