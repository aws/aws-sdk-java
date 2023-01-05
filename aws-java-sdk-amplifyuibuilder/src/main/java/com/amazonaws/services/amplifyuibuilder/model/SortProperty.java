/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes how to sort the data that you bind to a component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/SortProperty" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SortProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The direction of the sort, either ascending or descending.
     * </p>
     */
    private String direction;
    /**
     * <p>
     * The field to perform the sort on.
     * </p>
     */
    private String field;

    /**
     * <p>
     * The direction of the sort, either ascending or descending.
     * </p>
     * 
     * @param direction
     *        The direction of the sort, either ascending or descending.
     * @see SortDirection
     */

    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <p>
     * The direction of the sort, either ascending or descending.
     * </p>
     * 
     * @return The direction of the sort, either ascending or descending.
     * @see SortDirection
     */

    public String getDirection() {
        return this.direction;
    }

    /**
     * <p>
     * The direction of the sort, either ascending or descending.
     * </p>
     * 
     * @param direction
     *        The direction of the sort, either ascending or descending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortDirection
     */

    public SortProperty withDirection(String direction) {
        setDirection(direction);
        return this;
    }

    /**
     * <p>
     * The direction of the sort, either ascending or descending.
     * </p>
     * 
     * @param direction
     *        The direction of the sort, either ascending or descending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortDirection
     */

    public SortProperty withDirection(SortDirection direction) {
        this.direction = direction.toString();
        return this;
    }

    /**
     * <p>
     * The field to perform the sort on.
     * </p>
     * 
     * @param field
     *        The field to perform the sort on.
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The field to perform the sort on.
     * </p>
     * 
     * @return The field to perform the sort on.
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The field to perform the sort on.
     * </p>
     * 
     * @param field
     *        The field to perform the sort on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SortProperty withField(String field) {
        setField(field);
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
        if (getDirection() != null)
            sb.append("Direction: ").append(getDirection()).append(",");
        if (getField() != null)
            sb.append("Field: ").append(getField());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SortProperty == false)
            return false;
        SortProperty other = (SortProperty) obj;
        if (other.getDirection() == null ^ this.getDirection() == null)
            return false;
        if (other.getDirection() != null && other.getDirection().equals(this.getDirection()) == false)
            return false;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        return hashCode;
    }

    @Override
    public SortProperty clone() {
        try {
            return (SortProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.SortPropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
