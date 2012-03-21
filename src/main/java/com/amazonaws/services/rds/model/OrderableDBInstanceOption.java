/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Indicates whether this orderable DB Instance is VPC capable.
     */
    private Boolean vpcCapable;

    /**
     * Indicates whether this orderable DB Instance is VPC multi-AZ capable.
     */
    private Boolean vpcMultiAZCapable;

    /**
     * Indicates whether this orderable DB Instance can have a VPC read
     * replica.
     */
    private Boolean vpcReadReplicaCapable;

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
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        java.util.List<AvailabilityZone> availabilityZonesCopy = new java.util.ArrayList<AvailabilityZone>(availabilityZones.size());
        availabilityZonesCopy.addAll(availabilityZones);
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
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<AvailabilityZone>(availabilityZones.length));
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
        if (availabilityZones == null) {
            this.availabilityZones = null;
        } else {
            java.util.List<AvailabilityZone> availabilityZonesCopy = new java.util.ArrayList<AvailabilityZone>(availabilityZones.size());
            availabilityZonesCopy.addAll(availabilityZones);
            this.availabilityZones = availabilityZonesCopy;
        }

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
     * Indicates whether this orderable DB Instance is VPC capable.
     *
     * @return Indicates whether this orderable DB Instance is VPC capable.
     */
    public Boolean isVpcCapable() {
        return vpcCapable;
    }
    
    /**
     * Indicates whether this orderable DB Instance is VPC capable.
     *
     * @param vpcCapable Indicates whether this orderable DB Instance is VPC capable.
     */
    public void setVpcCapable(Boolean vpcCapable) {
        this.vpcCapable = vpcCapable;
    }
    
    /**
     * Indicates whether this orderable DB Instance is VPC capable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcCapable Indicates whether this orderable DB Instance is VPC capable.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OrderableDBInstanceOption withVpcCapable(Boolean vpcCapable) {
        this.vpcCapable = vpcCapable;
        return this;
    }
    
    
    /**
     * Indicates whether this orderable DB Instance is VPC capable.
     *
     * @return Indicates whether this orderable DB Instance is VPC capable.
     */
    public Boolean getVpcCapable() {
        return vpcCapable;
    }
    
    /**
     * Indicates whether this orderable DB Instance is VPC multi-AZ capable.
     *
     * @return Indicates whether this orderable DB Instance is VPC multi-AZ capable.
     */
    public Boolean isVpcMultiAZCapable() {
        return vpcMultiAZCapable;
    }
    
    /**
     * Indicates whether this orderable DB Instance is VPC multi-AZ capable.
     *
     * @param vpcMultiAZCapable Indicates whether this orderable DB Instance is VPC multi-AZ capable.
     */
    public void setVpcMultiAZCapable(Boolean vpcMultiAZCapable) {
        this.vpcMultiAZCapable = vpcMultiAZCapable;
    }
    
    /**
     * Indicates whether this orderable DB Instance is VPC multi-AZ capable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcMultiAZCapable Indicates whether this orderable DB Instance is VPC multi-AZ capable.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OrderableDBInstanceOption withVpcMultiAZCapable(Boolean vpcMultiAZCapable) {
        this.vpcMultiAZCapable = vpcMultiAZCapable;
        return this;
    }
    
    
    /**
     * Indicates whether this orderable DB Instance is VPC multi-AZ capable.
     *
     * @return Indicates whether this orderable DB Instance is VPC multi-AZ capable.
     */
    public Boolean getVpcMultiAZCapable() {
        return vpcMultiAZCapable;
    }
    
    /**
     * Indicates whether this orderable DB Instance can have a VPC read
     * replica.
     *
     * @return Indicates whether this orderable DB Instance can have a VPC read
     *         replica.
     */
    public Boolean isVpcReadReplicaCapable() {
        return vpcReadReplicaCapable;
    }
    
    /**
     * Indicates whether this orderable DB Instance can have a VPC read
     * replica.
     *
     * @param vpcReadReplicaCapable Indicates whether this orderable DB Instance can have a VPC read
     *         replica.
     */
    public void setVpcReadReplicaCapable(Boolean vpcReadReplicaCapable) {
        this.vpcReadReplicaCapable = vpcReadReplicaCapable;
    }
    
    /**
     * Indicates whether this orderable DB Instance can have a VPC read
     * replica.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcReadReplicaCapable Indicates whether this orderable DB Instance can have a VPC read
     *         replica.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OrderableDBInstanceOption withVpcReadReplicaCapable(Boolean vpcReadReplicaCapable) {
        this.vpcReadReplicaCapable = vpcReadReplicaCapable;
        return this;
    }
    
    
    /**
     * Indicates whether this orderable DB Instance can have a VPC read
     * replica.
     *
     * @return Indicates whether this orderable DB Instance can have a VPC read
     *         replica.
     */
    public Boolean getVpcReadReplicaCapable() {
        return vpcReadReplicaCapable;
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
        if (engine != null) sb.append("Engine: " + engine + ", ");
        if (engineVersion != null) sb.append("EngineVersion: " + engineVersion + ", ");
        if (dBInstanceClass != null) sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        if (licenseModel != null) sb.append("LicenseModel: " + licenseModel + ", ");
        if (availabilityZones != null) sb.append("AvailabilityZones: " + availabilityZones + ", ");
        if (multiAZCapable != null) sb.append("MultiAZCapable: " + multiAZCapable + ", ");
        if (readReplicaCapable != null) sb.append("ReadReplicaCapable: " + readReplicaCapable + ", ");
        if (vpcCapable != null) sb.append("VpcCapable: " + vpcCapable + ", ");
        if (vpcMultiAZCapable != null) sb.append("VpcMultiAZCapable: " + vpcMultiAZCapable + ", ");
        if (vpcReadReplicaCapable != null) sb.append("VpcReadReplicaCapable: " + vpcReadReplicaCapable + ", ");
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
        hashCode = prime * hashCode + ((isVpcCapable() == null) ? 0 : isVpcCapable().hashCode()); 
        hashCode = prime * hashCode + ((isVpcMultiAZCapable() == null) ? 0 : isVpcMultiAZCapable().hashCode()); 
        hashCode = prime * hashCode + ((isVpcReadReplicaCapable() == null) ? 0 : isVpcReadReplicaCapable().hashCode()); 
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
        if (other.isVpcCapable() == null ^ this.isVpcCapable() == null) return false;
        if (other.isVpcCapable() != null && other.isVpcCapable().equals(this.isVpcCapable()) == false) return false; 
        if (other.isVpcMultiAZCapable() == null ^ this.isVpcMultiAZCapable() == null) return false;
        if (other.isVpcMultiAZCapable() != null && other.isVpcMultiAZCapable().equals(this.isVpcMultiAZCapable()) == false) return false; 
        if (other.isVpcReadReplicaCapable() == null ^ this.isVpcReadReplicaCapable() == null) return false;
        if (other.isVpcReadReplicaCapable() != null && other.isVpcReadReplicaCapable().equals(this.isVpcReadReplicaCapable()) == false) return false; 
        return true;
    }
    
}
    