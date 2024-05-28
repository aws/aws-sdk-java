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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that provides information on the result of a snapshot job. This object provides information about the job,
 * the job status, and the location of the generated file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SnapshotJobResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotJobResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <code>AnonymousUserSnapshotJobResult</code> objects that contain information on anonymous users and
     * their user configurations. This data provided by you when you make a <code>StartDashboardSnapshotJob</code> API
     * call.
     * </p>
     */
    private java.util.List<AnonymousUserSnapshotJobResult> anonymousUsers;

    /**
     * <p>
     * A list of <code>AnonymousUserSnapshotJobResult</code> objects that contain information on anonymous users and
     * their user configurations. This data provided by you when you make a <code>StartDashboardSnapshotJob</code> API
     * call.
     * </p>
     * 
     * @return A list of <code>AnonymousUserSnapshotJobResult</code> objects that contain information on anonymous users
     *         and their user configurations. This data provided by you when you make a
     *         <code>StartDashboardSnapshotJob</code> API call.
     */

    public java.util.List<AnonymousUserSnapshotJobResult> getAnonymousUsers() {
        return anonymousUsers;
    }

    /**
     * <p>
     * A list of <code>AnonymousUserSnapshotJobResult</code> objects that contain information on anonymous users and
     * their user configurations. This data provided by you when you make a <code>StartDashboardSnapshotJob</code> API
     * call.
     * </p>
     * 
     * @param anonymousUsers
     *        A list of <code>AnonymousUserSnapshotJobResult</code> objects that contain information on anonymous users
     *        and their user configurations. This data provided by you when you make a
     *        <code>StartDashboardSnapshotJob</code> API call.
     */

    public void setAnonymousUsers(java.util.Collection<AnonymousUserSnapshotJobResult> anonymousUsers) {
        if (anonymousUsers == null) {
            this.anonymousUsers = null;
            return;
        }

        this.anonymousUsers = new java.util.ArrayList<AnonymousUserSnapshotJobResult>(anonymousUsers);
    }

    /**
     * <p>
     * A list of <code>AnonymousUserSnapshotJobResult</code> objects that contain information on anonymous users and
     * their user configurations. This data provided by you when you make a <code>StartDashboardSnapshotJob</code> API
     * call.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnonymousUsers(java.util.Collection)} or {@link #withAnonymousUsers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param anonymousUsers
     *        A list of <code>AnonymousUserSnapshotJobResult</code> objects that contain information on anonymous users
     *        and their user configurations. This data provided by you when you make a
     *        <code>StartDashboardSnapshotJob</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotJobResult withAnonymousUsers(AnonymousUserSnapshotJobResult... anonymousUsers) {
        if (this.anonymousUsers == null) {
            setAnonymousUsers(new java.util.ArrayList<AnonymousUserSnapshotJobResult>(anonymousUsers.length));
        }
        for (AnonymousUserSnapshotJobResult ele : anonymousUsers) {
            this.anonymousUsers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>AnonymousUserSnapshotJobResult</code> objects that contain information on anonymous users and
     * their user configurations. This data provided by you when you make a <code>StartDashboardSnapshotJob</code> API
     * call.
     * </p>
     * 
     * @param anonymousUsers
     *        A list of <code>AnonymousUserSnapshotJobResult</code> objects that contain information on anonymous users
     *        and their user configurations. This data provided by you when you make a
     *        <code>StartDashboardSnapshotJob</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotJobResult withAnonymousUsers(java.util.Collection<AnonymousUserSnapshotJobResult> anonymousUsers) {
        setAnonymousUsers(anonymousUsers);
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
        if (getAnonymousUsers() != null)
            sb.append("AnonymousUsers: ").append(getAnonymousUsers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotJobResult == false)
            return false;
        SnapshotJobResult other = (SnapshotJobResult) obj;
        if (other.getAnonymousUsers() == null ^ this.getAnonymousUsers() == null)
            return false;
        if (other.getAnonymousUsers() != null && other.getAnonymousUsers().equals(this.getAnonymousUsers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnonymousUsers() == null) ? 0 : getAnonymousUsers().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotJobResult clone() {
        try {
            return (SnapshotJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SnapshotJobResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
