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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * A list that contains detailed configurations of a specified resource.
 * </p>
 * <p>
 * <b>NOTE:</b> Currently, the list does not contain information about
 * non-AWS components (for example, applications on your Amazon EC2
 * instances).
 * </p>
 */
public class ConfigurationItem implements Serializable {

    /**
     * The version number of the resource configuration.
     */
    private String version;

    /**
     * The 12 digit AWS account ID associated with the resource.
     */
    private String accountId;

    /**
     * The time when the configuration recording was initiated.
     */
    private java.util.Date configurationItemCaptureTime;

    /**
     * The configuration item status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ok, Failed, Discovered, Deleted
     */
    private String configurationItemStatus;

    /**
     * An identifier that indicates the ordering of the configuration items
     * of a resource.
     */
    private String configurationStateId;

    /**
     * Unique MD5 hash that represents the configuration item's state. <p>You
     * can use MD5 hash to compare the states of two or more configuration
     * items that are associated with the same resource.
     */
    private String configurationItemMD5Hash;

    /**
     * The Amazon Resource Name (ARN) of the resource.
     */
    private String arn;

    /**
     * The type of AWS resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     */
    private String resourceType;

    /**
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     */
    private String resourceId;

    /**
     * The Availability Zone associated with the resource.
     */
    private String availabilityZone;

    /**
     * The time stamp when the resource was created.
     */
    private java.util.Date resourceCreationTime;

    /**
     * A mapping of key value tags associated with the resource.
     */
    private java.util.Map<String,String> tags;

    /**
     * A list of CloudTrail event IDs. <p>A populated field indicates that
     * the current configuration was initiated by the events recorded in the
     * CloudTrail log. For more information about CloudTrail, see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What
     * is AWS CloudTrail?</a>. <p>An empty field indicates that the current
     * configuration was not initiated by any event.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> relatedEvents;

    /**
     * A list of related AWS resources.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Relationship> relationships;

    /**
     * The description of the resource configuration.
     */
    private String configuration;

    /**
     * The version number of the resource configuration.
     *
     * @return The version number of the resource configuration.
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * The version number of the resource configuration.
     *
     * @param version The version number of the resource configuration.
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * The version number of the resource configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param version The version number of the resource configuration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * The 12 digit AWS account ID associated with the resource.
     *
     * @return The 12 digit AWS account ID associated with the resource.
     */
    public String getAccountId() {
        return accountId;
    }
    
    /**
     * The 12 digit AWS account ID associated with the resource.
     *
     * @param accountId The 12 digit AWS account ID associated with the resource.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    /**
     * The 12 digit AWS account ID associated with the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountId The 12 digit AWS account ID associated with the resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * The time when the configuration recording was initiated.
     *
     * @return The time when the configuration recording was initiated.
     */
    public java.util.Date getConfigurationItemCaptureTime() {
        return configurationItemCaptureTime;
    }
    
    /**
     * The time when the configuration recording was initiated.
     *
     * @param configurationItemCaptureTime The time when the configuration recording was initiated.
     */
    public void setConfigurationItemCaptureTime(java.util.Date configurationItemCaptureTime) {
        this.configurationItemCaptureTime = configurationItemCaptureTime;
    }
    
    /**
     * The time when the configuration recording was initiated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationItemCaptureTime The time when the configuration recording was initiated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withConfigurationItemCaptureTime(java.util.Date configurationItemCaptureTime) {
        this.configurationItemCaptureTime = configurationItemCaptureTime;
        return this;
    }

    /**
     * The configuration item status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ok, Failed, Discovered, Deleted
     *
     * @return The configuration item status.
     *
     * @see ConfigurationItemStatus
     */
    public String getConfigurationItemStatus() {
        return configurationItemStatus;
    }
    
    /**
     * The configuration item status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ok, Failed, Discovered, Deleted
     *
     * @param configurationItemStatus The configuration item status.
     *
     * @see ConfigurationItemStatus
     */
    public void setConfigurationItemStatus(String configurationItemStatus) {
        this.configurationItemStatus = configurationItemStatus;
    }
    
