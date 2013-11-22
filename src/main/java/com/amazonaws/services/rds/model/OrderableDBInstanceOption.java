/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * Contains a list of available options for a DB instance
 * </p>
 * <p>
 * This data type is used as a response element in the DescribeOrderableDBInstanceOptions action.
 * </p>
 */
public class OrderableDBInstanceOption implements Serializable {

    /**
     * The engine type of the orderable DB instance.
     */
    private String engine;

    /**
     * The engine version of the orderable DB instance.
     */
    private String engineVersion;

    /**
     * The DB instance Class for the orderable DB instance
     */
    private String dBInstanceClass;

    /**
     * The license model for the orderable DB instance.
     */
    private String licenseModel;

    /**
     * A list of availability zones for the orderable DB instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone> availabilityZones;

    /**
     * Indicates whether this orderable DB instance is multi-AZ capable.
     */
    private Boolean multiAZCapable;

    /**
     * Indicates whether this orderable DB instance can have a read replica.
     */
    private Boolean readReplicaCapable;

    /**
     * Indicates whether this is a VPC orderable DB instance.
     */
    private Boolean vpc;

    /**
     * The engine type of the orderable DB instance.
     *
     * @return The engine type of the orderable DB instance.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The engine type of the orderable DB instance.
     *
     * @param engine The engine type of the orderable DB instance.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The engine type of the orderable DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The engine type of the orderable DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OrderableDBInstanceOption withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The engine version of the orderable DB instance.
     *
     * @return The engine version of the orderable DB instance.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The engine version of the orderable DB instance.
     *
     * @param engineVersion The engine version of the orderable DB instance.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The engine version of the orderable DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The engine version of the orderable DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OrderableDBInstanceOption withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * The DB instance Class for the orderable DB instance
     *
     * @return The DB instance Class for the orderable DB instance
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The DB instance Class for the orderable DB instance
     *
     * @param dBInstanceClass The DB instance Class for the orderable DB instance
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The DB instance Class for the orderable DB instance
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The DB instance Class for the orderable DB instance
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OrderableDBInstanceOption withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * The license model for the orderable DB instance.
     *
     * @return The license model for the orderable DB instance.
     */
    public String getLicenseModel() {
        return licenseModel;
    }
    
