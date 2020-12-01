/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon AppIntegrations APIs are in preview release and are subject to change.
 * </p>
 * <p>
 * The event integration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/EventIntegration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventIntegration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event integration.
     * </p>
     */
    private String eventIntegrationArn;
    /**
     * <p>
     * The name of the event integration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The event integration description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The event integration filter.
     * </p>
     */
    private EventFilter eventFilter;
    /**
     * <p>
     * The Amazon Eventbridge bus for the event integration.
     * </p>
     */
    private String eventBridgeBus;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event integration.
     * </p>
     * 
     * @param eventIntegrationArn
     *        The Amazon Resource Name (ARN) of the event integration.
     */

    public void setEventIntegrationArn(String eventIntegrationArn) {
        this.eventIntegrationArn = eventIntegrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event integration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the event integration.
     */

    public String getEventIntegrationArn() {
        return this.eventIntegrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event integration.
     * </p>
     * 
     * @param eventIntegrationArn
     *        The Amazon Resource Name (ARN) of the event integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegration withEventIntegrationArn(String eventIntegrationArn) {
        setEventIntegrationArn(eventIntegrationArn);
        return this;
    }

    /**
     * <p>
     * The name of the event integration.
     * </p>
     * 
     * @param name
     *        The name of the event integration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the event integration.
     * </p>
     * 
     * @return The name of the event integration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the event integration.
     * </p>
     * 
     * @param name
     *        The name of the event integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The event integration description.
     * </p>
     * 
     * @param description
     *        The event integration description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The event integration description.
     * </p>
     * 
     * @return The event integration description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The event integration description.
     * </p>
     * 
     * @param description
     *        The event integration description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The event integration filter.
     * </p>
     * 
     * @param eventFilter
     *        The event integration filter.
     */

    public void setEventFilter(EventFilter eventFilter) {
        this.eventFilter = eventFilter;
    }

    /**
     * <p>
     * The event integration filter.
     * </p>
     * 
     * @return The event integration filter.
     */

    public EventFilter getEventFilter() {
        return this.eventFilter;
    }

    /**
     * <p>
     * The event integration filter.
     * </p>
     * 
     * @param eventFilter
     *        The event integration filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegration withEventFilter(EventFilter eventFilter) {
        setEventFilter(eventFilter);
        return this;
    }

    /**
     * <p>
     * The Amazon Eventbridge bus for the event integration.
     * </p>
     * 
     * @param eventBridgeBus
     *        The Amazon Eventbridge bus for the event integration.
     */

    public void setEventBridgeBus(String eventBridgeBus) {
        this.eventBridgeBus = eventBridgeBus;
    }

    /**
     * <p>
     * The Amazon Eventbridge bus for the event integration.
     * </p>
     * 
     * @return The Amazon Eventbridge bus for the event integration.
     */

    public String getEventBridgeBus() {
        return this.eventBridgeBus;
    }

    /**
     * <p>
     * The Amazon Eventbridge bus for the event integration.
     * </p>
     * 
     * @param eventBridgeBus
     *        The Amazon Eventbridge bus for the event integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegration withEventBridgeBus(String eventBridgeBus) {
        setEventBridgeBus(eventBridgeBus);
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegration withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see EventIntegration#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegration addTagsEntry(String key, String value) {
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

    public EventIntegration clearTagsEntries() {
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
        if (getEventIntegrationArn() != null)
            sb.append("EventIntegrationArn: ").append(getEventIntegrationArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEventFilter() != null)
            sb.append("EventFilter: ").append(getEventFilter()).append(",");
        if (getEventBridgeBus() != null)
            sb.append("EventBridgeBus: ").append(getEventBridgeBus()).append(",");
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

        if (obj instanceof EventIntegration == false)
            return false;
        EventIntegration other = (EventIntegration) obj;
        if (other.getEventIntegrationArn() == null ^ this.getEventIntegrationArn() == null)
            return false;
        if (other.getEventIntegrationArn() != null && other.getEventIntegrationArn().equals(this.getEventIntegrationArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEventFilter() == null ^ this.getEventFilter() == null)
            return false;
        if (other.getEventFilter() != null && other.getEventFilter().equals(this.getEventFilter()) == false)
            return false;
        if (other.getEventBridgeBus() == null ^ this.getEventBridgeBus() == null)
            return false;
        if (other.getEventBridgeBus() != null && other.getEventBridgeBus().equals(this.getEventBridgeBus()) == false)
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

        hashCode = prime * hashCode + ((getEventIntegrationArn() == null) ? 0 : getEventIntegrationArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventFilter() == null) ? 0 : getEventFilter().hashCode());
        hashCode = prime * hashCode + ((getEventBridgeBus() == null) ? 0 : getEventBridgeBus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public EventIntegration clone() {
        try {
            return (EventIntegration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appintegrations.model.transform.EventIntegrationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
