/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a Reserved Instance.
 * </p>
 */
public class ReservedInstances implements Serializable {

    /**
     * The ID of the Reserved Instance.
     */
    private String reservedInstancesId;

    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge
     */
    private String instanceType;

    /**
     * The Availability Zone in which the Reserved Instance can be used.
     */
    private String availabilityZone;

    /**
     * The date and time the Reserved Instance started.
     */
    private java.util.Date start;

    /**
     * The time when the Reserved Instance expires.
     */
    private java.util.Date end;

    /**
     * The duration of the Reserved Instance, in seconds.
     */
    private Long duration;

    /**
     * The usage price of the Reserved Instance, per hour.
     */
    private Float usagePrice;

    /**
     * The purchase price of the Reserved Instance.
     */
    private Float fixedPrice;

    /**
     * The number of Reserved Instances purchased.
     */
    private Integer instanceCount;

    /**
     * The Reserved Instance description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     */
    private String productDescription;

    /**
     * The state of the Reserved Instance purchase.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>payment-pending, active, payment-failed, retired
     */
    private String state;

    /**
     * Any tags assigned to the resource.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The tenancy of the reserved instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     */
    private String instanceTenancy;

    /**
     * The currency of the Reserved Instance. It's specified using ISO 4217
     * standard currency codes. At this time, the only supported currency is
     * <code>USD</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     */
    private String currencyCode;

    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     */
    private String offeringType;

    /**
     * The recurring charge tag assigned to the resource.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge> recurringCharges;

    /**
     * The ID of the Reserved Instance.
     *
     * @return The ID of the Reserved Instance.
     */
    public String getReservedInstancesId() {
        return reservedInstancesId;
    }
    
