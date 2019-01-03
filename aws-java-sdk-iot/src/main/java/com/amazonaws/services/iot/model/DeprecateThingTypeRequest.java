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
 * The input for the DeprecateThingType operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeprecateThingTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing type to deprecate.
     * </p>
     */
    private String thingTypeName;
    /**
     * <p>
     * Whether to undeprecate a deprecated thing type. If <b>true</b>, the thing type will not be deprecated anymore and
     * you can associate it with things.
     * </p>
     */
    private Boolean undoDeprecate;

    /**
     * <p>
     * The name of the thing type to deprecate.
     * </p>
     * 
     * @param thingTypeName
     *        The name of the thing type to deprecate.
     */

    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type to deprecate.
     * </p>
     * 
     * @return The name of the thing type to deprecate.
     */

    public String getThingTypeName() {
        return this.thingTypeName;
    }

    /**
     * <p>
     * The name of the thing type to deprecate.
     * </p>
     * 
     * @param thingTypeName
     *        The name of the thing type to deprecate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprecateThingTypeRequest withThingTypeName(String thingTypeName) {
        setThingTypeName(thingTypeName);
        return this;
    }

    /**
     * <p>
     * Whether to undeprecate a deprecated thing type. If <b>true</b>, the thing type will not be deprecated anymore and
     * you can associate it with things.
     * </p>
     * 
     * @param undoDeprecate
     *        Whether to undeprecate a deprecated thing type. If <b>true</b>, the thing type will not be deprecated
     *        anymore and you can associate it with things.
     */

    public void setUndoDeprecate(Boolean undoDeprecate) {
        this.undoDeprecate = undoDeprecate;
    }

    /**
     * <p>
     * Whether to undeprecate a deprecated thing type. If <b>true</b>, the thing type will not be deprecated anymore and
     * you can associate it with things.
     * </p>
     * 
     * @return Whether to undeprecate a deprecated thing type. If <b>true</b>, the thing type will not be deprecated
     *         anymore and you can associate it with things.
     */

    public Boolean getUndoDeprecate() {
        return this.undoDeprecate;
    }

    /**
     * <p>
     * Whether to undeprecate a deprecated thing type. If <b>true</b>, the thing type will not be deprecated anymore and
     * you can associate it with things.
     * </p>
     * 
     * @param undoDeprecate
     *        Whether to undeprecate a deprecated thing type. If <b>true</b>, the thing type will not be deprecated
     *        anymore and you can associate it with things.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeprecateThingTypeRequest withUndoDeprecate(Boolean undoDeprecate) {
        setUndoDeprecate(undoDeprecate);
        return this;
    }

    /**
     * <p>
     * Whether to undeprecate a deprecated thing type. If <b>true</b>, the thing type will not be deprecated anymore and
     * you can associate it with things.
     * </p>
     * 
     * @return Whether to undeprecate a deprecated thing type. If <b>true</b>, the thing type will not be deprecated
     *         anymore and you can associate it with things.
     */

    public Boolean isUndoDeprecate() {
        return this.undoDeprecate;
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
        if (getUndoDeprecate() != null)
            sb.append("UndoDeprecate: ").append(getUndoDeprecate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeprecateThingTypeRequest == false)
            return false;
        DeprecateThingTypeRequest other = (DeprecateThingTypeRequest) obj;
        if (other.getThingTypeName() == null ^ this.getThingTypeName() == null)
            return false;
        if (other.getThingTypeName() != null && other.getThingTypeName().equals(this.getThingTypeName()) == false)
            return false;
        if (other.getUndoDeprecate() == null ^ this.getUndoDeprecate() == null)
            return false;
        if (other.getUndoDeprecate() != null && other.getUndoDeprecate().equals(this.getUndoDeprecate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingTypeName() == null) ? 0 : getThingTypeName().hashCode());
        hashCode = prime * hashCode + ((getUndoDeprecate() == null) ? 0 : getUndoDeprecate().hashCode());
        return hashCode;
    }

    @Override
    public DeprecateThingTypeRequest clone() {
        return (DeprecateThingTypeRequest) super.clone();
    }

}
