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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/DescribeLunaClient" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLunaClientRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the client.
     * </p>
     */
    private String clientArn;
    /**
     * <p>
     * The certificate fingerprint.
     * </p>
     */
    private String certificateFingerprint;

    /**
     * <p>
     * The ARN of the client.
     * </p>
     * 
     * @param clientArn
     *        The ARN of the client.
     */

    public void setClientArn(String clientArn) {
        this.clientArn = clientArn;
    }

    /**
     * <p>
     * The ARN of the client.
     * </p>
     * 
     * @return The ARN of the client.
     */

    public String getClientArn() {
        return this.clientArn;
    }

    /**
     * <p>
     * The ARN of the client.
     * </p>
     * 
     * @param clientArn
     *        The ARN of the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLunaClientRequest withClientArn(String clientArn) {
        setClientArn(clientArn);
        return this;
    }

    /**
     * <p>
     * The certificate fingerprint.
     * </p>
     * 
     * @param certificateFingerprint
     *        The certificate fingerprint.
     */

    public void setCertificateFingerprint(String certificateFingerprint) {
        this.certificateFingerprint = certificateFingerprint;
    }

    /**
     * <p>
     * The certificate fingerprint.
     * </p>
     * 
     * @return The certificate fingerprint.
     */

    public String getCertificateFingerprint() {
        return this.certificateFingerprint;
    }

    /**
     * <p>
     * The certificate fingerprint.
     * </p>
     * 
     * @param certificateFingerprint
     *        The certificate fingerprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLunaClientRequest withCertificateFingerprint(String certificateFingerprint) {
        setCertificateFingerprint(certificateFingerprint);
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
        if (getClientArn() != null)
            sb.append("ClientArn: ").append(getClientArn()).append(",");
        if (getCertificateFingerprint() != null)
            sb.append("CertificateFingerprint: ").append(getCertificateFingerprint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLunaClientRequest == false)
            return false;
        DescribeLunaClientRequest other = (DescribeLunaClientRequest) obj;
        if (other.getClientArn() == null ^ this.getClientArn() == null)
            return false;
        if (other.getClientArn() != null && other.getClientArn().equals(this.getClientArn()) == false)
            return false;
        if (other.getCertificateFingerprint() == null ^ this.getCertificateFingerprint() == null)
            return false;
        if (other.getCertificateFingerprint() != null && other.getCertificateFingerprint().equals(this.getCertificateFingerprint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientArn() == null) ? 0 : getClientArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateFingerprint() == null) ? 0 : getCertificateFingerprint().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLunaClientRequest clone() {
        return (DescribeLunaClientRequest) super.clone();
    }

}
