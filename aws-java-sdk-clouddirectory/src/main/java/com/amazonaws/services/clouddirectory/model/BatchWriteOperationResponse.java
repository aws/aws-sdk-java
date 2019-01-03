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
 * Represents the output of a <code>BatchWrite</code> response operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchWriteOperationResponse"
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
     * The result of an add facet to object batch operation.
     * </p>
     */
    private BatchAddFacetToObjectResponse addFacetToObject;
    /**
     * <p>
     * The result of a batch remove facet from object operation.
     * </p>
     */
    private BatchRemoveFacetFromObjectResponse removeFacetFromObject;
    /**
     * <p>
     * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     * </p>
     */
    private BatchAttachPolicyResponse attachPolicy;
    /**
     * <p>
     * Detaches a policy from a <a>Directory</a>.
     * </p>
     */
    private BatchDetachPolicyResponse detachPolicy;
    /**
     * <p>
     * Creates an index object. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/indexing_search.htm">Indexing and
     * search</a> for more information.
     * </p>
     */
    private BatchCreateIndexResponse createIndex;
    /**
     * <p>
     * Attaches the specified object to the specified index.
     * </p>
     */
    private BatchAttachToIndexResponse attachToIndex;
    /**
     * <p>
     * Detaches the specified object from the specified index.
     * </p>
     */
    private BatchDetachFromIndexResponse detachFromIndex;
    /**
     * <p>
     * Attaches a typed link to a specified source and target object. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     */
    private BatchAttachTypedLinkResponse attachTypedLink;
    /**
     * <p>
     * Detaches a typed link from a specified source and target object. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     */
    private BatchDetachTypedLinkResponse detachTypedLink;
    /**
     * <p>
     * Represents the output of a <code>BatchWrite</code> response operation.
     * </p>
     */
    private BatchUpdateLinkAttributesResponse updateLinkAttributes;

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
     * The result of an add facet to object batch operation.
     * </p>
     * 
     * @param addFacetToObject
     *        The result of an add facet to object batch operation.
     */

    public void setAddFacetToObject(BatchAddFacetToObjectResponse addFacetToObject) {
        this.addFacetToObject = addFacetToObject;
    }

    /**
     * <p>
     * The result of an add facet to object batch operation.
     * </p>
     * 
     * @return The result of an add facet to object batch operation.
     */

    public BatchAddFacetToObjectResponse getAddFacetToObject() {
        return this.addFacetToObject;
    }

    /**
     * <p>
     * The result of an add facet to object batch operation.
     * </p>
     * 
     * @param addFacetToObject
     *        The result of an add facet to object batch operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperationResponse withAddFacetToObject(BatchAddFacetToObjectResponse addFacetToObject) {
        setAddFacetToObject(addFacetToObject);
        return this;
    }

    /**
     * <p>
     * The result of a batch remove facet from object operation.
     * </p>
     * 
     * @param removeFacetFromObject
     *        The result of a batch remove facet from object operation.
     */

    public void setRemoveFacetFromObject(BatchRemoveFacetFromObjectResponse removeFacetFromObject) {
        this.removeFacetFromObject = removeFacetFromObject;
    }

    /**
     * <p>
     * The result of a batch remove facet from object operation.
     * </p>
     * 
     * @return The result of a batch remove facet from object operation.
     */

    public BatchRemoveFacetFromObjectResponse getRemoveFacetFromObject() {
        return this.removeFacetFromObject;
    }

    /**
     * <p>
     * The result of a batch remove facet from object operation.
     * </p>
     * 
     * @param removeFacetFromObject
     *        The result of a batch remove facet from object operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperationResponse withRemoveFacetFromObject(BatchRemoveFacetFromObjectResponse removeFacetFromObject) {
        setRemoveFacetFromObject(removeFacetFromObject);
        return this;
    }

    /**
     * <p>
     * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     * </p>
     * 
     * @param attachPolicy
     *        Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     */

    public void setAttachPolicy(BatchAttachPolicyResponse attachPolicy) {
        this.attachPolicy = attachPolicy;
    }

    /**
     * <p>
     * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     * </p>
     * 
     * @return Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     */

    public BatchAttachPolicyResponse getAttachPolicy() {
        return this.attachPolicy;
    }

    /**
     * <p>
     * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     * </p>
     * 
     * @param attachPolicy
     *        Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperationResponse withAttachPolicy(BatchAttachPolicyResponse attachPolicy) {
        setAttachPolicy(attachPolicy);
        return this;
    }

    /**
     * <p>
     * Detaches a policy from a <a>Directory</a>.
     * </p>
     * 
     * @param detachPolicy
     *        Detaches a policy from a <a>Directory</a>.
     */

    public void setDetachPolicy(BatchDetachPolicyResponse detachPolicy) {
        this.detachPolicy = detachPolicy;
    }

    /**
     * <p>
     * Detaches a policy from a <a>Directory</a>.
     * </p>
     * 
     * @return Detaches a policy from a <a>Directory</a>.
     */

    public BatchDetachPolicyResponse getDetachPolicy() {
        return this.detachPolicy;
    }

    /**
     * <p>
     * Detaches a policy from a <a>Directory</a>.
     * </p>
     * 
     * @param detachPolicy
     *        Detaches a policy from a <a>Directory</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperationResponse withDetachPolicy(BatchDetachPolicyResponse detachPolicy) {
        setDetachPolicy(detachPolicy);
        return this;
    }

    /**
     * <p>
     * Creates an index object. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/indexing_search.htm">Indexing and
     * search</a> for more information.
     * </p>
     * 
     * @param createIndex
     *        Creates an index object. See <a
     *        href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/indexing_search.htm">Indexing and
     *        search</a> for more information.
     */

    public void setCreateIndex(BatchCreateIndexResponse createIndex) {
        this.createIndex = createIndex;
    }

    /**
     * <p>
     * Creates an index object. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/indexing_search.htm">Indexing and
     * search</a> for more information.
     * </p>
     * 
     * @return Creates an index object. See <a
     *         href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/indexing_search.htm">Indexing and
     *         search</a> for more information.
     */

    public BatchCreateIndexResponse getCreateIndex() {
        return this.createIndex;
    }

    /**
     * <p>
     * Creates an index object. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/indexing_search.htm">Indexing and
     * search</a> for more information.
     * </p>
     * 
     * @param createIndex
     *        Creates an index object. See <a
     *        href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/indexing_search.htm">Indexing and
     *        search</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperationResponse withCreateIndex(BatchCreateIndexResponse createIndex) {
        setCreateIndex(createIndex);
        return this;
    }

    /**
     * <p>
     * Attaches the specified object to the specified index.
     * </p>
     * 
     * @param attachToIndex
     *        Attaches the specified object to the specified index.
     */

    public void setAttachToIndex(BatchAttachToIndexResponse attachToIndex) {
        this.attachToIndex = attachToIndex;
    }

    /**
     * <p>
     * Attaches the specified object to the specified index.
     * </p>
     * 
     * @return Attaches the specified object to the specified index.
     */

    public BatchAttachToIndexResponse getAttachToIndex() {
        return this.attachToIndex;
    }

    /**
     * <p>
     * Attaches the specified object to the specified index.
     * </p>
     * 
     * @param attachToIndex
     *        Attaches the specified object to the specified index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperationResponse withAttachToIndex(BatchAttachToIndexResponse attachToIndex) {
        setAttachToIndex(attachToIndex);
        return this;
    }

    /**
     * <p>
     * Detaches the specified object from the specified index.
     * </p>
     * 
     * @param detachFromIndex
     *        Detaches the specified object from the specified index.
     */

    public void setDetachFromIndex(BatchDetachFromIndexResponse detachFromIndex) {
        this.detachFromIndex = detachFromIndex;
    }

    /**
     * <p>
     * Detaches the specified object from the specified index.
     * </p>
     * 
     * @return Detaches the specified object from the specified index.
     */

    public BatchDetachFromIndexResponse getDetachFromIndex() {
        return this.detachFromIndex;
    }

    /**
     * <p>
     * Detaches the specified object from the specified index.
     * </p>
     * 
     * @param detachFromIndex
     *        Detaches the specified object from the specified index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperationResponse withDetachFromIndex(BatchDetachFromIndexResponse detachFromIndex) {
        setDetachFromIndex(detachFromIndex);
        return this;
    }

    /**
     * <p>
     * Attaches a typed link to a specified source and target object. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param attachTypedLink
     *        Attaches a typed link to a specified source and target object. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
     */

    public void setAttachTypedLink(BatchAttachTypedLinkResponse attachTypedLink) {
        this.attachTypedLink = attachTypedLink;
    }

    /**
     * <p>
     * Attaches a typed link to a specified source and target object. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @return Attaches a typed link to a specified source and target object. For more information, see <a href=
     *         "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *         >Typed Links</a>.
     */

    public BatchAttachTypedLinkResponse getAttachTypedLink() {
        return this.attachTypedLink;
    }

    /**
     * <p>
     * Attaches a typed link to a specified source and target object. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param attachTypedLink
     *        Attaches a typed link to a specified source and target object. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperationResponse withAttachTypedLink(BatchAttachTypedLinkResponse attachTypedLink) {
        setAttachTypedLink(attachTypedLink);
        return this;
    }

    /**
     * <p>
     * Detaches a typed link from a specified source and target object. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param detachTypedLink
     *        Detaches a typed link from a specified source and target object. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
     */

    public void setDetachTypedLink(BatchDetachTypedLinkResponse detachTypedLink) {
        this.detachTypedLink = detachTypedLink;
    }

    /**
     * <p>
     * Detaches a typed link from a specified source and target object. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @return Detaches a typed link from a specified source and target object. For more information, see <a href=
     *         "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *         >Typed Links</a>.
     */

    public BatchDetachTypedLinkResponse getDetachTypedLink() {
        return this.detachTypedLink;
    }

    /**
     * <p>
     * Detaches a typed link from a specified source and target object. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     * 
     * @param detachTypedLink
     *        Detaches a typed link from a specified source and target object. For more information, see <a href=
     *        "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     *        >Typed Links</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperationResponse withDetachTypedLink(BatchDetachTypedLinkResponse detachTypedLink) {
        setDetachTypedLink(detachTypedLink);
        return this;
    }

    /**
     * <p>
     * Represents the output of a <code>BatchWrite</code> response operation.
     * </p>
     * 
     * @param updateLinkAttributes
     *        Represents the output of a <code>BatchWrite</code> response operation.
     */

    public void setUpdateLinkAttributes(BatchUpdateLinkAttributesResponse updateLinkAttributes) {
        this.updateLinkAttributes = updateLinkAttributes;
    }

    /**
     * <p>
     * Represents the output of a <code>BatchWrite</code> response operation.
     * </p>
     * 
     * @return Represents the output of a <code>BatchWrite</code> response operation.
     */

    public BatchUpdateLinkAttributesResponse getUpdateLinkAttributes() {
        return this.updateLinkAttributes;
    }

    /**
     * <p>
     * Represents the output of a <code>BatchWrite</code> response operation.
     * </p>
     * 
     * @param updateLinkAttributes
     *        Represents the output of a <code>BatchWrite</code> response operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperationResponse withUpdateLinkAttributes(BatchUpdateLinkAttributesResponse updateLinkAttributes) {
        setUpdateLinkAttributes(updateLinkAttributes);
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
            sb.append("RemoveFacetFromObject: ").append(getRemoveFacetFromObject()).append(",");
        if (getAttachPolicy() != null)
            sb.append("AttachPolicy: ").append(getAttachPolicy()).append(",");
        if (getDetachPolicy() != null)
            sb.append("DetachPolicy: ").append(getDetachPolicy()).append(",");
        if (getCreateIndex() != null)
            sb.append("CreateIndex: ").append(getCreateIndex()).append(",");
        if (getAttachToIndex() != null)
            sb.append("AttachToIndex: ").append(getAttachToIndex()).append(",");
        if (getDetachFromIndex() != null)
            sb.append("DetachFromIndex: ").append(getDetachFromIndex()).append(",");
        if (getAttachTypedLink() != null)
            sb.append("AttachTypedLink: ").append(getAttachTypedLink()).append(",");
        if (getDetachTypedLink() != null)
            sb.append("DetachTypedLink: ").append(getDetachTypedLink()).append(",");
        if (getUpdateLinkAttributes() != null)
            sb.append("UpdateLinkAttributes: ").append(getUpdateLinkAttributes());
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
        if (other.getAttachPolicy() == null ^ this.getAttachPolicy() == null)
            return false;
        if (other.getAttachPolicy() != null && other.getAttachPolicy().equals(this.getAttachPolicy()) == false)
            return false;
        if (other.getDetachPolicy() == null ^ this.getDetachPolicy() == null)
            return false;
        if (other.getDetachPolicy() != null && other.getDetachPolicy().equals(this.getDetachPolicy()) == false)
            return false;
        if (other.getCreateIndex() == null ^ this.getCreateIndex() == null)
            return false;
        if (other.getCreateIndex() != null && other.getCreateIndex().equals(this.getCreateIndex()) == false)
            return false;
        if (other.getAttachToIndex() == null ^ this.getAttachToIndex() == null)
            return false;
        if (other.getAttachToIndex() != null && other.getAttachToIndex().equals(this.getAttachToIndex()) == false)
            return false;
        if (other.getDetachFromIndex() == null ^ this.getDetachFromIndex() == null)
            return false;
        if (other.getDetachFromIndex() != null && other.getDetachFromIndex().equals(this.getDetachFromIndex()) == false)
            return false;
        if (other.getAttachTypedLink() == null ^ this.getAttachTypedLink() == null)
            return false;
        if (other.getAttachTypedLink() != null && other.getAttachTypedLink().equals(this.getAttachTypedLink()) == false)
            return false;
        if (other.getDetachTypedLink() == null ^ this.getDetachTypedLink() == null)
            return false;
        if (other.getDetachTypedLink() != null && other.getDetachTypedLink().equals(this.getDetachTypedLink()) == false)
            return false;
        if (other.getUpdateLinkAttributes() == null ^ this.getUpdateLinkAttributes() == null)
            return false;
        if (other.getUpdateLinkAttributes() != null && other.getUpdateLinkAttributes().equals(this.getUpdateLinkAttributes()) == false)
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
        hashCode = prime * hashCode + ((getAttachPolicy() == null) ? 0 : getAttachPolicy().hashCode());
        hashCode = prime * hashCode + ((getDetachPolicy() == null) ? 0 : getDetachPolicy().hashCode());
        hashCode = prime * hashCode + ((getCreateIndex() == null) ? 0 : getCreateIndex().hashCode());
        hashCode = prime * hashCode + ((getAttachToIndex() == null) ? 0 : getAttachToIndex().hashCode());
        hashCode = prime * hashCode + ((getDetachFromIndex() == null) ? 0 : getDetachFromIndex().hashCode());
        hashCode = prime * hashCode + ((getAttachTypedLink() == null) ? 0 : getAttachTypedLink().hashCode());
        hashCode = prime * hashCode + ((getDetachTypedLink() == null) ? 0 : getDetachTypedLink().hashCode());
        hashCode = prime * hashCode + ((getUpdateLinkAttributes() == null) ? 0 : getUpdateLinkAttributes().hashCode());
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
