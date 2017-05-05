/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the output of a <code>BatchWrite</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/BatchWriteOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchWriteOperation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Creates an object.
     * </p>
     */
    private BatchCreateObject createObject;
    /**
     * <p>
     * Attaches an object to a <a>Directory</a>.
     * </p>
     */
    private BatchAttachObject attachObject;
    /**
     * <p>
     * Detaches an object from a <a>Directory</a>.
     * </p>
     */
    private BatchDetachObject detachObject;
    /**
     * <p>
     * Update a given object's attributes.
     * </p>
     */
    private BatchUpdateObjectAttributes updateObjectAttributes;
    /**
     * <p>
     * Deletes an object in a <a>Directory</a>.
     * </p>
     */
    private BatchDeleteObject deleteObject;
    /**
     * <p>
     * Batch operation adding a facet to an object.
     * </p>
     */
    private BatchAddFacetToObject addFacetToObject;
    /**
     * <p>
     * Batch operation removing a facet from an object.
     * </p>
     */
    private BatchRemoveFacetFromObject removeFacetFromObject;

    /**
     * <p>
     * Creates an object.
     * </p>
     * 
     * @param createObject
     *        Creates an object.
     */

    public void setCreateObject(BatchCreateObject createObject) {
        this.createObject = createObject;
    }

    /**
     * <p>
     * Creates an object.
     * </p>
     * 
     * @return Creates an object.
     */

    public BatchCreateObject getCreateObject() {
        return this.createObject;
    }

    /**
     * <p>
     * Creates an object.
     * </p>
     * 
     * @param createObject
     *        Creates an object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperation withCreateObject(BatchCreateObject createObject) {
        setCreateObject(createObject);
        return this;
    }

    /**
     * <p>
     * Attaches an object to a <a>Directory</a>.
     * </p>
     * 
     * @param attachObject
     *        Attaches an object to a <a>Directory</a>.
     */

    public void setAttachObject(BatchAttachObject attachObject) {
        this.attachObject = attachObject;
    }

    /**
     * <p>
     * Attaches an object to a <a>Directory</a>.
     * </p>
     * 
     * @return Attaches an object to a <a>Directory</a>.
     */

    public BatchAttachObject getAttachObject() {
        return this.attachObject;
    }

    /**
     * <p>
     * Attaches an object to a <a>Directory</a>.
     * </p>
     * 
     * @param attachObject
     *        Attaches an object to a <a>Directory</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperation withAttachObject(BatchAttachObject attachObject) {
        setAttachObject(attachObject);
        return this;
    }

    /**
     * <p>
     * Detaches an object from a <a>Directory</a>.
     * </p>
     * 
     * @param detachObject
     *        Detaches an object from a <a>Directory</a>.
     */

    public void setDetachObject(BatchDetachObject detachObject) {
        this.detachObject = detachObject;
    }

    /**
     * <p>
     * Detaches an object from a <a>Directory</a>.
     * </p>
     * 
     * @return Detaches an object from a <a>Directory</a>.
     */

    public BatchDetachObject getDetachObject() {
        return this.detachObject;
    }

    /**
     * <p>
     * Detaches an object from a <a>Directory</a>.
     * </p>
     * 
     * @param detachObject
     *        Detaches an object from a <a>Directory</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperation withDetachObject(BatchDetachObject detachObject) {
        setDetachObject(detachObject);
        return this;
    }

    /**
     * <p>
     * Update a given object's attributes.
     * </p>
     * 
     * @param updateObjectAttributes
     *        Update a given object's attributes.
     */

    public void setUpdateObjectAttributes(BatchUpdateObjectAttributes updateObjectAttributes) {
        this.updateObjectAttributes = updateObjectAttributes;
    }

    /**
     * <p>
     * Update a given object's attributes.
     * </p>
     * 
     * @return Update a given object's attributes.
     */

    public BatchUpdateObjectAttributes getUpdateObjectAttributes() {
        return this.updateObjectAttributes;
    }

    /**
     * <p>
     * Update a given object's attributes.
     * </p>
     * 
     * @param updateObjectAttributes
     *        Update a given object's attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperation withUpdateObjectAttributes(BatchUpdateObjectAttributes updateObjectAttributes) {
        setUpdateObjectAttributes(updateObjectAttributes);
        return this;
    }

    /**
     * <p>
     * Deletes an object in a <a>Directory</a>.
     * </p>
     * 
     * @param deleteObject
     *        Deletes an object in a <a>Directory</a>.
     */

    public void setDeleteObject(BatchDeleteObject deleteObject) {
        this.deleteObject = deleteObject;
    }

    /**
     * <p>
     * Deletes an object in a <a>Directory</a>.
     * </p>
     * 
     * @return Deletes an object in a <a>Directory</a>.
     */

    public BatchDeleteObject getDeleteObject() {
        return this.deleteObject;
    }

    /**
     * <p>
     * Deletes an object in a <a>Directory</a>.
     * </p>
     * 
     * @param deleteObject
     *        Deletes an object in a <a>Directory</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperation withDeleteObject(BatchDeleteObject deleteObject) {
        setDeleteObject(deleteObject);
        return this;
    }

    /**
     * <p>
     * Batch operation adding a facet to an object.
     * </p>
     * 
     * @param addFacetToObject
     *        Batch operation adding a facet to an object.
     */

    public void setAddFacetToObject(BatchAddFacetToObject addFacetToObject) {
        this.addFacetToObject = addFacetToObject;
    }

    /**
     * <p>
     * Batch operation adding a facet to an object.
     * </p>
     * 
     * @return Batch operation adding a facet to an object.
     */

    public BatchAddFacetToObject getAddFacetToObject() {
        return this.addFacetToObject;
    }

    /**
     * <p>
     * Batch operation adding a facet to an object.
     * </p>
     * 
     * @param addFacetToObject
     *        Batch operation adding a facet to an object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperation withAddFacetToObject(BatchAddFacetToObject addFacetToObject) {
        setAddFacetToObject(addFacetToObject);
        return this;
    }

    /**
     * <p>
     * Batch operation removing a facet from an object.
     * </p>
     * 
     * @param removeFacetFromObject
     *        Batch operation removing a facet from an object.
     */

    public void setRemoveFacetFromObject(BatchRemoveFacetFromObject removeFacetFromObject) {
        this.removeFacetFromObject = removeFacetFromObject;
    }

    /**
     * <p>
     * Batch operation removing a facet from an object.
     * </p>
     * 
     * @return Batch operation removing a facet from an object.
     */

    public BatchRemoveFacetFromObject getRemoveFacetFromObject() {
        return this.removeFacetFromObject;
    }

    /**
     * <p>
     * Batch operation removing a facet from an object.
     * </p>
     * 
     * @param removeFacetFromObject
     *        Batch operation removing a facet from an object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperation withRemoveFacetFromObject(BatchRemoveFacetFromObject removeFacetFromObject) {
        setRemoveFacetFromObject(removeFacetFromObject);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCreateObject() != null)
            sb.append("CreateObject: ").append(getCreateObject()).append(",");
        if (getAttachObject() != null)
            sb.append("AttachObject: ").append(getAttachObject()).append(",");
        if (getDetachObject() != null)
            sb.append("DetachObject: ").append(getDetachObject()).append(",");
        if (getUpdateObjectAttributes() != null)
            sb.append("UpdateObjectAttributes: ").append(getUpdateObjectAttributes()).append(",");
        if (getDeleteObject() != null)
            sb.append("DeleteObject: ").append(getDeleteObject()).append(",");
        if (getAddFacetToObject() != null)
            sb.append("AddFacetToObject: ").append(getAddFacetToObject()).append(",");
        if (getRemoveFacetFromObject() != null)
            sb.append("RemoveFacetFromObject: ").append(getRemoveFacetFromObject());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchWriteOperation == false)
            return false;
        BatchWriteOperation other = (BatchWriteOperation) obj;
        if (other.getCreateObject() == null ^ this.getCreateObject() == null)
            return false;
        if (other.getCreateObject() != null && other.getCreateObject().equals(this.getCreateObject()) == false)
            return false;
        if (other.getAttachObject() == null ^ this.getAttachObject() == null)
            return false;
        if (other.getAttachObject() != null && other.getAttachObject().equals(this.getAttachObject()) == false)
            return false;
        if (other.getDetachObject() == null ^ this.getDetachObject() == null)
            return false;
        if (other.getDetachObject() != null && other.getDetachObject().equals(this.getDetachObject()) == false)
            return false;
        if (other.getUpdateObjectAttributes() == null ^ this.getUpdateObjectAttributes() == null)
            return false;
        if (other.getUpdateObjectAttributes() != null && other.getUpdateObjectAttributes().equals(this.getUpdateObjectAttributes()) == false)
            return false;
        if (other.getDeleteObject() == null ^ this.getDeleteObject() == null)
            return false;
        if (other.getDeleteObject() != null && other.getDeleteObject().equals(this.getDeleteObject()) == false)
            return false;
        if (other.getAddFacetToObject() == null ^ this.getAddFacetToObject() == null)
            return false;
        if (other.getAddFacetToObject() != null && other.getAddFacetToObject().equals(this.getAddFacetToObject()) == false)
            return false;
        if (other.getRemoveFacetFromObject() == null ^ this.getRemoveFacetFromObject() == null)
            return false;
        if (other.getRemoveFacetFromObject() != null && other.getRemoveFacetFromObject().equals(this.getRemoveFacetFromObject()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateObject() == null) ? 0 : getCreateObject().hashCode());
        hashCode = prime * hashCode + ((getAttachObject() == null) ? 0 : getAttachObject().hashCode());
        hashCode = prime * hashCode + ((getDetachObject() == null) ? 0 : getDetachObject().hashCode());
        hashCode = prime * hashCode + ((getUpdateObjectAttributes() == null) ? 0 : getUpdateObjectAttributes().hashCode());
        hashCode = prime * hashCode + ((getDeleteObject() == null) ? 0 : getDeleteObject().hashCode());
        hashCode = prime * hashCode + ((getAddFacetToObject() == null) ? 0 : getAddFacetToObject().hashCode());
        hashCode = prime * hashCode + ((getRemoveFacetFromObject() == null) ? 0 : getRemoveFacetFromObject().hashCode());
        return hashCode;
    }

    @Override
    public BatchWriteOperation clone() {
        try {
            return (BatchWriteOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchWriteOperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
