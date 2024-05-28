/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCertificateProviderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the certificate provider.
     * </p>
     */
    private String certificateProviderName;

    /**
     * <p>
     * The name of the certificate provider.
     * </p>
     * 
     * @param certificateProviderName
     *        The name of the certificate provider.
     */

    public void setCertificateProviderName(String certificateProviderName) {
        this.certificateProviderName = certificateProviderName;
    }

    /**
     * <p>
     * The name of the certificate provider.
     * </p>
     * 
     * @return The name of the certificate provider.
     */

    public String getCertificateProviderName() {
        return this.certificateProviderName;
    }

    /**
     * <p>
     * The name of the certificate provider.
     * </p>
     * 
     * @param certificateProviderName
     *        The name of the certificate provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateProviderRequest withCertificateProviderName(String certificateProviderName) {
        setCertificateProviderName(certificateProviderName);
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
        if (getCertificateProviderName() != null)
            sb.append("CertificateProviderName: ").append(getCertificateProviderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCertificateProviderRequest == false)
            return false;
        DescribeCertificateProviderRequest other = (DescribeCertificateProviderRequest) obj;
        if (other.getCertificateProviderName() == null ^ this.getCertificateProviderName() == null)
            return false;
        if (other.getCertificateProviderName() != null && other.getCertificateProviderName().equals(this.getCertificateProviderName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateProviderName() == null) ? 0 : getCertificateProviderName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCertificateProviderRequest clone() {
        return (DescribeCertificateProviderRequest) super.clone();
    }

}
