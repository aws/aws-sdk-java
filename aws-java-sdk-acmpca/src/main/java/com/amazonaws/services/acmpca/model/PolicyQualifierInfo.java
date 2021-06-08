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
 * Modifies the <code>CertPolicyId</code> of a <code>PolicyInformation</code> object with a qualifier. ACM Private CA
 * supports the certification practice statement (CPS) qualifier.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/PolicyQualifierInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyQualifierInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies the qualifier modifying a <code>CertPolicyId</code>.
     * </p>
     */
    private String policyQualifierId;
    /**
     * <p>
     * Defines the qualifier type. ACM Private CA supports the use of a URI for a CPS qualifier in this field.
     * </p>
     */
    private Qualifier qualifier;

    /**
     * <p>
     * Identifies the qualifier modifying a <code>CertPolicyId</code>.
     * </p>
     * 
     * @param policyQualifierId
     *        Identifies the qualifier modifying a <code>CertPolicyId</code>.
     * @see PolicyQualifierId
     */

    public void setPolicyQualifierId(String policyQualifierId) {
        this.policyQualifierId = policyQualifierId;
    }

    /**
     * <p>
     * Identifies the qualifier modifying a <code>CertPolicyId</code>.
     * </p>
     * 
     * @return Identifies the qualifier modifying a <code>CertPolicyId</code>.
     * @see PolicyQualifierId
     */

    public String getPolicyQualifierId() {
        return this.policyQualifierId;
    }

    /**
     * <p>
     * Identifies the qualifier modifying a <code>CertPolicyId</code>.
     * </p>
     * 
     * @param policyQualifierId
     *        Identifies the qualifier modifying a <code>CertPolicyId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyQualifierId
     */

    public PolicyQualifierInfo withPolicyQualifierId(String policyQualifierId) {
        setPolicyQualifierId(policyQualifierId);
        return this;
    }

    /**
     * <p>
     * Identifies the qualifier modifying a <code>CertPolicyId</code>.
     * </p>
     * 
     * @param policyQualifierId
     *        Identifies the qualifier modifying a <code>CertPolicyId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyQualifierId
     */

    public PolicyQualifierInfo withPolicyQualifierId(PolicyQualifierId policyQualifierId) {
        this.policyQualifierId = policyQualifierId.toString();
        return this;
    }

    /**
     * <p>
     * Defines the qualifier type. ACM Private CA supports the use of a URI for a CPS qualifier in this field.
     * </p>
     * 
     * @param qualifier
     *        Defines the qualifier type. ACM Private CA supports the use of a URI for a CPS qualifier in this field.
     */

    public void setQualifier(Qualifier qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * <p>
     * Defines the qualifier type. ACM Private CA supports the use of a URI for a CPS qualifier in this field.
     * </p>
     * 
     * @return Defines the qualifier type. ACM Private CA supports the use of a URI for a CPS qualifier in this field.
     */

    public Qualifier getQualifier() {
        return this.qualifier;
    }

    /**
     * <p>
     * Defines the qualifier type. ACM Private CA supports the use of a URI for a CPS qualifier in this field.
     * </p>
     * 
     * @param qualifier
     *        Defines the qualifier type. ACM Private CA supports the use of a URI for a CPS qualifier in this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyQualifierInfo withQualifier(Qualifier qualifier) {
        setQualifier(qualifier);
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
        if (getPolicyQualifierId() != null)
            sb.append("PolicyQualifierId: ").append(getPolicyQualifierId()).append(",");
        if (getQualifier() != null)
            sb.append("Qualifier: ").append(getQualifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyQualifierInfo == false)
            return false;
        PolicyQualifierInfo other = (PolicyQualifierInfo) obj;
        if (other.getPolicyQualifierId() == null ^ this.getPolicyQualifierId() == null)
            return false;
        if (other.getPolicyQualifierId() != null && other.getPolicyQualifierId().equals(this.getPolicyQualifierId()) == false)
            return false;
        if (other.getQualifier() == null ^ this.getQualifier() == null)
            return false;
        if (other.getQualifier() != null && other.getQualifier().equals(this.getQualifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyQualifierId() == null) ? 0 : getPolicyQualifierId().hashCode());
        hashCode = prime * hashCode + ((getQualifier() == null) ? 0 : getQualifier().hashCode());
        return hashCode;
    }

    @Override
    public PolicyQualifierInfo clone() {
        try {
            return (PolicyQualifierInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.PolicyQualifierInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
