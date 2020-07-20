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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The event type details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/EventType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The event type name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The event type description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The event type event variables.
     * </p>
     */
    private java.util.List<String> eventVariables;
    /**
     * <p>
     * The event type labels.
     * </p>
     */
    private java.util.List<String> labels;
    /**
     * <p>
     * The event type entity types.
     * </p>
     */
    private java.util.List<String> entityTypes;
    /**
     * <p>
     * Timestamp of when the event type was last updated.
     * </p>
     */
    private String lastUpdatedTime;
    /**
     * <p>
     * Timestamp of when the event type was created.
     * </p>
     */
    private String createdTime;
    /**
     * <p>
     * The entity type ARN.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The event type name.
     * </p>
     * 
     * @param name
     *        The event type name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The event type name.
     * </p>
     * 
     * @return The event type name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The event type name.
     * </p>
     * 
     * @param name
     *        The event type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventType withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The event type description.
     * </p>
     * 
     * @param description
     *        The event type description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The event type description.
     * </p>
     * 
     * @return The event type description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The event type description.
     * </p>
     * 
     * @param description
     *        The event type description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventType withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The event type event variables.
     * </p>
     * 
     * @return The event type event variables.
     */

    public java.util.List<String> getEventVariables() {
        return eventVariables;
    }

    /**
     * <p>
     * The event type event variables.
     * </p>
     * 
     * @param eventVariables
     *        The event type event variables.
     */

    public void setEventVariables(java.util.Collection<String> eventVariables) {
        if (eventVariables == null) {
            this.eventVariables = null;
            return;
        }

        this.eventVariables = new java.util.ArrayList<String>(eventVariables);
    }

    /**
     * <p>
     * The event type event variables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventVariables(java.util.Collection)} or {@link #withEventVariables(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param eventVariables
     *        The event type event variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventType withEventVariables(String... eventVariables) {
        if (this.eventVariables == null) {
            setEventVariables(new java.util.ArrayList<String>(eventVariables.length));
        }
        for (String ele : eventVariables) {
            this.eventVariables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event type event variables.
     * </p>
     * 
     * @param eventVariables
     *        The event type event variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventType withEventVariables(java.util.Collection<String> eventVariables) {
        setEventVariables(eventVariables);
        return this;
    }

    /**
     * <p>
     * The event type labels.
     * </p>
     * 
     * @return The event type labels.
     */

    public java.util.List<String> getLabels() {
        return labels;
    }

    /**
     * <p>
     * The event type labels.
     * </p>
     * 
     * @param labels
     *        The event type labels.
     */

    public void setLabels(java.util.Collection<String> labels) {
        if (labels == null) {
            this.labels = null;
            return;
        }

        this.labels = new java.util.ArrayList<String>(labels);
    }

    /**
     * <p>
     * The event type labels.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabels(java.util.Collection)} or {@link #withLabels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param labels
     *        The event type labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventType withLabels(String... labels) {
        if (this.labels == null) {
            setLabels(new java.util.ArrayList<String>(labels.length));
        }
        for (String ele : labels) {
            this.labels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event type labels.
     * </p>
     * 
     * @param labels
     *        The event type labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventType withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * The event type entity types.
     * </p>
     * 
     * @return The event type entity types.
     */

    public java.util.List<String> getEntityTypes() {
        return entityTypes;
    }

    /**
     * <p>
     * The event type entity types.
     * </p>
     * 
     * @param entityTypes
     *        The event type entity types.
     */

    public void setEntityTypes(java.util.Collection<String> entityTypes) {
        if (entityTypes == null) {
            this.entityTypes = null;
            return;
        }

        this.entityTypes = new java.util.ArrayList<String>(entityTypes);
    }

    /**
     * <p>
     * The event type entity types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityTypes(java.util.Collection)} or {@link #withEntityTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityTypes
     *        The event type entity types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventType withEntityTypes(String... entityTypes) {
        if (this.entityTypes == null) {
            setEntityTypes(new java.util.ArrayList<String>(entityTypes.length));
        }
        for (String ele : entityTypes) {
            this.entityTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event type entity types.
     * </p>
     * 
     * @param entityTypes
     *        The event type entity types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventType withEntityTypes(java.util.Collection<String> entityTypes) {
        setEntityTypes(entityTypes);
        return this;
    }

    /**
     * <p>
     * Timestamp of when the event type was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Timestamp of when the event type was last updated.
     */

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of when the event type was last updated.
     * </p>
     * 
     * @return Timestamp of when the event type was last updated.
     */

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of when the event type was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Timestamp of when the event type was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventType withLastUpdatedTime(String lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * Timestamp of when the event type was created.
     * </p>
     * 
     * @param createdTime
     *        Timestamp of when the event type was created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * Timestamp of when the event type was created.
     * </p>
     * 
     * @return Timestamp of when the event type was created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * Timestamp of when the event type was created.
     * </p>
     * 
     * @param createdTime
     *        Timestamp of when the event type was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventType withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The entity type ARN.
     * </p>
     * 
     * @param arn
     *        The entity type ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The entity type ARN.
     * </p>
     * 
     * @return The entity type ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The entity type ARN.
     * </p>
     * 
     * @param arn
     *        The entity type ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventType withArn(String arn) {
        setArn(arn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEventVariables() != null)
            sb.append("EventVariables: ").append(getEventVariables()).append(",");
        if (getLabels() != null)
            sb.append("Labels: ").append(getLabels()).append(",");
        if (getEntityTypes() != null)
            sb.append("EntityTypes: ").append(getEntityTypes()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventType == false)
            return false;
        EventType other = (EventType) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEventVariables() == null ^ this.getEventVariables() == null)
            return false;
        if (other.getEventVariables() != null && other.getEventVariables().equals(this.getEventVariables()) == false)
            return false;
        if (other.getLabels() == null ^ this.getLabels() == null)
            return false;
        if (other.getLabels() != null && other.getLabels().equals(this.getLabels()) == false)
            return false;
        if (other.getEntityTypes() == null ^ this.getEntityTypes() == null)
            return false;
        if (other.getEntityTypes() != null && other.getEntityTypes().equals(this.getEntityTypes()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventVariables() == null) ? 0 : getEventVariables().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getEntityTypes() == null) ? 0 : getEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public EventType clone() {
        try {
            return (EventType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.EventTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
