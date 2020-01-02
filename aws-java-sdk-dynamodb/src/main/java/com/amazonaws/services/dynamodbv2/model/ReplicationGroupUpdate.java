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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A new replica to be added to an existing regional table or global table. This request invokes the
 * <code>CreateTableReplica</code> action in the destination Region.
 * </p>
 * </li>
 * <li>
 * <p>
 * New parameters for an existing replica. This request invokes the <code>UpdateTable</code> action in the destination
 * Region.
 * </p>
 * </li>
 * <li>
 * <p>
 * An existing replica to be deleted. The request invokes the <code>DeleteTableReplica</code> action in the destination
 * Region, deleting the replica and all if its items in the destination Region.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ReplicationGroupUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationGroupUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parameters required for creating a replica for the table.
     * </p>
     */
    private CreateReplicationGroupMemberAction create;
    /**
     * <p>
     * The parameters required for updating a replica for the table.
     * </p>
     */
    private UpdateReplicationGroupMemberAction update;
    /**
     * <p>
     * The parameters required for deleting a replica for the table.
     * </p>
     */
    private DeleteReplicationGroupMemberAction delete;

    /**
     * <p>
     * The parameters required for creating a replica for the table.
     * </p>
     * 
     * @param create
     *        The parameters required for creating a replica for the table.
     */

    public void setCreate(CreateReplicationGroupMemberAction create) {
        this.create = create;
    }

    /**
     * <p>
     * The parameters required for creating a replica for the table.
     * </p>
     * 
     * @return The parameters required for creating a replica for the table.
     */

    public CreateReplicationGroupMemberAction getCreate() {
        return this.create;
    }

    /**
     * <p>
     * The parameters required for creating a replica for the table.
     * </p>
     * 
     * @param create
     *        The parameters required for creating a replica for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroupUpdate withCreate(CreateReplicationGroupMemberAction create) {
        setCreate(create);
        return this;
    }

    /**
     * <p>
     * The parameters required for updating a replica for the table.
     * </p>
     * 
     * @param update
     *        The parameters required for updating a replica for the table.
     */

    public void setUpdate(UpdateReplicationGroupMemberAction update) {
        this.update = update;
    }

    /**
     * <p>
     * The parameters required for updating a replica for the table.
     * </p>
     * 
     * @return The parameters required for updating a replica for the table.
     */

    public UpdateReplicationGroupMemberAction getUpdate() {
        return this.update;
    }

    /**
     * <p>
     * The parameters required for updating a replica for the table.
     * </p>
     * 
     * @param update
     *        The parameters required for updating a replica for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroupUpdate withUpdate(UpdateReplicationGroupMemberAction update) {
        setUpdate(update);
        return this;
    }

    /**
     * <p>
     * The parameters required for deleting a replica for the table.
     * </p>
     * 
     * @param delete
     *        The parameters required for deleting a replica for the table.
     */

    public void setDelete(DeleteReplicationGroupMemberAction delete) {
        this.delete = delete;
    }

    /**
     * <p>
     * The parameters required for deleting a replica for the table.
     * </p>
     * 
     * @return The parameters required for deleting a replica for the table.
     */

    public DeleteReplicationGroupMemberAction getDelete() {
        return this.delete;
    }

    /**
     * <p>
     * The parameters required for deleting a replica for the table.
     * </p>
     * 
     * @param delete
     *        The parameters required for deleting a replica for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationGroupUpdate withDelete(DeleteReplicationGroupMemberAction delete) {
        setDelete(delete);
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
        if (getCreate() != null)
            sb.append("Create: ").append(getCreate()).append(",");
        if (getUpdate() != null)
            sb.append("Update: ").append(getUpdate()).append(",");
        if (getDelete() != null)
            sb.append("Delete: ").append(getDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationGroupUpdate == false)
            return false;
        ReplicationGroupUpdate other = (ReplicationGroupUpdate) obj;
        if (other.getCreate() == null ^ this.getCreate() == null)
            return false;
        if (other.getCreate() != null && other.getCreate().equals(this.getCreate()) == false)
            return false;
        if (other.getUpdate() == null ^ this.getUpdate() == null)
            return false;
        if (other.getUpdate() != null && other.getUpdate().equals(this.getUpdate()) == false)
            return false;
        if (other.getDelete() == null ^ this.getDelete() == null)
            return false;
        if (other.getDelete() != null && other.getDelete().equals(this.getDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreate() == null) ? 0 : getCreate().hashCode());
        hashCode = prime * hashCode + ((getUpdate() == null) ? 0 : getUpdate().hashCode());
        hashCode = prime * hashCode + ((getDelete() == null) ? 0 : getDelete().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationGroupUpdate clone() {
        try {
            return (ReplicationGroupUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ReplicationGroupUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
