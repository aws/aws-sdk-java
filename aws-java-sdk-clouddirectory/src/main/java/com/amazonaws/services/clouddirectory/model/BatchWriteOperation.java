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
 * Represents the output of a <code>BatchWrite</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/BatchWriteOperation" target="_top">AWS
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
     * Updates a given object's attributes.
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
     * A batch operation that adds a facet to an object.
     * </p>
     */
    private BatchAddFacetToObject addFacetToObject;
    /**
     * <p>
     * A batch operation that removes a facet from an object.
     * </p>
     */
    private BatchRemoveFacetFromObject removeFacetFromObject;
    /**
     * <p>
     * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     * </p>
     */
    private BatchAttachPolicy attachPolicy;
    /**
     * <p>
     * Detaches a policy from a <a>Directory</a>.
     * </p>
     */
    private BatchDetachPolicy detachPolicy;
    /**
     * <p>
     * Creates an index object. See <a
     * href="https://docs.aws.amazon.com/clouddirectory/latest/developerguide/indexing_search.htm">Indexing and
     * search</a> for more information.
     * </p>
     */
    private BatchCreateIndex createIndex;
    /**
     * <p>
     * Attaches the specified object to the specified index.
     * </p>
     */
    private BatchAttachToIndex attachToIndex;
    /**
     * <p>
     * Detaches the specified object from the specified index.
     * </p>
     */
    private BatchDetachFromIndex detachFromIndex;
    /**
     * <p>
     * Attaches a typed link to a specified source and target object. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     */
    private BatchAttachTypedLink attachTypedLink;
    /**
     * <p>
     * Detaches a typed link from a specified source and target object. For more information, see <a href=
     * "https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink"
     * >Typed Links</a>.
     * </p>
     */
    private BatchDetachTypedLink detachTypedLink;
    /**
     * <p>
     * Updates a given object's attributes.
     * </p>
     */
    private BatchUpdateLinkAttributes updateLinkAttributes;

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
     * Updates a given object's attributes.
     * </p>
     * 
     * @param updateObjectAttributes
     *        Updates a given object's attributes.
     */

    public void setUpdateObjectAttributes(BatchUpdateObjectAttributes updateObjectAttributes) {
        this.updateObjectAttributes = updateObjectAttributes;
    }

    /**
     * <p>
     * Updates a given object's attributes.
     * </p>
     * 
     * @return Updates a given object's attributes.
     */

    public BatchUpdateObjectAttributes getUpdateObjectAttributes() {
        return this.updateObjectAttributes;
    }

    /**
     * <p>
     * Updates a given object's attributes.
     * </p>
     * 
     * @param updateObjectAttributes
     *        Updates a given object's attributes.
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
     * A batch operation that adds a facet to an object.
     * </p>
     * 
     * @param addFacetToObject
     *        A batch operation that adds a facet to an object.
     */

    public void setAddFacetToObject(BatchAddFacetToObject addFacetToObject) {
        this.addFacetToObject = addFacetToObject;
    }

    /**
     * <p>
     * A batch operation that adds a facet to an object.
     * </p>
     * 
     * @return A batch operation that adds a facet to an object.
     */

    public BatchAddFacetToObject getAddFacetToObject() {
        return this.addFacetToObject;
    }

    /**
     * <p>
     * A batch operation that adds a facet to an object.
     * </p>
     * 
     * @param addFacetToObject
     *        A batch operation that adds a facet to an object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperation withAddFacetToObject(BatchAddFacetToObject addFacetToObject) {
        setAddFacetToObject(addFacetToObject);
        return this;
    }

    /**
     * <p>
     * A batch operation that removes a facet from an object.
     * </p>
     * 
     * @param removeFacetFromObject
     *        A batch operation that removes a facet from an object.
     */

    public void setRemoveFacetFromObject(BatchRemoveFacetFromObject removeFacetFromObject) {
        this.removeFacetFromObject = removeFacetFromObject;
    }

    /**
     * <p>
     * A batch operation that removes a facet from an object.
     * </p>
     * 
     * @return A batch operation that removes a facet from an object.
     */

    public BatchRemoveFacetFromObject getRemoveFacetFromObject() {
        return this.removeFacetFromObject;
    }

    /**
     * <p>
     * A batch operation that removes a facet from an object.
     * </p>
     * 
     * @param removeFacetFromObject
     *        A batch operation that removes a facet from an object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperation withRemoveFacetFromObject(BatchRemoveFacetFromObject removeFacetFromObject) {
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

    public void setAttachPolicy(BatchAttachPolicy attachPolicy) {
        this.attachPolicy = attachPolicy;
    }

    /**
     * <p>
     * Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     * </p>
     * 
     * @return Attaches a policy object to a regular object. An object can have a limited number of attached policies.
     */

    public BatchAttachPolicy getAttachPolicy() {
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

    public BatchWriteOperation withAttachPolicy(BatchAttachPolicy attachPolicy) {
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

    public void setDetachPolicy(BatchDetachPolicy detachPolicy) {
        this.detachPolicy = detachPolicy;
    }

    /**
     * <p>
     * Detaches a policy from a <a>Directory</a>.
     * </p>
     * 
     * @return Detaches a policy from a <a>Directory</a>.
     */

    public BatchDetachPolicy getDetachPolicy() {
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

    public BatchWriteOperation withDetachPolicy(BatchDetachPolicy detachPolicy) {
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

    public void setCreateIndex(BatchCreateIndex createIndex) {
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

    public BatchCreateIndex getCreateIndex() {
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

    public BatchWriteOperation withCreateIndex(BatchCreateIndex createIndex) {
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

    public void setAttachToIndex(BatchAttachToIndex attachToIndex) {
        this.attachToIndex = attachToIndex;
    }

    /**
     * <p>
     * Attaches the specified object to the specified index.
     * </p>
     * 
     * @return Attaches the specified object to the specified index.
     */

    public BatchAttachToIndex getAttachToIndex() {
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

    public BatchWriteOperation withAttachToIndex(BatchAttachToIndex attachToIndex) {
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

    public void setDetachFromIndex(BatchDetachFromIndex detachFromIndex) {
        this.detachFromIndex = detachFromIndex;
    }

    /**
     * <p>
     * Detaches the specified object from the specified index.
     * </p>
     * 
     * @return Detaches the specified object from the specified index.
     */

    public BatchDetachFromIndex getDetachFromIndex() {
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

    public BatchWriteOperation withDetachFromIndex(BatchDetachFromIndex detachFromIndex) {
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

    public void setAttachTypedLink(BatchAttachTypedLink attachTypedLink) {
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

    public BatchAttachTypedLink getAttachTypedLink() {
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

    public BatchWriteOperation withAttachTypedLink(BatchAttachTypedLink attachTypedLink) {
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

    public void setDetachTypedLink(BatchDetachTypedLink detachTypedLink) {
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

    public BatchDetachTypedLink getDetachTypedLink() {
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

    public BatchWriteOperation withDetachTypedLink(BatchDetachTypedLink detachTypedLink) {
        setDetachTypedLink(detachTypedLink);
        return this;
    }

    /**
     * <p>
     * Updates a given object's attributes.
     * </p>
     * 
     * @param updateLinkAttributes
     *        Updates a given object's attributes.
     */

    public void setUpdateLinkAttributes(BatchUpdateLinkAttributes updateLinkAttributes) {
        this.updateLinkAttributes = updateLinkAttributes;
    }

    /**
     * <p>
     * Updates a given object's attributes.
     * </p>
     * 
     * @return Updates a given object's attributes.
     */

    public BatchUpdateLinkAttributes getUpdateLinkAttributes() {
        return this.updateLinkAttributes;
    }

    /**
     * <p>
     * Updates a given object's attributes.
     * </p>
     * 
     * @param updateLinkAttributes
     *        Updates a given object's attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteOperation withUpdateLinkAttributes(BatchUpdateLinkAttributes updateLinkAttributes) {
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
