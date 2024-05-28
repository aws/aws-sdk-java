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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/UpdateTrafficPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrafficPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of (or not
     * addressed by) the conditions of your policy statements
     * </p>
     */
    private String defaultAction;
    /**
     * <p>
     * The maximum message size in bytes of email which is allowed in by this traffic policy—anything larger will be
     * blocked.
     * </p>
     */
    private Integer maxMessageSizeBytes;
    /**
     * <p>
     * The list of conditions to be updated for filtering email traffic.
     * </p>
     */
    private java.util.List<PolicyStatement> policyStatements;
    /**
     * <p>
     * The identifier of the traffic policy that you want to update.
     * </p>
     */
    private String trafficPolicyId;
    /**
     * <p>
     * A user-friendly name for the traffic policy resource.
     * </p>
     */
    private String trafficPolicyName;

    /**
     * <p>
     * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of (or not
     * addressed by) the conditions of your policy statements
     * </p>
     * 
     * @param defaultAction
     *        Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of
     *        (or not addressed by) the conditions of your policy statements
     * @see AcceptAction
     */

    public void setDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of (or not
     * addressed by) the conditions of your policy statements
     * </p>
     * 
     * @return Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of
     *         (or not addressed by) the conditions of your policy statements
     * @see AcceptAction
     */

    public String getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of (or not
     * addressed by) the conditions of your policy statements
     * </p>
     * 
     * @param defaultAction
     *        Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of
     *        (or not addressed by) the conditions of your policy statements
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptAction
     */

    public UpdateTrafficPolicyRequest withDefaultAction(String defaultAction) {
        setDefaultAction(defaultAction);
        return this;
    }

    /**
     * <p>
     * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of (or not
     * addressed by) the conditions of your policy statements
     * </p>
     * 
     * @param defaultAction
     *        Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall outside of
     *        (or not addressed by) the conditions of your policy statements
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptAction
     */

    public UpdateTrafficPolicyRequest withDefaultAction(AcceptAction defaultAction) {
        this.defaultAction = defaultAction.toString();
        return this;
    }

    /**
     * <p>
     * The maximum message size in bytes of email which is allowed in by this traffic policy—anything larger will be
     * blocked.
     * </p>
     * 
     * @param maxMessageSizeBytes
     *        The maximum message size in bytes of email which is allowed in by this traffic policy—anything larger will
     *        be blocked.
     */

    public void setMaxMessageSizeBytes(Integer maxMessageSizeBytes) {
        this.maxMessageSizeBytes = maxMessageSizeBytes;
    }

    /**
     * <p>
     * The maximum message size in bytes of email which is allowed in by this traffic policy—anything larger will be
     * blocked.
     * </p>
     * 
     * @return The maximum message size in bytes of email which is allowed in by this traffic policy—anything larger
     *         will be blocked.
     */

    public Integer getMaxMessageSizeBytes() {
        return this.maxMessageSizeBytes;
    }

    /**
     * <p>
     * The maximum message size in bytes of email which is allowed in by this traffic policy—anything larger will be
     * blocked.
     * </p>
     * 
     * @param maxMessageSizeBytes
     *        The maximum message size in bytes of email which is allowed in by this traffic policy—anything larger will
     *        be blocked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficPolicyRequest withMaxMessageSizeBytes(Integer maxMessageSizeBytes) {
        setMaxMessageSizeBytes(maxMessageSizeBytes);
        return this;
    }

    /**
     * <p>
     * The list of conditions to be updated for filtering email traffic.
     * </p>
     * 
     * @return The list of conditions to be updated for filtering email traffic.
     */

    public java.util.List<PolicyStatement> getPolicyStatements() {
        return policyStatements;
    }

    /**
     * <p>
     * The list of conditions to be updated for filtering email traffic.
     * </p>
     * 
     * @param policyStatements
     *        The list of conditions to be updated for filtering email traffic.
     */

    public void setPolicyStatements(java.util.Collection<PolicyStatement> policyStatements) {
        if (policyStatements == null) {
            this.policyStatements = null;
            return;
        }

        this.policyStatements = new java.util.ArrayList<PolicyStatement>(policyStatements);
    }

    /**
     * <p>
     * The list of conditions to be updated for filtering email traffic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyStatements(java.util.Collection)} or {@link #withPolicyStatements(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param policyStatements
     *        The list of conditions to be updated for filtering email traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficPolicyRequest withPolicyStatements(PolicyStatement... policyStatements) {
        if (this.policyStatements == null) {
            setPolicyStatements(new java.util.ArrayList<PolicyStatement>(policyStatements.length));
        }
        for (PolicyStatement ele : policyStatements) {
            this.policyStatements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of conditions to be updated for filtering email traffic.
     * </p>
     * 
     * @param policyStatements
     *        The list of conditions to be updated for filtering email traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficPolicyRequest withPolicyStatements(java.util.Collection<PolicyStatement> policyStatements) {
        setPolicyStatements(policyStatements);
        return this;
    }

    /**
     * <p>
     * The identifier of the traffic policy that you want to update.
     * </p>
     * 
     * @param trafficPolicyId
     *        The identifier of the traffic policy that you want to update.
     */

    public void setTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
    }

    /**
     * <p>
     * The identifier of the traffic policy that you want to update.
     * </p>
     * 
     * @return The identifier of the traffic policy that you want to update.
     */

    public String getTrafficPolicyId() {
        return this.trafficPolicyId;
    }

    /**
     * <p>
     * The identifier of the traffic policy that you want to update.
     * </p>
     * 
     * @param trafficPolicyId
     *        The identifier of the traffic policy that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficPolicyRequest withTrafficPolicyId(String trafficPolicyId) {
        setTrafficPolicyId(trafficPolicyId);
        return this;
    }

    /**
     * <p>
     * A user-friendly name for the traffic policy resource.
     * </p>
     * 
     * @param trafficPolicyName
     *        A user-friendly name for the traffic policy resource.
     */

    public void setTrafficPolicyName(String trafficPolicyName) {
        this.trafficPolicyName = trafficPolicyName;
    }

    /**
     * <p>
     * A user-friendly name for the traffic policy resource.
     * </p>
     * 
     * @return A user-friendly name for the traffic policy resource.
     */

    public String getTrafficPolicyName() {
        return this.trafficPolicyName;
    }

    /**
     * <p>
     * A user-friendly name for the traffic policy resource.
     * </p>
     * 
     * @param trafficPolicyName
     *        A user-friendly name for the traffic policy resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrafficPolicyRequest withTrafficPolicyName(String trafficPolicyName) {
        setTrafficPolicyName(trafficPolicyName);
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
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction()).append(",");
        if (getMaxMessageSizeBytes() != null)
            sb.append("MaxMessageSizeBytes: ").append(getMaxMessageSizeBytes()).append(",");
        if (getPolicyStatements() != null)
            sb.append("PolicyStatements: ").append(getPolicyStatements()).append(",");
        if (getTrafficPolicyId() != null)
            sb.append("TrafficPolicyId: ").append(getTrafficPolicyId()).append(",");
        if (getTrafficPolicyName() != null)
            sb.append("TrafficPolicyName: ").append(getTrafficPolicyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrafficPolicyRequest == false)
            return false;
        UpdateTrafficPolicyRequest other = (UpdateTrafficPolicyRequest) obj;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        if (other.getMaxMessageSizeBytes() == null ^ this.getMaxMessageSizeBytes() == null)
            return false;
        if (other.getMaxMessageSizeBytes() != null && other.getMaxMessageSizeBytes().equals(this.getMaxMessageSizeBytes()) == false)
            return false;
        if (other.getPolicyStatements() == null ^ this.getPolicyStatements() == null)
            return false;
        if (other.getPolicyStatements() != null && other.getPolicyStatements().equals(this.getPolicyStatements()) == false)
            return false;
        if (other.getTrafficPolicyId() == null ^ this.getTrafficPolicyId() == null)
            return false;
        if (other.getTrafficPolicyId() != null && other.getTrafficPolicyId().equals(this.getTrafficPolicyId()) == false)
            return false;
        if (other.getTrafficPolicyName() == null ^ this.getTrafficPolicyName() == null)
            return false;
        if (other.getTrafficPolicyName() != null && other.getTrafficPolicyName().equals(this.getTrafficPolicyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getMaxMessageSizeBytes() == null) ? 0 : getMaxMessageSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getPolicyStatements() == null) ? 0 : getPolicyStatements().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyId() == null) ? 0 : getTrafficPolicyId().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyName() == null) ? 0 : getTrafficPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrafficPolicyRequest clone() {
        return (UpdateTrafficPolicyRequest) super.clone();
    }

}
