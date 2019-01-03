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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the CreateThingType operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateThingTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing type.
     * </p>
     */
    private String thingTypeName;
    /**
     * <p>
     * The ThingTypeProperties for the thing type to create. It contains information about the new thing type including
     * a description, and a list of searchable thing attribute names.
     * </p>
     */
    private ThingTypeProperties thingTypeProperties;
    /**
     * <p>
     * Metadata which can be used to manage the thing type.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * 
     * @param thingTypeName
     *        The name of the thing type.
     */

    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * 
     * @return The name of the thing type.
     */

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type.
     * </p>
     * 
     * @param thingTypeName
     *        The name of the thing type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThingTypeRequest withThingTypeName(String thingTypeName) {
        setThingTypeName(thingTypeName);
        return this;
    }

    /**
     * <p>
     * The ThingTypeProperties for the thing type to create. It contains information about the new thing type including
     * a description, and a list of searchable thing attribute names.
     * </p>
     * 
     * @param thingTypeProperties
     *        The ThingTypeProperties for the thing type to create. It contains information about the new thing type
     *        including a description, and a list of searchable thing attribute names.
     */

    public void setThingTypeProperties(ThingTypeProperties thingTypeProperties) {
        this.thingTypeProperties = thingTypeProperties;
    }

    /**
     * <p>
     * The ThingTypeProperties for the thing type to create. It contains information about the new thing type including
     * a description, and a list of searchable thing attribute names.
     * </p>
     * 
     * @return The ThingTypeProperties for the thing type to create. It contains information about the new thing type
     *         including a description, and a list of searchable thing attribute names.
     */

    public ThingTypeProperties getThingTypeProperties() {
        return this.thingTypeProperties;
    }

    /**
     * <p>
     * The ThingTypeProperties for the thing type to create. It contains information about the new thing type including
     * a description, and a list of searchable thing attribute names.
     * </p>
     * 
     * @param thingTypeProperties
     *        The ThingTypeProperties for the thing type to create. It contains information about the new thing type
     *        including a description, and a list of searchable thing attribute names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThingTypeRequest withThingTypeProperties(ThingTypeProperties thingTypeProperties) {
        setThingTypeProperties(thingTypeProperties);
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the thing type.
     * </p>
     * 
     * @return Metadata which can be used to manage the thing type.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the thing type.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the thing type.
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
     * Metadata which can be used to manage the thing type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the thing type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThingTypeRequest withTags(Tag... tags) {
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
     * Metadata which can be used to manage the thing type.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the thing type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateThingTypeRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getThingTypeName() != null)
            sb.append("ThingTypeName: ").append(getThingTypeName()).append(",");
        if (getThingTypeProperties() != null)
            sb.append("ThingTypeProperties: ").append(getThingTypeProperties()).append(",");
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

        if (obj instanceof CreateThingTypeRequest == false)
            return false;
        CreateThingTypeRequest other = (CreateThingTypeRequest) obj;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getThingTypeProperties() == null ^ this.getThingTypeProperties() == null)
            return false;
        if (other.getThingTypeProperties() != null && other.getThingTypeProperties().equals(this.getThingTypeProperties()) == false)
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

        hashCode = prime * hashCode + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode + ((getThingTypeProperties() == null) ? 0 : getThingTypeProperties().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateThingTypeRequest clone() {
        return (CreateThingTypeRequest) super.clone();
    }

}
