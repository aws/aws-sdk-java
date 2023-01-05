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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data field of the trust anchor depending on its type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/SourceData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The root certificate of the Certificate Manager Private Certificate Authority specified by this ARN is used in
     * trust validation for <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operations. Included for trust anchors of type <code>AWS_ACM_PCA</code>.
     * </p>
     */
    private String acmPcaArn;
    /**
     * <p>
     * The PEM-encoded data for the certificate anchor. Included for trust anchors of type
     * <code>CERTIFICATE_BUNDLE</code>.
     * </p>
     */
    private String x509CertificateData;

    /**
     * <p>
     * The root certificate of the Certificate Manager Private Certificate Authority specified by this ARN is used in
     * trust validation for <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operations. Included for trust anchors of type <code>AWS_ACM_PCA</code>.
     * </p>
     * 
     * @param acmPcaArn
     *        The root certificate of the Certificate Manager Private Certificate Authority specified by this ARN is
     *        used in trust validation for <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operations. Included for trust anchors of type <code>AWS_ACM_PCA</code>.
     */

    public void setAcmPcaArn(String acmPcaArn) {
        this.acmPcaArn = acmPcaArn;
    }

    /**
     * <p>
     * The root certificate of the Certificate Manager Private Certificate Authority specified by this ARN is used in
     * trust validation for <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operations. Included for trust anchors of type <code>AWS_ACM_PCA</code>.
     * </p>
     * 
     * @return The root certificate of the Certificate Manager Private Certificate Authority specified by this ARN is
     *         used in trust validation for <a
     *         href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *         >CreateSession</a> operations. Included for trust anchors of type <code>AWS_ACM_PCA</code>.
     */

    public String getAcmPcaArn() {
        return this.acmPcaArn;
    }

    /**
     * <p>
     * The root certificate of the Certificate Manager Private Certificate Authority specified by this ARN is used in
     * trust validation for <a
     * href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html">CreateSession</a>
     * operations. Included for trust anchors of type <code>AWS_ACM_PCA</code>.
     * </p>
     * 
     * @param acmPcaArn
     *        The root certificate of the Certificate Manager Private Certificate Authority specified by this ARN is
     *        used in trust validation for <a
     *        href="https://docs.aws.amazon.com/rolesanywhere/latest/APIReference/API_CreateSession.html"
     *        >CreateSession</a> operations. Included for trust anchors of type <code>AWS_ACM_PCA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceData withAcmPcaArn(String acmPcaArn) {
        setAcmPcaArn(acmPcaArn);
        return this;
    }

    /**
     * <p>
     * The PEM-encoded data for the certificate anchor. Included for trust anchors of type
     * <code>CERTIFICATE_BUNDLE</code>.
     * </p>
     * 
     * @param x509CertificateData
     *        The PEM-encoded data for the certificate anchor. Included for trust anchors of type
     *        <code>CERTIFICATE_BUNDLE</code>.
     */

    public void setX509CertificateData(String x509CertificateData) {
        this.x509CertificateData = x509CertificateData;
    }

    /**
     * <p>
     * The PEM-encoded data for the certificate anchor. Included for trust anchors of type
     * <code>CERTIFICATE_BUNDLE</code>.
     * </p>
     * 
     * @return The PEM-encoded data for the certificate anchor. Included for trust anchors of type
     *         <code>CERTIFICATE_BUNDLE</code>.
     */

    public String getX509CertificateData() {
        return this.x509CertificateData;
    }

    /**
     * <p>
     * The PEM-encoded data for the certificate anchor. Included for trust anchors of type
     * <code>CERTIFICATE_BUNDLE</code>.
     * </p>
     * 
     * @param x509CertificateData
     *        The PEM-encoded data for the certificate anchor. Included for trust anchors of type
     *        <code>CERTIFICATE_BUNDLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceData withX509CertificateData(String x509CertificateData) {
        setX509CertificateData(x509CertificateData);
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
        if (getAcmPcaArn() != null)
            sb.append("AcmPcaArn: ").append(getAcmPcaArn()).append(",");
        if (getX509CertificateData() != null)
            sb.append("X509CertificateData: ").append(getX509CertificateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceData == false)
            return false;
        SourceData other = (SourceData) obj;
        if (other.getAcmPcaArn() == null ^ this.getAcmPcaArn() == null)
            return false;
        if (other.getAcmPcaArn() != null && other.getAcmPcaArn().equals(this.getAcmPcaArn()) == false)
            return false;
        if (other.getX509CertificateData() == null ^ this.getX509CertificateData() == null)
            return false;
        if (other.getX509CertificateData() != null && other.getX509CertificateData().equals(this.getX509CertificateData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcmPcaArn() == null) ? 0 : getAcmPcaArn().hashCode());
        hashCode = prime * hashCode + ((getX509CertificateData() == null) ? 0 : getX509CertificateData().hashCode());
        return hashCode;
    }

    @Override
    public SourceData clone() {
        try {
            return (SourceData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iamrolesanywhere.model.transform.SourceDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
