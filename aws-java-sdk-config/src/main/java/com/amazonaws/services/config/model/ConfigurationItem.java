/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list that contains detailed configurations of a specified resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConfigurationItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version number of the resource configuration.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The 12-digit AWS account ID associated with the resource.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The time when the configuration recording was initiated.
     * </p>
     */
    private java.util.Date configurationItemCaptureTime;
    /**
     * <p>
     * The configuration item status.
     * </p>
     */
    private String configurationItemStatus;
    /**
     * <p>
     * An identifier that indicates the ordering of the configuration items of a resource.
     * </p>
     */
    private String configurationStateId;
    /**
     * <p>
     * Unique MD5 hash that represents the configuration item's state.
     * </p>
     * <p>
     * You can use MD5 hash to compare the states of two or more configuration items that are associated with the same
     * resource.
     * </p>
     */
    private String configurationItemMD5Hash;
    /**
     * <p>
     * accoun
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The type of AWS resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The ID of the resource (for example, <code>sg-xxxxxx</code>).
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The custom name of the resource, if available.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The region where the resource resides.
     * </p>
     */
    private String awsRegion;
    /**
     * <p>
     * The Availability Zone associated with the resource.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The time stamp when the resource was created.
     * </p>
     */
    private java.util.Date resourceCreationTime;
    /**
     * <p>
     * A mapping of key value tags associated with the resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A list of CloudTrail event IDs.
     * </p>
     * <p>
     * A populated field indicates that the current configuration was initiated by the events recorded in the CloudTrail
     * log. For more information about CloudTrail, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What Is AWS
     * CloudTrail</a>.
     * </p>
     * <p>
     * An empty field indicates that the current configuration was not initiated by any event.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> relatedEvents;
    /**
     * <p>
     * A list of related AWS resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Relationship> relationships;
    /**
     * <p>
     * The description of the resource configuration.
     * </p>
     */
    private String configuration;
    /**
     * <p>
     * Configuration attributes that AWS Config returns for certain resource types to supplement the information
     * returned for the <code>configuration</code> parameter.
     * </p>
     */
    private java.util.Map<String, String> supplementaryConfiguration;

    /**
     * <p>
     * The version number of the resource configuration.
     * </p>
     * 
     * @param version
     *        The version number of the resource configuration.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number of the resource configuration.
     * </p>
     * 
     * @return The version number of the resource configuration.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version number of the resource configuration.
     * </p>
     * 
     * @param version
     *        The version number of the resource configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The 12-digit AWS account ID associated with the resource.
     * </p>
     * 
     * @param accountId
     *        The 12-digit AWS account ID associated with the resource.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The 12-digit AWS account ID associated with the resource.
     * </p>
     * 
     * @return The 12-digit AWS account ID associated with the resource.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The 12-digit AWS account ID associated with the resource.
     * </p>
     * 
     * @param accountId
     *        The 12-digit AWS account ID associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The time when the configuration recording was initiated.
     * </p>
     * 
     * @param configurationItemCaptureTime
     *        The time when the configuration recording was initiated.
     */

    public void setConfigurationItemCaptureTime(java.util.Date configurationItemCaptureTime) {
        this.configurationItemCaptureTime = configurationItemCaptureTime;
    }

    /**
     * <p>
     * The time when the configuration recording was initiated.
     * </p>
     * 
     * @return The time when the configuration recording was initiated.
     */

    public java.util.Date getConfigurationItemCaptureTime() {
        return this.configurationItemCaptureTime;
    }

    /**
     * <p>
     * The time when the configuration recording was initiated.
     * </p>
     * 
     * @param configurationItemCaptureTime
     *        The time when the configuration recording was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withConfigurationItemCaptureTime(java.util.Date configurationItemCaptureTime) {
        setConfigurationItemCaptureTime(configurationItemCaptureTime);
        return this;
    }

    /**
     * <p>
     * The configuration item status.
     * </p>
     * 
     * @param configurationItemStatus
     *        The configuration item status.
     * @see ConfigurationItemStatus
     */

    public void setConfigurationItemStatus(String configurationItemStatus) {
        this.configurationItemStatus = configurationItemStatus;
    }

    /**
     * <p>
     * The configuration item status.
     * </p>
     * 
     * @return The configuration item status.
     * @see ConfigurationItemStatus
     */

    public String getConfigurationItemStatus() {
        return this.configurationItemStatus;
    }

    /**
     * <p>
     * The configuration item status.
     * </p>
     * 
     * @param configurationItemStatus
     *        The configuration item status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationItemStatus
     */

    public ConfigurationItem withConfigurationItemStatus(String configurationItemStatus) {
        setConfigurationItemStatus(configurationItemStatus);
        return this;
    }

    /**
     * <p>
     * The configuration item status.
     * </p>
     * 
     * @param configurationItemStatus
     *        The configuration item status.
     * @see ConfigurationItemStatus
     */

    public void setConfigurationItemStatus(ConfigurationItemStatus configurationItemStatus) {
        withConfigurationItemStatus(configurationItemStatus);
    }

    /**
     * <p>
     * The configuration item status.
     * </p>
     * 
     * @param configurationItemStatus
     *        The configuration item status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationItemStatus
     */

    public ConfigurationItem withConfigurationItemStatus(ConfigurationItemStatus configurationItemStatus) {
        this.configurationItemStatus = configurationItemStatus.toString();
        return this;
    }

    /**
     * <p>
     * An identifier that indicates the ordering of the configuration items of a resource.
     * </p>
     * 
     * @param configurationStateId
     *        An identifier that indicates the ordering of the configuration items of a resource.
     */

    public void setConfigurationStateId(String configurationStateId) {
        this.configurationStateId = configurationStateId;
    }

    /**
     * <p>
     * An identifier that indicates the ordering of the configuration items of a resource.
     * </p>
     * 
     * @return An identifier that indicates the ordering of the configuration items of a resource.
     */

    public String getConfigurationStateId() {
        return this.configurationStateId;
    }

    /**
     * <p>
     * An identifier that indicates the ordering of the configuration items of a resource.
     * </p>
     * 
     * @param configurationStateId
     *        An identifier that indicates the ordering of the configuration items of a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withConfigurationStateId(String configurationStateId) {
        setConfigurationStateId(configurationStateId);
        return this;
    }

    /**
     * <p>
     * Unique MD5 hash that represents the configuration item's state.
     * </p>
     * <p>
     * You can use MD5 hash to compare the states of two or more configuration items that are associated with the same
     * resource.
     * </p>
     * 
     * @param configurationItemMD5Hash
     *        Unique MD5 hash that represents the configuration item's state.</p>
     *        <p>
     *        You can use MD5 hash to compare the states of two or more configuration items that are associated with the
     *        same resource.
     */

    public void setConfigurationItemMD5Hash(String configurationItemMD5Hash) {
        this.configurationItemMD5Hash = configurationItemMD5Hash;
    }

    /**
     * <p>
     * Unique MD5 hash that represents the configuration item's state.
     * </p>
     * <p>
     * You can use MD5 hash to compare the states of two or more configuration items that are associated with the same
     * resource.
     * </p>
     * 
     * @return Unique MD5 hash that represents the configuration item's state.</p>
     *         <p>
     *         You can use MD5 hash to compare the states of two or more configuration items that are associated with
     *         the same resource.
     */

    public String getConfigurationItemMD5Hash() {
        return this.configurationItemMD5Hash;
    }

    /**
     * <p>
     * Unique MD5 hash that represents the configuration item's state.
     * </p>
     * <p>
     * You can use MD5 hash to compare the states of two or more configuration items that are associated with the same
     * resource.
     * </p>
     * 
     * @param configurationItemMD5Hash
     *        Unique MD5 hash that represents the configuration item's state.</p>
     *        <p>
     *        You can use MD5 hash to compare the states of two or more configuration items that are associated with the
     *        same resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withConfigurationItemMD5Hash(String configurationItemMD5Hash) {
        setConfigurationItemMD5Hash(configurationItemMD5Hash);
        return this;
    }

    /**
     * <p>
     * accoun
     * </p>
     * 
     * @param arn
     *        accoun
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * accoun
     * </p>
     * 
     * @return accoun
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * accoun
     * </p>
     * 
     * @param arn
     *        accoun
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     * 
     * @return The type of AWS resource.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ConfigurationItem withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource.
     * @see ResourceType
     */

    public void setResourceType(ResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of AWS resource.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ConfigurationItem withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the resource (for example, <code>sg-xxxxxx</code>).
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource (for example, <code>sg-xxxxxx</code>).
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource (for example, <code>sg-xxxxxx</code>).
     * </p>
     * 
     * @return The ID of the resource (for example, <code>sg-xxxxxx</code>).
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource (for example, <code>sg-xxxxxx</code>).
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource (for example, <code>sg-xxxxxx</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The custom name of the resource, if available.
     * </p>
     * 
     * @param resourceName
     *        The custom name of the resource, if available.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The custom name of the resource, if available.
     * </p>
     * 
     * @return The custom name of the resource, if available.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The custom name of the resource, if available.
     * </p>
     * 
     * @param resourceName
     *        The custom name of the resource, if available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The region where the resource resides.
     * </p>
     * 
     * @param awsRegion
     *        The region where the resource resides.
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * <p>
     * The region where the resource resides.
     * </p>
     * 
     * @return The region where the resource resides.
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * <p>
     * The region where the resource resides.
     * </p>
     * 
     * @param awsRegion
     *        The region where the resource resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * <p>
     * The Availability Zone associated with the resource.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone associated with the resource.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone associated with the resource.
     * </p>
     * 
     * @return The Availability Zone associated with the resource.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone associated with the resource.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The time stamp when the resource was created.
     * </p>
     * 
     * @param resourceCreationTime
     *        The time stamp when the resource was created.
     */

    public void setResourceCreationTime(java.util.Date resourceCreationTime) {
        this.resourceCreationTime = resourceCreationTime;
    }

    /**
     * <p>
     * The time stamp when the resource was created.
     * </p>
     * 
     * @return The time stamp when the resource was created.
     */

    public java.util.Date getResourceCreationTime() {
        return this.resourceCreationTime;
    }

    /**
     * <p>
     * The time stamp when the resource was created.
     * </p>
     * 
     * @param resourceCreationTime
     *        The time stamp when the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withResourceCreationTime(java.util.Date resourceCreationTime) {
        setResourceCreationTime(resourceCreationTime);
        return this;
    }

    /**
     * <p>
     * A mapping of key value tags associated with the resource.
     * </p>
     * 
     * @return A mapping of key value tags associated with the resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A mapping of key value tags associated with the resource.
     * </p>
     * 
     * @param tags
     *        A mapping of key value tags associated with the resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A mapping of key value tags associated with the resource.
     * </p>
     * 
     * @param tags
     *        A mapping of key value tags associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public ConfigurationItem addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A list of CloudTrail event IDs.
     * </p>
     * <p>
     * A populated field indicates that the current configuration was initiated by the events recorded in the CloudTrail
     * log. For more information about CloudTrail, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What Is AWS
     * CloudTrail</a>.
     * </p>
     * <p>
     * An empty field indicates that the current configuration was not initiated by any event.
     * </p>
     * 
     * @return A list of CloudTrail event IDs.</p>
     *         <p>
     *         A populated field indicates that the current configuration was initiated by the events recorded in the
     *         CloudTrail log. For more information about CloudTrail, see <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What
     *         Is AWS CloudTrail</a>.
     *         </p>
     *         <p>
     *         An empty field indicates that the current configuration was not initiated by any event.
     */

    public java.util.List<String> getRelatedEvents() {
        if (relatedEvents == null) {
            relatedEvents = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return relatedEvents;
    }

    /**
     * <p>
     * A list of CloudTrail event IDs.
     * </p>
     * <p>
     * A populated field indicates that the current configuration was initiated by the events recorded in the CloudTrail
     * log. For more information about CloudTrail, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What Is AWS
     * CloudTrail</a>.
     * </p>
     * <p>
     * An empty field indicates that the current configuration was not initiated by any event.
     * </p>
     * 
     * @param relatedEvents
     *        A list of CloudTrail event IDs.</p>
     *        <p>
     *        A populated field indicates that the current configuration was initiated by the events recorded in the
     *        CloudTrail log. For more information about CloudTrail, see <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What
     *        Is AWS CloudTrail</a>.
     *        </p>
     *        <p>
     *        An empty field indicates that the current configuration was not initiated by any event.
     */

    public void setRelatedEvents(java.util.Collection<String> relatedEvents) {
        if (relatedEvents == null) {
            this.relatedEvents = null;
            return;
        }

        this.relatedEvents = new com.amazonaws.internal.SdkInternalList<String>(relatedEvents);
    }

    /**
     * <p>
     * A list of CloudTrail event IDs.
     * </p>
     * <p>
     * A populated field indicates that the current configuration was initiated by the events recorded in the CloudTrail
     * log. For more information about CloudTrail, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What Is AWS
     * CloudTrail</a>.
     * </p>
     * <p>
     * An empty field indicates that the current configuration was not initiated by any event.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedEvents(java.util.Collection)} or {@link #withRelatedEvents(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param relatedEvents
     *        A list of CloudTrail event IDs.</p>
     *        <p>
     *        A populated field indicates that the current configuration was initiated by the events recorded in the
     *        CloudTrail log. For more information about CloudTrail, see <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What
     *        Is AWS CloudTrail</a>.
     *        </p>
     *        <p>
     *        An empty field indicates that the current configuration was not initiated by any event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withRelatedEvents(String... relatedEvents) {
        if (this.relatedEvents == null) {
            setRelatedEvents(new com.amazonaws.internal.SdkInternalList<String>(relatedEvents.length));
        }
        for (String ele : relatedEvents) {
            this.relatedEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of CloudTrail event IDs.
     * </p>
     * <p>
     * A populated field indicates that the current configuration was initiated by the events recorded in the CloudTrail
     * log. For more information about CloudTrail, see <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What Is AWS
     * CloudTrail</a>.
     * </p>
     * <p>
     * An empty field indicates that the current configuration was not initiated by any event.
     * </p>
     * 
     * @param relatedEvents
     *        A list of CloudTrail event IDs.</p>
     *        <p>
     *        A populated field indicates that the current configuration was initiated by the events recorded in the
     *        CloudTrail log. For more information about CloudTrail, see <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html">What
     *        Is AWS CloudTrail</a>.
     *        </p>
     *        <p>
     *        An empty field indicates that the current configuration was not initiated by any event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withRelatedEvents(java.util.Collection<String> relatedEvents) {
        setRelatedEvents(relatedEvents);
        return this;
    }

    /**
     * <p>
     * A list of related AWS resources.
     * </p>
     * 
     * @return A list of related AWS resources.
     */

    public java.util.List<Relationship> getRelationships() {
        if (relationships == null) {
            relationships = new com.amazonaws.internal.SdkInternalList<Relationship>();
        }
        return relationships;
    }

    /**
     * <p>
     * A list of related AWS resources.
     * </p>
     * 
     * @param relationships
     *        A list of related AWS resources.
     */

    public void setRelationships(java.util.Collection<Relationship> relationships) {
        if (relationships == null) {
            this.relationships = null;
            return;
        }

        this.relationships = new com.amazonaws.internal.SdkInternalList<Relationship>(relationships);
    }

    /**
     * <p>
     * A list of related AWS resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelationships(java.util.Collection)} or {@link #withRelationships(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param relationships
     *        A list of related AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withRelationships(Relationship... relationships) {
        if (this.relationships == null) {
            setRelationships(new com.amazonaws.internal.SdkInternalList<Relationship>(relationships.length));
        }
        for (Relationship ele : relationships) {
            this.relationships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of related AWS resources.
     * </p>
     * 
     * @param relationships
     *        A list of related AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withRelationships(java.util.Collection<Relationship> relationships) {
        setRelationships(relationships);
        return this;
    }

    /**
     * <p>
     * The description of the resource configuration.
     * </p>
     * 
     * @param configuration
     *        The description of the resource configuration.
     */

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The description of the resource configuration.
     * </p>
     * 
     * @return The description of the resource configuration.
     */

    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The description of the resource configuration.
     * </p>
     * 
     * @param configuration
     *        The description of the resource configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withConfiguration(String configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Configuration attributes that AWS Config returns for certain resource types to supplement the information
     * returned for the <code>configuration</code> parameter.
     * </p>
     * 
     * @return Configuration attributes that AWS Config returns for certain resource types to supplement the information
     *         returned for the <code>configuration</code> parameter.
     */

    public java.util.Map<String, String> getSupplementaryConfiguration() {
        return supplementaryConfiguration;
    }

    /**
     * <p>
     * Configuration attributes that AWS Config returns for certain resource types to supplement the information
     * returned for the <code>configuration</code> parameter.
     * </p>
     * 
     * @param supplementaryConfiguration
     *        Configuration attributes that AWS Config returns for certain resource types to supplement the information
     *        returned for the <code>configuration</code> parameter.
     */

    public void setSupplementaryConfiguration(java.util.Map<String, String> supplementaryConfiguration) {
        this.supplementaryConfiguration = supplementaryConfiguration;
    }

    /**
     * <p>
     * Configuration attributes that AWS Config returns for certain resource types to supplement the information
     * returned for the <code>configuration</code> parameter.
     * </p>
     * 
     * @param supplementaryConfiguration
     *        Configuration attributes that AWS Config returns for certain resource types to supplement the information
     *        returned for the <code>configuration</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem withSupplementaryConfiguration(java.util.Map<String, String> supplementaryConfiguration) {
        setSupplementaryConfiguration(supplementaryConfiguration);
        return this;
    }

    public ConfigurationItem addSupplementaryConfigurationEntry(String key, String value) {
        if (null == this.supplementaryConfiguration) {
            this.supplementaryConfiguration = new java.util.HashMap<String, String>();
        }
        if (this.supplementaryConfiguration.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.supplementaryConfiguration.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SupplementaryConfiguration.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationItem clearSupplementaryConfigurationEntries() {
        this.supplementaryConfiguration = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getConfigurationItemCaptureTime() != null)
            sb.append("ConfigurationItemCaptureTime: ").append(getConfigurationItemCaptureTime()).append(",");
        if (getConfigurationItemStatus() != null)
            sb.append("ConfigurationItemStatus: ").append(getConfigurationItemStatus()).append(",");
        if (getConfigurationStateId() != null)
            sb.append("ConfigurationStateId: ").append(getConfigurationStateId()).append(",");
        if (getConfigurationItemMD5Hash() != null)
            sb.append("ConfigurationItemMD5Hash: ").append(getConfigurationItemMD5Hash()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getResourceCreationTime() != null)
            sb.append("ResourceCreationTime: ").append(getResourceCreationTime()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getRelatedEvents() != null)
            sb.append("RelatedEvents: ").append(getRelatedEvents()).append(",");
        if (getRelationships() != null)
            sb.append("Relationships: ").append(getRelationships()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getSupplementaryConfiguration() != null)
            sb.append("SupplementaryConfiguration: ").append(getSupplementaryConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationItem == false)
            return false;
        ConfigurationItem other = (ConfigurationItem) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getConfigurationItemCaptureTime() == null ^ this.getConfigurationItemCaptureTime() == null)
            return false;
        if (other.getConfigurationItemCaptureTime() != null && other.getConfigurationItemCaptureTime().equals(this.getConfigurationItemCaptureTime()) == false)
            return false;
        if (other.getConfigurationItemStatus() == null ^ this.getConfigurationItemStatus() == null)
            return false;
        if (other.getConfigurationItemStatus() != null && other.getConfigurationItemStatus().equals(this.getConfigurationItemStatus()) == false)
            return false;
        if (other.getConfigurationStateId() == null ^ this.getConfigurationStateId() == null)
            return false;
        if (other.getConfigurationStateId() != null && other.getConfigurationStateId().equals(this.getConfigurationStateId()) == false)
            return false;
        if (other.getConfigurationItemMD5Hash() == null ^ this.getConfigurationItemMD5Hash() == null)
            return false;
        if (other.getConfigurationItemMD5Hash() != null && other.getConfigurationItemMD5Hash().equals(this.getConfigurationItemMD5Hash()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getResourceCreationTime() == null ^ this.getResourceCreationTime() == null)
            return false;
        if (other.getResourceCreationTime() != null && other.getResourceCreationTime().equals(this.getResourceCreationTime()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getRelatedEvents() == null ^ this.getRelatedEvents() == null)
            return false;
        if (other.getRelatedEvents() != null && other.getRelatedEvents().equals(this.getRelatedEvents()) == false)
            return false;
        if (other.getRelationships() == null ^ this.getRelationships() == null)
            return false;
        if (other.getRelationships() != null && other.getRelationships().equals(this.getRelationships()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getSupplementaryConfiguration() == null ^ this.getSupplementaryConfiguration() == null)
            return false;
        if (other.getSupplementaryConfiguration() != null && other.getSupplementaryConfiguration().equals(this.getSupplementaryConfiguration()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getResourceCreationTime() == null) ? 0 : getResourceCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getRelatedEvents() == null) ? 0 : getRelatedEvents().hashCode());
        hashCode = prime * hashCode + ((getRelationships() == null) ? 0 : getRelationships().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSupplementaryConfiguration() == null) ? 0 : getSupplementaryConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationItem clone() {
        try {
            return (ConfigurationItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConfigurationItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