    /**
     * The configuration item status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ok, Failed, Discovered, Deleted
     *
     * @param configurationItemStatus The configuration item status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ConfigurationItemStatus
     */
    public ConfigurationItem withConfigurationItemStatus(String configurationItemStatus) {
        this.configurationItemStatus = configurationItemStatus;
        return this;
    }

    /**
     * The configuration item status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ok, Failed, Discovered, Deleted
     *
     * @param configurationItemStatus The configuration item status.
     *
     * @see ConfigurationItemStatus
     */
    public void setConfigurationItemStatus(ConfigurationItemStatus configurationItemStatus) {
        this.configurationItemStatus = configurationItemStatus.toString();
    }
    
    /**
     * The configuration item status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Ok, Failed, Discovered, Deleted
     *
     * @param configurationItemStatus The configuration item status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ConfigurationItemStatus
     */
    public ConfigurationItem withConfigurationItemStatus(ConfigurationItemStatus configurationItemStatus) {
        this.configurationItemStatus = configurationItemStatus.toString();
        return this;
    }

    /**
     * An identifier that indicates the ordering of the configuration items
     * of a resource.
     *
     * @return An identifier that indicates the ordering of the configuration items
     *         of a resource.
     */
    public String getConfigurationStateId() {
        return configurationStateId;
    }
    
    /**
     * An identifier that indicates the ordering of the configuration items
     * of a resource.
     *
     * @param configurationStateId An identifier that indicates the ordering of the configuration items
     *         of a resource.
     */
    public void setConfigurationStateId(String configurationStateId) {
        this.configurationStateId = configurationStateId;
    }
    
    /**
     * An identifier that indicates the ordering of the configuration items
     * of a resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationStateId An identifier that indicates the ordering of the configuration items
     *         of a resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withConfigurationStateId(String configurationStateId) {
        this.configurationStateId = configurationStateId;
        return this;
    }

    /**
     * Unique MD5 hash that represents the configuration item's state. <p>You
     * can use MD5 hash to compare the states of two or more configuration
     * items that are associated with the same resource.
     *
     * @return Unique MD5 hash that represents the configuration item's state. <p>You
     *         can use MD5 hash to compare the states of two or more configuration
     *         items that are associated with the same resource.
     */
    public String getConfigurationItemMD5Hash() {
        return configurationItemMD5Hash;
    }
    
    /**
     * Unique MD5 hash that represents the configuration item's state. <p>You
     * can use MD5 hash to compare the states of two or more configuration
     * items that are associated with the same resource.
     *
     * @param configurationItemMD5Hash Unique MD5 hash that represents the configuration item's state. <p>You
     *         can use MD5 hash to compare the states of two or more configuration
     *         items that are associated with the same resource.
     */
    public void setConfigurationItemMD5Hash(String configurationItemMD5Hash) {
        this.configurationItemMD5Hash = configurationItemMD5Hash;
    }
    
