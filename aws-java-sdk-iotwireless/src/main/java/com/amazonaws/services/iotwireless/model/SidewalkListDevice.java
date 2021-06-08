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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sidewalk object used by list functions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SidewalkListDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SidewalkListDevice implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Sidewalk Amazon ID.
     * </p>
     */
    private String amazonId;
    /**
     * <p>
     * The sidewalk device identification.
     * </p>
     */
    private String sidewalkId;
    /**
     * <p>
     * The Sidewalk manufacturing series number.
     * </p>
     */
    private String sidewalkManufacturingSn;
    /**
     * <p>
     * The sidewalk device certificates for Ed25519 and P256r1.
     * </p>
     */
    private java.util.List<CertificateList> deviceCertificates;

    /**
     * <p>
     * The Sidewalk Amazon ID.
     * </p>
     * 
     * @param amazonId
     *        The Sidewalk Amazon ID.
     */

    public void setAmazonId(String amazonId) {
        this.amazonId = amazonId;
    }

    /**
     * <p>
     * The Sidewalk Amazon ID.
     * </p>
     * 
     * @return The Sidewalk Amazon ID.
     */

    public String getAmazonId() {
        return this.amazonId;
    }

    /**
     * <p>
     * The Sidewalk Amazon ID.
     * </p>
     * 
     * @param amazonId
     *        The Sidewalk Amazon ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkListDevice withAmazonId(String amazonId) {
        setAmazonId(amazonId);
        return this;
    }

    /**
     * <p>
     * The sidewalk device identification.
     * </p>
     * 
     * @param sidewalkId
     *        The sidewalk device identification.
     */

    public void setSidewalkId(String sidewalkId) {
        this.sidewalkId = sidewalkId;
    }

    /**
     * <p>
     * The sidewalk device identification.
     * </p>
     * 
     * @return The sidewalk device identification.
     */

    public String getSidewalkId() {
        return this.sidewalkId;
    }

    /**
     * <p>
     * The sidewalk device identification.
     * </p>
     * 
     * @param sidewalkId
     *        The sidewalk device identification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkListDevice withSidewalkId(String sidewalkId) {
        setSidewalkId(sidewalkId);
        return this;
    }

    /**
     * <p>
     * The Sidewalk manufacturing series number.
     * </p>
     * 
     * @param sidewalkManufacturingSn
     *        The Sidewalk manufacturing series number.
     */

    public void setSidewalkManufacturingSn(String sidewalkManufacturingSn) {
        this.sidewalkManufacturingSn = sidewalkManufacturingSn;
    }

    /**
     * <p>
     * The Sidewalk manufacturing series number.
     * </p>
     * 
     * @return The Sidewalk manufacturing series number.
     */

    public String getSidewalkManufacturingSn() {
        return this.sidewalkManufacturingSn;
    }

    /**
     * <p>
     * The Sidewalk manufacturing series number.
     * </p>
     * 
     * @param sidewalkManufacturingSn
     *        The Sidewalk manufacturing series number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkListDevice withSidewalkManufacturingSn(String sidewalkManufacturingSn) {
        setSidewalkManufacturingSn(sidewalkManufacturingSn);
        return this;
    }

    /**
     * <p>
     * The sidewalk device certificates for Ed25519 and P256r1.
     * </p>
     * 
     * @return The sidewalk device certificates for Ed25519 and P256r1.
     */

    public java.util.List<CertificateList> getDeviceCertificates() {
        return deviceCertificates;
    }

    /**
     * <p>
     * The sidewalk device certificates for Ed25519 and P256r1.
     * </p>
     * 
     * @param deviceCertificates
     *        The sidewalk device certificates for Ed25519 and P256r1.
     */

    public void setDeviceCertificates(java.util.Collection<CertificateList> deviceCertificates) {
        if (deviceCertificates == null) {
            this.deviceCertificates = null;
            return;
        }

        this.deviceCertificates = new java.util.ArrayList<CertificateList>(deviceCertificates);
    }

    /**
     * <p>
     * The sidewalk device certificates for Ed25519 and P256r1.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceCertificates(java.util.Collection)} or {@link #withDeviceCertificates(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param deviceCertificates
     *        The sidewalk device certificates for Ed25519 and P256r1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkListDevice withDeviceCertificates(CertificateList... deviceCertificates) {
        if (this.deviceCertificates == null) {
            setDeviceCertificates(new java.util.ArrayList<CertificateList>(deviceCertificates.length));
        }
        for (CertificateList ele : deviceCertificates) {
            this.deviceCertificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sidewalk device certificates for Ed25519 and P256r1.
     * </p>
     * 
     * @param deviceCertificates
     *        The sidewalk device certificates for Ed25519 and P256r1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkListDevice withDeviceCertificates(java.util.Collection<CertificateList> deviceCertificates) {
        setDeviceCertificates(deviceCertificates);
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
        if (getAmazonId() != null)
            sb.append("AmazonId: ").append(getAmazonId()).append(",");
        if (getSidewalkId() != null)
            sb.append("SidewalkId: ").append(getSidewalkId()).append(",");
        if (getSidewalkManufacturingSn() != null)
            sb.append("SidewalkManufacturingSn: ").append(getSidewalkManufacturingSn()).append(",");
        if (getDeviceCertificates() != null)
            sb.append("DeviceCertificates: ").append(getDeviceCertificates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SidewalkListDevice == false)
            return false;
        SidewalkListDevice other = (SidewalkListDevice) obj;
        if (other.getAmazonId() == null ^ this.getAmazonId() == null)
            return false;
        if (other.getAmazonId() != null && other.getAmazonId().equals(this.getAmazonId()) == false)
            return false;
        if (other.getSidewalkId() == null ^ this.getSidewalkId() == null)
            return false;
        if (other.getSidewalkId() != null && other.getSidewalkId().equals(this.getSidewalkId()) == false)
            return false;
        if (other.getSidewalkManufacturingSn() == null ^ this.getSidewalkManufacturingSn() == null)
            return false;
        if (other.getSidewalkManufacturingSn() != null && other.getSidewalkManufacturingSn().equals(this.getSidewalkManufacturingSn()) == false)
            return false;
        if (other.getDeviceCertificates() == null ^ this.getDeviceCertificates() == null)
            return false;
        if (other.getDeviceCertificates() != null && other.getDeviceCertificates().equals(this.getDeviceCertificates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmazonId() == null) ? 0 : getAmazonId().hashCode());
        hashCode = prime * hashCode + ((getSidewalkId() == null) ? 0 : getSidewalkId().hashCode());
        hashCode = prime * hashCode + ((getSidewalkManufacturingSn() == null) ? 0 : getSidewalkManufacturingSn().hashCode());
        hashCode = prime * hashCode + ((getDeviceCertificates() == null) ? 0 : getDeviceCertificates().hashCode());
        return hashCode;
    }

    @Override
    public SidewalkListDevice clone() {
        try {
            return (SidewalkListDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SidewalkListDeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
