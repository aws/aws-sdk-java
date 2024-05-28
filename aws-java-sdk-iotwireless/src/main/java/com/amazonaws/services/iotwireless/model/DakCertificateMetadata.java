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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The device attestation key (DAK) information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DakCertificateMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DakCertificateMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The certificate ID for the DAK.
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * The maximum number of signatures that the DAK can sign. A value of <code>-1</code> indicates that there's no
     * device limit.
     * </p>
     */
    private Integer maxAllowedSignature;
    /**
     * <p>
     * Whether factory support has been enabled.
     * </p>
     */
    private Boolean factorySupport;
    /**
     * <p>
     * The advertised product ID (APID) that's used for pre-production and production applications.
     * </p>
     */
    private String apId;
    /**
     * <p>
     * The device type ID that's used for prototyping applications.
     * </p>
     */
    private String deviceTypeId;

    /**
     * <p>
     * The certificate ID for the DAK.
     * </p>
     * 
     * @param certificateId
     *        The certificate ID for the DAK.
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The certificate ID for the DAK.
     * </p>
     * 
     * @return The certificate ID for the DAK.
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The certificate ID for the DAK.
     * </p>
     * 
     * @param certificateId
     *        The certificate ID for the DAK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DakCertificateMetadata withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * The maximum number of signatures that the DAK can sign. A value of <code>-1</code> indicates that there's no
     * device limit.
     * </p>
     * 
     * @param maxAllowedSignature
     *        The maximum number of signatures that the DAK can sign. A value of <code>-1</code> indicates that there's
     *        no device limit.
     */

    public void setMaxAllowedSignature(Integer maxAllowedSignature) {
        this.maxAllowedSignature = maxAllowedSignature;
    }

    /**
     * <p>
     * The maximum number of signatures that the DAK can sign. A value of <code>-1</code> indicates that there's no
     * device limit.
     * </p>
     * 
     * @return The maximum number of signatures that the DAK can sign. A value of <code>-1</code> indicates that there's
     *         no device limit.
     */

    public Integer getMaxAllowedSignature() {
        return this.maxAllowedSignature;
    }

    /**
     * <p>
     * The maximum number of signatures that the DAK can sign. A value of <code>-1</code> indicates that there's no
     * device limit.
     * </p>
     * 
     * @param maxAllowedSignature
     *        The maximum number of signatures that the DAK can sign. A value of <code>-1</code> indicates that there's
     *        no device limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DakCertificateMetadata withMaxAllowedSignature(Integer maxAllowedSignature) {
        setMaxAllowedSignature(maxAllowedSignature);
        return this;
    }

    /**
     * <p>
     * Whether factory support has been enabled.
     * </p>
     * 
     * @param factorySupport
     *        Whether factory support has been enabled.
     */

    public void setFactorySupport(Boolean factorySupport) {
        this.factorySupport = factorySupport;
    }

    /**
     * <p>
     * Whether factory support has been enabled.
     * </p>
     * 
     * @return Whether factory support has been enabled.
     */

    public Boolean getFactorySupport() {
        return this.factorySupport;
    }

    /**
     * <p>
     * Whether factory support has been enabled.
     * </p>
     * 
     * @param factorySupport
     *        Whether factory support has been enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DakCertificateMetadata withFactorySupport(Boolean factorySupport) {
        setFactorySupport(factorySupport);
        return this;
    }

    /**
     * <p>
     * Whether factory support has been enabled.
     * </p>
     * 
     * @return Whether factory support has been enabled.
     */

    public Boolean isFactorySupport() {
        return this.factorySupport;
    }

    /**
     * <p>
     * The advertised product ID (APID) that's used for pre-production and production applications.
     * </p>
     * 
     * @param apId
     *        The advertised product ID (APID) that's used for pre-production and production applications.
     */

    public void setApId(String apId) {
        this.apId = apId;
    }

    /**
     * <p>
     * The advertised product ID (APID) that's used for pre-production and production applications.
     * </p>
     * 
     * @return The advertised product ID (APID) that's used for pre-production and production applications.
     */

    public String getApId() {
        return this.apId;
    }

    /**
     * <p>
     * The advertised product ID (APID) that's used for pre-production and production applications.
     * </p>
     * 
     * @param apId
     *        The advertised product ID (APID) that's used for pre-production and production applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DakCertificateMetadata withApId(String apId) {
        setApId(apId);
        return this;
    }

    /**
     * <p>
     * The device type ID that's used for prototyping applications.
     * </p>
     * 
     * @param deviceTypeId
     *        The device type ID that's used for prototyping applications.
     */

    public void setDeviceTypeId(String deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    /**
     * <p>
     * The device type ID that's used for prototyping applications.
     * </p>
     * 
     * @return The device type ID that's used for prototyping applications.
     */

    public String getDeviceTypeId() {
        return this.deviceTypeId;
    }

    /**
     * <p>
     * The device type ID that's used for prototyping applications.
     * </p>
     * 
     * @param deviceTypeId
     *        The device type ID that's used for prototyping applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DakCertificateMetadata withDeviceTypeId(String deviceTypeId) {
        setDeviceTypeId(deviceTypeId);
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
        if (getCertificateId() != null)
            sb.append("CertificateId: ").append(getCertificateId()).append(",");
        if (getMaxAllowedSignature() != null)
            sb.append("MaxAllowedSignature: ").append(getMaxAllowedSignature()).append(",");
        if (getFactorySupport() != null)
            sb.append("FactorySupport: ").append(getFactorySupport()).append(",");
        if (getApId() != null)
            sb.append("ApId: ").append(getApId()).append(",");
        if (getDeviceTypeId() != null)
            sb.append("DeviceTypeId: ").append(getDeviceTypeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DakCertificateMetadata == false)
            return false;
        DakCertificateMetadata other = (DakCertificateMetadata) obj;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getMaxAllowedSignature() == null ^ this.getMaxAllowedSignature() == null)
            return false;
        if (other.getMaxAllowedSignature() != null && other.getMaxAllowedSignature().equals(this.getMaxAllowedSignature()) == false)
            return false;
        if (other.getFactorySupport() == null ^ this.getFactorySupport() == null)
            return false;
        if (other.getFactorySupport() != null && other.getFactorySupport().equals(this.getFactorySupport()) == false)
            return false;
        if (other.getApId() == null ^ this.getApId() == null)
            return false;
        if (other.getApId() != null && other.getApId().equals(this.getApId()) == false)
            return false;
        if (other.getDeviceTypeId() == null ^ this.getDeviceTypeId() == null)
            return false;
        if (other.getDeviceTypeId() != null && other.getDeviceTypeId().equals(this.getDeviceTypeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getMaxAllowedSignature() == null) ? 0 : getMaxAllowedSignature().hashCode());
        hashCode = prime * hashCode + ((getFactorySupport() == null) ? 0 : getFactorySupport().hashCode());
        hashCode = prime * hashCode + ((getApId() == null) ? 0 : getApId().hashCode());
        hashCode = prime * hashCode + ((getDeviceTypeId() == null) ? 0 : getDeviceTypeId().hashCode());
        return hashCode;
    }

    @Override
    public DakCertificateMetadata clone() {
        try {
            return (DakCertificateMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.DakCertificateMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
