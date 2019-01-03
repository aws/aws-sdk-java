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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RemoveTagsFromResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveTagsFromResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of resource of which you want to remove a tag.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the the
     * name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     */
    private String resourceType;
    /**
     * <p>
     * The resource ID for which you want to remove tags. Use the ID of the resource. Here are some examples:
     * </p>
     * <p>
     * ManagedInstance: mi-012345abcde
     * </p>
     * <p>
     * MaintenanceWindow: mw-012345abcde
     * </p>
     * <p>
     * PatchBaseline: pb-012345abcde
     * </p>
     * <p>
     * For the Document and Parameter values, use the name of the resource.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the the
     * name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     */
    private String resourceId;
    /**
     * <p>
     * Tag keys that you want to remove from the specified resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagKeys;

    /**
     * <p>
     * The type of resource of which you want to remove a tag.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the the
     * name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The type of resource of which you want to remove a tag.</p> <note>
     *        <p>
     *        The ManagedInstance type for this API action is only for on-premises managed instances. You must specify
     *        the the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     *        </p>
     * @see ResourceTypeForTagging
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource of which you want to remove a tag.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the the
     * name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * 
     * @return The type of resource of which you want to remove a tag.</p> <note>
     *         <p>
     *         The ManagedInstance type for this API action is only for on-premises managed instances. You must specify
     *         the the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     *         </p>
     * @see ResourceTypeForTagging
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource of which you want to remove a tag.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the the
     * name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The type of resource of which you want to remove a tag.</p> <note>
     *        <p>
     *        The ManagedInstance type for this API action is only for on-premises managed instances. You must specify
     *        the the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeForTagging
     */

    public RemoveTagsFromResourceRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource of which you want to remove a tag.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the the
     * name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The type of resource of which you want to remove a tag.</p> <note>
     *        <p>
     *        The ManagedInstance type for this API action is only for on-premises managed instances. You must specify
     *        the the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     *        </p>
     * @see ResourceTypeForTagging
     */

    public void setResourceType(ResourceTypeForTagging resourceType) {
        withResourceType(resourceType);
    }

    /**
     * <p>
     * The type of resource of which you want to remove a tag.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the the
     * name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * 
     * @param resourceType
     *        The type of resource of which you want to remove a tag.</p> <note>
     *        <p>
     *        The ManagedInstance type for this API action is only for on-premises managed instances. You must specify
     *        the the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceTypeForTagging
     */

    public RemoveTagsFromResourceRequest withResourceType(ResourceTypeForTagging resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The resource ID for which you want to remove tags. Use the ID of the resource. Here are some examples:
     * </p>
     * <p>
     * ManagedInstance: mi-012345abcde
     * </p>
     * <p>
     * MaintenanceWindow: mw-012345abcde
     * </p>
     * <p>
     * PatchBaseline: pb-012345abcde
     * </p>
     * <p>
     * For the Document and Parameter values, use the name of the resource.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the the
     * name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * 
     * @param resourceId
     *        The resource ID for which you want to remove tags. Use the ID of the resource. Here are some examples:</p>
     *        <p>
     *        ManagedInstance: mi-012345abcde
     *        </p>
     *        <p>
     *        MaintenanceWindow: mw-012345abcde
     *        </p>
     *        <p>
     *        PatchBaseline: pb-012345abcde
     *        </p>
     *        <p>
     *        For the Document and Parameter values, use the name of the resource.
     *        </p>
     *        <note>
     *        <p>
     *        The ManagedInstance type for this API action is only for on-premises managed instances. You must specify
     *        the the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     *        </p>
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID for which you want to remove tags. Use the ID of the resource. Here are some examples:
     * </p>
     * <p>
     * ManagedInstance: mi-012345abcde
     * </p>
     * <p>
     * MaintenanceWindow: mw-012345abcde
     * </p>
     * <p>
     * PatchBaseline: pb-012345abcde
     * </p>
     * <p>
     * For the Document and Parameter values, use the name of the resource.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the the
     * name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * 
     * @return The resource ID for which you want to remove tags. Use the ID of the resource. Here are some
     *         examples:</p>
     *         <p>
     *         ManagedInstance: mi-012345abcde
     *         </p>
     *         <p>
     *         MaintenanceWindow: mw-012345abcde
     *         </p>
     *         <p>
     *         PatchBaseline: pb-012345abcde
     *         </p>
     *         <p>
     *         For the Document and Parameter values, use the name of the resource.
     *         </p>
     *         <note>
     *         <p>
     *         The ManagedInstance type for this API action is only for on-premises managed instances. You must specify
     *         the the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     *         </p>
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The resource ID for which you want to remove tags. Use the ID of the resource. Here are some examples:
     * </p>
     * <p>
     * ManagedInstance: mi-012345abcde
     * </p>
     * <p>
     * MaintenanceWindow: mw-012345abcde
     * </p>
     * <p>
     * PatchBaseline: pb-012345abcde
     * </p>
     * <p>
     * For the Document and Parameter values, use the name of the resource.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises managed instances. You must specify the the
     * name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * 
     * @param resourceId
     *        The resource ID for which you want to remove tags. Use the ID of the resource. Here are some examples:</p>
     *        <p>
     *        ManagedInstance: mi-012345abcde
     *        </p>
     *        <p>
     *        MaintenanceWindow: mw-012345abcde
     *        </p>
     *        <p>
     *        PatchBaseline: pb-012345abcde
     *        </p>
     *        <p>
     *        For the Document and Parameter values, use the name of the resource.
     *        </p>
     *        <note>
     *        <p>
     *        The ManagedInstance type for this API action is only for on-premises managed instances. You must specify
     *        the the name of the managed instance in the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsFromResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Tag keys that you want to remove from the specified resource.
     * </p>
     * 
     * @return Tag keys that you want to remove from the specified resource.
     */

    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
            tagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagKeys;
    }

    /**
     * <p>
     * Tag keys that you want to remove from the specified resource.
     * </p>
     * 
     * @param tagKeys
     *        Tag keys that you want to remove from the specified resource.
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
     * Tag keys that you want to remove from the specified resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        Tag keys that you want to remove from the specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsFromResourceRequest withTagKeys(String... tagKeys) {
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
     * Tag keys that you want to remove from the specified resource.
     * </p>
     * 
     * @param tagKeys
     *        Tag keys that you want to remove from the specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsFromResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTagsFromResourceRequest == false)
            return false;
        RemoveTagsFromResourceRequest other = (RemoveTagsFromResourceRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public RemoveTagsFromResourceRequest clone() {
        return (RemoveTagsFromResourceRequest) super.clone();
    }

}
