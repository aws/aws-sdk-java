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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ImportCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportCertificateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     */
    private String certificateId;

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     * 
     * @param certificateId
     *        An array of identifiers for the imported certificates. You use this identifier for working with profiles
     *        and partner profiles.
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     * 
     * @return An array of identifiers for the imported certificates. You use this identifier for working with profiles
     *         and partner profiles.
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * An array of identifiers for the imported certificates. You use this identifier for working with profiles and
     * partner profiles.
     * </p>
     * 
     * @param certificateId
     *        An array of identifiers for the imported certificates. You use this identifier for working with profiles
     *        and partner profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateResult withCertificateId(String certificateId) {
        setCertificateId(certificateId);
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
            sb.append("CertificateId: ").append(getCertificateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportCertificateResult == false)
            return false;
        ImportCertificateResult other = (ImportCertificateResult) obj;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        return hashCode;
    }

    @Override
    public ImportCertificateResult clone() {
        try {
            return (ImportCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
