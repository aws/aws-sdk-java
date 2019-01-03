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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ListImages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of image IDs for the requested repository.
     * </p>
     */
    private java.util.List<ImageIdentifier> imageIds;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListImages</code> request. When the results of a
     * <code>ListImages</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of image IDs for the requested repository.
     * </p>
     * 
     * @return The list of image IDs for the requested repository.
     */

    public java.util.List<ImageIdentifier> getImageIds() {
        return imageIds;
    }

    /**
     * <p>
     * The list of image IDs for the requested repository.
     * </p>
     * 
     * @param imageIds
     *        The list of image IDs for the requested repository.
     */

    public void setImageIds(java.util.Collection<ImageIdentifier> imageIds) {
        if (imageIds == null) {
            this.imageIds = null;
            return;
        }

        this.imageIds = new java.util.ArrayList<ImageIdentifier>(imageIds);
    }

    /**
     * <p>
     * The list of image IDs for the requested repository.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageIds(java.util.Collection)} or {@link #withImageIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param imageIds
     *        The list of image IDs for the requested repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesResult withImageIds(ImageIdentifier... imageIds) {
        if (this.imageIds == null) {
            setImageIds(new java.util.ArrayList<ImageIdentifier>(imageIds.length));
        }
        for (ImageIdentifier ele : imageIds) {
            this.imageIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of image IDs for the requested repository.
     * </p>
     * 
     * @param imageIds
     *        The list of image IDs for the requested repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesResult withImageIds(java.util.Collection<ImageIdentifier> imageIds) {
        setImageIds(imageIds);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListImages</code> request. When the results of a
     * <code>ListImages</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListImages</code> request. When the results
     *        of a <code>ListImages</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     *        the next page of results. This value is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListImages</code> request. When the results of a
     * <code>ListImages</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListImages</code> request. When the results
     *         of a <code>ListImages</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     *         the next page of results. This value is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListImages</code> request. When the results of a
     * <code>ListImages</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next page
     * of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListImages</code> request. When the results
     *        of a <code>ListImages</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     *        the next page of results. This value is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesResult withNextToken(String nextToken) {
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
        if (getImageIds() != null)
            sb.append("ImageIds: ").append(getImageIds()).append(",");
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

        if (obj instanceof ListImagesResult == false)
            return false;
        ListImagesResult other = (ListImagesResult) obj;
        if (other.getImageIds() == null ^ this.getImageIds() == null)
            return false;
        if (other.getImageIds() != null && other.getImageIds().equals(this.getImageIds()) == false)
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

        hashCode = prime * hashCode + ((getImageIds() == null) ? 0 : getImageIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListImagesResult clone() {
        try {
            return (ListImagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
