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
 * Contains details about the global table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/GlobalTableDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlobalTableDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The regions where the global table has replicas.
     * </p>
     */
    private java.util.List<ReplicaDescription> replicationGroup;
    /**
     * <p>
     * The unique identifier of the global table.
     * </p>
     */
    private String globalTableArn;
    /**
     * <p>
     * The creation time of the global table.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The current state of the global table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global table is ready for use.
     * </p>
     * </li>
     * </ul>
     */
    private String globalTableStatus;
    /**
     * <p>
     * The global table name.
     * </p>
     */
    private String globalTableName;

    /**
     * <p>
     * The regions where the global table has replicas.
     * </p>
     * 
     * @return The regions where the global table has replicas.
     */

    public java.util.List<ReplicaDescription> getReplicationGroup() {
        return replicationGroup;
    }

    /**
     * <p>
     * The regions where the global table has replicas.
     * </p>
     * 
     * @param replicationGroup
     *        The regions where the global table has replicas.
     */

    public void setReplicationGroup(java.util.Collection<ReplicaDescription> replicationGroup) {
        if (replicationGroup == null) {
            this.replicationGroup = null;
            return;
        }

        this.replicationGroup = new java.util.ArrayList<ReplicaDescription>(replicationGroup);
    }

    /**
     * <p>
     * The regions where the global table has replicas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationGroup(java.util.Collection)} or {@link #withReplicationGroup(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replicationGroup
     *        The regions where the global table has replicas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalTableDescription withReplicationGroup(ReplicaDescription... replicationGroup) {
        if (this.replicationGroup == null) {
            setReplicationGroup(new java.util.ArrayList<ReplicaDescription>(replicationGroup.length));
        }
        for (ReplicaDescription ele : replicationGroup) {
            this.replicationGroup.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The regions where the global table has replicas.
     * </p>
     * 
     * @param replicationGroup
     *        The regions where the global table has replicas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalTableDescription withReplicationGroup(java.util.Collection<ReplicaDescription> replicationGroup) {
        setReplicationGroup(replicationGroup);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the global table.
     * </p>
     * 
     * @param globalTableArn
     *        The unique identifier of the global table.
     */

    public void setGlobalTableArn(String globalTableArn) {
        this.globalTableArn = globalTableArn;
    }

    /**
     * <p>
     * The unique identifier of the global table.
     * </p>
     * 
     * @return The unique identifier of the global table.
     */

    public String getGlobalTableArn() {
        return this.globalTableArn;
    }

    /**
     * <p>
     * The unique identifier of the global table.
     * </p>
     * 
     * @param globalTableArn
     *        The unique identifier of the global table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalTableDescription withGlobalTableArn(String globalTableArn) {
        setGlobalTableArn(globalTableArn);
        return this;
    }

    /**
     * <p>
     * The creation time of the global table.
     * </p>
     * 
     * @param creationDateTime
     *        The creation time of the global table.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation time of the global table.
     * </p>
     * 
     * @return The creation time of the global table.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation time of the global table.
     * </p>
     * 
     * @param creationDateTime
     *        The creation time of the global table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalTableDescription withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The current state of the global table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param globalTableStatus
     *        The current state of the global table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The global table is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The global table is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The global table is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The global table is ready for use.
     *        </p>
     *        </li>
     * @see GlobalTableStatus
     */

    public void setGlobalTableStatus(String globalTableStatus) {
        this.globalTableStatus = globalTableStatus;
    }

    /**
     * <p>
     * The current state of the global table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the global table:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - The global table is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code> - The global table is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The global table is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> - The global table is ready for use.
     *         </p>
     *         </li>
     * @see GlobalTableStatus
     */

    public String getGlobalTableStatus() {
        return this.globalTableStatus;
    }

    /**
     * <p>
     * The current state of the global table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param globalTableStatus
     *        The current state of the global table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The global table is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The global table is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The global table is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The global table is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalTableStatus
     */

    public GlobalTableDescription withGlobalTableStatus(String globalTableStatus) {
        setGlobalTableStatus(globalTableStatus);
        return this;
    }

    /**
     * <p>
     * The current state of the global table:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> - The global table is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code> - The global table is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The global table is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> - The global table is ready for use.
     * </p>
     * </li>
     * </ul>
     * 
     * @param globalTableStatus
     *        The current state of the global table:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - The global table is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code> - The global table is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The global table is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> - The global table is ready for use.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalTableStatus
     */

    public GlobalTableDescription withGlobalTableStatus(GlobalTableStatus globalTableStatus) {
        this.globalTableStatus = globalTableStatus.toString();
        return this;
    }

    /**
     * <p>
     * The global table name.
     * </p>
     * 
     * @param globalTableName
     *        The global table name.
     */

    public void setGlobalTableName(String globalTableName) {
        this.globalTableName = globalTableName;
    }

    /**
     * <p>
     * The global table name.
     * </p>
     * 
     * @return The global table name.
     */

    public String getGlobalTableName() {
        return this.globalTableName;
    }

    /**
     * <p>
     * The global table name.
     * </p>
     * 
     * @param globalTableName
     *        The global table name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalTableDescription withGlobalTableName(String globalTableName) {
        setGlobalTableName(globalTableName);
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
        if (getReplicationGroup() != null)
            sb.append("ReplicationGroup: ").append(getReplicationGroup()).append(",");
        if (getGlobalTableArn() != null)
            sb.append("GlobalTableArn: ").append(getGlobalTableArn()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getGlobalTableStatus() != null)
            sb.append("GlobalTableStatus: ").append(getGlobalTableStatus()).append(",");
        if (getGlobalTableName() != null)
            sb.append("GlobalTableName: ").append(getGlobalTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalTableDescription == false)
            return false;
        GlobalTableDescription other = (GlobalTableDescription) obj;
        if (other.getReplicationGroup() == null ^ this.getReplicationGroup() == null)
            return false;
        if (other.getReplicationGroup() != null && other.getReplicationGroup().equals(this.getReplicationGroup()) == false)
            return false;
        if (other.getGlobalTableArn() == null ^ this.getGlobalTableArn() == null)
            return false;
        if (other.getGlobalTableArn() != null && other.getGlobalTableArn().equals(this.getGlobalTableArn()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getGlobalTableStatus() == null ^ this.getGlobalTableStatus() == null)
            return false;
        if (other.getGlobalTableStatus() != null && other.getGlobalTableStatus().equals(this.getGlobalTableStatus()) == false)
            return false;
        if (other.getGlobalTableName() == null ^ this.getGlobalTableName() == null)
            return false;
        if (other.getGlobalTableName() != null && other.getGlobalTableName().equals(this.getGlobalTableName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroup() == null) ? 0 : getReplicationGroup().hashCode());
        hashCode = prime * hashCode + ((getGlobalTableArn() == null) ? 0 : getGlobalTableArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getGlobalTableStatus() == null) ? 0 : getGlobalTableStatus().hashCode());
        hashCode = prime * hashCode + ((getGlobalTableName() == null) ? 0 : getGlobalTableName().hashCode());
        return hashCode;
    }

    @Override
    public GlobalTableDescription clone() {
        try {
            return (GlobalTableDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.GlobalTableDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
