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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a list of available options for a DB instance
 * </p>
 * <p>
 * This data type is used as a response element in the <a>DescribeOrderableDBInstanceOptions</a> action.
 * </p>
 */
public class OrderableDBInstanceOption implements Serializable, Cloneable {

    /**
     * <p>
     * The engine type of the orderable DB instance.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The engine version of the orderable DB instance.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The DB instance class for the orderable DB instance.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The license model for the orderable DB instance.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * A list of Availability Zones for the orderable DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AvailabilityZone> availabilityZones;
    /**
     * <p>
     * Indicates whether this orderable DB instance is multi-AZ capable.
     * </p>
     */
    private Boolean multiAZCapable;
    /**
     * <p>
     * Indicates whether this orderable DB instance can have a Read Replica.
     * </p>
     */
    private Boolean readReplicaCapable;
    /**
     * <p>
     * Indicates whether this is a VPC orderable DB instance.
     * </p>
     */
    private Boolean vpc;
    /**
     * <p>
     * Indicates whether this orderable DB instance supports encrypted storage.
     * </p>
     */
    private Boolean supportsStorageEncryption;
    /**
     * <p>
     * Indicates the storage type for this orderable DB instance.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * Indicates whether this orderable DB instance supports provisioned IOPS.
     * </p>
     */
    private Boolean supportsIops;
    /**
     * <p>
     * Indicates whether the DB instance supports enhanced monitoring at intervals from 1 to 60 seconds.
     * </p>
     */
    private Boolean supportsEnhancedMonitoring;

