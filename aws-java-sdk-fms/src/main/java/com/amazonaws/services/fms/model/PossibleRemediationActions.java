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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of possible remediation action lists. Each individual possible remediation action is a list of individual
 * remediation actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PossibleRemediationActions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PossibleRemediationActions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the possible remediation actions list.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the actions.
     * </p>
     */
    private java.util.List<PossibleRemediationAction> actions;

    /**
     * <p>
     * A description of the possible remediation actions list.
     * </p>
     * 
     * @param description
     *        A description of the possible remediation actions list.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the possible remediation actions list.
     * </p>
     * 
     * @return A description of the possible remediation actions list.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the possible remediation actions list.
     * </p>
     * 
     * @param description
     *        A description of the possible remediation actions list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PossibleRemediationActions withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the actions.
     * </p>
     * 
     * @return Information about the actions.
     */

    public java.util.List<PossibleRemediationAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * Information about the actions.
     * </p>
     * 
     * @param actions
     *        Information about the actions.
     */

    public void setActions(java.util.Collection<PossibleRemediationAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<PossibleRemediationAction>(actions);
    }

    /**
     * <p>
     * Information about the actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        Information about the actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PossibleRemediationActions withActions(PossibleRemediationAction... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<PossibleRemediationAction>(actions.length));
        }
        for (PossibleRemediationAction ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the actions.
     * </p>
     * 
     * @param actions
     *        Information about the actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PossibleRemediationActions withActions(java.util.Collection<PossibleRemediationAction> actions) {
        setActions(actions);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PossibleRemediationActions == false)
            return false;
        PossibleRemediationActions other = (PossibleRemediationActions) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public PossibleRemediationActions clone() {
        try {
            return (PossibleRemediationActions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.PossibleRemediationActionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
