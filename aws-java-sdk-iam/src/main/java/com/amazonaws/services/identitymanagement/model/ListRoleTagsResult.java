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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListRoleTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRoleTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of tags currently that is attached to the role. Each tag consists of a key name and an associated value.
     * If no tags are attached to the specified role, the response contains an empty list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can use the
     * <code>Marker</code> request parameter to make a subsequent pagination request that retrieves more items. Note
     * that IAM might return fewer than the <code>MaxItems</code> number of results even when more results are
     * available. Check <code>IsTruncated</code> after every call to ensure that you receive all of your results.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The list of tags currently that is attached to the role. Each tag consists of a key name and an associated value.
     * If no tags are attached to the specified role, the response contains an empty list.
     * </p>
     * 
     * @return The list of tags currently that is attached to the role. Each tag consists of a key name and an
     *         associated value. If no tags are attached to the specified role, the response contains an empty list.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags currently that is attached to the role. Each tag consists of a key name and an associated value.
     * If no tags are attached to the specified role, the response contains an empty list.
     * </p>
     * 
     * @param tags
     *        The list of tags currently that is attached to the role. Each tag consists of a key name and an associated
     *        value. If no tags are attached to the specified role, the response contains an empty list.
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
     * The list of tags currently that is attached to the role. Each tag consists of a key name and an associated value.
     * If no tags are attached to the specified role, the response contains an empty list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags currently that is attached to the role. Each tag consists of a key name and an associated
     *        value. If no tags are attached to the specified role, the response contains an empty list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoleTagsResult withTags(Tag... tags) {
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
     * The list of tags currently that is attached to the role. Each tag consists of a key name and an associated value.
     * If no tags are attached to the specified role, the response contains an empty list.
     * </p>
     * 
     * @param tags
     *        The list of tags currently that is attached to the role. Each tag consists of a key name and an associated
     *        value. If no tags are attached to the specified role, the response contains an empty list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoleTagsResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can use the
     * <code>Marker</code> request parameter to make a subsequent pagination request that retrieves more items. Note
     * that IAM might return fewer than the <code>MaxItems</code> number of results even when more results are
     * available. Check <code>IsTruncated</code> after every call to ensure that you receive all of your results.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more items to return. If your results were truncated, you can use
     *        the <code>Marker</code> request parameter to make a subsequent pagination request that retrieves more
     *        items. Note that IAM might return fewer than the <code>MaxItems</code> number of results even when more
     *        results are available. Check <code>IsTruncated</code> after every call to ensure that you receive all of
     *        your results.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can use the
     * <code>Marker</code> request parameter to make a subsequent pagination request that retrieves more items. Note
     * that IAM might return fewer than the <code>MaxItems</code> number of results even when more results are
     * available. Check <code>IsTruncated</code> after every call to ensure that you receive all of your results.
     * </p>
     * 
     * @return A flag that indicates whether there are more items to return. If your results were truncated, you can use
     *         the <code>Marker</code> request parameter to make a subsequent pagination request that retrieves more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code> number of results even when more
     *         results are available. Check <code>IsTruncated</code> after every call to ensure that you receive all of
     *         your results.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can use the
     * <code>Marker</code> request parameter to make a subsequent pagination request that retrieves more items. Note
     * that IAM might return fewer than the <code>MaxItems</code> number of results even when more results are
     * available. Check <code>IsTruncated</code> after every call to ensure that you receive all of your results.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more items to return. If your results were truncated, you can use
     *        the <code>Marker</code> request parameter to make a subsequent pagination request that retrieves more
     *        items. Note that IAM might return fewer than the <code>MaxItems</code> number of results even when more
     *        results are available. Check <code>IsTruncated</code> after every call to ensure that you receive all of
     *        your results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoleTagsResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items to return. If your results were truncated, you can use the
     * <code>Marker</code> request parameter to make a subsequent pagination request that retrieves more items. Note
     * that IAM might return fewer than the <code>MaxItems</code> number of results even when more results are
     * available. Check <code>IsTruncated</code> after every call to ensure that you receive all of your results.
     * </p>
     * 
     * @return A flag that indicates whether there are more items to return. If your results were truncated, you can use
     *         the <code>Marker</code> request parameter to make a subsequent pagination request that retrieves more
     *         items. Note that IAM might return fewer than the <code>MaxItems</code> number of results even when more
     *         results are available. Check <code>IsTruncated</code> after every call to ensure that you receive all of
     *         your results.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @param marker
     *        When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use
     *        for the <code>Marker</code> parameter in a subsequent pagination request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @return When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use
     *         for the <code>Marker</code> parameter in a subsequent pagination request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use for the
     * <code>Marker</code> parameter in a subsequent pagination request.
     * </p>
     * 
     * @param marker
     *        When <code>IsTruncated</code> is <code>true</code>, this element is present and contains the value to use
     *        for the <code>Marker</code> parameter in a subsequent pagination request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoleTagsResult withMarker(String marker) {
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
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

        if (obj instanceof ListRoleTagsResult == false)
            return false;
        ListRoleTagsResult other = (ListRoleTagsResult) obj;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
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

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListRoleTagsResult clone() {
        try {
            return (ListRoleTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
