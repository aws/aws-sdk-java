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
 * Describes a core network change event. This can be a change to a segment, attachment, route, etc.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/CoreNetworkChangeEvent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkChangeEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the type of change event.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The action taken for the change event.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Uniquely identifies the path for a change within the changeset. For example, the <code>IdentifierPath</code> for
     * a core network segment change might be <code>"CORE_NETWORK_SEGMENT/us-east-1/devsegment"</code>.
     * </p>
     */
    private String identifierPath;
    /**
     * <p>
     * The timestamp for an event change in status.
     * </p>
     */
    private java.util.Date eventTime;
    /**
     * <p>
     * The status of the core network change event.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Details of the change event.
     * </p>
     */
    private CoreNetworkChangeEventValues values;

    /**
     * <p>
     * Describes the type of change event.
     * </p>
     * 
     * @param type
     *        Describes the type of change event.
     * @see ChangeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Describes the type of change event.
     * </p>
     * 
     * @return Describes the type of change event.
     * @see ChangeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Describes the type of change event.
     * </p>
     * 
     * @param type
     *        Describes the type of change event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public CoreNetworkChangeEvent withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Describes the type of change event.
     * </p>
     * 
     * @param type
     *        Describes the type of change event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public CoreNetworkChangeEvent withType(ChangeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The action taken for the change event.
     * </p>
     * 
     * @param action
     *        The action taken for the change event.
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action taken for the change event.
     * </p>
     * 
     * @return The action taken for the change event.
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action taken for the change event.
     * </p>
     * 
     * @param action
     *        The action taken for the change event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public CoreNetworkChangeEvent withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action taken for the change event.
     * </p>
     * 
     * @param action
     *        The action taken for the change event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeAction
     */

    public CoreNetworkChangeEvent withAction(ChangeAction action) {
        this.action = action.toString();
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

    public CoreNetworkChangeEvent withIdentifierPath(String identifierPath) {
        setIdentifierPath(identifierPath);
        return this;
    }

    /**
     * <p>
     * The timestamp for an event change in status.
     * </p>
     * 
     * @param eventTime
     *        The timestamp for an event change in status.
     */

    public void setEventTime(java.util.Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * <p>
     * The timestamp for an event change in status.
     * </p>
     * 
     * @return The timestamp for an event change in status.
     */

    public java.util.Date getEventTime() {
        return this.eventTime;
    }

    /**
     * <p>
     * The timestamp for an event change in status.
     * </p>
     * 
     * @param eventTime
     *        The timestamp for an event change in status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeEvent withEventTime(java.util.Date eventTime) {
        setEventTime(eventTime);
        return this;
    }

    /**
     * <p>
     * The status of the core network change event.
     * </p>
     * 
     * @param status
     *        The status of the core network change event.
     * @see ChangeStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the core network change event.
     * </p>
     * 
     * @return The status of the core network change event.
     * @see ChangeStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the core network change event.
     * </p>
     * 
     * @param status
     *        The status of the core network change event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeStatus
     */

    public CoreNetworkChangeEvent withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the core network change event.
     * </p>
     * 
     * @param status
     *        The status of the core network change event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeStatus
     */

    public CoreNetworkChangeEvent withStatus(ChangeStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Details of the change event.
     * </p>
     * 
     * @param values
     *        Details of the change event.
     */

    public void setValues(CoreNetworkChangeEventValues values) {
        this.values = values;
    }

    /**
     * <p>
     * Details of the change event.
     * </p>
     * 
     * @return Details of the change event.
     */

    public CoreNetworkChangeEventValues getValues() {
        return this.values;
    }

    /**
     * <p>
     * Details of the change event.
     * </p>
     * 
     * @param values
     *        Details of the change event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoreNetworkChangeEvent withValues(CoreNetworkChangeEventValues values) {
        setValues(values);
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
        if (getIdentifierPath() != null)
            sb.append("IdentifierPath: ").append(getIdentifierPath()).append(",");
        if (getEventTime() != null)
            sb.append("EventTime: ").append(getEventTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoreNetworkChangeEvent == false)
            return false;
        CoreNetworkChangeEvent other = (CoreNetworkChangeEvent) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getIdentifierPath() == null ^ this.getIdentifierPath() == null)
            return false;
        if (other.getIdentifierPath() != null && other.getIdentifierPath().equals(this.getIdentifierPath()) == false)
            return false;
        if (other.getEventTime() == null ^ this.getEventTime() == null)
            return false;
        if (other.getEventTime() != null && other.getEventTime().equals(this.getEventTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getIdentifierPath() == null) ? 0 : getIdentifierPath().hashCode());
        hashCode = prime * hashCode + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public CoreNetworkChangeEvent clone() {
        try {
            return (CoreNetworkChangeEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.CoreNetworkChangeEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
