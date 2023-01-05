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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/DeleteCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the certificate object that you are deleting.
     * </p>
     */
    private String certificateId;

    /**
     * <p>
     * The identifier of the certificate object that you are deleting.
     * </p>
     * 
     * @param certificateId
     *        The identifier of the certificate object that you are deleting.
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The identifier of the certificate object that you are deleting.
     * </p>
     * 
     * @return The identifier of the certificate object that you are deleting.
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The identifier of the certificate object that you are deleting.
     * </p>
     * 
     * @param certificateId
     *        The identifier of the certificate object that you are deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCertificateRequest withCertificateId(String certificateId) {
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

        if (obj instanceof DeleteCertificateRequest == false)
            return false;
        DeleteCertificateRequest other = (DeleteCertificateRequest) obj;
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
    public DeleteCertificateRequest clone() {
        return (DeleteCertificateRequest) super.clone();
    }

}
