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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains X.509 certificate information to be placed in an issued certificate. An <code>APIPassthrough</code> or
 * <code>APICSRPassthrough</code> template variant must be selected, or else this parameter is ignored.
 * </p>
 * <p>
 * If conflicting or duplicate certificate information is supplied from other sources, ACM Private CA applies <a
 * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html#template-order-of-operations">order of
 * operation rules</a> to determine what information is used.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ApiPassthrough" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiPassthrough implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies X.509 extension information for a certificate.
     * </p>
     */
    private Extensions extensions;

    private ASN1Subject subject;

    /**
     * <p>
     * Specifies X.509 extension information for a certificate.
     * </p>
     * 
     * @param extensions
     *        Specifies X.509 extension information for a certificate.
     */

    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }

    /**
     * <p>
     * Specifies X.509 extension information for a certificate.
     * </p>
     * 
     * @return Specifies X.509 extension information for a certificate.
     */

    public Extensions getExtensions() {
        return this.extensions;
    }

    /**
     * <p>
     * Specifies X.509 extension information for a certificate.
     * </p>
     * 
     * @param extensions
     *        Specifies X.509 extension information for a certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiPassthrough withExtensions(Extensions extensions) {
        setExtensions(extensions);
        return this;
    }

    /**
     * @param subject
     */

    public void setSubject(ASN1Subject subject) {
        this.subject = subject;
    }

    /**
     * @return
     */

    public ASN1Subject getSubject() {
        return this.subject;
    }

    /**
     * @param subject
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiPassthrough withSubject(ASN1Subject subject) {
        setSubject(subject);
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
        if (getExtensions() != null)
            sb.append("Extensions: ").append(getExtensions()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiPassthrough == false)
            return false;
        ApiPassthrough other = (ApiPassthrough) obj;
        if (other.getExtensions() == null ^ this.getExtensions() == null)
            return false;
        if (other.getExtensions() != null && other.getExtensions().equals(this.getExtensions()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExtensions() == null) ? 0 : getExtensions().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        return hashCode;
    }

    @Override
    public ApiPassthrough clone() {
        try {
            return (ApiPassthrough) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.ApiPassthroughMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
