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
 * Placeholder documentation for StartUpdateSignalMapRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StartUpdateSignalMap" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartUpdateSignalMapRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private java.util.List<String> cloudWatchAlarmTemplateGroupIdentifiers;
    /** A resource's optional description. */
    private String description;
    /** A top-level supported AWS resource ARN to discovery a signal map from. */
    private String discoveryEntryPointArn;

    private java.util.List<String> eventBridgeRuleTemplateGroupIdentifiers;
    /** If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is provided. */
    private Boolean forceRediscovery;
    /** A signal map's identifier. Can be either be its id or current name. */
    private String identifier;
    /** A resource's name. Names must be unique within the scope of a resource type in a specific region. */
    private String name;

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

    public StartUpdateSignalMapRequest withCloudWatchAlarmTemplateGroupIdentifiers(String... cloudWatchAlarmTemplateGroupIdentifiers) {
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

    public StartUpdateSignalMapRequest withCloudWatchAlarmTemplateGroupIdentifiers(java.util.Collection<String> cloudWatchAlarmTemplateGroupIdentifiers) {
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

    public StartUpdateSignalMapRequest withDescription(String description) {
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

    public StartUpdateSignalMapRequest withDiscoveryEntryPointArn(String discoveryEntryPointArn) {
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

    public StartUpdateSignalMapRequest withEventBridgeRuleTemplateGroupIdentifiers(String... eventBridgeRuleTemplateGroupIdentifiers) {
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

    public StartUpdateSignalMapRequest withEventBridgeRuleTemplateGroupIdentifiers(java.util.Collection<String> eventBridgeRuleTemplateGroupIdentifiers) {
        setEventBridgeRuleTemplateGroupIdentifiers(eventBridgeRuleTemplateGroupIdentifiers);
        return this;
    }

    /**
     * If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is provided.
     * 
     * @param forceRediscovery
     *        If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is provided.
     */

    public void setForceRediscovery(Boolean forceRediscovery) {
        this.forceRediscovery = forceRediscovery;
    }

    /**
     * If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is provided.
     * 
     * @return If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is provided.
     */

    public Boolean getForceRediscovery() {
        return this.forceRediscovery;
    }

    /**
     * If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is provided.
     * 
     * @param forceRediscovery
     *        If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartUpdateSignalMapRequest withForceRediscovery(Boolean forceRediscovery) {
        setForceRediscovery(forceRediscovery);
        return this;
    }

    /**
     * If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is provided.
     * 
     * @return If true, will force a rediscovery of a signal map if an unchanged discoveryEntryPointArn is provided.
     */

    public Boolean isForceRediscovery() {
        return this.forceRediscovery;
    }

    /**
     * A signal map's identifier. Can be either be its id or current name.
     * 
     * @param identifier
     *        A signal map's identifier. Can be either be its id or current name.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * A signal map's identifier. Can be either be its id or current name.
     * 
     * @return A signal map's identifier. Can be either be its id or current name.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * A signal map's identifier. Can be either be its id or current name.
     * 
     * @param identifier
     *        A signal map's identifier. Can be either be its id or current name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartUpdateSignalMapRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
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

    public StartUpdateSignalMapRequest withName(String name) {
        setName(name);
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
        if (getForceRediscovery() != null)
            sb.append("ForceRediscovery: ").append(getForceRediscovery()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartUpdateSignalMapRequest == false)
            return false;
        StartUpdateSignalMapRequest other = (StartUpdateSignalMapRequest) obj;
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
        if (other.getForceRediscovery() == null ^ this.getForceRediscovery() == null)
            return false;
        if (other.getForceRediscovery() != null && other.getForceRediscovery().equals(this.getForceRediscovery()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getForceRediscovery() == null) ? 0 : getForceRediscovery().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public StartUpdateSignalMapRequest clone() {
        return (StartUpdateSignalMapRequest) super.clone();
    }

}
