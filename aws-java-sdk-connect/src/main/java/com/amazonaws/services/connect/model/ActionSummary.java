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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ActionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action type.
     * </p>
     */
    private String actionType;

    /**
     * <p>
     * The action type.
     * </p>
     * 
     * @param actionType
     *        The action type.
     * @see ActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The action type.
     * </p>
     * 
     * @return The action type.
     * @see ActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The action type.
     * </p>
     * 
     * @param actionType
     *        The action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public ActionSummary withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The action type.
     * </p>
     * 
     * @param actionType
     *        The action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public ActionSummary withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
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
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionSummary == false)
            return false;
        ActionSummary other = (ActionSummary) obj;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        return hashCode;
    }

    @Override
    public ActionSummary clone() {
        try {
            return (ActionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ActionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
