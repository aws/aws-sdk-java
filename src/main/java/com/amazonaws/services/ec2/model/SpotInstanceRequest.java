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
 * 
 * </p>
 */
public class SpotInstanceRequest {

    /**
     * 
     */
    private String spotInstanceRequestId;

    /**
     * 
     */
    private String spotPrice;

    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     */
    private String type;

    /**
     * 
     */
    private String state;

    /**
     * 
     */
    private SpotInstanceStateFault fault;

    /**
     * 
     */
    private java.util.Date validFrom;

    /**
     * 
     */
    private java.util.Date validUntil;

    /**
     * 
     */
    private String launchGroup;

    /**
     * 
     */
    private String availabilityZoneGroup;

    /**
     * 
     */
    private LaunchSpecification launchSpecification;

    /**
     * 
     */
    private String instanceId;

    /**
     * 
     */
    private java.util.Date createTime;

    /**
     * 
     */
    private String productDescription;

    /**
     * A list of tags for this spot instance request.
     */
    private java.util.List<Tag> tags;

    /**
     * 
     *
     * @return 
     */
    public String getSpotInstanceRequestId() {
        return spotInstanceRequestId;
    }
    
    /**
     * 
     *
     * @param spotInstanceRequestId 
     */
    public void setSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestId 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceRequest withSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getSpotPrice() {
        return spotPrice;
    }
    
    /**
     * 
     *
     * @param spotPrice 
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotPrice 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceRequest withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }
    
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @return 
     *
     * @see SpotInstanceType
     */
    public String getType() {
        return type;
    }
    
    /**
     * 
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type 
     *
     * @see SpotInstanceType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>one-time, persistent
     *
     * @param type 
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
     * 
     *
     * @return 
     */
    public String getState() {
        return state;
    }
    
    /**
     * 
     *
     * @param state 
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceRequest withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public SpotInstanceStateFault getFault() {
        return fault;
    }
    
    /**
     * 
     *
     * @param fault 
     */
    public void setFault(SpotInstanceStateFault fault) {
        this.fault = fault;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fault 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceRequest withFault(SpotInstanceStateFault fault) {
        this.fault = fault;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public java.util.Date getValidFrom() {
        return validFrom;
    }
    
    /**
     * 
     *
     * @param validFrom 
     */
    public void setValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validFrom 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceRequest withValidFrom(java.util.Date validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public java.util.Date getValidUntil() {
        return validUntil;
    }
    
    /**
     * 
     *
     * @param validUntil 
     */
    public void setValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validUntil 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceRequest withValidUntil(java.util.Date validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getLaunchGroup() {
        return launchGroup;
    }
    
    /**
     * 
     *
     * @param launchGroup 
     */
    public void setLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchGroup 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceRequest withLaunchGroup(String launchGroup) {
        this.launchGroup = launchGroup;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getAvailabilityZoneGroup() {
        return availabilityZoneGroup;
    }
    
    /**
     * 
     *
     * @param availabilityZoneGroup 
     */
    public void setAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZoneGroup 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceRequest withAvailabilityZoneGroup(String availabilityZoneGroup) {
        this.availabilityZoneGroup = availabilityZoneGroup;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public LaunchSpecification getLaunchSpecification() {
        return launchSpecification;
    }
    
    /**
     * 
     *
     * @param launchSpecification 
     */
    public void setLaunchSpecification(LaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchSpecification 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceRequest withLaunchSpecification(LaunchSpecification launchSpecification) {
        this.launchSpecification = launchSpecification;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * 
     *
     * @param instanceId 
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }
    
    /**
     * 
     *
     * @param createTime 
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createTime 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SpotInstanceRequest withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }
    
    
    /**
     * 
     *
     * @return 
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * 
     *
     * @param productDescription 
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productDescription 
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
        sb.append("}");
        return sb.toString();
    }
    
}
    