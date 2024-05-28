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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the policy types that the specified Firewall Manager administrator can manage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PolicyTypeScope" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyTypeScope implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of policy types that the specified Firewall Manager administrator can manage.
     * </p>
     */
    private java.util.List<String> policyTypes;
    /**
     * <p>
     * Allows the specified Firewall Manager administrator to manage all Firewall Manager policy types, except for
     * third-party policy types. Third-party policy types can only be managed by the Firewall Manager default
     * administrator.
     * </p>
     */
    private Boolean allPolicyTypesEnabled;

    /**
     * <p>
     * The list of policy types that the specified Firewall Manager administrator can manage.
     * </p>
     * 
     * @return The list of policy types that the specified Firewall Manager administrator can manage.
     * @see SecurityServiceType
     */

    public java.util.List<String> getPolicyTypes() {
        return policyTypes;
    }

    /**
     * <p>
     * The list of policy types that the specified Firewall Manager administrator can manage.
     * </p>
     * 
     * @param policyTypes
     *        The list of policy types that the specified Firewall Manager administrator can manage.
     * @see SecurityServiceType
     */

    public void setPolicyTypes(java.util.Collection<String> policyTypes) {
        if (policyTypes == null) {
            this.policyTypes = null;
            return;
        }

        this.policyTypes = new java.util.ArrayList<String>(policyTypes);
    }

    /**
     * <p>
     * The list of policy types that the specified Firewall Manager administrator can manage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyTypes(java.util.Collection)} or {@link #withPolicyTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyTypes
     *        The list of policy types that the specified Firewall Manager administrator can manage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityServiceType
     */

    public PolicyTypeScope withPolicyTypes(String... policyTypes) {
        if (this.policyTypes == null) {
            setPolicyTypes(new java.util.ArrayList<String>(policyTypes.length));
        }
        for (String ele : policyTypes) {
            this.policyTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of policy types that the specified Firewall Manager administrator can manage.
     * </p>
     * 
     * @param policyTypes
     *        The list of policy types that the specified Firewall Manager administrator can manage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityServiceType
     */

    public PolicyTypeScope withPolicyTypes(java.util.Collection<String> policyTypes) {
        setPolicyTypes(policyTypes);
        return this;
    }

    /**
     * <p>
     * The list of policy types that the specified Firewall Manager administrator can manage.
     * </p>
     * 
     * @param policyTypes
     *        The list of policy types that the specified Firewall Manager administrator can manage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityServiceType
     */

    public PolicyTypeScope withPolicyTypes(SecurityServiceType... policyTypes) {
        java.util.ArrayList<String> policyTypesCopy = new java.util.ArrayList<String>(policyTypes.length);
        for (SecurityServiceType value : policyTypes) {
            policyTypesCopy.add(value.toString());
        }
        if (getPolicyTypes() == null) {
            setPolicyTypes(policyTypesCopy);
        } else {
            getPolicyTypes().addAll(policyTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Allows the specified Firewall Manager administrator to manage all Firewall Manager policy types, except for
     * third-party policy types. Third-party policy types can only be managed by the Firewall Manager default
     * administrator.
     * </p>
     * 
     * @param allPolicyTypesEnabled
     *        Allows the specified Firewall Manager administrator to manage all Firewall Manager policy types, except
     *        for third-party policy types. Third-party policy types can only be managed by the Firewall Manager default
     *        administrator.
     */

    public void setAllPolicyTypesEnabled(Boolean allPolicyTypesEnabled) {
        this.allPolicyTypesEnabled = allPolicyTypesEnabled;
    }

    /**
     * <p>
     * Allows the specified Firewall Manager administrator to manage all Firewall Manager policy types, except for
     * third-party policy types. Third-party policy types can only be managed by the Firewall Manager default
     * administrator.
     * </p>
     * 
     * @return Allows the specified Firewall Manager administrator to manage all Firewall Manager policy types, except
     *         for third-party policy types. Third-party policy types can only be managed by the Firewall Manager
     *         default administrator.
     */

    public Boolean getAllPolicyTypesEnabled() {
        return this.allPolicyTypesEnabled;
    }

    /**
     * <p>
     * Allows the specified Firewall Manager administrator to manage all Firewall Manager policy types, except for
     * third-party policy types. Third-party policy types can only be managed by the Firewall Manager default
     * administrator.
     * </p>
     * 
     * @param allPolicyTypesEnabled
     *        Allows the specified Firewall Manager administrator to manage all Firewall Manager policy types, except
     *        for third-party policy types. Third-party policy types can only be managed by the Firewall Manager default
     *        administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyTypeScope withAllPolicyTypesEnabled(Boolean allPolicyTypesEnabled) {
        setAllPolicyTypesEnabled(allPolicyTypesEnabled);
        return this;
    }

    /**
     * <p>
     * Allows the specified Firewall Manager administrator to manage all Firewall Manager policy types, except for
     * third-party policy types. Third-party policy types can only be managed by the Firewall Manager default
     * administrator.
     * </p>
     * 
     * @return Allows the specified Firewall Manager administrator to manage all Firewall Manager policy types, except
     *         for third-party policy types. Third-party policy types can only be managed by the Firewall Manager
     *         default administrator.
     */

    public Boolean isAllPolicyTypesEnabled() {
        return this.allPolicyTypesEnabled;
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
        if (getPolicyTypes() != null)
            sb.append("PolicyTypes: ").append(getPolicyTypes()).append(",");
        if (getAllPolicyTypesEnabled() != null)
            sb.append("AllPolicyTypesEnabled: ").append(getAllPolicyTypesEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyTypeScope == false)
            return false;
        PolicyTypeScope other = (PolicyTypeScope) obj;
        if (other.getPolicyTypes() == null ^ this.getPolicyTypes() == null)
            return false;
        if (other.getPolicyTypes() != null && other.getPolicyTypes().equals(this.getPolicyTypes()) == false)
            return false;
        if (other.getAllPolicyTypesEnabled() == null ^ this.getAllPolicyTypesEnabled() == null)
            return false;
        if (other.getAllPolicyTypesEnabled() != null && other.getAllPolicyTypesEnabled().equals(this.getAllPolicyTypesEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyTypes() == null) ? 0 : getPolicyTypes().hashCode());
        hashCode = prime * hashCode + ((getAllPolicyTypesEnabled() == null) ? 0 : getAllPolicyTypesEnabled().hashCode());
        return hashCode;
    }

    @Override
    public PolicyTypeScope clone() {
        try {
            return (PolicyTypeScope) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.PolicyTypeScopeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
