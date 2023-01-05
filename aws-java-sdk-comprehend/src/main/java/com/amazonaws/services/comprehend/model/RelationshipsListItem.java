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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List of child blocks for the current block.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/RelationshipsListItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationshipsListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifers of the child blocks.
     * </p>
     */
    private java.util.List<String> ids;
    /**
     * <p>
     * Only supported relationship is a child relationship.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Identifers of the child blocks.
     * </p>
     * 
     * @return Identifers of the child blocks.
     */

    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * Identifers of the child blocks.
     * </p>
     * 
     * @param ids
     *        Identifers of the child blocks.
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
     * Identifers of the child blocks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIds(java.util.Collection)} or {@link #withIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ids
     *        Identifers of the child blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationshipsListItem withIds(String... ids) {
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
     * Identifers of the child blocks.
     * </p>
     * 
     * @param ids
     *        Identifers of the child blocks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationshipsListItem withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * <p>
     * Only supported relationship is a child relationship.
     * </p>
     * 
     * @param type
     *        Only supported relationship is a child relationship.
     * @see RelationshipType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Only supported relationship is a child relationship.
     * </p>
     * 
     * @return Only supported relationship is a child relationship.
     * @see RelationshipType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Only supported relationship is a child relationship.
     * </p>
     * 
     * @param type
     *        Only supported relationship is a child relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationshipType
     */

    public RelationshipsListItem withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Only supported relationship is a child relationship.
     * </p>
     * 
     * @param type
     *        Only supported relationship is a child relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationshipType
     */

    public RelationshipsListItem withType(RelationshipType type) {
        this.type = type.toString();
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
        if (getIds() != null)
            sb.append("Ids: ").append(getIds()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationshipsListItem == false)
            return false;
        RelationshipsListItem other = (RelationshipsListItem) obj;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RelationshipsListItem clone() {
        try {
            return (RelationshipsListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.RelationshipsListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
