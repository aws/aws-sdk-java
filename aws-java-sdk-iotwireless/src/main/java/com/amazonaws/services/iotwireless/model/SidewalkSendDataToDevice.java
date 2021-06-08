/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a Sidewalk router.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SidewalkSendDataToDevice"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SidewalkSendDataToDevice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sequence number.
     * </p>
     */
    private Integer seq;

    private String messageType;

    /**
     * <p>
     * The sequence number.
     * </p>
     * 
     * @param seq
     *        The sequence number.
     */

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * <p>
     * The sequence number.
     * </p>
     * 
     * @return The sequence number.
     */

    public Integer getSeq() {
        return this.seq;
    }

    /**
     * <p>
     * The sequence number.
     * </p>
     * 
     * @param seq
     *        The sequence number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkSendDataToDevice withSeq(Integer seq) {
        setSeq(seq);
        return this;
    }

    /**
     * @param messageType
     * @see MessageType
     */

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * @return
     * @see MessageType
     */

    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @param messageType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SidewalkSendDataToDevice withMessageType(String messageType) {
        setMessageType(messageType);
        return this;
    }

    /**
     * @param messageType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MessageType
     */

    public SidewalkSendDataToDevice withMessageType(MessageType messageType) {
        this.messageType = messageType.toString();
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
        if (getSeq() != null)
            sb.append("Seq: ").append(getSeq()).append(",");
        if (getMessageType() != null)
            sb.append("MessageType: ").append(getMessageType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SidewalkSendDataToDevice == false)
            return false;
        SidewalkSendDataToDevice other = (SidewalkSendDataToDevice) obj;
        if (other.getSeq() == null ^ this.getSeq() == null)
            return false;
        if (other.getSeq() != null && other.getSeq().equals(this.getSeq()) == false)
            return false;
        if (other.getMessageType() == null ^ this.getMessageType() == null)
            return false;
        if (other.getMessageType() != null && other.getMessageType().equals(this.getMessageType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSeq() == null) ? 0 : getSeq().hashCode());
        hashCode = prime * hashCode + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        return hashCode;
    }

    @Override
    public SidewalkSendDataToDevice clone() {
        try {
            return (SidewalkSendDataToDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SidewalkSendDataToDeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
