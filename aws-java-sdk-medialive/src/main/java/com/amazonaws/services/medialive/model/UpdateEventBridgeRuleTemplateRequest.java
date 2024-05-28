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
 * Placeholder documentation for UpdateEventBridgeRuleTemplateRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/UpdateEventBridgeRuleTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEventBridgeRuleTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A resource's optional description. */
    private String description;

    private java.util.List<EventBridgeRuleTemplateTarget> eventTargets;

    private String eventType;
    /** An eventbridge rule template group's identifier. Can be either be its id or current name. */
    private String groupIdentifier;
    /** An eventbridge rule template's identifier. Can be either be its id or current name. */
    private String identifier;
    /** A resource's name. Names must be unique within the scope of a resource type in a specific region. */
    private String name;

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

    public UpdateEventBridgeRuleTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<EventBridgeRuleTemplateTarget> getEventTargets() {
        return eventTargets;
    }

    /**
     * @param eventTargets
     */

    public void setEventTargets(java.util.Collection<EventBridgeRuleTemplateTarget> eventTargets) {
        if (eventTargets == null) {
            this.eventTargets = null;
            return;
        }

        this.eventTargets = new java.util.ArrayList<EventBridgeRuleTemplateTarget>(eventTargets);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTargets(java.util.Collection)} or {@link #withEventTargets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventTargets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventBridgeRuleTemplateRequest withEventTargets(EventBridgeRuleTemplateTarget... eventTargets) {
        if (this.eventTargets == null) {
            setEventTargets(new java.util.ArrayList<EventBridgeRuleTemplateTarget>(eventTargets.length));
        }
        for (EventBridgeRuleTemplateTarget ele : eventTargets) {
            this.eventTargets.add(ele);
        }
        return this;
    }

    /**
     * @param eventTargets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventBridgeRuleTemplateRequest withEventTargets(java.util.Collection<EventBridgeRuleTemplateTarget> eventTargets) {
        setEventTargets(eventTargets);
        return this;
    }

    /**
     * @param eventType
     * @see EventBridgeRuleTemplateEventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * @return
     * @see EventBridgeRuleTemplateEventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * @param eventType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventBridgeRuleTemplateEventType
     */

    public UpdateEventBridgeRuleTemplateRequest withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * @param eventType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventBridgeRuleTemplateEventType
     */

    public UpdateEventBridgeRuleTemplateRequest withEventType(EventBridgeRuleTemplateEventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * An eventbridge rule template group's identifier. Can be either be its id or current name.
     * 
     * @param groupIdentifier
     *        An eventbridge rule template group's identifier. Can be either be its id or current name.
     */

    public void setGroupIdentifier(String groupIdentifier) {
        this.groupIdentifier = groupIdentifier;
    }

    /**
     * An eventbridge rule template group's identifier. Can be either be its id or current name.
     * 
     * @return An eventbridge rule template group's identifier. Can be either be its id or current name.
     */

    public String getGroupIdentifier() {
        return this.groupIdentifier;
    }

    /**
     * An eventbridge rule template group's identifier. Can be either be its id or current name.
     * 
     * @param groupIdentifier
     *        An eventbridge rule template group's identifier. Can be either be its id or current name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventBridgeRuleTemplateRequest withGroupIdentifier(String groupIdentifier) {
        setGroupIdentifier(groupIdentifier);
        return this;
    }

    /**
     * An eventbridge rule template's identifier. Can be either be its id or current name.
     * 
     * @param identifier
     *        An eventbridge rule template's identifier. Can be either be its id or current name.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * An eventbridge rule template's identifier. Can be either be its id or current name.
     * 
     * @return An eventbridge rule template's identifier. Can be either be its id or current name.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * An eventbridge rule template's identifier. Can be either be its id or current name.
     * 
     * @param identifier
     *        An eventbridge rule template's identifier. Can be either be its id or current name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventBridgeRuleTemplateRequest withIdentifier(String identifier) {
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

    public UpdateEventBridgeRuleTemplateRequest withName(String name) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEventTargets() != null)
            sb.append("EventTargets: ").append(getEventTargets()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getGroupIdentifier() != null)
            sb.append("GroupIdentifier: ").append(getGroupIdentifier()).append(",");
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

        if (obj instanceof UpdateEventBridgeRuleTemplateRequest == false)
            return false;
        UpdateEventBridgeRuleTemplateRequest other = (UpdateEventBridgeRuleTemplateRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEventTargets() == null ^ this.getEventTargets() == null)
            return false;
        if (other.getEventTargets() != null && other.getEventTargets().equals(this.getEventTargets()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getGroupIdentifier() == null ^ this.getGroupIdentifier() == null)
            return false;
        if (other.getGroupIdentifier() != null && other.getGroupIdentifier().equals(this.getGroupIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventTargets() == null) ? 0 : getEventTargets().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getGroupIdentifier() == null) ? 0 : getGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEventBridgeRuleTemplateRequest clone() {
        return (UpdateEventBridgeRuleTemplateRequest) super.clone();
    }

}
