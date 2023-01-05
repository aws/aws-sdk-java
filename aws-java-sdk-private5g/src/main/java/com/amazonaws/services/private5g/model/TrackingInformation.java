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
 * Information about tracking a shipment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/TrackingInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrackingInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tracking number of the shipment.
     * </p>
     */
    private String trackingNumber;

    /**
     * <p>
     * The tracking number of the shipment.
     * </p>
     * 
     * @param trackingNumber
     *        The tracking number of the shipment.
     */

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    /**
     * <p>
     * The tracking number of the shipment.
     * </p>
     * 
     * @return The tracking number of the shipment.
     */

    public String getTrackingNumber() {
        return this.trackingNumber;
    }

    /**
     * <p>
     * The tracking number of the shipment.
     * </p>
     * 
     * @param trackingNumber
     *        The tracking number of the shipment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrackingInformation withTrackingNumber(String trackingNumber) {
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

        if (obj instanceof TrackingInformation == false)
            return false;
        TrackingInformation other = (TrackingInformation) obj;
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

        hashCode = prime * hashCode + ((getTrackingNumber() == null) ? 0 : getTrackingNumber().hashCode());
        return hashCode;
    }

    @Override
    public TrackingInformation clone() {
        try {
            return (TrackingInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.private5g.model.transform.TrackingInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
