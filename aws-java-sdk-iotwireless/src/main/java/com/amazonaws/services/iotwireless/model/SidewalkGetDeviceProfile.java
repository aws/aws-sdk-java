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
 * Gets information about a Sidewalk device profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/SidewalkGetDeviceProfile"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SidewalkGetDeviceProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Sidewalk application server public key.
     * </p>
     */
    private String applicationServerPublicKey;
    /**
     * <p>
     * Gets information about the certification status of a Sidewalk device profile.
     * </p>
     */
    private Boolean qualificationStatus;
    /**
     * <p>
     * The DAK certificate information of the Sidewalk device profile.
     * </p>
     */
    private java.util.List<DakCertificateMetadata> dakCertificateMetadata;

    /**
     * <p>
     * The Sidewalk application server public key.
     * </p>
     * 
     * @param applicationServerPublicKey
     *        The Sidewalk application server public key.
     */

    public void setApplicationServerPublicKey(String applicationServerPublicKey) {
        this.applicationServerPublicKey = applicationServerPublicKey;
    }

    /**
     * <p>
     * The Sidewalk application server public key.
     * </p>
     * 
     * @return The Sidewalk application server public key.
     */

    public String getApplicationServerPublicKey() {
        return this.applicationServerPublicKey;
    }

    /**
     * <p>
     * The Sidewalk application server public key.
     * </p>
     * 
     * @param applicationServerPublicKey
     *        The Sidewalk application server public key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkGetDeviceProfile withApplicationServerPublicKey(String applicationServerPublicKey) {
        setApplicationServerPublicKey(applicationServerPublicKey);
        return this;
    }

    /**
     * <p>
     * Gets information about the certification status of a Sidewalk device profile.
     * </p>
     * 
     * @param qualificationStatus
     *        Gets information about the certification status of a Sidewalk device profile.
     */

    public void setQualificationStatus(Boolean qualificationStatus) {
        this.qualificationStatus = qualificationStatus;
    }

    /**
     * <p>
     * Gets information about the certification status of a Sidewalk device profile.
     * </p>
     * 
     * @return Gets information about the certification status of a Sidewalk device profile.
     */

    public Boolean getQualificationStatus() {
        return this.qualificationStatus;
    }

    /**
     * <p>
     * Gets information about the certification status of a Sidewalk device profile.
     * </p>
     * 
     * @param qualificationStatus
     *        Gets information about the certification status of a Sidewalk device profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkGetDeviceProfile withQualificationStatus(Boolean qualificationStatus) {
        setQualificationStatus(qualificationStatus);
        return this;
    }

    /**
     * <p>
     * Gets information about the certification status of a Sidewalk device profile.
     * </p>
     * 
     * @return Gets information about the certification status of a Sidewalk device profile.
     */

    public Boolean isQualificationStatus() {
        return this.qualificationStatus;
    }

    /**
     * <p>
     * The DAK certificate information of the Sidewalk device profile.
     * </p>
     * 
     * @return The DAK certificate information of the Sidewalk device profile.
     */

    public java.util.List<DakCertificateMetadata> getDakCertificateMetadata() {
        return dakCertificateMetadata;
    }

    /**
     * <p>
     * The DAK certificate information of the Sidewalk device profile.
     * </p>
     * 
     * @param dakCertificateMetadata
     *        The DAK certificate information of the Sidewalk device profile.
     */

    public void setDakCertificateMetadata(java.util.Collection<DakCertificateMetadata> dakCertificateMetadata) {
        if (dakCertificateMetadata == null) {
            this.dakCertificateMetadata = null;
            return;
        }

        this.dakCertificateMetadata = new java.util.ArrayList<DakCertificateMetadata>(dakCertificateMetadata);
    }

    /**
     * <p>
     * The DAK certificate information of the Sidewalk device profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDakCertificateMetadata(java.util.Collection)} or
     * {@link #withDakCertificateMetadata(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dakCertificateMetadata
     *        The DAK certificate information of the Sidewalk device profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkGetDeviceProfile withDakCertificateMetadata(DakCertificateMetadata... dakCertificateMetadata) {
        if (this.dakCertificateMetadata == null) {
            setDakCertificateMetadata(new java.util.ArrayList<DakCertificateMetadata>(dakCertificateMetadata.length));
        }
        for (DakCertificateMetadata ele : dakCertificateMetadata) {
            this.dakCertificateMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The DAK certificate information of the Sidewalk device profile.
     * </p>
     * 
     * @param dakCertificateMetadata
     *        The DAK certificate information of the Sidewalk device profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SidewalkGetDeviceProfile withDakCertificateMetadata(java.util.Collection<DakCertificateMetadata> dakCertificateMetadata) {
        setDakCertificateMetadata(dakCertificateMetadata);
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
        if (getApplicationServerPublicKey() != null)
            sb.append("ApplicationServerPublicKey: ").append("***Sensitive Data Redacted***").append(",");
        if (getQualificationStatus() != null)
            sb.append("QualificationStatus: ").append(getQualificationStatus()).append(",");
        if (getDakCertificateMetadata() != null)
            sb.append("DakCertificateMetadata: ").append(getDakCertificateMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SidewalkGetDeviceProfile == false)
            return false;
        SidewalkGetDeviceProfile other = (SidewalkGetDeviceProfile) obj;
        if (other.getApplicationServerPublicKey() == null ^ this.getApplicationServerPublicKey() == null)
            return false;
        if (other.getApplicationServerPublicKey() != null && other.getApplicationServerPublicKey().equals(this.getApplicationServerPublicKey()) == false)
            return false;
        if (other.getQualificationStatus() == null ^ this.getQualificationStatus() == null)
            return false;
        if (other.getQualificationStatus() != null && other.getQualificationStatus().equals(this.getQualificationStatus()) == false)
            return false;
        if (other.getDakCertificateMetadata() == null ^ this.getDakCertificateMetadata() == null)
            return false;
        if (other.getDakCertificateMetadata() != null && other.getDakCertificateMetadata().equals(this.getDakCertificateMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationServerPublicKey() == null) ? 0 : getApplicationServerPublicKey().hashCode());
        hashCode = prime * hashCode + ((getQualificationStatus() == null) ? 0 : getQualificationStatus().hashCode());
        hashCode = prime * hashCode + ((getDakCertificateMetadata() == null) ? 0 : getDakCertificateMetadata().hashCode());
        return hashCode;
    }

    @Override
    public SidewalkGetDeviceProfile clone() {
        try {
            return (SidewalkGetDeviceProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.SidewalkGetDeviceProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
