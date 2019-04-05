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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/OrderableReplicationInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderableReplicationInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the replication engine.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     */
    private String replicationInstanceClass;
    /**
     * <p>
     * The type of storage used by the replication instance.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
     * </p>
     */
    private Integer minAllocatedStorage;
    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
     * </p>
     */
    private Integer maxAllocatedStorage;
    /**
     * <p>
     * The default amount of storage (in gigabytes) that is allocated for the replication instance.
     * </p>
     */
    private Integer defaultAllocatedStorage;
    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the replication instance.
     * </p>
     */
    private Integer includedAllocatedStorage;
    /**
     * <p>
     * List of availability zones for this replication instance.
     * </p>
     */
    private java.util.List<String> availabilityZones;

    /**
     * <p>
     * The version of the replication engine.
     * </p>
     * 
     * @param engineVersion
     *        The version of the replication engine.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the replication engine.
     * </p>
     * 
     * @return The version of the replication engine.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the replication engine.
     * </p>
     * 
     * @param engineVersion
     *        The version of the replication engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableReplicationInstance withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @param replicationInstanceClass
     *        The compute and memory capacity of the replication instance.</p>
     *        <p>
     *        Valid Values:
     *        <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     */

    public void setReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @return The compute and memory capacity of the replication instance.</p>
     *         <p>
     *         Valid Values:
     *         <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     */

    public String getReplicationInstanceClass() {
        return this.replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @param replicationInstanceClass
     *        The compute and memory capacity of the replication instance.</p>
     *        <p>
     *        Valid Values:
     *        <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableReplicationInstance withReplicationInstanceClass(String replicationInstanceClass) {
        setReplicationInstanceClass(replicationInstanceClass);
        return this;
    }

    /**
     * <p>
     * The type of storage used by the replication instance.
     * </p>
     * 
     * @param storageType
     *        The type of storage used by the replication instance.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The type of storage used by the replication instance.
     * </p>
     * 
     * @return The type of storage used by the replication instance.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The type of storage used by the replication instance.
     * </p>
     * 
     * @param storageType
     *        The type of storage used by the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableReplicationInstance withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
     * </p>
     * 
     * @param minAllocatedStorage
     *        The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
     */

    public void setMinAllocatedStorage(Integer minAllocatedStorage) {
        this.minAllocatedStorage = minAllocatedStorage;
    }

    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
     * </p>
     * 
     * @return The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
     */

    public Integer getMinAllocatedStorage() {
        return this.minAllocatedStorage;
    }

    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
     * </p>
     * 
     * @param minAllocatedStorage
     *        The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableReplicationInstance withMinAllocatedStorage(Integer minAllocatedStorage) {
        setMinAllocatedStorage(minAllocatedStorage);
        return this;
    }

    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
     * </p>
     * 
     * @param maxAllocatedStorage
     *        The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
     */

    public void setMaxAllocatedStorage(Integer maxAllocatedStorage) {
        this.maxAllocatedStorage = maxAllocatedStorage;
    }

    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
     * </p>
     * 
     * @return The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
     */

    public Integer getMaxAllocatedStorage() {
        return this.maxAllocatedStorage;
    }

    /**
     * <p>
     * The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
     * </p>
     * 
     * @param maxAllocatedStorage
     *        The minimum amount of storage (in gigabytes) that can be allocated for the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableReplicationInstance withMaxAllocatedStorage(Integer maxAllocatedStorage) {
        setMaxAllocatedStorage(maxAllocatedStorage);
        return this;
    }

    /**
     * <p>
     * The default amount of storage (in gigabytes) that is allocated for the replication instance.
     * </p>
     * 
     * @param defaultAllocatedStorage
     *        The default amount of storage (in gigabytes) that is allocated for the replication instance.
     */

    public void setDefaultAllocatedStorage(Integer defaultAllocatedStorage) {
        this.defaultAllocatedStorage = defaultAllocatedStorage;
    }

    /**
     * <p>
     * The default amount of storage (in gigabytes) that is allocated for the replication instance.
     * </p>
     * 
     * @return The default amount of storage (in gigabytes) that is allocated for the replication instance.
     */

    public Integer getDefaultAllocatedStorage() {
        return this.defaultAllocatedStorage;
    }

    /**
     * <p>
     * The default amount of storage (in gigabytes) that is allocated for the replication instance.
     * </p>
     * 
     * @param defaultAllocatedStorage
     *        The default amount of storage (in gigabytes) that is allocated for the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableReplicationInstance withDefaultAllocatedStorage(Integer defaultAllocatedStorage) {
        setDefaultAllocatedStorage(defaultAllocatedStorage);
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the replication instance.
     * </p>
     * 
     * @param includedAllocatedStorage
     *        The amount of storage (in gigabytes) that is allocated for the replication instance.
     */

    public void setIncludedAllocatedStorage(Integer includedAllocatedStorage) {
        this.includedAllocatedStorage = includedAllocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the replication instance.
     * </p>
     * 
     * @return The amount of storage (in gigabytes) that is allocated for the replication instance.
     */

    public Integer getIncludedAllocatedStorage() {
        return this.includedAllocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the replication instance.
     * </p>
     * 
     * @param includedAllocatedStorage
     *        The amount of storage (in gigabytes) that is allocated for the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableReplicationInstance withIncludedAllocatedStorage(Integer includedAllocatedStorage) {
        setIncludedAllocatedStorage(includedAllocatedStorage);
        return this;
    }

    /**
     * <p>
     * List of availability zones for this replication instance.
     * </p>
     * 
     * @return List of availability zones for this replication instance.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * List of availability zones for this replication instance.
     * </p>
     * 
     * @param availabilityZones
     *        List of availability zones for this replication instance.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * List of availability zones for this replication instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        List of availability zones for this replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableReplicationInstance withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of availability zones for this replication instance.
     * </p>
     * 
     * @param availabilityZones
     *        List of availability zones for this replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableReplicationInstance withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
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
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getReplicationInstanceClass() != null)
            sb.append("ReplicationInstanceClass: ").append(getReplicationInstanceClass()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getMinAllocatedStorage() != null)
            sb.append("MinAllocatedStorage: ").append(getMinAllocatedStorage()).append(",");
        if (getMaxAllocatedStorage() != null)
            sb.append("MaxAllocatedStorage: ").append(getMaxAllocatedStorage()).append(",");
        if (getDefaultAllocatedStorage() != null)
            sb.append("DefaultAllocatedStorage: ").append(getDefaultAllocatedStorage()).append(",");
        if (getIncludedAllocatedStorage() != null)
            sb.append("IncludedAllocatedStorage: ").append(getIncludedAllocatedStorage()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrderableReplicationInstance == false)
            return false;
        OrderableReplicationInstance other = (OrderableReplicationInstance) obj;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getReplicationInstanceClass() == null ^ this.getReplicationInstanceClass() == null)
            return false;
        if (other.getReplicationInstanceClass() != null && other.getReplicationInstanceClass().equals(this.getReplicationInstanceClass()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getMinAllocatedStorage() == null ^ this.getMinAllocatedStorage() == null)
            return false;
        if (other.getMinAllocatedStorage() != null && other.getMinAllocatedStorage().equals(this.getMinAllocatedStorage()) == false)
            return false;
        if (other.getMaxAllocatedStorage() == null ^ this.getMaxAllocatedStorage() == null)
            return false;
        if (other.getMaxAllocatedStorage() != null && other.getMaxAllocatedStorage().equals(this.getMaxAllocatedStorage()) == false)
            return false;
        if (other.getDefaultAllocatedStorage() == null ^ this.getDefaultAllocatedStorage() == null)
            return false;
        if (other.getDefaultAllocatedStorage() != null && other.getDefaultAllocatedStorage().equals(this.getDefaultAllocatedStorage()) == false)
            return false;
        if (other.getIncludedAllocatedStorage() == null ^ this.getIncludedAllocatedStorage() == null)
            return false;
        if (other.getIncludedAllocatedStorage() != null && other.getIncludedAllocatedStorage().equals(this.getIncludedAllocatedStorage()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstanceClass() == null) ? 0 : getReplicationInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getMinAllocatedStorage() == null) ? 0 : getMinAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getMaxAllocatedStorage() == null) ? 0 : getMaxAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getDefaultAllocatedStorage() == null) ? 0 : getDefaultAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getIncludedAllocatedStorage() == null) ? 0 : getIncludedAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public OrderableReplicationInstance clone() {
        try {
            return (OrderableReplicationInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.OrderableReplicationInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
