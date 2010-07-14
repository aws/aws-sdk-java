/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A group of Amazon EC2 Reserved Instances purchased by this account.
 * </p>
 */
public class ReservedInstances {

    /**
     * The unique ID of the Reserved Instances purchase.
     */
    private String reservedInstancesId;

    /**
     * The instance type on which the Reserved Instances can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge
     */
    private String instanceType;

    /**
     * The Availability Zone in which the Reserved Instances can be used.
     */
    private String availabilityZone;

    /**
     * The date and time the Reserved Instances started.
     */
    private java.util.Date start;

    /**
     * The duration of the Reserved Instances, in seconds.
     */
    private Long duration;

    /**
     * The usage price of the Reserved Instances, per hour.
     */
    private Float usagePrice;

    /**
     * The purchase price of the Reserved Instances.
     */
    private Float fixedPrice;

    /**
     * The number of Reserved Instances purchased.
     */
    private Integer instanceCount;

    /**
     * The Reserved Instances product description (ex: Windows or
     * Unix/Linux).
     */
    private String productDescription;

    /**
     * The state of the Reserved Instances purchase.
     */
    private String state;

    /**
     * The unique ID of the Reserved Instances purchase.
     *
     * @return The unique ID of the Reserved Instances purchase.
     */
    public String getReservedInstancesId() {
        return reservedInstancesId;
    }
    
    /**
     * The unique ID of the Reserved Instances purchase.
     *
     * @param reservedInstancesId The unique ID of the Reserved Instances purchase.
     */
    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }
    
    /**
     * The unique ID of the Reserved Instances purchase.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesId The unique ID of the Reserved Instances purchase.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstances withReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
        return this;
    }
    
    
    /**
     * The instance type on which the Reserved Instances can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge
     *
     * @return The instance type on which the Reserved Instances can be used.
     *
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type on which the Reserved Instances can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge
     *
     * @param instanceType The instance type on which the Reserved Instances can be used.
     *
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type on which the Reserved Instances can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m1.small, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge
     *
     * @param instanceType The instance type on which the Reserved Instances can be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see InstanceType
     */
    public ReservedInstances withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    
    
    /**
     * The Availability Zone in which the Reserved Instances can be used.
     *
     * @return The Availability Zone in which the Reserved Instances can be used.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone in which the Reserved Instances can be used.
     *
     * @param availabilityZone The Availability Zone in which the Reserved Instances can be used.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone in which the Reserved Instances can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone in which the Reserved Instances can be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstances withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * The date and time the Reserved Instances started.
     *
     * @return The date and time the Reserved Instances started.
     */
    public java.util.Date getStart() {
        return start;
    }
    
    /**
     * The date and time the Reserved Instances started.
     *
     * @param start The date and time the Reserved Instances started.
     */
    public void setStart(java.util.Date start) {
        this.start = start;
    }
    
    /**
     * The date and time the Reserved Instances started.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param start The date and time the Reserved Instances started.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstances withStart(java.util.Date start) {
        this.start = start;
        return this;
    }
    
    
    /**
     * The duration of the Reserved Instances, in seconds.
     *
     * @return The duration of the Reserved Instances, in seconds.
     */
    public Long getDuration() {
        return duration;
    }
    
    /**
     * The duration of the Reserved Instances, in seconds.
     *
     * @param duration The duration of the Reserved Instances, in seconds.
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }
    
    /**
     * The duration of the Reserved Instances, in seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The duration of the Reserved Instances, in seconds.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstances withDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    
    
    /**
     * The usage price of the Reserved Instances, per hour.
     *
     * @return The usage price of the Reserved Instances, per hour.
     */
    public Float getUsagePrice() {
        return usagePrice;
    }
    
    /**
     * The usage price of the Reserved Instances, per hour.
     *
     * @param usagePrice The usage price of the Reserved Instances, per hour.
     */
    public void setUsagePrice(Float usagePrice) {
        this.usagePrice = usagePrice;
    }
    
    /**
     * The usage price of the Reserved Instances, per hour.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param usagePrice The usage price of the Reserved Instances, per hour.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstances withUsagePrice(Float usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }
    
    
    /**
     * The purchase price of the Reserved Instances.
     *
     * @return The purchase price of the Reserved Instances.
     */
    public Float getFixedPrice() {
        return fixedPrice;
    }
    
    /**
     * The purchase price of the Reserved Instances.
     *
     * @param fixedPrice The purchase price of the Reserved Instances.
     */
    public void setFixedPrice(Float fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
    
    /**
     * The purchase price of the Reserved Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fixedPrice The purchase price of the Reserved Instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstances withFixedPrice(Float fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }
    
    
    /**
     * The number of Reserved Instances purchased.
     *
     * @return The number of Reserved Instances purchased.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * The number of Reserved Instances purchased.
     *
     * @param instanceCount The number of Reserved Instances purchased.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * The number of Reserved Instances purchased.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The number of Reserved Instances purchased.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstances withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    
    
    /**
     * The Reserved Instances product description (ex: Windows or
     * Unix/Linux).
     *
     * @return The Reserved Instances product description (ex: Windows or
     *         Unix/Linux).
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The Reserved Instances product description (ex: Windows or
     * Unix/Linux).
     *
     * @param productDescription The Reserved Instances product description (ex: Windows or
     *         Unix/Linux).
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The Reserved Instances product description (ex: Windows or
     * Unix/Linux).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription The Reserved Instances product description (ex: Windows or
     *         Unix/Linux).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstances withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
    
    
    /**
     * The state of the Reserved Instances purchase.
     *
     * @return The state of the Reserved Instances purchase.
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the Reserved Instances purchase.
     *
     * @param state The state of the Reserved Instances purchase.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the Reserved Instances purchase.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The state of the Reserved Instances purchase.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstances withState(String state) {
        this.state = state;
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
        sb.append("ReservedInstancesId: " + reservedInstancesId + ", ");
        sb.append("InstanceType: " + instanceType + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("Start: " + start + ", ");
        sb.append("Duration: " + duration + ", ");
        sb.append("UsagePrice: " + usagePrice + ", ");
        sb.append("FixedPrice: " + fixedPrice + ", ");
        sb.append("InstanceCount: " + instanceCount + ", ");
        sb.append("ProductDescription: " + productDescription + ", ");
        sb.append("State: " + state + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    