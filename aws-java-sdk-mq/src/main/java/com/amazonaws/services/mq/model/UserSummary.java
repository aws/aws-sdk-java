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
 * Returns a list of all ActiveMQ users.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UserSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserSummary implements Serializable, Cloneable, StructuredPojo {

    /** The type of change pending for the ActiveMQ user. */
    private String pendingChange;
    /**
     * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes,
     * periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     */
    private String username;

    /**
     * The type of change pending for the ActiveMQ user.
     * 
     * @param pendingChange
     *        The type of change pending for the ActiveMQ user.
     * @see ChangeType
     */

    public void setPendingChange(String pendingChange) {
        this.pendingChange = pendingChange;
    }

    /**
     * The type of change pending for the ActiveMQ user.
     * 
     * @return The type of change pending for the ActiveMQ user.
     * @see ChangeType
     */

    public String getPendingChange() {
        return this.pendingChange;
    }

    /**
     * The type of change pending for the ActiveMQ user.
     * 
     * @param pendingChange
     *        The type of change pending for the ActiveMQ user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public UserSummary withPendingChange(String pendingChange) {
        setPendingChange(pendingChange);
        return this;
    }

    /**
     * The type of change pending for the ActiveMQ user.
     * 
     * @param pendingChange
     *        The type of change pending for the ActiveMQ user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public UserSummary withPendingChange(ChangeType pendingChange) {
        this.pendingChange = pendingChange.toString();
        return this;
    }

    /**
     * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes,
     * periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @param username
     *        Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes,
     *        periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes,
     * periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @return Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes,
     *         periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes,
     * periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * 
     * @param username
     *        Required. The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes,
     *        periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserSummary withUsername(String username) {
        setUsername(username);
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
        if (getPendingChange() != null)
            sb.append("PendingChange: ").append(getPendingChange()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserSummary == false)
            return false;
        UserSummary other = (UserSummary) obj;
        if (other.getPendingChange() == null ^ this.getPendingChange() == null)
            return false;
        if (other.getPendingChange() != null && other.getPendingChange().equals(this.getPendingChange()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPendingChange() == null) ? 0 : getPendingChange().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public UserSummary clone() {
        try {
            return (UserSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.UserSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
