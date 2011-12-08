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
package com.amazonaws.services.ec2.model;

/**
 * Spot Instance Request
 */
public class SpotInstanceRequest {

    private String spotInstanceRequestId;

    private String spotPrice;

    private String type;

    private String state;

    private SpotInstanceStateFault fault;

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
    private java.util.List<Tag> tags;

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
     *
     * @return The value of the State property for this object.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets the value of the State property for this object.
     *
     * @param state The new value for the State property for this object.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceRequest withState(String state) {
        this.state = state;
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
     *
     * @return The value of the ProductDescription property for this object.
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * Sets the value of the ProductDescription property for this object.
     *
     * @param productDescription The new value for the ProductDescription property for this object.
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * Sets the value of the ProductDescription property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription The new value for the ProductDescription property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceRequest withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }
    
    
    /**
     * A list of tags for this spot instance request.
     *
     * @return A list of tags for this spot instance request.
     */
    public java.util.List<Tag> getTags() {
        
        if (tags == null) {
            tags = new java.util.ArrayList<Tag>();
        }
        return tags;
    }
    
    /**
     * A list of tags for this spot instance request.
     *
     * @param tags A list of tags for this spot instance request.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
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
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>());
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
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
        this.tags = tagsCopy;

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
        sb.append("SpotInstanceRequestId: " + spotInstanceRequestId + ", ");
        sb.append("SpotPrice: " + spotPrice + ", ");
        sb.append("Type: " + type + ", ");
        sb.append("State: " + state + ", ");
        sb.append("Fault: " + fault + ", ");
        sb.append("ValidFrom: " + validFrom + ", ");
        sb.append("ValidUntil: " + validUntil + ", ");
        sb.append("LaunchGroup: " + launchGroup + ", ");
        sb.append("AvailabilityZoneGroup: " + availabilityZoneGroup + ", ");
        sb.append("LaunchSpecification: " + launchSpecification + ", ");
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("CreateTime: " + createTime + ", ");
        sb.append("ProductDescription: " + productDescription + ", ");
        sb.append("Tags: " + tags + ", ");
        sb.append("LaunchedAvailabilityZone: " + launchedAvailabilityZone + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    