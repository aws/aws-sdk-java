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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties that can be applied to a field when connector is being used as a destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DestinationFieldProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationFieldProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies if the destination field can be created by the current user.
     * </p>
     */
    private Boolean isCreatable;
    /**
     * <p>
     * Specifies if the destination field can have a null value.
     * </p>
     */
    private Boolean isNullable;
    /**
     * <p>
     * Specifies if the flow run can either insert new rows in the destination field if they do not already exist, or
     * update them if they do.
     * </p>
     */
    private Boolean isUpsertable;

    /**
     * <p>
     * Specifies if the destination field can be created by the current user.
     * </p>
     * 
     * @param isCreatable
     *        Specifies if the destination field can be created by the current user.
     */

    public void setIsCreatable(Boolean isCreatable) {
        this.isCreatable = isCreatable;
    }

    /**
     * <p>
     * Specifies if the destination field can be created by the current user.
     * </p>
     * 
     * @return Specifies if the destination field can be created by the current user.
     */

    public Boolean getIsCreatable() {
        return this.isCreatable;
    }

    /**
     * <p>
     * Specifies if the destination field can be created by the current user.
     * </p>
     * 
     * @param isCreatable
     *        Specifies if the destination field can be created by the current user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationFieldProperties withIsCreatable(Boolean isCreatable) {
        setIsCreatable(isCreatable);
        return this;
    }

    /**
     * <p>
     * Specifies if the destination field can be created by the current user.
     * </p>
     * 
     * @return Specifies if the destination field can be created by the current user.
     */

    public Boolean isCreatable() {
        return this.isCreatable;
    }

    /**
     * <p>
     * Specifies if the destination field can have a null value.
     * </p>
     * 
     * @param isNullable
     *        Specifies if the destination field can have a null value.
     */

    public void setIsNullable(Boolean isNullable) {
        this.isNullable = isNullable;
    }

    /**
     * <p>
     * Specifies if the destination field can have a null value.
     * </p>
     * 
     * @return Specifies if the destination field can have a null value.
     */

    public Boolean getIsNullable() {
        return this.isNullable;
    }

    /**
     * <p>
     * Specifies if the destination field can have a null value.
     * </p>
     * 
     * @param isNullable
     *        Specifies if the destination field can have a null value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationFieldProperties withIsNullable(Boolean isNullable) {
        setIsNullable(isNullable);
        return this;
    }

    /**
     * <p>
     * Specifies if the destination field can have a null value.
     * </p>
     * 
     * @return Specifies if the destination field can have a null value.
     */

    public Boolean isNullable() {
        return this.isNullable;
    }

    /**
     * <p>
     * Specifies if the flow run can either insert new rows in the destination field if they do not already exist, or
     * update them if they do.
     * </p>
     * 
     * @param isUpsertable
     *        Specifies if the flow run can either insert new rows in the destination field if they do not already
     *        exist, or update them if they do.
     */

    public void setIsUpsertable(Boolean isUpsertable) {
        this.isUpsertable = isUpsertable;
    }

    /**
     * <p>
     * Specifies if the flow run can either insert new rows in the destination field if they do not already exist, or
     * update them if they do.
     * </p>
     * 
     * @return Specifies if the flow run can either insert new rows in the destination field if they do not already
     *         exist, or update them if they do.
     */

    public Boolean getIsUpsertable() {
        return this.isUpsertable;
    }

    /**
     * <p>
     * Specifies if the flow run can either insert new rows in the destination field if they do not already exist, or
     * update them if they do.
     * </p>
     * 
     * @param isUpsertable
     *        Specifies if the flow run can either insert new rows in the destination field if they do not already
     *        exist, or update them if they do.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationFieldProperties withIsUpsertable(Boolean isUpsertable) {
        setIsUpsertable(isUpsertable);
        return this;
    }

    /**
     * <p>
     * Specifies if the flow run can either insert new rows in the destination field if they do not already exist, or
     * update them if they do.
     * </p>
     * 
     * @return Specifies if the flow run can either insert new rows in the destination field if they do not already
     *         exist, or update them if they do.
     */

    public Boolean isUpsertable() {
        return this.isUpsertable;
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
        if (getIsCreatable() != null)
            sb.append("IsCreatable: ").append(getIsCreatable()).append(",");
        if (getIsNullable() != null)
            sb.append("IsNullable: ").append(getIsNullable()).append(",");
        if (getIsUpsertable() != null)
            sb.append("IsUpsertable: ").append(getIsUpsertable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationFieldProperties == false)
            return false;
        DestinationFieldProperties other = (DestinationFieldProperties) obj;
        if (other.getIsCreatable() == null ^ this.getIsCreatable() == null)
            return false;
        if (other.getIsCreatable() != null && other.getIsCreatable().equals(this.getIsCreatable()) == false)
            return false;
        if (other.getIsNullable() == null ^ this.getIsNullable() == null)
            return false;
        if (other.getIsNullable() != null && other.getIsNullable().equals(this.getIsNullable()) == false)
            return false;
        if (other.getIsUpsertable() == null ^ this.getIsUpsertable() == null)
            return false;
        if (other.getIsUpsertable() != null && other.getIsUpsertable().equals(this.getIsUpsertable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsCreatable() == null) ? 0 : getIsCreatable().hashCode());
        hashCode = prime * hashCode + ((getIsNullable() == null) ? 0 : getIsNullable().hashCode());
        hashCode = prime * hashCode + ((getIsUpsertable() == null) ? 0 : getIsUpsertable().hashCode());
        return hashCode;
    }

    @Override
    public DestinationFieldProperties clone() {
        try {
            return (DestinationFieldProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.DestinationFieldPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
