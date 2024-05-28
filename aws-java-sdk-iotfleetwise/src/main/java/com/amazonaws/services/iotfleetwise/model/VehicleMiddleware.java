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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The vehicle middleware defined as a type of network interface. Examples of vehicle middleware include
 * <code>ROS2</code> and <code>SOME/IP</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/VehicleMiddleware" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VehicleMiddleware implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the vehicle middleware.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The protocol name of the vehicle middleware.
     * </p>
     */
    private String protocolName;

    /**
     * <p>
     * The name of the vehicle middleware.
     * </p>
     * 
     * @param name
     *        The name of the vehicle middleware.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the vehicle middleware.
     * </p>
     * 
     * @return The name of the vehicle middleware.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the vehicle middleware.
     * </p>
     * 
     * @param name
     *        The name of the vehicle middleware.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VehicleMiddleware withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The protocol name of the vehicle middleware.
     * </p>
     * 
     * @param protocolName
     *        The protocol name of the vehicle middleware.
     * @see VehicleMiddlewareProtocol
     */

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }

    /**
     * <p>
     * The protocol name of the vehicle middleware.
     * </p>
     * 
     * @return The protocol name of the vehicle middleware.
     * @see VehicleMiddlewareProtocol
     */

    public String getProtocolName() {
        return this.protocolName;
    }

    /**
     * <p>
     * The protocol name of the vehicle middleware.
     * </p>
     * 
     * @param protocolName
     *        The protocol name of the vehicle middleware.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VehicleMiddlewareProtocol
     */

    public VehicleMiddleware withProtocolName(String protocolName) {
        setProtocolName(protocolName);
        return this;
    }

    /**
     * <p>
     * The protocol name of the vehicle middleware.
     * </p>
     * 
     * @param protocolName
     *        The protocol name of the vehicle middleware.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VehicleMiddlewareProtocol
     */

    public VehicleMiddleware withProtocolName(VehicleMiddlewareProtocol protocolName) {
        this.protocolName = protocolName.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProtocolName() != null)
            sb.append("ProtocolName: ").append(getProtocolName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VehicleMiddleware == false)
            return false;
        VehicleMiddleware other = (VehicleMiddleware) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProtocolName() == null ^ this.getProtocolName() == null)
            return false;
        if (other.getProtocolName() != null && other.getProtocolName().equals(this.getProtocolName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProtocolName() == null) ? 0 : getProtocolName().hashCode());
        return hashCode;
    }

    @Override
    public VehicleMiddleware clone() {
        try {
            return (VehicleMiddleware) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.VehicleMiddlewareMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
