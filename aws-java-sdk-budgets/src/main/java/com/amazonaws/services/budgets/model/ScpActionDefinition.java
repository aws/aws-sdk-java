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
package com.amazonaws.services.budgets.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The service control policies (SCP) action definition details.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScpActionDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The policy ID attached.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * A list of target IDs.
     * </p>
     */
    private java.util.List<String> targetIds;

    /**
     * <p>
     * The policy ID attached.
     * </p>
     * 
     * @param policyId
     *        The policy ID attached.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The policy ID attached.
     * </p>
     * 
     * @return The policy ID attached.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The policy ID attached.
     * </p>
     * 
     * @param policyId
     *        The policy ID attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScpActionDefinition withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * A list of target IDs.
     * </p>
     * 
     * @return A list of target IDs.
     */

    public java.util.List<String> getTargetIds() {
        return targetIds;
    }

    /**
     * <p>
     * A list of target IDs.
     * </p>
     * 
     * @param targetIds
     *        A list of target IDs.
     */

    public void setTargetIds(java.util.Collection<String> targetIds) {
        if (targetIds == null) {
            this.targetIds = null;
            return;
        }

        this.targetIds = new java.util.ArrayList<String>(targetIds);
    }

    /**
     * <p>
     * A list of target IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetIds(java.util.Collection)} or {@link #withTargetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetIds
     *        A list of target IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScpActionDefinition withTargetIds(String... targetIds) {
        if (this.targetIds == null) {
            setTargetIds(new java.util.ArrayList<String>(targetIds.length));
        }
        for (String ele : targetIds) {
            this.targetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of target IDs.
     * </p>
     * 
     * @param targetIds
     *        A list of target IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScpActionDefinition withTargetIds(java.util.Collection<String> targetIds) {
        setTargetIds(targetIds);
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getTargetIds() != null)
            sb.append("TargetIds: ").append(getTargetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScpActionDefinition == false)
            return false;
        ScpActionDefinition other = (ScpActionDefinition) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getTargetIds() == null ^ this.getTargetIds() == null)
            return false;
        if (other.getTargetIds() != null && other.getTargetIds().equals(this.getTargetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getTargetIds() == null) ? 0 : getTargetIds().hashCode());
        return hashCode;
    }

    @Override
    public ScpActionDefinition clone() {
        try {
            return (ScpActionDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.budgets.model.transform.ScpActionDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
