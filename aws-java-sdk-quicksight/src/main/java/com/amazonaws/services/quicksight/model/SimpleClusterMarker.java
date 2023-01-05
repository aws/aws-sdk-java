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
 * The simple cluster marker of the cluster marker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SimpleClusterMarker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimpleClusterMarker implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The color of the simple cluster marker.
     * </p>
     */
    private String color;

    /**
     * <p>
     * The color of the simple cluster marker.
     * </p>
     * 
     * @param color
     *        The color of the simple cluster marker.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <p>
     * The color of the simple cluster marker.
     * </p>
     * 
     * @return The color of the simple cluster marker.
     */

    public String getColor() {
        return this.color;
    }

    /**
     * <p>
     * The color of the simple cluster marker.
     * </p>
     * 
     * @param color
     *        The color of the simple cluster marker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleClusterMarker withColor(String color) {
        setColor(color);
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
        if (getColor() != null)
            sb.append("Color: ").append(getColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimpleClusterMarker == false)
            return false;
        SimpleClusterMarker other = (SimpleClusterMarker) obj;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        return hashCode;
    }

    @Override
    public SimpleClusterMarker clone() {
        try {
            return (SimpleClusterMarker) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SimpleClusterMarkerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
