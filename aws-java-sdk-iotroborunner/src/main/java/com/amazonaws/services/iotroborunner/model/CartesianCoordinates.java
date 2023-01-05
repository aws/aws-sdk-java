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
package com.amazonaws.services.iotroborunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Cartesian coordinates in 3D space relative to the RoboRunner origin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-roborunner-2018-05-10/CartesianCoordinates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CartesianCoordinates implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * X coordinate.
     * </p>
     */
    private Double x;
    /**
     * <p>
     * Y coordinate.
     * </p>
     */
    private Double y;
    /**
     * <p>
     * Z coordinate.
     * </p>
     */
    private Double z;

    /**
     * <p>
     * X coordinate.
     * </p>
     * 
     * @param x
     *        X coordinate.
     */

    public void setX(Double x) {
        this.x = x;
    }

    /**
     * <p>
     * X coordinate.
     * </p>
     * 
     * @return X coordinate.
     */

    public Double getX() {
        return this.x;
    }

    /**
     * <p>
     * X coordinate.
     * </p>
     * 
     * @param x
     *        X coordinate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CartesianCoordinates withX(Double x) {
        setX(x);
        return this;
    }

    /**
     * <p>
     * Y coordinate.
     * </p>
     * 
     * @param y
     *        Y coordinate.
     */

    public void setY(Double y) {
        this.y = y;
    }

    /**
     * <p>
     * Y coordinate.
     * </p>
     * 
     * @return Y coordinate.
     */

    public Double getY() {
        return this.y;
    }

    /**
     * <p>
     * Y coordinate.
     * </p>
     * 
     * @param y
     *        Y coordinate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CartesianCoordinates withY(Double y) {
        setY(y);
        return this;
    }

    /**
     * <p>
     * Z coordinate.
     * </p>
     * 
     * @param z
     *        Z coordinate.
     */

    public void setZ(Double z) {
        this.z = z;
    }

    /**
     * <p>
     * Z coordinate.
     * </p>
     * 
     * @return Z coordinate.
     */

    public Double getZ() {
        return this.z;
    }

    /**
     * <p>
     * Z coordinate.
     * </p>
     * 
     * @param z
     *        Z coordinate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CartesianCoordinates withZ(Double z) {
        setZ(z);
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
        if (getX() != null)
            sb.append("X: ").append(getX()).append(",");
        if (getY() != null)
            sb.append("Y: ").append(getY()).append(",");
        if (getZ() != null)
            sb.append("Z: ").append(getZ());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CartesianCoordinates == false)
            return false;
        CartesianCoordinates other = (CartesianCoordinates) obj;
        if (other.getX() == null ^ this.getX() == null)
            return false;
        if (other.getX() != null && other.getX().equals(this.getX()) == false)
            return false;
        if (other.getY() == null ^ this.getY() == null)
            return false;
        if (other.getY() != null && other.getY().equals(this.getY()) == false)
            return false;
        if (other.getZ() == null ^ this.getZ() == null)
            return false;
        if (other.getZ() != null && other.getZ().equals(this.getZ()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getX() == null) ? 0 : getX().hashCode());
        hashCode = prime * hashCode + ((getY() == null) ? 0 : getY().hashCode());
        hashCode = prime * hashCode + ((getZ() == null) ? 0 : getZ().hashCode());
        return hashCode;
    }

    @Override
    public CartesianCoordinates clone() {
        try {
            return (CartesianCoordinates) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotroborunner.model.transform.CartesianCoordinatesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
