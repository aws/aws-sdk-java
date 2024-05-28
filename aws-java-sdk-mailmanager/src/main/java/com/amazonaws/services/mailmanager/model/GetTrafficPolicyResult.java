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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetTrafficPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTrafficPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of when the traffic policy was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The default action of the traffic policy.
     * </p>
     */
    private String defaultAction;
    /**
     * <p>
     * The timestamp of when the traffic policy was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;
    /**
     * <p>
     * The maximum message size in bytes of email which is allowed in by this traffic policy—anything larger will be
     * blocked.
     * </p>
     */
    private Integer maxMessageSizeBytes;
    /**
     * <p>
     * The list of conditions which are in the traffic policy resource.
     * </p>
     */
    private java.util.List<PolicyStatement> policyStatements;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic policy resource.
     * </p>
     */
    private String trafficPolicyArn;
    /**
     * <p>
     * The identifier of the traffic policy resource.
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
     * The timestamp of when the traffic policy was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp of when the traffic policy was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the traffic policy was created.
     * </p>
     * 
     * @return The timestamp of when the traffic policy was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the traffic policy was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp of when the traffic policy was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrafficPolicyResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The default action of the traffic policy.
     * </p>
     * 
     * @param defaultAction
     *        The default action of the traffic policy.
     * @see AcceptAction
     */

    public void setDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The default action of the traffic policy.
     * </p>
     * 
     * @return The default action of the traffic policy.
     * @see AcceptAction
     */

    public String getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * The default action of the traffic policy.
     * </p>
     * 
     * @param defaultAction
     *        The default action of the traffic policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptAction
     */

    public GetTrafficPolicyResult withDefaultAction(String defaultAction) {
        setDefaultAction(defaultAction);
        return this;
    }

    /**
     * <p>
     * The default action of the traffic policy.
     * </p>
     * 
     * @param defaultAction
     *        The default action of the traffic policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptAction
     */

    public GetTrafficPolicyResult withDefaultAction(AcceptAction defaultAction) {
        this.defaultAction = defaultAction.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the traffic policy was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The timestamp of when the traffic policy was last updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the traffic policy was last updated.
     * </p>
     * 
     * @return The timestamp of when the traffic policy was last updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the traffic policy was last updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The timestamp of when the traffic policy was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrafficPolicyResult withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
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

    public GetTrafficPolicyResult withMaxMessageSizeBytes(Integer maxMessageSizeBytes) {
        setMaxMessageSizeBytes(maxMessageSizeBytes);
        return this;
    }

    /**
     * <p>
     * The list of conditions which are in the traffic policy resource.
     * </p>
     * 
     * @return The list of conditions which are in the traffic policy resource.
     */

    public java.util.List<PolicyStatement> getPolicyStatements() {
        return policyStatements;
    }

    /**
     * <p>
     * The list of conditions which are in the traffic policy resource.
     * </p>
     * 
     * @param policyStatements
     *        The list of conditions which are in the traffic policy resource.
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
     * The list of conditions which are in the traffic policy resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyStatements(java.util.Collection)} or {@link #withPolicyStatements(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param policyStatements
     *        The list of conditions which are in the traffic policy resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrafficPolicyResult withPolicyStatements(PolicyStatement... policyStatements) {
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
     * The list of conditions which are in the traffic policy resource.
     * </p>
     * 
     * @param policyStatements
     *        The list of conditions which are in the traffic policy resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrafficPolicyResult withPolicyStatements(java.util.Collection<PolicyStatement> policyStatements) {
        setPolicyStatements(policyStatements);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic policy resource.
     * </p>
     * 
     * @param trafficPolicyArn
     *        The Amazon Resource Name (ARN) of the traffic policy resource.
     */

    public void setTrafficPolicyArn(String trafficPolicyArn) {
        this.trafficPolicyArn = trafficPolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic policy resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the traffic policy resource.
     */

    public String getTrafficPolicyArn() {
        return this.trafficPolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic policy resource.
     * </p>
     * 
     * @param trafficPolicyArn
     *        The Amazon Resource Name (ARN) of the traffic policy resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrafficPolicyResult withTrafficPolicyArn(String trafficPolicyArn) {
        setTrafficPolicyArn(trafficPolicyArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the traffic policy resource.
     * </p>
     * 
     * @param trafficPolicyId
     *        The identifier of the traffic policy resource.
     */

    public void setTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
    }

    /**
     * <p>
     * The identifier of the traffic policy resource.
     * </p>
     * 
     * @return The identifier of the traffic policy resource.
     */

    public String getTrafficPolicyId() {
        return this.trafficPolicyId;
    }

    /**
     * <p>
     * The identifier of the traffic policy resource.
     * </p>
     * 
     * @param trafficPolicyId
     *        The identifier of the traffic policy resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrafficPolicyResult withTrafficPolicyId(String trafficPolicyId) {
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

    public GetTrafficPolicyResult withTrafficPolicyName(String trafficPolicyName) {
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
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getMaxMessageSizeBytes() != null)
            sb.append("MaxMessageSizeBytes: ").append(getMaxMessageSizeBytes()).append(",");
        if (getPolicyStatements() != null)
            sb.append("PolicyStatements: ").append(getPolicyStatements()).append(",");
        if (getTrafficPolicyArn() != null)
            sb.append("TrafficPolicyArn: ").append(getTrafficPolicyArn()).append(",");
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

        if (obj instanceof GetTrafficPolicyResult == false)
            return false;
        GetTrafficPolicyResult other = (GetTrafficPolicyResult) obj;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getMaxMessageSizeBytes() == null ^ this.getMaxMessageSizeBytes() == null)
            return false;
        if (other.getMaxMessageSizeBytes() != null && other.getMaxMessageSizeBytes().equals(this.getMaxMessageSizeBytes()) == false)
            return false;
        if (other.getPolicyStatements() == null ^ this.getPolicyStatements() == null)
            return false;
        if (other.getPolicyStatements() != null && other.getPolicyStatements().equals(this.getPolicyStatements()) == false)
            return false;
        if (other.getTrafficPolicyArn() == null ^ this.getTrafficPolicyArn() == null)
            return false;
        if (other.getTrafficPolicyArn() != null && other.getTrafficPolicyArn().equals(this.getTrafficPolicyArn()) == false)
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

        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMaxMessageSizeBytes() == null) ? 0 : getMaxMessageSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getPolicyStatements() == null) ? 0 : getPolicyStatements().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyArn() == null) ? 0 : getTrafficPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyId() == null) ? 0 : getTrafficPolicyId().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyName() == null) ? 0 : getTrafficPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public GetTrafficPolicyResult clone() {
        try {
            return (GetTrafficPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
