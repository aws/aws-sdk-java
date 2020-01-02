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
 * Represents the auto scaling configuration for a global table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TableAutoScalingDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableAutoScalingDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     */
    private String tableStatus;
    /**
     * <p>
     * Represents replicas of the global table.
     * </p>
     */
    private java.util.List<ReplicaAutoScalingDescription> replicas;

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param tableName
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableAutoScalingDescription withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tableStatus
     *        The current state of the table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The table is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The table is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The table is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The table is ready for use.
     *        </p>
     *        </li>
     * @see TableStatus
     */

    public void setTableStatus(String tableStatus) {
        this.tableStatus = tableStatus;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the table:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The table is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The table is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The table is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The table is ready for use.
     *         </p>
     *         </li>
     * @see TableStatus
     */

    public String getTableStatus() {
        return this.tableStatus;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tableStatus
     *        The current state of the table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The table is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The table is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The table is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The table is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableStatus
     */

    public TableAutoScalingDescription withTableStatus(String tableStatus) {
        setTableStatus(tableStatus);
        return this;
    }

    /**
     * <p>
     * The current state of the table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tableStatus
     *        The current state of the table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The table is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The table is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The table is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The table is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableStatus
     */

    public TableAutoScalingDescription withTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus.toString();
        return this;
    }

    /**
     * <p>
     * Represents replicas of the global table.
     * </p>
     * 
     * @return Represents replicas of the global table.
     */

    public java.util.List<ReplicaAutoScalingDescription> getReplicas() {
        return replicas;
    }

    /**
     * <p>
     * Represents replicas of the global table.
     * </p>
     * 
     * @param replicas
     *        Represents replicas of the global table.
     */

    public void setReplicas(java.util.Collection<ReplicaAutoScalingDescription> replicas) {
        if (replicas == null) {
            this.replicas = null;
            return;
        }

        this.replicas = new java.util.ArrayList<ReplicaAutoScalingDescription>(replicas);
    }

    /**
     * <p>
     * Represents replicas of the global table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicas(java.util.Collection)} or {@link #withReplicas(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param replicas
     *        Represents replicas of the global table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableAutoScalingDescription withReplicas(ReplicaAutoScalingDescription... replicas) {
        if (this.replicas == null) {
            setReplicas(new java.util.ArrayList<ReplicaAutoScalingDescription>(replicas.length));
        }
        for (ReplicaAutoScalingDescription ele : replicas) {
            this.replicas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents replicas of the global table.
     * </p>
     * 
     * @param replicas
     *        Represents replicas of the global table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableAutoScalingDescription withReplicas(java.util.Collection<ReplicaAutoScalingDescription> replicas) {
        setReplicas(replicas);
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getTableStatus() != null)
            sb.append("TableStatus: ").append(getTableStatus()).append(",");
        if (getReplicas() != null)
            sb.append("Replicas: ").append(getReplicas());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableAutoScalingDescription == false)
            return false;
        TableAutoScalingDescription other = (TableAutoScalingDescription) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getTableStatus() == null ^ this.getTableStatus() == null)
            return false;
        if (other.getTableStatus() != null && other.getTableStatus().equals(this.getTableStatus()) == false)
            return false;
        if (other.getReplicas() == null ^ this.getReplicas() == null)
            return false;
        if (other.getReplicas() != null && other.getReplicas().equals(this.getReplicas()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getTableStatus() == null) ? 0 : getTableStatus().hashCode());
        hashCode = prime * hashCode + ((getReplicas() == null) ? 0 : getReplicas().hashCode());
        return hashCode;
    }

    @Override
    public TableAutoScalingDescription clone() {
        try {
            return (TableAutoScalingDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.TableAutoScalingDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
