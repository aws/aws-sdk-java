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
 * Describes the code-signing profile.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SigningProfileParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Certificate ARN.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The hardware platform of your device.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The location of the code-signing certificate on your device.
     * </p>
     */
    private String certificatePathOnDevice;

    /**
     * <p>
     * Certificate ARN.
     * </p>
     * 
     * @param certificateArn
     *        Certificate ARN.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * Certificate ARN.
     * </p>
     * 
     * @return Certificate ARN.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * Certificate ARN.
     * </p>
     * 
     * @param certificateArn
     *        Certificate ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningProfileParameter withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The hardware platform of your device.
     * </p>
     * 
     * @param platform
     *        The hardware platform of your device.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The hardware platform of your device.
     * </p>
     * 
     * @return The hardware platform of your device.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The hardware platform of your device.
     * </p>
     * 
     * @param platform
     *        The hardware platform of your device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningProfileParameter withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The location of the code-signing certificate on your device.
     * </p>
     * 
     * @param certificatePathOnDevice
     *        The location of the code-signing certificate on your device.
     */

    public void setCertificatePathOnDevice(String certificatePathOnDevice) {
        this.certificatePathOnDevice = certificatePathOnDevice;
    }

    /**
     * <p>
     * The location of the code-signing certificate on your device.
     * </p>
     * 
     * @return The location of the code-signing certificate on your device.
     */

    public String getCertificatePathOnDevice() {
        return this.certificatePathOnDevice;
    }

    /**
     * <p>
     * The location of the code-signing certificate on your device.
     * </p>
     * 
     * @param certificatePathOnDevice
     *        The location of the code-signing certificate on your device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningProfileParameter withCertificatePathOnDevice(String certificatePathOnDevice) {
        setCertificatePathOnDevice(certificatePathOnDevice);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getCertificatePathOnDevice() != null)
            sb.append("CertificatePathOnDevice: ").append(getCertificatePathOnDevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SigningProfileParameter == false)
            return false;
        SigningProfileParameter other = (SigningProfileParameter) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getCertificatePathOnDevice() == null ^ this.getCertificatePathOnDevice() == null)
            return false;
        if (other.getCertificatePathOnDevice() != null && other.getCertificatePathOnDevice().equals(this.getCertificatePathOnDevice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getCertificatePathOnDevice() == null) ? 0 : getCertificatePathOnDevice().hashCode());
        return hashCode;
    }

    @Override
    public SigningProfileParameter clone() {
        try {
            return (SigningProfileParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.SigningProfileParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
