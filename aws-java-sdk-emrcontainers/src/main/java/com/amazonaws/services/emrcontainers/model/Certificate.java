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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The entity representing certificate data generated for managed endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/Certificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Certificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the certificate generated for managed endpoint.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The base64 encoded PEM certificate data generated for managed endpoint.
     * </p>
     */
    private String certificateData;

    /**
     * <p>
     * The ARN of the certificate generated for managed endpoint.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the certificate generated for managed endpoint.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The ARN of the certificate generated for managed endpoint.
     * </p>
     * 
     * @return The ARN of the certificate generated for managed endpoint.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The ARN of the certificate generated for managed endpoint.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the certificate generated for managed endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The base64 encoded PEM certificate data generated for managed endpoint.
     * </p>
     * 
     * @param certificateData
     *        The base64 encoded PEM certificate data generated for managed endpoint.
     */

    public void setCertificateData(String certificateData) {
        this.certificateData = certificateData;
    }

    /**
     * <p>
     * The base64 encoded PEM certificate data generated for managed endpoint.
     * </p>
     * 
     * @return The base64 encoded PEM certificate data generated for managed endpoint.
     */

    public String getCertificateData() {
        return this.certificateData;
    }

    /**
     * <p>
     * The base64 encoded PEM certificate data generated for managed endpoint.
     * </p>
     * 
     * @param certificateData
     *        The base64 encoded PEM certificate data generated for managed endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withCertificateData(String certificateData) {
        setCertificateData(certificateData);
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
        if (getCertificateData() != null)
            sb.append("CertificateData: ").append(getCertificateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Certificate == false)
            return false;
        Certificate other = (Certificate) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateData() == null ^ this.getCertificateData() == null)
            return false;
        if (other.getCertificateData() != null && other.getCertificateData().equals(this.getCertificateData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateData() == null) ? 0 : getCertificateData().hashCode());
        return hashCode;
    }

    @Override
    public Certificate clone() {
        try {
            return (Certificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.CertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
