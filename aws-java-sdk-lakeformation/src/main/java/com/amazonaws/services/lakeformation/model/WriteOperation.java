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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines an object to add to or delete from a governed table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/WriteOperation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WriteOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A new object to add to the governed table.
     * </p>
     */
    private AddObjectInput addObject;
    /**
     * <p>
     * An object to delete from the governed table.
     * </p>
     */
    private DeleteObjectInput deleteObject;

    /**
     * <p>
     * A new object to add to the governed table.
     * </p>
     * 
     * @param addObject
     *        A new object to add to the governed table.
     */

    public void setAddObject(AddObjectInput addObject) {
        this.addObject = addObject;
    }

    /**
     * <p>
     * A new object to add to the governed table.
     * </p>
     * 
     * @return A new object to add to the governed table.
     */

    public AddObjectInput getAddObject() {
        return this.addObject;
    }

    /**
     * <p>
     * A new object to add to the governed table.
     * </p>
     * 
     * @param addObject
     *        A new object to add to the governed table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteOperation withAddObject(AddObjectInput addObject) {
        setAddObject(addObject);
        return this;
    }

    /**
     * <p>
     * An object to delete from the governed table.
     * </p>
     * 
     * @param deleteObject
     *        An object to delete from the governed table.
     */

    public void setDeleteObject(DeleteObjectInput deleteObject) {
        this.deleteObject = deleteObject;
    }

    /**
     * <p>
     * An object to delete from the governed table.
     * </p>
     * 
     * @return An object to delete from the governed table.
     */

    public DeleteObjectInput getDeleteObject() {
        return this.deleteObject;
    }

    /**
     * <p>
     * An object to delete from the governed table.
     * </p>
     * 
     * @param deleteObject
     *        An object to delete from the governed table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WriteOperation withDeleteObject(DeleteObjectInput deleteObject) {
        setDeleteObject(deleteObject);
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
        if (getAddObject() != null)
            sb.append("AddObject: ").append(getAddObject()).append(",");
        if (getDeleteObject() != null)
            sb.append("DeleteObject: ").append(getDeleteObject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WriteOperation == false)
            return false;
        WriteOperation other = (WriteOperation) obj;
        if (other.getAddObject() == null ^ this.getAddObject() == null)
            return false;
        if (other.getAddObject() != null && other.getAddObject().equals(this.getAddObject()) == false)
            return false;
        if (other.getDeleteObject() == null ^ this.getDeleteObject() == null)
            return false;
        if (other.getDeleteObject() != null && other.getDeleteObject().equals(this.getDeleteObject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddObject() == null) ? 0 : getAddObject().hashCode());
        hashCode = prime * hashCode + ((getDeleteObject() == null) ? 0 : getDeleteObject().hashCode());
        return hashCode;
    }

    @Override
    public WriteOperation clone() {
        try {
            return (WriteOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.WriteOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
