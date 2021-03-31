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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List of sidewalk certificates.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CertificateList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateList implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The certificate chain algorithm provided by sidewalk.
     * </p>
     */
    private String signingAlg;
    /**
     * <p>
     * The value of the chosen sidewalk certificate.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The certificate chain algorithm provided by sidewalk.
     * </p>
     * 
     * @param signingAlg
     *        The certificate chain algorithm provided by sidewalk.
     * @see SigningAlg
     */

    public void setSigningAlg(String signingAlg) {
        this.signingAlg = signingAlg;
    }

    /**
     * <p>
     * The certificate chain algorithm provided by sidewalk.
     * </p>
     * 
     * @return The certificate chain algorithm provided by sidewalk.
     * @see SigningAlg
     */

    public String getSigningAlg() {
        return this.signingAlg;
    }

    /**
     * <p>
     * The certificate chain algorithm provided by sidewalk.
     * </p>
     * 
     * @param signingAlg
     *        The certificate chain algorithm provided by sidewalk.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlg
     */

    public CertificateList withSigningAlg(String signingAlg) {
        setSigningAlg(signingAlg);
        return this;
    }

    /**
     * <p>
     * The certificate chain algorithm provided by sidewalk.
     * </p>
     * 
     * @param signingAlg
     *        The certificate chain algorithm provided by sidewalk.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlg
     */

    public CertificateList withSigningAlg(SigningAlg signingAlg) {
        this.signingAlg = signingAlg.toString();
        return this;
    }

    /**
     * <p>
     * The value of the chosen sidewalk certificate.
     * </p>
     * 
     * @param value
     *        The value of the chosen sidewalk certificate.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the chosen sidewalk certificate.
     * </p>
     * 
     * @return The value of the chosen sidewalk certificate.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the chosen sidewalk certificate.
     * </p>
     * 
     * @param value
     *        The value of the chosen sidewalk certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateList withValue(String value) {
        setValue(value);
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
        if (getSigningAlg() != null)
            sb.append("SigningAlg: ").append(getSigningAlg()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateList == false)
            return false;
        CertificateList other = (CertificateList) obj;
        if (other.getSigningAlg() == null ^ this.getSigningAlg() == null)
            return false;
        if (other.getSigningAlg() != null && other.getSigningAlg().equals(this.getSigningAlg()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSigningAlg() == null) ? 0 : getSigningAlg().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public CertificateList clone() {
        try {
            return (CertificateList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.CertificateListMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
