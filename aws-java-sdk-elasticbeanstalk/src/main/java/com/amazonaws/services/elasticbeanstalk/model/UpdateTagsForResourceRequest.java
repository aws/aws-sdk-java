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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateTagsForResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resouce to be updated.
     * </p>
     * <p>
     * Must be the ARN of an Elastic Beanstalk environment.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A list of tags to add or update.
     * </p>
     * <p>
     * If a key of an existing tag is added, the tag's value is updated.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tagsToAdd;
    /**
     * <p>
     * A list of tag keys to remove.
     * </p>
     * <p>
     * If a tag key doesn't exist, it is silently ignored.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagsToRemove;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resouce to be updated.
     * </p>
     * <p>
     * Must be the ARN of an Elastic Beanstalk environment.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resouce to be updated.</p>
     *        <p>
     *        Must be the ARN of an Elastic Beanstalk environment.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resouce to be updated.
     * </p>
     * <p>
     * Must be the ARN of an Elastic Beanstalk environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resouce to be updated.</p>
     *         <p>
     *         Must be the ARN of an Elastic Beanstalk environment.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resouce to be updated.
     * </p>
     * <p>
     * Must be the ARN of an Elastic Beanstalk environment.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resouce to be updated.</p>
     *        <p>
     *        Must be the ARN of an Elastic Beanstalk environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTagsForResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A list of tags to add or update.
     * </p>
     * <p>
     * If a key of an existing tag is added, the tag's value is updated.
     * </p>
     * 
     * @return A list of tags to add or update.</p>
     *         <p>
     *         If a key of an existing tag is added, the tag's value is updated.
     */

    public java.util.List<Tag> getTagsToAdd() {
        if (tagsToAdd == null) {
            tagsToAdd = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tagsToAdd;
    }

    /**
     * <p>
     * A list of tags to add or update.
     * </p>
     * <p>
     * If a key of an existing tag is added, the tag's value is updated.
     * </p>
     * 
     * @param tagsToAdd
     *        A list of tags to add or update.</p>
     *        <p>
     *        If a key of an existing tag is added, the tag's value is updated.
     */

    public void setTagsToAdd(java.util.Collection<Tag> tagsToAdd) {
        if (tagsToAdd == null) {
            this.tagsToAdd = null;
            return;
        }

        this.tagsToAdd = new com.amazonaws.internal.SdkInternalList<Tag>(tagsToAdd);
    }

    /**
     * <p>
     * A list of tags to add or update.
     * </p>
     * <p>
     * If a key of an existing tag is added, the tag's value is updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagsToAdd(java.util.Collection)} or {@link #withTagsToAdd(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagsToAdd
     *        A list of tags to add or update.</p>
     *        <p>
     *        If a key of an existing tag is added, the tag's value is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTagsForResourceRequest withTagsToAdd(Tag... tagsToAdd) {
        if (this.tagsToAdd == null) {
            setTagsToAdd(new com.amazonaws.internal.SdkInternalList<Tag>(tagsToAdd.length));
        }
        for (Tag ele : tagsToAdd) {
            this.tagsToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to add or update.
     * </p>
     * <p>
     * If a key of an existing tag is added, the tag's value is updated.
     * </p>
     * 
     * @param tagsToAdd
     *        A list of tags to add or update.</p>
     *        <p>
     *        If a key of an existing tag is added, the tag's value is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTagsForResourceRequest withTagsToAdd(java.util.Collection<Tag> tagsToAdd) {
        setTagsToAdd(tagsToAdd);
        return this;
    }

    /**
     * <p>
     * A list of tag keys to remove.
     * </p>
     * <p>
     * If a tag key doesn't exist, it is silently ignored.
     * </p>
     * 
     * @return A list of tag keys to remove.</p>
     *         <p>
     *         If a tag key doesn't exist, it is silently ignored.
     */

    public java.util.List<String> getTagsToRemove() {
        if (tagsToRemove == null) {
            tagsToRemove = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagsToRemove;
    }

    /**
     * <p>
     * A list of tag keys to remove.
     * </p>
     * <p>
     * If a tag key doesn't exist, it is silently ignored.
     * </p>
     * 
     * @param tagsToRemove
     *        A list of tag keys to remove.</p>
     *        <p>
     *        If a tag key doesn't exist, it is silently ignored.
     */

    public void setTagsToRemove(java.util.Collection<String> tagsToRemove) {
        if (tagsToRemove == null) {
            this.tagsToRemove = null;
            return;
        }

        this.tagsToRemove = new com.amazonaws.internal.SdkInternalList<String>(tagsToRemove);
    }

    /**
     * <p>
     * A list of tag keys to remove.
     * </p>
     * <p>
     * If a tag key doesn't exist, it is silently ignored.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagsToRemove(java.util.Collection)} or {@link #withTagsToRemove(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagsToRemove
     *        A list of tag keys to remove.</p>
     *        <p>
     *        If a tag key doesn't exist, it is silently ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTagsForResourceRequest withTagsToRemove(String... tagsToRemove) {
        if (this.tagsToRemove == null) {
            setTagsToRemove(new com.amazonaws.internal.SdkInternalList<String>(tagsToRemove.length));
        }
        for (String ele : tagsToRemove) {
            this.tagsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag keys to remove.
     * </p>
     * <p>
     * If a tag key doesn't exist, it is silently ignored.
     * </p>
     * 
     * @param tagsToRemove
     *        A list of tag keys to remove.</p>
     *        <p>
     *        If a tag key doesn't exist, it is silently ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTagsForResourceRequest withTagsToRemove(java.util.Collection<String> tagsToRemove) {
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
        if (getTagsToAdd() != null)
            sb.append("TagsToAdd: ").append(getTagsToAdd()).append(",");
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

        if (obj instanceof UpdateTagsForResourceRequest == false)
            return false;
        UpdateTagsForResourceRequest other = (UpdateTagsForResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTagsToAdd() == null ^ this.getTagsToAdd() == null)
            return false;
        if (other.getTagsToAdd() != null && other.getTagsToAdd().equals(this.getTagsToAdd()) == false)
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
        hashCode = prime * hashCode + ((getTagsToAdd() == null) ? 0 : getTagsToAdd().hashCode());
        hashCode = prime * hashCode + ((getTagsToRemove() == null) ? 0 : getTagsToRemove().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTagsForResourceRequest clone() {
        return (UpdateTagsForResourceRequest) super.clone();
    }

}
