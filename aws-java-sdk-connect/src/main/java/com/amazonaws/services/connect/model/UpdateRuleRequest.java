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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The name of the rule. You can change the name only if <code>TriggerEventSource</code> is one of the following
     * values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     */
    private String name;
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
     * A unique identifier for the rule.
     * </p>
     * 
     * @param ruleId
     *        A unique identifier for the rule.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * 
     * @return A unique identifier for the rule.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * A unique identifier for the rule.
     * </p>
     * 
     * @param ruleId
     *        A unique identifier for the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleRequest withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

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

    public UpdateRuleRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The name of the rule. You can change the name only if <code>TriggerEventSource</code> is one of the following
     * values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     * 
     * @param name
     *        The name of the rule. You can change the name only if <code>TriggerEventSource</code> is one of the
     *        following values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
     *        <code>OnSalesforceCaseCreate</code>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the rule. You can change the name only if <code>TriggerEventSource</code> is one of the following
     * values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     * 
     * @return The name of the rule. You can change the name only if <code>TriggerEventSource</code> is one of the
     *         following values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
     *         <code>OnSalesforceCaseCreate</code>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the rule. You can change the name only if <code>TriggerEventSource</code> is one of the following
     * values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
     * <code>OnSalesforceCaseCreate</code>
     * </p>
     * 
     * @param name
     *        The name of the rule. You can change the name only if <code>TriggerEventSource</code> is one of the
     *        following values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
     *        <code>OnSalesforceCaseCreate</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuleRequest withName(String name) {
        setName(name);
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

    public UpdateRuleRequest withFunction(String function) {
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

    public UpdateRuleRequest withActions(RuleAction... actions) {
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

    public UpdateRuleRequest withActions(java.util.Collection<RuleAction> actions) {
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

    public UpdateRuleRequest withPublishStatus(String publishStatus) {
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

    public UpdateRuleRequest withPublishStatus(RulePublishStatus publishStatus) {
        this.publishStatus = publishStatus.toString();
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
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFunction() != null)
            sb.append("Function: ").append(getFunction()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getPublishStatus() != null)
            sb.append("PublishStatus: ").append(getPublishStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRuleRequest == false)
            return false;
        UpdateRuleRequest other = (UpdateRuleRequest) obj;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFunction() == null) ? 0 : getFunction().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getPublishStatus() == null) ? 0 : getPublishStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRuleRequest clone() {
        return (UpdateRuleRequest) super.clone();
    }

}
