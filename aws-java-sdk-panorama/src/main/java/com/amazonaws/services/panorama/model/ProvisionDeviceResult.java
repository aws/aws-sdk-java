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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ProvisionDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionDeviceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The device's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The device's configuration bundle.
     * </p>
     */
    private java.nio.ByteBuffer certificates;
    /**
     * <p>
     * The device's ID.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The device's IoT thing name.
     * </p>
     */
    private String iotThingName;
    /**
     * <p>
     * The device's status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The device's ARN.
     * </p>
     * 
     * @param arn
     *        The device's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The device's ARN.
     * </p>
     * 
     * @return The device's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The device's ARN.
     * </p>
     * 
     * @param arn
     *        The device's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionDeviceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The device's configuration bundle.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param certificates
     *        The device's configuration bundle.
     */

    public void setCertificates(java.nio.ByteBuffer certificates) {
        this.certificates = certificates;
    }

    /**
     * <p>
     * The device's configuration bundle.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The device's configuration bundle.
     */

    public java.nio.ByteBuffer getCertificates() {
        return this.certificates;
    }

    /**
     * <p>
     * The device's configuration bundle.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param certificates
     *        The device's configuration bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionDeviceResult withCertificates(java.nio.ByteBuffer certificates) {
        setCertificates(certificates);
        return this;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @param deviceId
     *        The device's ID.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @return The device's ID.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @param deviceId
     *        The device's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionDeviceResult withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The device's IoT thing name.
     * </p>
     * 
     * @param iotThingName
     *        The device's IoT thing name.
     */

    public void setIotThingName(String iotThingName) {
        this.iotThingName = iotThingName;
    }

    /**
     * <p>
     * The device's IoT thing name.
     * </p>
     * 
     * @return The device's IoT thing name.
     */

    public String getIotThingName() {
        return this.iotThingName;
    }

    /**
     * <p>
     * The device's IoT thing name.
     * </p>
     * 
     * @param iotThingName
     *        The device's IoT thing name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionDeviceResult withIotThingName(String iotThingName) {
        setIotThingName(iotThingName);
        return this;
    }

    /**
     * <p>
     * The device's status.
     * </p>
     * 
     * @param status
     *        The device's status.
     * @see DeviceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The device's status.
     * </p>
     * 
     * @return The device's status.
     * @see DeviceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The device's status.
     * </p>
     * 
     * @param status
     *        The device's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public ProvisionDeviceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The device's status.
     * </p>
     * 
     * @param status
     *        The device's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public ProvisionDeviceResult withStatus(DeviceStatus status) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCertificates() != null)
            sb.append("Certificates: ").append(getCertificates()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getIotThingName() != null)
            sb.append("IotThingName: ").append(getIotThingName()).append(",");
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

        if (obj instanceof ProvisionDeviceResult == false)
            return false;
        ProvisionDeviceResult other = (ProvisionDeviceResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCertificates() == null ^ this.getCertificates() == null)
            return false;
        if (other.getCertificates() != null && other.getCertificates().equals(this.getCertificates()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getIotThingName() == null ^ this.getIotThingName() == null)
            return false;
        if (other.getIotThingName() != null && other.getIotThingName().equals(this.getIotThingName()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCertificates() == null) ? 0 : getCertificates().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getIotThingName() == null) ? 0 : getIotThingName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionDeviceResult clone() {
        try {
            return (ProvisionDeviceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
