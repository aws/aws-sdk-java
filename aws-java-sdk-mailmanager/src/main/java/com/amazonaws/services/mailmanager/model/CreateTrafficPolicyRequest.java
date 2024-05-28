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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/CreateTrafficPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrafficPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     */
    private String clientToken;
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
     * Conditional statements for filtering email traffic.
     * </p>
     */
    private java.util.List<PolicyStatement> policyStatements;
    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A user-friendly name for the traffic policy resource.
     * </p>
     */
    private String trafficPolicyName;

    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     * 
     * @return A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        A unique token that Amazon SES uses to recognize subsequent retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateTrafficPolicyRequest withDefaultAction(String defaultAction) {
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

    public CreateTrafficPolicyRequest withDefaultAction(AcceptAction defaultAction) {
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

    public CreateTrafficPolicyRequest withMaxMessageSizeBytes(Integer maxMessageSizeBytes) {
        setMaxMessageSizeBytes(maxMessageSizeBytes);
        return this;
    }

    /**
     * <p>
     * Conditional statements for filtering email traffic.
     * </p>
     * 
     * @return Conditional statements for filtering email traffic.
     */

    public java.util.List<PolicyStatement> getPolicyStatements() {
        return policyStatements;
    }

    /**
     * <p>
     * Conditional statements for filtering email traffic.
     * </p>
     * 
     * @param policyStatements
     *        Conditional statements for filtering email traffic.
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
     * Conditional statements for filtering email traffic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyStatements(java.util.Collection)} or {@link #withPolicyStatements(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param policyStatements
     *        Conditional statements for filtering email traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyRequest withPolicyStatements(PolicyStatement... policyStatements) {
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
     * Conditional statements for filtering email traffic.
     * </p>
     * 
     * @param policyStatements
     *        Conditional statements for filtering email traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyRequest withPolicyStatements(java.util.Collection<PolicyStatement> policyStatements) {
        setPolicyStatements(policyStatements);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for the resource. For example, { "tags":
     *         {"key1":"value1", "key2":"value2"} }.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for the resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for the resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for the resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for the resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrafficPolicyRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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

    public CreateTrafficPolicyRequest withTrafficPolicyName(String trafficPolicyName) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction()).append(",");
        if (getMaxMessageSizeBytes() != null)
            sb.append("MaxMessageSizeBytes: ").append(getMaxMessageSizeBytes()).append(",");
        if (getPolicyStatements() != null)
            sb.append("PolicyStatements: ").append(getPolicyStatements()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateTrafficPolicyRequest == false)
            return false;
        CreateTrafficPolicyRequest other = (CreateTrafficPolicyRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getMaxMessageSizeBytes() == null) ? 0 : getMaxMessageSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getPolicyStatements() == null) ? 0 : getPolicyStatements().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyName() == null) ? 0 : getTrafficPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrafficPolicyRequest clone() {
        return (CreateTrafficPolicyRequest) super.clone();
    }

}
