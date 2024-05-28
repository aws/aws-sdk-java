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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The storage capacity of an on-premises storage system resource (for example, a volume).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/Capacity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Capacity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of space that's being used in a storage system resource.
     * </p>
     */
    private Long used;
    /**
     * <p>
     * The total amount of space available in a storage system resource.
     * </p>
     */
    private Long provisioned;
    /**
     * <p>
     * The amount of space that's being used in a storage system resource without accounting for compression or
     * deduplication.
     * </p>
     */
    private Long logicalUsed;
    /**
     * <p>
     * The amount of space in the cluster that's in cloud storage (for example, if you're using data tiering).
     * </p>
     */
    private Long clusterCloudStorageUsed;

    /**
     * <p>
     * The amount of space that's being used in a storage system resource.
     * </p>
     * 
     * @param used
     *        The amount of space that's being used in a storage system resource.
     */

    public void setUsed(Long used) {
        this.used = used;
    }

    /**
     * <p>
     * The amount of space that's being used in a storage system resource.
     * </p>
     * 
     * @return The amount of space that's being used in a storage system resource.
     */

    public Long getUsed() {
        return this.used;
    }

    /**
     * <p>
     * The amount of space that's being used in a storage system resource.
     * </p>
     * 
     * @param used
     *        The amount of space that's being used in a storage system resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Capacity withUsed(Long used) {
        setUsed(used);
        return this;
    }

    /**
     * <p>
     * The total amount of space available in a storage system resource.
     * </p>
     * 
     * @param provisioned
     *        The total amount of space available in a storage system resource.
     */

    public void setProvisioned(Long provisioned) {
        this.provisioned = provisioned;
    }

    /**
     * <p>
     * The total amount of space available in a storage system resource.
     * </p>
     * 
     * @return The total amount of space available in a storage system resource.
     */

    public Long getProvisioned() {
        return this.provisioned;
    }

    /**
     * <p>
     * The total amount of space available in a storage system resource.
     * </p>
     * 
     * @param provisioned
     *        The total amount of space available in a storage system resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Capacity withProvisioned(Long provisioned) {
        setProvisioned(provisioned);
        return this;
    }

    /**
     * <p>
     * The amount of space that's being used in a storage system resource without accounting for compression or
     * deduplication.
     * </p>
     * 
     * @param logicalUsed
     *        The amount of space that's being used in a storage system resource without accounting for compression or
     *        deduplication.
     */

    public void setLogicalUsed(Long logicalUsed) {
        this.logicalUsed = logicalUsed;
    }

    /**
     * <p>
     * The amount of space that's being used in a storage system resource without accounting for compression or
     * deduplication.
     * </p>
     * 
     * @return The amount of space that's being used in a storage system resource without accounting for compression or
     *         deduplication.
     */

    public Long getLogicalUsed() {
        return this.logicalUsed;
    }

    /**
     * <p>
     * The amount of space that's being used in a storage system resource without accounting for compression or
     * deduplication.
     * </p>
     * 
     * @param logicalUsed
     *        The amount of space that's being used in a storage system resource without accounting for compression or
     *        deduplication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Capacity withLogicalUsed(Long logicalUsed) {
        setLogicalUsed(logicalUsed);
        return this;
    }

    /**
     * <p>
     * The amount of space in the cluster that's in cloud storage (for example, if you're using data tiering).
     * </p>
     * 
     * @param clusterCloudStorageUsed
     *        The amount of space in the cluster that's in cloud storage (for example, if you're using data tiering).
     */

    public void setClusterCloudStorageUsed(Long clusterCloudStorageUsed) {
        this.clusterCloudStorageUsed = clusterCloudStorageUsed;
    }

    /**
     * <p>
     * The amount of space in the cluster that's in cloud storage (for example, if you're using data tiering).
     * </p>
     * 
     * @return The amount of space in the cluster that's in cloud storage (for example, if you're using data tiering).
     */

    public Long getClusterCloudStorageUsed() {
        return this.clusterCloudStorageUsed;
    }

    /**
     * <p>
     * The amount of space in the cluster that's in cloud storage (for example, if you're using data tiering).
     * </p>
     * 
     * @param clusterCloudStorageUsed
     *        The amount of space in the cluster that's in cloud storage (for example, if you're using data tiering).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Capacity withClusterCloudStorageUsed(Long clusterCloudStorageUsed) {
        setClusterCloudStorageUsed(clusterCloudStorageUsed);
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
        if (getUsed() != null)
            sb.append("Used: ").append(getUsed()).append(",");
        if (getProvisioned() != null)
            sb.append("Provisioned: ").append(getProvisioned()).append(",");
        if (getLogicalUsed() != null)
            sb.append("LogicalUsed: ").append(getLogicalUsed()).append(",");
        if (getClusterCloudStorageUsed() != null)
            sb.append("ClusterCloudStorageUsed: ").append(getClusterCloudStorageUsed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Capacity == false)
            return false;
        Capacity other = (Capacity) obj;
        if (other.getUsed() == null ^ this.getUsed() == null)
            return false;
        if (other.getUsed() != null && other.getUsed().equals(this.getUsed()) == false)
            return false;
        if (other.getProvisioned() == null ^ this.getProvisioned() == null)
            return false;
        if (other.getProvisioned() != null && other.getProvisioned().equals(this.getProvisioned()) == false)
            return false;
        if (other.getLogicalUsed() == null ^ this.getLogicalUsed() == null)
            return false;
        if (other.getLogicalUsed() != null && other.getLogicalUsed().equals(this.getLogicalUsed()) == false)
            return false;
        if (other.getClusterCloudStorageUsed() == null ^ this.getClusterCloudStorageUsed() == null)
            return false;
        if (other.getClusterCloudStorageUsed() != null && other.getClusterCloudStorageUsed().equals(this.getClusterCloudStorageUsed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsed() == null) ? 0 : getUsed().hashCode());
        hashCode = prime * hashCode + ((getProvisioned() == null) ? 0 : getProvisioned().hashCode());
        hashCode = prime * hashCode + ((getLogicalUsed() == null) ? 0 : getLogicalUsed().hashCode());
        hashCode = prime * hashCode + ((getClusterCloudStorageUsed() == null) ? 0 : getClusterCloudStorageUsed().hashCode());
        return hashCode;
    }

    @Override
    public Capacity clone() {
        try {
            return (Capacity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.CapacityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
