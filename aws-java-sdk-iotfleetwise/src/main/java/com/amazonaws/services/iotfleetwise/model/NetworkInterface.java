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
 * Represents a node and its specifications in an in-vehicle communication network. All signal decoders must be
 * associated with a network node.
 * </p>
 * <p>
 * To return this information about all the network interfaces specified in a decoder manifest, use the API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/NetworkInterface" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInterface implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String interfaceId;
    /**
     * <p>
     * The network protocol for the vehicle. For example, <code>CAN_SIGNAL</code> specifies a protocol that defines how
     * data is communicated between electronic control units (ECUs). <code>OBD_SIGNAL</code> specifies a protocol that
     * defines how self-diagnostic data is communicated between ECUs.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Information about a network interface specified by the Controller Area Network (CAN) protocol.
     * </p>
     */
    private CanInterface canInterface;
    /**
     * <p>
     * Information about a network interface specified by the On-board diagnostic (OBD) II protocol.
     * </p>
     */
    private ObdInterface obdInterface;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param interfaceId
     *        The ID of the network interface.
     */

    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @return The ID of the network interface.
     */

    public String getInterfaceId() {
        return this.interfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param interfaceId
     *        The ID of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withInterfaceId(String interfaceId) {
        setInterfaceId(interfaceId);
        return this;
    }

    /**
     * <p>
     * The network protocol for the vehicle. For example, <code>CAN_SIGNAL</code> specifies a protocol that defines how
     * data is communicated between electronic control units (ECUs). <code>OBD_SIGNAL</code> specifies a protocol that
     * defines how self-diagnostic data is communicated between ECUs.
     * </p>
     * 
     * @param type
     *        The network protocol for the vehicle. For example, <code>CAN_SIGNAL</code> specifies a protocol that
     *        defines how data is communicated between electronic control units (ECUs). <code>OBD_SIGNAL</code>
     *        specifies a protocol that defines how self-diagnostic data is communicated between ECUs.
     * @see NetworkInterfaceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The network protocol for the vehicle. For example, <code>CAN_SIGNAL</code> specifies a protocol that defines how
     * data is communicated between electronic control units (ECUs). <code>OBD_SIGNAL</code> specifies a protocol that
     * defines how self-diagnostic data is communicated between ECUs.
     * </p>
     * 
     * @return The network protocol for the vehicle. For example, <code>CAN_SIGNAL</code> specifies a protocol that
     *         defines how data is communicated between electronic control units (ECUs). <code>OBD_SIGNAL</code>
     *         specifies a protocol that defines how self-diagnostic data is communicated between ECUs.
     * @see NetworkInterfaceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The network protocol for the vehicle. For example, <code>CAN_SIGNAL</code> specifies a protocol that defines how
     * data is communicated between electronic control units (ECUs). <code>OBD_SIGNAL</code> specifies a protocol that
     * defines how self-diagnostic data is communicated between ECUs.
     * </p>
     * 
     * @param type
     *        The network protocol for the vehicle. For example, <code>CAN_SIGNAL</code> specifies a protocol that
     *        defines how data is communicated between electronic control units (ECUs). <code>OBD_SIGNAL</code>
     *        specifies a protocol that defines how self-diagnostic data is communicated between ECUs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkInterfaceType
     */

    public NetworkInterface withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The network protocol for the vehicle. For example, <code>CAN_SIGNAL</code> specifies a protocol that defines how
     * data is communicated between electronic control units (ECUs). <code>OBD_SIGNAL</code> specifies a protocol that
     * defines how self-diagnostic data is communicated between ECUs.
     * </p>
     * 
     * @param type
     *        The network protocol for the vehicle. For example, <code>CAN_SIGNAL</code> specifies a protocol that
     *        defines how data is communicated between electronic control units (ECUs). <code>OBD_SIGNAL</code>
     *        specifies a protocol that defines how self-diagnostic data is communicated between ECUs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkInterfaceType
     */

    public NetworkInterface withType(NetworkInterfaceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about a network interface specified by the Controller Area Network (CAN) protocol.
     * </p>
     * 
     * @param canInterface
     *        Information about a network interface specified by the Controller Area Network (CAN) protocol.
     */

    public void setCanInterface(CanInterface canInterface) {
        this.canInterface = canInterface;
    }

    /**
     * <p>
     * Information about a network interface specified by the Controller Area Network (CAN) protocol.
     * </p>
     * 
     * @return Information about a network interface specified by the Controller Area Network (CAN) protocol.
     */

    public CanInterface getCanInterface() {
        return this.canInterface;
    }

    /**
     * <p>
     * Information about a network interface specified by the Controller Area Network (CAN) protocol.
     * </p>
     * 
     * @param canInterface
     *        Information about a network interface specified by the Controller Area Network (CAN) protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withCanInterface(CanInterface canInterface) {
        setCanInterface(canInterface);
        return this;
    }

    /**
     * <p>
     * Information about a network interface specified by the On-board diagnostic (OBD) II protocol.
     * </p>
     * 
     * @param obdInterface
     *        Information about a network interface specified by the On-board diagnostic (OBD) II protocol.
     */

    public void setObdInterface(ObdInterface obdInterface) {
        this.obdInterface = obdInterface;
    }

    /**
     * <p>
     * Information about a network interface specified by the On-board diagnostic (OBD) II protocol.
     * </p>
     * 
     * @return Information about a network interface specified by the On-board diagnostic (OBD) II protocol.
     */

    public ObdInterface getObdInterface() {
        return this.obdInterface;
    }

    /**
     * <p>
     * Information about a network interface specified by the On-board diagnostic (OBD) II protocol.
     * </p>
     * 
     * @param obdInterface
     *        Information about a network interface specified by the On-board diagnostic (OBD) II protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withObdInterface(ObdInterface obdInterface) {
        setObdInterface(obdInterface);
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
        if (getInterfaceId() != null)
            sb.append("InterfaceId: ").append(getInterfaceId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCanInterface() != null)
            sb.append("CanInterface: ").append(getCanInterface()).append(",");
        if (getObdInterface() != null)
            sb.append("ObdInterface: ").append(getObdInterface());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInterface == false)
            return false;
        NetworkInterface other = (NetworkInterface) obj;
        if (other.getInterfaceId() == null ^ this.getInterfaceId() == null)
            return false;
        if (other.getInterfaceId() != null && other.getInterfaceId().equals(this.getInterfaceId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCanInterface() == null ^ this.getCanInterface() == null)
            return false;
        if (other.getCanInterface() != null && other.getCanInterface().equals(this.getCanInterface()) == false)
            return false;
        if (other.getObdInterface() == null ^ this.getObdInterface() == null)
            return false;
        if (other.getObdInterface() != null && other.getObdInterface().equals(this.getObdInterface()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterfaceId() == null) ? 0 : getInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCanInterface() == null) ? 0 : getCanInterface().hashCode());
        hashCode = prime * hashCode + ((getObdInterface() == null) ? 0 : getObdInterface().hashCode());
        return hashCode;
    }

    @Override
    public NetworkInterface clone() {
        try {
            return (NetworkInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.NetworkInterfaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
