/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a policy type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/PolicyTypeDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyTypeDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the policy type.
     * </p>
     */
    private String policyTypeName;
    /**
     * <p>
     * A description of the policy type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PolicyAttributeTypeDescription> policyAttributeTypeDescriptions;

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * 
     * @param policyTypeName
     *        The name of the policy type.
     */

    public void setPolicyTypeName(String policyTypeName) {
        this.policyTypeName = policyTypeName;
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * 
     * @return The name of the policy type.
     */

    public String getPolicyTypeName() {
        return this.policyTypeName;
    }

    /**
     * <p>
     * The name of the policy type.
     * </p>
     * 
     * @param policyTypeName
     *        The name of the policy type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyTypeDescription withPolicyTypeName(String policyTypeName) {
        setPolicyTypeName(policyTypeName);
        return this;
    }

    /**
     * <p>
     * A description of the policy type.
     * </p>
     * 
     * @param description
     *        A description of the policy type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the policy type.
     * </p>
     * 
     * @return A description of the policy type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the policy type.
     * </p>
     * 
     * @param description
     *        A description of the policy type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyTypeDescription withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
     * </p>
     * 
     * @return The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
     */

    public java.util.List<PolicyAttributeTypeDescription> getPolicyAttributeTypeDescriptions() {
        if (policyAttributeTypeDescriptions == null) {
            policyAttributeTypeDescriptions = new com.amazonaws.internal.SdkInternalList<PolicyAttributeTypeDescription>();
        }
        return policyAttributeTypeDescriptions;
    }

    /**
     * <p>
     * The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
     * </p>
     * 
     * @param policyAttributeTypeDescriptions
     *        The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
     */

    public void setPolicyAttributeTypeDescriptions(java.util.Collection<PolicyAttributeTypeDescription> policyAttributeTypeDescriptions) {
        if (policyAttributeTypeDescriptions == null) {
            this.policyAttributeTypeDescriptions = null;
            return;
        }

        this.policyAttributeTypeDescriptions = new com.amazonaws.internal.SdkInternalList<PolicyAttributeTypeDescription>(policyAttributeTypeDescriptions);
    }

    /**
     * <p>
     * The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyAttributeTypeDescriptions(java.util.Collection)} or
     * {@link #withPolicyAttributeTypeDescriptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param policyAttributeTypeDescriptions
     *        The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyTypeDescription withPolicyAttributeTypeDescriptions(PolicyAttributeTypeDescription... policyAttributeTypeDescriptions) {
        if (this.policyAttributeTypeDescriptions == null) {
            setPolicyAttributeTypeDescriptions(new com.amazonaws.internal.SdkInternalList<PolicyAttributeTypeDescription>(
                    policyAttributeTypeDescriptions.length));
        }
        for (PolicyAttributeTypeDescription ele : policyAttributeTypeDescriptions) {
            this.policyAttributeTypeDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
     * </p>
     * 
     * @param policyAttributeTypeDescriptions
     *        The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyTypeDescription withPolicyAttributeTypeDescriptions(java.util.Collection<PolicyAttributeTypeDescription> policyAttributeTypeDescriptions) {
        setPolicyAttributeTypeDescriptions(policyAttributeTypeDescriptions);
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
        if (getPolicyTypeName() != null)
            sb.append("PolicyTypeName: ").append(getPolicyTypeName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPolicyAttributeTypeDescriptions() != null)
            sb.append("PolicyAttributeTypeDescriptions: ").append(getPolicyAttributeTypeDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyTypeDescription == false)
            return false;
        PolicyTypeDescription other = (PolicyTypeDescription) obj;
        if (other.getPolicyTypeName() == null ^ this.getPolicyTypeName() == null)
            return false;
        if (other.getPolicyTypeName() != null && other.getPolicyTypeName().equals(this.getPolicyTypeName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPolicyAttributeTypeDescriptions() == null ^ this.getPolicyAttributeTypeDescriptions() == null)
            return false;
        if (other.getPolicyAttributeTypeDescriptions() != null
                && other.getPolicyAttributeTypeDescriptions().equals(this.getPolicyAttributeTypeDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyTypeName() == null) ? 0 : getPolicyTypeName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPolicyAttributeTypeDescriptions() == null) ? 0 : getPolicyAttributeTypeDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public PolicyTypeDescription clone() {
        try {
            return (PolicyTypeDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
