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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Placeholder documentation for CreateSignalMapRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreateSignalMap" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSignalMapRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private java.util.List<String> cloudWatchAlarmTemplateGroupIdentifiers;
    /** A resource's optional description. */
    private String description;
    /** A top-level supported AWS resource ARN to discovery a signal map from. */
    private String discoveryEntryPointArn;

    private java.util.List<String> eventBridgeRuleTemplateGroupIdentifiers;
    /** A resource's name. Names must be unique within the scope of a resource type in a specific region. */
    private String name;

    private java.util.Map<String, String> tags;

    /**
     * @return
     */

    public java.util.List<String> getCloudWatchAlarmTemplateGroupIdentifiers() {
        return cloudWatchAlarmTemplateGroupIdentifiers;
    }

    /**
     * @param cloudWatchAlarmTemplateGroupIdentifiers
     */

    public void setCloudWatchAlarmTemplateGroupIdentifiers(java.util.Collection<String> cloudWatchAlarmTemplateGroupIdentifiers) {
        if (cloudWatchAlarmTemplateGroupIdentifiers == null) {
            this.cloudWatchAlarmTemplateGroupIdentifiers = null;
            return;
        }

        this.cloudWatchAlarmTemplateGroupIdentifiers = new java.util.ArrayList<String>(cloudWatchAlarmTemplateGroupIdentifiers);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCloudWatchAlarmTemplateGroupIdentifiers(java.util.Collection)} or
     * {@link #withCloudWatchAlarmTemplateGroupIdentifiers(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param cloudWatchAlarmTemplateGroupIdentifiers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSignalMapRequest withCloudWatchAlarmTemplateGroupIdentifiers(String... cloudWatchAlarmTemplateGroupIdentifiers) {
        if (this.cloudWatchAlarmTemplateGroupIdentifiers == null) {
            setCloudWatchAlarmTemplateGroupIdentifiers(new java.util.ArrayList<String>(cloudWatchAlarmTemplateGroupIdentifiers.length));
        }
        for (String ele : cloudWatchAlarmTemplateGroupIdentifiers) {
            this.cloudWatchAlarmTemplateGroupIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * @param cloudWatchAlarmTemplateGroupIdentifiers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSignalMapRequest withCloudWatchAlarmTemplateGroupIdentifiers(java.util.Collection<String> cloudWatchAlarmTemplateGroupIdentifiers) {
        setCloudWatchAlarmTemplateGroupIdentifiers(cloudWatchAlarmTemplateGroupIdentifiers);
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

    public CreateSignalMapRequest withDescription(String description) {
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

    public CreateSignalMapRequest withDiscoveryEntryPointArn(String discoveryEntryPointArn) {
        setDiscoveryEntryPointArn(discoveryEntryPointArn);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getEventBridgeRuleTemplateGroupIdentifiers() {
        return eventBridgeRuleTemplateGroupIdentifiers;
    }

    /**
     * @param eventBridgeRuleTemplateGroupIdentifiers
     */

    public void setEventBridgeRuleTemplateGroupIdentifiers(java.util.Collection<String> eventBridgeRuleTemplateGroupIdentifiers) {
        if (eventBridgeRuleTemplateGroupIdentifiers == null) {
            this.eventBridgeRuleTemplateGroupIdentifiers = null;
            return;
        }

        this.eventBridgeRuleTemplateGroupIdentifiers = new java.util.ArrayList<String>(eventBridgeRuleTemplateGroupIdentifiers);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventBridgeRuleTemplateGroupIdentifiers(java.util.Collection)} or
     * {@link #withEventBridgeRuleTemplateGroupIdentifiers(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param eventBridgeRuleTemplateGroupIdentifiers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSignalMapRequest withEventBridgeRuleTemplateGroupIdentifiers(String... eventBridgeRuleTemplateGroupIdentifiers) {
        if (this.eventBridgeRuleTemplateGroupIdentifiers == null) {
            setEventBridgeRuleTemplateGroupIdentifiers(new java.util.ArrayList<String>(eventBridgeRuleTemplateGroupIdentifiers.length));
        }
        for (String ele : eventBridgeRuleTemplateGroupIdentifiers) {
            this.eventBridgeRuleTemplateGroupIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * @param eventBridgeRuleTemplateGroupIdentifiers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSignalMapRequest withEventBridgeRuleTemplateGroupIdentifiers(java.util.Collection<String> eventBridgeRuleTemplateGroupIdentifiers) {
        setEventBridgeRuleTemplateGroupIdentifiers(eventBridgeRuleTemplateGroupIdentifiers);
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

    public CreateSignalMapRequest withName(String name) {
        setName(name);
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

    public CreateSignalMapRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSignalMapRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSignalMapRequest addTagsEntry(String key, String value) {
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

    public CreateSignalMapRequest clearTagsEntries() {
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
        if (getCloudWatchAlarmTemplateGroupIdentifiers() != null)
            sb.append("CloudWatchAlarmTemplateGroupIdentifiers: ").append(getCloudWatchAlarmTemplateGroupIdentifiers()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDiscoveryEntryPointArn() != null)
            sb.append("DiscoveryEntryPointArn: ").append(getDiscoveryEntryPointArn()).append(",");
        if (getEventBridgeRuleTemplateGroupIdentifiers() != null)
            sb.append("EventBridgeRuleTemplateGroupIdentifiers: ").append(getEventBridgeRuleTemplateGroupIdentifiers()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateSignalMapRequest == false)
            return false;
        CreateSignalMapRequest other = (CreateSignalMapRequest) obj;
        if (other.getCloudWatchAlarmTemplateGroupIdentifiers() == null ^ this.getCloudWatchAlarmTemplateGroupIdentifiers() == null)
            return false;
        if (other.getCloudWatchAlarmTemplateGroupIdentifiers() != null
                && other.getCloudWatchAlarmTemplateGroupIdentifiers().equals(this.getCloudWatchAlarmTemplateGroupIdentifiers()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDiscoveryEntryPointArn() == null ^ this.getDiscoveryEntryPointArn() == null)
            return false;
        if (other.getDiscoveryEntryPointArn() != null && other.getDiscoveryEntryPointArn().equals(this.getDiscoveryEntryPointArn()) == false)
            return false;
        if (other.getEventBridgeRuleTemplateGroupIdentifiers() == null ^ this.getEventBridgeRuleTemplateGroupIdentifiers() == null)
            return false;
        if (other.getEventBridgeRuleTemplateGroupIdentifiers() != null
                && other.getEventBridgeRuleTemplateGroupIdentifiers().equals(this.getEventBridgeRuleTemplateGroupIdentifiers()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getCloudWatchAlarmTemplateGroupIdentifiers() == null) ? 0 : getCloudWatchAlarmTemplateGroupIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDiscoveryEntryPointArn() == null) ? 0 : getDiscoveryEntryPointArn().hashCode());
        hashCode = prime * hashCode + ((getEventBridgeRuleTemplateGroupIdentifiers() == null) ? 0 : getEventBridgeRuleTemplateGroupIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSignalMapRequest clone() {
        return (CreateSignalMapRequest) super.clone();
    }

}
