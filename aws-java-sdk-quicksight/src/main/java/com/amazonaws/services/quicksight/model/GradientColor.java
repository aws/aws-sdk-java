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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Determines the gradient color settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GradientColor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GradientColor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of gradient color stops.
     * </p>
     */
    private java.util.List<GradientStop> stops;

    /**
     * <p>
     * The list of gradient color stops.
     * </p>
     * 
     * @return The list of gradient color stops.
     */

    public java.util.List<GradientStop> getStops() {
        return stops;
    }

    /**
     * <p>
     * The list of gradient color stops.
     * </p>
     * 
     * @param stops
     *        The list of gradient color stops.
     */

    public void setStops(java.util.Collection<GradientStop> stops) {
        if (stops == null) {
            this.stops = null;
            return;
        }

        this.stops = new java.util.ArrayList<GradientStop>(stops);
    }

    /**
     * <p>
     * The list of gradient color stops.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStops(java.util.Collection)} or {@link #withStops(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param stops
     *        The list of gradient color stops.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GradientColor withStops(GradientStop... stops) {
        if (this.stops == null) {
            setStops(new java.util.ArrayList<GradientStop>(stops.length));
        }
        for (GradientStop ele : stops) {
            this.stops.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of gradient color stops.
     * </p>
     * 
     * @param stops
     *        The list of gradient color stops.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GradientColor withStops(java.util.Collection<GradientStop> stops) {
        setStops(stops);
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
        if (getStops() != null)
            sb.append("Stops: ").append(getStops());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GradientColor == false)
            return false;
        GradientColor other = (GradientColor) obj;
        if (other.getStops() == null ^ this.getStops() == null)
            return false;
        if (other.getStops() != null && other.getStops().equals(this.getStops()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStops() == null) ? 0 : getStops().hashCode());
        return hashCode;
    }

    @Override
    public GradientColor clone() {
        try {
            return (GradientColor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GradientColorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
