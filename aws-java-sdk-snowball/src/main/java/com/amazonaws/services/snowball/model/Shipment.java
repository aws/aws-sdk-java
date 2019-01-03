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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <code>Status</code> and <code>TrackingNumber</code> information for an inbound or outbound shipment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/Shipment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Shipment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Status information for a shipment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tracking number for this job. Using this tracking number with your region's carrier's website, you can track
     * a Snowball as the carrier transports it.
     * </p>
     * <p>
     * For India, the carrier is Amazon Logistics. For all other regions, UPS is the carrier.
     * </p>
     */
    private String trackingNumber;

    /**
     * <p>
     * Status information for a shipment.
     * </p>
     * 
     * @param status
     *        Status information for a shipment.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status information for a shipment.
     * </p>
     * 
     * @return Status information for a shipment.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status information for a shipment.
     * </p>
     * 
     * @param status
     *        Status information for a shipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shipment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The tracking number for this job. Using this tracking number with your region's carrier's website, you can track
     * a Snowball as the carrier transports it.
     * </p>
     * <p>
     * For India, the carrier is Amazon Logistics. For all other regions, UPS is the carrier.
     * </p>
     * 
     * @param trackingNumber
     *        The tracking number for this job. Using this tracking number with your region's carrier's website, you can
     *        track a Snowball as the carrier transports it.</p>
     *        <p>
     *        For India, the carrier is Amazon Logistics. For all other regions, UPS is the carrier.
     */

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    /**
     * <p>
     * The tracking number for this job. Using this tracking number with your region's carrier's website, you can track
     * a Snowball as the carrier transports it.
     * </p>
     * <p>
     * For India, the carrier is Amazon Logistics. For all other regions, UPS is the carrier.
     * </p>
     * 
     * @return The tracking number for this job. Using this tracking number with your region's carrier's website, you
     *         can track a Snowball as the carrier transports it.</p>
     *         <p>
     *         For India, the carrier is Amazon Logistics. For all other regions, UPS is the carrier.
     */

    public String getTrackingNumber() {
        return this.trackingNumber;
    }

    /**
     * <p>
     * The tracking number for this job. Using this tracking number with your region's carrier's website, you can track
     * a Snowball as the carrier transports it.
     * </p>
     * <p>
     * For India, the carrier is Amazon Logistics. For all other regions, UPS is the carrier.
     * </p>
     * 
     * @param trackingNumber
     *        The tracking number for this job. Using this tracking number with your region's carrier's website, you can
     *        track a Snowball as the carrier transports it.</p>
     *        <p>
     *        For India, the carrier is Amazon Logistics. For all other regions, UPS is the carrier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Shipment withTrackingNumber(String trackingNumber) {
        setTrackingNumber(trackingNumber);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTrackingNumber() != null)
            sb.append("TrackingNumber: ").append(getTrackingNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Shipment == false)
            return false;
        Shipment other = (Shipment) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTrackingNumber() == null ^ this.getTrackingNumber() == null)
            return false;
        if (other.getTrackingNumber() != null && other.getTrackingNumber().equals(this.getTrackingNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTrackingNumber() == null) ? 0 : getTrackingNumber().hashCode());
        return hashCode;
    }

    @Override
    public Shipment clone() {
        try {
            return (Shipment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.ShipmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
