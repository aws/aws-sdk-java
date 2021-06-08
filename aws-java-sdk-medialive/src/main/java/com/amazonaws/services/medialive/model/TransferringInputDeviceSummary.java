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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Details about the input device that is being transferred.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/TransferringInputDeviceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransferringInputDeviceSummary implements Serializable, Cloneable, StructuredPojo {

    /** The unique ID of the input device. */
    private String id;
    /** The optional message that the sender has attached to the transfer. */
    private String message;
    /** The AWS account ID for the recipient of the input device transfer. */
    private String targetCustomerId;
    /** The type (direction) of the input device transfer. */
    private String transferType;

    /**
     * The unique ID of the input device.
     * 
     * @param id
     *        The unique ID of the input device.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique ID of the input device.
     * 
     * @return The unique ID of the input device.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The unique ID of the input device.
     * 
     * @param id
     *        The unique ID of the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferringInputDeviceSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The optional message that the sender has attached to the transfer.
     * 
     * @param message
     *        The optional message that the sender has attached to the transfer.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * The optional message that the sender has attached to the transfer.
     * 
     * @return The optional message that the sender has attached to the transfer.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * The optional message that the sender has attached to the transfer.
     * 
     * @param message
     *        The optional message that the sender has attached to the transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferringInputDeviceSummary withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * The AWS account ID for the recipient of the input device transfer.
     * 
     * @param targetCustomerId
     *        The AWS account ID for the recipient of the input device transfer.
     */

    public void setTargetCustomerId(String targetCustomerId) {
        this.targetCustomerId = targetCustomerId;
    }

    /**
     * The AWS account ID for the recipient of the input device transfer.
     * 
     * @return The AWS account ID for the recipient of the input device transfer.
     */

    public String getTargetCustomerId() {
        return this.targetCustomerId;
    }

    /**
     * The AWS account ID for the recipient of the input device transfer.
     * 
     * @param targetCustomerId
     *        The AWS account ID for the recipient of the input device transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferringInputDeviceSummary withTargetCustomerId(String targetCustomerId) {
        setTargetCustomerId(targetCustomerId);
        return this;
    }

    /**
     * The type (direction) of the input device transfer.
     * 
     * @param transferType
     *        The type (direction) of the input device transfer.
     * @see InputDeviceTransferType
     */

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    /**
     * The type (direction) of the input device transfer.
     * 
     * @return The type (direction) of the input device transfer.
     * @see InputDeviceTransferType
     */

    public String getTransferType() {
        return this.transferType;
    }

    /**
     * The type (direction) of the input device transfer.
     * 
     * @param transferType
     *        The type (direction) of the input device transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceTransferType
     */

    public TransferringInputDeviceSummary withTransferType(String transferType) {
        setTransferType(transferType);
        return this;
    }

    /**
     * The type (direction) of the input device transfer.
     * 
     * @param transferType
     *        The type (direction) of the input device transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceTransferType
     */

    public TransferringInputDeviceSummary withTransferType(InputDeviceTransferType transferType) {
        this.transferType = transferType.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getTargetCustomerId() != null)
            sb.append("TargetCustomerId: ").append(getTargetCustomerId()).append(",");
        if (getTransferType() != null)
            sb.append("TransferType: ").append(getTransferType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferringInputDeviceSummary == false)
            return false;
        TransferringInputDeviceSummary other = (TransferringInputDeviceSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getTargetCustomerId() == null ^ this.getTargetCustomerId() == null)
            return false;
        if (other.getTargetCustomerId() != null && other.getTargetCustomerId().equals(this.getTargetCustomerId()) == false)
            return false;
        if (other.getTransferType() == null ^ this.getTransferType() == null)
            return false;
        if (other.getTransferType() != null && other.getTransferType().equals(this.getTransferType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getTargetCustomerId() == null) ? 0 : getTargetCustomerId().hashCode());
        hashCode = prime * hashCode + ((getTransferType() == null) ? 0 : getTransferType().hashCode());
        return hashCode;
    }

    @Override
    public TransferringInputDeviceSummary clone() {
        try {
            return (TransferringInputDeviceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.TransferringInputDeviceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
