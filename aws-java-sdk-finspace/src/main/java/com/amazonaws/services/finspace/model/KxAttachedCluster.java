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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure containing the metadata of the attached clusters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxAttachedCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxAttachedCluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique name for the attached cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * Specifies the type of cluster. The volume for TP and RDB cluster types will be used for TP logs.
     * </p>
     */
    private String clusterType;
    /**
     * <p>
     * The status of the attached cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING – The cluster is pending creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING – The cluster creation process is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The cluster creation process has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING – The cluster creation process is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The cluster is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The cluster is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The cluster has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The cluster failed to delete.
     * </p>
     * </li>
     * </ul>
     */
    private String clusterStatus;

    /**
     * <p>
     * A unique name for the attached cluster.
     * </p>
     * 
     * @param clusterName
     *        A unique name for the attached cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * A unique name for the attached cluster.
     * </p>
     * 
     * @return A unique name for the attached cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * A unique name for the attached cluster.
     * </p>
     * 
     * @param clusterName
     *        A unique name for the attached cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxAttachedCluster withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * Specifies the type of cluster. The volume for TP and RDB cluster types will be used for TP logs.
     * </p>
     * 
     * @param clusterType
     *        Specifies the type of cluster. The volume for TP and RDB cluster types will be used for TP logs.
     * @see KxClusterType
     */

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * <p>
     * Specifies the type of cluster. The volume for TP and RDB cluster types will be used for TP logs.
     * </p>
     * 
     * @return Specifies the type of cluster. The volume for TP and RDB cluster types will be used for TP logs.
     * @see KxClusterType
     */

    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * <p>
     * Specifies the type of cluster. The volume for TP and RDB cluster types will be used for TP logs.
     * </p>
     * 
     * @param clusterType
     *        Specifies the type of cluster. The volume for TP and RDB cluster types will be used for TP logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxClusterType
     */

    public KxAttachedCluster withClusterType(String clusterType) {
        setClusterType(clusterType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of cluster. The volume for TP and RDB cluster types will be used for TP logs.
     * </p>
     * 
     * @param clusterType
     *        Specifies the type of cluster. The volume for TP and RDB cluster types will be used for TP logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxClusterType
     */

    public KxAttachedCluster withClusterType(KxClusterType clusterType) {
        this.clusterType = clusterType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the attached cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING – The cluster is pending creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING – The cluster creation process is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The cluster creation process has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING – The cluster creation process is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The cluster is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The cluster is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The cluster has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The cluster failed to delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterStatus
     *        The status of the attached cluster.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING – The cluster is pending creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATING – The cluster creation process is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED – The cluster creation process has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING – The cluster creation process is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The cluster is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The cluster is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – The cluster has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED – The cluster failed to delete.
     *        </p>
     *        </li>
     * @see KxClusterStatus
     */

    public void setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
    }

    /**
     * <p>
     * The status of the attached cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING – The cluster is pending creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING – The cluster creation process is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The cluster creation process has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING – The cluster creation process is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The cluster is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The cluster is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The cluster has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The cluster failed to delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the attached cluster.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PENDING – The cluster is pending creation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATING – The cluster creation process is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_FAILED – The cluster creation process has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RUNNING – The cluster creation process is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UPDATING – The cluster is in the process of being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETING – The cluster is in the process of being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETED – The cluster has been deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE_FAILED – The cluster failed to delete.
     *         </p>
     *         </li>
     * @see KxClusterStatus
     */

    public String getClusterStatus() {
        return this.clusterStatus;
    }

    /**
     * <p>
     * The status of the attached cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING – The cluster is pending creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING – The cluster creation process is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The cluster creation process has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING – The cluster creation process is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The cluster is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The cluster is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The cluster has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The cluster failed to delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterStatus
     *        The status of the attached cluster.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING – The cluster is pending creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATING – The cluster creation process is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED – The cluster creation process has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING – The cluster creation process is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The cluster is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The cluster is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – The cluster has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED – The cluster failed to delete.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxClusterStatus
     */

    public KxAttachedCluster withClusterStatus(String clusterStatus) {
        setClusterStatus(clusterStatus);
        return this;
    }

    /**
     * <p>
     * The status of the attached cluster.
     * </p>
     * <ul>
     * <li>
     * <p>
     * PENDING – The cluster is pending creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATING – The cluster creation process is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED – The cluster creation process has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * RUNNING – The cluster creation process is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The cluster is in the process of being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The cluster is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETED – The cluster has been deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED – The cluster failed to delete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterStatus
     *        The status of the attached cluster.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PENDING – The cluster is pending creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATING – The cluster creation process is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED – The cluster creation process has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RUNNING – The cluster creation process is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The cluster is in the process of being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The cluster is in the process of being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETED – The cluster has been deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED – The cluster failed to delete.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxClusterStatus
     */

    public KxAttachedCluster withClusterStatus(KxClusterStatus clusterStatus) {
        this.clusterStatus = clusterStatus.toString();
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getClusterType() != null)
            sb.append("ClusterType: ").append(getClusterType()).append(",");
        if (getClusterStatus() != null)
            sb.append("ClusterStatus: ").append(getClusterStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxAttachedCluster == false)
            return false;
        KxAttachedCluster other = (KxAttachedCluster) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getClusterType() == null ^ this.getClusterType() == null)
            return false;
        if (other.getClusterType() != null && other.getClusterType().equals(this.getClusterType()) == false)
            return false;
        if (other.getClusterStatus() == null ^ this.getClusterStatus() == null)
            return false;
        if (other.getClusterStatus() != null && other.getClusterStatus().equals(this.getClusterStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode + ((getClusterStatus() == null) ? 0 : getClusterStatus().hashCode());
        return hashCode;
    }

    @Override
    public KxAttachedCluster clone() {
        try {
            return (KxAttachedCluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxAttachedClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
