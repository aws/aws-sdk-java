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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/GetImages"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of images generated from the video stream. If there is no media available for the given timestamp, the
     * <code>NO_MEDIA</code> error will be listed in the output. If an error occurs while the image is being generated,
     * the <code>MEDIA_ERROR</code> will be listed in the output as the cause of the missing image.
     * </p>
     */
    private java.util.List<Image> images;
    /**
     * <p>
     * The encrypted token that was used in the request to get more images.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of images generated from the video stream. If there is no media available for the given timestamp, the
     * <code>NO_MEDIA</code> error will be listed in the output. If an error occurs while the image is being generated,
     * the <code>MEDIA_ERROR</code> will be listed in the output as the cause of the missing image.
     * </p>
     * 
     * @return The list of images generated from the video stream. If there is no media available for the given
     *         timestamp, the <code>NO_MEDIA</code> error will be listed in the output. If an error occurs while the
     *         image is being generated, the <code>MEDIA_ERROR</code> will be listed in the output as the cause of the
     *         missing image.
     */

    public java.util.List<Image> getImages() {
        return images;
    }

    /**
     * <p>
     * The list of images generated from the video stream. If there is no media available for the given timestamp, the
     * <code>NO_MEDIA</code> error will be listed in the output. If an error occurs while the image is being generated,
     * the <code>MEDIA_ERROR</code> will be listed in the output as the cause of the missing image.
     * </p>
     * 
     * @param images
     *        The list of images generated from the video stream. If there is no media available for the given
     *        timestamp, the <code>NO_MEDIA</code> error will be listed in the output. If an error occurs while the
     *        image is being generated, the <code>MEDIA_ERROR</code> will be listed in the output as the cause of the
     *        missing image.
     */

    public void setImages(java.util.Collection<Image> images) {
        if (images == null) {
            this.images = null;
            return;
        }

        this.images = new java.util.ArrayList<Image>(images);
    }

    /**
     * <p>
     * The list of images generated from the video stream. If there is no media available for the given timestamp, the
     * <code>NO_MEDIA</code> error will be listed in the output. If an error occurs while the image is being generated,
     * the <code>MEDIA_ERROR</code> will be listed in the output as the cause of the missing image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImages(java.util.Collection)} or {@link #withImages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param images
     *        The list of images generated from the video stream. If there is no media available for the given
     *        timestamp, the <code>NO_MEDIA</code> error will be listed in the output. If an error occurs while the
     *        image is being generated, the <code>MEDIA_ERROR</code> will be listed in the output as the cause of the
     *        missing image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImagesResult withImages(Image... images) {
        if (this.images == null) {
            setImages(new java.util.ArrayList<Image>(images.length));
        }
        for (Image ele : images) {
            this.images.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of images generated from the video stream. If there is no media available for the given timestamp, the
     * <code>NO_MEDIA</code> error will be listed in the output. If an error occurs while the image is being generated,
     * the <code>MEDIA_ERROR</code> will be listed in the output as the cause of the missing image.
     * </p>
     * 
     * @param images
     *        The list of images generated from the video stream. If there is no media available for the given
     *        timestamp, the <code>NO_MEDIA</code> error will be listed in the output. If an error occurs while the
     *        image is being generated, the <code>MEDIA_ERROR</code> will be listed in the output as the cause of the
     *        missing image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImagesResult withImages(java.util.Collection<Image> images) {
        setImages(images);
        return this;
    }

    /**
     * <p>
     * The encrypted token that was used in the request to get more images.
     * </p>
     * 
     * @param nextToken
     *        The encrypted token that was used in the request to get more images.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The encrypted token that was used in the request to get more images.
     * </p>
     * 
     * @return The encrypted token that was used in the request to get more images.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The encrypted token that was used in the request to get more images.
     * </p>
     * 
     * @param nextToken
     *        The encrypted token that was used in the request to get more images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetImagesResult withNextToken(String nextToken) {
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
        if (getImages() != null)
            sb.append("Images: ").append(getImages()).append(",");
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

        if (obj instanceof GetImagesResult == false)
            return false;
        GetImagesResult other = (GetImagesResult) obj;
        if (other.getImages() == null ^ this.getImages() == null)
            return false;
        if (other.getImages() != null && other.getImages().equals(this.getImages()) == false)
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

        hashCode = prime * hashCode + ((getImages() == null) ? 0 : getImages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetImagesResult clone() {
        try {
            return (GetImagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
