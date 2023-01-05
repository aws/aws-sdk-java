/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CreateRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * A unique name for the rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     */
    private RuleTriggerEventSource triggerEventSource;
    /**
     * <p>
     * The conditions of the rule.
     * </p>
     */
    private String function;
    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     */
    private java.util.List<RuleAction> actions;
    /**
     * <p>
     * The publish status of the rule.
     * </p>
     */
    private String publishStatus;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A unique name for the rule.
     * </p>
     * 
     * @param name
     *        A unique name for the rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique name for the rule.
     * </p>
     * 
     * @return A unique name for the rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique name for the rule.
     * </p>
     * 
     * @param name
     *        A unique name for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     * 
     * @param triggerEventSource
     *        The event source to trigger the rule.
     */

    public void setTriggerEventSource(RuleTriggerEventSource triggerEventSource) {
        this.triggerEventSource = triggerEventSource;
    }

    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     * 
     * @return The event source to trigger the rule.
     */

    public RuleTriggerEventSource getTriggerEventSource() {
        return this.triggerEventSource;
    }

    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     * 
     * @param triggerEventSource
     *        The event source to trigger the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withTriggerEventSource(RuleTriggerEventSource triggerEventSource) {
        setTriggerEventSource(triggerEventSource);
        return this;
    }

    /**
     * <p>
     * The conditions of the rule.
     * </p>
     * 
     * @param function
     *        The conditions of the rule.
     */

    public void setFunction(String function) {
        this.function = function;
    }

    /**
     * <p>
     * The conditions of the rule.
     * </p>
     * 
     * @return The conditions of the rule.
     */

    public String getFunction() {
        return this.function;
    }

    /**
     * <p>
     * The conditions of the rule.
     * </p>
     * 
     * @param function
     *        The conditions of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withFunction(String function) {
        setFunction(function);
        return this;
    }

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     * 
     * @return A list of actions to be run when the rule is triggered.
     */

    public java.util.List<RuleAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     * 
     * @param actions
     *        A list of actions to be run when the rule is triggered.
     */

    public void setActions(java.util.Collection<RuleAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<RuleAction>(actions);
    }

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        A list of actions to be run when the rule is triggered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withActions(RuleAction... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<RuleAction>(actions.length));
        }
        for (RuleAction ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     * 
     * @param actions
     *        A list of actions to be run when the rule is triggered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withActions(java.util.Collection<RuleAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @param publishStatus
     *        The publish status of the rule.
     * @see RulePublishStatus
     */

    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @return The publish status of the rule.
     * @see RulePublishStatus
     */

    public String getPublishStatus() {
        return this.publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @param publishStatus
     *        The publish status of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RulePublishStatus
     */

    public CreateRuleRequest withPublishStatus(String publishStatus) {
        setPublishStatus(publishStatus);
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * 
     * @param publishStatus
     *        The publish status of the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RulePublishStatus
     */

    public CreateRuleRequest withPublishStatus(RulePublishStatus publishStatus) {
        this.publishStatus = publishStatus.toString();
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *         provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see
     *         <a href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making
     *         retries safe with idempotent APIs</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTriggerEventSource() != null)
            sb.append("TriggerEventSource: ").append(getTriggerEventSource()).append(",");
        if (getFunction() != null)
            sb.append("Function: ").append(getFunction()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getPublishStatus() != null)
            sb.append("PublishStatus: ").append(getPublishStatus()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
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
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTriggerEventSource() == null ^ this.getTriggerEventSource() == null)
            return false;
        if (other.getTriggerEventSource() != null && other.getTriggerEventSource().equals(this.getTriggerEventSource()) == false)
            return false;
        if (other.getFunction() == null ^ this.getFunction() == null)
            return false;
        if (other.getFunction() != null && other.getFunction().equals(this.getFunction()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getPublishStatus() == null ^ this.getPublishStatus() == null)
            return false;
        if (other.getPublishStatus() != null && other.getPublishStatus().equals(this.getPublishStatus()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTriggerEventSource() == null) ? 0 : getTriggerEventSource().hashCode());
        hashCode = prime * hashCode + ((getFunction() == null) ? 0 : getFunction().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getPublishStatus() == null) ? 0 : getPublishStatus().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateRuleRequest clone() {
        return (CreateRuleRequest) super.clone();
    }

}
