/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the input media file in a transcription request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/Media" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Media implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 location of the input media file. The general form is:
     * </p>
     * <p>
     * <code> https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/example.mp4</code>
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/mediadocs/example.mp4</code>
     * </p>
     */
    private String mediaFileUri;

    /**
     * <p>
     * The S3 location of the input media file. The general form is:
     * </p>
     * <p>
     * <code> https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/example.mp4</code>
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/mediadocs/example.mp4</code>
     * </p>
     * 
     * @param mediaFileUri
     *        The S3 location of the input media file. The general form is:</p>
     *        <p>
     *        <code> https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        <code>https://s3-us-west-2.amazonaws.com/examplebucket/example.mp4</code>
     *        </p>
     *        <p>
     *        <code>https://s3-us-west-2.amazonaws.com/examplebucket/mediadocs/example.mp4</code>
     */

    public void setMediaFileUri(String mediaFileUri) {
        this.mediaFileUri = mediaFileUri;
    }

    /**
     * <p>
     * The S3 location of the input media file. The general form is:
     * </p>
     * <p>
     * <code> https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/example.mp4</code>
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/mediadocs/example.mp4</code>
     * </p>
     * 
     * @return The S3 location of the input media file. The general form is:</p>
     *         <p>
     *         <code> https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <p>
     *         <code>https://s3-us-west-2.amazonaws.com/examplebucket/example.mp4</code>
     *         </p>
     *         <p>
     *         <code>https://s3-us-west-2.amazonaws.com/examplebucket/mediadocs/example.mp4</code>
     */

    public String getMediaFileUri() {
        return this.mediaFileUri;
    }

    /**
     * <p>
     * The S3 location of the input media file. The general form is:
     * </p>
     * <p>
     * <code> https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/example.mp4</code>
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/mediadocs/example.mp4</code>
     * </p>
     * 
     * @param mediaFileUri
     *        The S3 location of the input media file. The general form is:</p>
     *        <p>
     *        <code> https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        <code>https://s3-us-west-2.amazonaws.com/examplebucket/example.mp4</code>
     *        </p>
     *        <p>
     *        <code>https://s3-us-west-2.amazonaws.com/examplebucket/mediadocs/example.mp4</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Media withMediaFileUri(String mediaFileUri) {
        setMediaFileUri(mediaFileUri);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMediaFileUri() != null)
            sb.append("MediaFileUri: ").append(getMediaFileUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Media == false)
            return false;
        Media other = (Media) obj;
        if (other.getMediaFileUri() == null ^ this.getMediaFileUri() == null)
            return false;
        if (other.getMediaFileUri() != null && other.getMediaFileUri().equals(this.getMediaFileUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaFileUri() == null) ? 0 : getMediaFileUri().hashCode());
        return hashCode;
    }

    @Override
    public Media clone() {
        try {
            return (Media) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.MediaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
