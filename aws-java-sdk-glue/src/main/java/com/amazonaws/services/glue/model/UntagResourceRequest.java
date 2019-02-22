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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UntagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the resource from which to remove the tags.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Tags to remove from this resource.
     * </p>
     */
    private java.util.List<String> tagsToRemove;

    /**
     * <p>
     * The ARN of the resource from which to remove the tags.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource from which to remove the tags.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource from which to remove the tags.
     * </p>
     * 
     * @return The ARN of the resource from which to remove the tags.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource from which to remove the tags.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource from which to remove the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Tags to remove from this resource.
     * </p>
     * 
     * @return Tags to remove from this resource.
     */

    public java.util.List<String> getTagsToRemove() {
        return tagsToRemove;
    }

    /**
     * <p>
     * Tags to remove from this resource.
     * </p>
     * 
     * @param tagsToRemove
     *        Tags to remove from this resource.
     */

    public void setTagsToRemove(java.util.Collection<String> tagsToRemove) {
        if (tagsToRemove == null) {
            this.tagsToRemove = null;
            return;
        }

        this.tagsToRemove = new java.util.ArrayList<String>(tagsToRemove);
    }

    /**
     * <p>
     * Tags to remove from this resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagsToRemove(java.util.Collection)} or {@link #withTagsToRemove(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagsToRemove
     *        Tags to remove from this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withTagsToRemove(String... tagsToRemove) {
        if (this.tagsToRemove == null) {
            setTagsToRemove(new java.util.ArrayList<String>(tagsToRemove.length));
        }
        for (String ele : tagsToRemove) {
            this.tagsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to remove from this resource.
     * </p>
     * 
     * @param tagsToRemove
     *        Tags to remove from this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withTagsToRemove(java.util.Collection<String> tagsToRemove) {
        setTagsToRemove(tagsToRemove);
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
        if (getTagsToRemove() != null)
            sb.append("TagsToRemove: ").append(getTagsToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResourceRequest == false)
            return false;
        UntagResourceRequest other = (UntagResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTagsToRemove() == null ^ this.getTagsToRemove() == null)
            return false;
        if (other.getTagsToRemove() != null && other.getTagsToRemove().equals(this.getTagsToRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTagsToRemove() == null) ? 0 : getTagsToRemove().hashCode());
        return hashCode;
    }

    @Override
    public UntagResourceRequest clone() {
        return (UntagResourceRequest) super.clone();
    }

}
