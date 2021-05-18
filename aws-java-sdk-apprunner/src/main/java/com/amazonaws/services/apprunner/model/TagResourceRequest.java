/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to update tags for.
     * </p>
     * <p>
     * It must be the ARN of an App Runner resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A list of tag key-value pairs to add or update. If a key is new to the resource, the tag is added with the
     * provided value. If a key is already associated with the resource, the value of the tag is updated.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to update tags for.
     * </p>
     * <p>
     * It must be the ARN of an App Runner resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource that you want to update tags for.</p>
     *        <p>
     *        It must be the ARN of an App Runner resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to update tags for.
     * </p>
     * <p>
     * It must be the ARN of an App Runner resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource that you want to update tags for.</p>
     *         <p>
     *         It must be the ARN of an App Runner resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to update tags for.
     * </p>
     * <p>
     * It must be the ARN of an App Runner resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource that you want to update tags for.</p>
     *        <p>
     *        It must be the ARN of an App Runner resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A list of tag key-value pairs to add or update. If a key is new to the resource, the tag is added with the
     * provided value. If a key is already associated with the resource, the value of the tag is updated.
     * </p>
     * 
     * @return A list of tag key-value pairs to add or update. If a key is new to the resource, the tag is added with
     *         the provided value. If a key is already associated with the resource, the value of the tag is updated.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tag key-value pairs to add or update. If a key is new to the resource, the tag is added with the
     * provided value. If a key is already associated with the resource, the value of the tag is updated.
     * </p>
     * 
     * @param tags
     *        A list of tag key-value pairs to add or update. If a key is new to the resource, the tag is added with the
     *        provided value. If a key is already associated with the resource, the value of the tag is updated.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tag key-value pairs to add or update. If a key is new to the resource, the tag is added with the
     * provided value. If a key is already associated with the resource, the value of the tag is updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tag key-value pairs to add or update. If a key is new to the resource, the tag is added with the
     *        provided value. If a key is already associated with the resource, the value of the tag is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag key-value pairs to add or update. If a key is new to the resource, the tag is added with the
     * provided value. If a key is already associated with the resource, the value of the tag is updated.
     * </p>
     * 
     * @param tags
     *        A list of tag key-value pairs to add or update. If a key is new to the resource, the tag is added with the
     *        provided value. If a key is already associated with the resource, the value of the tag is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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

        if (obj instanceof TagResourceRequest == false)
            return false;
        TagResourceRequest other = (TagResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
