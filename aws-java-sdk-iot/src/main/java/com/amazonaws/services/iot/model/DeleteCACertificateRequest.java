/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteCACertificateRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private String certificateId;

    /**
     * @param certificateId
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * @return
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @param certificateId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteCACertificateRequest withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("CertificateId: " + getCertificateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCACertificateRequest == false)
            return false;
        DeleteCACertificateRequest other = (DeleteCACertificateRequest) obj;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null
                && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateId() == null) ? 0 : getCertificateId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DeleteCACertificateRequest clone() {
        return (DeleteCACertificateRequest) super.clone();
    }
}