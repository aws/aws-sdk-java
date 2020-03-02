/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a listener's Transport Layer Security (TLS) certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListenerTlsCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListenerTlsCertificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A reference to an object that represents an AWS Certicate Manager (ACM) certificate.
     * </p>
     */
    private ListenerTlsAcmCertificate acm;
    /**
     * <p>
     * A reference to an object that represents a local file certificate.
     * </p>
     */
    private ListenerTlsFileCertificate file;

    /**
     * <p>
     * A reference to an object that represents an AWS Certicate Manager (ACM) certificate.
     * </p>
     * 
     * @param acm
     *        A reference to an object that represents an AWS Certicate Manager (ACM) certificate.
     */

    public void setAcm(ListenerTlsAcmCertificate acm) {
        this.acm = acm;
    }

    /**
     * <p>
     * A reference to an object that represents an AWS Certicate Manager (ACM) certificate.
     * </p>
     * 
     * @return A reference to an object that represents an AWS Certicate Manager (ACM) certificate.
     */

    public ListenerTlsAcmCertificate getAcm() {
        return this.acm;
    }

    /**
     * <p>
     * A reference to an object that represents an AWS Certicate Manager (ACM) certificate.
     * </p>
     * 
     * @param acm
     *        A reference to an object that represents an AWS Certicate Manager (ACM) certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerTlsCertificate withAcm(ListenerTlsAcmCertificate acm) {
        setAcm(acm);
        return this;
    }

    /**
     * <p>
     * A reference to an object that represents a local file certificate.
     * </p>
     * 
     * @param file
     *        A reference to an object that represents a local file certificate.
     */

    public void setFile(ListenerTlsFileCertificate file) {
        this.file = file;
    }

    /**
     * <p>
     * A reference to an object that represents a local file certificate.
     * </p>
     * 
     * @return A reference to an object that represents a local file certificate.
     */

    public ListenerTlsFileCertificate getFile() {
        return this.file;
    }

    /**
     * <p>
     * A reference to an object that represents a local file certificate.
     * </p>
     * 
     * @param file
     *        A reference to an object that represents a local file certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerTlsCertificate withFile(ListenerTlsFileCertificate file) {
        setFile(file);
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
        if (getAcm() != null)
            sb.append("Acm: ").append(getAcm()).append(",");
        if (getFile() != null)
            sb.append("File: ").append(getFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListenerTlsCertificate == false)
            return false;
        ListenerTlsCertificate other = (ListenerTlsCertificate) obj;
        if (other.getAcm() == null ^ this.getAcm() == null)
            return false;
        if (other.getAcm() != null && other.getAcm().equals(this.getAcm()) == false)
            return false;
        if (other.getFile() == null ^ this.getFile() == null)
            return false;
        if (other.getFile() != null && other.getFile().equals(this.getFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcm() == null) ? 0 : getAcm().hashCode());
        hashCode = prime * hashCode + ((getFile() == null) ? 0 : getFile().hashCode());
        return hashCode;
    }

    @Override
    public ListenerTlsCertificate clone() {
        try {
            return (ListenerTlsCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.ListenerTlsCertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
