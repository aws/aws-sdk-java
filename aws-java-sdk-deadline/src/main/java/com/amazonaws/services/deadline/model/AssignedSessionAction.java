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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The action for a session defined by the session action ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssignedSessionAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignedSessionAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The definition of the assigned session action.
     * </p>
     */
    private AssignedSessionActionDefinition definition;
    /**
     * <p>
     * The session action ID for the assigned session.
     * </p>
     */
    private String sessionActionId;

    /**
     * <p>
     * The definition of the assigned session action.
     * </p>
     * 
     * @param definition
     *        The definition of the assigned session action.
     */

    public void setDefinition(AssignedSessionActionDefinition definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The definition of the assigned session action.
     * </p>
     * 
     * @return The definition of the assigned session action.
     */

    public AssignedSessionActionDefinition getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The definition of the assigned session action.
     * </p>
     * 
     * @param definition
     *        The definition of the assigned session action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignedSessionAction withDefinition(AssignedSessionActionDefinition definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The session action ID for the assigned session.
     * </p>
     * 
     * @param sessionActionId
     *        The session action ID for the assigned session.
     */

    public void setSessionActionId(String sessionActionId) {
        this.sessionActionId = sessionActionId;
    }

    /**
     * <p>
     * The session action ID for the assigned session.
     * </p>
     * 
     * @return The session action ID for the assigned session.
     */

    public String getSessionActionId() {
        return this.sessionActionId;
    }

    /**
     * <p>
     * The session action ID for the assigned session.
     * </p>
     * 
     * @param sessionActionId
     *        The session action ID for the assigned session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignedSessionAction withSessionActionId(String sessionActionId) {
        setSessionActionId(sessionActionId);
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
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getSessionActionId() != null)
            sb.append("SessionActionId: ").append(getSessionActionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignedSessionAction == false)
            return false;
        AssignedSessionAction other = (AssignedSessionAction) obj;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getSessionActionId() == null ^ this.getSessionActionId() == null)
            return false;
        if (other.getSessionActionId() != null && other.getSessionActionId().equals(this.getSessionActionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getSessionActionId() == null) ? 0 : getSessionActionId().hashCode());
        return hashCode;
    }

    @Override
    public AssignedSessionAction clone() {
        try {
            return (AssignedSessionAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.AssignedSessionActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
