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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an action for a request for which an authorization decision is made.
 * </p>
 * <p>
 * This data type is used as a request parameter to the <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorized.html">IsAuthorized</a>, <a
 * href
 * ="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_BatchIsAuthorized.html">BatchIsAuthorized
 * </a>, and <a
 * href="https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorizedWithToken.html"
 * >IsAuthorizedWithToken</a> operations.
 * </p>
 * <p>
 * Example: <code>{ "actionId": "&lt;action name&gt;", "actionType": "Action" }</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/ActionIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of an action.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * The ID of an action.
     * </p>
     */
    private String actionId;

    /**
     * <p>
     * The type of an action.
     * </p>
     * 
     * @param actionType
     *        The type of an action.
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of an action.
     * </p>
     * 
     * @return The type of an action.
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of an action.
     * </p>
     * 
     * @param actionType
     *        The type of an action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionIdentifier withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The ID of an action.
     * </p>
     * 
     * @param actionId
     *        The ID of an action.
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * The ID of an action.
     * </p>
     * 
     * @return The ID of an action.
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * The ID of an action.
     * </p>
     * 
     * @param actionId
     *        The ID of an action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionIdentifier withActionId(String actionId) {
        setActionId(actionId);
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
            sb.append("ActionType: ").append("***Sensitive Data Redacted***").append(",");
        if (getActionId() != null)
            sb.append("ActionId: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionIdentifier == false)
            return false;
        ActionIdentifier other = (ActionIdentifier) obj;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        return hashCode;
    }

    @Override
    public ActionIdentifier clone() {
        try {
            return (ActionIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.verifiedpermissions.model.transform.ActionIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
