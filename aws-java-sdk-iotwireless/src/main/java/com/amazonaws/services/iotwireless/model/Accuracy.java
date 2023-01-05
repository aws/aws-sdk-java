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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The accuracy of the estimated position in meters. An empty value indicates that no position data is available. A
 * value of ‘0.0’ value indicates that position data is available. This data corresponds to the position information
 * that you specified instead of the position computed by solver.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/Accuracy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Accuracy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The horizontal accuracy of the estimated position, which is the difference between the estimated location and the
     * actual device location.
     * </p>
     */
    private Float horizontalAccuracy;
    /**
     * <p>
     * The vertical accuracy of the estimated position, which is the difference between the estimated altitude and
     * actual device latitude in meters.
     * </p>
     */
    private Float verticalAccuracy;

    /**
     * <p>
     * The horizontal accuracy of the estimated position, which is the difference between the estimated location and the
     * actual device location.
     * </p>
     * 
     * @param horizontalAccuracy
     *        The horizontal accuracy of the estimated position, which is the difference between the estimated location
     *        and the actual device location.
     */

    public void setHorizontalAccuracy(Float horizontalAccuracy) {
        this.horizontalAccuracy = horizontalAccuracy;
    }

    /**
     * <p>
     * The horizontal accuracy of the estimated position, which is the difference between the estimated location and the
     * actual device location.
     * </p>
     * 
     * @return The horizontal accuracy of the estimated position, which is the difference between the estimated location
     *         and the actual device location.
     */

    public Float getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    /**
     * <p>
     * The horizontal accuracy of the estimated position, which is the difference between the estimated location and the
     * actual device location.
     * </p>
     * 
     * @param horizontalAccuracy
     *        The horizontal accuracy of the estimated position, which is the difference between the estimated location
     *        and the actual device location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Accuracy withHorizontalAccuracy(Float horizontalAccuracy) {
        setHorizontalAccuracy(horizontalAccuracy);
        return this;
    }

    /**
     * <p>
     * The vertical accuracy of the estimated position, which is the difference between the estimated altitude and
     * actual device latitude in meters.
     * </p>
     * 
     * @param verticalAccuracy
     *        The vertical accuracy of the estimated position, which is the difference between the estimated altitude
     *        and actual device latitude in meters.
     */

    public void setVerticalAccuracy(Float verticalAccuracy) {
        this.verticalAccuracy = verticalAccuracy;
    }

    /**
     * <p>
     * The vertical accuracy of the estimated position, which is the difference between the estimated altitude and
     * actual device latitude in meters.
     * </p>
     * 
     * @return The vertical accuracy of the estimated position, which is the difference between the estimated altitude
     *         and actual device latitude in meters.
     */

    public Float getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    /**
     * <p>
     * The vertical accuracy of the estimated position, which is the difference between the estimated altitude and
     * actual device latitude in meters.
     * </p>
     * 
     * @param verticalAccuracy
     *        The vertical accuracy of the estimated position, which is the difference between the estimated altitude
     *        and actual device latitude in meters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Accuracy withVerticalAccuracy(Float verticalAccuracy) {
        setVerticalAccuracy(verticalAccuracy);
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
        if (getHorizontalAccuracy() != null)
            sb.append("HorizontalAccuracy: ").append(getHorizontalAccuracy()).append(",");
        if (getVerticalAccuracy() != null)
            sb.append("VerticalAccuracy: ").append(getVerticalAccuracy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Accuracy == false)
            return false;
        Accuracy other = (Accuracy) obj;
        if (other.getHorizontalAccuracy() == null ^ this.getHorizontalAccuracy() == null)
            return false;
        if (other.getHorizontalAccuracy() != null && other.getHorizontalAccuracy().equals(this.getHorizontalAccuracy()) == false)
            return false;
        if (other.getVerticalAccuracy() == null ^ this.getVerticalAccuracy() == null)
            return false;
        if (other.getVerticalAccuracy() != null && other.getVerticalAccuracy().equals(this.getVerticalAccuracy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHorizontalAccuracy() == null) ? 0 : getHorizontalAccuracy().hashCode());
        hashCode = prime * hashCode + ((getVerticalAccuracy() == null) ? 0 : getVerticalAccuracy().hashCode());
        return hashCode;
    }

    @Override
    public Accuracy clone() {
        try {
            return (Accuracy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.AccuracyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
