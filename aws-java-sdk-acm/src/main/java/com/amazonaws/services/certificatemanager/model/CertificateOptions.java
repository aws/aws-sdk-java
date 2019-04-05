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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure that contains options for your certificate. Currently, you can use this only to specify whether to opt in
 * to or out of certificate transparency logging. Some browsers require that public certificates issued for your domain
 * be recorded in a log. Certificates that are not logged typically generate a browser error. Transparency makes it
 * possible for you to detect SSL/TLS certificates that have been mistakenly or maliciously issued for your domain. For
 * general information, see <a
 * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-concepts.html#concept-transparency">Certificate
 * Transparency Logging</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/CertificateOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * You can opt out of certificate transparency logging by specifying the <code>DISABLED</code> option. Opt in by
     * specifying <code>ENABLED</code>.
     * </p>
     */
    private String certificateTransparencyLoggingPreference;

    /**
     * <p>
     * You can opt out of certificate transparency logging by specifying the <code>DISABLED</code> option. Opt in by
     * specifying <code>ENABLED</code>.
     * </p>
     * 
     * @param certificateTransparencyLoggingPreference
     *        You can opt out of certificate transparency logging by specifying the <code>DISABLED</code> option. Opt in
     *        by specifying <code>ENABLED</code>.
     * @see CertificateTransparencyLoggingPreference
     */

    public void setCertificateTransparencyLoggingPreference(String certificateTransparencyLoggingPreference) {
        this.certificateTransparencyLoggingPreference = certificateTransparencyLoggingPreference;
    }

    /**
     * <p>
     * You can opt out of certificate transparency logging by specifying the <code>DISABLED</code> option. Opt in by
     * specifying <code>ENABLED</code>.
     * </p>
     * 
     * @return You can opt out of certificate transparency logging by specifying the <code>DISABLED</code> option. Opt
     *         in by specifying <code>ENABLED</code>.
     * @see CertificateTransparencyLoggingPreference
     */

    public String getCertificateTransparencyLoggingPreference() {
        return this.certificateTransparencyLoggingPreference;
    }

    /**
     * <p>
     * You can opt out of certificate transparency logging by specifying the <code>DISABLED</code> option. Opt in by
     * specifying <code>ENABLED</code>.
     * </p>
     * 
     * @param certificateTransparencyLoggingPreference
     *        You can opt out of certificate transparency logging by specifying the <code>DISABLED</code> option. Opt in
     *        by specifying <code>ENABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateTransparencyLoggingPreference
     */

    public CertificateOptions withCertificateTransparencyLoggingPreference(String certificateTransparencyLoggingPreference) {
        setCertificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference);
        return this;
    }

    /**
     * <p>
     * You can opt out of certificate transparency logging by specifying the <code>DISABLED</code> option. Opt in by
     * specifying <code>ENABLED</code>.
     * </p>
     * 
     * @param certificateTransparencyLoggingPreference
     *        You can opt out of certificate transparency logging by specifying the <code>DISABLED</code> option. Opt in
     *        by specifying <code>ENABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateTransparencyLoggingPreference
     */

    public CertificateOptions withCertificateTransparencyLoggingPreference(CertificateTransparencyLoggingPreference certificateTransparencyLoggingPreference) {
        this.certificateTransparencyLoggingPreference = certificateTransparencyLoggingPreference.toString();
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

        if (obj instanceof CertificateOptions == false)
            return false;
        CertificateOptions other = (CertificateOptions) obj;
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
    public CertificateOptions clone() {
        try {
            return (CertificateOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.certificatemanager.model.transform.CertificateOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
