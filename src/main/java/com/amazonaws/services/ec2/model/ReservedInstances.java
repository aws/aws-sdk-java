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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
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
     * A list of tags for the ReservedInstances.
     */
    private java.util.List<Tag> tags;

    /**
     * The tenancy of the reserved instance (ex: default or dedicated).
     */
    private String instanceTenancy;

    /**
     * The currency of the reserved instance. Specified using ISO 4217
     * standard (e.g., USD, JPY).
     */
    private String currencyCode;

    /**
     * The Reserved Instance offering type.
     */
    private String offeringType;

    /**
     * The recurring charge tag assigned to the resource.
     */
    private java.util.List<RecurringCharge> recurringCharges;

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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
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
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
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
     * The instance type on which the Reserved Instances can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
     *
     * @param instanceType The instance type on which the Reserved Instances can be used.
     *
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }
    
    /**
     * The instance type on which the Reserved Instances can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
     *
     * @param instanceType The instance type on which the Reserved Instances can be used.
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
     * A list of tags for the ReservedInstances.
     *
     * @return A list of tags for the ReservedInstances.
     */
    public java.util.List<Tag> getTags() {
        
        if (tags == null) {
            tags = new java.util.ArrayList<Tag>();
        }
        return tags;
    }
    
    /**
     * A list of tags for the ReservedInstances.
     *
     * @param tags A list of tags for the ReservedInstances.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags for the ReservedInstances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the ReservedInstances.
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
     * A list of tags for the ReservedInstances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the ReservedInstances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstances withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }
    
    /**
     * The tenancy of the reserved instance (ex: default or dedicated).
     *
     * @return The tenancy of the reserved instance (ex: default or dedicated).
     */
    public String getInstanceTenancy() {
        return instanceTenancy;
    }
    
    /**
     * The tenancy of the reserved instance (ex: default or dedicated).
     *
     * @param instanceTenancy The tenancy of the reserved instance (ex: default or dedicated).
     */
    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }
    
    /**
     * The tenancy of the reserved instance (ex: default or dedicated).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceTenancy The tenancy of the reserved instance (ex: default or dedicated).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstances withInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
        return this;
    }
    
    
    /**
     * The currency of the reserved instance. Specified using ISO 4217
     * standard (e.g., USD, JPY).
     *
     * @return The currency of the reserved instance. Specified using ISO 4217
     *         standard (e.g., USD, JPY).
     */
    public String getCurrencyCode() {
        return currencyCode;
    }
    
    /**
     * The currency of the reserved instance. Specified using ISO 4217
     * standard (e.g., USD, JPY).
     *
     * @param currencyCode The currency of the reserved instance. Specified using ISO 4217
     *         standard (e.g., USD, JPY).
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    
    /**
     * The currency of the reserved instance. Specified using ISO 4217
     * standard (e.g., USD, JPY).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param currencyCode The currency of the reserved instance. Specified using ISO 4217
     *         standard (e.g., USD, JPY).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstances withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    
    
    /**
     * The Reserved Instance offering type.
     *
     * @return The Reserved Instance offering type.
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The Reserved Instance offering type.
     *
     * @param offeringType The Reserved Instance offering type.
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReservedInstances withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }
    
    
    /**
     * The recurring charge tag assigned to the resource.
     *
     * @return The recurring charge tag assigned to the resource.
     */
    public java.util.List<RecurringCharge> getRecurringCharges() {
        
        if (recurringCharges == null) {
            recurringCharges = new java.util.ArrayList<RecurringCharge>();
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

        java.util.List<RecurringCharge> recurringChargesCopy = new java.util.ArrayList<RecurringCharge>(recurringCharges.size());
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
            java.util.List<RecurringCharge> recurringChargesCopy = new java.util.ArrayList<RecurringCharge>(recurringCharges.size());
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
        if (reservedInstancesId != null) sb.append("ReservedInstancesId: " + reservedInstancesId + ", ");
        if (instanceType != null) sb.append("InstanceType: " + instanceType + ", ");
        if (availabilityZone != null) sb.append("AvailabilityZone: " + availabilityZone + ", ");
        if (start != null) sb.append("Start: " + start + ", ");
        if (duration != null) sb.append("Duration: " + duration + ", ");
        if (usagePrice != null) sb.append("UsagePrice: " + usagePrice + ", ");
        if (fixedPrice != null) sb.append("FixedPrice: " + fixedPrice + ", ");
        if (instanceCount != null) sb.append("InstanceCount: " + instanceCount + ", ");
        if (productDescription != null) sb.append("ProductDescription: " + productDescription + ", ");
        if (state != null) sb.append("State: " + state + ", ");
        if (tags != null) sb.append("Tags: " + tags + ", ");
        if (instanceTenancy != null) sb.append("InstanceTenancy: " + instanceTenancy + ", ");
        if (currencyCode != null) sb.append("CurrencyCode: " + currencyCode + ", ");
        if (offeringType != null) sb.append("OfferingType: " + offeringType + ", ");
        if (recurringCharges != null) sb.append("RecurringCharges: " + recurringCharges + ", ");
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
    