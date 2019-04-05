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

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of tags with their associated resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TaggedResource> taggedResources;
    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of tags with their associated resources.
     * </p>
     * 
     * @return A list of tags with their associated resources.
     */

    public java.util.List<TaggedResource> getTaggedResources() {
        if (taggedResources == null) {
            taggedResources = new com.amazonaws.internal.SdkInternalList<TaggedResource>();
        }
        return taggedResources;
    }

    /**
     * <p>
     * A list of tags with their associated resources.
     * </p>
     * 
     * @param taggedResources
     *        A list of tags with their associated resources.
     */

    public void setTaggedResources(java.util.Collection<TaggedResource> taggedResources) {
        if (taggedResources == null) {
            this.taggedResources = null;
            return;
        }

        this.taggedResources = new com.amazonaws.internal.SdkInternalList<TaggedResource>(taggedResources);
    }

    /**
     * <p>
     * A list of tags with their associated resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaggedResources(java.util.Collection)} or {@link #withTaggedResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param taggedResources
     *        A list of tags with their associated resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsResult withTaggedResources(TaggedResource... taggedResources) {
        if (this.taggedResources == null) {
            setTaggedResources(new com.amazonaws.internal.SdkInternalList<TaggedResource>(taggedResources.length));
        }
        for (TaggedResource ele : taggedResources) {
            this.taggedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags with their associated resources.
     * </p>
     * 
     * @param taggedResources
     *        A list of tags with their associated resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsResult withTaggedResources(java.util.Collection<TaggedResource> taggedResources) {
        setTaggedResources(taggedResources);
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *        field is empty, all response records have been retrieved for the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @return A value that indicates the starting point for the next set of response records in a subsequent request.
     *         If a value is returned in a response, you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *         field is empty, all response records have been retrieved for the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the <code>Marker</code> parameter and retrying the command. If the <code>Marker</code>
     *        field is empty, all response records have been retrieved for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getTaggedResources() != null)
            sb.append("TaggedResources: ").append(getTaggedResources()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
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
        if (other.getTaggedResources() == null ^ this.getTaggedResources() == null)
            return false;
        if (other.getTaggedResources() != null && other.getTaggedResources().equals(this.getTaggedResources()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaggedResources() == null) ? 0 : getTaggedResources().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
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
