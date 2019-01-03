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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a lifecycle policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/LifecyclePolicySummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the lifecycle policy.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The description of the lifecycle policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The activation state of the lifecycle policy.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The identifier of the lifecycle policy.
     * </p>
     * 
     * @param policyId
     *        The identifier of the lifecycle policy.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The identifier of the lifecycle policy.
     * </p>
     * 
     * @return The identifier of the lifecycle policy.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The identifier of the lifecycle policy.
     * </p>
     * 
     * @param policyId
     *        The identifier of the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicySummary withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The description of the lifecycle policy.
     * </p>
     * 
     * @param description
     *        The description of the lifecycle policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the lifecycle policy.
     * </p>
     * 
     * @return The description of the lifecycle policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the lifecycle policy.
     * </p>
     * 
     * @param description
     *        The description of the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicySummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The activation state of the lifecycle policy.
     * </p>
     * 
     * @param state
     *        The activation state of the lifecycle policy.
     * @see GettablePolicyStateValues
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The activation state of the lifecycle policy.
     * </p>
     * 
     * @return The activation state of the lifecycle policy.
     * @see GettablePolicyStateValues
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The activation state of the lifecycle policy.
     * </p>
     * 
     * @param state
     *        The activation state of the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GettablePolicyStateValues
     */

    public LifecyclePolicySummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The activation state of the lifecycle policy.
     * </p>
     * 
     * @param state
     *        The activation state of the lifecycle policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GettablePolicyStateValues
     */

    public LifecyclePolicySummary withState(GettablePolicyStateValues state) {
        this.state = state.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicySummary == false)
            return false;
        LifecyclePolicySummary other = (LifecyclePolicySummary) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicySummary clone() {
        try {
            return (LifecyclePolicySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.LifecyclePolicySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
