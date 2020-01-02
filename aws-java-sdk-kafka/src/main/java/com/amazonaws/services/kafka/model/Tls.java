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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Details for client authentication using TLS.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/Tls" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Tls implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of ACM Certificate Authority ARNs.
     * </p>
     */
    private java.util.List<String> certificateAuthorityArnList;

    /**
     * <p>
     * List of ACM Certificate Authority ARNs.
     * </p>
     * 
     * @return <p>
     *         List of ACM Certificate Authority ARNs.
     *         </p>
     */

    public java.util.List<String> getCertificateAuthorityArnList() {
        return certificateAuthorityArnList;
    }

    /**
     * <p>
     * List of ACM Certificate Authority ARNs.
     * </p>
     * 
     * @param certificateAuthorityArnList
     *        <p>
     *        List of ACM Certificate Authority ARNs.
     *        </p>
     */

    public void setCertificateAuthorityArnList(java.util.Collection<String> certificateAuthorityArnList) {
        if (certificateAuthorityArnList == null) {
            this.certificateAuthorityArnList = null;
            return;
        }

        this.certificateAuthorityArnList = new java.util.ArrayList<String>(certificateAuthorityArnList);
    }

    /**
     * <p>
     * List of ACM Certificate Authority ARNs.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificateAuthorityArnList(java.util.Collection)} or
     * {@link #withCertificateAuthorityArnList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param certificateAuthorityArnList
     *        <p>
     *        List of ACM Certificate Authority ARNs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tls withCertificateAuthorityArnList(String... certificateAuthorityArnList) {
        if (this.certificateAuthorityArnList == null) {
            setCertificateAuthorityArnList(new java.util.ArrayList<String>(certificateAuthorityArnList.length));
        }
        for (String ele : certificateAuthorityArnList) {
            this.certificateAuthorityArnList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of ACM Certificate Authority ARNs.
     * </p>
     * 
     * @param certificateAuthorityArnList
     *        <p>
     *        List of ACM Certificate Authority ARNs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Tls withCertificateAuthorityArnList(java.util.Collection<String> certificateAuthorityArnList) {
        setCertificateAuthorityArnList(certificateAuthorityArnList);
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
        if (getCertificateAuthorityArnList() != null)
            sb.append("CertificateAuthorityArnList: ").append(getCertificateAuthorityArnList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tls == false)
            return false;
        Tls other = (Tls) obj;
        if (other.getCertificateAuthorityArnList() == null ^ this.getCertificateAuthorityArnList() == null)
            return false;
        if (other.getCertificateAuthorityArnList() != null && other.getCertificateAuthorityArnList().equals(this.getCertificateAuthorityArnList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityArnList() == null) ? 0 : getCertificateAuthorityArnList().hashCode());
        return hashCode;
    }

    @Override
    public Tls clone() {
        try {
            return (Tls) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.TlsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
