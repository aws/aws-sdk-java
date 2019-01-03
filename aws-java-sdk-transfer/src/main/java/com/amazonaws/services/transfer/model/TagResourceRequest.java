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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An Amazon Resource Name (ARN) for a specific AWS resource, such as a server, user, or role.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Key-value pairs assigned to ARNs that you can use to group and search for resources by type. You can attach this
     * metadata to user accounts for any purpose.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * An Amazon Resource Name (ARN) for a specific AWS resource, such as a server, user, or role.
     * </p>
     * 
     * @param arn
     *        An Amazon Resource Name (ARN) for a specific AWS resource, such as a server, user, or role.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) for a specific AWS resource, such as a server, user, or role.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) for a specific AWS resource, such as a server, user, or role.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) for a specific AWS resource, such as a server, user, or role.
     * </p>
     * 
     * @param arn
     *        An Amazon Resource Name (ARN) for a specific AWS resource, such as a server, user, or role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagResourceRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Key-value pairs assigned to ARNs that you can use to group and search for resources by type. You can attach this
     * metadata to user accounts for any purpose.
     * </p>
     * 
     * @return Key-value pairs assigned to ARNs that you can use to group and search for resources by type. You can
     *         attach this metadata to user accounts for any purpose.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs assigned to ARNs that you can use to group and search for resources by type. You can attach this
     * metadata to user accounts for any purpose.
     * </p>
     * 
     * @param tags
     *        Key-value pairs assigned to ARNs that you can use to group and search for resources by type. You can
     *        attach this metadata to user accounts for any purpose.
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
     * Key-value pairs assigned to ARNs that you can use to group and search for resources by type. You can attach this
     * metadata to user accounts for any purpose.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs assigned to ARNs that you can use to group and search for resources by type. You can
     *        attach this metadata to user accounts for any purpose.
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
     * Key-value pairs assigned to ARNs that you can use to group and search for resources by type. You can attach this
     * metadata to user accounts for any purpose.
     * </p>
     * 
     * @param tags
     *        Key-value pairs assigned to ARNs that you can use to group and search for resources by type. You can
     *        attach this metadata to user accounts for any purpose.
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagResourceRequest clone() {
        return (TagResourceRequest) super.clone();
    }

}
