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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/RemoveTagsFromResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveTagsFromResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS CloudHSM resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The tag key or keys to remove.
     * </p>
     * <p>
     * Specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use
     * <a>AddTagsToResource</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagKeyList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS CloudHSM resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the AWS CloudHSM resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS CloudHSM resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS CloudHSM resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS CloudHSM resource.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the AWS CloudHSM resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsFromResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The tag key or keys to remove.
     * </p>
     * <p>
     * Specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use
     * <a>AddTagsToResource</a>.
     * </p>
     * 
     * @return The tag key or keys to remove.</p>
     *         <p>
     *         Specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use
     *         <a>AddTagsToResource</a>.
     */

    public java.util.List<String> getTagKeyList() {
        if (tagKeyList == null) {
            tagKeyList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagKeyList;
    }

    /**
     * <p>
     * The tag key or keys to remove.
     * </p>
     * <p>
     * Specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use
     * <a>AddTagsToResource</a>.
     * </p>
     * 
     * @param tagKeyList
     *        The tag key or keys to remove.</p>
     *        <p>
     *        Specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use
     *        <a>AddTagsToResource</a>.
     */

    public void setTagKeyList(java.util.Collection<String> tagKeyList) {
        if (tagKeyList == null) {
            this.tagKeyList = null;
            return;
        }

        this.tagKeyList = new com.amazonaws.internal.SdkInternalList<String>(tagKeyList);
    }

    /**
     * <p>
     * The tag key or keys to remove.
     * </p>
     * <p>
     * Specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use
     * <a>AddTagsToResource</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeyList(java.util.Collection)} or {@link #withTagKeyList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagKeyList
     *        The tag key or keys to remove.</p>
     *        <p>
     *        Specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use
     *        <a>AddTagsToResource</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsFromResourceRequest withTagKeyList(String... tagKeyList) {
        if (this.tagKeyList == null) {
            setTagKeyList(new com.amazonaws.internal.SdkInternalList<String>(tagKeyList.length));
        }
        for (String ele : tagKeyList) {
            this.tagKeyList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag key or keys to remove.
     * </p>
     * <p>
     * Specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use
     * <a>AddTagsToResource</a>.
     * </p>
     * 
     * @param tagKeyList
     *        The tag key or keys to remove.</p>
     *        <p>
     *        Specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use
     *        <a>AddTagsToResource</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsFromResourceRequest withTagKeyList(java.util.Collection<String> tagKeyList) {
        setTagKeyList(tagKeyList);
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
        if (getTagKeyList() != null)
            sb.append("TagKeyList: ").append(getTagKeyList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTagsFromResourceRequest == false)
            return false;
        RemoveTagsFromResourceRequest other = (RemoveTagsFromResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTagKeyList() == null ^ this.getTagKeyList() == null)
            return false;
        if (other.getTagKeyList() != null && other.getTagKeyList().equals(this.getTagKeyList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTagKeyList() == null) ? 0 : getTagKeyList().hashCode());
        return hashCode;
    }

    @Override
    public RemoveTagsFromResourceRequest clone() {
        return (RemoveTagsFromResourceRequest) super.clone();
    }

}
