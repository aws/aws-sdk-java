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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the certificate chain being used when code signing a file.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeSigningCertificateChain implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the certificate.
     * </p>
     */
    private String certificateName;
    /**
     * <p>
     * A base64 encoded binary representation of the code signing certificate chain.
     * </p>
     */
    private String inlineDocument;

    /**
     * <p>
     * The name of the certificate.
     * </p>
     * 
     * @param certificateName
     *        The name of the certificate.
     */

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The name of the certificate.
     * </p>
     * 
     * @return The name of the certificate.
     */

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * <p>
     * The name of the certificate.
     * </p>
     * 
     * @param certificateName
     *        The name of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSigningCertificateChain withCertificateName(String certificateName) {
        setCertificateName(certificateName);
        return this;
    }

    /**
     * <p>
     * A base64 encoded binary representation of the code signing certificate chain.
     * </p>
     * 
     * @param inlineDocument
     *        A base64 encoded binary representation of the code signing certificate chain.
     */

    public void setInlineDocument(String inlineDocument) {
        this.inlineDocument = inlineDocument;
    }

    /**
     * <p>
     * A base64 encoded binary representation of the code signing certificate chain.
     * </p>
     * 
     * @return A base64 encoded binary representation of the code signing certificate chain.
     */

    public String getInlineDocument() {
        return this.inlineDocument;
    }

    /**
     * <p>
     * A base64 encoded binary representation of the code signing certificate chain.
     * </p>
     * 
     * @param inlineDocument
     *        A base64 encoded binary representation of the code signing certificate chain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSigningCertificateChain withInlineDocument(String inlineDocument) {
        setInlineDocument(inlineDocument);
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
        if (getCertificateName() != null)
            sb.append("CertificateName: ").append(getCertificateName()).append(",");
        if (getInlineDocument() != null)
            sb.append("InlineDocument: ").append(getInlineDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeSigningCertificateChain == false)
            return false;
        CodeSigningCertificateChain other = (CodeSigningCertificateChain) obj;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        if (other.getInlineDocument() == null ^ this.getInlineDocument() == null)
            return false;
        if (other.getInlineDocument() != null && other.getInlineDocument().equals(this.getInlineDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        hashCode = prime * hashCode + ((getInlineDocument() == null) ? 0 : getInlineDocument().hashCode());
        return hashCode;
    }

    @Override
    public CodeSigningCertificateChain clone() {
        try {
            return (CodeSigningCertificateChain) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.CodeSigningCertificateChainMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
