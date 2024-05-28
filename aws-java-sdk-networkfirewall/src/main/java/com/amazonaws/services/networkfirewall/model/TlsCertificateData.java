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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata about an Certificate Manager certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/TlsCertificateData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TlsCertificateData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     */
    private String certificateSerial;
    /**
     * <p>
     * The status of the certificate.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Contains details about the certificate status, including information about certificate errors.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the certificate.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TlsCertificateData withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @param certificateSerial
     *        The serial number of the certificate.
     */

    public void setCertificateSerial(String certificateSerial) {
        this.certificateSerial = certificateSerial;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @return The serial number of the certificate.
     */

    public String getCertificateSerial() {
        return this.certificateSerial;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @param certificateSerial
     *        The serial number of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TlsCertificateData withCertificateSerial(String certificateSerial) {
        setCertificateSerial(certificateSerial);
        return this;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @param status
     *        The status of the certificate.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @return The status of the certificate.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @param status
     *        The status of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TlsCertificateData withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Contains details about the certificate status, including information about certificate errors.
     * </p>
     * 
     * @param statusMessage
     *        Contains details about the certificate status, including information about certificate errors.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Contains details about the certificate status, including information about certificate errors.
     * </p>
     * 
     * @return Contains details about the certificate status, including information about certificate errors.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Contains details about the certificate status, including information about certificate errors.
     * </p>
     * 
     * @param statusMessage
     *        Contains details about the certificate status, including information about certificate errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TlsCertificateData withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getCertificateSerial() != null)
            sb.append("CertificateSerial: ").append(getCertificateSerial()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TlsCertificateData == false)
            return false;
        TlsCertificateData other = (TlsCertificateData) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateSerial() == null ^ this.getCertificateSerial() == null)
            return false;
        if (other.getCertificateSerial() != null && other.getCertificateSerial().equals(this.getCertificateSerial()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateSerial() == null) ? 0 : getCertificateSerial().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public TlsCertificateData clone() {
        try {
            return (TlsCertificateData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.TlsCertificateDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
