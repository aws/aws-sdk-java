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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/UntagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier (ID) for the cluster whose tags you are removing. To find the cluster ID, use
     * <a>DescribeClusters</a>.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * A list of one or more tag keys for the tags that you are removing. Specify only the tag keys, not the tag values.
     * </p>
     */
    private java.util.List<String> tagKeyList;

    /**
     * <p>
     * The cluster identifier (ID) for the cluster whose tags you are removing. To find the cluster ID, use
     * <a>DescribeClusters</a>.
     * </p>
     * 
     * @param resourceId
     *        The cluster identifier (ID) for the cluster whose tags you are removing. To find the cluster ID, use
     *        <a>DescribeClusters</a>.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The cluster identifier (ID) for the cluster whose tags you are removing. To find the cluster ID, use
     * <a>DescribeClusters</a>.
     * </p>
     * 
     * @return The cluster identifier (ID) for the cluster whose tags you are removing. To find the cluster ID, use
     *         <a>DescribeClusters</a>.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The cluster identifier (ID) for the cluster whose tags you are removing. To find the cluster ID, use
     * <a>DescribeClusters</a>.
     * </p>
     * 
     * @param resourceId
     *        The cluster identifier (ID) for the cluster whose tags you are removing. To find the cluster ID, use
     *        <a>DescribeClusters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * A list of one or more tag keys for the tags that you are removing. Specify only the tag keys, not the tag values.
     * </p>
     * 
     * @return A list of one or more tag keys for the tags that you are removing. Specify only the tag keys, not the tag
     *         values.
     */

    public java.util.List<String> getTagKeyList() {
        return tagKeyList;
    }

    /**
     * <p>
     * A list of one or more tag keys for the tags that you are removing. Specify only the tag keys, not the tag values.
     * </p>
     * 
     * @param tagKeyList
     *        A list of one or more tag keys for the tags that you are removing. Specify only the tag keys, not the tag
     *        values.
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
     * A list of one or more tag keys for the tags that you are removing. Specify only the tag keys, not the tag values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeyList(java.util.Collection)} or {@link #withTagKeyList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagKeyList
     *        A list of one or more tag keys for the tags that you are removing. Specify only the tag keys, not the tag
     *        values.
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
     * A list of one or more tag keys for the tags that you are removing. Specify only the tag keys, not the tag values.
     * </p>
     * 
     * @param tagKeyList
     *        A list of one or more tag keys for the tags that you are removing. Specify only the tag keys, not the tag
     *        values.
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
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

        if (obj instanceof UntagResourceRequest == false)
            return false;
        UntagResourceRequest other = (UntagResourceRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
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

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTagKeyList() == null) ? 0 : getTagKeyList().hashCode());
        return hashCode;
    }

    @Override
    public UntagResourceRequest clone() {
        return (UntagResourceRequest) super.clone();
    }

}
