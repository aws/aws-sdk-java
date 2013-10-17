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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * Spot Instance Request
 */
public class SpotInstanceRequest implements Serializable {

    private String spotInstanceRequestId;

    private String spotPrice;

    private String type;

    private String state;

    private SpotInstanceStateFault fault;

    private SpotInstanceStatus status;

    private java.util.Date validFrom;

    private java.util.Date validUntil;

    private String launchGroup;

    private String availabilityZoneGroup;

    /**
     * The LaunchSpecificationType data type.
     */
    private LaunchSpecification launchSpecification;

    private String instanceId;

    private java.util.Date createTime;

    private String productDescription;

    /**
     * A list of tags for this spot instance request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The Availability Zone in which the bid is launched.
     */
    private String launchedAvailabilityZone;

    /**
     * Returns the value of the SpotInstanceRequestId property for this
     * object.
     *
     * @return The value of the SpotInstanceRequestId property for this object.
     */
    public String getSpotInstanceRequestId() {
        return spotInstanceRequestId;
    }
    
    /**
     * Sets the value of the SpotInstanceRequestId property for this object.
     *
     * @param spotInstanceRequestId The new value for the SpotInstanceRequestId property for this object.
     */
    public void setSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
    }
    
    /**
     * Sets the value of the SpotInstanceRequestId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestId The new value for the SpotInstanceRequestId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
        return this;
    }

    /**
     * Returns the value of the SpotPrice property for this object.
     *
     * @return The value of the SpotPrice property for this object.
     */
    public String getSpotPrice() {
        return spotPrice;
    }
    
    /**
     * Sets the value of the SpotPrice property for this object.
     *
     * @param spotPrice The new value for the SpotPrice property for this object.
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }
    
    /**
     * Sets the value of the SpotPrice property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotPrice The new value for the SpotPrice property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * Returns the value of the Type property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @return The value of the Type property for this object.
     *
     * @see SpotInstanceType
     */
    public String getType() {
        return type;
    }
    
    /**
     * Sets the value of the Type property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type The new value for the Type property for this object.
     *
     * @see SpotInstanceType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Sets the value of the Type property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type The new value for the Type property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SpotInstanceType
     */
    public SpotInstanceRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Sets the value of the Type property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type The new value for the Type property for this object.
     *
     * @see SpotInstanceType
     */
    public void setType(SpotInstanceType type) {
        this.type = type.toString();
    }
    
    /**
     * Sets the value of the Type property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type The new value for the Type property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SpotInstanceType
     */
    public SpotInstanceRequest withType(SpotInstanceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * Returns the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @return The value of the State property for this object.
     *
     * @see SpotInstanceState
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @param state The new value for the State property for this object.
     *
     * @see SpotInstanceState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SpotInstanceState
     */
    public SpotInstanceRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Sets the value of the State property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @param state The new value for the State property for this object.
     *
     * @see SpotInstanceState
     */
    public void setState(SpotInstanceState state) {
        this.state = state.toString();
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, active, closed, cancelled, failed
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see SpotInstanceState
     */
    public SpotInstanceRequest withState(SpotInstanceState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * Returns the value of the Fault property for this object.
     *
     * @return The value of the Fault property for this object.
     */
    public SpotInstanceStateFault getFault() {
        return fault;
    }
    
    /**
     * Sets the value of the Fault property for this object.
     *
     * @param fault The new value for the Fault property for this object.
     */
    public void setFault(SpotInstanceStateFault fault) {
        this.fault = fault;
    }
    
    /**
     * Sets the value of the Fault property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fault The new value for the Fault property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withFault(SpotInstanceStateFault fault) {
        this.fault = fault;
        return this;
    }

    /**
     * Returns the value of the Status property for this object.
     *
     * @return The value of the Status property for this object.
     */
    public SpotInstanceStatus getStatus() {
        return status;
    }
    
    /**
     * Sets the value of the Status property for this object.
     *
     * @param status The new value for the Status property for this object.
     */
    public void setStatus(SpotInstanceStatus status) {
        this.status = status;
    }
    
    /**
     * Sets the value of the Status property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The new value for the Status property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withStatus(SpotInstanceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns the value of the ValidFrom property for this object.
     *
     * @return The value of the ValidFrom property for this object.
     */
    public java.util.Date getValidFrom() {
        return validFrom;
    }
    
    /**
     * Sets the value of the ValidFrom property for this object.
     *
     * @param validFrom The new value for the ValidFrom property for this object.
     */
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }
    
    /**
     * Sets the value of the ValidFrom property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validFrom The new value for the ValidFrom property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * Returns the value of the ValidUntil property for this object.
     *
     * @return The value of the ValidUntil property for this object.
     */
    public java.util.Date getValidUntil() {
        return validUntil;
    }
    
    /**
     * Sets the value of the ValidUntil property for this object.
     *
     * @param validUntil The new value for the ValidUntil property for this object.
     */
    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }
    
    /**
     * Sets the value of the ValidUntil property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validUntil The new value for the ValidUntil property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * Returns the value of the LaunchGroup property for this object.
     *
     * @return The value of the LaunchGroup property for this object.
     */
    public String getLaunchGroup() {
        return launchGroup;
    }
    
    /**
     * Sets the value of the LaunchGroup property for this object.
     *
     * @param launchGroup The new value for the LaunchGroup property for this object.
     */
    public void setLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
    }
    
    /**
     * Sets the value of the LaunchGroup property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchGroup The new value for the LaunchGroup property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
        return this;
    }

    /**
     * Returns the value of the AvailabilityZoneGroup property for this
     * object.
     *
     * @return The value of the AvailabilityZoneGroup property for this object.
     */
    public String getAvailabilityZoneGroup() {
        return availabilityZoneGroup;
    }
    
    /**
     * Sets the value of the AvailabilityZoneGroup property for this object.
     *
     * @param availabilityZoneGroup The new value for the AvailabilityZoneGroup property for this object.
     */
    public void setAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
    }
    
    /**
     * Sets the value of the AvailabilityZoneGroup property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZoneGroup The new value for the AvailabilityZoneGroup property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
        return this;
    }

    /**
     * The LaunchSpecificationType data type.
     *
     * @return The LaunchSpecificationType data type.
     */
    public LaunchSpecification getLaunchSpecification() {
        return launchSpecification;
    }
    
    /**
     * The LaunchSpecificationType data type.
     *
     * @param launchSpecification The LaunchSpecificationType data type.
     */
    public void setLaunchSpecification(LaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }
    
    /**
     * The LaunchSpecificationType data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchSpecification The LaunchSpecificationType data type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withLaunchSpecification(LaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
        return this;
    }

    /**
     * Returns the value of the InstanceId property for this object.
     *
     * @return The value of the InstanceId property for this object.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * Sets the value of the InstanceId property for this object.
     *
     * @param instanceId The new value for the InstanceId property for this object.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * Sets the value of the InstanceId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The new value for the InstanceId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Returns the value of the CreateTime property for this object.
     *
     * @return The value of the CreateTime property for this object.
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }
    
    /**
     * Sets the value of the CreateTime property for this object.
     *
     * @param createTime The new value for the CreateTime property for this object.
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }
    
    /**
     * Sets the value of the CreateTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createTime The new value for the CreateTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Returns the value of the ProductDescription property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @return The value of the ProductDescription property for this object.
     *
     * @see RIProductDescription
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * Sets the value of the ProductDescription property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The new value for the ProductDescription property for this object.
     *
     * @see RIProductDescription
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * Sets the value of the ProductDescription property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The new value for the ProductDescription property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RIProductDescription
     */
    public SpotInstanceRequest withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * Sets the value of the ProductDescription property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The new value for the ProductDescription property for this object.
     *
     * @see RIProductDescription
     */
    public void setProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
    }
    
    /**
     * Sets the value of the ProductDescription property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The new value for the ProductDescription property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RIProductDescription
     */
    public SpotInstanceRequest withProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
        return this;
    }

    /**
     * A list of tags for this spot instance request.
     *
     * @return A list of tags for this spot instance request.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags for this spot instance request.
     *
     * @param tags A list of tags for this spot instance request.
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
     * A list of tags for this spot instance request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for this spot instance request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags for this spot instance request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for this spot instance request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withTags(java.util.Collection<Tag> tags) {
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
     * The Availability Zone in which the bid is launched.
     *
     * @return The Availability Zone in which the bid is launched.
     */
    public String getLaunchedAvailabilityZone() {
        return launchedAvailabilityZone;
    }
    
    /**
     * The Availability Zone in which the bid is launched.
     *
     * @param launchedAvailabilityZone The Availability Zone in which the bid is launched.
     */
    public void setLaunchedAvailabilityZone(String launchedAvailabilityZone) {
        this.launchedAvailabilityZone = launchedAvailabilityZone;
    }
    
    /**
     * The Availability Zone in which the bid is launched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchedAvailabilityZone The Availability Zone in which the bid is launched.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SpotInstanceRequest withLaunchedAvailabilityZone(String launchedAvailabilityZone) {
        this.launchedAvailabilityZone = launchedAvailabilityZone;
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
        if (getSpotInstanceRequestId() != null) sb.append("SpotInstanceRequestId: " + getSpotInstanceRequestId() + ",");
        if (getSpotPrice() != null) sb.append("SpotPrice: " + getSpotPrice() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getFault() != null) sb.append("Fault: " + getFault() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getValidFrom() != null) sb.append("ValidFrom: " + getValidFrom() + ",");
        if (getValidUntil() != null) sb.append("ValidUntil: " + getValidUntil() + ",");
        if (getLaunchGroup() != null) sb.append("LaunchGroup: " + getLaunchGroup() + ",");
        if (getAvailabilityZoneGroup() != null) sb.append("AvailabilityZoneGroup: " + getAvailabilityZoneGroup() + ",");
        if (getLaunchSpecification() != null) sb.append("LaunchSpecification: " + getLaunchSpecification() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getCreateTime() != null) sb.append("CreateTime: " + getCreateTime() + ",");
        if (getProductDescription() != null) sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getLaunchedAvailabilityZone() != null) sb.append("LaunchedAvailabilityZone: " + getLaunchedAvailabilityZone() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotInstanceRequestId() == null) ? 0 : getSpotInstanceRequestId().hashCode()); 
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getFault() == null) ? 0 : getFault().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getValidFrom() == null) ? 0 : getValidFrom().hashCode()); 
        hashCode = prime * hashCode + ((getValidUntil() == null) ? 0 : getValidUntil().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchGroup() == null) ? 0 : getLaunchGroup().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZoneGroup() == null) ? 0 : getAvailabilityZoneGroup().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchSpecification() == null) ? 0 : getLaunchSpecification().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode()); 
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchedAvailabilityZone() == null) ? 0 : getLaunchedAvailabilityZone().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SpotInstanceRequest == false) return false;
        SpotInstanceRequest other = (SpotInstanceRequest)obj;
        
        if (other.getSpotInstanceRequestId() == null ^ this.getSpotInstanceRequestId() == null) return false;
        if (other.getSpotInstanceRequestId() != null && other.getSpotInstanceRequestId().equals(this.getSpotInstanceRequestId()) == false) return false; 
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null) return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getFault() == null ^ this.getFault() == null) return false;
        if (other.getFault() != null && other.getFault().equals(this.getFault()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getValidFrom() == null ^ this.getValidFrom() == null) return false;
        if (other.getValidFrom() != null && other.getValidFrom().equals(this.getValidFrom()) == false) return false; 
        if (other.getValidUntil() == null ^ this.getValidUntil() == null) return false;
        if (other.getValidUntil() != null && other.getValidUntil().equals(this.getValidUntil()) == false) return false; 
        if (other.getLaunchGroup() == null ^ this.getLaunchGroup() == null) return false;
        if (other.getLaunchGroup() != null && other.getLaunchGroup().equals(this.getLaunchGroup()) == false) return false; 
        if (other.getAvailabilityZoneGroup() == null ^ this.getAvailabilityZoneGroup() == null) return false;
        if (other.getAvailabilityZoneGroup() != null && other.getAvailabilityZoneGroup().equals(this.getAvailabilityZoneGroup()) == false) return false; 
        if (other.getLaunchSpecification() == null ^ this.getLaunchSpecification() == null) return false;
        if (other.getLaunchSpecification() != null && other.getLaunchSpecification().equals(this.getLaunchSpecification()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getCreateTime() == null ^ this.getCreateTime() == null) return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false) return false; 
        if (other.getProductDescription() == null ^ this.getProductDescription() == null) return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getLaunchedAvailabilityZone() == null ^ this.getLaunchedAvailabilityZone() == null) return false;
        if (other.getLaunchedAvailabilityZone() != null && other.getLaunchedAvailabilityZone().equals(this.getLaunchedAvailabilityZone()) == false) return false; 
        return true;
    }
    
}
    