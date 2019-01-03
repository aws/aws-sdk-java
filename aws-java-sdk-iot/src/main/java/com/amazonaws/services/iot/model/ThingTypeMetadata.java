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
 * The ThingTypeMetadata contains additional information about the thing type including: creation date and time, a value
 * indicating whether the thing type is deprecated, and a date and time when time was deprecated.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThingTypeMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether the thing type is deprecated. If <b>true</b>, no new things could be associated with this type.
     * </p>
     */
    private Boolean deprecated;
    /**
     * <p>
     * The date and time when the thing type was deprecated.
     * </p>
     */
    private java.util.Date deprecationDate;
    /**
     * <p>
     * The date and time when the thing type was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * Whether the thing type is deprecated. If <b>true</b>, no new things could be associated with this type.
     * </p>
     * 
     * @param deprecated
     *        Whether the thing type is deprecated. If <b>true</b>, no new things could be associated with this type.
     */

    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    /**
     * <p>
     * Whether the thing type is deprecated. If <b>true</b>, no new things could be associated with this type.
     * </p>
     * 
     * @return Whether the thing type is deprecated. If <b>true</b>, no new things could be associated with this type.
     */

    public Boolean getDeprecated() {
        return this.deprecated;
    }

    /**
     * <p>
     * Whether the thing type is deprecated. If <b>true</b>, no new things could be associated with this type.
     * </p>
     * 
     * @param deprecated
     *        Whether the thing type is deprecated. If <b>true</b>, no new things could be associated with this type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingTypeMetadata withDeprecated(Boolean deprecated) {
        setDeprecated(deprecated);
        return this;
    }

    /**
     * <p>
     * Whether the thing type is deprecated. If <b>true</b>, no new things could be associated with this type.
     * </p>
     * 
     * @return Whether the thing type is deprecated. If <b>true</b>, no new things could be associated with this type.
     */

    public Boolean isDeprecated() {
        return this.deprecated;
    }

    /**
     * <p>
     * The date and time when the thing type was deprecated.
     * </p>
     * 
     * @param deprecationDate
     *        The date and time when the thing type was deprecated.
     */

    public void setDeprecationDate(java.util.Date deprecationDate) {
        this.deprecationDate = deprecationDate;
    }

    /**
     * <p>
     * The date and time when the thing type was deprecated.
     * </p>
     * 
     * @return The date and time when the thing type was deprecated.
     */

    public java.util.Date getDeprecationDate() {
        return this.deprecationDate;
    }

    /**
     * <p>
     * The date and time when the thing type was deprecated.
     * </p>
     * 
     * @param deprecationDate
     *        The date and time when the thing type was deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingTypeMetadata withDeprecationDate(java.util.Date deprecationDate) {
        setDeprecationDate(deprecationDate);
        return this;
    }

    /**
     * <p>
     * The date and time when the thing type was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the thing type was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the thing type was created.
     * </p>
     * 
     * @return The date and time when the thing type was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time when the thing type was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the thing type was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThingTypeMetadata withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getDeprecated() != null)
            sb.append("Deprecated: ").append(getDeprecated()).append(",");
        if (getDeprecationDate() != null)
            sb.append("DeprecationDate: ").append(getDeprecationDate()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThingTypeMetadata == false)
            return false;
        ThingTypeMetadata other = (ThingTypeMetadata) obj;
        if (other.getDeprecated() == null ^ this.getDeprecated() == null)
            return false;
        if (other.getDeprecated() != null && other.getDeprecated().equals(this.getDeprecated()) == false)
            return false;
        if (other.getDeprecationDate() == null ^ this.getDeprecationDate() == null)
            return false;
        if (other.getDeprecationDate() != null && other.getDeprecationDate().equals(this.getDeprecationDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeprecated() == null) ? 0 : getDeprecated().hashCode());
        hashCode = prime * hashCode + ((getDeprecationDate() == null) ? 0 : getDeprecationDate().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public ThingTypeMetadata clone() {
        try {
            return (ThingTypeMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ThingTypeMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
