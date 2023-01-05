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
 * Information about a signal decoder.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/SignalDecoder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignalDecoder implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fully qualified name of a signal decoder as defined in a vehicle model.
     * </p>
     */
    private String fullyQualifiedName;
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
     * The ID of a network interface that specifies what network protocol a vehicle follows.
     * </p>
     */
    private String interfaceId;
    /**
     * <p>
     * Information about signal decoder using the Controller Area Network (CAN) protocol.
     * </p>
     */
    private CanSignal canSignal;
    /**
     * <p>
     * Information about signal decoder using the On-board diagnostic (OBD) II protocol.
     * </p>
     */
    private ObdSignal obdSignal;

    /**
     * <p>
     * The fully qualified name of a signal decoder as defined in a vehicle model.
     * </p>
     * 
     * @param fullyQualifiedName
     *        The fully qualified name of a signal decoder as defined in a vehicle model.
     */

    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    /**
     * <p>
     * The fully qualified name of a signal decoder as defined in a vehicle model.
     * </p>
     * 
     * @return The fully qualified name of a signal decoder as defined in a vehicle model.
     */

    public String getFullyQualifiedName() {
        return this.fullyQualifiedName;
    }

    /**
     * <p>
     * The fully qualified name of a signal decoder as defined in a vehicle model.
     * </p>
     * 
     * @param fullyQualifiedName
     *        The fully qualified name of a signal decoder as defined in a vehicle model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalDecoder withFullyQualifiedName(String fullyQualifiedName) {
        setFullyQualifiedName(fullyQualifiedName);
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
     * @see SignalDecoderType
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
     * @see SignalDecoderType
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
     * @see SignalDecoderType
     */

    public SignalDecoder withType(String type) {
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
     * @see SignalDecoderType
     */

    public SignalDecoder withType(SignalDecoderType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ID of a network interface that specifies what network protocol a vehicle follows.
     * </p>
     * 
     * @param interfaceId
     *        The ID of a network interface that specifies what network protocol a vehicle follows.
     */

    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    /**
     * <p>
     * The ID of a network interface that specifies what network protocol a vehicle follows.
     * </p>
     * 
     * @return The ID of a network interface that specifies what network protocol a vehicle follows.
     */

    public String getInterfaceId() {
        return this.interfaceId;
    }

    /**
     * <p>
     * The ID of a network interface that specifies what network protocol a vehicle follows.
     * </p>
     * 
     * @param interfaceId
     *        The ID of a network interface that specifies what network protocol a vehicle follows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalDecoder withInterfaceId(String interfaceId) {
        setInterfaceId(interfaceId);
        return this;
    }

    /**
     * <p>
     * Information about signal decoder using the Controller Area Network (CAN) protocol.
     * </p>
     * 
     * @param canSignal
     *        Information about signal decoder using the Controller Area Network (CAN) protocol.
     */

    public void setCanSignal(CanSignal canSignal) {
        this.canSignal = canSignal;
    }

    /**
     * <p>
     * Information about signal decoder using the Controller Area Network (CAN) protocol.
     * </p>
     * 
     * @return Information about signal decoder using the Controller Area Network (CAN) protocol.
     */

    public CanSignal getCanSignal() {
        return this.canSignal;
    }

    /**
     * <p>
     * Information about signal decoder using the Controller Area Network (CAN) protocol.
     * </p>
     * 
     * @param canSignal
     *        Information about signal decoder using the Controller Area Network (CAN) protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalDecoder withCanSignal(CanSignal canSignal) {
        setCanSignal(canSignal);
        return this;
    }

    /**
     * <p>
     * Information about signal decoder using the On-board diagnostic (OBD) II protocol.
     * </p>
     * 
     * @param obdSignal
     *        Information about signal decoder using the On-board diagnostic (OBD) II protocol.
     */

    public void setObdSignal(ObdSignal obdSignal) {
        this.obdSignal = obdSignal;
    }

    /**
     * <p>
     * Information about signal decoder using the On-board diagnostic (OBD) II protocol.
     * </p>
     * 
     * @return Information about signal decoder using the On-board diagnostic (OBD) II protocol.
     */

    public ObdSignal getObdSignal() {
        return this.obdSignal;
    }

    /**
     * <p>
     * Information about signal decoder using the On-board diagnostic (OBD) II protocol.
     * </p>
     * 
     * @param obdSignal
     *        Information about signal decoder using the On-board diagnostic (OBD) II protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalDecoder withObdSignal(ObdSignal obdSignal) {
        setObdSignal(obdSignal);
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
        if (getFullyQualifiedName() != null)
            sb.append("FullyQualifiedName: ").append(getFullyQualifiedName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getInterfaceId() != null)
            sb.append("InterfaceId: ").append(getInterfaceId()).append(",");
        if (getCanSignal() != null)
            sb.append("CanSignal: ").append(getCanSignal()).append(",");
        if (getObdSignal() != null)
            sb.append("ObdSignal: ").append(getObdSignal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignalDecoder == false)
            return false;
        SignalDecoder other = (SignalDecoder) obj;
        if (other.getFullyQualifiedName() == null ^ this.getFullyQualifiedName() == null)
            return false;
        if (other.getFullyQualifiedName() != null && other.getFullyQualifiedName().equals(this.getFullyQualifiedName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getInterfaceId() == null ^ this.getInterfaceId() == null)
            return false;
        if (other.getInterfaceId() != null && other.getInterfaceId().equals(this.getInterfaceId()) == false)
            return false;
        if (other.getCanSignal() == null ^ this.getCanSignal() == null)
            return false;
        if (other.getCanSignal() != null && other.getCanSignal().equals(this.getCanSignal()) == false)
            return false;
        if (other.getObdSignal() == null ^ this.getObdSignal() == null)
            return false;
        if (other.getObdSignal() != null && other.getObdSignal().equals(this.getObdSignal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFullyQualifiedName() == null) ? 0 : getFullyQualifiedName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getInterfaceId() == null) ? 0 : getInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getCanSignal() == null) ? 0 : getCanSignal().hashCode());
        hashCode = prime * hashCode + ((getObdSignal() == null) ? 0 : getObdSignal().hashCode());
        return hashCode;
    }

    @Override
    public SignalDecoder clone() {
        try {
            return (SignalDecoder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.SignalDecoderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
