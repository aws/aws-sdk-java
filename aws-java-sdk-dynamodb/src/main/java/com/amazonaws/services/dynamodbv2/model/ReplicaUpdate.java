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
 * A new replica to be added to an existing global table.
 * </p>
 * </li>
 * <li>
 * <p>
 * New parameters for an existing replica.
 * </p>
 * </li>
 * <li>
 * <p>
 * An existing replica to be removed from an existing global table.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ReplicaUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicaUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parameters required for creating a replica on an existing global table.
     * </p>
     */
    private CreateReplicaAction create;
    /**
     * <p>
     * The name of the existing replica to be removed.
     * </p>
     */
    private DeleteReplicaAction delete;

    /**
     * <p>
     * The parameters required for creating a replica on an existing global table.
     * </p>
     * 
     * @param create
     *        The parameters required for creating a replica on an existing global table.
     */

    public void setCreate(CreateReplicaAction create) {
        this.create = create;
    }

    /**
     * <p>
     * The parameters required for creating a replica on an existing global table.
     * </p>
     * 
     * @return The parameters required for creating a replica on an existing global table.
     */

    public CreateReplicaAction getCreate() {
        return this.create;
    }

    /**
     * <p>
     * The parameters required for creating a replica on an existing global table.
     * </p>
     * 
     * @param create
     *        The parameters required for creating a replica on an existing global table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaUpdate withCreate(CreateReplicaAction create) {
        setCreate(create);
        return this;
    }

    /**
     * <p>
     * The name of the existing replica to be removed.
     * </p>
     * 
     * @param delete
     *        The name of the existing replica to be removed.
     */

    public void setDelete(DeleteReplicaAction delete) {
        this.delete = delete;
    }

    /**
     * <p>
     * The name of the existing replica to be removed.
     * </p>
     * 
     * @return The name of the existing replica to be removed.
     */

    public DeleteReplicaAction getDelete() {
        return this.delete;
    }

    /**
     * <p>
     * The name of the existing replica to be removed.
     * </p>
     * 
     * @param delete
     *        The name of the existing replica to be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicaUpdate withDelete(DeleteReplicaAction delete) {
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

        if (obj instanceof ReplicaUpdate == false)
            return false;
        ReplicaUpdate other = (ReplicaUpdate) obj;
        if (other.getCreate() == null ^ this.getCreate() == null)
            return false;
        if (other.getCreate() != null && other.getCreate().equals(this.getCreate()) == false)
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
        hashCode = prime * hashCode + ((getDelete() == null) ? 0 : getDelete().hashCode());
        return hashCode;
    }

    @Override
    public ReplicaUpdate clone() {
        try {
            return (ReplicaUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ReplicaUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
