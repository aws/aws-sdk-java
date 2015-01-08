/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the placement for the instance.
 * </p>
 */
public class Placement implements Serializable {

    /**
     * The Availability Zone of the instance.
     */
    private String availabilityZone;

    /**
     * The name of the placement group the instance is in (for cluster
     * compute instances).
     */
    private String groupName;

    /**
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on
     * single-tenant hardware.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     */
    private String tenancy;

    /**
     * Default constructor for a new Placement object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Placement() {}
    
    /**
     * Constructs a new Placement object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param availabilityZone The Availability Zone of the instance.
     */
    public Placement(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
    }

    /**
     * The Availability Zone of the instance.
     *
     * @return The Availability Zone of the instance.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone of the instance.
     *
     * @param availabilityZone The Availability Zone of the instance.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Placement withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The name of the placement group the instance is in (for cluster
     * compute instances).
     *
     * @return The name of the placement group the instance is in (for cluster
     *         compute instances).
     */
    public String getGroupName() {
        return groupName;
    }
    
    /**
     * The name of the placement group the instance is in (for cluster
     * compute instances).
     *
     * @param groupName The name of the placement group the instance is in (for cluster
     *         compute instances).
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    /**
     * The name of the placement group the instance is in (for cluster
     * compute instances).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupName The name of the placement group the instance is in (for cluster
     *         compute instances).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Placement withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on
     * single-tenant hardware.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @return The tenancy of the instance (if the instance is running in a VPC). An
     *         instance with a tenancy of <code>dedicated</code> runs on
     *         single-tenant hardware.
     *
     * @see Tenancy
     */
    public String getTenancy() {
        return tenancy;
    }
    
    /**
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on
     * single-tenant hardware.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param tenancy The tenancy of the instance (if the instance is running in a VPC). An
     *         instance with a tenancy of <code>dedicated</code> runs on
     *         single-tenant hardware.
     *
     * @see Tenancy
     */
    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }
    
    /**
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on
     * single-tenant hardware.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param tenancy The tenancy of the instance (if the instance is running in a VPC). An
     *         instance with a tenancy of <code>dedicated</code> runs on
     *         single-tenant hardware.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Tenancy
     */
    public Placement withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on
     * single-tenant hardware.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param tenancy The tenancy of the instance (if the instance is running in a VPC). An
     *         instance with a tenancy of <code>dedicated</code> runs on
     *         single-tenant hardware.
     *
     * @see Tenancy
     */
    public void setTenancy(Tenancy tenancy) {
        this.tenancy = tenancy.toString();
    }
    
    /**
     * The tenancy of the instance (if the instance is running in a VPC). An
     * instance with a tenancy of <code>dedicated</code> runs on
     * single-tenant hardware.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param tenancy The tenancy of the instance (if the instance is running in a VPC). An
     *         instance with a tenancy of <code>dedicated</code> runs on
     *         single-tenant hardware.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Tenancy
     */
    public Placement withTenancy(Tenancy tenancy) {
        this.tenancy = tenancy.toString();
        return this;
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
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getGroupName() != null) sb.append("GroupName: " + getGroupName() + ",");
        if (getTenancy() != null) sb.append("Tenancy: " + getTenancy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Placement == false) return false;
        Placement other = (Placement)obj;
        
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getGroupName() == null ^ this.getGroupName() == null) return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false) return false; 
        if (other.getTenancy() == null ^ this.getTenancy() == null) return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false) return false; 
        return true;
    }
    
}
    