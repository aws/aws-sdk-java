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
 * Describes the data repository association's automatic import policy. The AutoImportPolicy defines how Amazon FSx
 * keeps your file metadata and directory listings up to date by importing changes to your Amazon FSx for Lustre file
 * system as you modify objects in a linked S3 bucket.
 * </p>
 * <p>
 * The <code>AutoImportPolicy</code> is supported only for Amazon FSx for Lustre file systems with the
 * <code>Persistent_2</code> deployment type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/AutoImportPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoImportPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>AutoImportPolicy</code> can have the following event values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - Amazon FSx automatically imports metadata of files added to the linked S3 bucket that do not
     * currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHANGED</code> - Amazon FSx automatically updates file metadata and invalidates existing file content on
     * the file system as files change in the data repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Amazon FSx automatically deletes files on the file system as corresponding files are
     * deleted in the data repository.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define any combination of event types for your <code>AutoImportPolicy</code>.
     * </p>
     */
    private java.util.List<String> events;

    /**
     * <p>
     * The <code>AutoImportPolicy</code> can have the following event values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - Amazon FSx automatically imports metadata of files added to the linked S3 bucket that do not
     * currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHANGED</code> - Amazon FSx automatically updates file metadata and invalidates existing file content on
     * the file system as files change in the data repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Amazon FSx automatically deletes files on the file system as corresponding files are
     * deleted in the data repository.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define any combination of event types for your <code>AutoImportPolicy</code>.
     * </p>
     * 
     * @return The <code>AutoImportPolicy</code> can have the following event values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NEW</code> - Amazon FSx automatically imports metadata of files added to the linked S3 bucket that
     *         do not currently exist in the FSx file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CHANGED</code> - Amazon FSx automatically updates file metadata and invalidates existing file
     *         content on the file system as files change in the data repository.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code> - Amazon FSx automatically deletes files on the file system as corresponding files
     *         are deleted in the data repository.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can define any combination of event types for your <code>AutoImportPolicy</code>.
     * @see EventType
     */

    public java.util.List<String> getEvents() {
        return events;
    }

    /**
     * <p>
     * The <code>AutoImportPolicy</code> can have the following event values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - Amazon FSx automatically imports metadata of files added to the linked S3 bucket that do not
     * currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHANGED</code> - Amazon FSx automatically updates file metadata and invalidates existing file content on
     * the file system as files change in the data repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Amazon FSx automatically deletes files on the file system as corresponding files are
     * deleted in the data repository.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define any combination of event types for your <code>AutoImportPolicy</code>.
     * </p>
     * 
     * @param events
     *        The <code>AutoImportPolicy</code> can have the following event values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code> - Amazon FSx automatically imports metadata of files added to the linked S3 bucket that
     *        do not currently exist in the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CHANGED</code> - Amazon FSx automatically updates file metadata and invalidates existing file
     *        content on the file system as files change in the data repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - Amazon FSx automatically deletes files on the file system as corresponding files
     *        are deleted in the data repository.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can define any combination of event types for your <code>AutoImportPolicy</code>.
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
     * The <code>AutoImportPolicy</code> can have the following event values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - Amazon FSx automatically imports metadata of files added to the linked S3 bucket that do not
     * currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHANGED</code> - Amazon FSx automatically updates file metadata and invalidates existing file content on
     * the file system as files change in the data repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Amazon FSx automatically deletes files on the file system as corresponding files are
     * deleted in the data repository.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define any combination of event types for your <code>AutoImportPolicy</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        The <code>AutoImportPolicy</code> can have the following event values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code> - Amazon FSx automatically imports metadata of files added to the linked S3 bucket that
     *        do not currently exist in the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CHANGED</code> - Amazon FSx automatically updates file metadata and invalidates existing file
     *        content on the file system as files change in the data repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - Amazon FSx automatically deletes files on the file system as corresponding files
     *        are deleted in the data repository.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can define any combination of event types for your <code>AutoImportPolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public AutoImportPolicy withEvents(String... events) {
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
     * The <code>AutoImportPolicy</code> can have the following event values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - Amazon FSx automatically imports metadata of files added to the linked S3 bucket that do not
     * currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHANGED</code> - Amazon FSx automatically updates file metadata and invalidates existing file content on
     * the file system as files change in the data repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Amazon FSx automatically deletes files on the file system as corresponding files are
     * deleted in the data repository.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define any combination of event types for your <code>AutoImportPolicy</code>.
     * </p>
     * 
     * @param events
     *        The <code>AutoImportPolicy</code> can have the following event values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code> - Amazon FSx automatically imports metadata of files added to the linked S3 bucket that
     *        do not currently exist in the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CHANGED</code> - Amazon FSx automatically updates file metadata and invalidates existing file
     *        content on the file system as files change in the data repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - Amazon FSx automatically deletes files on the file system as corresponding files
     *        are deleted in the data repository.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can define any combination of event types for your <code>AutoImportPolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public AutoImportPolicy withEvents(java.util.Collection<String> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The <code>AutoImportPolicy</code> can have the following event values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code> - Amazon FSx automatically imports metadata of files added to the linked S3 bucket that do not
     * currently exist in the FSx file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CHANGED</code> - Amazon FSx automatically updates file metadata and invalidates existing file content on
     * the file system as files change in the data repository.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> - Amazon FSx automatically deletes files on the file system as corresponding files are
     * deleted in the data repository.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can define any combination of event types for your <code>AutoImportPolicy</code>.
     * </p>
     * 
     * @param events
     *        The <code>AutoImportPolicy</code> can have the following event values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code> - Amazon FSx automatically imports metadata of files added to the linked S3 bucket that
     *        do not currently exist in the FSx file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CHANGED</code> - Amazon FSx automatically updates file metadata and invalidates existing file
     *        content on the file system as files change in the data repository.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> - Amazon FSx automatically deletes files on the file system as corresponding files
     *        are deleted in the data repository.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can define any combination of event types for your <code>AutoImportPolicy</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public AutoImportPolicy withEvents(EventType... events) {
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

        if (obj instanceof AutoImportPolicy == false)
            return false;
        AutoImportPolicy other = (AutoImportPolicy) obj;
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
    public AutoImportPolicy clone() {
        try {
            return (AutoImportPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.AutoImportPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
