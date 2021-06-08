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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains other options for the certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCertificateManagerCertificateOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCertificateManagerCertificateOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to add the certificate to a transparency log.
     * </p>
     * <p>
     * Valid values: <code>DISABLED</code> | <code>ENABLED</code>
     * </p>
     */
    private String certificateTransparencyLoggingPreference;

    /**
     * <p>
     * Whether to add the certificate to a transparency log.
     * </p>
     * <p>
     * Valid values: <code>DISABLED</code> | <code>ENABLED</code>
     * </p>
     * 
     * @param certificateTransparencyLoggingPreference
     *        Whether to add the certificate to a transparency log.</p>
     *        <p>
     *        Valid values: <code>DISABLED</code> | <code>ENABLED</code>
     */

    public void setCertificateTransparencyLoggingPreference(String certificateTransparencyLoggingPreference) {
        this.certificateTransparencyLoggingPreference = certificateTransparencyLoggingPreference;
    }

    /**
     * <p>
     * Whether to add the certificate to a transparency log.
     * </p>
     * <p>
     * Valid values: <code>DISABLED</code> | <code>ENABLED</code>
     * </p>
     * 
     * @return Whether to add the certificate to a transparency log.</p>
     *         <p>
     *         Valid values: <code>DISABLED</code> | <code>ENABLED</code>
     */

    public String getCertificateTransparencyLoggingPreference() {
        return this.certificateTransparencyLoggingPreference;
    }

    /**
     * <p>
     * Whether to add the certificate to a transparency log.
     * </p>
     * <p>
     * Valid values: <code>DISABLED</code> | <code>ENABLED</code>
     * </p>
     * 
     * @param certificateTransparencyLoggingPreference
     *        Whether to add the certificate to a transparency log.</p>
     *        <p>
     *        Valid values: <code>DISABLED</code> | <code>ENABLED</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateOptions withCertificateTransparencyLoggingPreference(String certificateTransparencyLoggingPreference) {
        setCertificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference);
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
        if (getCertificateTransparencyLoggingPreference() != null)
            sb.append("CertificateTransparencyLoggingPreference: ").append(getCertificateTransparencyLoggingPreference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCertificateManagerCertificateOptions == false)
            return false;
        AwsCertificateManagerCertificateOptions other = (AwsCertificateManagerCertificateOptions) obj;
        if (other.getCertificateTransparencyLoggingPreference() == null ^ this.getCertificateTransparencyLoggingPreference() == null)
            return false;
        if (other.getCertificateTransparencyLoggingPreference() != null
                && other.getCertificateTransparencyLoggingPreference().equals(this.getCertificateTransparencyLoggingPreference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateTransparencyLoggingPreference() == null) ? 0 : getCertificateTransparencyLoggingPreference().hashCode());
        return hashCode;
    }

    @Override
    public AwsCertificateManagerCertificateOptions clone() {
        try {
            return (AwsCertificateManagerCertificateOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCertificateManagerCertificateOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
