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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a device object associated with a tape gateway.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/VTLDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VTLDevice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive or media changer).
     * </p>
     */
    private String vTLDeviceARN;
    /**
     * <p>
     * Specifies the type of device that the VTL device emulates.
     * </p>
     */
    private String vTLDeviceType;
    /**
     * <p>
     * Specifies the vendor of the device that the VTL device object emulates.
     * </p>
     */
    private String vTLDeviceVendor;
    /**
     * <p>
     * Specifies the model number of device that the VTL device emulates.
     * </p>
     */
    private String vTLDeviceProductIdentifier;
    /**
     * <p>
     * A list of iSCSI information about a VTL device.
     * </p>
     */
    private DeviceiSCSIAttributes deviceiSCSIAttributes;

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive or media changer).
     * </p>
     * 
     * @param vTLDeviceARN
     *        Specifies the unique Amazon Resource Name (ARN) of the device (tape drive or media changer).
     */

    public void setVTLDeviceARN(String vTLDeviceARN) {
        this.vTLDeviceARN = vTLDeviceARN;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive or media changer).
     * </p>
     * 
     * @return Specifies the unique Amazon Resource Name (ARN) of the device (tape drive or media changer).
     */

    public String getVTLDeviceARN() {
        return this.vTLDeviceARN;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive or media changer).
     * </p>
     * 
     * @param vTLDeviceARN
     *        Specifies the unique Amazon Resource Name (ARN) of the device (tape drive or media changer).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VTLDevice withVTLDeviceARN(String vTLDeviceARN) {
        setVTLDeviceARN(vTLDeviceARN);
        return this;
    }

    /**
     * <p>
     * Specifies the type of device that the VTL device emulates.
     * </p>
     * 
     * @param vTLDeviceType
     *        Specifies the type of device that the VTL device emulates.
     */

    public void setVTLDeviceType(String vTLDeviceType) {
        this.vTLDeviceType = vTLDeviceType;
    }

    /**
     * <p>
     * Specifies the type of device that the VTL device emulates.
     * </p>
     * 
     * @return Specifies the type of device that the VTL device emulates.
     */

    public String getVTLDeviceType() {
        return this.vTLDeviceType;
    }

    /**
     * <p>
     * Specifies the type of device that the VTL device emulates.
     * </p>
     * 
     * @param vTLDeviceType
     *        Specifies the type of device that the VTL device emulates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VTLDevice withVTLDeviceType(String vTLDeviceType) {
        setVTLDeviceType(vTLDeviceType);
        return this;
    }

    /**
     * <p>
     * Specifies the vendor of the device that the VTL device object emulates.
     * </p>
     * 
     * @param vTLDeviceVendor
     *        Specifies the vendor of the device that the VTL device object emulates.
     */

    public void setVTLDeviceVendor(String vTLDeviceVendor) {
        this.vTLDeviceVendor = vTLDeviceVendor;
    }

    /**
     * <p>
     * Specifies the vendor of the device that the VTL device object emulates.
     * </p>
     * 
     * @return Specifies the vendor of the device that the VTL device object emulates.
     */

    public String getVTLDeviceVendor() {
        return this.vTLDeviceVendor;
    }

    /**
     * <p>
     * Specifies the vendor of the device that the VTL device object emulates.
     * </p>
     * 
     * @param vTLDeviceVendor
     *        Specifies the vendor of the device that the VTL device object emulates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VTLDevice withVTLDeviceVendor(String vTLDeviceVendor) {
        setVTLDeviceVendor(vTLDeviceVendor);
        return this;
    }

    /**
     * <p>
     * Specifies the model number of device that the VTL device emulates.
     * </p>
     * 
     * @param vTLDeviceProductIdentifier
     *        Specifies the model number of device that the VTL device emulates.
     */

    public void setVTLDeviceProductIdentifier(String vTLDeviceProductIdentifier) {
        this.vTLDeviceProductIdentifier = vTLDeviceProductIdentifier;
    }

    /**
     * <p>
     * Specifies the model number of device that the VTL device emulates.
     * </p>
     * 
     * @return Specifies the model number of device that the VTL device emulates.
     */

    public String getVTLDeviceProductIdentifier() {
        return this.vTLDeviceProductIdentifier;
    }

    /**
     * <p>
     * Specifies the model number of device that the VTL device emulates.
     * </p>
     * 
     * @param vTLDeviceProductIdentifier
     *        Specifies the model number of device that the VTL device emulates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VTLDevice withVTLDeviceProductIdentifier(String vTLDeviceProductIdentifier) {
        setVTLDeviceProductIdentifier(vTLDeviceProductIdentifier);
        return this;
    }

    /**
     * <p>
     * A list of iSCSI information about a VTL device.
     * </p>
     * 
     * @param deviceiSCSIAttributes
     *        A list of iSCSI information about a VTL device.
     */

    public void setDeviceiSCSIAttributes(DeviceiSCSIAttributes deviceiSCSIAttributes) {
        this.deviceiSCSIAttributes = deviceiSCSIAttributes;
    }

    /**
     * <p>
     * A list of iSCSI information about a VTL device.
     * </p>
     * 
     * @return A list of iSCSI information about a VTL device.
     */

    public DeviceiSCSIAttributes getDeviceiSCSIAttributes() {
        return this.deviceiSCSIAttributes;
    }

    /**
     * <p>
     * A list of iSCSI information about a VTL device.
     * </p>
     * 
     * @param deviceiSCSIAttributes
     *        A list of iSCSI information about a VTL device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VTLDevice withDeviceiSCSIAttributes(DeviceiSCSIAttributes deviceiSCSIAttributes) {
        setDeviceiSCSIAttributes(deviceiSCSIAttributes);
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
        if (getVTLDeviceARN() != null)
            sb.append("VTLDeviceARN: ").append(getVTLDeviceARN()).append(",");
        if (getVTLDeviceType() != null)
            sb.append("VTLDeviceType: ").append(getVTLDeviceType()).append(",");
        if (getVTLDeviceVendor() != null)
            sb.append("VTLDeviceVendor: ").append(getVTLDeviceVendor()).append(",");
        if (getVTLDeviceProductIdentifier() != null)
            sb.append("VTLDeviceProductIdentifier: ").append(getVTLDeviceProductIdentifier()).append(",");
        if (getDeviceiSCSIAttributes() != null)
            sb.append("DeviceiSCSIAttributes: ").append(getDeviceiSCSIAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VTLDevice == false)
            return false;
        VTLDevice other = (VTLDevice) obj;
        if (other.getVTLDeviceARN() == null ^ this.getVTLDeviceARN() == null)
            return false;
        if (other.getVTLDeviceARN() != null && other.getVTLDeviceARN().equals(this.getVTLDeviceARN()) == false)
            return false;
        if (other.getVTLDeviceType() == null ^ this.getVTLDeviceType() == null)
            return false;
        if (other.getVTLDeviceType() != null && other.getVTLDeviceType().equals(this.getVTLDeviceType()) == false)
            return false;
        if (other.getVTLDeviceVendor() == null ^ this.getVTLDeviceVendor() == null)
            return false;
        if (other.getVTLDeviceVendor() != null && other.getVTLDeviceVendor().equals(this.getVTLDeviceVendor()) == false)
            return false;
        if (other.getVTLDeviceProductIdentifier() == null ^ this.getVTLDeviceProductIdentifier() == null)
            return false;
        if (other.getVTLDeviceProductIdentifier() != null && other.getVTLDeviceProductIdentifier().equals(this.getVTLDeviceProductIdentifier()) == false)
            return false;
        if (other.getDeviceiSCSIAttributes() == null ^ this.getDeviceiSCSIAttributes() == null)
            return false;
        if (other.getDeviceiSCSIAttributes() != null && other.getDeviceiSCSIAttributes().equals(this.getDeviceiSCSIAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVTLDeviceARN() == null) ? 0 : getVTLDeviceARN().hashCode());
        hashCode = prime * hashCode + ((getVTLDeviceType() == null) ? 0 : getVTLDeviceType().hashCode());
        hashCode = prime * hashCode + ((getVTLDeviceVendor() == null) ? 0 : getVTLDeviceVendor().hashCode());
        hashCode = prime * hashCode + ((getVTLDeviceProductIdentifier() == null) ? 0 : getVTLDeviceProductIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDeviceiSCSIAttributes() == null) ? 0 : getDeviceiSCSIAttributes().hashCode());
        return hashCode;
    }

    @Override
    public VTLDevice clone() {
        try {
            return (VTLDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.storagegateway.model.transform.VTLDeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
