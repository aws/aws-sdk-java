/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a dataflow endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/DataflowEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataflowEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Socket address of a dataflow endpoint.
     * </p>
     */
    private SocketAddress address;
    /**
     * <p>
     * Name of a dataflow endpoint.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Status of a dataflow endpoint.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Socket address of a dataflow endpoint.
     * </p>
     * 
     * @param address
     *        Socket address of a dataflow endpoint.
     */

    public void setAddress(SocketAddress address) {
        this.address = address;
    }

    /**
     * <p>
     * Socket address of a dataflow endpoint.
     * </p>
     * 
     * @return Socket address of a dataflow endpoint.
     */

    public SocketAddress getAddress() {
        return this.address;
    }

    /**
     * <p>
     * Socket address of a dataflow endpoint.
     * </p>
     * 
     * @param address
     *        Socket address of a dataflow endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataflowEndpoint withAddress(SocketAddress address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * Name of a dataflow endpoint.
     * </p>
     * 
     * @param name
     *        Name of a dataflow endpoint.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of a dataflow endpoint.
     * </p>
     * 
     * @return Name of a dataflow endpoint.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of a dataflow endpoint.
     * </p>
     * 
     * @param name
     *        Name of a dataflow endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataflowEndpoint withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Status of a dataflow endpoint.
     * </p>
     * 
     * @param status
     *        Status of a dataflow endpoint.
     * @see EndpointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of a dataflow endpoint.
     * </p>
     * 
     * @return Status of a dataflow endpoint.
     * @see EndpointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of a dataflow endpoint.
     * </p>
     * 
     * @param status
     *        Status of a dataflow endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public DataflowEndpoint withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of a dataflow endpoint.
     * </p>
     * 
     * @param status
     *        Status of a dataflow endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public DataflowEndpoint withStatus(EndpointStatus status) {
        this.status = status.toString();
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
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataflowEndpoint == false)
            return false;
        DataflowEndpoint other = (DataflowEndpoint) obj;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DataflowEndpoint clone() {
        try {
            return (DataflowEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.DataflowEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
