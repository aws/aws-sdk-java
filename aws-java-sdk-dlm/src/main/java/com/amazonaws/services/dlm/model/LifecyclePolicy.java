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
 * Detailed information about a lifecycle policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/LifecyclePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicy implements Serializable, Cloneable, StructuredPojo {

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
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The local date and time when the lifecycle policy was created.
     * </p>
     */
    private java.util.Date dateCreated;
    /**
     * <p>
     * The local date and time when the lifecycle policy was last modified.
     * </p>
     */
    private java.util.Date dateModified;
    /**
     * <p>
     * The configuration of the lifecycle policy
     * </p>
     */
    private PolicyDetails policyDetails;

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

    public LifecyclePolicy withPolicyId(String policyId) {
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

    public LifecyclePolicy withDescription(String description) {
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

    public LifecyclePolicy withState(String state) {
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

    public LifecyclePolicy withState(GettablePolicyStateValues state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle
     *        policy.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle
     *         policy.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
     * </p>
     * 
     * @param executionRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle
     *        policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicy withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The local date and time when the lifecycle policy was created.
     * </p>
     * 
     * @param dateCreated
     *        The local date and time when the lifecycle policy was created.
     */

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The local date and time when the lifecycle policy was created.
     * </p>
     * 
     * @return The local date and time when the lifecycle policy was created.
     */

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The local date and time when the lifecycle policy was created.
     * </p>
     * 
     * @param dateCreated
     *        The local date and time when the lifecycle policy was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicy withDateCreated(java.util.Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The local date and time when the lifecycle policy was last modified.
     * </p>
     * 
     * @param dateModified
     *        The local date and time when the lifecycle policy was last modified.
     */

    public void setDateModified(java.util.Date dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * <p>
     * The local date and time when the lifecycle policy was last modified.
     * </p>
     * 
     * @return The local date and time when the lifecycle policy was last modified.
     */

    public java.util.Date getDateModified() {
        return this.dateModified;
    }

    /**
     * <p>
     * The local date and time when the lifecycle policy was last modified.
     * </p>
     * 
     * @param dateModified
     *        The local date and time when the lifecycle policy was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicy withDateModified(java.util.Date dateModified) {
        setDateModified(dateModified);
        return this;
    }

    /**
     * <p>
     * The configuration of the lifecycle policy
     * </p>
     * 
     * @param policyDetails
     *        The configuration of the lifecycle policy
     */

    public void setPolicyDetails(PolicyDetails policyDetails) {
        this.policyDetails = policyDetails;
    }

    /**
     * <p>
     * The configuration of the lifecycle policy
     * </p>
     * 
     * @return The configuration of the lifecycle policy
     */

    public PolicyDetails getPolicyDetails() {
        return this.policyDetails;
    }

    /**
     * <p>
     * The configuration of the lifecycle policy
     * </p>
     * 
     * @param policyDetails
     *        The configuration of the lifecycle policy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicy withPolicyDetails(PolicyDetails policyDetails) {
        setPolicyDetails(policyDetails);
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
            sb.append("State: ").append(getState()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getDateModified() != null)
            sb.append("DateModified: ").append(getDateModified()).append(",");
        if (getPolicyDetails() != null)
            sb.append("PolicyDetails: ").append(getPolicyDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicy == false)
            return false;
        LifecyclePolicy other = (LifecyclePolicy) obj;
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
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateModified() == null ^ this.getDateModified() == null)
            return false;
        if (other.getDateModified() != null && other.getDateModified().equals(this.getDateModified()) == false)
            return false;
        if (other.getPolicyDetails() == null ^ this.getPolicyDetails() == null)
            return false;
        if (other.getPolicyDetails() != null && other.getPolicyDetails().equals(this.getPolicyDetails()) == false)
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
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateModified() == null) ? 0 : getDateModified().hashCode());
        hashCode = prime * hashCode + ((getPolicyDetails() == null) ? 0 : getPolicyDetails().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicy clone() {
        try {
            return (LifecyclePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.LifecyclePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
