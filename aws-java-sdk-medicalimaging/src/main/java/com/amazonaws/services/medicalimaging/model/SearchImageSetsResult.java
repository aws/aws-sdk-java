/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/SearchImageSets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchImageSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The model containing the image set results.
     * </p>
     */
    private java.util.List<ImageSetsMetadataSummary> imageSetsMetadataSummaries;
    /**
     * <p>
     * The sort order for image set search results.
     * </p>
     */
    private Sort sort;
    /**
     * <p>
     * The token for pagination results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The model containing the image set results.
     * </p>
     * 
     * @return The model containing the image set results.
     */

    public java.util.List<ImageSetsMetadataSummary> getImageSetsMetadataSummaries() {
        return imageSetsMetadataSummaries;
    }

    /**
     * <p>
     * The model containing the image set results.
     * </p>
     * 
     * @param imageSetsMetadataSummaries
     *        The model containing the image set results.
     */

    public void setImageSetsMetadataSummaries(java.util.Collection<ImageSetsMetadataSummary> imageSetsMetadataSummaries) {
        if (imageSetsMetadataSummaries == null) {
            this.imageSetsMetadataSummaries = null;
            return;
        }

        this.imageSetsMetadataSummaries = new java.util.ArrayList<ImageSetsMetadataSummary>(imageSetsMetadataSummaries);
    }

    /**
     * <p>
     * The model containing the image set results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageSetsMetadataSummaries(java.util.Collection)} or
     * {@link #withImageSetsMetadataSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param imageSetsMetadataSummaries
     *        The model containing the image set results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchImageSetsResult withImageSetsMetadataSummaries(ImageSetsMetadataSummary... imageSetsMetadataSummaries) {
        if (this.imageSetsMetadataSummaries == null) {
            setImageSetsMetadataSummaries(new java.util.ArrayList<ImageSetsMetadataSummary>(imageSetsMetadataSummaries.length));
        }
        for (ImageSetsMetadataSummary ele : imageSetsMetadataSummaries) {
            this.imageSetsMetadataSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The model containing the image set results.
     * </p>
     * 
     * @param imageSetsMetadataSummaries
     *        The model containing the image set results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchImageSetsResult withImageSetsMetadataSummaries(java.util.Collection<ImageSetsMetadataSummary> imageSetsMetadataSummaries) {
        setImageSetsMetadataSummaries(imageSetsMetadataSummaries);
        return this;
    }

    /**
     * <p>
     * The sort order for image set search results.
     * </p>
     * 
     * @param sort
     *        The sort order for image set search results.
     */

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * The sort order for image set search results.
     * </p>
     * 
     * @return The sort order for image set search results.
     */

    public Sort getSort() {
        return this.sort;
    }

    /**
     * <p>
     * The sort order for image set search results.
     * </p>
     * 
     * @param sort
     *        The sort order for image set search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchImageSetsResult withSort(Sort sort) {
        setSort(sort);
        return this;
    }

    /**
     * <p>
     * The token for pagination results.
     * </p>
     * 
     * @param nextToken
     *        The token for pagination results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for pagination results.
     * </p>
     * 
     * @return The token for pagination results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for pagination results.
     * </p>
     * 
     * @param nextToken
     *        The token for pagination results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchImageSetsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getImageSetsMetadataSummaries() != null)
            sb.append("ImageSetsMetadataSummaries: ").append(getImageSetsMetadataSummaries()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchImageSetsResult == false)
            return false;
        SearchImageSetsResult other = (SearchImageSetsResult) obj;
        if (other.getImageSetsMetadataSummaries() == null ^ this.getImageSetsMetadataSummaries() == null)
            return false;
        if (other.getImageSetsMetadataSummaries() != null && other.getImageSetsMetadataSummaries().equals(this.getImageSetsMetadataSummaries()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageSetsMetadataSummaries() == null) ? 0 : getImageSetsMetadataSummaries().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public SearchImageSetsResult clone() {
        try {
            return (SearchImageSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
