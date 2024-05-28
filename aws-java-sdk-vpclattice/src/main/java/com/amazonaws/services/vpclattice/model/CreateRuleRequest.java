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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The action for the default rule.
     * </p>
     */
    private RuleAction action;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String listenerIdentifier;
    /**
     * <p>
     * The rule match.
     * </p>
     */
    private RuleMatch match;
    /**
     * <p>
     * The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens
     * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The lower the
     * priority number the higher the priority.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     */
    private String serviceIdentifier;
    /**
     * <p>
     * The tags for the rule.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The action for the default rule.
     * </p>
     * 
     * @param action
     *        The action for the default rule.
     */

    public void setAction(RuleAction action) {
        this.action = action;
    }

    /**
     * <p>
     * The action for the default rule.
     * </p>
     * 
     * @return The action for the default rule.
     */

    public RuleAction getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action for the default rule.
     * </p>
     * 
     * @param action
     *        The action for the default rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withAction(RuleAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *        retry a request that completed successfully using the same client token and parameters, the retry succeeds
     *        without performing any actions. If the parameters aren't identical, the retry fails.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *         retry a request that completed successfully using the same client token and parameters, the retry
     *         succeeds without performing any actions. If the parameters aren't identical, the retry fails.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *        retry a request that completed successfully using the same client token and parameters, the retry succeeds
     *        without performing any actions. If the parameters aren't identical, the retry fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerIdentifier
     *        The ID or Amazon Resource Name (ARN) of the listener.
     */

    public void setListenerIdentifier(String listenerIdentifier) {
        this.listenerIdentifier = listenerIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the listener.
     */

    public String getListenerIdentifier() {
        return this.listenerIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param listenerIdentifier
     *        The ID or Amazon Resource Name (ARN) of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withListenerIdentifier(String listenerIdentifier) {
        setListenerIdentifier(listenerIdentifier);
        return this;
    }

    /**
     * <p>
     * The rule match.
     * </p>
     * 
     * @param match
     *        The rule match.
     */

    public void setMatch(RuleMatch match) {
        this.match = match;
    }

    /**
     * <p>
     * The rule match.
     * </p>
     * 
     * @return The rule match.
     */

    public RuleMatch getMatch() {
        return this.match;
    }

    /**
     * <p>
     * The rule match.
     * </p>
     * 
     * @param match
     *        The rule match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withMatch(RuleMatch match) {
        setMatch(match);
        return this;
    }

    /**
     * <p>
     * The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens
     * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @param name
     *        The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and
     *        hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens
     * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @return The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and
     *         hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens
     * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @param name
     *        The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and
     *        hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The lower the
     * priority number the higher the priority.
     * </p>
     * 
     * @param priority
     *        The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The
     *        lower the priority number the higher the priority.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The lower the
     * priority number the higher the priority.
     * </p>
     * 
     * @return The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The
     *         lower the priority number the higher the priority.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The lower the
     * priority number the higher the priority.
     * </p>
     * 
     * @param priority
     *        The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The
     *        lower the priority number the higher the priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service.
     */

    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the service.
     */

    public String getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withServiceIdentifier(String serviceIdentifier) {
        setServiceIdentifier(serviceIdentifier);
        return this;
    }

    /**
     * <p>
     * The tags for the rule.
     * </p>
     * 
     * @return The tags for the rule.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the rule.
     * </p>
     * 
     * @param tags
     *        The tags for the rule.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the rule.
     * </p>
     * 
     * @param tags
     *        The tags for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRuleRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getListenerIdentifier() != null)
            sb.append("ListenerIdentifier: ").append(getListenerIdentifier()).append(",");
        if (getMatch() != null)
            sb.append("Match: ").append(getMatch()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getServiceIdentifier() != null)
            sb.append("ServiceIdentifier: ").append(getServiceIdentifier()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRuleRequest == false)
            return false;
        CreateRuleRequest other = (CreateRuleRequest) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getListenerIdentifier() == null ^ this.getListenerIdentifier() == null)
            return false;
        if (other.getListenerIdentifier() != null && other.getListenerIdentifier().equals(this.getListenerIdentifier()) == false)
            return false;
        if (other.getMatch() == null ^ this.getMatch() == null)
            return false;
        if (other.getMatch() != null && other.getMatch().equals(this.getMatch()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getServiceIdentifier() == null ^ this.getServiceIdentifier() == null)
            return false;
        if (other.getServiceIdentifier() != null && other.getServiceIdentifier().equals(this.getServiceIdentifier()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getListenerIdentifier() == null) ? 0 : getListenerIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMatch() == null) ? 0 : getMatch().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getServiceIdentifier() == null) ? 0 : getServiceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRuleRequest clone() {
        return (CreateRuleRequest) super.clone();
    }

}
