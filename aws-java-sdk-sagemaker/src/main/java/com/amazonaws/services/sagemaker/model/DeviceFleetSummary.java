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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary of the device fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeviceFleetSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceFleetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the device fleet.
     * </p>
     */
    private String deviceFleetArn;
    /**
     * <p>
     * Name of the device fleet.
     * </p>
     */
    private String deviceFleetName;
    /**
     * <p>
     * Timestamp of when the device fleet was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Timestamp of when the device fleet was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the device fleet.
     * </p>
     * 
     * @param deviceFleetArn
     *        Amazon Resource Name (ARN) of the device fleet.
     */

    public void setDeviceFleetArn(String deviceFleetArn) {
        this.deviceFleetArn = deviceFleetArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the device fleet.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the device fleet.
     */

    public String getDeviceFleetArn() {
        return this.deviceFleetArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the device fleet.
     * </p>
     * 
     * @param deviceFleetArn
     *        Amazon Resource Name (ARN) of the device fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceFleetSummary withDeviceFleetArn(String deviceFleetArn) {
        setDeviceFleetArn(deviceFleetArn);
        return this;
    }

    /**
     * <p>
     * Name of the device fleet.
     * </p>
     * 
     * @param deviceFleetName
     *        Name of the device fleet.
     */

    public void setDeviceFleetName(String deviceFleetName) {
        this.deviceFleetName = deviceFleetName;
    }

    /**
     * <p>
     * Name of the device fleet.
     * </p>
     * 
     * @return Name of the device fleet.
     */

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * <p>
     * Name of the device fleet.
     * </p>
     * 
     * @param deviceFleetName
     *        Name of the device fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceFleetSummary withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
        return this;
    }

    /**
     * <p>
     * Timestamp of when the device fleet was created.
     * </p>
     * 
     * @param creationTime
     *        Timestamp of when the device fleet was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Timestamp of when the device fleet was created.
     * </p>
     * 
     * @return Timestamp of when the device fleet was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Timestamp of when the device fleet was created.
     * </p>
     * 
     * @param creationTime
     *        Timestamp of when the device fleet was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceFleetSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Timestamp of when the device fleet was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        Timestamp of when the device fleet was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Timestamp of when the device fleet was last updated.
     * </p>
     * 
     * @return Timestamp of when the device fleet was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * Timestamp of when the device fleet was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        Timestamp of when the device fleet was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceFleetSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getDeviceFleetArn() != null)
            sb.append("DeviceFleetArn: ").append(getDeviceFleetArn()).append(",");
        if (getDeviceFleetName() != null)
            sb.append("DeviceFleetName: ").append(getDeviceFleetName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceFleetSummary == false)
            return false;
        DeviceFleetSummary other = (DeviceFleetSummary) obj;
        if (other.getDeviceFleetArn() == null ^ this.getDeviceFleetArn() == null)
            return false;
        if (other.getDeviceFleetArn() != null && other.getDeviceFleetArn().equals(this.getDeviceFleetArn()) == false)
            return false;
        if (other.getDeviceFleetName() == null ^ this.getDeviceFleetName() == null)
            return false;
        if (other.getDeviceFleetName() != null && other.getDeviceFleetName().equals(this.getDeviceFleetName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceFleetArn() == null) ? 0 : getDeviceFleetArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceFleetName() == null) ? 0 : getDeviceFleetName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public DeviceFleetSummary clone() {
        try {
            return (DeviceFleetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DeviceFleetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
