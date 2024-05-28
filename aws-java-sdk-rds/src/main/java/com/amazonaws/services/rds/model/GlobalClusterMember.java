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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A data structure with information about any primary and secondary clusters associated with a global cluster (Aurora
 * global database).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/GlobalClusterMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlobalClusterMember implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each Aurora DB cluster in the global cluster.
     * </p>
     */
    private String dBClusterArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for each read-only secondary cluster associated with the global cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> readers;
    /**
     * <p>
     * Indicates whether the Aurora DB cluster is the primary cluster (that is, has read-write capability) for the
     * global cluster with which it is associated.
     * </p>
     */
    private Boolean isWriter;
    /**
     * <p>
     * The status of write forwarding for a secondary cluster in the global cluster.
     * </p>
     */
    private String globalWriteForwardingStatus;
    /**
     * <p>
     * The status of synchronization of each Aurora DB cluster in the global cluster.
     * </p>
     */
    private String synchronizationStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each Aurora DB cluster in the global cluster.
     * </p>
     * 
     * @param dBClusterArn
     *        The Amazon Resource Name (ARN) for each Aurora DB cluster in the global cluster.
     */

    public void setDBClusterArn(String dBClusterArn) {
        this.dBClusterArn = dBClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each Aurora DB cluster in the global cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for each Aurora DB cluster in the global cluster.
     */

    public String getDBClusterArn() {
        return this.dBClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each Aurora DB cluster in the global cluster.
     * </p>
     * 
     * @param dBClusterArn
     *        The Amazon Resource Name (ARN) for each Aurora DB cluster in the global cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalClusterMember withDBClusterArn(String dBClusterArn) {
        setDBClusterArn(dBClusterArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each read-only secondary cluster associated with the global cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for each read-only secondary cluster associated with the global cluster.
     */

    public java.util.List<String> getReaders() {
        if (readers == null) {
            readers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return readers;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each read-only secondary cluster associated with the global cluster.
     * </p>
     * 
     * @param readers
     *        The Amazon Resource Name (ARN) for each read-only secondary cluster associated with the global cluster.
     */

    public void setReaders(java.util.Collection<String> readers) {
        if (readers == null) {
            this.readers = null;
            return;
        }

        this.readers = new com.amazonaws.internal.SdkInternalList<String>(readers);
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each read-only secondary cluster associated with the global cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReaders(java.util.Collection)} or {@link #withReaders(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param readers
     *        The Amazon Resource Name (ARN) for each read-only secondary cluster associated with the global cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalClusterMember withReaders(String... readers) {
        if (this.readers == null) {
            setReaders(new com.amazonaws.internal.SdkInternalList<String>(readers.length));
        }
        for (String ele : readers) {
            this.readers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for each read-only secondary cluster associated with the global cluster.
     * </p>
     * 
     * @param readers
     *        The Amazon Resource Name (ARN) for each read-only secondary cluster associated with the global cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalClusterMember withReaders(java.util.Collection<String> readers) {
        setReaders(readers);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Aurora DB cluster is the primary cluster (that is, has read-write capability) for the
     * global cluster with which it is associated.
     * </p>
     * 
     * @param isWriter
     *        Indicates whether the Aurora DB cluster is the primary cluster (that is, has read-write capability) for
     *        the global cluster with which it is associated.
     */

    public void setIsWriter(Boolean isWriter) {
        this.isWriter = isWriter;
    }

    /**
     * <p>
     * Indicates whether the Aurora DB cluster is the primary cluster (that is, has read-write capability) for the
     * global cluster with which it is associated.
     * </p>
     * 
     * @return Indicates whether the Aurora DB cluster is the primary cluster (that is, has read-write capability) for
     *         the global cluster with which it is associated.
     */

    public Boolean getIsWriter() {
        return this.isWriter;
    }

    /**
     * <p>
     * Indicates whether the Aurora DB cluster is the primary cluster (that is, has read-write capability) for the
     * global cluster with which it is associated.
     * </p>
     * 
     * @param isWriter
     *        Indicates whether the Aurora DB cluster is the primary cluster (that is, has read-write capability) for
     *        the global cluster with which it is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalClusterMember withIsWriter(Boolean isWriter) {
        setIsWriter(isWriter);
        return this;
    }

    /**
     * <p>
     * Indicates whether the Aurora DB cluster is the primary cluster (that is, has read-write capability) for the
     * global cluster with which it is associated.
     * </p>
     * 
     * @return Indicates whether the Aurora DB cluster is the primary cluster (that is, has read-write capability) for
     *         the global cluster with which it is associated.
     */

    public Boolean isWriter() {
        return this.isWriter;
    }

    /**
     * <p>
     * The status of write forwarding for a secondary cluster in the global cluster.
     * </p>
     * 
     * @param globalWriteForwardingStatus
     *        The status of write forwarding for a secondary cluster in the global cluster.
     * @see WriteForwardingStatus
     */

    public void setGlobalWriteForwardingStatus(String globalWriteForwardingStatus) {
        this.globalWriteForwardingStatus = globalWriteForwardingStatus;
    }

    /**
     * <p>
     * The status of write forwarding for a secondary cluster in the global cluster.
     * </p>
     * 
     * @return The status of write forwarding for a secondary cluster in the global cluster.
     * @see WriteForwardingStatus
     */

    public String getGlobalWriteForwardingStatus() {
        return this.globalWriteForwardingStatus;
    }

    /**
     * <p>
     * The status of write forwarding for a secondary cluster in the global cluster.
     * </p>
     * 
     * @param globalWriteForwardingStatus
     *        The status of write forwarding for a secondary cluster in the global cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WriteForwardingStatus
     */

    public GlobalClusterMember withGlobalWriteForwardingStatus(String globalWriteForwardingStatus) {
        setGlobalWriteForwardingStatus(globalWriteForwardingStatus);
        return this;
    }

    /**
     * <p>
     * The status of write forwarding for a secondary cluster in the global cluster.
     * </p>
     * 
     * @param globalWriteForwardingStatus
     *        The status of write forwarding for a secondary cluster in the global cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WriteForwardingStatus
     */

    public GlobalClusterMember withGlobalWriteForwardingStatus(WriteForwardingStatus globalWriteForwardingStatus) {
        this.globalWriteForwardingStatus = globalWriteForwardingStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status of synchronization of each Aurora DB cluster in the global cluster.
     * </p>
     * 
     * @param synchronizationStatus
     *        The status of synchronization of each Aurora DB cluster in the global cluster.
     * @see GlobalClusterMemberSynchronizationStatus
     */

    public void setSynchronizationStatus(String synchronizationStatus) {
        this.synchronizationStatus = synchronizationStatus;
    }

    /**
     * <p>
     * The status of synchronization of each Aurora DB cluster in the global cluster.
     * </p>
     * 
     * @return The status of synchronization of each Aurora DB cluster in the global cluster.
     * @see GlobalClusterMemberSynchronizationStatus
     */

    public String getSynchronizationStatus() {
        return this.synchronizationStatus;
    }

    /**
     * <p>
     * The status of synchronization of each Aurora DB cluster in the global cluster.
     * </p>
     * 
     * @param synchronizationStatus
     *        The status of synchronization of each Aurora DB cluster in the global cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalClusterMemberSynchronizationStatus
     */

    public GlobalClusterMember withSynchronizationStatus(String synchronizationStatus) {
        setSynchronizationStatus(synchronizationStatus);
        return this;
    }

    /**
     * <p>
     * The status of synchronization of each Aurora DB cluster in the global cluster.
     * </p>
     * 
     * @param synchronizationStatus
     *        The status of synchronization of each Aurora DB cluster in the global cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalClusterMemberSynchronizationStatus
     */

    public GlobalClusterMember withSynchronizationStatus(GlobalClusterMemberSynchronizationStatus synchronizationStatus) {
        this.synchronizationStatus = synchronizationStatus.toString();
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
        if (getDBClusterArn() != null)
            sb.append("DBClusterArn: ").append(getDBClusterArn()).append(",");
        if (getReaders() != null)
            sb.append("Readers: ").append(getReaders()).append(",");
        if (getIsWriter() != null)
            sb.append("IsWriter: ").append(getIsWriter()).append(",");
        if (getGlobalWriteForwardingStatus() != null)
            sb.append("GlobalWriteForwardingStatus: ").append(getGlobalWriteForwardingStatus()).append(",");
        if (getSynchronizationStatus() != null)
            sb.append("SynchronizationStatus: ").append(getSynchronizationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalClusterMember == false)
            return false;
        GlobalClusterMember other = (GlobalClusterMember) obj;
        if (other.getDBClusterArn() == null ^ this.getDBClusterArn() == null)
            return false;
        if (other.getDBClusterArn() != null && other.getDBClusterArn().equals(this.getDBClusterArn()) == false)
            return false;
        if (other.getReaders() == null ^ this.getReaders() == null)
            return false;
        if (other.getReaders() != null && other.getReaders().equals(this.getReaders()) == false)
            return false;
        if (other.getIsWriter() == null ^ this.getIsWriter() == null)
            return false;
        if (other.getIsWriter() != null && other.getIsWriter().equals(this.getIsWriter()) == false)
            return false;
        if (other.getGlobalWriteForwardingStatus() == null ^ this.getGlobalWriteForwardingStatus() == null)
            return false;
        if (other.getGlobalWriteForwardingStatus() != null && other.getGlobalWriteForwardingStatus().equals(this.getGlobalWriteForwardingStatus()) == false)
            return false;
        if (other.getSynchronizationStatus() == null ^ this.getSynchronizationStatus() == null)
            return false;
        if (other.getSynchronizationStatus() != null && other.getSynchronizationStatus().equals(this.getSynchronizationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterArn() == null) ? 0 : getDBClusterArn().hashCode());
        hashCode = prime * hashCode + ((getReaders() == null) ? 0 : getReaders().hashCode());
        hashCode = prime * hashCode + ((getIsWriter() == null) ? 0 : getIsWriter().hashCode());
        hashCode = prime * hashCode + ((getGlobalWriteForwardingStatus() == null) ? 0 : getGlobalWriteForwardingStatus().hashCode());
        hashCode = prime * hashCode + ((getSynchronizationStatus() == null) ? 0 : getSynchronizationStatus().hashCode());
        return hashCode;
    }

    @Override
    public GlobalClusterMember clone() {
        try {
            return (GlobalClusterMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
