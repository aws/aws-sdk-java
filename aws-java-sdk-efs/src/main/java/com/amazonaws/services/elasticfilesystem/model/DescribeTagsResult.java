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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the request included a <code>Marker</code>, the response returns that value in this field.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Returns tags associated with the file system as an array of <code>Tag</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * If a value is present, there are more tags to return. In a subsequent request, you can provide the value of
     * <code>NextMarker</code> as the value of the <code>Marker</code> parameter in your next request to retrieve the
     * next set of tags.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * If the request included a <code>Marker</code>, the response returns that value in this field.
     * </p>
     * 
     * @param marker
     *        If the request included a <code>Marker</code>, the response returns that value in this field.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * If the request included a <code>Marker</code>, the response returns that value in this field.
     * </p>
     * 
     * @return If the request included a <code>Marker</code>, the response returns that value in this field.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * If the request included a <code>Marker</code>, the response returns that value in this field.
     * </p>
     * 
     * @param marker
     *        If the request included a <code>Marker</code>, the response returns that value in this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Returns tags associated with the file system as an array of <code>Tag</code> objects.
     * </p>
     * 
     * @return Returns tags associated with the file system as an array of <code>Tag</code> objects.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Returns tags associated with the file system as an array of <code>Tag</code> objects.
     * </p>
     * 
     * @param tags
     *        Returns tags associated with the file system as an array of <code>Tag</code> objects.
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
     * Returns tags associated with the file system as an array of <code>Tag</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Returns tags associated with the file system as an array of <code>Tag</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsResult withTags(Tag... tags) {
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
     * Returns tags associated with the file system as an array of <code>Tag</code> objects.
     * </p>
     * 
     * @param tags
     *        Returns tags associated with the file system as an array of <code>Tag</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * If a value is present, there are more tags to return. In a subsequent request, you can provide the value of
     * <code>NextMarker</code> as the value of the <code>Marker</code> parameter in your next request to retrieve the
     * next set of tags.
     * </p>
     * 
     * @param nextMarker
     *        If a value is present, there are more tags to return. In a subsequent request, you can provide the value
     *        of <code>NextMarker</code> as the value of the <code>Marker</code> parameter in your next request to
     *        retrieve the next set of tags.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If a value is present, there are more tags to return. In a subsequent request, you can provide the value of
     * <code>NextMarker</code> as the value of the <code>Marker</code> parameter in your next request to retrieve the
     * next set of tags.
     * </p>
     * 
     * @return If a value is present, there are more tags to return. In a subsequent request, you can provide the value
     *         of <code>NextMarker</code> as the value of the <code>Marker</code> parameter in your next request to
     *         retrieve the next set of tags.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If a value is present, there are more tags to return. In a subsequent request, you can provide the value of
     * <code>NextMarker</code> as the value of the <code>Marker</code> parameter in your next request to retrieve the
     * next set of tags.
     * </p>
     * 
     * @param nextMarker
     *        If a value is present, there are more tags to return. In a subsequent request, you can provide the value
     *        of <code>NextMarker</code> as the value of the <code>Marker</code> parameter in your next request to
     *        retrieve the next set of tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTagsResult == false)
            return false;
        DescribeTagsResult other = (DescribeTagsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTagsResult clone() {
        try {
            return (DescribeTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
