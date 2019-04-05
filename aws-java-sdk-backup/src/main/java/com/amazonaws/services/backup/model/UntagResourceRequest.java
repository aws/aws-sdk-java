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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UntagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A list of keys to identify which key-value tags to remove from a resource.
     * </p>
     */
    private java.util.List<String> tagKeyList;

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged resource.
     * </p>
     * 
     * @param resourceArn
     *        An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged
     *        resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged resource.
     * </p>
     * 
     * @return An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged
     *         resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged resource.
     * </p>
     * 
     * @param resourceArn
     *        An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A list of keys to identify which key-value tags to remove from a resource.
     * </p>
     * 
     * @return A list of keys to identify which key-value tags to remove from a resource.
     */

    public java.util.List<String> getTagKeyList() {
        return tagKeyList;
    }

    /**
     * <p>
     * A list of keys to identify which key-value tags to remove from a resource.
     * </p>
     * 
     * @param tagKeyList
     *        A list of keys to identify which key-value tags to remove from a resource.
     */

    public void setTagKeyList(java.util.Collection<String> tagKeyList) {
        if (tagKeyList == null) {
            this.tagKeyList = null;
            return;
        }

        this.tagKeyList = new java.util.ArrayList<String>(tagKeyList);
    }

    /**
     * <p>
     * A list of keys to identify which key-value tags to remove from a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeyList(java.util.Collection)} or {@link #withTagKeyList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagKeyList
     *        A list of keys to identify which key-value tags to remove from a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withTagKeyList(String... tagKeyList) {
        if (this.tagKeyList == null) {
            setTagKeyList(new java.util.ArrayList<String>(tagKeyList.length));
        }
        for (String ele : tagKeyList) {
            this.tagKeyList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of keys to identify which key-value tags to remove from a resource.
     * </p>
     * 
     * @param tagKeyList
     *        A list of keys to identify which key-value tags to remove from a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withTagKeyList(java.util.Collection<String> tagKeyList) {
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
            sb.append("TagKeyList: ").append("***Sensitive Data Redacted***");
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
    public UntagResourceRequest clone() {
        return (UntagResourceRequest) super.clone();
    }

}
