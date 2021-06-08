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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the certificate to delete.
     * </p>
     * <p>
     * Use the <code>GetCertificates</code> action to get a list of certificate names that you can specify.
     * </p>
     */
    private String certificateName;

    /**
     * <p>
     * The name of the certificate to delete.
     * </p>
     * <p>
     * Use the <code>GetCertificates</code> action to get a list of certificate names that you can specify.
     * </p>
     * 
     * @param certificateName
     *        The name of the certificate to delete.</p>
     *        <p>
     *        Use the <code>GetCertificates</code> action to get a list of certificate names that you can specify.
     */

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The name of the certificate to delete.
     * </p>
     * <p>
     * Use the <code>GetCertificates</code> action to get a list of certificate names that you can specify.
     * </p>
     * 
     * @return The name of the certificate to delete.</p>
     *         <p>
     *         Use the <code>GetCertificates</code> action to get a list of certificate names that you can specify.
     */

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * <p>
     * The name of the certificate to delete.
     * </p>
     * <p>
     * Use the <code>GetCertificates</code> action to get a list of certificate names that you can specify.
     * </p>
     * 
     * @param certificateName
     *        The name of the certificate to delete.</p>
     *        <p>
     *        Use the <code>GetCertificates</code> action to get a list of certificate names that you can specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCertificateRequest withCertificateName(String certificateName) {
        setCertificateName(certificateName);
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
            sb.append("CertificateName: ").append(getCertificateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCertificateRequest == false)
            return false;
        DeleteCertificateRequest other = (DeleteCertificateRequest) obj;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCertificateRequest clone() {
        return (DeleteCertificateRequest) super.clone();
    }

}
