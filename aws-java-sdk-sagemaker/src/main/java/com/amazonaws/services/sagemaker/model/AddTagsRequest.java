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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AddTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to tag.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * An array of <code>Tag</code> objects. Each tag is a key-value pair. Only the <code>key</code> parameter is
     * required. If you don't specify a value, Amazon SageMaker sets the value to an empty string.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to tag.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource that you want to tag.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to tag.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource that you want to tag.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource that you want to tag.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource that you want to tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * An array of <code>Tag</code> objects. Each tag is a key-value pair. Only the <code>key</code> parameter is
     * required. If you don't specify a value, Amazon SageMaker sets the value to an empty string.
     * </p>
     * 
     * @return An array of <code>Tag</code> objects. Each tag is a key-value pair. Only the <code>key</code> parameter
     *         is required. If you don't specify a value, Amazon SageMaker sets the value to an empty string.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of <code>Tag</code> objects. Each tag is a key-value pair. Only the <code>key</code> parameter is
     * required. If you don't specify a value, Amazon SageMaker sets the value to an empty string.
     * </p>
     * 
     * @param tags
     *        An array of <code>Tag</code> objects. Each tag is a key-value pair. Only the <code>key</code> parameter is
     *        required. If you don't specify a value, Amazon SageMaker sets the value to an empty string.
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
     * An array of <code>Tag</code> objects. Each tag is a key-value pair. Only the <code>key</code> parameter is
     * required. If you don't specify a value, Amazon SageMaker sets the value to an empty string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of <code>Tag</code> objects. Each tag is a key-value pair. Only the <code>key</code> parameter is
     *        required. If you don't specify a value, Amazon SageMaker sets the value to an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsRequest withTags(Tag... tags) {
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
     * An array of <code>Tag</code> objects. Each tag is a key-value pair. Only the <code>key</code> parameter is
     * required. If you don't specify a value, Amazon SageMaker sets the value to an empty string.
     * </p>
     * 
     * @param tags
     *        An array of <code>Tag</code> objects. Each tag is a key-value pair. Only the <code>key</code> parameter is
     *        required. If you don't specify a value, Amazon SageMaker sets the value to an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof AddTagsRequest == false)
            return false;
        AddTagsRequest other = (AddTagsRequest) obj;
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
    public AddTagsRequest clone() {
        return (AddTagsRequest) super.clone();
    }

}
