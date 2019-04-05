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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about how blocks are related to each other. A <code>Block</code> object contains 0 or more
 * <code>Relation</code> objects in a list, <code>Relationships</code>. For more information, see <a>Block</a>.
 * </p>
 * <p>
 * The <code>Type</code> element provides the type of the relationship for all blocks in the <code>IDs</code> array.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/Relationship" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Relationship implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of relationship that the blocks in the IDs array have with the current block. The relationship can be
     * <code>VALUE</code> or <code>CHILD</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * An array of IDs for related blocks. You can get the type of the relationship from the <code>Type</code> element.
     * </p>
     */
    private java.util.List<String> ids;

    /**
     * <p>
     * The type of relationship that the blocks in the IDs array have with the current block. The relationship can be
     * <code>VALUE</code> or <code>CHILD</code>.
     * </p>
     * 
     * @param type
     *        The type of relationship that the blocks in the IDs array have with the current block. The relationship
     *        can be <code>VALUE</code> or <code>CHILD</code>.
     * @see RelationshipType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of relationship that the blocks in the IDs array have with the current block. The relationship can be
     * <code>VALUE</code> or <code>CHILD</code>.
     * </p>
     * 
     * @return The type of relationship that the blocks in the IDs array have with the current block. The relationship
     *         can be <code>VALUE</code> or <code>CHILD</code>.
     * @see RelationshipType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of relationship that the blocks in the IDs array have with the current block. The relationship can be
     * <code>VALUE</code> or <code>CHILD</code>.
     * </p>
     * 
     * @param type
     *        The type of relationship that the blocks in the IDs array have with the current block. The relationship
     *        can be <code>VALUE</code> or <code>CHILD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationshipType
     */

    public Relationship withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of relationship that the blocks in the IDs array have with the current block. The relationship can be
     * <code>VALUE</code> or <code>CHILD</code>.
     * </p>
     * 
     * @param type
     *        The type of relationship that the blocks in the IDs array have with the current block. The relationship
     *        can be <code>VALUE</code> or <code>CHILD</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationshipType
     */

    public Relationship withType(RelationshipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * An array of IDs for related blocks. You can get the type of the relationship from the <code>Type</code> element.
     * </p>
     * 
     * @return An array of IDs for related blocks. You can get the type of the relationship from the <code>Type</code>
     *         element.
     */

    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * An array of IDs for related blocks. You can get the type of the relationship from the <code>Type</code> element.
     * </p>
     * 
     * @param ids
     *        An array of IDs for related blocks. You can get the type of the relationship from the <code>Type</code>
     *        element.
     */

    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * An array of IDs for related blocks. You can get the type of the relationship from the <code>Type</code> element.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIds(java.util.Collection)} or {@link #withIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ids
     *        An array of IDs for related blocks. You can get the type of the relationship from the <code>Type</code>
     *        element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relationship withIds(String... ids) {
        if (this.ids == null) {
            setIds(new java.util.ArrayList<String>(ids.length));
        }
        for (String ele : ids) {
            this.ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of IDs for related blocks. You can get the type of the relationship from the <code>Type</code> element.
     * </p>
     * 
     * @param ids
     *        An array of IDs for related blocks. You can get the type of the relationship from the <code>Type</code>
     *        element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relationship withIds(java.util.Collection<String> ids) {
        setIds(ids);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getIds() != null)
            sb.append("Ids: ").append(getIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Relationship == false)
            return false;
        Relationship other = (Relationship) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        return hashCode;
    }

    @Override
    public Relationship clone() {
        try {
            return (Relationship) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.RelationshipMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
