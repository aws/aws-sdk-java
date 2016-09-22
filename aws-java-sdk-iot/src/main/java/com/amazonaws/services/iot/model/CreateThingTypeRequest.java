/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the CreateThingType operation.
 * </p>
 */
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ThingTypeName: " + getThingTypeName() + ",");
        if (getThingTypeProperties() != null)
            sb.append("ThingTypeProperties: " + getThingTypeProperties());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode + ((getThingTypeProperties() == null) ? 0 : getThingTypeProperties().hashCode());
        return hashCode;
    }

    @Override
    public CreateThingTypeRequest clone() {
        return (CreateThingTypeRequest) super.clone();
    }
}
