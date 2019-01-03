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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The ThingTypeProperties contains information about the thing type including: a thing type description, and a list of
 * searchable thing attribute names.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThingTypeProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the thing type.
     * </p>
     */
    private String thingTypeDescription;
    /**
     * <p>
     * A list of searchable thing attribute names.
     * </p>
     */
    private java.util.List<String> searchableAttributes;

    /**
     * <p>
     * The description of the thing type.
     * </p>
     * 
     * @param thingTypeDescription
     *        The description of the thing type.
     */

    public void setThingTypeDescription(String thingTypeDescription) {
        this.thingTypeDescription = thingTypeDescription;
    }

    /**
     * <p>
     * The description of the thing type.
     * </p>
     * 
     * @return The description of the thing type.
     */

    public String getThingTypeDescription() {
        return this.thingTypeDescription;
    }

    /**
     * <p>
     * The description of the thing type.
     * </p>
     * 
     * @param thingTypeDescription
     *        The description of the thing type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingTypeProperties withThingTypeDescription(String thingTypeDescription) {
        setThingTypeDescription(thingTypeDescription);
        return this;
    }

    /**
     * <p>
     * A list of searchable thing attribute names.
     * </p>
     * 
     * @return A list of searchable thing attribute names.
     */

    public java.util.List<String> getSearchableAttributes() {
        return searchableAttributes;
    }

    /**
     * <p>
     * A list of searchable thing attribute names.
     * </p>
     * 
     * @param searchableAttributes
     *        A list of searchable thing attribute names.
     */

    public void setSearchableAttributes(java.util.Collection<String> searchableAttributes) {
        if (searchableAttributes == null) {
            this.searchableAttributes = null;
            return;
        }

        this.searchableAttributes = new java.util.ArrayList<String>(searchableAttributes);
    }

    /**
     * <p>
     * A list of searchable thing attribute names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSearchableAttributes(java.util.Collection)} or {@link #withSearchableAttributes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param searchableAttributes
     *        A list of searchable thing attribute names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingTypeProperties withSearchableAttributes(String... searchableAttributes) {
        if (this.searchableAttributes == null) {
            setSearchableAttributes(new java.util.ArrayList<String>(searchableAttributes.length));
        }
        for (String ele : searchableAttributes) {
            this.searchableAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of searchable thing attribute names.
     * </p>
     * 
     * @param searchableAttributes
     *        A list of searchable thing attribute names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingTypeProperties withSearchableAttributes(java.util.Collection<String> searchableAttributes) {
        setSearchableAttributes(searchableAttributes);
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
        if (getThingTypeDescription() != null)
            sb.append("ThingTypeDescription: ").append(getThingTypeDescription()).append(",");
        if (getSearchableAttributes() != null)
            sb.append("SearchableAttributes: ").append(getSearchableAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingTypeProperties == false)
            return false;
        ThingTypeProperties other = (ThingTypeProperties) obj;
        if (other.getThingTypeDescription() == null ^ this.getThingTypeDescription() == null)
            return false;
        if (other.getThingTypeDescription() != null && other.getThingTypeDescription().equals(this.getThingTypeDescription()) == false)
            return false;
        if (other.getSearchableAttributes() == null ^ this.getSearchableAttributes() == null)
            return false;
        if (other.getSearchableAttributes() != null && other.getSearchableAttributes().equals(this.getSearchableAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingTypeDescription() == null) ? 0 : getThingTypeDescription().hashCode());
        hashCode = prime * hashCode + ((getSearchableAttributes() == null) ? 0 : getSearchableAttributes().hashCode());
        return hashCode;
    }

    @Override
    public ThingTypeProperties clone() {
        try {
            return (ThingTypeProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ThingTypePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
