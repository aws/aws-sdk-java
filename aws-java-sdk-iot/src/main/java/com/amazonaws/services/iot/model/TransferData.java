/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Data used to transfer a certificate to an AWS account.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransferData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The transfer message.
     * </p>
     */
    private String transferMessage;
    /**
     * <p>
     * The reason why the transfer was rejected.
     * </p>
     */
    private String rejectReason;
    /**
     * <p>
     * The date the transfer took place.
     * </p>
     */
    private java.util.Date transferDate;
    /**
     * <p>
     * The date the transfer was accepted.
     * </p>
     */
    private java.util.Date acceptDate;
    /**
     * <p>
     * The date the transfer was rejected.
     * </p>
     */
    private java.util.Date rejectDate;

    /**
     * <p>
     * The transfer message.
     * </p>
     * 
     * @param transferMessage
     *        The transfer message.
     */

    public void setTransferMessage(String transferMessage) {
        this.transferMessage = transferMessage;
    }

    /**
     * <p>
     * The transfer message.
     * </p>
     * 
     * @return The transfer message.
     */

    public String getTransferMessage() {
        return this.transferMessage;
    }

    /**
     * <p>
     * The transfer message.
     * </p>
     * 
     * @param transferMessage
     *        The transfer message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferData withTransferMessage(String transferMessage) {
        setTransferMessage(transferMessage);
        return this;
    }

    /**
     * <p>
     * The reason why the transfer was rejected.
     * </p>
     * 
     * @param rejectReason
     *        The reason why the transfer was rejected.
     */

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    /**
     * <p>
     * The reason why the transfer was rejected.
     * </p>
     * 
     * @return The reason why the transfer was rejected.
     */

    public String getRejectReason() {
        return this.rejectReason;
    }

    /**
     * <p>
     * The reason why the transfer was rejected.
     * </p>
     * 
     * @param rejectReason
     *        The reason why the transfer was rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferData withRejectReason(String rejectReason) {
        setRejectReason(rejectReason);
        return this;
    }

    /**
     * <p>
     * The date the transfer took place.
     * </p>
     * 
     * @param transferDate
     *        The date the transfer took place.
     */

    public void setTransferDate(java.util.Date transferDate) {
        this.transferDate = transferDate;
    }

    /**
     * <p>
     * The date the transfer took place.
     * </p>
     * 
     * @return The date the transfer took place.
     */

    public java.util.Date getTransferDate() {
        return this.transferDate;
    }

    /**
     * <p>
     * The date the transfer took place.
     * </p>
     * 
     * @param transferDate
     *        The date the transfer took place.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferData withTransferDate(java.util.Date transferDate) {
        setTransferDate(transferDate);
        return this;
    }

    /**
     * <p>
     * The date the transfer was accepted.
     * </p>
     * 
     * @param acceptDate
     *        The date the transfer was accepted.
     */

    public void setAcceptDate(java.util.Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    /**
     * <p>
     * The date the transfer was accepted.
     * </p>
     * 
     * @return The date the transfer was accepted.
     */

    public java.util.Date getAcceptDate() {
        return this.acceptDate;
    }

    /**
     * <p>
     * The date the transfer was accepted.
     * </p>
     * 
     * @param acceptDate
     *        The date the transfer was accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferData withAcceptDate(java.util.Date acceptDate) {
        setAcceptDate(acceptDate);
        return this;
    }

    /**
     * <p>
     * The date the transfer was rejected.
     * </p>
     * 
     * @param rejectDate
     *        The date the transfer was rejected.
     */

    public void setRejectDate(java.util.Date rejectDate) {
        this.rejectDate = rejectDate;
    }

    /**
     * <p>
     * The date the transfer was rejected.
     * </p>
     * 
     * @return The date the transfer was rejected.
     */

    public java.util.Date getRejectDate() {
        return this.rejectDate;
    }

    /**
     * <p>
     * The date the transfer was rejected.
     * </p>
     * 
     * @param rejectDate
     *        The date the transfer was rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferData withRejectDate(java.util.Date rejectDate) {
        setRejectDate(rejectDate);
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
        if (getTransferMessage() != null)
            sb.append("TransferMessage: ").append(getTransferMessage()).append(",");
        if (getRejectReason() != null)
            sb.append("RejectReason: ").append(getRejectReason()).append(",");
        if (getTransferDate() != null)
            sb.append("TransferDate: ").append(getTransferDate()).append(",");
        if (getAcceptDate() != null)
            sb.append("AcceptDate: ").append(getAcceptDate()).append(",");
        if (getRejectDate() != null)
            sb.append("RejectDate: ").append(getRejectDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferData == false)
            return false;
        TransferData other = (TransferData) obj;
        if (other.getTransferMessage() == null ^ this.getTransferMessage() == null)
            return false;
        if (other.getTransferMessage() != null && other.getTransferMessage().equals(this.getTransferMessage()) == false)
            return false;
        if (other.getRejectReason() == null ^ this.getRejectReason() == null)
            return false;
        if (other.getRejectReason() != null && other.getRejectReason().equals(this.getRejectReason()) == false)
            return false;
        if (other.getTransferDate() == null ^ this.getTransferDate() == null)
            return false;
        if (other.getTransferDate() != null && other.getTransferDate().equals(this.getTransferDate()) == false)
            return false;
        if (other.getAcceptDate() == null ^ this.getAcceptDate() == null)
            return false;
        if (other.getAcceptDate() != null && other.getAcceptDate().equals(this.getAcceptDate()) == false)
            return false;
        if (other.getRejectDate() == null ^ this.getRejectDate() == null)
            return false;
        if (other.getRejectDate() != null && other.getRejectDate().equals(this.getRejectDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransferMessage() == null) ? 0 : getTransferMessage().hashCode());
        hashCode = prime * hashCode + ((getRejectReason() == null) ? 0 : getRejectReason().hashCode());
        hashCode = prime * hashCode + ((getTransferDate() == null) ? 0 : getTransferDate().hashCode());
        hashCode = prime * hashCode + ((getAcceptDate() == null) ? 0 : getAcceptDate().hashCode());
        hashCode = prime * hashCode + ((getRejectDate() == null) ? 0 : getRejectDate().hashCode());
        return hashCode;
    }

    @Override
    public TransferData clone() {
        try {
            return (TransferData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.TransferDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
