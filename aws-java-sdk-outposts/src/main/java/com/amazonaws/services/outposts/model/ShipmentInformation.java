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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a line item shipment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ShipmentInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShipmentInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tracking number of the shipment.
     * </p>
     */
    private String shipmentTrackingNumber;
    /**
     * <p>
     * The carrier of the shipment.
     * </p>
     */
    private String shipmentCarrier;

    /**
     * <p>
     * The tracking number of the shipment.
     * </p>
     * 
     * @param shipmentTrackingNumber
     *        The tracking number of the shipment.
     */

    public void setShipmentTrackingNumber(String shipmentTrackingNumber) {
        this.shipmentTrackingNumber = shipmentTrackingNumber;
    }

    /**
     * <p>
     * The tracking number of the shipment.
     * </p>
     * 
     * @return The tracking number of the shipment.
     */

    public String getShipmentTrackingNumber() {
        return this.shipmentTrackingNumber;
    }

    /**
     * <p>
     * The tracking number of the shipment.
     * </p>
     * 
     * @param shipmentTrackingNumber
     *        The tracking number of the shipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShipmentInformation withShipmentTrackingNumber(String shipmentTrackingNumber) {
        setShipmentTrackingNumber(shipmentTrackingNumber);
        return this;
    }

    /**
     * <p>
     * The carrier of the shipment.
     * </p>
     * 
     * @param shipmentCarrier
     *        The carrier of the shipment.
     * @see ShipmentCarrier
     */

    public void setShipmentCarrier(String shipmentCarrier) {
        this.shipmentCarrier = shipmentCarrier;
    }

    /**
     * <p>
     * The carrier of the shipment.
     * </p>
     * 
     * @return The carrier of the shipment.
     * @see ShipmentCarrier
     */

    public String getShipmentCarrier() {
        return this.shipmentCarrier;
    }

    /**
     * <p>
     * The carrier of the shipment.
     * </p>
     * 
     * @param shipmentCarrier
     *        The carrier of the shipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShipmentCarrier
     */

    public ShipmentInformation withShipmentCarrier(String shipmentCarrier) {
        setShipmentCarrier(shipmentCarrier);
        return this;
    }

    /**
     * <p>
     * The carrier of the shipment.
     * </p>
     * 
     * @param shipmentCarrier
     *        The carrier of the shipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShipmentCarrier
     */

    public ShipmentInformation withShipmentCarrier(ShipmentCarrier shipmentCarrier) {
        this.shipmentCarrier = shipmentCarrier.toString();
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
        if (getShipmentTrackingNumber() != null)
            sb.append("ShipmentTrackingNumber: ").append(getShipmentTrackingNumber()).append(",");
        if (getShipmentCarrier() != null)
            sb.append("ShipmentCarrier: ").append(getShipmentCarrier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShipmentInformation == false)
            return false;
        ShipmentInformation other = (ShipmentInformation) obj;
        if (other.getShipmentTrackingNumber() == null ^ this.getShipmentTrackingNumber() == null)
            return false;
        if (other.getShipmentTrackingNumber() != null && other.getShipmentTrackingNumber().equals(this.getShipmentTrackingNumber()) == false)
            return false;
        if (other.getShipmentCarrier() == null ^ this.getShipmentCarrier() == null)
            return false;
        if (other.getShipmentCarrier() != null && other.getShipmentCarrier().equals(this.getShipmentCarrier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShipmentTrackingNumber() == null) ? 0 : getShipmentTrackingNumber().hashCode());
        hashCode = prime * hashCode + ((getShipmentCarrier() == null) ? 0 : getShipmentCarrier().hashCode());
        return hashCode;
    }

    @Override
    public ShipmentInformation clone() {
        try {
            return (ShipmentInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.ShipmentInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
