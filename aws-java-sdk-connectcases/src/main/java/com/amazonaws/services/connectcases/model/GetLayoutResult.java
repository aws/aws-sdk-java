/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetLayout" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLayoutResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about which fields will be present in the layout, the order of the fields, and read-only attribute of
     * the field.
     * </p>
     */
    private LayoutContent content;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the newly created layout.
     * </p>
     */
    private String layoutArn;
    /**
     * <p>
     * The unique identifier of the layout.
     * </p>
     */
    private String layoutId;
    /**
     * <p>
     * The name of the layout. It must be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Information about which fields will be present in the layout, the order of the fields, and read-only attribute of
     * the field.
     * </p>
     * 
     * @param content
     *        Information about which fields will be present in the layout, the order of the fields, and read-only
     *        attribute of the field.
     */

    public void setContent(LayoutContent content) {
        this.content = content;
    }

    /**
     * <p>
     * Information about which fields will be present in the layout, the order of the fields, and read-only attribute of
     * the field.
     * </p>
     * 
     * @return Information about which fields will be present in the layout, the order of the fields, and read-only
     *         attribute of the field.
     */

    public LayoutContent getContent() {
        return this.content;
    }

    /**
     * <p>
     * Information about which fields will be present in the layout, the order of the fields, and read-only attribute of
     * the field.
     * </p>
     * 
     * @param content
     *        Information about which fields will be present in the layout, the order of the fields, and read-only
     *        attribute of the field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLayoutResult withContent(LayoutContent content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the newly created layout.
     * </p>
     * 
     * @param layoutArn
     *        The Amazon Resource Name (ARN) of the newly created layout.
     */

    public void setLayoutArn(String layoutArn) {
        this.layoutArn = layoutArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the newly created layout.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the newly created layout.
     */

    public String getLayoutArn() {
        return this.layoutArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the newly created layout.
     * </p>
     * 
     * @param layoutArn
     *        The Amazon Resource Name (ARN) of the newly created layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLayoutResult withLayoutArn(String layoutArn) {
        setLayoutArn(layoutArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the layout.
     * </p>
     * 
     * @param layoutId
     *        The unique identifier of the layout.
     */

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    /**
     * <p>
     * The unique identifier of the layout.
     * </p>
     * 
     * @return The unique identifier of the layout.
     */

    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * <p>
     * The unique identifier of the layout.
     * </p>
     * 
     * @param layoutId
     *        The unique identifier of the layout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLayoutResult withLayoutId(String layoutId) {
        setLayoutId(layoutId);
        return this;
    }

    /**
     * <p>
     * The name of the layout. It must be unique.
     * </p>
     * 
     * @param name
     *        The name of the layout. It must be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the layout. It must be unique.
     * </p>
     * 
     * @return The name of the layout. It must be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the layout. It must be unique.
     * </p>
     * 
     * @param name
     *        The name of the layout. It must be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLayoutResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @return A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *         control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @param tags
     *        A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *        control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or control
     * access for this resource.
     * </p>
     * 
     * @param tags
     *        A map of of key-value pairs that represent tags on a resource. Tags are used to organize, track, or
     *        control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLayoutResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetLayoutResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetLayoutResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLayoutResult clearTagsEntries() {
        this.tags = null;
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getLayoutArn() != null)
            sb.append("LayoutArn: ").append(getLayoutArn()).append(",");
        if (getLayoutId() != null)
            sb.append("LayoutId: ").append(getLayoutId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLayoutResult == false)
            return false;
        GetLayoutResult other = (GetLayoutResult) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getLayoutArn() == null ^ this.getLayoutArn() == null)
            return false;
        if (other.getLayoutArn() != null && other.getLayoutArn().equals(this.getLayoutArn()) == false)
            return false;
        if (other.getLayoutId() == null ^ this.getLayoutId() == null)
            return false;
        if (other.getLayoutId() != null && other.getLayoutId().equals(this.getLayoutId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getLayoutArn() == null) ? 0 : getLayoutArn().hashCode());
        hashCode = prime * hashCode + ((getLayoutId() == null) ? 0 : getLayoutId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetLayoutResult clone() {
        try {
            return (GetLayoutResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
