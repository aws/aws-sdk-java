/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;

/**
 * <p/>
 */
public class ModifyReplicationInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The modified replication instance.
     * </p>
     */
    private ReplicationInstance replicationInstance;

    /**
     * <p>
     * The modified replication instance.
     * </p>
     * 
     * @param replicationInstance
     *        The modified replication instance.
     */

    public void setReplicationInstance(ReplicationInstance replicationInstance) {
        this.replicationInstance = replicationInstance;
    }

    /**
     * <p>
     * The modified replication instance.
     * </p>
     * 
     * @return The modified replication instance.
     */

    public ReplicationInstance getReplicationInstance() {
        return this.replicationInstance;
    }

    /**
     * <p>
     * The modified replication instance.
     * </p>
     * 
     * @param replicationInstance
     *        The modified replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyReplicationInstanceResult withReplicationInstance(ReplicationInstance replicationInstance) {
        setReplicationInstance(replicationInstance);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReplicationInstance() != null)
            sb.append("ReplicationInstance: " + getReplicationInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyReplicationInstanceResult == false)
            return false;
        ModifyReplicationInstanceResult other = (ModifyReplicationInstanceResult) obj;
        if (other.getReplicationInstance() == null ^ this.getReplicationInstance() == null)
            return false;
        if (other.getReplicationInstance() != null && other.getReplicationInstance().equals(this.getReplicationInstance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationInstance() == null) ? 0 : getReplicationInstance().hashCode());
        return hashCode;
    }

    @Override
    public ModifyReplicationInstanceResult clone() {
        try {
            return (ModifyReplicationInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
