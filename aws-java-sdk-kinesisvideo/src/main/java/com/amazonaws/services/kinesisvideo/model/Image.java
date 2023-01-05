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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the <code>Timestamp</code>, <code>Error</code>, and <code>ImageContent</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-archived-media-2017-09-30/Image" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Image implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An attribute of the <code>Image</code> object that is used to extract an image from the video stream. This field
     * is used to manage gaps on images or to better understand the pagination window.
     * </p>
     */
    private java.util.Date timeStamp;
    /**
     * <p>
     * The error message shown when the image for the provided timestamp was not extracted due to a non-tryable error.
     * An error will be returned if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no media that exists for the specified <code>Timestamp</code>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * The media for the specified time does not allow an image to be extracted. In this case the media is audio only,
     * or the incorrect media has been ingested.
     * </p>
     * </li>
     * </ul>
     */
    private String error;
    /**
     * <p>
     * An attribute of the <code>Image</code> object that is Base64 encoded.
     * </p>
     */
    private String imageContent;

    /**
     * <p>
     * An attribute of the <code>Image</code> object that is used to extract an image from the video stream. This field
     * is used to manage gaps on images or to better understand the pagination window.
     * </p>
     * 
     * @param timeStamp
     *        An attribute of the <code>Image</code> object that is used to extract an image from the video stream. This
     *        field is used to manage gaps on images or to better understand the pagination window.
     */

    public void setTimeStamp(java.util.Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * <p>
     * An attribute of the <code>Image</code> object that is used to extract an image from the video stream. This field
     * is used to manage gaps on images or to better understand the pagination window.
     * </p>
     * 
     * @return An attribute of the <code>Image</code> object that is used to extract an image from the video stream.
     *         This field is used to manage gaps on images or to better understand the pagination window.
     */

    public java.util.Date getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * <p>
     * An attribute of the <code>Image</code> object that is used to extract an image from the video stream. This field
     * is used to manage gaps on images or to better understand the pagination window.
     * </p>
     * 
     * @param timeStamp
     *        An attribute of the <code>Image</code> object that is used to extract an image from the video stream. This
     *        field is used to manage gaps on images or to better understand the pagination window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withTimeStamp(java.util.Date timeStamp) {
        setTimeStamp(timeStamp);
        return this;
    }

    /**
     * <p>
     * The error message shown when the image for the provided timestamp was not extracted due to a non-tryable error.
     * An error will be returned if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no media that exists for the specified <code>Timestamp</code>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * The media for the specified time does not allow an image to be extracted. In this case the media is audio only,
     * or the incorrect media has been ingested.
     * </p>
     * </li>
     * </ul>
     * 
     * @param error
     *        The error message shown when the image for the provided timestamp was not extracted due to a non-tryable
     *        error. An error will be returned if: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        There is no media that exists for the specified <code>Timestamp</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        The media for the specified time does not allow an image to be extracted. In this case the media is audio
     *        only, or the incorrect media has been ingested.
     *        </p>
     *        </li>
     * @see ImageError
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * The error message shown when the image for the provided timestamp was not extracted due to a non-tryable error.
     * An error will be returned if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no media that exists for the specified <code>Timestamp</code>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * The media for the specified time does not allow an image to be extracted. In this case the media is audio only,
     * or the incorrect media has been ingested.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The error message shown when the image for the provided timestamp was not extracted due to a non-tryable
     *         error. An error will be returned if: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         There is no media that exists for the specified <code>Timestamp</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         The media for the specified time does not allow an image to be extracted. In this case the media is audio
     *         only, or the incorrect media has been ingested.
     *         </p>
     *         </li>
     * @see ImageError
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * The error message shown when the image for the provided timestamp was not extracted due to a non-tryable error.
     * An error will be returned if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no media that exists for the specified <code>Timestamp</code>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * The media for the specified time does not allow an image to be extracted. In this case the media is audio only,
     * or the incorrect media has been ingested.
     * </p>
     * </li>
     * </ul>
     * 
     * @param error
     *        The error message shown when the image for the provided timestamp was not extracted due to a non-tryable
     *        error. An error will be returned if: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        There is no media that exists for the specified <code>Timestamp</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        The media for the specified time does not allow an image to be extracted. In this case the media is audio
     *        only, or the incorrect media has been ingested.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageError
     */

    public Image withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The error message shown when the image for the provided timestamp was not extracted due to a non-tryable error.
     * An error will be returned if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no media that exists for the specified <code>Timestamp</code>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * The media for the specified time does not allow an image to be extracted. In this case the media is audio only,
     * or the incorrect media has been ingested.
     * </p>
     * </li>
     * </ul>
     * 
     * @param error
     *        The error message shown when the image for the provided timestamp was not extracted due to a non-tryable
     *        error. An error will be returned if: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        There is no media that exists for the specified <code>Timestamp</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        The media for the specified time does not allow an image to be extracted. In this case the media is audio
     *        only, or the incorrect media has been ingested.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageError
     */

    public Image withError(ImageError error) {
        this.error = error.toString();
        return this;
    }

    /**
     * <p>
     * An attribute of the <code>Image</code> object that is Base64 encoded.
     * </p>
     * 
     * @param imageContent
     *        An attribute of the <code>Image</code> object that is Base64 encoded.
     */

    public void setImageContent(String imageContent) {
        this.imageContent = imageContent;
    }

    /**
     * <p>
     * An attribute of the <code>Image</code> object that is Base64 encoded.
     * </p>
     * 
     * @return An attribute of the <code>Image</code> object that is Base64 encoded.
     */

    public String getImageContent() {
        return this.imageContent;
    }

    /**
     * <p>
     * An attribute of the <code>Image</code> object that is Base64 encoded.
     * </p>
     * 
     * @param imageContent
     *        An attribute of the <code>Image</code> object that is Base64 encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withImageContent(String imageContent) {
        setImageContent(imageContent);
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
        if (getTimeStamp() != null)
            sb.append("TimeStamp: ").append(getTimeStamp()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getImageContent() != null)
            sb.append("ImageContent: ").append(getImageContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Image == false)
            return false;
        Image other = (Image) obj;
        if (other.getTimeStamp() == null ^ this.getTimeStamp() == null)
            return false;
        if (other.getTimeStamp() != null && other.getTimeStamp().equals(this.getTimeStamp()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getImageContent() == null ^ this.getImageContent() == null)
            return false;
        if (other.getImageContent() != null && other.getImageContent().equals(this.getImageContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeStamp() == null) ? 0 : getTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getImageContent() == null) ? 0 : getImageContent().hashCode());
        return hashCode;
    }

    @Override
    public Image clone() {
        try {
            return (Image) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.ImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
