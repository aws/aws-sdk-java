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
 * Contains X.509 extension information for a certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/Extensions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Extensions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains a sequence of one or more policy information terms, each of which consists of an object identifier (OID)
     * and optional qualifiers. For more information, see NIST's definition of <a
     * href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     * </p>
     * <p>
     * In an end-entity certificate, these terms indicate the policy under which the certificate was issued and the
     * purposes for which it may be used. In a CA certificate, these terms limit the set of policies for certification
     * paths that include this certificate.
     * </p>
     */
    private java.util.List<PolicyInformation> certificatePolicies;
    /**
     * <p>
     * Specifies additional purposes for which the certified public key may be used other than basic purposes indicated
     * in the <code>KeyUsage</code> extension.
     * </p>
     */
    private java.util.List<ExtendedKeyUsage> extendedKeyUsage;

    private KeyUsage keyUsage;
    /**
     * <p>
     * The subject alternative name extension allows identities to be bound to the subject of the certificate. These
     * identities may be included in addition to or in place of the identity in the subject field of the certificate.
     * </p>
     */
    private java.util.List<GeneralName> subjectAlternativeNames;

    /**
     * <p>
     * Contains a sequence of one or more policy information terms, each of which consists of an object identifier (OID)
     * and optional qualifiers. For more information, see NIST's definition of <a
     * href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     * </p>
     * <p>
     * In an end-entity certificate, these terms indicate the policy under which the certificate was issued and the
     * purposes for which it may be used. In a CA certificate, these terms limit the set of policies for certification
     * paths that include this certificate.
     * </p>
     * 
     * @return Contains a sequence of one or more policy information terms, each of which consists of an object
     *         identifier (OID) and optional qualifiers. For more information, see NIST's definition of <a
     *         href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.</p>
     *         <p>
     *         In an end-entity certificate, these terms indicate the policy under which the certificate was issued and
     *         the purposes for which it may be used. In a CA certificate, these terms limit the set of policies for
     *         certification paths that include this certificate.
     */

    public java.util.List<PolicyInformation> getCertificatePolicies() {
        return certificatePolicies;
    }

    /**
     * <p>
     * Contains a sequence of one or more policy information terms, each of which consists of an object identifier (OID)
     * and optional qualifiers. For more information, see NIST's definition of <a
     * href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     * </p>
     * <p>
     * In an end-entity certificate, these terms indicate the policy under which the certificate was issued and the
     * purposes for which it may be used. In a CA certificate, these terms limit the set of policies for certification
     * paths that include this certificate.
     * </p>
     * 
     * @param certificatePolicies
     *        Contains a sequence of one or more policy information terms, each of which consists of an object
     *        identifier (OID) and optional qualifiers. For more information, see NIST's definition of <a
     *        href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.</p>
     *        <p>
     *        In an end-entity certificate, these terms indicate the policy under which the certificate was issued and
     *        the purposes for which it may be used. In a CA certificate, these terms limit the set of policies for
     *        certification paths that include this certificate.
     */

    public void setCertificatePolicies(java.util.Collection<PolicyInformation> certificatePolicies) {
        if (certificatePolicies == null) {
            this.certificatePolicies = null;
            return;
        }

        this.certificatePolicies = new java.util.ArrayList<PolicyInformation>(certificatePolicies);
    }

    /**
     * <p>
     * Contains a sequence of one or more policy information terms, each of which consists of an object identifier (OID)
     * and optional qualifiers. For more information, see NIST's definition of <a
     * href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     * </p>
     * <p>
     * In an end-entity certificate, these terms indicate the policy under which the certificate was issued and the
     * purposes for which it may be used. In a CA certificate, these terms limit the set of policies for certification
     * paths that include this certificate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCertificatePolicies(java.util.Collection)} or {@link #withCertificatePolicies(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param certificatePolicies
     *        Contains a sequence of one or more policy information terms, each of which consists of an object
     *        identifier (OID) and optional qualifiers. For more information, see NIST's definition of <a
     *        href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.</p>
     *        <p>
     *        In an end-entity certificate, these terms indicate the policy under which the certificate was issued and
     *        the purposes for which it may be used. In a CA certificate, these terms limit the set of policies for
     *        certification paths that include this certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Extensions withCertificatePolicies(PolicyInformation... certificatePolicies) {
        if (this.certificatePolicies == null) {
            setCertificatePolicies(new java.util.ArrayList<PolicyInformation>(certificatePolicies.length));
        }
        for (PolicyInformation ele : certificatePolicies) {
            this.certificatePolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a sequence of one or more policy information terms, each of which consists of an object identifier (OID)
     * and optional qualifiers. For more information, see NIST's definition of <a
     * href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     * </p>
     * <p>
     * In an end-entity certificate, these terms indicate the policy under which the certificate was issued and the
     * purposes for which it may be used. In a CA certificate, these terms limit the set of policies for certification
     * paths that include this certificate.
     * </p>
     * 
     * @param certificatePolicies
     *        Contains a sequence of one or more policy information terms, each of which consists of an object
     *        identifier (OID) and optional qualifiers. For more information, see NIST's definition of <a
     *        href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.</p>
     *        <p>
     *        In an end-entity certificate, these terms indicate the policy under which the certificate was issued and
     *        the purposes for which it may be used. In a CA certificate, these terms limit the set of policies for
     *        certification paths that include this certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Extensions withCertificatePolicies(java.util.Collection<PolicyInformation> certificatePolicies) {
        setCertificatePolicies(certificatePolicies);
        return this;
    }

    /**
     * <p>
     * Specifies additional purposes for which the certified public key may be used other than basic purposes indicated
     * in the <code>KeyUsage</code> extension.
     * </p>
     * 
     * @return Specifies additional purposes for which the certified public key may be used other than basic purposes
     *         indicated in the <code>KeyUsage</code> extension.
     */

    public java.util.List<ExtendedKeyUsage> getExtendedKeyUsage() {
        return extendedKeyUsage;
    }

    /**
     * <p>
     * Specifies additional purposes for which the certified public key may be used other than basic purposes indicated
     * in the <code>KeyUsage</code> extension.
     * </p>
     * 
     * @param extendedKeyUsage
     *        Specifies additional purposes for which the certified public key may be used other than basic purposes
     *        indicated in the <code>KeyUsage</code> extension.
     */

    public void setExtendedKeyUsage(java.util.Collection<ExtendedKeyUsage> extendedKeyUsage) {
        if (extendedKeyUsage == null) {
            this.extendedKeyUsage = null;
            return;
        }

        this.extendedKeyUsage = new java.util.ArrayList<ExtendedKeyUsage>(extendedKeyUsage);
    }

    /**
     * <p>
     * Specifies additional purposes for which the certified public key may be used other than basic purposes indicated
     * in the <code>KeyUsage</code> extension.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExtendedKeyUsage(java.util.Collection)} or {@link #withExtendedKeyUsage(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param extendedKeyUsage
     *        Specifies additional purposes for which the certified public key may be used other than basic purposes
     *        indicated in the <code>KeyUsage</code> extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Extensions withExtendedKeyUsage(ExtendedKeyUsage... extendedKeyUsage) {
        if (this.extendedKeyUsage == null) {
            setExtendedKeyUsage(new java.util.ArrayList<ExtendedKeyUsage>(extendedKeyUsage.length));
        }
        for (ExtendedKeyUsage ele : extendedKeyUsage) {
            this.extendedKeyUsage.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies additional purposes for which the certified public key may be used other than basic purposes indicated
     * in the <code>KeyUsage</code> extension.
     * </p>
     * 
     * @param extendedKeyUsage
     *        Specifies additional purposes for which the certified public key may be used other than basic purposes
     *        indicated in the <code>KeyUsage</code> extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Extensions withExtendedKeyUsage(java.util.Collection<ExtendedKeyUsage> extendedKeyUsage) {
        setExtendedKeyUsage(extendedKeyUsage);
        return this;
    }

    /**
     * @param keyUsage
     */

    public void setKeyUsage(KeyUsage keyUsage) {
        this.keyUsage = keyUsage;
    }

    /**
     * @return
     */

    public KeyUsage getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * @param keyUsage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Extensions withKeyUsage(KeyUsage keyUsage) {
        setKeyUsage(keyUsage);
        return this;
    }

    /**
     * <p>
     * The subject alternative name extension allows identities to be bound to the subject of the certificate. These
     * identities may be included in addition to or in place of the identity in the subject field of the certificate.
     * </p>
     * 
     * @return The subject alternative name extension allows identities to be bound to the subject of the certificate.
     *         These identities may be included in addition to or in place of the identity in the subject field of the
     *         certificate.
     */

    public java.util.List<GeneralName> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /**
     * <p>
     * The subject alternative name extension allows identities to be bound to the subject of the certificate. These
     * identities may be included in addition to or in place of the identity in the subject field of the certificate.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        The subject alternative name extension allows identities to be bound to the subject of the certificate.
     *        These identities may be included in addition to or in place of the identity in the subject field of the
     *        certificate.
     */

    public void setSubjectAlternativeNames(java.util.Collection<GeneralName> subjectAlternativeNames) {
        if (subjectAlternativeNames == null) {
            this.subjectAlternativeNames = null;
            return;
        }

        this.subjectAlternativeNames = new java.util.ArrayList<GeneralName>(subjectAlternativeNames);
    }

    /**
     * <p>
     * The subject alternative name extension allows identities to be bound to the subject of the certificate. These
     * identities may be included in addition to or in place of the identity in the subject field of the certificate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubjectAlternativeNames(java.util.Collection)} or
     * {@link #withSubjectAlternativeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        The subject alternative name extension allows identities to be bound to the subject of the certificate.
     *        These identities may be included in addition to or in place of the identity in the subject field of the
     *        certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Extensions withSubjectAlternativeNames(GeneralName... subjectAlternativeNames) {
        if (this.subjectAlternativeNames == null) {
            setSubjectAlternativeNames(new java.util.ArrayList<GeneralName>(subjectAlternativeNames.length));
        }
        for (GeneralName ele : subjectAlternativeNames) {
            this.subjectAlternativeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subject alternative name extension allows identities to be bound to the subject of the certificate. These
     * identities may be included in addition to or in place of the identity in the subject field of the certificate.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        The subject alternative name extension allows identities to be bound to the subject of the certificate.
     *        These identities may be included in addition to or in place of the identity in the subject field of the
     *        certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Extensions withSubjectAlternativeNames(java.util.Collection<GeneralName> subjectAlternativeNames) {
        setSubjectAlternativeNames(subjectAlternativeNames);
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
        if (getCertificatePolicies() != null)
            sb.append("CertificatePolicies: ").append(getCertificatePolicies()).append(",");
        if (getExtendedKeyUsage() != null)
            sb.append("ExtendedKeyUsage: ").append(getExtendedKeyUsage()).append(",");
        if (getKeyUsage() != null)
            sb.append("KeyUsage: ").append(getKeyUsage()).append(",");
        if (getSubjectAlternativeNames() != null)
            sb.append("SubjectAlternativeNames: ").append(getSubjectAlternativeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Extensions == false)
            return false;
        Extensions other = (Extensions) obj;
        if (other.getCertificatePolicies() == null ^ this.getCertificatePolicies() == null)
            return false;
        if (other.getCertificatePolicies() != null && other.getCertificatePolicies().equals(this.getCertificatePolicies()) == false)
            return false;
        if (other.getExtendedKeyUsage() == null ^ this.getExtendedKeyUsage() == null)
            return false;
        if (other.getExtendedKeyUsage() != null && other.getExtendedKeyUsage().equals(this.getExtendedKeyUsage()) == false)
            return false;
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null)
            return false;
        if (other.getKeyUsage() != null && other.getKeyUsage().equals(this.getKeyUsage()) == false)
            return false;
        if (other.getSubjectAlternativeNames() == null ^ this.getSubjectAlternativeNames() == null)
            return false;
        if (other.getSubjectAlternativeNames() != null && other.getSubjectAlternativeNames().equals(this.getSubjectAlternativeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificatePolicies() == null) ? 0 : getCertificatePolicies().hashCode());
        hashCode = prime * hashCode + ((getExtendedKeyUsage() == null) ? 0 : getExtendedKeyUsage().hashCode());
        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        hashCode = prime * hashCode + ((getSubjectAlternativeNames() == null) ? 0 : getSubjectAlternativeNames().hashCode());
        return hashCode;
    }

    @Override
    public Extensions clone() {
        try {
            return (Extensions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.ExtensionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
