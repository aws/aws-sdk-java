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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A mapping applied to the authenticating end-entity certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/AttributeMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * </p>
     */
    private String certificateField;
    /**
     * <p>
     * A list of mapping entries for every supported specifier or sub-field.
     * </p>
     */
    private java.util.List<MappingRule> mappingRules;

    /**
     * <p>
     * Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * </p>
     * 
     * @param certificateField
     *        Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * @see CertificateField
     */

    public void setCertificateField(String certificateField) {
        this.certificateField = certificateField;
    }

    /**
     * <p>
     * Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * </p>
     * 
     * @return Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * @see CertificateField
     */

    public String getCertificateField() {
        return this.certificateField;
    }

    /**
     * <p>
     * Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * </p>
     * 
     * @param certificateField
     *        Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateField
     */

    public AttributeMapping withCertificateField(String certificateField) {
        setCertificateField(certificateField);
        return this;
    }

    /**
     * <p>
     * Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * </p>
     * 
     * @param certificateField
     *        Fields (x509Subject, x509Issuer and x509SAN) within X.509 certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateField
     */

    public AttributeMapping withCertificateField(CertificateField certificateField) {
        this.certificateField = certificateField.toString();
        return this;
    }

    /**
     * <p>
     * A list of mapping entries for every supported specifier or sub-field.
     * </p>
     * 
     * @return A list of mapping entries for every supported specifier or sub-field.
     */

    public java.util.List<MappingRule> getMappingRules() {
        return mappingRules;
    }

    /**
     * <p>
     * A list of mapping entries for every supported specifier or sub-field.
     * </p>
     * 
     * @param mappingRules
     *        A list of mapping entries for every supported specifier or sub-field.
     */

    public void setMappingRules(java.util.Collection<MappingRule> mappingRules) {
        if (mappingRules == null) {
            this.mappingRules = null;
            return;
        }

        this.mappingRules = new java.util.ArrayList<MappingRule>(mappingRules);
    }

    /**
     * <p>
     * A list of mapping entries for every supported specifier or sub-field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMappingRules(java.util.Collection)} or {@link #withMappingRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mappingRules
     *        A list of mapping entries for every supported specifier or sub-field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeMapping withMappingRules(MappingRule... mappingRules) {
        if (this.mappingRules == null) {
            setMappingRules(new java.util.ArrayList<MappingRule>(mappingRules.length));
        }
        for (MappingRule ele : mappingRules) {
            this.mappingRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of mapping entries for every supported specifier or sub-field.
     * </p>
     * 
     * @param mappingRules
     *        A list of mapping entries for every supported specifier or sub-field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeMapping withMappingRules(java.util.Collection<MappingRule> mappingRules) {
        setMappingRules(mappingRules);
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
        if (getCertificateField() != null)
            sb.append("CertificateField: ").append(getCertificateField()).append(",");
        if (getMappingRules() != null)
            sb.append("MappingRules: ").append(getMappingRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeMapping == false)
            return false;
        AttributeMapping other = (AttributeMapping) obj;
        if (other.getCertificateField() == null ^ this.getCertificateField() == null)
            return false;
        if (other.getCertificateField() != null && other.getCertificateField().equals(this.getCertificateField()) == false)
            return false;
        if (other.getMappingRules() == null ^ this.getMappingRules() == null)
            return false;
        if (other.getMappingRules() != null && other.getMappingRules().equals(this.getMappingRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateField() == null) ? 0 : getCertificateField().hashCode());
        hashCode = prime * hashCode + ((getMappingRules() == null) ? 0 : getMappingRules().hashCode());
        return hashCode;
    }

    @Override
    public AttributeMapping clone() {
        try {
            return (AttributeMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iamrolesanywhere.model.transform.AttributeMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
