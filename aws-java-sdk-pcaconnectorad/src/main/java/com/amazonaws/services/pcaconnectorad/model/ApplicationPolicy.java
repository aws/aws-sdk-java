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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Application policies describe what the certificate can be used for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/ApplicationPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The object identifier (OID) of an application policy.
     * </p>
     */
    private String policyObjectIdentifier;
    /**
     * <p>
     * The type of application policy
     * </p>
     */
    private String policyType;

    /**
     * <p>
     * The object identifier (OID) of an application policy.
     * </p>
     * 
     * @param policyObjectIdentifier
     *        The object identifier (OID) of an application policy.
     */

    public void setPolicyObjectIdentifier(String policyObjectIdentifier) {
        this.policyObjectIdentifier = policyObjectIdentifier;
    }

    /**
     * <p>
     * The object identifier (OID) of an application policy.
     * </p>
     * 
     * @return The object identifier (OID) of an application policy.
     */

    public String getPolicyObjectIdentifier() {
        return this.policyObjectIdentifier;
    }

    /**
     * <p>
     * The object identifier (OID) of an application policy.
     * </p>
     * 
     * @param policyObjectIdentifier
     *        The object identifier (OID) of an application policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationPolicy withPolicyObjectIdentifier(String policyObjectIdentifier) {
        setPolicyObjectIdentifier(policyObjectIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of application policy
     * </p>
     * 
     * @param policyType
     *        The type of application policy
     * @see ApplicationPolicyType
     */

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The type of application policy
     * </p>
     * 
     * @return The type of application policy
     * @see ApplicationPolicyType
     */

    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * <p>
     * The type of application policy
     * </p>
     * 
     * @param policyType
     *        The type of application policy
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationPolicyType
     */

    public ApplicationPolicy withPolicyType(String policyType) {
        setPolicyType(policyType);
        return this;
    }

    /**
     * <p>
     * The type of application policy
     * </p>
     * 
     * @param policyType
     *        The type of application policy
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationPolicyType
     */

    public ApplicationPolicy withPolicyType(ApplicationPolicyType policyType) {
        this.policyType = policyType.toString();
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
        if (getPolicyObjectIdentifier() != null)
            sb.append("PolicyObjectIdentifier: ").append(getPolicyObjectIdentifier()).append(",");
        if (getPolicyType() != null)
            sb.append("PolicyType: ").append(getPolicyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationPolicy == false)
            return false;
        ApplicationPolicy other = (ApplicationPolicy) obj;
        if (other.getPolicyObjectIdentifier() == null ^ this.getPolicyObjectIdentifier() == null)
            return false;
        if (other.getPolicyObjectIdentifier() != null && other.getPolicyObjectIdentifier().equals(this.getPolicyObjectIdentifier()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyObjectIdentifier() == null) ? 0 : getPolicyObjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationPolicy clone() {
        try {
            return (ApplicationPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.ApplicationPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
