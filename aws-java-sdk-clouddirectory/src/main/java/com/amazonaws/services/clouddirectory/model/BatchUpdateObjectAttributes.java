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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the output of a <code>BatchUpdate</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchUpdateObjectAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateObjectAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reference that identifies the object.
     * </p>
     */
    private ObjectReference objectReference;
    /**
     * <p>
     * Attributes update structure.
     * </p>
     */
    private java.util.List<ObjectAttributeUpdate> attributeUpdates;

    /**
     * <p>
     * Reference that identifies the object.
     * </p>
     * 
     * @param objectReference
     *        Reference that identifies the object.
     */

    public void setObjectReference(ObjectReference objectReference) {
        this.objectReference = objectReference;
    }

    /**
     * <p>
     * Reference that identifies the object.
     * </p>
     * 
     * @return Reference that identifies the object.
     */

    public ObjectReference getObjectReference() {
        return this.objectReference;
    }

    /**
     * <p>
     * Reference that identifies the object.
     * </p>
     * 
     * @param objectReference
     *        Reference that identifies the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateObjectAttributes withObjectReference(ObjectReference objectReference) {
        setObjectReference(objectReference);
        return this;
    }

    /**
     * <p>
     * Attributes update structure.
     * </p>
     * 
     * @return Attributes update structure.
     */

    public java.util.List<ObjectAttributeUpdate> getAttributeUpdates() {
        return attributeUpdates;
    }

    /**
     * <p>
     * Attributes update structure.
     * </p>
     * 
     * @param attributeUpdates
     *        Attributes update structure.
     */

    public void setAttributeUpdates(java.util.Collection<ObjectAttributeUpdate> attributeUpdates) {
        if (attributeUpdates == null) {
            this.attributeUpdates = null;
            return;
        }

        this.attributeUpdates = new java.util.ArrayList<ObjectAttributeUpdate>(attributeUpdates);
    }

    /**
     * <p>
     * Attributes update structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeUpdates(java.util.Collection)} or {@link #withAttributeUpdates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributeUpdates
     *        Attributes update structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateObjectAttributes withAttributeUpdates(ObjectAttributeUpdate... attributeUpdates) {
        if (this.attributeUpdates == null) {
            setAttributeUpdates(new java.util.ArrayList<ObjectAttributeUpdate>(attributeUpdates.length));
        }
        for (ObjectAttributeUpdate ele : attributeUpdates) {
            this.attributeUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Attributes update structure.
     * </p>
     * 
     * @param attributeUpdates
     *        Attributes update structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateObjectAttributes withAttributeUpdates(java.util.Collection<ObjectAttributeUpdate> attributeUpdates) {
        setAttributeUpdates(attributeUpdates);
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
        if (getObjectReference() != null)
            sb.append("ObjectReference: ").append(getObjectReference()).append(",");
        if (getAttributeUpdates() != null)
            sb.append("AttributeUpdates: ").append(getAttributeUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateObjectAttributes == false)
            return false;
        BatchUpdateObjectAttributes other = (BatchUpdateObjectAttributes) obj;
        if (other.getObjectReference() == null ^ this.getObjectReference() == null)
            return false;
        if (other.getObjectReference() != null && other.getObjectReference().equals(this.getObjectReference()) == false)
            return false;
        if (other.getAttributeUpdates() == null ^ this.getAttributeUpdates() == null)
            return false;
        if (other.getAttributeUpdates() != null && other.getAttributeUpdates().equals(this.getAttributeUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectReference() == null) ? 0 : getObjectReference().hashCode());
        hashCode = prime * hashCode + ((getAttributeUpdates() == null) ? 0 : getAttributeUpdates().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateObjectAttributes clone() {
        try {
            return (BatchUpdateObjectAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchUpdateObjectAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
