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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an extended key usage X.509 v3 extension object.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCertificateManagerCertificateExtendedKeyUsage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCertificateManagerCertificateExtendedKeyUsage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an extension value. Indicates the purpose for which the certificate public key can be used.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An object identifier (OID) for the extension value.
     * </p>
     * <p>
     * The format is numbers separated by periods.
     * </p>
     */
    private String oId;

    /**
     * <p>
     * The name of an extension value. Indicates the purpose for which the certificate public key can be used.
     * </p>
     * 
     * @param name
     *        The name of an extension value. Indicates the purpose for which the certificate public key can be used.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an extension value. Indicates the purpose for which the certificate public key can be used.
     * </p>
     * 
     * @return The name of an extension value. Indicates the purpose for which the certificate public key can be used.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an extension value. Indicates the purpose for which the certificate public key can be used.
     * </p>
     * 
     * @param name
     *        The name of an extension value. Indicates the purpose for which the certificate public key can be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateExtendedKeyUsage withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An object identifier (OID) for the extension value.
     * </p>
     * <p>
     * The format is numbers separated by periods.
     * </p>
     * 
     * @param oId
     *        An object identifier (OID) for the extension value.</p>
     *        <p>
     *        The format is numbers separated by periods.
     */

    public void setOId(String oId) {
        this.oId = oId;
    }

    /**
     * <p>
     * An object identifier (OID) for the extension value.
     * </p>
     * <p>
     * The format is numbers separated by periods.
     * </p>
     * 
     * @return An object identifier (OID) for the extension value.</p>
     *         <p>
     *         The format is numbers separated by periods.
     */

    public String getOId() {
        return this.oId;
    }

    /**
     * <p>
     * An object identifier (OID) for the extension value.
     * </p>
     * <p>
     * The format is numbers separated by periods.
     * </p>
     * 
     * @param oId
     *        An object identifier (OID) for the extension value.</p>
     *        <p>
     *        The format is numbers separated by periods.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateExtendedKeyUsage withOId(String oId) {
        setOId(oId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOId() != null)
            sb.append("OId: ").append(getOId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCertificateManagerCertificateExtendedKeyUsage == false)
            return false;
        AwsCertificateManagerCertificateExtendedKeyUsage other = (AwsCertificateManagerCertificateExtendedKeyUsage) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOId() == null ^ this.getOId() == null)
            return false;
        if (other.getOId() != null && other.getOId().equals(this.getOId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOId() == null) ? 0 : getOId().hashCode());
        return hashCode;
    }

    @Override
    public AwsCertificateManagerCertificateExtendedKeyUsage clone() {
        try {
            return (AwsCertificateManagerCertificateExtendedKeyUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCertificateManagerCertificateExtendedKeyUsageMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
