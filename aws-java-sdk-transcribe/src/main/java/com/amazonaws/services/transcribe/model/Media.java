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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the Amazon S3 location of the media file you want to use in your request.
 * </p>
 * <p>
 * For information on supported media formats, refer to the <a href=
 * "https://docs.aws.amazon.com/APIReference/API_StartTranscriptionJob.html#transcribe-StartTranscriptionJob-request-MediaFormat"
 * >MediaFormat</a> parameter or the <a
 * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-input.html#how-input-audio">Media formats</a> section in
 * the Amazon S3 Developer Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/Media" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Media implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location of the media file you want to transcribe. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web Services
     * Region where you're making your transcription request.
     * </p>
     */
    private String mediaFileUri;
    /**
     * <p>
     * The Amazon S3 location of the media file you want to redact. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web Services
     * Region where you're making your transcription request.
     * </p>
     * <important>
     * <p>
     * <code>RedactedMediaFileUri</code> produces a redacted audio file in addition to a redacted transcript. It is only
     * supported for Call Analytics (<code>StartCallAnalyticsJob</code>) transcription requests.
     * </p>
     * </important>
     */
    private String redactedMediaFileUri;

    /**
     * <p>
     * The Amazon S3 location of the media file you want to transcribe. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web Services
     * Region where you're making your transcription request.
     * </p>
     * 
     * @param mediaFileUri
     *        The Amazon S3 location of the media file you want to transcribe. For example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web
     *        Services Region where you're making your transcription request.
     */

    public void setMediaFileUri(String mediaFileUri) {
        this.mediaFileUri = mediaFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the media file you want to transcribe. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web Services
     * Region where you're making your transcription request.
     * </p>
     * 
     * @return The Amazon S3 location of the media file you want to transcribe. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web
     *         Services Region where you're making your transcription request.
     */

    public String getMediaFileUri() {
        return this.mediaFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the media file you want to transcribe. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web Services
     * Region where you're making your transcription request.
     * </p>
     * 
     * @param mediaFileUri
     *        The Amazon S3 location of the media file you want to transcribe. For example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web
     *        Services Region where you're making your transcription request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Media withMediaFileUri(String mediaFileUri) {
        setMediaFileUri(mediaFileUri);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the media file you want to redact. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web Services
     * Region where you're making your transcription request.
     * </p>
     * <important>
     * <p>
     * <code>RedactedMediaFileUri</code> produces a redacted audio file in addition to a redacted transcript. It is only
     * supported for Call Analytics (<code>StartCallAnalyticsJob</code>) transcription requests.
     * </p>
     * </important>
     * 
     * @param redactedMediaFileUri
     *        The Amazon S3 location of the media file you want to redact. For example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web
     *        Services Region where you're making your transcription request.
     *        </p>
     *        <important>
     *        <p>
     *        <code>RedactedMediaFileUri</code> produces a redacted audio file in addition to a redacted transcript. It
     *        is only supported for Call Analytics (<code>StartCallAnalyticsJob</code>) transcription requests.
     *        </p>
     */

    public void setRedactedMediaFileUri(String redactedMediaFileUri) {
        this.redactedMediaFileUri = redactedMediaFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the media file you want to redact. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web Services
     * Region where you're making your transcription request.
     * </p>
     * <important>
     * <p>
     * <code>RedactedMediaFileUri</code> produces a redacted audio file in addition to a redacted transcript. It is only
     * supported for Call Analytics (<code>StartCallAnalyticsJob</code>) transcription requests.
     * </p>
     * </important>
     * 
     * @return The Amazon S3 location of the media file you want to redact. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web
     *         Services Region where you're making your transcription request.
     *         </p>
     *         <important>
     *         <p>
     *         <code>RedactedMediaFileUri</code> produces a redacted audio file in addition to a redacted transcript. It
     *         is only supported for Call Analytics (<code>StartCallAnalyticsJob</code>) transcription requests.
     *         </p>
     */

    public String getRedactedMediaFileUri() {
        return this.redactedMediaFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the media file you want to redact. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web Services
     * Region where you're making your transcription request.
     * </p>
     * <important>
     * <p>
     * <code>RedactedMediaFileUri</code> produces a redacted audio file in addition to a redacted transcript. It is only
     * supported for Call Analytics (<code>StartCallAnalyticsJob</code>) transcription requests.
     * </p>
     * </important>
     * 
     * @param redactedMediaFileUri
     *        The Amazon S3 location of the media file you want to redact. For example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>s3://DOC-EXAMPLE-BUCKET/my-media-file.flac</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>s3://DOC-EXAMPLE-BUCKET/media-files/my-media-file.flac</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note that the Amazon S3 bucket that contains your input media must be located in the same Amazon Web
     *        Services Region where you're making your transcription request.
     *        </p>
     *        <important>
     *        <p>
     *        <code>RedactedMediaFileUri</code> produces a redacted audio file in addition to a redacted transcript. It
     *        is only supported for Call Analytics (<code>StartCallAnalyticsJob</code>) transcription requests.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Media withRedactedMediaFileUri(String redactedMediaFileUri) {
        setRedactedMediaFileUri(redactedMediaFileUri);
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
            sb.append("MediaFileUri: ").append(getMediaFileUri()).append(",");
        if (getRedactedMediaFileUri() != null)
            sb.append("RedactedMediaFileUri: ").append(getRedactedMediaFileUri());
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
        if (other.getRedactedMediaFileUri() == null ^ this.getRedactedMediaFileUri() == null)
            return false;
        if (other.getRedactedMediaFileUri() != null && other.getRedactedMediaFileUri().equals(this.getRedactedMediaFileUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaFileUri() == null) ? 0 : getMediaFileUri().hashCode());
        hashCode = prime * hashCode + ((getRedactedMediaFileUri() == null) ? 0 : getRedactedMediaFileUri().hashCode());
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
