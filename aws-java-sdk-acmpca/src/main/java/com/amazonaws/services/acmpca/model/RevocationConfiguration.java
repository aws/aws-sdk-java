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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Certificate revocation information used by the <a>CreateCertificateAuthority</a> and
 * <a>UpdateCertificateAuthority</a> operations. Your private certificate authority (CA) can create and maintain a
 * certificate revocation list (CRL). A CRL contains information about certificates revoked by your CA. For more
 * information, see <a>RevokeCertificate</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/RevocationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevocationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration of the certificate revocation list (CRL), if any, maintained by your private CA.
     * </p>
     */
    private CrlConfiguration crlConfiguration;

    /**
     * <p>
     * Configuration of the certificate revocation list (CRL), if any, maintained by your private CA.
     * </p>
     * 
     * @param crlConfiguration
     *        Configuration of the certificate revocation list (CRL), if any, maintained by your private CA.
     */

    public void setCrlConfiguration(CrlConfiguration crlConfiguration) {
        this.crlConfiguration = crlConfiguration;
    }

    /**
     * <p>
     * Configuration of the certificate revocation list (CRL), if any, maintained by your private CA.
     * </p>
     * 
     * @return Configuration of the certificate revocation list (CRL), if any, maintained by your private CA.
     */

    public CrlConfiguration getCrlConfiguration() {
        return this.crlConfiguration;
    }

    /**
     * <p>
     * Configuration of the certificate revocation list (CRL), if any, maintained by your private CA.
     * </p>
     * 
     * @param crlConfiguration
     *        Configuration of the certificate revocation list (CRL), if any, maintained by your private CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevocationConfiguration withCrlConfiguration(CrlConfiguration crlConfiguration) {
        setCrlConfiguration(crlConfiguration);
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
        if (getCrlConfiguration() != null)
            sb.append("CrlConfiguration: ").append(getCrlConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevocationConfiguration == false)
            return false;
        RevocationConfiguration other = (RevocationConfiguration) obj;
        if (other.getCrlConfiguration() == null ^ this.getCrlConfiguration() == null)
            return false;
        if (other.getCrlConfiguration() != null && other.getCrlConfiguration().equals(this.getCrlConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrlConfiguration() == null) ? 0 : getCrlConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public RevocationConfiguration clone() {
        try {
            return (RevocationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.RevocationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
