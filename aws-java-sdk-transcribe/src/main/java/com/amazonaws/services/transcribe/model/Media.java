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
     * The S3 location of the input media file. The URI must be in the same region as the API endpoint that you are
     * calling. The general form is:
     * </p>
     * <p>
     * <code> https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-east-1.amazonaws.com/examplebucket/example.mp4</code>
     * </p>
     * <p>
     * <code>https://s3-us-east-1.amazonaws.com/examplebucket/mediadocs/example.mp4</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     */
    private String mediaFileUri;

    /**
     * <p>
     * The S3 location of the input media file. The URI must be in the same region as the API endpoint that you are
     * calling. The general form is:
     * </p>
     * <p>
     * <code> https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-east-1.amazonaws.com/examplebucket/example.mp4</code>
     * </p>
     * <p>
     * <code>https://s3-us-east-1.amazonaws.com/examplebucket/mediadocs/example.mp4</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * 
     * @param mediaFileUri
     *        The S3 location of the input media file. The URI must be in the same region as the API endpoint that you
     *        are calling. The general form is:</p>
     *        <p>
     *        <code> https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        <code>https://s3-us-east-1.amazonaws.com/examplebucket/example.mp4</code>
     *        </p>
     *        <p>
     *        <code>https://s3-us-east-1.amazonaws.com/examplebucket/mediadocs/example.mp4</code>
     *        </p>
     *        <p>
     *        For more information about S3 object names, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in
     *        the <i>Amazon S3 Developer Guide</i>.
     */

    public void setMediaFileUri(String mediaFileUri) {
        this.mediaFileUri = mediaFileUri;
    }

    /**
     * <p>
     * The S3 location of the input media file. The URI must be in the same region as the API endpoint that you are
     * calling. The general form is:
     * </p>
     * <p>
     * <code> https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-east-1.amazonaws.com/examplebucket/example.mp4</code>
     * </p>
     * <p>
     * <code>https://s3-us-east-1.amazonaws.com/examplebucket/mediadocs/example.mp4</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * 
     * @return The S3 location of the input media file. The URI must be in the same region as the API endpoint that you
     *         are calling. The general form is:</p>
     *         <p>
     *         <code> https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <p>
     *         <code>https://s3-us-east-1.amazonaws.com/examplebucket/example.mp4</code>
     *         </p>
     *         <p>
     *         <code>https://s3-us-east-1.amazonaws.com/examplebucket/mediadocs/example.mp4</code>
     *         </p>
     *         <p>
     *         For more information about S3 object names, see <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in
     *         the <i>Amazon S3 Developer Guide</i>.
     */

    public String getMediaFileUri() {
        return this.mediaFileUri;
    }

    /**
     * <p>
     * The S3 location of the input media file. The URI must be in the same region as the API endpoint that you are
     * calling. The general form is:
     * </p>
     * <p>
     * <code> https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-east-1.amazonaws.com/examplebucket/example.mp4</code>
     * </p>
     * <p>
     * <code>https://s3-us-east-1.amazonaws.com/examplebucket/mediadocs/example.mp4</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * 
     * @param mediaFileUri
     *        The S3 location of the input media file. The URI must be in the same region as the API endpoint that you
     *        are calling. The general form is:</p>
     *        <p>
     *        <code> https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        <code>https://s3-us-east-1.amazonaws.com/examplebucket/example.mp4</code>
     *        </p>
     *        <p>
     *        <code>https://s3-us-east-1.amazonaws.com/examplebucket/mediadocs/example.mp4</code>
     *        </p>
     *        <p>
     *        For more information about S3 object names, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in
     *        the <i>Amazon S3 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Media withMediaFileUri(String mediaFileUri) {
        setMediaFileUri(mediaFileUri);
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
