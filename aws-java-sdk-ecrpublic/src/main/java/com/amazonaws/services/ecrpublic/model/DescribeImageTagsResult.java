/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecrpublic.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-public-2020-10-30/DescribeImageTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImageTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The image tag details for the images in the requested repository.
     * </p>
     */
    private java.util.List<ImageTagDetail> imageTagDetails;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeImageTags</code> request. When the results
     * of a <code>DescribeImageTags</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     * the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The image tag details for the images in the requested repository.
     * </p>
     * 
     * @return The image tag details for the images in the requested repository.
     */

    public java.util.List<ImageTagDetail> getImageTagDetails() {
        return imageTagDetails;
    }

    /**
     * <p>
     * The image tag details for the images in the requested repository.
     * </p>
     * 
     * @param imageTagDetails
     *        The image tag details for the images in the requested repository.
     */

    public void setImageTagDetails(java.util.Collection<ImageTagDetail> imageTagDetails) {
        if (imageTagDetails == null) {
            this.imageTagDetails = null;
            return;
        }

        this.imageTagDetails = new java.util.ArrayList<ImageTagDetail>(imageTagDetails);
    }

    /**
     * <p>
     * The image tag details for the images in the requested repository.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageTagDetails(java.util.Collection)} or {@link #withImageTagDetails(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param imageTagDetails
     *        The image tag details for the images in the requested repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageTagsResult withImageTagDetails(ImageTagDetail... imageTagDetails) {
        if (this.imageTagDetails == null) {
            setImageTagDetails(new java.util.ArrayList<ImageTagDetail>(imageTagDetails.length));
        }
        for (ImageTagDetail ele : imageTagDetails) {
            this.imageTagDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The image tag details for the images in the requested repository.
     * </p>
     * 
     * @param imageTagDetails
     *        The image tag details for the images in the requested repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageTagsResult withImageTagDetails(java.util.Collection<ImageTagDetail> imageTagDetails) {
        setImageTagDetails(imageTagDetails);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeImageTags</code> request. When the results
     * of a <code>DescribeImageTags</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     * the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeImageTags</code> request. When the
     *        results of a <code>DescribeImageTags</code> request exceed <code>maxResults</code>, this value can be used
     *        to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeImageTags</code> request. When the results
     * of a <code>DescribeImageTags</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     * the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>DescribeImageTags</code> request. When the
     *         results of a <code>DescribeImageTags</code> request exceed <code>maxResults</code>, this value can be
     *         used to retrieve the next page of results. This value is <code>null</code> when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>DescribeImageTags</code> request. When the results
     * of a <code>DescribeImageTags</code> request exceed <code>maxResults</code>, this value can be used to retrieve
     * the next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>DescribeImageTags</code> request. When the
     *        results of a <code>DescribeImageTags</code> request exceed <code>maxResults</code>, this value can be used
     *        to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageTagsResult withNextToken(String nextToken) {
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
        if (getImageTagDetails() != null)
            sb.append("ImageTagDetails: ").append(getImageTagDetails()).append(",");
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

        if (obj instanceof DescribeImageTagsResult == false)
            return false;
        DescribeImageTagsResult other = (DescribeImageTagsResult) obj;
        if (other.getImageTagDetails() == null ^ this.getImageTagDetails() == null)
            return false;
        if (other.getImageTagDetails() != null && other.getImageTagDetails().equals(this.getImageTagDetails()) == false)
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

        hashCode = prime * hashCode + ((getImageTagDetails() == null) ? 0 : getImageTagDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImageTagsResult clone() {
        try {
            return (DescribeImageTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
