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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a data repository association's automatic export policy. The <code>AutoExportPolicy</code> defines the
 * types of updated objects on the file system that will be automatically exported to the data repository. As you
 * create, modify, or delete files, Amazon FSx for Lustre automatically exports the defined changes asynchronously once
 * your application finishes modifying the file.
 * </p>
 * <p>
 * This <code>AutoExportPolicy</code> is supported only for Amazon FSx for Lustre file systems with the
 * <code>Persistent_2</code> deployment type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/AutoExportPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoExportPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>AutoExportPolicy</code> can have the following event values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - New files and directories are automatically exported to the data repository as they are added
     * to the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHANGED</code> - Changes to files and directories on the file system are automatically exported to the data
     * repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Files and directories are automatically deleted on the data repository when they are
     * deleted on the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define any combination of event types for your <code>AutoExportPolicy</code>.
     * </p>
     */
    private java.util.List<String> events;

    /**
     * <p>
     * The <code>AutoExportPolicy</code> can have the following event values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - New files and directories are automatically exported to the data repository as they are added
     * to the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHANGED</code> - Changes to files and directories on the file system are automatically exported to the data
     * repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Files and directories are automatically deleted on the data repository when they are
     * deleted on the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define any combination of event types for your <code>AutoExportPolicy</code>.
     * </p>
     * 
     * @return The <code>AutoExportPolicy</code> can have the following event values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NEW</code> - New files and directories are automatically exported to the data repository as they
     *         are added to the file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CHANGED</code> - Changes to files and directories on the file system are automatically exported to
     *         the data repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code> - Files and directories are automatically deleted on the data repository when they
     *         are deleted on the file system.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can define any combination of event types for your <code>AutoExportPolicy</code>.
     * @see EventType
     */

    public java.util.List<String> getEvents() {
        return events;
    }

    /**
     * <p>
     * The <code>AutoExportPolicy</code> can have the following event values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - New files and directories are automatically exported to the data repository as they are added
     * to the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHANGED</code> - Changes to files and directories on the file system are automatically exported to the data
     * repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Files and directories are automatically deleted on the data repository when they are
     * deleted on the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define any combination of event types for your <code>AutoExportPolicy</code>.
     * </p>
     * 
     * @param events
     *        The <code>AutoExportPolicy</code> can have the following event values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code> - New files and directories are automatically exported to the data repository as they are
     *        added to the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CHANGED</code> - Changes to files and directories on the file system are automatically exported to
     *        the data repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - Files and directories are automatically deleted on the data repository when they
     *        are deleted on the file system.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can define any combination of event types for your <code>AutoExportPolicy</code>.
     * @see EventType
     */

    public void setEvents(java.util.Collection<String> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<String>(events);
    }

    /**
     * <p>
     * The <code>AutoExportPolicy</code> can have the following event values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - New files and directories are automatically exported to the data repository as they are added
     * to the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHANGED</code> - Changes to files and directories on the file system are automatically exported to the data
     * repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Files and directories are automatically deleted on the data repository when they are
     * deleted on the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define any combination of event types for your <code>AutoExportPolicy</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        The <code>AutoExportPolicy</code> can have the following event values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code> - New files and directories are automatically exported to the data repository as they are
     *        added to the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CHANGED</code> - Changes to files and directories on the file system are automatically exported to
     *        the data repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - Files and directories are automatically deleted on the data repository when they
     *        are deleted on the file system.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can define any combination of event types for your <code>AutoExportPolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public AutoExportPolicy withEvents(String... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<String>(events.length));
        }
        for (String ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>AutoExportPolicy</code> can have the following event values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - New files and directories are automatically exported to the data repository as they are added
     * to the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHANGED</code> - Changes to files and directories on the file system are automatically exported to the data
     * repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Files and directories are automatically deleted on the data repository when they are
     * deleted on the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define any combination of event types for your <code>AutoExportPolicy</code>.
     * </p>
     * 
     * @param events
     *        The <code>AutoExportPolicy</code> can have the following event values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code> - New files and directories are automatically exported to the data repository as they are
     *        added to the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CHANGED</code> - Changes to files and directories on the file system are automatically exported to
     *        the data repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - Files and directories are automatically deleted on the data repository when they
     *        are deleted on the file system.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can define any combination of event types for your <code>AutoExportPolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public AutoExportPolicy withEvents(java.util.Collection<String> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The <code>AutoExportPolicy</code> can have the following event values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - New files and directories are automatically exported to the data repository as they are added
     * to the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHANGED</code> - Changes to files and directories on the file system are automatically exported to the data
     * repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Files and directories are automatically deleted on the data repository when they are
     * deleted on the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define any combination of event types for your <code>AutoExportPolicy</code>.
     * </p>
     * 
     * @param events
     *        The <code>AutoExportPolicy</code> can have the following event values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code> - New files and directories are automatically exported to the data repository as they are
     *        added to the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CHANGED</code> - Changes to files and directories on the file system are automatically exported to
     *        the data repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - Files and directories are automatically deleted on the data repository when they
     *        are deleted on the file system.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can define any combination of event types for your <code>AutoExportPolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public AutoExportPolicy withEvents(EventType... events) {
        java.util.ArrayList<String> eventsCopy = new java.util.ArrayList<String>(events.length);
        for (EventType value : events) {
            eventsCopy.add(value.toString());
        }
        if (getEvents() == null) {
            setEvents(eventsCopy);
        } else {
            getEvents().addAll(eventsCopy);
        }
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
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoExportPolicy == false)
            return false;
        AutoExportPolicy other = (AutoExportPolicy) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public AutoExportPolicy clone() {
        try {
            return (AutoExportPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.AutoExportPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
