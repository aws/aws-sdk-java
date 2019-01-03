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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the output from the <code>CreateTags</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) to which you want to add the tag or tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * One or more name/value pairs to add as tags to the specified resource. Each tag name is passed in with the
     * parameter <code>Key</code> and the corresponding value is passed in with the parameter <code>Value</code>. The
     * <code>Key</code> and <code>Value</code> parameters are separated by a comma (,). Separate multiple tags with a
     * space. For example,
     * <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     * .
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) to which you want to add the tag or tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon Resource Name (ARN) to which you want to add the tag or tags. For example,
     *        <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to which you want to add the tag or tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) to which you want to add the tag or tags. For example,
     *         <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) to which you want to add the tag or tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon Resource Name (ARN) to which you want to add the tag or tags. For example,
     *        <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTagsRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * One or more name/value pairs to add as tags to the specified resource. Each tag name is passed in with the
     * parameter <code>Key</code> and the corresponding value is passed in with the parameter <code>Value</code>. The
     * <code>Key</code> and <code>Value</code> parameters are separated by a comma (,). Separate multiple tags with a
     * space. For example,
     * <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     * .
     * </p>
     * 
     * @return One or more name/value pairs to add as tags to the specified resource. Each tag name is passed in with
     *         the parameter <code>Key</code> and the corresponding value is passed in with the parameter
     *         <code>Value</code>. The <code>Key</code> and <code>Value</code> parameters are separated by a comma (,).
     *         Separate multiple tags with a space. For example,
     *         <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     *         .
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * One or more name/value pairs to add as tags to the specified resource. Each tag name is passed in with the
     * parameter <code>Key</code> and the corresponding value is passed in with the parameter <code>Value</code>. The
     * <code>Key</code> and <code>Value</code> parameters are separated by a comma (,). Separate multiple tags with a
     * space. For example,
     * <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     * .
     * </p>
     * 
     * @param tags
     *        One or more name/value pairs to add as tags to the specified resource. Each tag name is passed in with the
     *        parameter <code>Key</code> and the corresponding value is passed in with the parameter <code>Value</code>.
     *        The <code>Key</code> and <code>Value</code> parameters are separated by a comma (,). Separate multiple
     *        tags with a space. For example,
     *        <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     *        .
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * One or more name/value pairs to add as tags to the specified resource. Each tag name is passed in with the
     * parameter <code>Key</code> and the corresponding value is passed in with the parameter <code>Value</code>. The
     * <code>Key</code> and <code>Value</code> parameters are separated by a comma (,). Separate multiple tags with a
     * space. For example,
     * <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        One or more name/value pairs to add as tags to the specified resource. Each tag name is passed in with the
     *        parameter <code>Key</code> and the corresponding value is passed in with the parameter <code>Value</code>.
     *        The <code>Key</code> and <code>Value</code> parameters are separated by a comma (,). Separate multiple
     *        tags with a space. For example,
     *        <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTagsRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more name/value pairs to add as tags to the specified resource. Each tag name is passed in with the
     * parameter <code>Key</code> and the corresponding value is passed in with the parameter <code>Value</code>. The
     * <code>Key</code> and <code>Value</code> parameters are separated by a comma (,). Separate multiple tags with a
     * space. For example,
     * <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     * .
     * </p>
     * 
     * @param tags
     *        One or more name/value pairs to add as tags to the specified resource. Each tag name is passed in with the
     *        parameter <code>Key</code> and the corresponding value is passed in with the parameter <code>Value</code>.
     *        The <code>Key</code> and <code>Value</code> parameters are separated by a comma (,). Separate multiple
     *        tags with a space. For example,
     *        <code>--tags "Key"="owner","Value"="admin" "Key"="environment","Value"="test" "Key"="version","Value"="1.0"</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTagsRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
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

        if (obj instanceof CreateTagsRequest == false)
            return false;
        CreateTagsRequest other = (CreateTagsRequest) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
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

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTagsRequest clone() {
        return (CreateTagsRequest) super.clone();
    }

}
