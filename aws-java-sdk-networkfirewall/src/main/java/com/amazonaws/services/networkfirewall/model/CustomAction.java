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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An optional, non-standard action to use for stateless packet handling. You can define this in addition to the
 * standard action that you must specify.
 * </p>
 * <p>
 * You define and name the custom actions that you want to be able to use, and then you reference them by name in your
 * actions settings.
 * </p>
 * <p>
 * You can use custom actions in the following places:
 * </p>
 * <ul>
 * <li>
 * <p>
 * In a rule group's <a>StatelessRulesAndCustomActions</a> specification. The custom actions are available for use by
 * name inside the <code>StatelessRulesAndCustomActions</code> where you define them. You can use them for your
 * stateless rule actions to specify what to do with a packet that matches the rule's match attributes.
 * </p>
 * </li>
 * <li>
 * <p>
 * In a <a>FirewallPolicy</a> specification, in <code>StatelessCustomActions</code>. The custom actions are available
 * for use inside the policy where you define them. You can use them for the policy's default stateless actions settings
 * to specify what to do with packets that don't match any of the policy's stateless rules.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CustomAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The descriptive name of the custom action. You can't change the name of a custom action after you create it.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The custom action associated with the action name.
     * </p>
     */
    private ActionDefinition actionDefinition;

    /**
     * <p>
     * The descriptive name of the custom action. You can't change the name of a custom action after you create it.
     * </p>
     * 
     * @param actionName
     *        The descriptive name of the custom action. You can't change the name of a custom action after you create
     *        it.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The descriptive name of the custom action. You can't change the name of a custom action after you create it.
     * </p>
     * 
     * @return The descriptive name of the custom action. You can't change the name of a custom action after you create
     *         it.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The descriptive name of the custom action. You can't change the name of a custom action after you create it.
     * </p>
     * 
     * @param actionName
     *        The descriptive name of the custom action. You can't change the name of a custom action after you create
     *        it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAction withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The custom action associated with the action name.
     * </p>
     * 
     * @param actionDefinition
     *        The custom action associated with the action name.
     */

    public void setActionDefinition(ActionDefinition actionDefinition) {
        this.actionDefinition = actionDefinition;
    }

    /**
     * <p>
     * The custom action associated with the action name.
     * </p>
     * 
     * @return The custom action associated with the action name.
     */

    public ActionDefinition getActionDefinition() {
        return this.actionDefinition;
    }

    /**
     * <p>
     * The custom action associated with the action name.
     * </p>
     * 
     * @param actionDefinition
     *        The custom action associated with the action name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomAction withActionDefinition(ActionDefinition actionDefinition) {
        setActionDefinition(actionDefinition);
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
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getActionDefinition() != null)
            sb.append("ActionDefinition: ").append(getActionDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomAction == false)
            return false;
        CustomAction other = (CustomAction) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getActionDefinition() == null ^ this.getActionDefinition() == null)
            return false;
        if (other.getActionDefinition() != null && other.getActionDefinition().equals(this.getActionDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getActionDefinition() == null) ? 0 : getActionDefinition().hashCode());
        return hashCode;
    }

    @Override
    public CustomAction clone() {
        try {
            return (CustomAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.CustomActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
