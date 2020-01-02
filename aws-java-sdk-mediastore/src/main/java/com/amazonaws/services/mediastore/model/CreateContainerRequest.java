/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediastore.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/CreateContainer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContainerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the container. The name must be from 1 to 255 characters. Container names must be unique to your AWS
     * account within a specific region. As an example, you could create a container named <code>movies</code> in every
     * region, as long as you don’t have an existing container with that name.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * An array of key:value pairs that you define. These values can be anything that you want. Typically, the tag key
     * represents a category (such as "environment") and the tag value represents a specific value within that category
     * (such as "test," "development," or "production"). You can add up to 50 tags to each container. For more
     * information about tagging, including naming and usage conventions, see <a
     * href="https://docs.aws.amazon.com/mediastore/latest/ug/tagging.html">Tagging Resources in MediaStore</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the container. The name must be from 1 to 255 characters. Container names must be unique to your AWS
     * account within a specific region. As an example, you could create a container named <code>movies</code> in every
     * region, as long as you don’t have an existing container with that name.
     * </p>
     * 
     * @param containerName
     *        The name for the container. The name must be from 1 to 255 characters. Container names must be unique to
     *        your AWS account within a specific region. As an example, you could create a container named
     *        <code>movies</code> in every region, as long as you don’t have an existing container with that name.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name for the container. The name must be from 1 to 255 characters. Container names must be unique to your AWS
     * account within a specific region. As an example, you could create a container named <code>movies</code> in every
     * region, as long as you don’t have an existing container with that name.
     * </p>
     * 
     * @return The name for the container. The name must be from 1 to 255 characters. Container names must be unique to
     *         your AWS account within a specific region. As an example, you could create a container named
     *         <code>movies</code> in every region, as long as you don’t have an existing container with that name.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name for the container. The name must be from 1 to 255 characters. Container names must be unique to your AWS
     * account within a specific region. As an example, you could create a container named <code>movies</code> in every
     * region, as long as you don’t have an existing container with that name.
     * </p>
     * 
     * @param containerName
     *        The name for the container. The name must be from 1 to 255 characters. Container names must be unique to
     *        your AWS account within a specific region. As an example, you could create a container named
     *        <code>movies</code> in every region, as long as you don’t have an existing container with that name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRequest withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * An array of key:value pairs that you define. These values can be anything that you want. Typically, the tag key
     * represents a category (such as "environment") and the tag value represents a specific value within that category
     * (such as "test," "development," or "production"). You can add up to 50 tags to each container. For more
     * information about tagging, including naming and usage conventions, see <a
     * href="https://docs.aws.amazon.com/mediastore/latest/ug/tagging.html">Tagging Resources in MediaStore</a>.
     * </p>
     * 
     * @return An array of key:value pairs that you define. These values can be anything that you want. Typically, the
     *         tag key represents a category (such as "environment") and the tag value represents a specific value
     *         within that category (such as "test," "development," or "production"). You can add up to 50 tags to each
     *         container. For more information about tagging, including naming and usage conventions, see <a
     *         href="https://docs.aws.amazon.com/mediastore/latest/ug/tagging.html">Tagging Resources in MediaStore</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key:value pairs that you define. These values can be anything that you want. Typically, the tag key
     * represents a category (such as "environment") and the tag value represents a specific value within that category
     * (such as "test," "development," or "production"). You can add up to 50 tags to each container. For more
     * information about tagging, including naming and usage conventions, see <a
     * href="https://docs.aws.amazon.com/mediastore/latest/ug/tagging.html">Tagging Resources in MediaStore</a>.
     * </p>
     * 
     * @param tags
     *        An array of key:value pairs that you define. These values can be anything that you want. Typically, the
     *        tag key represents a category (such as "environment") and the tag value represents a specific value within
     *        that category (such as "test," "development," or "production"). You can add up to 50 tags to each
     *        container. For more information about tagging, including naming and usage conventions, see <a
     *        href="https://docs.aws.amazon.com/mediastore/latest/ug/tagging.html">Tagging Resources in MediaStore</a>.
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
     * An array of key:value pairs that you define. These values can be anything that you want. Typically, the tag key
     * represents a category (such as "environment") and the tag value represents a specific value within that category
     * (such as "test," "development," or "production"). You can add up to 50 tags to each container. For more
     * information about tagging, including naming and usage conventions, see <a
     * href="https://docs.aws.amazon.com/mediastore/latest/ug/tagging.html">Tagging Resources in MediaStore</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key:value pairs that you define. These values can be anything that you want. Typically, the
     *        tag key represents a category (such as "environment") and the tag value represents a specific value within
     *        that category (such as "test," "development," or "production"). You can add up to 50 tags to each
     *        container. For more information about tagging, including naming and usage conventions, see <a
     *        href="https://docs.aws.amazon.com/mediastore/latest/ug/tagging.html">Tagging Resources in MediaStore</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRequest withTags(Tag... tags) {
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
     * An array of key:value pairs that you define. These values can be anything that you want. Typically, the tag key
     * represents a category (such as "environment") and the tag value represents a specific value within that category
     * (such as "test," "development," or "production"). You can add up to 50 tags to each container. For more
     * information about tagging, including naming and usage conventions, see <a
     * href="https://docs.aws.amazon.com/mediastore/latest/ug/tagging.html">Tagging Resources in MediaStore</a>.
     * </p>
     * 
     * @param tags
     *        An array of key:value pairs that you define. These values can be anything that you want. Typically, the
     *        tag key represents a category (such as "environment") and the tag value represents a specific value within
     *        that category (such as "test," "development," or "production"). You can add up to 50 tags to each
     *        container. For more information about tagging, including naming and usage conventions, see <a
     *        href="https://docs.aws.amazon.com/mediastore/latest/ug/tagging.html">Tagging Resources in MediaStore</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
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

        if (obj instanceof CreateContainerRequest == false)
            return false;
        CreateContainerRequest other = (CreateContainerRequest) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
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

        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateContainerRequest clone() {
        return (CreateContainerRequest) super.clone();
    }

}
