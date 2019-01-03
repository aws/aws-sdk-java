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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result of calling the operation. The operation returns one object for each document that is successfully
 * processed by the operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectEntitiesItemResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDetectEntitiesItemResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     */
    private Integer index;
    /**
     * <p>
     * One or more <a>Entity</a> objects, one for each entity detected in the document.
     * </p>
     */
    private java.util.List<Entity> entities;

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @param index
     *        The zero-based index of the document in the input list.
     */

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @return The zero-based index of the document in the input list.
     */

    public Integer getIndex() {
        return this.index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @param index
     *        The zero-based index of the document in the input list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectEntitiesItemResult withIndex(Integer index) {
        setIndex(index);
        return this;
    }

    /**
     * <p>
     * One or more <a>Entity</a> objects, one for each entity detected in the document.
     * </p>
     * 
     * @return One or more <a>Entity</a> objects, one for each entity detected in the document.
     */

    public java.util.List<Entity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * One or more <a>Entity</a> objects, one for each entity detected in the document.
     * </p>
     * 
     * @param entities
     *        One or more <a>Entity</a> objects, one for each entity detected in the document.
     */

    public void setEntities(java.util.Collection<Entity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<Entity>(entities);
    }

    /**
     * <p>
     * One or more <a>Entity</a> objects, one for each entity detected in the document.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntities(java.util.Collection)} or {@link #withEntities(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entities
     *        One or more <a>Entity</a> objects, one for each entity detected in the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectEntitiesItemResult withEntities(Entity... entities) {
        if (this.entities == null) {
            setEntities(new java.util.ArrayList<Entity>(entities.length));
        }
        for (Entity ele : entities) {
            this.entities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more <a>Entity</a> objects, one for each entity detected in the document.
     * </p>
     * 
     * @param entities
     *        One or more <a>Entity</a> objects, one for each entity detected in the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectEntitiesItemResult withEntities(java.util.Collection<Entity> entities) {
        setEntities(entities);
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
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex()).append(",");
        if (getEntities() != null)
            sb.append("Entities: ").append(getEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetectEntitiesItemResult == false)
            return false;
        BatchDetectEntitiesItemResult other = (BatchDetectEntitiesItemResult) obj;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        return hashCode;
    }

    @Override
    public BatchDetectEntitiesItemResult clone() {
        try {
            return (BatchDetectEntitiesItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.BatchDetectEntitiesItemResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
