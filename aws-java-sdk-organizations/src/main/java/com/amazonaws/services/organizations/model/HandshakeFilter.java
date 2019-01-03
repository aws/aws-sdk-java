/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the criteria that are used to select the handshakes for the operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/HandshakeFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HandshakeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the type of handshake action.
     * </p>
     * <p>
     * If you specify <code>ActionType</code>, you cannot also specify <code>ParentHandshakeId</code>.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * Specifies the parent handshake. Only used for handshake types that are a child of another type.
     * </p>
     * <p>
     * If you specify <code>ParentHandshakeId</code>, you cannot also specify <code>ActionType</code>.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-" followed by
     * from 8 to 32 lower-case letters or digits.
     * </p>
     */
    private String parentHandshakeId;

    /**
     * <p>
     * Specifies the type of handshake action.
     * </p>
     * <p>
     * If you specify <code>ActionType</code>, you cannot also specify <code>ParentHandshakeId</code>.
     * </p>
     * 
     * @param actionType
     *        Specifies the type of handshake action.</p>
     *        <p>
     *        If you specify <code>ActionType</code>, you cannot also specify <code>ParentHandshakeId</code>.
     * @see ActionType
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * Specifies the type of handshake action.
     * </p>
     * <p>
     * If you specify <code>ActionType</code>, you cannot also specify <code>ParentHandshakeId</code>.
     * </p>
     * 
     * @return Specifies the type of handshake action.</p>
     *         <p>
     *         If you specify <code>ActionType</code>, you cannot also specify <code>ParentHandshakeId</code>.
     * @see ActionType
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * Specifies the type of handshake action.
     * </p>
     * <p>
     * If you specify <code>ActionType</code>, you cannot also specify <code>ParentHandshakeId</code>.
     * </p>
     * 
     * @param actionType
     *        Specifies the type of handshake action.</p>
     *        <p>
     *        If you specify <code>ActionType</code>, you cannot also specify <code>ParentHandshakeId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public HandshakeFilter withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of handshake action.
     * </p>
     * <p>
     * If you specify <code>ActionType</code>, you cannot also specify <code>ParentHandshakeId</code>.
     * </p>
     * 
     * @param actionType
     *        Specifies the type of handshake action.</p>
     *        <p>
     *        If you specify <code>ActionType</code>, you cannot also specify <code>ParentHandshakeId</code>.
     * @see ActionType
     */

    public void setActionType(ActionType actionType) {
        withActionType(actionType);
    }

    /**
     * <p>
     * Specifies the type of handshake action.
     * </p>
     * <p>
     * If you specify <code>ActionType</code>, you cannot also specify <code>ParentHandshakeId</code>.
     * </p>
     * 
     * @param actionType
     *        Specifies the type of handshake action.</p>
     *        <p>
     *        If you specify <code>ActionType</code>, you cannot also specify <code>ParentHandshakeId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionType
     */

    public HandshakeFilter withActionType(ActionType actionType) {
        this.actionType = actionType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the parent handshake. Only used for handshake types that are a child of another type.
     * </p>
     * <p>
     * If you specify <code>ParentHandshakeId</code>, you cannot also specify <code>ActionType</code>.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-" followed by
     * from 8 to 32 lower-case letters or digits.
     * </p>
     * 
     * @param parentHandshakeId
     *        Specifies the parent handshake. Only used for handshake types that are a child of another type.</p>
     *        <p>
     *        If you specify <code>ParentHandshakeId</code>, you cannot also specify <code>ActionType</code>.
     *        </p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-"
     *        followed by from 8 to 32 lower-case letters or digits.
     */

    public void setParentHandshakeId(String parentHandshakeId) {
        this.parentHandshakeId = parentHandshakeId;
    }

    /**
     * <p>
     * Specifies the parent handshake. Only used for handshake types that are a child of another type.
     * </p>
     * <p>
     * If you specify <code>ParentHandshakeId</code>, you cannot also specify <code>ActionType</code>.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-" followed by
     * from 8 to 32 lower-case letters or digits.
     * </p>
     * 
     * @return Specifies the parent handshake. Only used for handshake types that are a child of another type.</p>
     *         <p>
     *         If you specify <code>ParentHandshakeId</code>, you cannot also specify <code>ActionType</code>.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-"
     *         followed by from 8 to 32 lower-case letters or digits.
     */

    public String getParentHandshakeId() {
        return this.parentHandshakeId;
    }

    /**
     * <p>
     * Specifies the parent handshake. Only used for handshake types that are a child of another type.
     * </p>
     * <p>
     * If you specify <code>ParentHandshakeId</code>, you cannot also specify <code>ActionType</code>.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-" followed by
     * from 8 to 32 lower-case letters or digits.
     * </p>
     * 
     * @param parentHandshakeId
     *        Specifies the parent handshake. Only used for handshake types that are a child of another type.</p>
     *        <p>
     *        If you specify <code>ParentHandshakeId</code>, you cannot also specify <code>ActionType</code>.
     *        </p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for handshake ID string requires "h-"
     *        followed by from 8 to 32 lower-case letters or digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HandshakeFilter withParentHandshakeId(String parentHandshakeId) {
        setParentHandshakeId(parentHandshakeId);
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
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getParentHandshakeId() != null)
            sb.append("ParentHandshakeId: ").append(getParentHandshakeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HandshakeFilter == false)
            return false;
        HandshakeFilter other = (HandshakeFilter) obj;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        if (other.getParentHandshakeId() == null ^ this.getParentHandshakeId() == null)
            return false;
        if (other.getParentHandshakeId() != null && other.getParentHandshakeId().equals(this.getParentHandshakeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getParentHandshakeId() == null) ? 0 : getParentHandshakeId().hashCode());
        return hashCode;
    }

    @Override
    public HandshakeFilter clone() {
        try {
            return (HandshakeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.HandshakeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