    /**
     * The ID of the Reserved Instance.
     *
     * @param reservedInstancesId The ID of the Reserved Instance.
     */
    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }
    
    /**
     * The ID of the Reserved Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesId The ID of the Reserved Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstances withReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
        return this;
    }

    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge
     *
     * @return The instance type on which the Reserved Instance can be used.
     *
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge
     *
     * @param instanceType The instance type on which the Reserved Instance can be used.
     *
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge
     *
     * @param instanceType The instance type on which the Reserved Instance can be used.
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
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge
     *
     * @param instanceType The instance type on which the Reserved Instance can be used.
     *
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }
    
    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge
     *
     * @param instanceType The instance type on which the Reserved Instance can be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceType
     */
    public ReservedInstances withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * The Availability Zone in which the Reserved Instance can be used.
     *
     * @return The Availability Zone in which the Reserved Instance can be used.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone in which the Reserved Instance can be used.
     *
     * @param availabilityZone The Availability Zone in which the Reserved Instance can be used.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone in which the Reserved Instance can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone in which the Reserved Instance can be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstances withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The date and time the Reserved Instance started.
     *
     * @return The date and time the Reserved Instance started.
     */
    public java.util.Date getStart() {
        return start;
    }
    
    /**
     * The date and time the Reserved Instance started.
     *
     * @param start The date and time the Reserved Instance started.
     */
    public void setStart(java.util.Date start) {
        this.start = start;
    }
    
    /**
     * The date and time the Reserved Instance started.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param start The date and time the Reserved Instance started.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstances withStart(java.util.Date start) {
        this.start = start;
        return this;
    }

    /**
     * The time when the Reserved Instance expires.
     *
     * @return The time when the Reserved Instance expires.
     */
    public java.util.Date getEnd() {
        return end;
    }
    
    /**
     * The time when the Reserved Instance expires.
     *
     * @param end The time when the Reserved Instance expires.
     */
    public void setEnd(java.util.Date end) {
        this.end = end;
    }
    
    /**
     * The time when the Reserved Instance expires.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param end The time when the Reserved Instance expires.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstances withEnd(java.util.Date end) {
        this.end = end;
        return this;
    }

    /**
     * The duration of the Reserved Instance, in seconds.
     *
     * @return The duration of the Reserved Instance, in seconds.
     */
    public Long getDuration() {
        return duration;
    }
    
    /**
     * The duration of the Reserved Instance, in seconds.
     *
     * @param duration The duration of the Reserved Instance, in seconds.
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }
    
    /**
     * The duration of the Reserved Instance, in seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The duration of the Reserved Instance, in seconds.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstances withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The usage price of the Reserved Instance, per hour.
     *
     * @return The usage price of the Reserved Instance, per hour.
     */
    public Float getUsagePrice() {
        return usagePrice;
    }
    
    /**
     * The usage price of the Reserved Instance, per hour.
     *
     * @param usagePrice The usage price of the Reserved Instance, per hour.
     */
    public void setUsagePrice(Float usagePrice) {
        this.usagePrice = usagePrice;
    }
    
    /**
     * The usage price of the Reserved Instance, per hour.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param usagePrice The usage price of the Reserved Instance, per hour.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstances withUsagePrice(Float usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }

    /**
     * The purchase price of the Reserved Instance.
     *
     * @return The purchase price of the Reserved Instance.
     */
    public Float getFixedPrice() {
        return fixedPrice;
    }
    
    /**
     * The purchase price of the Reserved Instance.
     *
     * @param fixedPrice The purchase price of the Reserved Instance.
     */
    public void setFixedPrice(Float fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
    
    /**
     * The purchase price of the Reserved Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fixedPrice The purchase price of the Reserved Instance.
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
     * The Reserved Instance description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @return The Reserved Instance description.
     *
     * @see RIProductDescription
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The Reserved Instance description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance description.
     *
     * @see RIProductDescription
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The Reserved Instance description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance description.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RIProductDescription
     */
    public ReservedInstances withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * The Reserved Instance description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance description.
     *
     * @see RIProductDescription
     */
    public void setProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
    }
    
    /**
     * The Reserved Instance description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance description.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RIProductDescription
     */
    public ReservedInstances withProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
        return this;
    }

    /**
     * The state of the Reserved Instance purchase.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>payment-pending, active, payment-failed, retired
     *
     * @return The state of the Reserved Instance purchase.
     *
     * @see ReservedInstanceState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the Reserved Instance purchase.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>payment-pending, active, payment-failed, retired
     *
     * @param state The state of the Reserved Instance purchase.
     *
     * @see ReservedInstanceState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the Reserved Instance purchase.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>payment-pending, active, payment-failed, retired
     *
     * @param state The state of the Reserved Instance purchase.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReservedInstanceState
     */
    public ReservedInstances withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the Reserved Instance purchase.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>payment-pending, active, payment-failed, retired
     *
     * @param state The state of the Reserved Instance purchase.
     *
     * @see ReservedInstanceState
     */
    public void setState(ReservedInstanceState state) {
        this.state = state.toString();
    }
    
    /**
     * The state of the Reserved Instance purchase.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>payment-pending, active, payment-failed, retired
     *
     * @param state The state of the Reserved Instance purchase.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReservedInstanceState
     */
    public ReservedInstances withState(ReservedInstanceState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Any tags assigned to the resource.
     *
     * @return Any tags assigned to the resource.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the resource.
     *
     * @param tags Any tags assigned to the resource.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * Any tags assigned to the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstances withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Any tags assigned to the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstances withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * The tenancy of the reserved instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @return The tenancy of the reserved instance.
     *
     * @see Tenancy
     */
    public String getInstanceTenancy() {
        return instanceTenancy;
    }
    
    /**
     * The tenancy of the reserved instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The tenancy of the reserved instance.
     *
     * @see Tenancy
     */
    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }
    
    /**
     * The tenancy of the reserved instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The tenancy of the reserved instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see Tenancy
     */
    public ReservedInstances withInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
        return this;
    }

    /**
     * The tenancy of the reserved instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The tenancy of the reserved instance.
     *
     * @see Tenancy
     */
    public void setInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
    }
    
    /**
     * The tenancy of the reserved instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated
     *
     * @param instanceTenancy The tenancy of the reserved instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see Tenancy
     */
    public ReservedInstances withInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
        return this;
    }

    /**
     * The currency of the Reserved Instance. It's specified using ISO 4217
     * standard currency codes. At this time, the only supported currency is
     * <code>USD</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @return The currency of the Reserved Instance. It's specified using ISO 4217
     *         standard currency codes. At this time, the only supported currency is
     *         <code>USD</code>.
     *
     * @see CurrencyCodeValues
     */
    public String getCurrencyCode() {
        return currencyCode;
    }
    
    /**
     * The currency of the Reserved Instance. It's specified using ISO 4217
     * standard currency codes. At this time, the only supported currency is
     * <code>USD</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The currency of the Reserved Instance. It's specified using ISO 4217
     *         standard currency codes. At this time, the only supported currency is
     *         <code>USD</code>.
     *
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    
    /**
     * The currency of the Reserved Instance. It's specified using ISO 4217
     * standard currency codes. At this time, the only supported currency is
     * <code>USD</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The currency of the Reserved Instance. It's specified using ISO 4217
     *         standard currency codes. At this time, the only supported currency is
     *         <code>USD</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see CurrencyCodeValues
     */
    public ReservedInstances withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * The currency of the Reserved Instance. It's specified using ISO 4217
     * standard currency codes. At this time, the only supported currency is
     * <code>USD</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The currency of the Reserved Instance. It's specified using ISO 4217
     *         standard currency codes. At this time, the only supported currency is
     *         <code>USD</code>.
     *
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
    }
    
    /**
     * The currency of the Reserved Instance. It's specified using ISO 4217
     * standard currency codes. At this time, the only supported currency is
     * <code>USD</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The currency of the Reserved Instance. It's specified using ISO 4217
     *         standard currency codes. At this time, the only supported currency is
     *         <code>USD</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see CurrencyCodeValues
     */
    public ReservedInstances withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @return The Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see OfferingTypeValues
     */
    public ReservedInstances withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public void setOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see OfferingTypeValues
     */
    public ReservedInstances withOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
        return this;
    }

    /**
     * The recurring charge tag assigned to the resource.
     *
     * @return The recurring charge tag assigned to the resource.
     */
    public java.util.List<RecurringCharge> getRecurringCharges() {
        if (recurringCharges == null) {
              recurringCharges = new com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge>();
              recurringCharges.setAutoConstruct(true);
        }
        return recurringCharges;
    }
    
    /**
     * The recurring charge tag assigned to the resource.
     *
     * @param recurringCharges The recurring charge tag assigned to the resource.
     */
    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge> recurringChargesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge>(recurringCharges.size());
        recurringChargesCopy.addAll(recurringCharges);
        this.recurringCharges = recurringChargesCopy;
    }
    
    /**
     * The recurring charge tag assigned to the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringCharges The recurring charge tag assigned to the resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstances withRecurringCharges(RecurringCharge... recurringCharges) {
        if (getRecurringCharges() == null) setRecurringCharges(new java.util.ArrayList<RecurringCharge>(recurringCharges.length));
        for (RecurringCharge value : recurringCharges) {
            getRecurringCharges().add(value);
        }
        return this;
    }
    
    /**
     * The recurring charge tag assigned to the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringCharges The recurring charge tag assigned to the resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReservedInstances withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge> recurringChargesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge>(recurringCharges.size());
            recurringChargesCopy.addAll(recurringCharges);
            this.recurringCharges = recurringChargesCopy;
        }

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
        if (getReservedInstancesId() != null) sb.append("ReservedInstancesId: " + getReservedInstancesId() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getStart() != null) sb.append("Start: " + getStart() + ",");
        if (getEnd() != null) sb.append("End: " + getEnd() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() + ",");
        if (getUsagePrice() != null) sb.append("UsagePrice: " + getUsagePrice() + ",");
        if (getFixedPrice() != null) sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getInstanceCount() != null) sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getProductDescription() != null) sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getInstanceTenancy() != null) sb.append("InstanceTenancy: " + getInstanceTenancy() + ",");
        if (getCurrencyCode() != null) sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getOfferingType() != null) sb.append("OfferingType: " + getOfferingType() + ",");
        if (getRecurringCharges() != null) sb.append("RecurringCharges: " + getRecurringCharges() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode()); 
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode()); 
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode()); 
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode()); 
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode()); 
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode()); 
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode()); 
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode()); 
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReservedInstances == false) return false;
        ReservedInstances other = (ReservedInstances)obj;
        
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null) return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getStart() == null ^ this.getStart() == null) return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false) return false; 
        if (other.getEnd() == null ^ this.getEnd() == null) return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null) return false;
        if (other.getUsagePrice() != null && other.getUsagePrice().equals(this.getUsagePrice()) == false) return false; 
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null) return false;
        if (other.getFixedPrice() != null && other.getFixedPrice().equals(this.getFixedPrice()) == false) return false; 
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null) return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false) return false; 
        if (other.getProductDescription() == null ^ this.getProductDescription() == null) return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null) return false;
        if (other.getInstanceTenancy() != null && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false) return false; 
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null) return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false) return false; 
        if (other.getOfferingType() == null ^ this.getOfferingType() == null) return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false) return false; 
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null) return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false) return false; 
        return true;
    }
    
}
    