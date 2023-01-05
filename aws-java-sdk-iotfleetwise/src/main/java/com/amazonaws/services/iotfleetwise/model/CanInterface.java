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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single controller area network (CAN) device interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CanInterface" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanInterface implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique name of the interface.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the communication protocol for the interface.
     * </p>
     */
    private String protocolName;
    /**
     * <p>
     * The version of the communication protocol for the interface.
     * </p>
     */
    private String protocolVersion;

    /**
     * <p>
     * The unique name of the interface.
     * </p>
     * 
     * @param name
     *        The unique name of the interface.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name of the interface.
     * </p>
     * 
     * @return The unique name of the interface.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name of the interface.
     * </p>
     * 
     * @param name
     *        The unique name of the interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanInterface withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the communication protocol for the interface.
     * </p>
     * 
     * @param protocolName
     *        The name of the communication protocol for the interface.
     */

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }

    /**
     * <p>
     * The name of the communication protocol for the interface.
     * </p>
     * 
     * @return The name of the communication protocol for the interface.
     */

    public String getProtocolName() {
        return this.protocolName;
    }

    /**
     * <p>
     * The name of the communication protocol for the interface.
     * </p>
     * 
     * @param protocolName
     *        The name of the communication protocol for the interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanInterface withProtocolName(String protocolName) {
        setProtocolName(protocolName);
        return this;
    }

    /**
     * <p>
     * The version of the communication protocol for the interface.
     * </p>
     * 
     * @param protocolVersion
     *        The version of the communication protocol for the interface.
     */

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    /**
     * <p>
     * The version of the communication protocol for the interface.
     * </p>
     * 
     * @return The version of the communication protocol for the interface.
     */

    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    /**
     * <p>
     * The version of the communication protocol for the interface.
     * </p>
     * 
     * @param protocolVersion
     *        The version of the communication protocol for the interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanInterface withProtocolVersion(String protocolVersion) {
        setProtocolVersion(protocolVersion);
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
            sb.append("ProtocolName: ").append(getProtocolName()).append(",");
        if (getProtocolVersion() != null)
            sb.append("ProtocolVersion: ").append(getProtocolVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanInterface == false)
            return false;
        CanInterface other = (CanInterface) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProtocolName() == null ^ this.getProtocolName() == null)
            return false;
        if (other.getProtocolName() != null && other.getProtocolName().equals(this.getProtocolName()) == false)
            return false;
        if (other.getProtocolVersion() == null ^ this.getProtocolVersion() == null)
            return false;
        if (other.getProtocolVersion() != null && other.getProtocolVersion().equals(this.getProtocolVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProtocolName() == null) ? 0 : getProtocolName().hashCode());
        hashCode = prime * hashCode + ((getProtocolVersion() == null) ? 0 : getProtocolVersion().hashCode());
        return hashCode;
    }

    @Override
    public CanInterface clone() {
        try {
            return (CanInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.CanInterfaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
