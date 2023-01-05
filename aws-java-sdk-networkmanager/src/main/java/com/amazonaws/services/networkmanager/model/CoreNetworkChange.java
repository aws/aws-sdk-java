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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details describing a core network change.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CoreNetworkChange" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkChange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of change.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The action to take for a core network.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The resource identifier.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The previous values for a core network.
     * </p>
     */
    private CoreNetworkChangeValues previousValues;
    /**
     * <p>
     * The new value for a core network
     * </p>
     */
    private CoreNetworkChangeValues newValues;
    /**
     * <p>
     * Uniquely identifies the path for a change within the changeset. For example, the <code>IdentifierPath</code> for
     * a core network segment change might be <code>"CORE_NETWORK_SEGMENT/us-east-1/devsegment"</code>.
     * </p>
     */
    private String identifierPath;

    /**
     * <p>
     * The type of change.
     * </p>
     * 
     * @param type
     *        The type of change.
     * @see ChangeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of change.
     * </p>
     * 
     * @return The type of change.
     * @see ChangeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of change.
     * </p>
     * 
     * @param type
     *        The type of change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public CoreNetworkChange withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of change.
     * </p>
     * 
     * @param type
     *        The type of change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public CoreNetworkChange withType(ChangeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The action to take for a core network.
     * </p>
     * 
     * @param action
     *        The action to take for a core network.
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to take for a core network.
     * </p>
     * 
     * @return The action to take for a core network.
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action to take for a core network.
     * </p>
     * 
     * @param action
     *        The action to take for a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public CoreNetworkChange withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action to take for a core network.
     * </p>
     * 
     * @param action
     *        The action to take for a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public CoreNetworkChange withAction(ChangeAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The resource identifier.
     * </p>
     * 
     * @param identifier
     *        The resource identifier.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The resource identifier.
     * </p>
     * 
     * @return The resource identifier.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The resource identifier.
     * </p>
     * 
     * @param identifier
     *        The resource identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChange withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The previous values for a core network.
     * </p>
     * 
     * @param previousValues
     *        The previous values for a core network.
     */

    public void setPreviousValues(CoreNetworkChangeValues previousValues) {
        this.previousValues = previousValues;
    }

    /**
     * <p>
     * The previous values for a core network.
     * </p>
     * 
     * @return The previous values for a core network.
     */

    public CoreNetworkChangeValues getPreviousValues() {
        return this.previousValues;
    }

    /**
     * <p>
     * The previous values for a core network.
     * </p>
     * 
     * @param previousValues
     *        The previous values for a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChange withPreviousValues(CoreNetworkChangeValues previousValues) {
        setPreviousValues(previousValues);
        return this;
    }

    /**
     * <p>
     * The new value for a core network
     * </p>
     * 
     * @param newValues
     *        The new value for a core network
     */

    public void setNewValues(CoreNetworkChangeValues newValues) {
        this.newValues = newValues;
    }

    /**
     * <p>
     * The new value for a core network
     * </p>
     * 
     * @return The new value for a core network
     */

    public CoreNetworkChangeValues getNewValues() {
        return this.newValues;
    }

    /**
     * <p>
     * The new value for a core network
     * </p>
     * 
     * @param newValues
     *        The new value for a core network
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChange withNewValues(CoreNetworkChangeValues newValues) {
        setNewValues(newValues);
        return this;
    }

    /**
     * <p>
     * Uniquely identifies the path for a change within the changeset. For example, the <code>IdentifierPath</code> for
     * a core network segment change might be <code>"CORE_NETWORK_SEGMENT/us-east-1/devsegment"</code>.
     * </p>
     * 
     * @param identifierPath
     *        Uniquely identifies the path for a change within the changeset. For example, the
     *        <code>IdentifierPath</code> for a core network segment change might be
     *        <code>"CORE_NETWORK_SEGMENT/us-east-1/devsegment"</code>.
     */

    public void setIdentifierPath(String identifierPath) {
        this.identifierPath = identifierPath;
    }

    /**
     * <p>
     * Uniquely identifies the path for a change within the changeset. For example, the <code>IdentifierPath</code> for
     * a core network segment change might be <code>"CORE_NETWORK_SEGMENT/us-east-1/devsegment"</code>.
     * </p>
     * 
     * @return Uniquely identifies the path for a change within the changeset. For example, the
     *         <code>IdentifierPath</code> for a core network segment change might be
     *         <code>"CORE_NETWORK_SEGMENT/us-east-1/devsegment"</code>.
     */

    public String getIdentifierPath() {
        return this.identifierPath;
    }

    /**
     * <p>
     * Uniquely identifies the path for a change within the changeset. For example, the <code>IdentifierPath</code> for
     * a core network segment change might be <code>"CORE_NETWORK_SEGMENT/us-east-1/devsegment"</code>.
     * </p>
     * 
     * @param identifierPath
     *        Uniquely identifies the path for a change within the changeset. For example, the
     *        <code>IdentifierPath</code> for a core network segment change might be
     *        <code>"CORE_NETWORK_SEGMENT/us-east-1/devsegment"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChange withIdentifierPath(String identifierPath) {
        setIdentifierPath(identifierPath);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getPreviousValues() != null)
            sb.append("PreviousValues: ").append(getPreviousValues()).append(",");
        if (getNewValues() != null)
            sb.append("NewValues: ").append(getNewValues()).append(",");
        if (getIdentifierPath() != null)
            sb.append("IdentifierPath: ").append(getIdentifierPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoreNetworkChange == false)
            return false;
        CoreNetworkChange other = (CoreNetworkChange) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getPreviousValues() == null ^ this.getPreviousValues() == null)
            return false;
        if (other.getPreviousValues() != null && other.getPreviousValues().equals(this.getPreviousValues()) == false)
            return false;
        if (other.getNewValues() == null ^ this.getNewValues() == null)
            return false;
        if (other.getNewValues() != null && other.getNewValues().equals(this.getNewValues()) == false)
            return false;
        if (other.getIdentifierPath() == null ^ this.getIdentifierPath() == null)
            return false;
        if (other.getIdentifierPath() != null && other.getIdentifierPath().equals(this.getIdentifierPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getPreviousValues() == null) ? 0 : getPreviousValues().hashCode());
        hashCode = prime * hashCode + ((getNewValues() == null) ? 0 : getNewValues().hashCode());
        hashCode = prime * hashCode + ((getIdentifierPath() == null) ? 0 : getIdentifierPath().hashCode());
        return hashCode;
    }

    @Override
    public CoreNetworkChange clone() {
        try {
            return (CoreNetworkChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.CoreNetworkChangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
