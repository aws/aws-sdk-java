/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for StartDeleteMonitorDeploymentResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartDeleteMonitorDeployment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDeleteMonitorDeploymentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A signal map's ARN (Amazon Resource Name) */
    private String arn;

    private java.util.List<String> cloudWatchAlarmTemplateGroupIds;

    private java.util.Date createdAt;
    /** A resource's optional description. */
    private String description;
    /** A top-level supported AWS resource ARN to discovery a signal map from. */
    private String discoveryEntryPointArn;
    /** Error message associated with a failed creation or failed update attempt of a signal map. */
    private String errorMessage;

    private java.util.List<String> eventBridgeRuleTemplateGroupIds;

    private java.util.Map<String, MediaResource> failedMediaResourceMap;
    /** A signal map's id. */
    private String id;

    private java.util.Date lastDiscoveredAt;

    private SuccessfulMonitorDeployment lastSuccessfulMonitorDeployment;

    private java.util.Map<String, MediaResource> mediaResourceMap;

    private java.util.Date modifiedAt;
    /** If true, there are pending monitor changes for this signal map that can be deployed. */
    private Boolean monitorChangesPendingDeployment;

    private MonitorDeployment monitorDeployment;
    /** A resource's name. Names must be unique within the scope of a resource type in a specific region. */
    private String name;

    private String status;

    private java.util.Map<String, String> tags;

    /**
     * A signal map's ARN (Amazon Resource Name)
     * 
     * @param arn
     *        A signal map's ARN (Amazon Resource Name)
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * A signal map's ARN (Amazon Resource Name)
     * 
     * @return A signal map's ARN (Amazon Resource Name)
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * A signal map's ARN (Amazon Resource Name)
     * 
     * @param arn
     *        A signal map's ARN (Amazon Resource Name)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getCloudWatchAlarmTemplateGroupIds() {
        return cloudWatchAlarmTemplateGroupIds;
    }

    /**
     * @param cloudWatchAlarmTemplateGroupIds
     */

    public void setCloudWatchAlarmTemplateGroupIds(java.util.Collection<String> cloudWatchAlarmTemplateGroupIds) {
        if (cloudWatchAlarmTemplateGroupIds == null) {
            this.cloudWatchAlarmTemplateGroupIds = null;
            return;
        }

        this.cloudWatchAlarmTemplateGroupIds = new java.util.ArrayList<String>(cloudWatchAlarmTemplateGroupIds);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCloudWatchAlarmTemplateGroupIds(java.util.Collection)} or
     * {@link #withCloudWatchAlarmTemplateGroupIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param cloudWatchAlarmTemplateGroupIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withCloudWatchAlarmTemplateGroupIds(String... cloudWatchAlarmTemplateGroupIds) {
        if (this.cloudWatchAlarmTemplateGroupIds == null) {
            setCloudWatchAlarmTemplateGroupIds(new java.util.ArrayList<String>(cloudWatchAlarmTemplateGroupIds.length));
        }
        for (String ele : cloudWatchAlarmTemplateGroupIds) {
            this.cloudWatchAlarmTemplateGroupIds.add(ele);
        }
        return this;
    }

    /**
     * @param cloudWatchAlarmTemplateGroupIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withCloudWatchAlarmTemplateGroupIds(java.util.Collection<String> cloudWatchAlarmTemplateGroupIds) {
        setCloudWatchAlarmTemplateGroupIds(cloudWatchAlarmTemplateGroupIds);
        return this;
    }

    /**
     * @param createdAt
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @param createdAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * A resource's optional description.
     * 
     * @param description
     *        A resource's optional description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A resource's optional description.
     * 
     * @return A resource's optional description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A resource's optional description.
     * 
     * @param description
     *        A resource's optional description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * A top-level supported AWS resource ARN to discovery a signal map from.
     * 
     * @param discoveryEntryPointArn
     *        A top-level supported AWS resource ARN to discovery a signal map from.
     */

    public void setDiscoveryEntryPointArn(String discoveryEntryPointArn) {
        this.discoveryEntryPointArn = discoveryEntryPointArn;
    }

    /**
     * A top-level supported AWS resource ARN to discovery a signal map from.
     * 
     * @return A top-level supported AWS resource ARN to discovery a signal map from.
     */

    public String getDiscoveryEntryPointArn() {
        return this.discoveryEntryPointArn;
    }

    /**
     * A top-level supported AWS resource ARN to discovery a signal map from.
     * 
     * @param discoveryEntryPointArn
     *        A top-level supported AWS resource ARN to discovery a signal map from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withDiscoveryEntryPointArn(String discoveryEntryPointArn) {
        setDiscoveryEntryPointArn(discoveryEntryPointArn);
        return this;
    }

    /**
     * Error message associated with a failed creation or failed update attempt of a signal map.
     * 
     * @param errorMessage
     *        Error message associated with a failed creation or failed update attempt of a signal map.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Error message associated with a failed creation or failed update attempt of a signal map.
     * 
     * @return Error message associated with a failed creation or failed update attempt of a signal map.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Error message associated with a failed creation or failed update attempt of a signal map.
     * 
     * @param errorMessage
     *        Error message associated with a failed creation or failed update attempt of a signal map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getEventBridgeRuleTemplateGroupIds() {
        return eventBridgeRuleTemplateGroupIds;
    }

    /**
     * @param eventBridgeRuleTemplateGroupIds
     */

    public void setEventBridgeRuleTemplateGroupIds(java.util.Collection<String> eventBridgeRuleTemplateGroupIds) {
        if (eventBridgeRuleTemplateGroupIds == null) {
            this.eventBridgeRuleTemplateGroupIds = null;
            return;
        }

        this.eventBridgeRuleTemplateGroupIds = new java.util.ArrayList<String>(eventBridgeRuleTemplateGroupIds);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventBridgeRuleTemplateGroupIds(java.util.Collection)} or
     * {@link #withEventBridgeRuleTemplateGroupIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param eventBridgeRuleTemplateGroupIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withEventBridgeRuleTemplateGroupIds(String... eventBridgeRuleTemplateGroupIds) {
        if (this.eventBridgeRuleTemplateGroupIds == null) {
            setEventBridgeRuleTemplateGroupIds(new java.util.ArrayList<String>(eventBridgeRuleTemplateGroupIds.length));
        }
        for (String ele : eventBridgeRuleTemplateGroupIds) {
            this.eventBridgeRuleTemplateGroupIds.add(ele);
        }
        return this;
    }

    /**
     * @param eventBridgeRuleTemplateGroupIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withEventBridgeRuleTemplateGroupIds(java.util.Collection<String> eventBridgeRuleTemplateGroupIds) {
        setEventBridgeRuleTemplateGroupIds(eventBridgeRuleTemplateGroupIds);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, MediaResource> getFailedMediaResourceMap() {
        return failedMediaResourceMap;
    }

    /**
     * @param failedMediaResourceMap
     */

    public void setFailedMediaResourceMap(java.util.Map<String, MediaResource> failedMediaResourceMap) {
        this.failedMediaResourceMap = failedMediaResourceMap;
    }

    /**
     * @param failedMediaResourceMap
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withFailedMediaResourceMap(java.util.Map<String, MediaResource> failedMediaResourceMap) {
        setFailedMediaResourceMap(failedMediaResourceMap);
        return this;
    }

    /**
     * Add a single FailedMediaResourceMap entry
     *
     * @see StartDeleteMonitorDeploymentResult#withFailedMediaResourceMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult addFailedMediaResourceMapEntry(String key, MediaResource value) {
        if (null == this.failedMediaResourceMap) {
            this.failedMediaResourceMap = new java.util.HashMap<String, MediaResource>();
        }
        if (this.failedMediaResourceMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.failedMediaResourceMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FailedMediaResourceMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult clearFailedMediaResourceMapEntries() {
        this.failedMediaResourceMap = null;
        return this;
    }

    /**
     * A signal map's id.
     * 
     * @param id
     *        A signal map's id.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A signal map's id.
     * 
     * @return A signal map's id.
     */

    public String getId() {
        return this.id;
    }

    /**
     * A signal map's id.
     * 
     * @param id
     *        A signal map's id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param lastDiscoveredAt
     */

    public void setLastDiscoveredAt(java.util.Date lastDiscoveredAt) {
        this.lastDiscoveredAt = lastDiscoveredAt;
    }

    /**
     * @return
     */

    public java.util.Date getLastDiscoveredAt() {
        return this.lastDiscoveredAt;
    }

    /**
     * @param lastDiscoveredAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withLastDiscoveredAt(java.util.Date lastDiscoveredAt) {
        setLastDiscoveredAt(lastDiscoveredAt);
        return this;
    }

    /**
     * @param lastSuccessfulMonitorDeployment
     */

    public void setLastSuccessfulMonitorDeployment(SuccessfulMonitorDeployment lastSuccessfulMonitorDeployment) {
        this.lastSuccessfulMonitorDeployment = lastSuccessfulMonitorDeployment;
    }

    /**
     * @return
     */

    public SuccessfulMonitorDeployment getLastSuccessfulMonitorDeployment() {
        return this.lastSuccessfulMonitorDeployment;
    }

    /**
     * @param lastSuccessfulMonitorDeployment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withLastSuccessfulMonitorDeployment(SuccessfulMonitorDeployment lastSuccessfulMonitorDeployment) {
        setLastSuccessfulMonitorDeployment(lastSuccessfulMonitorDeployment);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, MediaResource> getMediaResourceMap() {
        return mediaResourceMap;
    }

    /**
     * @param mediaResourceMap
     */

    public void setMediaResourceMap(java.util.Map<String, MediaResource> mediaResourceMap) {
        this.mediaResourceMap = mediaResourceMap;
    }

    /**
     * @param mediaResourceMap
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withMediaResourceMap(java.util.Map<String, MediaResource> mediaResourceMap) {
        setMediaResourceMap(mediaResourceMap);
        return this;
    }

    /**
     * Add a single MediaResourceMap entry
     *
     * @see StartDeleteMonitorDeploymentResult#withMediaResourceMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult addMediaResourceMapEntry(String key, MediaResource value) {
        if (null == this.mediaResourceMap) {
            this.mediaResourceMap = new java.util.HashMap<String, MediaResource>();
        }
        if (this.mediaResourceMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.mediaResourceMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MediaResourceMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult clearMediaResourceMapEntries() {
        this.mediaResourceMap = null;
        return this;
    }

    /**
     * @param modifiedAt
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * @return
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * @param modifiedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
        return this;
    }

    /**
     * If true, there are pending monitor changes for this signal map that can be deployed.
     * 
     * @param monitorChangesPendingDeployment
     *        If true, there are pending monitor changes for this signal map that can be deployed.
     */

    public void setMonitorChangesPendingDeployment(Boolean monitorChangesPendingDeployment) {
        this.monitorChangesPendingDeployment = monitorChangesPendingDeployment;
    }

    /**
     * If true, there are pending monitor changes for this signal map that can be deployed.
     * 
     * @return If true, there are pending monitor changes for this signal map that can be deployed.
     */

    public Boolean getMonitorChangesPendingDeployment() {
        return this.monitorChangesPendingDeployment;
    }

    /**
     * If true, there are pending monitor changes for this signal map that can be deployed.
     * 
     * @param monitorChangesPendingDeployment
     *        If true, there are pending monitor changes for this signal map that can be deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withMonitorChangesPendingDeployment(Boolean monitorChangesPendingDeployment) {
        setMonitorChangesPendingDeployment(monitorChangesPendingDeployment);
        return this;
    }

    /**
     * If true, there are pending monitor changes for this signal map that can be deployed.
     * 
     * @return If true, there are pending monitor changes for this signal map that can be deployed.
     */

    public Boolean isMonitorChangesPendingDeployment() {
        return this.monitorChangesPendingDeployment;
    }

    /**
     * @param monitorDeployment
     */

    public void setMonitorDeployment(MonitorDeployment monitorDeployment) {
        this.monitorDeployment = monitorDeployment;
    }

    /**
     * @return
     */

    public MonitorDeployment getMonitorDeployment() {
        return this.monitorDeployment;
    }

    /**
     * @param monitorDeployment
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withMonitorDeployment(MonitorDeployment monitorDeployment) {
        setMonitorDeployment(monitorDeployment);
        return this;
    }

    /**
     * A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * 
     * @param name
     *        A resource's name. Names must be unique within the scope of a resource type in a specific region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * 
     * @return A resource's name. Names must be unique within the scope of a resource type in a specific region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * 
     * @param name
     *        A resource's name. Names must be unique within the scope of a resource type in a specific region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param status
     * @see SignalMapStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     * @see SignalMapStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SignalMapStatus
     */

    public StartDeleteMonitorDeploymentResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SignalMapStatus
     */

    public StartDeleteMonitorDeploymentResult withStatus(SignalMapStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartDeleteMonitorDeploymentResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartDeleteMonitorDeploymentResult addTagsEntry(String key, String value) {
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

    public StartDeleteMonitorDeploymentResult clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCloudWatchAlarmTemplateGroupIds() != null)
            sb.append("CloudWatchAlarmTemplateGroupIds: ").append(getCloudWatchAlarmTemplateGroupIds()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDiscoveryEntryPointArn() != null)
            sb.append("DiscoveryEntryPointArn: ").append(getDiscoveryEntryPointArn()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getEventBridgeRuleTemplateGroupIds() != null)
            sb.append("EventBridgeRuleTemplateGroupIds: ").append(getEventBridgeRuleTemplateGroupIds()).append(",");
        if (getFailedMediaResourceMap() != null)
            sb.append("FailedMediaResourceMap: ").append(getFailedMediaResourceMap()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastDiscoveredAt() != null)
            sb.append("LastDiscoveredAt: ").append(getLastDiscoveredAt()).append(",");
        if (getLastSuccessfulMonitorDeployment() != null)
            sb.append("LastSuccessfulMonitorDeployment: ").append(getLastSuccessfulMonitorDeployment()).append(",");
        if (getMediaResourceMap() != null)
            sb.append("MediaResourceMap: ").append(getMediaResourceMap()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt()).append(",");
        if (getMonitorChangesPendingDeployment() != null)
            sb.append("MonitorChangesPendingDeployment: ").append(getMonitorChangesPendingDeployment()).append(",");
        if (getMonitorDeployment() != null)
            sb.append("MonitorDeployment: ").append(getMonitorDeployment()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDeleteMonitorDeploymentResult == false)
            return false;
        StartDeleteMonitorDeploymentResult other = (StartDeleteMonitorDeploymentResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCloudWatchAlarmTemplateGroupIds() == null ^ this.getCloudWatchAlarmTemplateGroupIds() == null)
            return false;
        if (other.getCloudWatchAlarmTemplateGroupIds() != null
                && other.getCloudWatchAlarmTemplateGroupIds().equals(this.getCloudWatchAlarmTemplateGroupIds()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDiscoveryEntryPointArn() == null ^ this.getDiscoveryEntryPointArn() == null)
            return false;
        if (other.getDiscoveryEntryPointArn() != null && other.getDiscoveryEntryPointArn().equals(this.getDiscoveryEntryPointArn()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getEventBridgeRuleTemplateGroupIds() == null ^ this.getEventBridgeRuleTemplateGroupIds() == null)
            return false;
        if (other.getEventBridgeRuleTemplateGroupIds() != null
                && other.getEventBridgeRuleTemplateGroupIds().equals(this.getEventBridgeRuleTemplateGroupIds()) == false)
            return false;
        if (other.getFailedMediaResourceMap() == null ^ this.getFailedMediaResourceMap() == null)
            return false;
        if (other.getFailedMediaResourceMap() != null && other.getFailedMediaResourceMap().equals(this.getFailedMediaResourceMap()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastDiscoveredAt() == null ^ this.getLastDiscoveredAt() == null)
            return false;
        if (other.getLastDiscoveredAt() != null && other.getLastDiscoveredAt().equals(this.getLastDiscoveredAt()) == false)
            return false;
        if (other.getLastSuccessfulMonitorDeployment() == null ^ this.getLastSuccessfulMonitorDeployment() == null)
            return false;
        if (other.getLastSuccessfulMonitorDeployment() != null
                && other.getLastSuccessfulMonitorDeployment().equals(this.getLastSuccessfulMonitorDeployment()) == false)
            return false;
        if (other.getMediaResourceMap() == null ^ this.getMediaResourceMap() == null)
            return false;
        if (other.getMediaResourceMap() != null && other.getMediaResourceMap().equals(this.getMediaResourceMap()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        if (other.getMonitorChangesPendingDeployment() == null ^ this.getMonitorChangesPendingDeployment() == null)
            return false;
        if (other.getMonitorChangesPendingDeployment() != null
                && other.getMonitorChangesPendingDeployment().equals(this.getMonitorChangesPendingDeployment()) == false)
            return false;
        if (other.getMonitorDeployment() == null ^ this.getMonitorDeployment() == null)
            return false;
        if (other.getMonitorDeployment() != null && other.getMonitorDeployment().equals(this.getMonitorDeployment()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchAlarmTemplateGroupIds() == null) ? 0 : getCloudWatchAlarmTemplateGroupIds().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDiscoveryEntryPointArn() == null) ? 0 : getDiscoveryEntryPointArn().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getEventBridgeRuleTemplateGroupIds() == null) ? 0 : getEventBridgeRuleTemplateGroupIds().hashCode());
        hashCode = prime * hashCode + ((getFailedMediaResourceMap() == null) ? 0 : getFailedMediaResourceMap().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastDiscoveredAt() == null) ? 0 : getLastDiscoveredAt().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulMonitorDeployment() == null) ? 0 : getLastSuccessfulMonitorDeployment().hashCode());
        hashCode = prime * hashCode + ((getMediaResourceMap() == null) ? 0 : getMediaResourceMap().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getMonitorChangesPendingDeployment() == null) ? 0 : getMonitorChangesPendingDeployment().hashCode());
        hashCode = prime * hashCode + ((getMonitorDeployment() == null) ? 0 : getMonitorDeployment().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartDeleteMonitorDeploymentResult clone() {
        try {
            return (StartDeleteMonitorDeploymentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