    /**
     * Unique MD5 hash that represents the configuration item's state. <p>You
     * can use MD5 hash to compare the states of two or more configuration
     * items that are associated with the same resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationItemMD5Hash Unique MD5 hash that represents the configuration item's state. <p>You
     *         can use MD5 hash to compare the states of two or more configuration
     *         items that are associated with the same resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withConfigurationItemMD5Hash(String configurationItemMD5Hash) {
        this.configurationItemMD5Hash = configurationItemMD5Hash;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the resource.
     *
     * @return The Amazon Resource Name (ARN) of the resource.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the resource.
     *
     * @param arn The Amazon Resource Name (ARN) of the resource.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param arn The Amazon Resource Name (ARN) of the resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The type of AWS resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @return The type of AWS resource.
     *
     * @see ResourceType
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The type of AWS resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The type of AWS resource.
     *
     * @see ResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The type of AWS resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The type of AWS resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ResourceType
     */
    public ConfigurationItem withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The type of AWS resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The type of AWS resource.
     *
     * @see ResourceType
     */
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }
    
    /**
     * The type of AWS resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AWS::EC2::CustomerGateway, AWS::EC2::EIP, AWS::EC2::Instance, AWS::EC2::InternetGateway, AWS::EC2::NetworkAcl, AWS::EC2::NetworkInterface, AWS::EC2::RouteTable, AWS::EC2::SecurityGroup, AWS::EC2::Subnet, AWS::CloudTrail::Trail, AWS::EC2::Volume, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway
     *
     * @param resourceType The type of AWS resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ResourceType
     */
    public ConfigurationItem withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     *
     * @return The ID of the resource (for example., <code>sg-xxxxxx</code>).
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     *
     * @param resourceId The ID of the resource (for example., <code>sg-xxxxxx</code>).
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceId The ID of the resource (for example., <code>sg-xxxxxx</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * The Availability Zone associated with the resource.
     *
     * @return The Availability Zone associated with the resource.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone associated with the resource.
     *
     * @param availabilityZone The Availability Zone associated with the resource.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone associated with the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone associated with the resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The time stamp when the resource was created.
     *
     * @return The time stamp when the resource was created.
     */
    public java.util.Date getResourceCreationTime() {
        return resourceCreationTime;
    }
    
    /**
     * The time stamp when the resource was created.
     *
     * @param resourceCreationTime The time stamp when the resource was created.
     */
    public void setResourceCreationTime(java.util.Date resourceCreationTime) {
        this.resourceCreationTime = resourceCreationTime;
    }
    
    /**
     * The time stamp when the resource was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceCreationTime The time stamp when the resource was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withResourceCreationTime(java.util.Date resourceCreationTime) {
        this.resourceCreationTime = resourceCreationTime;
        return this;
    }

    /**
     * A mapping of key value tags associated with the resource.
     *
     * @return A mapping of key value tags associated with the resource.
     */
    public java.util.Map<String,String> getTags() {
        
        if (tags == null) {
            tags = new java.util.HashMap<String,String>();
        }
        return tags;
    }
    
    /**
     * A mapping of key value tags associated with the resource.
     *
     * @param tags A mapping of key value tags associated with the resource.
     */
    public void setTags(java.util.Map<String,String> tags) {
        this.tags = tags;
    }
    
    /**
     * A mapping of key value tags associated with the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A mapping of key value tags associated with the resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withTags(java.util.Map<String,String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * A mapping of key value tags associated with the resource.
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns
     * a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     */
    public ConfigurationItem addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String,String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public ConfigurationItem clearTagsEntries() {
        this.tags = null;
        return this;
    }
    
    /**
     * A list of CloudTrail event IDs. <p>A populated field indicates that
     * the current configuration was initiated by the events recorded in the
     * CloudTrail log. For more information about CloudTrail, see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What
     * is AWS CloudTrail?</a>. <p>An empty field indicates that the current
     * configuration was not initiated by any event.
     *
     * @return A list of CloudTrail event IDs. <p>A populated field indicates that
     *         the current configuration was initiated by the events recorded in the
     *         CloudTrail log. For more information about CloudTrail, see <a
     *         href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What
     *         is AWS CloudTrail?</a>. <p>An empty field indicates that the current
     *         configuration was not initiated by any event.
     */
    public java.util.List<String> getRelatedEvents() {
        if (relatedEvents == null) {
              relatedEvents = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              relatedEvents.setAutoConstruct(true);
        }
        return relatedEvents;
    }
    
    /**
     * A list of CloudTrail event IDs. <p>A populated field indicates that
     * the current configuration was initiated by the events recorded in the
     * CloudTrail log. For more information about CloudTrail, see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What
     * is AWS CloudTrail?</a>. <p>An empty field indicates that the current
     * configuration was not initiated by any event.
     *
     * @param relatedEvents A list of CloudTrail event IDs. <p>A populated field indicates that
     *         the current configuration was initiated by the events recorded in the
     *         CloudTrail log. For more information about CloudTrail, see <a
     *         href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What
     *         is AWS CloudTrail?</a>. <p>An empty field indicates that the current
     *         configuration was not initiated by any event.
     */
    public void setRelatedEvents(java.util.Collection<String> relatedEvents) {
        if (relatedEvents == null) {
            this.relatedEvents = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> relatedEventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(relatedEvents.size());
        relatedEventsCopy.addAll(relatedEvents);
        this.relatedEvents = relatedEventsCopy;
    }
    
    /**
     * A list of CloudTrail event IDs. <p>A populated field indicates that
     * the current configuration was initiated by the events recorded in the
     * CloudTrail log. For more information about CloudTrail, see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What
     * is AWS CloudTrail?</a>. <p>An empty field indicates that the current
     * configuration was not initiated by any event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param relatedEvents A list of CloudTrail event IDs. <p>A populated field indicates that
     *         the current configuration was initiated by the events recorded in the
     *         CloudTrail log. For more information about CloudTrail, see <a
     *         href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What
     *         is AWS CloudTrail?</a>. <p>An empty field indicates that the current
     *         configuration was not initiated by any event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withRelatedEvents(String... relatedEvents) {
        if (getRelatedEvents() == null) setRelatedEvents(new java.util.ArrayList<String>(relatedEvents.length));
        for (String value : relatedEvents) {
            getRelatedEvents().add(value);
        }
        return this;
    }
    
    /**
     * A list of CloudTrail event IDs. <p>A populated field indicates that
     * the current configuration was initiated by the events recorded in the
     * CloudTrail log. For more information about CloudTrail, see <a
     * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What
     * is AWS CloudTrail?</a>. <p>An empty field indicates that the current
     * configuration was not initiated by any event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param relatedEvents A list of CloudTrail event IDs. <p>A populated field indicates that
     *         the current configuration was initiated by the events recorded in the
     *         CloudTrail log. For more information about CloudTrail, see <a
     *         href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What
     *         is AWS CloudTrail?</a>. <p>An empty field indicates that the current
     *         configuration was not initiated by any event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withRelatedEvents(java.util.Collection<String> relatedEvents) {
        if (relatedEvents == null) {
            this.relatedEvents = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> relatedEventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(relatedEvents.size());
            relatedEventsCopy.addAll(relatedEvents);
            this.relatedEvents = relatedEventsCopy;
        }

        return this;
    }

    /**
     * A list of related AWS resources.
     *
     * @return A list of related AWS resources.
     */
    public java.util.List<Relationship> getRelationships() {
        if (relationships == null) {
              relationships = new com.amazonaws.internal.ListWithAutoConstructFlag<Relationship>();
              relationships.setAutoConstruct(true);
        }
        return relationships;
    }
    
    /**
     * A list of related AWS resources.
     *
     * @param relationships A list of related AWS resources.
     */
    public void setRelationships(java.util.Collection<Relationship> relationships) {
        if (relationships == null) {
            this.relationships = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Relationship> relationshipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Relationship>(relationships.size());
        relationshipsCopy.addAll(relationships);
        this.relationships = relationshipsCopy;
    }
    
    /**
     * A list of related AWS resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param relationships A list of related AWS resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withRelationships(Relationship... relationships) {
        if (getRelationships() == null) setRelationships(new java.util.ArrayList<Relationship>(relationships.length));
        for (Relationship value : relationships) {
            getRelationships().add(value);
        }
        return this;
    }
    
    /**
     * A list of related AWS resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param relationships A list of related AWS resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withRelationships(java.util.Collection<Relationship> relationships) {
        if (relationships == null) {
            this.relationships = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Relationship> relationshipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Relationship>(relationships.size());
            relationshipsCopy.addAll(relationships);
            this.relationships = relationshipsCopy;
        }

        return this;
    }

    /**
     * The description of the resource configuration.
     *
     * @return The description of the resource configuration.
     */
    public String getConfiguration() {
        return configuration;
    }
    
    /**
     * The description of the resource configuration.
     *
     * @param configuration The description of the resource configuration.
     */
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
    
    /**
     * The description of the resource configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configuration The description of the resource configuration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ConfigurationItem withConfiguration(String configuration) {
        this.configuration = configuration;
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
        if (getVersion() != null) sb.append("Version: " + getVersion() + ",");
        if (getAccountId() != null) sb.append("AccountId: " + getAccountId() + ",");
        if (getConfigurationItemCaptureTime() != null) sb.append("ConfigurationItemCaptureTime: " + getConfigurationItemCaptureTime() + ",");
        if (getConfigurationItemStatus() != null) sb.append("ConfigurationItemStatus: " + getConfigurationItemStatus() + ",");
        if (getConfigurationStateId() != null) sb.append("ConfigurationStateId: " + getConfigurationStateId() + ",");
        if (getConfigurationItemMD5Hash() != null) sb.append("ConfigurationItemMD5Hash: " + getConfigurationItemMD5Hash() + ",");
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getResourceCreationTime() != null) sb.append("ResourceCreationTime: " + getResourceCreationTime() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getRelatedEvents() != null) sb.append("RelatedEvents: " + getRelatedEvents() + ",");
        if (getRelationships() != null) sb.append("Relationships: " + getRelationships() + ",");
        if (getConfiguration() != null) sb.append("Configuration: " + getConfiguration() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getConfigurationItemCaptureTime() == null) ? 0 : getConfigurationItemCaptureTime().hashCode()); 
        hashCode = prime * hashCode + ((getConfigurationItemStatus() == null) ? 0 : getConfigurationItemStatus().hashCode()); 
        hashCode = prime * hashCode + ((getConfigurationStateId() == null) ? 0 : getConfigurationStateId().hashCode()); 
        hashCode = prime * hashCode + ((getConfigurationItemMD5Hash() == null) ? 0 : getConfigurationItemMD5Hash().hashCode()); 
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getResourceCreationTime() == null) ? 0 : getResourceCreationTime().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getRelatedEvents() == null) ? 0 : getRelatedEvents().hashCode()); 
        hashCode = prime * hashCode + ((getRelationships() == null) ? 0 : getRelationships().hashCode()); 
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfigurationItem == false) return false;
        ConfigurationItem other = (ConfigurationItem)obj;
        
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getConfigurationItemCaptureTime() == null ^ this.getConfigurationItemCaptureTime() == null) return false;
        if (other.getConfigurationItemCaptureTime() != null && other.getConfigurationItemCaptureTime().equals(this.getConfigurationItemCaptureTime()) == false) return false; 
        if (other.getConfigurationItemStatus() == null ^ this.getConfigurationItemStatus() == null) return false;
        if (other.getConfigurationItemStatus() != null && other.getConfigurationItemStatus().equals(this.getConfigurationItemStatus()) == false) return false; 
        if (other.getConfigurationStateId() == null ^ this.getConfigurationStateId() == null) return false;
        if (other.getConfigurationStateId() != null && other.getConfigurationStateId().equals(this.getConfigurationStateId()) == false) return false; 
        if (other.getConfigurationItemMD5Hash() == null ^ this.getConfigurationItemMD5Hash() == null) return false;
        if (other.getConfigurationItemMD5Hash() != null && other.getConfigurationItemMD5Hash().equals(this.getConfigurationItemMD5Hash()) == false) return false; 
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getResourceCreationTime() == null ^ this.getResourceCreationTime() == null) return false;
        if (other.getResourceCreationTime() != null && other.getResourceCreationTime().equals(this.getResourceCreationTime()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getRelatedEvents() == null ^ this.getRelatedEvents() == null) return false;
        if (other.getRelatedEvents() != null && other.getRelatedEvents().equals(this.getRelatedEvents()) == false) return false; 
        if (other.getRelationships() == null ^ this.getRelationships() == null) return false;
        if (other.getRelationships() != null && other.getRelationships().equals(this.getRelationships()) == false) return false; 
        if (other.getConfiguration() == null ^ this.getConfiguration() == null) return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false) return false; 
        return true;
    }
    
}
    