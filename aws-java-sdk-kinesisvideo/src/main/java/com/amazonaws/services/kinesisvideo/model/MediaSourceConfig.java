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
 * The configuration details that consist of the credentials required (<code>MediaUriSecretArn</code> and
 * <code>MediaUriType</code>) to access the media files that are streamed to the camera.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/MediaSourceConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaSourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Secrets Manager ARN for the username and password of the camera, or a local media file location.
     * </p>
     */
    private String mediaUriSecretArn;
    /**
     * <p>
     * The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code> value can be used to stream local media
     * files.
     * </p>
     * <note>
     * <p>
     * Preview only supports the <code>RTSP_URI</code> media source URI format .
     * </p>
     * </note>
     */
    private String mediaUriType;

    /**
     * <p>
     * The AWS Secrets Manager ARN for the username and password of the camera, or a local media file location.
     * </p>
     * 
     * @param mediaUriSecretArn
     *        The AWS Secrets Manager ARN for the username and password of the camera, or a local media file location.
     */

    public void setMediaUriSecretArn(String mediaUriSecretArn) {
        this.mediaUriSecretArn = mediaUriSecretArn;
    }

    /**
     * <p>
     * The AWS Secrets Manager ARN for the username and password of the camera, or a local media file location.
     * </p>
     * 
     * @return The AWS Secrets Manager ARN for the username and password of the camera, or a local media file location.
     */

    public String getMediaUriSecretArn() {
        return this.mediaUriSecretArn;
    }

    /**
     * <p>
     * The AWS Secrets Manager ARN for the username and password of the camera, or a local media file location.
     * </p>
     * 
     * @param mediaUriSecretArn
     *        The AWS Secrets Manager ARN for the username and password of the camera, or a local media file location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaSourceConfig withMediaUriSecretArn(String mediaUriSecretArn) {
        setMediaUriSecretArn(mediaUriSecretArn);
        return this;
    }

    /**
     * <p>
     * The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code> value can be used to stream local media
     * files.
     * </p>
     * <note>
     * <p>
     * Preview only supports the <code>RTSP_URI</code> media source URI format .
     * </p>
     * </note>
     * 
     * @param mediaUriType
     *        The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code> value can be used to stream local
     *        media files.</p> <note>
     *        <p>
     *        Preview only supports the <code>RTSP_URI</code> media source URI format .
     *        </p>
     * @see MediaUriType
     */

    public void setMediaUriType(String mediaUriType) {
        this.mediaUriType = mediaUriType;
    }

    /**
     * <p>
     * The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code> value can be used to stream local media
     * files.
     * </p>
     * <note>
     * <p>
     * Preview only supports the <code>RTSP_URI</code> media source URI format .
     * </p>
     * </note>
     * 
     * @return The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code> value can be used to stream local
     *         media files.</p> <note>
     *         <p>
     *         Preview only supports the <code>RTSP_URI</code> media source URI format .
     *         </p>
     * @see MediaUriType
     */

    public String getMediaUriType() {
        return this.mediaUriType;
    }

    /**
     * <p>
     * The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code> value can be used to stream local media
     * files.
     * </p>
     * <note>
     * <p>
     * Preview only supports the <code>RTSP_URI</code> media source URI format .
     * </p>
     * </note>
     * 
     * @param mediaUriType
     *        The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code> value can be used to stream local
     *        media files.</p> <note>
     *        <p>
     *        Preview only supports the <code>RTSP_URI</code> media source URI format .
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaUriType
     */

    public MediaSourceConfig withMediaUriType(String mediaUriType) {
        setMediaUriType(mediaUriType);
        return this;
    }

    /**
     * <p>
     * The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code> value can be used to stream local media
     * files.
     * </p>
     * <note>
     * <p>
     * Preview only supports the <code>RTSP_URI</code> media source URI format .
     * </p>
     * </note>
     * 
     * @param mediaUriType
     *        The Uniform Resource Identifier (URI) type. The <code>FILE_URI</code> value can be used to stream local
     *        media files.</p> <note>
     *        <p>
     *        Preview only supports the <code>RTSP_URI</code> media source URI format .
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaUriType
     */

    public MediaSourceConfig withMediaUriType(MediaUriType mediaUriType) {
        this.mediaUriType = mediaUriType.toString();
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
        if (getMediaUriSecretArn() != null)
            sb.append("MediaUriSecretArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getMediaUriType() != null)
            sb.append("MediaUriType: ").append(getMediaUriType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaSourceConfig == false)
            return false;
        MediaSourceConfig other = (MediaSourceConfig) obj;
        if (other.getMediaUriSecretArn() == null ^ this.getMediaUriSecretArn() == null)
            return false;
        if (other.getMediaUriSecretArn() != null && other.getMediaUriSecretArn().equals(this.getMediaUriSecretArn()) == false)
            return false;
        if (other.getMediaUriType() == null ^ this.getMediaUriType() == null)
            return false;
        if (other.getMediaUriType() != null && other.getMediaUriType().equals(this.getMediaUriType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaUriSecretArn() == null) ? 0 : getMediaUriSecretArn().hashCode());
        hashCode = prime * hashCode + ((getMediaUriType() == null) ? 0 : getMediaUriType().hashCode());
        return hashCode;
    }

    @Override
    public MediaSourceConfig clone() {
        try {
            return (MediaSourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.MediaSourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
