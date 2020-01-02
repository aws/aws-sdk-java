/*
 * Copyright 2012-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * A container that specifies information about existing object replication.
 * You can choose whether to enable or disable the replication of existing objects.
 */
public class ExistingObjectReplication implements Serializable, Cloneable {

    private String status;

    /**
     * @return Existing objects are not replicated if status is Disabled.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the replication status for existing objects. Existing objects are not replicated if status is Disabled.
     *
     * @param status New replication status.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Sets the replication status for existing objects. Existing objects are not replicated if status is Disabled.
     *
     * @param status New replication status.
     * @return This object for method chaining.
     */
    public ExistingObjectReplication withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * Sets the replication status for existing objects. Existing objects are not replicated if status is Disabled.
     *
     * @param status New replication status.
     * @return This object for method chaining.
     */
    public ExistingObjectReplication withStatus(ExistingObjectReplicationStatus status) {
        setStatus(status == null ? null : status.toString());
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatus() != null) {
            sb.append("Status: ").append(getStatus()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj instanceof ExistingObjectReplication == false) {
            return false;
        }
        ExistingObjectReplication other = (ExistingObjectReplication) obj;
        if (other.getStatus() == null ^ this.getStatus() == null) {
            return false;
        }
        if (other.getStatus() != null &&
            other.getStatus().equals(this.getStatus()) == false) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ExistingObjectReplication clone() {
        try {
            return (ExistingObjectReplication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
