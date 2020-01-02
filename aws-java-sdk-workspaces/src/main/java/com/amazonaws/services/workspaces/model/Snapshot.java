/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/Snapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Snapshot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the snapshot was created.
     * </p>
     */
    private java.util.Date snapshotTime;

    /**
     * <p>
     * The time when the snapshot was created.
     * </p>
     * 
     * @param snapshotTime
     *        The time when the snapshot was created.
     */

    public void setSnapshotTime(java.util.Date snapshotTime) {
        this.snapshotTime = snapshotTime;
    }

    /**
     * <p>
     * The time when the snapshot was created.
     * </p>
     * 
     * @return The time when the snapshot was created.
     */

    public java.util.Date getSnapshotTime() {
        return this.snapshotTime;
    }

    /**
     * <p>
     * The time when the snapshot was created.
     * </p>
     * 
     * @param snapshotTime
     *        The time when the snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotTime(java.util.Date snapshotTime) {
        setSnapshotTime(snapshotTime);
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
        if (getSnapshotTime() != null)
            sb.append("SnapshotTime: ").append(getSnapshotTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Snapshot == false)
            return false;
        Snapshot other = (Snapshot) obj;
        if (other.getSnapshotTime() == null ^ this.getSnapshotTime() == null)
            return false;
        if (other.getSnapshotTime() != null && other.getSnapshotTime().equals(this.getSnapshotTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotTime() == null) ? 0 : getSnapshotTime().hashCode());
        return hashCode;
    }

    @Override
    public Snapshot clone() {
        try {
            return (Snapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.SnapshotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
