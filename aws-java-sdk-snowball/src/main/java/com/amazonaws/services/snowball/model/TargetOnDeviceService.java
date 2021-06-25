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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the service or services on the Snow Family device that your transferred data will be
 * exported from or imported into. AWS Snow Family supports Amazon S3 and NFS (Network File System).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/TargetOnDeviceService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetOnDeviceService implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the name of the service on the Snow Family device that your transferred data will be exported from or
     * imported into.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * Specifies whether the data is being imported or exported. You can import or export the data, or use it locally on
     * the device.
     * </p>
     */
    private String transferOption;

    /**
     * <p>
     * Specifies the name of the service on the Snow Family device that your transferred data will be exported from or
     * imported into.
     * </p>
     * 
     * @param serviceName
     *        Specifies the name of the service on the Snow Family device that your transferred data will be exported
     *        from or imported into.
     * @see DeviceServiceName
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * Specifies the name of the service on the Snow Family device that your transferred data will be exported from or
     * imported into.
     * </p>
     * 
     * @return Specifies the name of the service on the Snow Family device that your transferred data will be exported
     *         from or imported into.
     * @see DeviceServiceName
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * Specifies the name of the service on the Snow Family device that your transferred data will be exported from or
     * imported into.
     * </p>
     * 
     * @param serviceName
     *        Specifies the name of the service on the Snow Family device that your transferred data will be exported
     *        from or imported into.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceServiceName
     */

    public TargetOnDeviceService withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the service on the Snow Family device that your transferred data will be exported from or
     * imported into.
     * </p>
     * 
     * @param serviceName
     *        Specifies the name of the service on the Snow Family device that your transferred data will be exported
     *        from or imported into.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceServiceName
     */

    public TargetOnDeviceService withServiceName(DeviceServiceName serviceName) {
        this.serviceName = serviceName.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the data is being imported or exported. You can import or export the data, or use it locally on
     * the device.
     * </p>
     * 
     * @param transferOption
     *        Specifies whether the data is being imported or exported. You can import or export the data, or use it
     *        locally on the device.
     * @see TransferOption
     */

    public void setTransferOption(String transferOption) {
        this.transferOption = transferOption;
    }

    /**
     * <p>
     * Specifies whether the data is being imported or exported. You can import or export the data, or use it locally on
     * the device.
     * </p>
     * 
     * @return Specifies whether the data is being imported or exported. You can import or export the data, or use it
     *         locally on the device.
     * @see TransferOption
     */

    public String getTransferOption() {
        return this.transferOption;
    }

    /**
     * <p>
     * Specifies whether the data is being imported or exported. You can import or export the data, or use it locally on
     * the device.
     * </p>
     * 
     * @param transferOption
     *        Specifies whether the data is being imported or exported. You can import or export the data, or use it
     *        locally on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransferOption
     */

    public TargetOnDeviceService withTransferOption(String transferOption) {
        setTransferOption(transferOption);
        return this;
    }

    /**
     * <p>
     * Specifies whether the data is being imported or exported. You can import or export the data, or use it locally on
     * the device.
     * </p>
     * 
     * @param transferOption
     *        Specifies whether the data is being imported or exported. You can import or export the data, or use it
     *        locally on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransferOption
     */

    public TargetOnDeviceService withTransferOption(TransferOption transferOption) {
        this.transferOption = transferOption.toString();
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getTransferOption() != null)
            sb.append("TransferOption: ").append(getTransferOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetOnDeviceService == false)
            return false;
        TargetOnDeviceService other = (TargetOnDeviceService) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getTransferOption() == null ^ this.getTransferOption() == null)
            return false;
        if (other.getTransferOption() != null && other.getTransferOption().equals(this.getTransferOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getTransferOption() == null) ? 0 : getTransferOption().hashCode());
        return hashCode;
    }

    @Override
    public TargetOnDeviceService clone() {
        try {
            return (TargetOnDeviceService) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.TargetOnDeviceServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
