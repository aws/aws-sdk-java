/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotdeviceadvisor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information of a test device. A thing ARN, certificate ARN or device role ARN is required.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotdeviceadvisor-2020-09-18/DeviceUnderTest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceUnderTest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lists device's thing ARN.
     * </p>
     */
    private String thingArn;
    /**
     * <p>
     * Lists device's certificate ARN.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * Lists device's role ARN.
     * </p>
     */
    private String deviceRoleArn;

    /**
     * <p>
     * Lists device's thing ARN.
     * </p>
     * 
     * @param thingArn
     *        Lists device's thing ARN.
     */

    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * Lists device's thing ARN.
     * </p>
     * 
     * @return Lists device's thing ARN.
     */

    public String getThingArn() {
        return this.thingArn;
    }

    /**
     * <p>
     * Lists device's thing ARN.
     * </p>
     * 
     * @param thingArn
     *        Lists device's thing ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceUnderTest withThingArn(String thingArn) {
        setThingArn(thingArn);
        return this;
    }

    /**
     * <p>
     * Lists device's certificate ARN.
     * </p>
     * 
     * @param certificateArn
     *        Lists device's certificate ARN.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * Lists device's certificate ARN.
     * </p>
     * 
     * @return Lists device's certificate ARN.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * Lists device's certificate ARN.
     * </p>
     * 
     * @param certificateArn
     *        Lists device's certificate ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceUnderTest withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * Lists device's role ARN.
     * </p>
     * 
     * @param deviceRoleArn
     *        Lists device's role ARN.
     */

    public void setDeviceRoleArn(String deviceRoleArn) {
        this.deviceRoleArn = deviceRoleArn;
    }

    /**
     * <p>
     * Lists device's role ARN.
     * </p>
     * 
     * @return Lists device's role ARN.
     */

    public String getDeviceRoleArn() {
        return this.deviceRoleArn;
    }

    /**
     * <p>
     * Lists device's role ARN.
     * </p>
     * 
     * @param deviceRoleArn
     *        Lists device's role ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceUnderTest withDeviceRoleArn(String deviceRoleArn) {
        setDeviceRoleArn(deviceRoleArn);
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
        if (getThingArn() != null)
            sb.append("ThingArn: ").append(getThingArn()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getDeviceRoleArn() != null)
            sb.append("DeviceRoleArn: ").append(getDeviceRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceUnderTest == false)
            return false;
        DeviceUnderTest other = (DeviceUnderTest) obj;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getDeviceRoleArn() == null ^ this.getDeviceRoleArn() == null)
            return false;
        if (other.getDeviceRoleArn() != null && other.getDeviceRoleArn().equals(this.getDeviceRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceRoleArn() == null) ? 0 : getDeviceRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public DeviceUnderTest clone() {
        try {
            return (DeviceUnderTest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotdeviceadvisor.model.transform.DeviceUnderTestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
