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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more tags to delete.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagKeys;
    /**
     * <p>
     * The ID of the tagged ML object. For example, <code>exampleModelId</code>.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of the tagged ML object.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * One or more tags to delete.
     * </p>
     * 
     * @return One or more tags to delete.
     */

    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
            tagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagKeys;
    }

    /**
     * <p>
     * One or more tags to delete.
     * </p>
     * 
     * @param tagKeys
     *        One or more tags to delete.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new com.amazonaws.internal.SdkInternalList<String>(tagKeys);
    }

    /**
     * <p>
     * One or more tags to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        One or more tags to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTagsRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new com.amazonaws.internal.SdkInternalList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more tags to delete.
     * </p>
     * 
     * @param tagKeys
     *        One or more tags to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTagsRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
        return this;
    }

    /**
     * <p>
     * The ID of the tagged ML object. For example, <code>exampleModelId</code>.
     * </p>
     * 
     * @param resourceId
     *        The ID of the tagged ML object. For example, <code>exampleModelId</code>.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the tagged ML object. For example, <code>exampleModelId</code>.
     * </p>
     * 
     * @return The ID of the tagged ML object. For example, <code>exampleModelId</code>.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the tagged ML object. For example, <code>exampleModelId</code>.
     * </p>
     * 
     * @param resourceId
     *        The ID of the tagged ML object. For example, <code>exampleModelId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTagsRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of the tagged ML object.
     * </p>
     * 
     * @param resourceType
     *        The type of the tagged ML object.
     * @see TaggableResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the tagged ML object.
     * </p>
     * 
     * @return The type of the tagged ML object.
     * @see TaggableResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the tagged ML object.
     * </p>
     * 
     * @param resourceType
     *        The type of the tagged ML object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaggableResourceType
     */

    public DeleteTagsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the tagged ML object.
     * </p>
     * 
     * @param resourceType
     *        The type of the tagged ML object.
     * @see TaggableResourceType
     */

    public void setResourceType(TaggableResourceType resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of the tagged ML object.
     * </p>
     * 
     * @param resourceType
     *        The type of the tagged ML object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaggableResourceType
     */

    public DeleteTagsRequest withResourceType(TaggableResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTagsRequest == false)
            return false;
        DeleteTagsRequest other = (DeleteTagsRequest) obj;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTagsRequest clone() {
        return (DeleteTagsRequest) super.clone();
    }

}
