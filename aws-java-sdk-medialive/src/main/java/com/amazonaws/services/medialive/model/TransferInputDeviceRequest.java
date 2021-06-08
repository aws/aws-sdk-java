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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to transfer an input device.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/TransferInputDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransferInputDeviceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The unique ID of this input device. For example, hd-123456789abcdef. */
    private String inputDeviceId;
    /** The AWS account ID (12 digits) for the recipient of the device transfer. */
    private String targetCustomerId;
    /** The target AWS region to transfer the device. */
    private String targetRegion;
    /** An optional message for the recipient. Maximum 280 characters. */
    private String transferMessage;

    /**
     * The unique ID of this input device. For example, hd-123456789abcdef.
     * 
     * @param inputDeviceId
     *        The unique ID of this input device. For example, hd-123456789abcdef.
     */

    public void setInputDeviceId(String inputDeviceId) {
        this.inputDeviceId = inputDeviceId;
    }

    /**
     * The unique ID of this input device. For example, hd-123456789abcdef.
     * 
     * @return The unique ID of this input device. For example, hd-123456789abcdef.
     */

    public String getInputDeviceId() {
        return this.inputDeviceId;
    }

    /**
     * The unique ID of this input device. For example, hd-123456789abcdef.
     * 
     * @param inputDeviceId
     *        The unique ID of this input device. For example, hd-123456789abcdef.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferInputDeviceRequest withInputDeviceId(String inputDeviceId) {
        setInputDeviceId(inputDeviceId);
        return this;
    }

    /**
     * The AWS account ID (12 digits) for the recipient of the device transfer.
     * 
     * @param targetCustomerId
     *        The AWS account ID (12 digits) for the recipient of the device transfer.
     */

    public void setTargetCustomerId(String targetCustomerId) {
        this.targetCustomerId = targetCustomerId;
    }

    /**
     * The AWS account ID (12 digits) for the recipient of the device transfer.
     * 
     * @return The AWS account ID (12 digits) for the recipient of the device transfer.
     */

    public String getTargetCustomerId() {
        return this.targetCustomerId;
    }

    /**
     * The AWS account ID (12 digits) for the recipient of the device transfer.
     * 
     * @param targetCustomerId
     *        The AWS account ID (12 digits) for the recipient of the device transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferInputDeviceRequest withTargetCustomerId(String targetCustomerId) {
        setTargetCustomerId(targetCustomerId);
        return this;
    }

    /**
     * The target AWS region to transfer the device.
     * 
     * @param targetRegion
     *        The target AWS region to transfer the device.
     */

    public void setTargetRegion(String targetRegion) {
        this.targetRegion = targetRegion;
    }

    /**
     * The target AWS region to transfer the device.
     * 
     * @return The target AWS region to transfer the device.
     */

    public String getTargetRegion() {
        return this.targetRegion;
    }

    /**
     * The target AWS region to transfer the device.
     * 
     * @param targetRegion
     *        The target AWS region to transfer the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferInputDeviceRequest withTargetRegion(String targetRegion) {
        setTargetRegion(targetRegion);
        return this;
    }

    /**
     * An optional message for the recipient. Maximum 280 characters.
     * 
     * @param transferMessage
     *        An optional message for the recipient. Maximum 280 characters.
     */

    public void setTransferMessage(String transferMessage) {
        this.transferMessage = transferMessage;
    }

    /**
     * An optional message for the recipient. Maximum 280 characters.
     * 
     * @return An optional message for the recipient. Maximum 280 characters.
     */

    public String getTransferMessage() {
        return this.transferMessage;
    }

    /**
     * An optional message for the recipient. Maximum 280 characters.
     * 
     * @param transferMessage
     *        An optional message for the recipient. Maximum 280 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransferInputDeviceRequest withTransferMessage(String transferMessage) {
        setTransferMessage(transferMessage);
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
        if (getInputDeviceId() != null)
            sb.append("InputDeviceId: ").append(getInputDeviceId()).append(",");
        if (getTargetCustomerId() != null)
            sb.append("TargetCustomerId: ").append(getTargetCustomerId()).append(",");
        if (getTargetRegion() != null)
            sb.append("TargetRegion: ").append(getTargetRegion()).append(",");
        if (getTransferMessage() != null)
            sb.append("TransferMessage: ").append(getTransferMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferInputDeviceRequest == false)
            return false;
        TransferInputDeviceRequest other = (TransferInputDeviceRequest) obj;
        if (other.getInputDeviceId() == null ^ this.getInputDeviceId() == null)
            return false;
        if (other.getInputDeviceId() != null && other.getInputDeviceId().equals(this.getInputDeviceId()) == false)
            return false;
        if (other.getTargetCustomerId() == null ^ this.getTargetCustomerId() == null)
            return false;
        if (other.getTargetCustomerId() != null && other.getTargetCustomerId().equals(this.getTargetCustomerId()) == false)
            return false;
        if (other.getTargetRegion() == null ^ this.getTargetRegion() == null)
            return false;
        if (other.getTargetRegion() != null && other.getTargetRegion().equals(this.getTargetRegion()) == false)
            return false;
        if (other.getTransferMessage() == null ^ this.getTransferMessage() == null)
            return false;
        if (other.getTransferMessage() != null && other.getTransferMessage().equals(this.getTransferMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputDeviceId() == null) ? 0 : getInputDeviceId().hashCode());
        hashCode = prime * hashCode + ((getTargetCustomerId() == null) ? 0 : getTargetCustomerId().hashCode());
        hashCode = prime * hashCode + ((getTargetRegion() == null) ? 0 : getTargetRegion().hashCode());
        hashCode = prime * hashCode + ((getTransferMessage() == null) ? 0 : getTransferMessage().hashCode());
        return hashCode;
    }

    @Override
    public TransferInputDeviceRequest clone() {
        return (TransferInputDeviceRequest) super.clone();
    }

}
