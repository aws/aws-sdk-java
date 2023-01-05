/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFastLaunchImagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of details about the fast-launch enabled Windows images that meet the requested criteria.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DescribeFastLaunchImagesSuccessItem> fastLaunchImages;
    /**
     * <p>
     * The token to use for the next set of results. This value is null when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A collection of details about the fast-launch enabled Windows images that meet the requested criteria.
     * </p>
     * 
     * @return A collection of details about the fast-launch enabled Windows images that meet the requested criteria.
     */

    public java.util.List<DescribeFastLaunchImagesSuccessItem> getFastLaunchImages() {
        if (fastLaunchImages == null) {
            fastLaunchImages = new com.amazonaws.internal.SdkInternalList<DescribeFastLaunchImagesSuccessItem>();
        }
        return fastLaunchImages;
    }

    /**
     * <p>
     * A collection of details about the fast-launch enabled Windows images that meet the requested criteria.
     * </p>
     * 
     * @param fastLaunchImages
     *        A collection of details about the fast-launch enabled Windows images that meet the requested criteria.
     */

    public void setFastLaunchImages(java.util.Collection<DescribeFastLaunchImagesSuccessItem> fastLaunchImages) {
        if (fastLaunchImages == null) {
            this.fastLaunchImages = null;
            return;
        }

        this.fastLaunchImages = new com.amazonaws.internal.SdkInternalList<DescribeFastLaunchImagesSuccessItem>(fastLaunchImages);
    }

    /**
     * <p>
     * A collection of details about the fast-launch enabled Windows images that meet the requested criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFastLaunchImages(java.util.Collection)} or {@link #withFastLaunchImages(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param fastLaunchImages
     *        A collection of details about the fast-launch enabled Windows images that meet the requested criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastLaunchImagesResult withFastLaunchImages(DescribeFastLaunchImagesSuccessItem... fastLaunchImages) {
        if (this.fastLaunchImages == null) {
            setFastLaunchImages(new com.amazonaws.internal.SdkInternalList<DescribeFastLaunchImagesSuccessItem>(fastLaunchImages.length));
        }
        for (DescribeFastLaunchImagesSuccessItem ele : fastLaunchImages) {
            this.fastLaunchImages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of details about the fast-launch enabled Windows images that meet the requested criteria.
     * </p>
     * 
     * @param fastLaunchImages
     *        A collection of details about the fast-launch enabled Windows images that meet the requested criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastLaunchImagesResult withFastLaunchImages(java.util.Collection<DescribeFastLaunchImagesSuccessItem> fastLaunchImages) {
        setFastLaunchImages(fastLaunchImages);
        return this;
    }

    /**
     * <p>
     * The token to use for the next set of results. This value is null when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use for the next set of results. This value is null when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use for the next set of results. This value is null when there are no more results to return.
     * </p>
     * 
     * @return The token to use for the next set of results. This value is null when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use for the next set of results. This value is null when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use for the next set of results. This value is null when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastLaunchImagesResult withNextToken(String nextToken) {
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
        if (getFastLaunchImages() != null)
            sb.append("FastLaunchImages: ").append(getFastLaunchImages()).append(",");
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

        if (obj instanceof DescribeFastLaunchImagesResult == false)
            return false;
        DescribeFastLaunchImagesResult other = (DescribeFastLaunchImagesResult) obj;
        if (other.getFastLaunchImages() == null ^ this.getFastLaunchImages() == null)
            return false;
        if (other.getFastLaunchImages() != null && other.getFastLaunchImages().equals(this.getFastLaunchImages()) == false)
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

        hashCode = prime * hashCode + ((getFastLaunchImages() == null) ? 0 : getFastLaunchImages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFastLaunchImagesResult clone() {
        try {
            return (DescribeFastLaunchImagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
