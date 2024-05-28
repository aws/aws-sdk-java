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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure containing traffic policy conditions and actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/PolicyStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action that informs a traffic policy resource to either allow or block the email if it matches a condition in
     * the policy statement.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The list of conditions to apply to incoming messages for filtering email traffic.
     * </p>
     */
    private java.util.List<PolicyCondition> conditions;

    /**
     * <p>
     * The action that informs a traffic policy resource to either allow or block the email if it matches a condition in
     * the policy statement.
     * </p>
     * 
     * @param action
     *        The action that informs a traffic policy resource to either allow or block the email if it matches a
     *        condition in the policy statement.
     * @see AcceptAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action that informs a traffic policy resource to either allow or block the email if it matches a condition in
     * the policy statement.
     * </p>
     * 
     * @return The action that informs a traffic policy resource to either allow or block the email if it matches a
     *         condition in the policy statement.
     * @see AcceptAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action that informs a traffic policy resource to either allow or block the email if it matches a condition in
     * the policy statement.
     * </p>
     * 
     * @param action
     *        The action that informs a traffic policy resource to either allow or block the email if it matches a
     *        condition in the policy statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptAction
     */

    public PolicyStatement withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action that informs a traffic policy resource to either allow or block the email if it matches a condition in
     * the policy statement.
     * </p>
     * 
     * @param action
     *        The action that informs a traffic policy resource to either allow or block the email if it matches a
     *        condition in the policy statement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptAction
     */

    public PolicyStatement withAction(AcceptAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The list of conditions to apply to incoming messages for filtering email traffic.
     * </p>
     * 
     * @return The list of conditions to apply to incoming messages for filtering email traffic.
     */

    public java.util.List<PolicyCondition> getConditions() {
        return conditions;
    }

    /**
     * <p>
     * The list of conditions to apply to incoming messages for filtering email traffic.
     * </p>
     * 
     * @param conditions
     *        The list of conditions to apply to incoming messages for filtering email traffic.
     */

    public void setConditions(java.util.Collection<PolicyCondition> conditions) {
        if (conditions == null) {
            this.conditions = null;
            return;
        }

        this.conditions = new java.util.ArrayList<PolicyCondition>(conditions);
    }

    /**
     * <p>
     * The list of conditions to apply to incoming messages for filtering email traffic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditions(java.util.Collection)} or {@link #withConditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param conditions
     *        The list of conditions to apply to incoming messages for filtering email traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyStatement withConditions(PolicyCondition... conditions) {
        if (this.conditions == null) {
            setConditions(new java.util.ArrayList<PolicyCondition>(conditions.length));
        }
        for (PolicyCondition ele : conditions) {
            this.conditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of conditions to apply to incoming messages for filtering email traffic.
     * </p>
     * 
     * @param conditions
     *        The list of conditions to apply to incoming messages for filtering email traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyStatement withConditions(java.util.Collection<PolicyCondition> conditions) {
        setConditions(conditions);
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
        if (getConditions() != null)
            sb.append("Conditions: ").append(getConditions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyStatement == false)
            return false;
        PolicyStatement other = (PolicyStatement) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getConditions() == null ^ this.getConditions() == null)
            return false;
        if (other.getConditions() != null && other.getConditions().equals(this.getConditions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getConditions() == null) ? 0 : getConditions().hashCode());
        return hashCode;
    }

    @Override
    public PolicyStatement clone() {
        try {
            return (PolicyStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.PolicyStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
