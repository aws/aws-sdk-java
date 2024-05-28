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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Endpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Endpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Type of the endpoint.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Address of the endpoint.
     * </p>
     */
    private String address;

    /**
     * <p>
     * Type of the endpoint.
     * </p>
     * 
     * @param type
     *        Type of the endpoint.
     * @see EndpointType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of the endpoint.
     * </p>
     * 
     * @return Type of the endpoint.
     * @see EndpointType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of the endpoint.
     * </p>
     * 
     * @param type
     *        Type of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public Endpoint withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of the endpoint.
     * </p>
     * 
     * @param type
     *        Type of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointType
     */

    public Endpoint withType(EndpointType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Address of the endpoint.
     * </p>
     * 
     * @param address
     *        Address of the endpoint.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * Address of the endpoint.
     * </p>
     * 
     * @return Address of the endpoint.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * Address of the endpoint.
     * </p>
     * 
     * @param address
     *        Address of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withAddress(String address) {
        setAddress(address);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Endpoint == false)
            return false;
        Endpoint other = (Endpoint) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        return hashCode;
    }

    @Override
    public Endpoint clone() {
        try {
            return (Endpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
