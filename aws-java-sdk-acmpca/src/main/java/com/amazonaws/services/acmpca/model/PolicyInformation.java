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
 * Defines the X.509 <code>CertificatePolicies</code> extension.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/PolicyInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the object identifier (OID) of the certificate policy under which the certificate was issued. For more
     * information, see NIST's definition of <a href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object
     * Identifier (OID)</a>.
     * </p>
     */
    private String certPolicyId;
    /**
     * <p>
     * Modifies the given <code>CertPolicyId</code> with a qualifier. ACM Private CA supports the certification practice
     * statement (CPS) qualifier.
     * </p>
     */
    private java.util.List<PolicyQualifierInfo> policyQualifiers;

    /**
     * <p>
     * Specifies the object identifier (OID) of the certificate policy under which the certificate was issued. For more
     * information, see NIST's definition of <a href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object
     * Identifier (OID)</a>.
     * </p>
     * 
     * @param certPolicyId
     *        Specifies the object identifier (OID) of the certificate policy under which the certificate was issued.
     *        For more information, see NIST's definition of <a
     *        href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     */

    public void setCertPolicyId(String certPolicyId) {
        this.certPolicyId = certPolicyId;
    }

    /**
     * <p>
     * Specifies the object identifier (OID) of the certificate policy under which the certificate was issued. For more
     * information, see NIST's definition of <a href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object
     * Identifier (OID)</a>.
     * </p>
     * 
     * @return Specifies the object identifier (OID) of the certificate policy under which the certificate was issued.
     *         For more information, see NIST's definition of <a
     *         href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     */

    public String getCertPolicyId() {
        return this.certPolicyId;
    }

    /**
     * <p>
     * Specifies the object identifier (OID) of the certificate policy under which the certificate was issued. For more
     * information, see NIST's definition of <a href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object
     * Identifier (OID)</a>.
     * </p>
     * 
     * @param certPolicyId
     *        Specifies the object identifier (OID) of the certificate policy under which the certificate was issued.
     *        For more information, see NIST's definition of <a
     *        href="https://csrc.nist.gov/glossary/term/Object_Identifier">Object Identifier (OID)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyInformation withCertPolicyId(String certPolicyId) {
        setCertPolicyId(certPolicyId);
        return this;
    }

    /**
     * <p>
     * Modifies the given <code>CertPolicyId</code> with a qualifier. ACM Private CA supports the certification practice
     * statement (CPS) qualifier.
     * </p>
     * 
     * @return Modifies the given <code>CertPolicyId</code> with a qualifier. ACM Private CA supports the certification
     *         practice statement (CPS) qualifier.
     */

    public java.util.List<PolicyQualifierInfo> getPolicyQualifiers() {
        return policyQualifiers;
    }

    /**
     * <p>
     * Modifies the given <code>CertPolicyId</code> with a qualifier. ACM Private CA supports the certification practice
     * statement (CPS) qualifier.
     * </p>
     * 
     * @param policyQualifiers
     *        Modifies the given <code>CertPolicyId</code> with a qualifier. ACM Private CA supports the certification
     *        practice statement (CPS) qualifier.
     */

    public void setPolicyQualifiers(java.util.Collection<PolicyQualifierInfo> policyQualifiers) {
        if (policyQualifiers == null) {
            this.policyQualifiers = null;
            return;
        }

        this.policyQualifiers = new java.util.ArrayList<PolicyQualifierInfo>(policyQualifiers);
    }

    /**
     * <p>
     * Modifies the given <code>CertPolicyId</code> with a qualifier. ACM Private CA supports the certification practice
     * statement (CPS) qualifier.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyQualifiers(java.util.Collection)} or {@link #withPolicyQualifiers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param policyQualifiers
     *        Modifies the given <code>CertPolicyId</code> with a qualifier. ACM Private CA supports the certification
     *        practice statement (CPS) qualifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyInformation withPolicyQualifiers(PolicyQualifierInfo... policyQualifiers) {
        if (this.policyQualifiers == null) {
            setPolicyQualifiers(new java.util.ArrayList<PolicyQualifierInfo>(policyQualifiers.length));
        }
        for (PolicyQualifierInfo ele : policyQualifiers) {
            this.policyQualifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Modifies the given <code>CertPolicyId</code> with a qualifier. ACM Private CA supports the certification practice
     * statement (CPS) qualifier.
     * </p>
     * 
     * @param policyQualifiers
     *        Modifies the given <code>CertPolicyId</code> with a qualifier. ACM Private CA supports the certification
     *        practice statement (CPS) qualifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyInformation withPolicyQualifiers(java.util.Collection<PolicyQualifierInfo> policyQualifiers) {
        setPolicyQualifiers(policyQualifiers);
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
        if (getCertPolicyId() != null)
            sb.append("CertPolicyId: ").append(getCertPolicyId()).append(",");
        if (getPolicyQualifiers() != null)
            sb.append("PolicyQualifiers: ").append(getPolicyQualifiers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyInformation == false)
            return false;
        PolicyInformation other = (PolicyInformation) obj;
        if (other.getCertPolicyId() == null ^ this.getCertPolicyId() == null)
            return false;
        if (other.getCertPolicyId() != null && other.getCertPolicyId().equals(this.getCertPolicyId()) == false)
            return false;
        if (other.getPolicyQualifiers() == null ^ this.getPolicyQualifiers() == null)
            return false;
        if (other.getPolicyQualifiers() != null && other.getPolicyQualifiers().equals(this.getPolicyQualifiers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertPolicyId() == null) ? 0 : getCertPolicyId().hashCode());
        hashCode = prime * hashCode + ((getPolicyQualifiers() == null) ? 0 : getPolicyQualifiers().hashCode());
        return hashCode;
    }

    @Override
    public PolicyInformation clone() {
        try {
            return (PolicyInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.PolicyInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
