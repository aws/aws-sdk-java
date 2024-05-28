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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object encompassing information about a schema change to a single, particular field, a notification can have up to
 * 100 of these.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/SchemaChangeDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaChangeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the changing field. This value can be up to 255 characters long.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Is the field being added, removed, or modified?
     * </p>
     */
    private String type;
    /**
     * <p>
     * Description of what's changing about this field. This value can be up to 512 characters long.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Name of the changing field. This value can be up to 255 characters long.
     * </p>
     * 
     * @param name
     *        Name of the changing field. This value can be up to 255 characters long.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the changing field. This value can be up to 255 characters long.
     * </p>
     * 
     * @return Name of the changing field. This value can be up to 255 characters long.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the changing field. This value can be up to 255 characters long.
     * </p>
     * 
     * @param name
     *        Name of the changing field. This value can be up to 255 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaChangeDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Is the field being added, removed, or modified?
     * </p>
     * 
     * @param type
     *        Is the field being added, removed, or modified?
     * @see SchemaChangeType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Is the field being added, removed, or modified?
     * </p>
     * 
     * @return Is the field being added, removed, or modified?
     * @see SchemaChangeType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Is the field being added, removed, or modified?
     * </p>
     * 
     * @param type
     *        Is the field being added, removed, or modified?
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaChangeType
     */

    public SchemaChangeDetails withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Is the field being added, removed, or modified?
     * </p>
     * 
     * @param type
     *        Is the field being added, removed, or modified?
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaChangeType
     */

    public SchemaChangeDetails withType(SchemaChangeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Description of what's changing about this field. This value can be up to 512 characters long.
     * </p>
     * 
     * @param description
     *        Description of what's changing about this field. This value can be up to 512 characters long.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of what's changing about this field. This value can be up to 512 characters long.
     * </p>
     * 
     * @return Description of what's changing about this field. This value can be up to 512 characters long.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of what's changing about this field. This value can be up to 512 characters long.
     * </p>
     * 
     * @param description
     *        Description of what's changing about this field. This value can be up to 512 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaChangeDetails withDescription(String description) {
        setDescription(description);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaChangeDetails == false)
            return false;
        SchemaChangeDetails other = (SchemaChangeDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public SchemaChangeDetails clone() {
        try {
            return (SchemaChangeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.SchemaChangeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
