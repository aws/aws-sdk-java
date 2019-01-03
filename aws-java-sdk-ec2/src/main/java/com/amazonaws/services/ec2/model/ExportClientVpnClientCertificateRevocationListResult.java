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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportClientVpnClientCertificateRevocationListResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Information about the client certificate revocation list.
     * </p>
     */
    private String certificateRevocationList;
    /**
     * <p>
     * The current state of the client certificate revocation list.
     * </p>
     */
    private ClientCertificateRevocationListStatus status;

    /**
     * <p>
     * Information about the client certificate revocation list.
     * </p>
     * 
     * @param certificateRevocationList
     *        Information about the client certificate revocation list.
     */

    public void setCertificateRevocationList(String certificateRevocationList) {
        this.certificateRevocationList = certificateRevocationList;
    }

    /**
     * <p>
     * Information about the client certificate revocation list.
     * </p>
     * 
     * @return Information about the client certificate revocation list.
     */

    public String getCertificateRevocationList() {
        return this.certificateRevocationList;
    }

    /**
     * <p>
     * Information about the client certificate revocation list.
     * </p>
     * 
     * @param certificateRevocationList
     *        Information about the client certificate revocation list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportClientVpnClientCertificateRevocationListResult withCertificateRevocationList(String certificateRevocationList) {
        setCertificateRevocationList(certificateRevocationList);
        return this;
    }

    /**
     * <p>
     * The current state of the client certificate revocation list.
     * </p>
     * 
     * @param status
     *        The current state of the client certificate revocation list.
     */

    public void setStatus(ClientCertificateRevocationListStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the client certificate revocation list.
     * </p>
     * 
     * @return The current state of the client certificate revocation list.
     */

    public ClientCertificateRevocationListStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the client certificate revocation list.
     * </p>
     * 
     * @param status
     *        The current state of the client certificate revocation list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportClientVpnClientCertificateRevocationListResult withStatus(ClientCertificateRevocationListStatus status) {
        setStatus(status);
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
        if (getCertificateRevocationList() != null)
            sb.append("CertificateRevocationList: ").append(getCertificateRevocationList()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportClientVpnClientCertificateRevocationListResult == false)
            return false;
        ExportClientVpnClientCertificateRevocationListResult other = (ExportClientVpnClientCertificateRevocationListResult) obj;
        if (other.getCertificateRevocationList() == null ^ this.getCertificateRevocationList() == null)
            return false;
        if (other.getCertificateRevocationList() != null && other.getCertificateRevocationList().equals(this.getCertificateRevocationList()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateRevocationList() == null) ? 0 : getCertificateRevocationList().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ExportClientVpnClientCertificateRevocationListResult clone() {
        try {
            return (ExportClientVpnClientCertificateRevocationListResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
