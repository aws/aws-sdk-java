/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListCertificates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCertificatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether another page of certificates is available when the number of available certificates exceeds the
     * page limit.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of certificates with basic details including certificate ID, certificate common name, certificate state.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CertificateInfo> certificatesInfo;

    /**
     * <p>
     * Indicates whether another page of certificates is available when the number of available certificates exceeds the
     * page limit.
     * </p>
     * 
     * @param nextToken
     *        Indicates whether another page of certificates is available when the number of available certificates
     *        exceeds the page limit.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Indicates whether another page of certificates is available when the number of available certificates exceeds the
     * page limit.
     * </p>
     * 
     * @return Indicates whether another page of certificates is available when the number of available certificates
     *         exceeds the page limit.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Indicates whether another page of certificates is available when the number of available certificates exceeds the
     * page limit.
     * </p>
     * 
     * @param nextToken
     *        Indicates whether another page of certificates is available when the number of available certificates
     *        exceeds the page limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of certificates with basic details including certificate ID, certificate common name, certificate state.
     * </p>
     * 
     * @return A list of certificates with basic details including certificate ID, certificate common name, certificate
     *         state.
     */

    public java.util.List<CertificateInfo> getCertificatesInfo() {
        if (certificatesInfo == null) {
            certificatesInfo = new com.amazonaws.internal.SdkInternalList<CertificateInfo>();
        }
        return certificatesInfo;
    }

    /**
     * <p>
     * A list of certificates with basic details including certificate ID, certificate common name, certificate state.
     * </p>
     * 
     * @param certificatesInfo
     *        A list of certificates with basic details including certificate ID, certificate common name, certificate
     *        state.
     */

    public void setCertificatesInfo(java.util.Collection<CertificateInfo> certificatesInfo) {
        if (certificatesInfo == null) {
            this.certificatesInfo = null;
            return;
        }

        this.certificatesInfo = new com.amazonaws.internal.SdkInternalList<CertificateInfo>(certificatesInfo);
    }

    /**
     * <p>
     * A list of certificates with basic details including certificate ID, certificate common name, certificate state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificatesInfo(java.util.Collection)} or {@link #withCertificatesInfo(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param certificatesInfo
     *        A list of certificates with basic details including certificate ID, certificate common name, certificate
     *        state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesResult withCertificatesInfo(CertificateInfo... certificatesInfo) {
        if (this.certificatesInfo == null) {
            setCertificatesInfo(new com.amazonaws.internal.SdkInternalList<CertificateInfo>(certificatesInfo.length));
        }
        for (CertificateInfo ele : certificatesInfo) {
            this.certificatesInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of certificates with basic details including certificate ID, certificate common name, certificate state.
     * </p>
     * 
     * @param certificatesInfo
     *        A list of certificates with basic details including certificate ID, certificate common name, certificate
     *        state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificatesResult withCertificatesInfo(java.util.Collection<CertificateInfo> certificatesInfo) {
        setCertificatesInfo(certificatesInfo);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getCertificatesInfo() != null)
            sb.append("CertificatesInfo: ").append(getCertificatesInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCertificatesResult == false)
            return false;
        ListCertificatesResult other = (ListCertificatesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCertificatesInfo() == null ^ this.getCertificatesInfo() == null)
            return false;
        if (other.getCertificatesInfo() != null && other.getCertificatesInfo().equals(this.getCertificatesInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCertificatesInfo() == null) ? 0 : getCertificatesInfo().hashCode());
        return hashCode;
    }

    @Override
    public ListCertificatesResult clone() {
        try {
            return (ListCertificatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
