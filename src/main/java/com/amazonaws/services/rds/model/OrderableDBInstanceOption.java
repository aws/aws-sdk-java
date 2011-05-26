/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains a list of available options for a DB Instance
 * </p>
 * <p>
 * This data type is used as a response element in the
 * DescribeOrderableDBInstanceOptions action.
 * </p>
 */
public class OrderableDBInstanceOption {

    /**
     * The engine type of the orderable DB Instance.
     */
    private String engine;

    /**
     * The engine version of the orderable DB Instance.
     */
    private String engineVersion;

    /**
     * The DB Instance Class for the orderable DB Instance
     */
    private String dBInstanceClass;

    /**
     * The license model for the orderable DB Instance.
     */
    private String licenseModel;

    /**
     * A list of availability zones for the orderable DB Instance.
     */
    private java.util.List<AvailabilityZone> availabilityZones;

    /**
     * Indicates whether this orderable DB Instance is multi-AZ capable.
     */
    private Boolean multiAZCapable;

    /**
     * Indicates whether this orderable DB Instance can have a read replica.
     */
    private Boolean readReplicaCapable;

    /**
     * The engine type of the orderable DB Instance.
     *
     * @return The engine type of the orderable DB Instance.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The engine type of the orderable DB Instance.
     *
     * @param engine The engine type of the orderable DB Instance.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The engine type of the orderable DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The engine type of the orderable DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OrderableDBInstanceOption withEngine(String engine) {
        this.engine = engine;
        return this;
    }
    
    
    /**
     * The engine version of the orderable DB Instance.
     *
     * @return The engine version of the orderable DB Instance.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The engine version of the orderable DB Instance.
     *
     * @param engineVersion The engine version of the orderable DB Instance.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The engine version of the orderable DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The engine version of the orderable DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OrderableDBInstanceOption withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    
    
    /**
     * The DB Instance Class for the orderable DB Instance
     *
     * @return The DB Instance Class for the orderable DB Instance
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The DB Instance Class for the orderable DB Instance
     *
     * @param dBInstanceClass The DB Instance Class for the orderable DB Instance
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The DB Instance Class for the orderable DB Instance
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The DB Instance Class for the orderable DB Instance
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OrderableDBInstanceOption withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }
    
    
    /**
     * The license model for the orderable DB Instance.
     *
     * @return The license model for the orderable DB Instance.
     */
    public String getLicenseModel() {
        return licenseModel;
    }
    
    /**
     * The license model for the orderable DB Instance.
     *
     * @param licenseModel The license model for the orderable DB Instance.
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }
    
    /**
     * The license model for the orderable DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseModel The license model for the orderable DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OrderableDBInstanceOption withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }
    
    
    /**
     * A list of availability zones for the orderable DB Instance.
     *
     * @return A list of availability zones for the orderable DB Instance.
     */
    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new java.util.ArrayList<AvailabilityZone>();
        }
        return availabilityZones;
    }
    
    /**
     * A list of availability zones for the orderable DB Instance.
     *
     * @param availabilityZones A list of availability zones for the orderable DB Instance.
     */
    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        java.util.List<AvailabilityZone> availabilityZonesCopy = new java.util.ArrayList<AvailabilityZone>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * A list of availability zones for the orderable DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of availability zones for the orderable DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OrderableDBInstanceOption withAvailabilityZones(AvailabilityZone... availabilityZones) {
        for (AvailabilityZone value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * A list of availability zones for the orderable DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of availability zones for the orderable DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OrderableDBInstanceOption withAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        java.util.List<AvailabilityZone> availabilityZonesCopy = new java.util.ArrayList<AvailabilityZone>();
        if (availabilityZones != null) {
            availabilityZonesCopy.addAll(availabilityZones);
        }
        this.availabilityZones = availabilityZonesCopy;

        return this;
    }
    
    /**
     * Indicates whether this orderable DB Instance is multi-AZ capable.
     *
     * @return Indicates whether this orderable DB Instance is multi-AZ capable.
     */
    public Boolean isMultiAZCapable() {
        return multiAZCapable;
    }
    
    /**
     * Indicates whether this orderable DB Instance is multi-AZ capable.
     *
     * @param multiAZCapable Indicates whether this orderable DB Instance is multi-AZ capable.
     */
    public void setMultiAZCapable(Boolean multiAZCapable) {
        this.multiAZCapable = multiAZCapable;
    }
    
    /**
     * Indicates whether this orderable DB Instance is multi-AZ capable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZCapable Indicates whether this orderable DB Instance is multi-AZ capable.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OrderableDBInstanceOption withMultiAZCapable(Boolean multiAZCapable) {
        this.multiAZCapable = multiAZCapable;
        return this;
    }
    
    
    /**
     * Indicates whether this orderable DB Instance is multi-AZ capable.
     *
     * @return Indicates whether this orderable DB Instance is multi-AZ capable.
     */
    public Boolean getMultiAZCapable() {
        return multiAZCapable;
    }
    
    /**
     * Indicates whether this orderable DB Instance can have a read replica.
     *
     * @return Indicates whether this orderable DB Instance can have a read replica.
     */
    public Boolean isReadReplicaCapable() {
        return readReplicaCapable;
    }
    
    /**
     * Indicates whether this orderable DB Instance can have a read replica.
     *
     * @param readReplicaCapable Indicates whether this orderable DB Instance can have a read replica.
     */
    public void setReadReplicaCapable(Boolean readReplicaCapable) {
        this.readReplicaCapable = readReplicaCapable;
    }
    
    /**
     * Indicates whether this orderable DB Instance can have a read replica.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readReplicaCapable Indicates whether this orderable DB Instance can have a read replica.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OrderableDBInstanceOption withReadReplicaCapable(Boolean readReplicaCapable) {
        this.readReplicaCapable = readReplicaCapable;
        return this;
    }
    
    
    /**
     * Indicates whether this orderable DB Instance can have a read replica.
     *
     * @return Indicates whether this orderable DB Instance can have a read replica.
     */
    public Boolean getReadReplicaCapable() {
        return readReplicaCapable;
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
        sb.append("Engine: " + engine + ", ");
        sb.append("EngineVersion: " + engineVersion + ", ");
        sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        sb.append("LicenseModel: " + licenseModel + ", ");
        sb.append("AvailabilityZones: " + availabilityZones + ", ");
        sb.append("MultiAZCapable: " + multiAZCapable + ", ");
        sb.append("ReadReplicaCapable: " + readReplicaCapable + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    