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
 * Information about signal messages using the on-board diagnostics (OBD) II protocol in a vehicle.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ObdSignal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObdSignal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The length of the requested data.
     * </p>
     */
    private Integer pidResponseLength;
    /**
     * <p>
     * The mode of operation (diagnostic service) in a message.
     * </p>
     */
    private Integer serviceMode;
    /**
     * <p>
     * The diagnostic code used to request data from a vehicle for this signal.
     * </p>
     */
    private Integer pid;
    /**
     * <p>
     * A multiplier used to decode the message.
     * </p>
     */
    private Double scaling;
    /**
     * <p>
     * Indicates where data appears in the message.
     * </p>
     */
    private Double offset;
    /**
     * <p>
     * Indicates the beginning of the message.
     * </p>
     */
    private Integer startByte;
    /**
     * <p>
     * The length of a message.
     * </p>
     */
    private Integer byteLength;
    /**
     * <p>
     * The number of positions to shift bits in the message.
     * </p>
     */
    private Integer bitRightShift;
    /**
     * <p>
     * The number of bits to mask in a message.
     * </p>
     */
    private Integer bitMaskLength;

    /**
     * <p>
     * The length of the requested data.
     * </p>
     * 
     * @param pidResponseLength
     *        The length of the requested data.
     */

    public void setPidResponseLength(Integer pidResponseLength) {
        this.pidResponseLength = pidResponseLength;
    }

    /**
     * <p>
     * The length of the requested data.
     * </p>
     * 
     * @return The length of the requested data.
     */

    public Integer getPidResponseLength() {
        return this.pidResponseLength;
    }

    /**
     * <p>
     * The length of the requested data.
     * </p>
     * 
     * @param pidResponseLength
     *        The length of the requested data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdSignal withPidResponseLength(Integer pidResponseLength) {
        setPidResponseLength(pidResponseLength);
        return this;
    }

    /**
     * <p>
     * The mode of operation (diagnostic service) in a message.
     * </p>
     * 
     * @param serviceMode
     *        The mode of operation (diagnostic service) in a message.
     */

    public void setServiceMode(Integer serviceMode) {
        this.serviceMode = serviceMode;
    }

    /**
     * <p>
     * The mode of operation (diagnostic service) in a message.
     * </p>
     * 
     * @return The mode of operation (diagnostic service) in a message.
     */

    public Integer getServiceMode() {
        return this.serviceMode;
    }

    /**
     * <p>
     * The mode of operation (diagnostic service) in a message.
     * </p>
     * 
     * @param serviceMode
     *        The mode of operation (diagnostic service) in a message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdSignal withServiceMode(Integer serviceMode) {
        setServiceMode(serviceMode);
        return this;
    }

    /**
     * <p>
     * The diagnostic code used to request data from a vehicle for this signal.
     * </p>
     * 
     * @param pid
     *        The diagnostic code used to request data from a vehicle for this signal.
     */

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * <p>
     * The diagnostic code used to request data from a vehicle for this signal.
     * </p>
     * 
     * @return The diagnostic code used to request data from a vehicle for this signal.
     */

    public Integer getPid() {
        return this.pid;
    }

    /**
     * <p>
     * The diagnostic code used to request data from a vehicle for this signal.
     * </p>
     * 
     * @param pid
     *        The diagnostic code used to request data from a vehicle for this signal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdSignal withPid(Integer pid) {
        setPid(pid);
        return this;
    }

    /**
     * <p>
     * A multiplier used to decode the message.
     * </p>
     * 
     * @param scaling
     *        A multiplier used to decode the message.
     */

    public void setScaling(Double scaling) {
        this.scaling = scaling;
    }

    /**
     * <p>
     * A multiplier used to decode the message.
     * </p>
     * 
     * @return A multiplier used to decode the message.
     */

    public Double getScaling() {
        return this.scaling;
    }

    /**
     * <p>
     * A multiplier used to decode the message.
     * </p>
     * 
     * @param scaling
     *        A multiplier used to decode the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdSignal withScaling(Double scaling) {
        setScaling(scaling);
        return this;
    }

    /**
     * <p>
     * Indicates where data appears in the message.
     * </p>
     * 
     * @param offset
     *        Indicates where data appears in the message.
     */

    public void setOffset(Double offset) {
        this.offset = offset;
    }

    /**
     * <p>
     * Indicates where data appears in the message.
     * </p>
     * 
     * @return Indicates where data appears in the message.
     */

    public Double getOffset() {
        return this.offset;
    }

    /**
     * <p>
     * Indicates where data appears in the message.
     * </p>
     * 
     * @param offset
     *        Indicates where data appears in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdSignal withOffset(Double offset) {
        setOffset(offset);
        return this;
    }

    /**
     * <p>
     * Indicates the beginning of the message.
     * </p>
     * 
     * @param startByte
     *        Indicates the beginning of the message.
     */

    public void setStartByte(Integer startByte) {
        this.startByte = startByte;
    }

    /**
     * <p>
     * Indicates the beginning of the message.
     * </p>
     * 
     * @return Indicates the beginning of the message.
     */

    public Integer getStartByte() {
        return this.startByte;
    }

    /**
     * <p>
     * Indicates the beginning of the message.
     * </p>
     * 
     * @param startByte
     *        Indicates the beginning of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdSignal withStartByte(Integer startByte) {
        setStartByte(startByte);
        return this;
    }

    /**
     * <p>
     * The length of a message.
     * </p>
     * 
     * @param byteLength
     *        The length of a message.
     */

    public void setByteLength(Integer byteLength) {
        this.byteLength = byteLength;
    }

    /**
     * <p>
     * The length of a message.
     * </p>
     * 
     * @return The length of a message.
     */

    public Integer getByteLength() {
        return this.byteLength;
    }

    /**
     * <p>
     * The length of a message.
     * </p>
     * 
     * @param byteLength
     *        The length of a message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdSignal withByteLength(Integer byteLength) {
        setByteLength(byteLength);
        return this;
    }

    /**
     * <p>
     * The number of positions to shift bits in the message.
     * </p>
     * 
     * @param bitRightShift
     *        The number of positions to shift bits in the message.
     */

    public void setBitRightShift(Integer bitRightShift) {
        this.bitRightShift = bitRightShift;
    }

    /**
     * <p>
     * The number of positions to shift bits in the message.
     * </p>
     * 
     * @return The number of positions to shift bits in the message.
     */

    public Integer getBitRightShift() {
        return this.bitRightShift;
    }

    /**
     * <p>
     * The number of positions to shift bits in the message.
     * </p>
     * 
     * @param bitRightShift
     *        The number of positions to shift bits in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdSignal withBitRightShift(Integer bitRightShift) {
        setBitRightShift(bitRightShift);
        return this;
    }

    /**
     * <p>
     * The number of bits to mask in a message.
     * </p>
     * 
     * @param bitMaskLength
     *        The number of bits to mask in a message.
     */

    public void setBitMaskLength(Integer bitMaskLength) {
        this.bitMaskLength = bitMaskLength;
    }

    /**
     * <p>
     * The number of bits to mask in a message.
     * </p>
     * 
     * @return The number of bits to mask in a message.
     */

    public Integer getBitMaskLength() {
        return this.bitMaskLength;
    }

    /**
     * <p>
     * The number of bits to mask in a message.
     * </p>
     * 
     * @param bitMaskLength
     *        The number of bits to mask in a message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObdSignal withBitMaskLength(Integer bitMaskLength) {
        setBitMaskLength(bitMaskLength);
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
        if (getPidResponseLength() != null)
            sb.append("PidResponseLength: ").append(getPidResponseLength()).append(",");
        if (getServiceMode() != null)
            sb.append("ServiceMode: ").append(getServiceMode()).append(",");
        if (getPid() != null)
            sb.append("Pid: ").append(getPid()).append(",");
        if (getScaling() != null)
            sb.append("Scaling: ").append(getScaling()).append(",");
        if (getOffset() != null)
            sb.append("Offset: ").append(getOffset()).append(",");
        if (getStartByte() != null)
            sb.append("StartByte: ").append(getStartByte()).append(",");
        if (getByteLength() != null)
            sb.append("ByteLength: ").append(getByteLength()).append(",");
        if (getBitRightShift() != null)
            sb.append("BitRightShift: ").append(getBitRightShift()).append(",");
        if (getBitMaskLength() != null)
            sb.append("BitMaskLength: ").append(getBitMaskLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObdSignal == false)
            return false;
        ObdSignal other = (ObdSignal) obj;
        if (other.getPidResponseLength() == null ^ this.getPidResponseLength() == null)
            return false;
        if (other.getPidResponseLength() != null && other.getPidResponseLength().equals(this.getPidResponseLength()) == false)
            return false;
        if (other.getServiceMode() == null ^ this.getServiceMode() == null)
            return false;
        if (other.getServiceMode() != null && other.getServiceMode().equals(this.getServiceMode()) == false)
            return false;
        if (other.getPid() == null ^ this.getPid() == null)
            return false;
        if (other.getPid() != null && other.getPid().equals(this.getPid()) == false)
            return false;
        if (other.getScaling() == null ^ this.getScaling() == null)
            return false;
        if (other.getScaling() != null && other.getScaling().equals(this.getScaling()) == false)
            return false;
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        if (other.getStartByte() == null ^ this.getStartByte() == null)
            return false;
        if (other.getStartByte() != null && other.getStartByte().equals(this.getStartByte()) == false)
            return false;
        if (other.getByteLength() == null ^ this.getByteLength() == null)
            return false;
        if (other.getByteLength() != null && other.getByteLength().equals(this.getByteLength()) == false)
            return false;
        if (other.getBitRightShift() == null ^ this.getBitRightShift() == null)
            return false;
        if (other.getBitRightShift() != null && other.getBitRightShift().equals(this.getBitRightShift()) == false)
            return false;
        if (other.getBitMaskLength() == null ^ this.getBitMaskLength() == null)
            return false;
        if (other.getBitMaskLength() != null && other.getBitMaskLength().equals(this.getBitMaskLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPidResponseLength() == null) ? 0 : getPidResponseLength().hashCode());
        hashCode = prime * hashCode + ((getServiceMode() == null) ? 0 : getServiceMode().hashCode());
        hashCode = prime * hashCode + ((getPid() == null) ? 0 : getPid().hashCode());
        hashCode = prime * hashCode + ((getScaling() == null) ? 0 : getScaling().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        hashCode = prime * hashCode + ((getStartByte() == null) ? 0 : getStartByte().hashCode());
        hashCode = prime * hashCode + ((getByteLength() == null) ? 0 : getByteLength().hashCode());
        hashCode = prime * hashCode + ((getBitRightShift() == null) ? 0 : getBitRightShift().hashCode());
        hashCode = prime * hashCode + ((getBitMaskLength() == null) ? 0 : getBitMaskLength().hashCode());
        return hashCode;
    }

    @Override
    public ObdSignal clone() {
        try {
            return (ObdSignal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.ObdSignalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
