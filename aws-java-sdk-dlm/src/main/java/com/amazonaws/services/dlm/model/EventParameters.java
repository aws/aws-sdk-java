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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an event that triggers an event-based policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/EventParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of event. Currently, only snapshot sharing events are supported.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The IDs of the AWS accounts that can trigger policy by sharing snapshots with your account. The policy only runs
     * if one of the specified AWS accounts shares a snapshot with your account.
     * </p>
     */
    private java.util.List<String> snapshotOwner;
    /**
     * <p>
     * The snapshot description that can trigger the policy. The description pattern is specified using a regular
     * expression. The policy runs only if a snapshot with a description that matches the specified pattern is shared
     * with your account.
     * </p>
     * <p>
     * For example, specifying <code>^.*Created for policy: policy-1234567890abcdef0.*$</code> configures the policy to
     * run only if snapshots created by policy <code>policy-1234567890abcdef0</code> are shared with your account.
     * </p>
     */
    private String descriptionRegex;

    /**
     * <p>
     * The type of event. Currently, only snapshot sharing events are supported.
     * </p>
     * 
     * @param eventType
     *        The type of event. Currently, only snapshot sharing events are supported.
     * @see EventTypeValues
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of event. Currently, only snapshot sharing events are supported.
     * </p>
     * 
     * @return The type of event. Currently, only snapshot sharing events are supported.
     * @see EventTypeValues
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of event. Currently, only snapshot sharing events are supported.
     * </p>
     * 
     * @param eventType
     *        The type of event. Currently, only snapshot sharing events are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeValues
     */

    public EventParameters withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The type of event. Currently, only snapshot sharing events are supported.
     * </p>
     * 
     * @param eventType
     *        The type of event. Currently, only snapshot sharing events are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeValues
     */

    public EventParameters withEventType(EventTypeValues eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * The IDs of the AWS accounts that can trigger policy by sharing snapshots with your account. The policy only runs
     * if one of the specified AWS accounts shares a snapshot with your account.
     * </p>
     * 
     * @return The IDs of the AWS accounts that can trigger policy by sharing snapshots with your account. The policy
     *         only runs if one of the specified AWS accounts shares a snapshot with your account.
     */

    public java.util.List<String> getSnapshotOwner() {
        return snapshotOwner;
    }

    /**
     * <p>
     * The IDs of the AWS accounts that can trigger policy by sharing snapshots with your account. The policy only runs
     * if one of the specified AWS accounts shares a snapshot with your account.
     * </p>
     * 
     * @param snapshotOwner
     *        The IDs of the AWS accounts that can trigger policy by sharing snapshots with your account. The policy
     *        only runs if one of the specified AWS accounts shares a snapshot with your account.
     */

    public void setSnapshotOwner(java.util.Collection<String> snapshotOwner) {
        if (snapshotOwner == null) {
            this.snapshotOwner = null;
            return;
        }

        this.snapshotOwner = new java.util.ArrayList<String>(snapshotOwner);
    }

    /**
     * <p>
     * The IDs of the AWS accounts that can trigger policy by sharing snapshots with your account. The policy only runs
     * if one of the specified AWS accounts shares a snapshot with your account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotOwner(java.util.Collection)} or {@link #withSnapshotOwner(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param snapshotOwner
     *        The IDs of the AWS accounts that can trigger policy by sharing snapshots with your account. The policy
     *        only runs if one of the specified AWS accounts shares a snapshot with your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventParameters withSnapshotOwner(String... snapshotOwner) {
        if (this.snapshotOwner == null) {
            setSnapshotOwner(new java.util.ArrayList<String>(snapshotOwner.length));
        }
        for (String ele : snapshotOwner) {
            this.snapshotOwner.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the AWS accounts that can trigger policy by sharing snapshots with your account. The policy only runs
     * if one of the specified AWS accounts shares a snapshot with your account.
     * </p>
     * 
     * @param snapshotOwner
     *        The IDs of the AWS accounts that can trigger policy by sharing snapshots with your account. The policy
     *        only runs if one of the specified AWS accounts shares a snapshot with your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventParameters withSnapshotOwner(java.util.Collection<String> snapshotOwner) {
        setSnapshotOwner(snapshotOwner);
        return this;
    }

    /**
     * <p>
     * The snapshot description that can trigger the policy. The description pattern is specified using a regular
     * expression. The policy runs only if a snapshot with a description that matches the specified pattern is shared
     * with your account.
     * </p>
     * <p>
     * For example, specifying <code>^.*Created for policy: policy-1234567890abcdef0.*$</code> configures the policy to
     * run only if snapshots created by policy <code>policy-1234567890abcdef0</code> are shared with your account.
     * </p>
     * 
     * @param descriptionRegex
     *        The snapshot description that can trigger the policy. The description pattern is specified using a regular
     *        expression. The policy runs only if a snapshot with a description that matches the specified pattern is
     *        shared with your account.</p>
     *        <p>
     *        For example, specifying <code>^.*Created for policy: policy-1234567890abcdef0.*$</code> configures the
     *        policy to run only if snapshots created by policy <code>policy-1234567890abcdef0</code> are shared with
     *        your account.
     */

    public void setDescriptionRegex(String descriptionRegex) {
        this.descriptionRegex = descriptionRegex;
    }

    /**
     * <p>
     * The snapshot description that can trigger the policy. The description pattern is specified using a regular
     * expression. The policy runs only if a snapshot with a description that matches the specified pattern is shared
     * with your account.
     * </p>
     * <p>
     * For example, specifying <code>^.*Created for policy: policy-1234567890abcdef0.*$</code> configures the policy to
     * run only if snapshots created by policy <code>policy-1234567890abcdef0</code> are shared with your account.
     * </p>
     * 
     * @return The snapshot description that can trigger the policy. The description pattern is specified using a
     *         regular expression. The policy runs only if a snapshot with a description that matches the specified
     *         pattern is shared with your account.</p>
     *         <p>
     *         For example, specifying <code>^.*Created for policy: policy-1234567890abcdef0.*$</code> configures the
     *         policy to run only if snapshots created by policy <code>policy-1234567890abcdef0</code> are shared with
     *         your account.
     */

    public String getDescriptionRegex() {
        return this.descriptionRegex;
    }

    /**
     * <p>
     * The snapshot description that can trigger the policy. The description pattern is specified using a regular
     * expression. The policy runs only if a snapshot with a description that matches the specified pattern is shared
     * with your account.
     * </p>
     * <p>
     * For example, specifying <code>^.*Created for policy: policy-1234567890abcdef0.*$</code> configures the policy to
     * run only if snapshots created by policy <code>policy-1234567890abcdef0</code> are shared with your account.
     * </p>
     * 
     * @param descriptionRegex
     *        The snapshot description that can trigger the policy. The description pattern is specified using a regular
     *        expression. The policy runs only if a snapshot with a description that matches the specified pattern is
     *        shared with your account.</p>
     *        <p>
     *        For example, specifying <code>^.*Created for policy: policy-1234567890abcdef0.*$</code> configures the
     *        policy to run only if snapshots created by policy <code>policy-1234567890abcdef0</code> are shared with
     *        your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventParameters withDescriptionRegex(String descriptionRegex) {
        setDescriptionRegex(descriptionRegex);
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
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getSnapshotOwner() != null)
            sb.append("SnapshotOwner: ").append(getSnapshotOwner()).append(",");
        if (getDescriptionRegex() != null)
            sb.append("DescriptionRegex: ").append(getDescriptionRegex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventParameters == false)
            return false;
        EventParameters other = (EventParameters) obj;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getSnapshotOwner() == null ^ this.getSnapshotOwner() == null)
            return false;
        if (other.getSnapshotOwner() != null && other.getSnapshotOwner().equals(this.getSnapshotOwner()) == false)
            return false;
        if (other.getDescriptionRegex() == null ^ this.getDescriptionRegex() == null)
            return false;
        if (other.getDescriptionRegex() != null && other.getDescriptionRegex().equals(this.getDescriptionRegex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getSnapshotOwner() == null) ? 0 : getSnapshotOwner().hashCode());
        hashCode = prime * hashCode + ((getDescriptionRegex() == null) ? 0 : getDescriptionRegex().hashCode());
        return hashCode;
    }

    @Override
    public EventParameters clone() {
        try {
            return (EventParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.EventParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