    /**
     * <p>
     * The engine type of the orderable DB instance.
     * </p>
     * 
     * @param engine
     *        The engine type of the orderable DB instance.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The engine type of the orderable DB instance.
     * </p>
     * 
     * @return The engine type of the orderable DB instance.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The engine type of the orderable DB instance.
     * </p>
     * 
     * @param engine
     *        The engine type of the orderable DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The engine version of the orderable DB instance.
     * </p>
     * 
     * @param engineVersion
     *        The engine version of the orderable DB instance.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version of the orderable DB instance.
     * </p>
     * 
     * @return The engine version of the orderable DB instance.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version of the orderable DB instance.
     * </p>
     * 
     * @param engineVersion
     *        The engine version of the orderable DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The DB instance class for the orderable DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The DB instance class for the orderable DB instance.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class for the orderable DB instance.
     * </p>
     * 
     * @return The DB instance class for the orderable DB instance.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class for the orderable DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The DB instance class for the orderable DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The license model for the orderable DB instance.
     * </p>
     * 
     * @param licenseModel
     *        The license model for the orderable DB instance.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model for the orderable DB instance.
     * </p>
     * 
     * @return The license model for the orderable DB instance.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The license model for the orderable DB instance.
     * </p>
     * 
     * @param licenseModel
     *        The license model for the orderable DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones for the orderable DB instance.
     * </p>
     * 
     * @return A list of Availability Zones for the orderable DB instance.
     */

    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<AvailabilityZone>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * A list of Availability Zones for the orderable DB instance.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones for the orderable DB instance.
     */

    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<AvailabilityZone>(availabilityZones);
    }

    /**
     * <p>
     * A list of Availability Zones for the orderable DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones for the orderable DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<AvailabilityZone>(availabilityZones.length));
        }
        for (AvailabilityZone ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones for the orderable DB instance.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones for the orderable DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance is multi-AZ capable.
     * </p>
     * 
     * @param multiAZCapable
     *        Indicates whether this orderable DB instance is multi-AZ capable.
     */

    public void setMultiAZCapable(Boolean multiAZCapable) {
        this.multiAZCapable = multiAZCapable;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance is multi-AZ capable.
     * </p>
     * 
     * @return Indicates whether this orderable DB instance is multi-AZ capable.
     */

    public Boolean getMultiAZCapable() {
        return this.multiAZCapable;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance is multi-AZ capable.
     * </p>
     * 
     * @param multiAZCapable
     *        Indicates whether this orderable DB instance is multi-AZ capable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withMultiAZCapable(Boolean multiAZCapable) {
        setMultiAZCapable(multiAZCapable);
        return this;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance is multi-AZ capable.
     * </p>
     * 
     * @return Indicates whether this orderable DB instance is multi-AZ capable.
     */

    public Boolean isMultiAZCapable() {
        return this.multiAZCapable;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance can have a Read Replica.
     * </p>
     * 
     * @param readReplicaCapable
     *        Indicates whether this orderable DB instance can have a Read Replica.
     */

    public void setReadReplicaCapable(Boolean readReplicaCapable) {
        this.readReplicaCapable = readReplicaCapable;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance can have a Read Replica.
     * </p>
     * 
     * @return Indicates whether this orderable DB instance can have a Read Replica.
     */

    public Boolean getReadReplicaCapable() {
        return this.readReplicaCapable;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance can have a Read Replica.
     * </p>
     * 
     * @param readReplicaCapable
     *        Indicates whether this orderable DB instance can have a Read Replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withReadReplicaCapable(Boolean readReplicaCapable) {
        setReadReplicaCapable(readReplicaCapable);
        return this;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance can have a Read Replica.
     * </p>
     * 
     * @return Indicates whether this orderable DB instance can have a Read Replica.
     */

    public Boolean isReadReplicaCapable() {
        return this.readReplicaCapable;
    }

    /**
     * <p>
     * Indicates whether this is a VPC orderable DB instance.
     * </p>
     * 
     * @param vpc
     *        Indicates whether this is a VPC orderable DB instance.
     */

    public void setVpc(Boolean vpc) {
        this.vpc = vpc;
    }

    /**
     * <p>
     * Indicates whether this is a VPC orderable DB instance.
     * </p>
     * 
     * @return Indicates whether this is a VPC orderable DB instance.
     */

    public Boolean getVpc() {
        return this.vpc;
    }

    /**
     * <p>
     * Indicates whether this is a VPC orderable DB instance.
     * </p>
     * 
     * @param vpc
     *        Indicates whether this is a VPC orderable DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withVpc(Boolean vpc) {
        setVpc(vpc);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is a VPC orderable DB instance.
     * </p>
     * 
     * @return Indicates whether this is a VPC orderable DB instance.
     */

    public Boolean isVpc() {
        return this.vpc;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance supports encrypted storage.
     * </p>
     * 
     * @param supportsStorageEncryption
     *        Indicates whether this orderable DB instance supports encrypted storage.
     */

    public void setSupportsStorageEncryption(Boolean supportsStorageEncryption) {
        this.supportsStorageEncryption = supportsStorageEncryption;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance supports encrypted storage.
     * </p>
     * 
     * @return Indicates whether this orderable DB instance supports encrypted storage.
     */

    public Boolean getSupportsStorageEncryption() {
        return this.supportsStorageEncryption;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance supports encrypted storage.
     * </p>
     * 
     * @param supportsStorageEncryption
     *        Indicates whether this orderable DB instance supports encrypted storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withSupportsStorageEncryption(Boolean supportsStorageEncryption) {
        setSupportsStorageEncryption(supportsStorageEncryption);
        return this;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance supports encrypted storage.
     * </p>
     * 
     * @return Indicates whether this orderable DB instance supports encrypted storage.
     */

    public Boolean isSupportsStorageEncryption() {
        return this.supportsStorageEncryption;
    }

    /**
     * <p>
     * Indicates the storage type for this orderable DB instance.
     * </p>
     * 
     * @param storageType
     *        Indicates the storage type for this orderable DB instance.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Indicates the storage type for this orderable DB instance.
     * </p>
     * 
     * @return Indicates the storage type for this orderable DB instance.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Indicates the storage type for this orderable DB instance.
     * </p>
     * 
     * @param storageType
     *        Indicates the storage type for this orderable DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance supports provisioned IOPS.
     * </p>
     * 
     * @param supportsIops
     *        Indicates whether this orderable DB instance supports provisioned IOPS.
     */

    public void setSupportsIops(Boolean supportsIops) {
        this.supportsIops = supportsIops;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance supports provisioned IOPS.
     * </p>
     * 
     * @return Indicates whether this orderable DB instance supports provisioned IOPS.
     */

    public Boolean getSupportsIops() {
        return this.supportsIops;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance supports provisioned IOPS.
     * </p>
     * 
     * @param supportsIops
     *        Indicates whether this orderable DB instance supports provisioned IOPS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withSupportsIops(Boolean supportsIops) {
        setSupportsIops(supportsIops);
        return this;
    }

    /**
     * <p>
     * Indicates whether this orderable DB instance supports provisioned IOPS.
     * </p>
     * 
     * @return Indicates whether this orderable DB instance supports provisioned IOPS.
     */

    public Boolean isSupportsIops() {
        return this.supportsIops;
    }

    /**
     * <p>
     * Indicates whether the DB instance supports enhanced monitoring at intervals from 1 to 60 seconds.
     * </p>
     * 
     * @param supportsEnhancedMonitoring
     *        Indicates whether the DB instance supports enhanced monitoring at intervals from 1 to 60 seconds.
     */

    public void setSupportsEnhancedMonitoring(Boolean supportsEnhancedMonitoring) {
        this.supportsEnhancedMonitoring = supportsEnhancedMonitoring;
    }

    /**
     * <p>
     * Indicates whether the DB instance supports enhanced monitoring at intervals from 1 to 60 seconds.
     * </p>
     * 
     * @return Indicates whether the DB instance supports enhanced monitoring at intervals from 1 to 60 seconds.
     */

    public Boolean getSupportsEnhancedMonitoring() {
        return this.supportsEnhancedMonitoring;
    }

    /**
     * <p>
     * Indicates whether the DB instance supports enhanced monitoring at intervals from 1 to 60 seconds.
     * </p>
     * 
     * @param supportsEnhancedMonitoring
     *        Indicates whether the DB instance supports enhanced monitoring at intervals from 1 to 60 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderableDBInstanceOption withSupportsEnhancedMonitoring(Boolean supportsEnhancedMonitoring) {
        setSupportsEnhancedMonitoring(supportsEnhancedMonitoring);
        return this;
    }

    /**
     * <p>
     * Indicates whether the DB instance supports enhanced monitoring at intervals from 1 to 60 seconds.
     * </p>
     * 
     * @return Indicates whether the DB instance supports enhanced monitoring at intervals from 1 to 60 seconds.
     */

    public Boolean isSupportsEnhancedMonitoring() {
        return this.supportsEnhancedMonitoring;
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
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getMultiAZCapable() != null)
            sb.append("MultiAZCapable: " + getMultiAZCapable() + ",");
        if (getReadReplicaCapable() != null)
            sb.append("ReadReplicaCapable: " + getReadReplicaCapable() + ",");
        if (getVpc() != null)
            sb.append("Vpc: " + getVpc() + ",");
        if (getSupportsStorageEncryption() != null)
            sb.append("SupportsStorageEncryption: " + getSupportsStorageEncryption() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getSupportsIops() != null)
            sb.append("SupportsIops: " + getSupportsIops() + ",");
        if (getSupportsEnhancedMonitoring() != null)
            sb.append("SupportsEnhancedMonitoring: " + getSupportsEnhancedMonitoring());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrderableDBInstanceOption == false)
            return false;
        OrderableDBInstanceOption other = (OrderableDBInstanceOption) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getMultiAZCapable() == null ^ this.getMultiAZCapable() == null)
            return false;
        if (other.getMultiAZCapable() != null && other.getMultiAZCapable().equals(this.getMultiAZCapable()) == false)
            return false;
        if (other.getReadReplicaCapable() == null ^ this.getReadReplicaCapable() == null)
            return false;
        if (other.getReadReplicaCapable() != null && other.getReadReplicaCapable().equals(this.getReadReplicaCapable()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        if (other.getSupportsStorageEncryption() == null ^ this.getSupportsStorageEncryption() == null)
            return false;
        if (other.getSupportsStorageEncryption() != null && other.getSupportsStorageEncryption().equals(this.getSupportsStorageEncryption()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getSupportsIops() == null ^ this.getSupportsIops() == null)
            return false;
        if (other.getSupportsIops() != null && other.getSupportsIops().equals(this.getSupportsIops()) == false)
            return false;
        if (other.getSupportsEnhancedMonitoring() == null ^ this.getSupportsEnhancedMonitoring() == null)
            return false;
        if (other.getSupportsEnhancedMonitoring() != null && other.getSupportsEnhancedMonitoring().equals(this.getSupportsEnhancedMonitoring()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getMultiAZCapable() == null) ? 0 : getMultiAZCapable().hashCode());
        hashCode = prime * hashCode + ((getReadReplicaCapable() == null) ? 0 : getReadReplicaCapable().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        hashCode = prime * hashCode + ((getSupportsStorageEncryption() == null) ? 0 : getSupportsStorageEncryption().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getSupportsIops() == null) ? 0 : getSupportsIops().hashCode());
        hashCode = prime * hashCode + ((getSupportsEnhancedMonitoring() == null) ? 0 : getSupportsEnhancedMonitoring().hashCode());
        return hashCode;
    }

    @Override
    public OrderableDBInstanceOption clone() {
        try {
            return (OrderableDBInstanceOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
