/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/PutEventType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEventTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the event type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The event type variables.
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
     * The entity type for the event type. Example entity types: customer, merchant, account.
     * </p>
     */
    private java.util.List<String> entityTypes;
    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name.
     * </p>
     * 
     * @param name
     *        The name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name.
     * </p>
     * 
     * @return The name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name.
     * </p>
     * 
     * @param name
     *        The name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventTypeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the event type.
     * </p>
     * 
     * @param description
     *        The description of the event type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the event type.
     * </p>
     * 
     * @return The description of the event type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the event type.
     * </p>
     * 
     * @param description
     *        The description of the event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventTypeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The event type variables.
     * </p>
     * 
     * @return The event type variables.
     */

    public java.util.List<String> getEventVariables() {
        return eventVariables;
    }

    /**
     * <p>
     * The event type variables.
     * </p>
     * 
     * @param eventVariables
     *        The event type variables.
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
     * The event type variables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventVariables(java.util.Collection)} or {@link #withEventVariables(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param eventVariables
     *        The event type variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventTypeRequest withEventVariables(String... eventVariables) {
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
     * The event type variables.
     * </p>
     * 
     * @param eventVariables
     *        The event type variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventTypeRequest withEventVariables(java.util.Collection<String> eventVariables) {
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

    public PutEventTypeRequest withLabels(String... labels) {
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

    public PutEventTypeRequest withLabels(java.util.Collection<String> labels) {
        setLabels(labels);
        return this;
    }

    /**
     * <p>
     * The entity type for the event type. Example entity types: customer, merchant, account.
     * </p>
     * 
     * @return The entity type for the event type. Example entity types: customer, merchant, account.
     */

    public java.util.List<String> getEntityTypes() {
        return entityTypes;
    }

    /**
     * <p>
     * The entity type for the event type. Example entity types: customer, merchant, account.
     * </p>
     * 
     * @param entityTypes
     *        The entity type for the event type. Example entity types: customer, merchant, account.
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
     * The entity type for the event type. Example entity types: customer, merchant, account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityTypes(java.util.Collection)} or {@link #withEntityTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityTypes
     *        The entity type for the event type. Example entity types: customer, merchant, account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventTypeRequest withEntityTypes(String... entityTypes) {
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
     * The entity type for the event type. Example entity types: customer, merchant, account.
     * </p>
     * 
     * @param entityTypes
     *        The entity type for the event type. Example entity types: customer, merchant, account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventTypeRequest withEntityTypes(java.util.Collection<String> entityTypes) {
        setEntityTypes(entityTypes);
        return this;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @return A collection of key and value pairs.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventTypeRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventTypeRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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

        if (obj instanceof PutEventTypeRequest == false)
            return false;
        PutEventTypeRequest other = (PutEventTypeRequest) obj;
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventVariables() == null) ? 0 : getEventVariables().hashCode());
        hashCode = prime * hashCode + ((getLabels() == null) ? 0 : getLabels().hashCode());
        hashCode = prime * hashCode + ((getEntityTypes() == null) ? 0 : getEntityTypes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutEventTypeRequest clone() {
        return (PutEventTypeRequest) super.clone();
    }

}
