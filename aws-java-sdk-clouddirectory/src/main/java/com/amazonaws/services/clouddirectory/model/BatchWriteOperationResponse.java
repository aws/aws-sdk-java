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
 * Represents the output of a <code>BatchWrite</code> response operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/BatchWriteOperationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchWriteOperationResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Creates an object in a <a>Directory</a>.
     * </p>
     */
    private BatchCreateObjectResponse createObject;
    /**
     * <p>
     * Attaches an object to a <a>Directory</a>.
     * </p>
     */
    private BatchAttachObjectResponse attachObject;
    /**
     * <p>
     * Detaches an object from a <a>Directory</a>.
     * </p>
     */
    private BatchDetachObjectResponse detachObject;
    /**
     * <p>
     * Updates a given object’s attributes.
     * </p>
     */
    private BatchUpdateObjectAttributesResponse updateObjectAttributes;
    /**
     * <p>
     * Deletes an object in a <a>Directory</a>.
     * </p>
     */
    private BatchDeleteObjectResponse deleteObject;
    /**
     * <p>
     * Result of an add facet to object batch operation.
     * </p>
     */
    private BatchAddFacetToObjectResponse addFacetToObject;
    /**
     * <p>
     * Result of a batch remove facet from object operation.
     * </p>
     */
    private BatchRemoveFacetFromObjectResponse removeFacetFromObject;

    /**
     * <p>
     * Creates an object in a <a>Directory</a>.
     * </p>
     * 
     * @param createObject
     *        Creates an object in a <a>Directory</a>.
     */

    public void setCreateObject(BatchCreateObjectResponse createObject) {
        this.createObject = createObject;
    }

    /**
     * <p>
     * Creates an object in a <a>Directory</a>.
     * </p>
     * 
     * @return Creates an object in a <a>Directory</a>.
     */

    public BatchCreateObjectResponse getCreateObject() {
        return this.createObject;
    }

    /**
     * <p>
     * Creates an object in a <a>Directory</a>.
     * </p>
     * 
     * @param createObject
     *        Creates an object in a <a>Directory</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperationResponse withCreateObject(BatchCreateObjectResponse createObject) {
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

    public void setAttachObject(BatchAttachObjectResponse attachObject) {
        this.attachObject = attachObject;
    }

    /**
     * <p>
     * Attaches an object to a <a>Directory</a>.
     * </p>
     * 
     * @return Attaches an object to a <a>Directory</a>.
     */

    public BatchAttachObjectResponse getAttachObject() {
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

    public BatchWriteOperationResponse withAttachObject(BatchAttachObjectResponse attachObject) {
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

    public void setDetachObject(BatchDetachObjectResponse detachObject) {
        this.detachObject = detachObject;
    }

    /**
     * <p>
     * Detaches an object from a <a>Directory</a>.
     * </p>
     * 
     * @return Detaches an object from a <a>Directory</a>.
     */

    public BatchDetachObjectResponse getDetachObject() {
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

    public BatchWriteOperationResponse withDetachObject(BatchDetachObjectResponse detachObject) {
        setDetachObject(detachObject);
        return this;
    }

    /**
     * <p>
     * Updates a given object’s attributes.
     * </p>
     * 
     * @param updateObjectAttributes
     *        Updates a given object’s attributes.
     */

    public void setUpdateObjectAttributes(BatchUpdateObjectAttributesResponse updateObjectAttributes) {
        this.updateObjectAttributes = updateObjectAttributes;
    }

    /**
     * <p>
     * Updates a given object’s attributes.
     * </p>
     * 
     * @return Updates a given object’s attributes.
     */

    public BatchUpdateObjectAttributesResponse getUpdateObjectAttributes() {
        return this.updateObjectAttributes;
    }

    /**
     * <p>
     * Updates a given object’s attributes.
     * </p>
     * 
     * @param updateObjectAttributes
     *        Updates a given object’s attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperationResponse withUpdateObjectAttributes(BatchUpdateObjectAttributesResponse updateObjectAttributes) {
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

    public void setDeleteObject(BatchDeleteObjectResponse deleteObject) {
        this.deleteObject = deleteObject;
    }

    /**
     * <p>
     * Deletes an object in a <a>Directory</a>.
     * </p>
     * 
     * @return Deletes an object in a <a>Directory</a>.
     */

    public BatchDeleteObjectResponse getDeleteObject() {
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

    public BatchWriteOperationResponse withDeleteObject(BatchDeleteObjectResponse deleteObject) {
        setDeleteObject(deleteObject);
        return this;
    }

    /**
     * <p>
     * Result of an add facet to object batch operation.
     * </p>
     * 
     * @param addFacetToObject
     *        Result of an add facet to object batch operation.
     */

    public void setAddFacetToObject(BatchAddFacetToObjectResponse addFacetToObject) {
        this.addFacetToObject = addFacetToObject;
    }

    /**
     * <p>
     * Result of an add facet to object batch operation.
     * </p>
     * 
     * @return Result of an add facet to object batch operation.
     */

    public BatchAddFacetToObjectResponse getAddFacetToObject() {
        return this.addFacetToObject;
    }

    /**
     * <p>
     * Result of an add facet to object batch operation.
     * </p>
     * 
     * @param addFacetToObject
     *        Result of an add facet to object batch operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperationResponse withAddFacetToObject(BatchAddFacetToObjectResponse addFacetToObject) {
        setAddFacetToObject(addFacetToObject);
        return this;
    }

    /**
     * <p>
     * Result of a batch remove facet from object operation.
     * </p>
     * 
     * @param removeFacetFromObject
     *        Result of a batch remove facet from object operation.
     */

    public void setRemoveFacetFromObject(BatchRemoveFacetFromObjectResponse removeFacetFromObject) {
        this.removeFacetFromObject = removeFacetFromObject;
    }

    /**
     * <p>
     * Result of a batch remove facet from object operation.
     * </p>
     * 
     * @return Result of a batch remove facet from object operation.
     */

    public BatchRemoveFacetFromObjectResponse getRemoveFacetFromObject() {
        return this.removeFacetFromObject;
    }

    /**
     * <p>
     * Result of a batch remove facet from object operation.
     * </p>
     * 
     * @param removeFacetFromObject
     *        Result of a batch remove facet from object operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperationResponse withRemoveFacetFromObject(BatchRemoveFacetFromObjectResponse removeFacetFromObject) {
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

        if (obj instanceof BatchWriteOperationResponse == false)
            return false;
        BatchWriteOperationResponse other = (BatchWriteOperationResponse) obj;
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
    public BatchWriteOperationResponse clone() {
        try {
            return (BatchWriteOperationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.clouddirectory.model.transform.BatchWriteOperationResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
