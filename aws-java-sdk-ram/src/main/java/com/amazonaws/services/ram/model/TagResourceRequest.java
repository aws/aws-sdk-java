/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the resource share that you want to add tags to. You must specify <i>either</i>
     * <code>resourceShareArn</code>, or <code>resourceArn</code>, but not both.
     * </p>
     */
    private String resourceShareArn;
    /**
     * <p>
     * A list of one or more tag key and value pairs. The tag key must be present and not be an empty string. The tag
     * value must be present but can be an empty string.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the managed permission that you want to add tags to. You must specify <i>either</i>
     * <code>resourceArn</code>, or <code>resourceShareArn</code>, but not both.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the resource share that you want to add tags to. You must specify <i>either</i>
     * <code>resourceShareArn</code>, or <code>resourceArn</code>, but not both.
     * </p>
     * 
     * @param resourceShareArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the resource share that you want to add tags to. You must specify <i>either</i>
     *        <code>resourceShareArn</code>, or <code>resourceArn</code>, but not both.
     */

    public void setResourceShareArn(String resourceShareArn) {
        this.resourceShareArn = resourceShareArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the resource share that you want to add tags to. You must specify <i>either</i>
     * <code>resourceShareArn</code>, or <code>resourceArn</code>, but not both.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Name (ARN)</a> of the resource share that you want to add tags to. You must specify
     *         <i>either</i> <code>resourceShareArn</code>, or <code>resourceArn</code>, but not both.
     */

    public String getResourceShareArn() {
        return this.resourceShareArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the resource share that you want to add tags to. You must specify <i>either</i>
     * <code>resourceShareArn</code>, or <code>resourceArn</code>, but not both.
     * </p>
     * 
     * @param resourceShareArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the resource share that you want to add tags to. You must specify <i>either</i>
     *        <code>resourceShareArn</code>, or <code>resourceArn</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceShareArn(String resourceShareArn) {
        setResourceShareArn(resourceShareArn);
        return this;
    }

    /**
     * <p>
     * A list of one or more tag key and value pairs. The tag key must be present and not be an empty string. The tag
     * value must be present but can be an empty string.
     * </p>
     * 
     * @return A list of one or more tag key and value pairs. The tag key must be present and not be an empty string.
     *         The tag value must be present but can be an empty string.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of one or more tag key and value pairs. The tag key must be present and not be an empty string. The tag
     * value must be present but can be an empty string.
     * </p>
     * 
     * @param tags
     *        A list of one or more tag key and value pairs. The tag key must be present and not be an empty string. The
     *        tag value must be present but can be an empty string.
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
     * A list of one or more tag key and value pairs. The tag key must be present and not be an empty string. The tag
     * value must be present but can be an empty string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of one or more tag key and value pairs. The tag key must be present and not be an empty string. The
     *        tag value must be present but can be an empty string.
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
     * A list of one or more tag key and value pairs. The tag key must be present and not be an empty string. The tag
     * value must be present but can be an empty string.
     * </p>
     * 
     * @param tags
     *        A list of one or more tag key and value pairs. The tag key must be present and not be an empty string. The
     *        tag value must be present but can be an empty string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the managed permission that you want to add tags to. You must specify <i>either</i>
     * <code>resourceArn</code>, or <code>resourceShareArn</code>, but not both.
     * </p>
     * 
     * @param resourceArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the managed permission that you want to add tags to. You must specify
     *        <i>either</i> <code>resourceArn</code>, or <code>resourceShareArn</code>, but not both.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the managed permission that you want to add tags to. You must specify <i>either</i>
     * <code>resourceArn</code>, or <code>resourceShareArn</code>, but not both.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Name (ARN)</a> of the managed permission that you want to add tags to. You must specify
     *         <i>either</i> <code>resourceArn</code>, or <code>resourceShareArn</code>, but not both.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Name (ARN)</a> of the managed permission that you want to add tags to. You must specify <i>either</i>
     * <code>resourceArn</code>, or <code>resourceShareArn</code>, but not both.
     * </p>
     * 
     * @param resourceArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resource Name (ARN)</a> of the managed permission that you want to add tags to. You must specify
     *        <i>either</i> <code>resourceArn</code>, or <code>resourceShareArn</code>, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getResourceShareArn() != null)
            sb.append("ResourceShareArn: ").append(getResourceShareArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
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
        if (other.getResourceShareArn() == null ^ this.getResourceShareArn() == null)
            return false;
        if (other.getResourceShareArn() != null && other.getResourceShareArn().equals(this.getResourceShareArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceShareArn() == null) ? 0 : getResourceShareArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
