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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The deleted unique ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/DeletedUniqueId" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletedUniqueId implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the deleted item.
     * </p>
     */
    private String uniqueId;

    /**
     * <p>
     * The unique ID of the deleted item.
     * </p>
     * 
     * @param uniqueId
     *        The unique ID of the deleted item.
     */

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    /**
     * <p>
     * The unique ID of the deleted item.
     * </p>
     * 
     * @return The unique ID of the deleted item.
     */

    public String getUniqueId() {
        return this.uniqueId;
    }

    /**
     * <p>
     * The unique ID of the deleted item.
     * </p>
     * 
     * @param uniqueId
     *        The unique ID of the deleted item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletedUniqueId withUniqueId(String uniqueId) {
        setUniqueId(uniqueId);
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
        if (getUniqueId() != null)
            sb.append("UniqueId: ").append(getUniqueId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletedUniqueId == false)
            return false;
        DeletedUniqueId other = (DeletedUniqueId) obj;
        if (other.getUniqueId() == null ^ this.getUniqueId() == null)
            return false;
        if (other.getUniqueId() != null && other.getUniqueId().equals(this.getUniqueId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUniqueId() == null) ? 0 : getUniqueId().hashCode());
        return hashCode;
    }

    @Override
    public DeletedUniqueId clone() {
        try {
            return (DeletedUniqueId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.DeletedUniqueIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
