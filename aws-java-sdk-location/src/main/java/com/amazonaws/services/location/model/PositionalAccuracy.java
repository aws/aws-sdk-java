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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the level of certainty of the position.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/PositionalAccuracy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PositionalAccuracy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Estimated maximum distance, in meters, between the measured position and the true position of a device, along the
     * Earth's surface.
     * </p>
     */
    private Double horizontal;

    /**
     * <p>
     * Estimated maximum distance, in meters, between the measured position and the true position of a device, along the
     * Earth's surface.
     * </p>
     * 
     * @param horizontal
     *        Estimated maximum distance, in meters, between the measured position and the true position of a device,
     *        along the Earth's surface.
     */

    public void setHorizontal(Double horizontal) {
        this.horizontal = horizontal;
    }

    /**
     * <p>
     * Estimated maximum distance, in meters, between the measured position and the true position of a device, along the
     * Earth's surface.
     * </p>
     * 
     * @return Estimated maximum distance, in meters, between the measured position and the true position of a device,
     *         along the Earth's surface.
     */

    public Double getHorizontal() {
        return this.horizontal;
    }

    /**
     * <p>
     * Estimated maximum distance, in meters, between the measured position and the true position of a device, along the
     * Earth's surface.
     * </p>
     * 
     * @param horizontal
     *        Estimated maximum distance, in meters, between the measured position and the true position of a device,
     *        along the Earth's surface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PositionalAccuracy withHorizontal(Double horizontal) {
        setHorizontal(horizontal);
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
        if (getHorizontal() != null)
            sb.append("Horizontal: ").append(getHorizontal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PositionalAccuracy == false)
            return false;
        PositionalAccuracy other = (PositionalAccuracy) obj;
        if (other.getHorizontal() == null ^ this.getHorizontal() == null)
            return false;
        if (other.getHorizontal() != null && other.getHorizontal().equals(this.getHorizontal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHorizontal() == null) ? 0 : getHorizontal().hashCode());
        return hashCode;
    }

    @Override
    public PositionalAccuracy clone() {
        try {
            return (PositionalAccuracy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.PositionalAccuracyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
