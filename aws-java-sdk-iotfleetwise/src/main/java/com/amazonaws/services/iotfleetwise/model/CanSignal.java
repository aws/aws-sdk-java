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
 * Information about a single controller area network (CAN) signal and the messages it receives and transmits.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/CanSignal" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanSignal implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the message.
     * </p>
     */
    private Integer messageId;
    /**
     * <p>
     * Whether the byte ordering of a CAN message is big-endian.
     * </p>
     */
    private Boolean isBigEndian;
    /**
     * <p>
     * Whether the message data is specified as a signed value.
     * </p>
     */
    private Boolean isSigned;
    /**
     * <p>
     * Indicates the beginning of the CAN message.
     * </p>
     */
    private Integer startBit;
    /**
     * <p>
     * Indicates where data appears in the CAN message.
     * </p>
     */
    private Double offset;
    /**
     * <p>
     * A multiplier used to decode the CAN message.
     * </p>
     */
    private Double factor;
    /**
     * <p>
     * How many bytes of data are in the message.
     * </p>
     */
    private Integer length;
    /**
     * <p>
     * The name of the signal.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the message.
     * </p>
     * 
     * @param messageId
     *        The ID of the message.
     */

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The ID of the message.
     * </p>
     * 
     * @return The ID of the message.
     */

    public Integer getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The ID of the message.
     * </p>
     * 
     * @param messageId
     *        The ID of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanSignal withMessageId(Integer messageId) {
        setMessageId(messageId);
        return this;
    }

    /**
     * <p>
     * Whether the byte ordering of a CAN message is big-endian.
     * </p>
     * 
     * @param isBigEndian
     *        Whether the byte ordering of a CAN message is big-endian.
     */

    public void setIsBigEndian(Boolean isBigEndian) {
        this.isBigEndian = isBigEndian;
    }

    /**
     * <p>
     * Whether the byte ordering of a CAN message is big-endian.
     * </p>
     * 
     * @return Whether the byte ordering of a CAN message is big-endian.
     */

    public Boolean getIsBigEndian() {
        return this.isBigEndian;
    }

    /**
     * <p>
     * Whether the byte ordering of a CAN message is big-endian.
     * </p>
     * 
     * @param isBigEndian
     *        Whether the byte ordering of a CAN message is big-endian.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanSignal withIsBigEndian(Boolean isBigEndian) {
        setIsBigEndian(isBigEndian);
        return this;
    }

    /**
     * <p>
     * Whether the byte ordering of a CAN message is big-endian.
     * </p>
     * 
     * @return Whether the byte ordering of a CAN message is big-endian.
     */

    public Boolean isBigEndian() {
        return this.isBigEndian;
    }

    /**
     * <p>
     * Whether the message data is specified as a signed value.
     * </p>
     * 
     * @param isSigned
     *        Whether the message data is specified as a signed value.
     */

    public void setIsSigned(Boolean isSigned) {
        this.isSigned = isSigned;
    }

    /**
     * <p>
     * Whether the message data is specified as a signed value.
     * </p>
     * 
     * @return Whether the message data is specified as a signed value.
     */

    public Boolean getIsSigned() {
        return this.isSigned;
    }

    /**
     * <p>
     * Whether the message data is specified as a signed value.
     * </p>
     * 
     * @param isSigned
     *        Whether the message data is specified as a signed value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanSignal withIsSigned(Boolean isSigned) {
        setIsSigned(isSigned);
        return this;
    }

    /**
     * <p>
     * Whether the message data is specified as a signed value.
     * </p>
     * 
     * @return Whether the message data is specified as a signed value.
     */

    public Boolean isSigned() {
        return this.isSigned;
    }

    /**
     * <p>
     * Indicates the beginning of the CAN message.
     * </p>
     * 
     * @param startBit
     *        Indicates the beginning of the CAN message.
     */

    public void setStartBit(Integer startBit) {
        this.startBit = startBit;
    }

    /**
     * <p>
     * Indicates the beginning of the CAN message.
     * </p>
     * 
     * @return Indicates the beginning of the CAN message.
     */

    public Integer getStartBit() {
        return this.startBit;
    }

    /**
     * <p>
     * Indicates the beginning of the CAN message.
     * </p>
     * 
     * @param startBit
     *        Indicates the beginning of the CAN message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanSignal withStartBit(Integer startBit) {
        setStartBit(startBit);
        return this;
    }

    /**
     * <p>
     * Indicates where data appears in the CAN message.
     * </p>
     * 
     * @param offset
     *        Indicates where data appears in the CAN message.
     */

    public void setOffset(Double offset) {
        this.offset = offset;
    }

    /**
     * <p>
     * Indicates where data appears in the CAN message.
     * </p>
     * 
     * @return Indicates where data appears in the CAN message.
     */

    public Double getOffset() {
        return this.offset;
    }

    /**
     * <p>
     * Indicates where data appears in the CAN message.
     * </p>
     * 
     * @param offset
     *        Indicates where data appears in the CAN message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanSignal withOffset(Double offset) {
        setOffset(offset);
        return this;
    }

    /**
     * <p>
     * A multiplier used to decode the CAN message.
     * </p>
     * 
     * @param factor
     *        A multiplier used to decode the CAN message.
     */

    public void setFactor(Double factor) {
        this.factor = factor;
    }

    /**
     * <p>
     * A multiplier used to decode the CAN message.
     * </p>
     * 
     * @return A multiplier used to decode the CAN message.
     */

    public Double getFactor() {
        return this.factor;
    }

    /**
     * <p>
     * A multiplier used to decode the CAN message.
     * </p>
     * 
     * @param factor
     *        A multiplier used to decode the CAN message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanSignal withFactor(Double factor) {
        setFactor(factor);
        return this;
    }

    /**
     * <p>
     * How many bytes of data are in the message.
     * </p>
     * 
     * @param length
     *        How many bytes of data are in the message.
     */

    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * <p>
     * How many bytes of data are in the message.
     * </p>
     * 
     * @return How many bytes of data are in the message.
     */

    public Integer getLength() {
        return this.length;
    }

    /**
     * <p>
     * How many bytes of data are in the message.
     * </p>
     * 
     * @param length
     *        How many bytes of data are in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanSignal withLength(Integer length) {
        setLength(length);
        return this;
    }

    /**
     * <p>
     * The name of the signal.
     * </p>
     * 
     * @param name
     *        The name of the signal.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the signal.
     * </p>
     * 
     * @return The name of the signal.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the signal.
     * </p>
     * 
     * @param name
     *        The name of the signal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanSignal withName(String name) {
        setName(name);
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
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId()).append(",");
        if (getIsBigEndian() != null)
            sb.append("IsBigEndian: ").append(getIsBigEndian()).append(",");
        if (getIsSigned() != null)
            sb.append("IsSigned: ").append(getIsSigned()).append(",");
        if (getStartBit() != null)
            sb.append("StartBit: ").append(getStartBit()).append(",");
        if (getOffset() != null)
            sb.append("Offset: ").append(getOffset()).append(",");
        if (getFactor() != null)
            sb.append("Factor: ").append(getFactor()).append(",");
        if (getLength() != null)
            sb.append("Length: ").append(getLength()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanSignal == false)
            return false;
        CanSignal other = (CanSignal) obj;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        if (other.getIsBigEndian() == null ^ this.getIsBigEndian() == null)
            return false;
        if (other.getIsBigEndian() != null && other.getIsBigEndian().equals(this.getIsBigEndian()) == false)
            return false;
        if (other.getIsSigned() == null ^ this.getIsSigned() == null)
            return false;
        if (other.getIsSigned() != null && other.getIsSigned().equals(this.getIsSigned()) == false)
            return false;
        if (other.getStartBit() == null ^ this.getStartBit() == null)
            return false;
        if (other.getStartBit() != null && other.getStartBit().equals(this.getStartBit()) == false)
            return false;
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        if (other.getFactor() == null ^ this.getFactor() == null)
            return false;
        if (other.getFactor() != null && other.getFactor().equals(this.getFactor()) == false)
            return false;
        if (other.getLength() == null ^ this.getLength() == null)
            return false;
        if (other.getLength() != null && other.getLength().equals(this.getLength()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        hashCode = prime * hashCode + ((getIsBigEndian() == null) ? 0 : getIsBigEndian().hashCode());
        hashCode = prime * hashCode + ((getIsSigned() == null) ? 0 : getIsSigned().hashCode());
        hashCode = prime * hashCode + ((getStartBit() == null) ? 0 : getStartBit().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
        hashCode = prime * hashCode + ((getFactor() == null) ? 0 : getFactor().hashCode());
        hashCode = prime * hashCode + ((getLength() == null) ? 0 : getLength().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CanSignal clone() {
        try {
            return (CanSignal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.CanSignalMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