    /**
     * The license model for the orderable DB instance.
     *
     * @param licenseModel The license model for the orderable DB instance.
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }
    
    /**
     * The license model for the orderable DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseModel The license model for the orderable DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OrderableDBInstanceOption withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * A list of availability zones for the orderable DB instance.
     *
     * @return A list of availability zones for the orderable DB instance.
     */
    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * A list of availability zones for the orderable DB instance.
     *
     * @param availabilityZones A list of availability zones for the orderable DB instance.
     */
    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone>(availabilityZones.size());
        availabilityZonesCopy.addAll(availabilityZones);
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * A list of availability zones for the orderable DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of availability zones for the orderable DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OrderableDBInstanceOption withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<AvailabilityZone>(availabilityZones.length));
        for (AvailabilityZone value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * A list of availability zones for the orderable DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of availability zones for the orderable DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OrderableDBInstanceOption withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AvailabilityZone>(availabilityZones.size());
            availabilityZonesCopy.addAll(availabilityZones);
            this.availabilityZones = availabilityZonesCopy;
        }

        return this;
    }

    /**
     * Indicates whether this orderable DB instance is multi-AZ capable.
     *
     * @return Indicates whether this orderable DB instance is multi-AZ capable.
     */
    public Boolean isMultiAZCapable() {
        return multiAZCapable;
    }
    
    /**
     * Indicates whether this orderable DB instance is multi-AZ capable.
     *
     * @param multiAZCapable Indicates whether this orderable DB instance is multi-AZ capable.
     */
    public void setMultiAZCapable(Boolean multiAZCapable) {
        this.multiAZCapable = multiAZCapable;
    }
    
    /**
     * Indicates whether this orderable DB instance is multi-AZ capable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZCapable Indicates whether this orderable DB instance is multi-AZ capable.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OrderableDBInstanceOption withMultiAZCapable(Boolean multiAZCapable) {
        this.multiAZCapable = multiAZCapable;
        return this;
    }

    /**
     * Indicates whether this orderable DB instance is multi-AZ capable.
     *
     * @return Indicates whether this orderable DB instance is multi-AZ capable.
     */
    public Boolean getMultiAZCapable() {
        return multiAZCapable;
    }

    /**
     * Indicates whether this orderable DB instance can have a read replica.
     *
     * @return Indicates whether this orderable DB instance can have a read replica.
     */
    public Boolean isReadReplicaCapable() {
        return readReplicaCapable;
    }
    
    /**
     * Indicates whether this orderable DB instance can have a read replica.
     *
     * @param readReplicaCapable Indicates whether this orderable DB instance can have a read replica.
     */
    public void setReadReplicaCapable(Boolean readReplicaCapable) {
        this.readReplicaCapable = readReplicaCapable;
    }
    
    /**
     * Indicates whether this orderable DB instance can have a read replica.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readReplicaCapable Indicates whether this orderable DB instance can have a read replica.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OrderableDBInstanceOption withReadReplicaCapable(Boolean readReplicaCapable) {
        this.readReplicaCapable = readReplicaCapable;
        return this;
    }

    /**
     * Indicates whether this orderable DB instance can have a read replica.
     *
     * @return Indicates whether this orderable DB instance can have a read replica.
     */
    public Boolean getReadReplicaCapable() {
        return readReplicaCapable;
    }

    /**
     * Indicates whether this is a VPC orderable DB instance.
     *
     * @return Indicates whether this is a VPC orderable DB instance.
     */
    public Boolean isVpc() {
        return vpc;
    }
    
    /**
     * Indicates whether this is a VPC orderable DB instance.
     *
     * @param vpc Indicates whether this is a VPC orderable DB instance.
     */
    public void setVpc(Boolean vpc) {
        this.vpc = vpc;
    }
    
    /**
     * Indicates whether this is a VPC orderable DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpc Indicates whether this is a VPC orderable DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OrderableDBInstanceOption withVpc(Boolean vpc) {
        this.vpc = vpc;
        return this;
    }

    /**
     * Indicates whether this is a VPC orderable DB instance.
     *
     * @return Indicates whether this is a VPC orderable DB instance.
     */
    public Boolean getVpc() {
        return vpc;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getDBInstanceClass() != null) sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getLicenseModel() != null) sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getAvailabilityZones() != null) sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (isMultiAZCapable() != null) sb.append("MultiAZCapable: " + isMultiAZCapable() + ",");
        if (isReadReplicaCapable() != null) sb.append("ReadReplicaCapable: " + isReadReplicaCapable() + ",");
        if (isVpc() != null) sb.append("Vpc: " + isVpc() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isMultiAZCapable() == null) ? 0 : isMultiAZCapable().hashCode()); 
        hashCode = prime * hashCode + ((isReadReplicaCapable() == null) ? 0 : isReadReplicaCapable().hashCode()); 
        hashCode = prime * hashCode + ((isVpc() == null) ? 0 : isVpc().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof OrderableDBInstanceOption == false) return false;
        OrderableDBInstanceOption other = (OrderableDBInstanceOption)obj;
        
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null) return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false) return false; 
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        if (other.isMultiAZCapable() == null ^ this.isMultiAZCapable() == null) return false;
        if (other.isMultiAZCapable() != null && other.isMultiAZCapable().equals(this.isMultiAZCapable()) == false) return false; 
        if (other.isReadReplicaCapable() == null ^ this.isReadReplicaCapable() == null) return false;
        if (other.isReadReplicaCapable() != null && other.isReadReplicaCapable().equals(this.isReadReplicaCapable()) == false) return false; 
        if (other.isVpc() == null ^ this.isVpc() == null) return false;
        if (other.isVpc() != null && other.isVpc().equals(this.isVpc()) == false) return false; 
        return true;
    }
    
}
    