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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Returns information about the status of the changes pending for the ActiveMQ user.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UserPendingChanges" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserPendingChanges implements Serializable, Cloneable, StructuredPojo {

    /** Enables access to the the ActiveMQ Web Console for the ActiveMQ user. */
    private Boolean consoleAccess;
    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     */
    private java.util.List<String> groups;
    /** Required. The type of change pending for the ActiveMQ user. */
    private String pendingChange;

    /**
     * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * 
     * @param consoleAccess
     *        Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     */

    public void setConsoleAccess(Boolean consoleAccess) {
        this.consoleAccess = consoleAccess;
    }

    /**
     * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * 
     * @return Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     */

    public Boolean getConsoleAccess() {
        return this.consoleAccess;
    }

    /**
     * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * 
     * @param consoleAccess
     *        Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPendingChanges withConsoleAccess(Boolean consoleAccess) {
        setConsoleAccess(consoleAccess);
        return this;
    }

    /**
     * Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     * 
     * @return Enables access to the the ActiveMQ Web Console for the ActiveMQ user.
     */

    public Boolean isConsoleAccess() {
        return this.consoleAccess;
    }

    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @return The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *         alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *         characters long.
     */

    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @param groups
     *        The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *        alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *        characters long.
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<String>(groups);
    }

    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *        alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *        characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPendingChanges withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<String>(groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric
     * characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @param groups
     *        The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only
     *        alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100
     *        characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPendingChanges withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * Required. The type of change pending for the ActiveMQ user.
     * 
     * @param pendingChange
     *        Required. The type of change pending for the ActiveMQ user.
     * @see ChangeType
     */

    public void setPendingChange(String pendingChange) {
        this.pendingChange = pendingChange;
    }

    /**
     * Required. The type of change pending for the ActiveMQ user.
     * 
     * @return Required. The type of change pending for the ActiveMQ user.
     * @see ChangeType
     */

    public String getPendingChange() {
        return this.pendingChange;
    }

    /**
     * Required. The type of change pending for the ActiveMQ user.
     * 
     * @param pendingChange
     *        Required. The type of change pending for the ActiveMQ user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public UserPendingChanges withPendingChange(String pendingChange) {
        setPendingChange(pendingChange);
        return this;
    }

    /**
     * Required. The type of change pending for the ActiveMQ user.
     * 
     * @param pendingChange
     *        Required. The type of change pending for the ActiveMQ user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public UserPendingChanges withPendingChange(ChangeType pendingChange) {
        this.pendingChange = pendingChange.toString();
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
        if (getConsoleAccess() != null)
            sb.append("ConsoleAccess: ").append(getConsoleAccess()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getPendingChange() != null)
            sb.append("PendingChange: ").append(getPendingChange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPendingChanges == false)
            return false;
        UserPendingChanges other = (UserPendingChanges) obj;
        if (other.getConsoleAccess() == null ^ this.getConsoleAccess() == null)
            return false;
        if (other.getConsoleAccess() != null && other.getConsoleAccess().equals(this.getConsoleAccess()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getPendingChange() == null ^ this.getPendingChange() == null)
            return false;
        if (other.getPendingChange() != null && other.getPendingChange().equals(this.getPendingChange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsoleAccess() == null) ? 0 : getConsoleAccess().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getPendingChange() == null) ? 0 : getPendingChange().hashCode());
        return hashCode;
    }

    @Override
    public UserPendingChanges clone() {
        try {
            return (UserPendingChanges) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.UserPendingChangesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
