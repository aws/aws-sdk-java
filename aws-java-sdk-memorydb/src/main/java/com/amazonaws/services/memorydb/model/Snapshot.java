/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a copy of an entire cluster as of the time when the snapshot was taken.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/Snapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Snapshot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the snapshot
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the snapshot. Valid values: creating | available | restoring | copying | deleting.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates whether the snapshot is from an automatic backup (automated) or was created manually (manual).
     * </p>
     */
    private String source;
    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the snapshot.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The configuration of the cluster from which the snapshot was taken
     * </p>
     */
    private ClusterConfiguration clusterConfiguration;
    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     */
    private String dataTiering;

    /**
     * <p>
     * The name of the snapshot
     * </p>
     * 
     * @param name
     *        The name of the snapshot
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the snapshot
     * </p>
     * 
     * @return The name of the snapshot
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the snapshot
     * </p>
     * 
     * @param name
     *        The name of the snapshot
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the snapshot. Valid values: creating | available | restoring | copying | deleting.
     * </p>
     * 
     * @param status
     *        The status of the snapshot. Valid values: creating | available | restoring | copying | deleting.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the snapshot. Valid values: creating | available | restoring | copying | deleting.
     * </p>
     * 
     * @return The status of the snapshot. Valid values: creating | available | restoring | copying | deleting.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the snapshot. Valid values: creating | available | restoring | copying | deleting.
     * </p>
     * 
     * @param status
     *        The status of the snapshot. Valid values: creating | available | restoring | copying | deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates whether the snapshot is from an automatic backup (automated) or was created manually (manual).
     * </p>
     * 
     * @param source
     *        Indicates whether the snapshot is from an automatic backup (automated) or was created manually (manual).
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * Indicates whether the snapshot is from an automatic backup (automated) or was created manually (manual).
     * </p>
     * 
     * @return Indicates whether the snapshot is from an automatic backup (automated) or was created manually (manual).
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * Indicates whether the snapshot is from an automatic backup (automated) or was created manually (manual).
     * </p>
     * 
     * @param source
     *        Indicates whether the snapshot is from an automatic backup (automated) or was created manually (manual).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key used to encrypt the snapshot.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot.
     * </p>
     * 
     * @return The ID of the KMS key used to encrypt the snapshot.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the snapshot.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key used to encrypt the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the snapshot.
     * </p>
     * 
     * @param aRN
     *        The ARN (Amazon Resource Name) of the snapshot.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the snapshot.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the snapshot.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the snapshot.
     * </p>
     * 
     * @param aRN
     *        The ARN (Amazon Resource Name) of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The configuration of the cluster from which the snapshot was taken
     * </p>
     * 
     * @param clusterConfiguration
     *        The configuration of the cluster from which the snapshot was taken
     */

    public void setClusterConfiguration(ClusterConfiguration clusterConfiguration) {
        this.clusterConfiguration = clusterConfiguration;
    }

    /**
     * <p>
     * The configuration of the cluster from which the snapshot was taken
     * </p>
     * 
     * @return The configuration of the cluster from which the snapshot was taken
     */

    public ClusterConfiguration getClusterConfiguration() {
        return this.clusterConfiguration;
    }

    /**
     * <p>
     * The configuration of the cluster from which the snapshot was taken
     * </p>
     * 
     * @param clusterConfiguration
     *        The configuration of the cluster from which the snapshot was taken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withClusterConfiguration(ClusterConfiguration clusterConfiguration) {
        setClusterConfiguration(clusterConfiguration);
        return this;
    }

    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     * 
     * @param dataTiering
     *        Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter
     *        must be set when using r6gd nodes. For more information, see <a
     *        href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * @see DataTieringStatus
     */

    public void setDataTiering(String dataTiering) {
        this.dataTiering = dataTiering;
    }

    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     * 
     * @return Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This
     *         parameter must be set when using r6gd nodes. For more information, see <a
     *         href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * @see DataTieringStatus
     */

    public String getDataTiering() {
        return this.dataTiering;
    }

    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     * 
     * @param dataTiering
     *        Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter
     *        must be set when using r6gd nodes. For more information, see <a
     *        href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataTieringStatus
     */

    public Snapshot withDataTiering(String dataTiering) {
        setDataTiering(dataTiering);
        return this;
    }

    /**
     * <p>
     * Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter must
     * be set when using r6gd nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * </p>
     * 
     * @param dataTiering
     *        Enables data tiering. Data tiering is only supported for clusters using the r6gd node type. This parameter
     *        must be set when using r6gd nodes. For more information, see <a
     *        href="https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html">Data tiering</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataTieringStatus
     */

    public Snapshot withDataTiering(DataTieringStatus dataTiering) {
        this.dataTiering = dataTiering.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getClusterConfiguration() != null)
            sb.append("ClusterConfiguration: ").append(getClusterConfiguration()).append(",");
        if (getDataTiering() != null)
            sb.append("DataTiering: ").append(getDataTiering());
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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getClusterConfiguration() == null ^ this.getClusterConfiguration() == null)
            return false;
        if (other.getClusterConfiguration() != null && other.getClusterConfiguration().equals(this.getClusterConfiguration()) == false)
            return false;
        if (other.getDataTiering() == null ^ this.getDataTiering() == null)
            return false;
        if (other.getDataTiering() != null && other.getDataTiering().equals(this.getDataTiering()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getClusterConfiguration() == null) ? 0 : getClusterConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDataTiering() == null) ? 0 : getDataTiering().hashCode());
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
        com.amazonaws.services.memorydb.model.transform.SnapshotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
