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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a resource group. The resource group defines a set of tags that, when queried, identify
 * the AWS resources that make up the assessment target. This data type is used as the response element in the
 * <a>DescribeResourceGroups</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/ResourceGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the resource group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The tags (key and value pairs) of the resource group. This data type property is used in the
     * <a>CreateResourceGroup</a> action.
     * </p>
     */
    private java.util.List<ResourceGroupTag> tags;
    /**
     * <p>
     * The time at which resource group is created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The ARN of the resource group.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the resource group.
     * </p>
     * 
     * @return The ARN of the resource group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the resource group.
     * </p>
     * 
     * @param arn
     *        The ARN of the resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceGroup withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The tags (key and value pairs) of the resource group. This data type property is used in the
     * <a>CreateResourceGroup</a> action.
     * </p>
     * 
     * @return The tags (key and value pairs) of the resource group. This data type property is used in the
     *         <a>CreateResourceGroup</a> action.
     */

    public java.util.List<ResourceGroupTag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags (key and value pairs) of the resource group. This data type property is used in the
     * <a>CreateResourceGroup</a> action.
     * </p>
     * 
     * @param tags
     *        The tags (key and value pairs) of the resource group. This data type property is used in the
     *        <a>CreateResourceGroup</a> action.
     */

    public void setTags(java.util.Collection<ResourceGroupTag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<ResourceGroupTag>(tags);
    }

    /**
     * <p>
     * The tags (key and value pairs) of the resource group. This data type property is used in the
     * <a>CreateResourceGroup</a> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags (key and value pairs) of the resource group. This data type property is used in the
     *        <a>CreateResourceGroup</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceGroup withTags(ResourceGroupTag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<ResourceGroupTag>(tags.length));
        }
        for (ResourceGroupTag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags (key and value pairs) of the resource group. This data type property is used in the
     * <a>CreateResourceGroup</a> action.
     * </p>
     * 
     * @param tags
     *        The tags (key and value pairs) of the resource group. This data type property is used in the
     *        <a>CreateResourceGroup</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceGroup withTags(java.util.Collection<ResourceGroupTag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The time at which resource group is created.
     * </p>
     * 
     * @param createdAt
     *        The time at which resource group is created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which resource group is created.
     * </p>
     * 
     * @return The time at which resource group is created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which resource group is created.
     * </p>
     * 
     * @param createdAt
     *        The time at which resource group is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceGroup withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceGroup == false)
            return false;
        ResourceGroup other = (ResourceGroup) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ResourceGroup clone() {
        try {
            return (ResourceGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.ResourceGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
