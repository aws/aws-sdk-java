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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A custom action that can be used for stateless packet handling.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/FirewallPolicyStatelessCustomActionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallPolicyStatelessCustomActionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The definition of the custom action.
     * </p>
     */
    private StatelessCustomActionDefinition actionDefinition;
    /**
     * <p>
     * The name of the custom action.
     * </p>
     */
    private String actionName;

    /**
     * <p>
     * The definition of the custom action.
     * </p>
     * 
     * @param actionDefinition
     *        The definition of the custom action.
     */

    public void setActionDefinition(StatelessCustomActionDefinition actionDefinition) {
        this.actionDefinition = actionDefinition;
    }

    /**
     * <p>
     * The definition of the custom action.
     * </p>
     * 
     * @return The definition of the custom action.
     */

    public StatelessCustomActionDefinition getActionDefinition() {
        return this.actionDefinition;
    }

    /**
     * <p>
     * The definition of the custom action.
     * </p>
     * 
     * @param actionDefinition
     *        The definition of the custom action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyStatelessCustomActionsDetails withActionDefinition(StatelessCustomActionDefinition actionDefinition) {
        setActionDefinition(actionDefinition);
        return this;
    }

    /**
     * <p>
     * The name of the custom action.
     * </p>
     * 
     * @param actionName
     *        The name of the custom action.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the custom action.
     * </p>
     * 
     * @return The name of the custom action.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the custom action.
     * </p>
     * 
     * @param actionName
     *        The name of the custom action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyStatelessCustomActionsDetails withActionName(String actionName) {
        setActionName(actionName);
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
        if (getActionDefinition() != null)
            sb.append("ActionDefinition: ").append(getActionDefinition()).append(",");
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirewallPolicyStatelessCustomActionsDetails == false)
            return false;
        FirewallPolicyStatelessCustomActionsDetails other = (FirewallPolicyStatelessCustomActionsDetails) obj;
        if (other.getActionDefinition() == null ^ this.getActionDefinition() == null)
            return false;
        if (other.getActionDefinition() != null && other.getActionDefinition().equals(this.getActionDefinition()) == false)
            return false;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionDefinition() == null) ? 0 : getActionDefinition().hashCode());
        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        return hashCode;
    }

    @Override
    public FirewallPolicyStatelessCustomActionsDetails clone() {
        try {
            return (FirewallPolicyStatelessCustomActionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.FirewallPolicyStatelessCustomActionsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
