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
 * A list of remediation actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PossibleRemediationAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PossibleRemediationAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the list of remediation actions.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ordered list of remediation actions.
     * </p>
     */
    private java.util.List<RemediationActionWithOrder> orderedRemediationActions;
    /**
     * <p>
     * Information about whether an action is taken by default.
     * </p>
     */
    private Boolean isDefaultAction;

    /**
     * <p>
     * A description of the list of remediation actions.
     * </p>
     * 
     * @param description
     *        A description of the list of remediation actions.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the list of remediation actions.
     * </p>
     * 
     * @return A description of the list of remediation actions.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the list of remediation actions.
     * </p>
     * 
     * @param description
     *        A description of the list of remediation actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PossibleRemediationAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ordered list of remediation actions.
     * </p>
     * 
     * @return The ordered list of remediation actions.
     */

    public java.util.List<RemediationActionWithOrder> getOrderedRemediationActions() {
        return orderedRemediationActions;
    }

    /**
     * <p>
     * The ordered list of remediation actions.
     * </p>
     * 
     * @param orderedRemediationActions
     *        The ordered list of remediation actions.
     */

    public void setOrderedRemediationActions(java.util.Collection<RemediationActionWithOrder> orderedRemediationActions) {
        if (orderedRemediationActions == null) {
            this.orderedRemediationActions = null;
            return;
        }

        this.orderedRemediationActions = new java.util.ArrayList<RemediationActionWithOrder>(orderedRemediationActions);
    }

    /**
     * <p>
     * The ordered list of remediation actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrderedRemediationActions(java.util.Collection)} or
     * {@link #withOrderedRemediationActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param orderedRemediationActions
     *        The ordered list of remediation actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PossibleRemediationAction withOrderedRemediationActions(RemediationActionWithOrder... orderedRemediationActions) {
        if (this.orderedRemediationActions == null) {
            setOrderedRemediationActions(new java.util.ArrayList<RemediationActionWithOrder>(orderedRemediationActions.length));
        }
        for (RemediationActionWithOrder ele : orderedRemediationActions) {
            this.orderedRemediationActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ordered list of remediation actions.
     * </p>
     * 
     * @param orderedRemediationActions
     *        The ordered list of remediation actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PossibleRemediationAction withOrderedRemediationActions(java.util.Collection<RemediationActionWithOrder> orderedRemediationActions) {
        setOrderedRemediationActions(orderedRemediationActions);
        return this;
    }

    /**
     * <p>
     * Information about whether an action is taken by default.
     * </p>
     * 
     * @param isDefaultAction
     *        Information about whether an action is taken by default.
     */

    public void setIsDefaultAction(Boolean isDefaultAction) {
        this.isDefaultAction = isDefaultAction;
    }

    /**
     * <p>
     * Information about whether an action is taken by default.
     * </p>
     * 
     * @return Information about whether an action is taken by default.
     */

    public Boolean getIsDefaultAction() {
        return this.isDefaultAction;
    }

    /**
     * <p>
     * Information about whether an action is taken by default.
     * </p>
     * 
     * @param isDefaultAction
     *        Information about whether an action is taken by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PossibleRemediationAction withIsDefaultAction(Boolean isDefaultAction) {
        setIsDefaultAction(isDefaultAction);
        return this;
    }

    /**
     * <p>
     * Information about whether an action is taken by default.
     * </p>
     * 
     * @return Information about whether an action is taken by default.
     */

    public Boolean isDefaultAction() {
        return this.isDefaultAction;
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
        if (getOrderedRemediationActions() != null)
            sb.append("OrderedRemediationActions: ").append(getOrderedRemediationActions()).append(",");
        if (getIsDefaultAction() != null)
            sb.append("IsDefaultAction: ").append(getIsDefaultAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PossibleRemediationAction == false)
            return false;
        PossibleRemediationAction other = (PossibleRemediationAction) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOrderedRemediationActions() == null ^ this.getOrderedRemediationActions() == null)
            return false;
        if (other.getOrderedRemediationActions() != null && other.getOrderedRemediationActions().equals(this.getOrderedRemediationActions()) == false)
            return false;
        if (other.getIsDefaultAction() == null ^ this.getIsDefaultAction() == null)
            return false;
        if (other.getIsDefaultAction() != null && other.getIsDefaultAction().equals(this.getIsDefaultAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOrderedRemediationActions() == null) ? 0 : getOrderedRemediationActions().hashCode());
        hashCode = prime * hashCode + ((getIsDefaultAction() == null) ? 0 : getIsDefaultAction().hashCode());
        return hashCode;
    }

    @Override
    public PossibleRemediationAction clone() {
        try {
            return (PossibleRemediationAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.PossibleRemediationActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
