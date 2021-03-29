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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing other metadata for a schema version belonging to the same metadata key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/OtherMetadataValueListItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OtherMetadataValueListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metadata key’s corresponding value for the other metadata belonging to the same metadata key.
     * </p>
     */
    private String metadataValue;
    /**
     * <p>
     * The time at which the entry was created.
     * </p>
     */
    private String createdTime;

    /**
     * <p>
     * The metadata key’s corresponding value for the other metadata belonging to the same metadata key.
     * </p>
     * 
     * @param metadataValue
     *        The metadata key’s corresponding value for the other metadata belonging to the same metadata key.
     */

    public void setMetadataValue(String metadataValue) {
        this.metadataValue = metadataValue;
    }

    /**
     * <p>
     * The metadata key’s corresponding value for the other metadata belonging to the same metadata key.
     * </p>
     * 
     * @return The metadata key’s corresponding value for the other metadata belonging to the same metadata key.
     */

    public String getMetadataValue() {
        return this.metadataValue;
    }

    /**
     * <p>
     * The metadata key’s corresponding value for the other metadata belonging to the same metadata key.
     * </p>
     * 
     * @param metadataValue
     *        The metadata key’s corresponding value for the other metadata belonging to the same metadata key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OtherMetadataValueListItem withMetadataValue(String metadataValue) {
        setMetadataValue(metadataValue);
        return this;
    }

    /**
     * <p>
     * The time at which the entry was created.
     * </p>
     * 
     * @param createdTime
     *        The time at which the entry was created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time at which the entry was created.
     * </p>
     * 
     * @return The time at which the entry was created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time at which the entry was created.
     * </p>
     * 
     * @param createdTime
     *        The time at which the entry was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OtherMetadataValueListItem withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
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
        if (getMetadataValue() != null)
            sb.append("MetadataValue: ").append(getMetadataValue()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OtherMetadataValueListItem == false)
            return false;
        OtherMetadataValueListItem other = (OtherMetadataValueListItem) obj;
        if (other.getMetadataValue() == null ^ this.getMetadataValue() == null)
            return false;
        if (other.getMetadataValue() != null && other.getMetadataValue().equals(this.getMetadataValue()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadataValue() == null) ? 0 : getMetadataValue().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public OtherMetadataValueListItem clone() {
        try {
            return (OtherMetadataValueListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.OtherMetadataValueListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
