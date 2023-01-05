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
 * Provides you with the Amazon S3 URI you can use to access your transcript.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/Transcript" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Transcript implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location of your transcript. You can use this URI to access or download your transcript.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that bucket.
     * If you also included <code>OutputKey</code> in your request, your output is located in the path you specified in
     * your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription job request, your transcript is stored
     * in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary URI you can use for
     * secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     * <code>AccesDenied</code> error, you can get a new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     */
    private String transcriptFileUri;
    /**
     * <p>
     * The Amazon S3 location of your redacted transcript. You can use this URI to access or download your transcript.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that bucket.
     * If you also included <code>OutputKey</code> in your request, your output is located in the path you specified in
     * your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription job request, your transcript is stored
     * in a service-managed bucket, and <code>RedactedTranscriptFileUri</code> provides you with a temporary URI you can
     * use for secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     * <code>AccesDenied</code> error, you can get a new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     */
    private String redactedTranscriptFileUri;

    /**
     * <p>
     * The Amazon S3 location of your transcript. You can use this URI to access or download your transcript.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that bucket.
     * If you also included <code>OutputKey</code> in your request, your output is located in the path you specified in
     * your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription job request, your transcript is stored
     * in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary URI you can use for
     * secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     * <code>AccesDenied</code> error, you can get a new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * 
     * @param transcriptFileUri
     *        The Amazon S3 location of your transcript. You can use this URI to access or download your transcript.</p>
     *        <p>
     *        If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that
     *        bucket. If you also included <code>OutputKey</code> in your request, your output is located in the path
     *        you specified in your request.
     *        </p>
     *        <p>
     *        If you didn't include <code>OutputBucketName</code> in your transcription job request, your transcript is
     *        stored in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary URI
     *        you can use for secure access to your transcript.
     *        </p>
     *        <note>
     *        <p>
     *        Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     *        <code>AccesDenied</code> error, you can get a new temporary URI by running a
     *        <code>GetTranscriptionJob</code> or <code>ListTranscriptionJob</code> request.
     *        </p>
     */

    public void setTranscriptFileUri(String transcriptFileUri) {
        this.transcriptFileUri = transcriptFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of your transcript. You can use this URI to access or download your transcript.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that bucket.
     * If you also included <code>OutputKey</code> in your request, your output is located in the path you specified in
     * your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription job request, your transcript is stored
     * in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary URI you can use for
     * secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     * <code>AccesDenied</code> error, you can get a new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * 
     * @return The Amazon S3 location of your transcript. You can use this URI to access or download your
     *         transcript.</p>
     *         <p>
     *         If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that
     *         bucket. If you also included <code>OutputKey</code> in your request, your output is located in the path
     *         you specified in your request.
     *         </p>
     *         <p>
     *         If you didn't include <code>OutputBucketName</code> in your transcription job request, your transcript is
     *         stored in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary URI
     *         you can use for secure access to your transcript.
     *         </p>
     *         <note>
     *         <p>
     *         Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     *         <code>AccesDenied</code> error, you can get a new temporary URI by running a
     *         <code>GetTranscriptionJob</code> or <code>ListTranscriptionJob</code> request.
     *         </p>
     */

    public String getTranscriptFileUri() {
        return this.transcriptFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of your transcript. You can use this URI to access or download your transcript.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that bucket.
     * If you also included <code>OutputKey</code> in your request, your output is located in the path you specified in
     * your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription job request, your transcript is stored
     * in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary URI you can use for
     * secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     * <code>AccesDenied</code> error, you can get a new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * 
     * @param transcriptFileUri
     *        The Amazon S3 location of your transcript. You can use this URI to access or download your transcript.</p>
     *        <p>
     *        If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that
     *        bucket. If you also included <code>OutputKey</code> in your request, your output is located in the path
     *        you specified in your request.
     *        </p>
     *        <p>
     *        If you didn't include <code>OutputBucketName</code> in your transcription job request, your transcript is
     *        stored in a service-managed bucket, and <code>TranscriptFileUri</code> provides you with a temporary URI
     *        you can use for secure access to your transcript.
     *        </p>
     *        <note>
     *        <p>
     *        Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     *        <code>AccesDenied</code> error, you can get a new temporary URI by running a
     *        <code>GetTranscriptionJob</code> or <code>ListTranscriptionJob</code> request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transcript withTranscriptFileUri(String transcriptFileUri) {
        setTranscriptFileUri(transcriptFileUri);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of your redacted transcript. You can use this URI to access or download your transcript.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that bucket.
     * If you also included <code>OutputKey</code> in your request, your output is located in the path you specified in
     * your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription job request, your transcript is stored
     * in a service-managed bucket, and <code>RedactedTranscriptFileUri</code> provides you with a temporary URI you can
     * use for secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     * <code>AccesDenied</code> error, you can get a new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * 
     * @param redactedTranscriptFileUri
     *        The Amazon S3 location of your redacted transcript. You can use this URI to access or download your
     *        transcript.</p>
     *        <p>
     *        If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that
     *        bucket. If you also included <code>OutputKey</code> in your request, your output is located in the path
     *        you specified in your request.
     *        </p>
     *        <p>
     *        If you didn't include <code>OutputBucketName</code> in your transcription job request, your transcript is
     *        stored in a service-managed bucket, and <code>RedactedTranscriptFileUri</code> provides you with a
     *        temporary URI you can use for secure access to your transcript.
     *        </p>
     *        <note>
     *        <p>
     *        Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     *        <code>AccesDenied</code> error, you can get a new temporary URI by running a
     *        <code>GetTranscriptionJob</code> or <code>ListTranscriptionJob</code> request.
     *        </p>
     */

    public void setRedactedTranscriptFileUri(String redactedTranscriptFileUri) {
        this.redactedTranscriptFileUri = redactedTranscriptFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of your redacted transcript. You can use this URI to access or download your transcript.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that bucket.
     * If you also included <code>OutputKey</code> in your request, your output is located in the path you specified in
     * your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription job request, your transcript is stored
     * in a service-managed bucket, and <code>RedactedTranscriptFileUri</code> provides you with a temporary URI you can
     * use for secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     * <code>AccesDenied</code> error, you can get a new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * 
     * @return The Amazon S3 location of your redacted transcript. You can use this URI to access or download your
     *         transcript.</p>
     *         <p>
     *         If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that
     *         bucket. If you also included <code>OutputKey</code> in your request, your output is located in the path
     *         you specified in your request.
     *         </p>
     *         <p>
     *         If you didn't include <code>OutputBucketName</code> in your transcription job request, your transcript is
     *         stored in a service-managed bucket, and <code>RedactedTranscriptFileUri</code> provides you with a
     *         temporary URI you can use for secure access to your transcript.
     *         </p>
     *         <note>
     *         <p>
     *         Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     *         <code>AccesDenied</code> error, you can get a new temporary URI by running a
     *         <code>GetTranscriptionJob</code> or <code>ListTranscriptionJob</code> request.
     *         </p>
     */

    public String getRedactedTranscriptFileUri() {
        return this.redactedTranscriptFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of your redacted transcript. You can use this URI to access or download your transcript.
     * </p>
     * <p>
     * If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that bucket.
     * If you also included <code>OutputKey</code> in your request, your output is located in the path you specified in
     * your request.
     * </p>
     * <p>
     * If you didn't include <code>OutputBucketName</code> in your transcription job request, your transcript is stored
     * in a service-managed bucket, and <code>RedactedTranscriptFileUri</code> provides you with a temporary URI you can
     * use for secure access to your transcript.
     * </p>
     * <note>
     * <p>
     * Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     * <code>AccesDenied</code> error, you can get a new temporary URI by running a <code>GetTranscriptionJob</code> or
     * <code>ListTranscriptionJob</code> request.
     * </p>
     * </note>
     * 
     * @param redactedTranscriptFileUri
     *        The Amazon S3 location of your redacted transcript. You can use this URI to access or download your
     *        transcript.</p>
     *        <p>
     *        If you included <code>OutputBucketName</code> in your transcription job request, this is the URI of that
     *        bucket. If you also included <code>OutputKey</code> in your request, your output is located in the path
     *        you specified in your request.
     *        </p>
     *        <p>
     *        If you didn't include <code>OutputBucketName</code> in your transcription job request, your transcript is
     *        stored in a service-managed bucket, and <code>RedactedTranscriptFileUri</code> provides you with a
     *        temporary URI you can use for secure access to your transcript.
     *        </p>
     *        <note>
     *        <p>
     *        Temporary URIs for service-managed Amazon S3 buckets are only valid for 15 minutes. If you get an
     *        <code>AccesDenied</code> error, you can get a new temporary URI by running a
     *        <code>GetTranscriptionJob</code> or <code>ListTranscriptionJob</code> request.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transcript withRedactedTranscriptFileUri(String redactedTranscriptFileUri) {
        setRedactedTranscriptFileUri(redactedTranscriptFileUri);
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
        if (getTranscriptFileUri() != null)
            sb.append("TranscriptFileUri: ").append(getTranscriptFileUri()).append(",");
        if (getRedactedTranscriptFileUri() != null)
            sb.append("RedactedTranscriptFileUri: ").append(getRedactedTranscriptFileUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Transcript == false)
            return false;
        Transcript other = (Transcript) obj;
        if (other.getTranscriptFileUri() == null ^ this.getTranscriptFileUri() == null)
            return false;
        if (other.getTranscriptFileUri() != null && other.getTranscriptFileUri().equals(this.getTranscriptFileUri()) == false)
            return false;
        if (other.getRedactedTranscriptFileUri() == null ^ this.getRedactedTranscriptFileUri() == null)
            return false;
        if (other.getRedactedTranscriptFileUri() != null && other.getRedactedTranscriptFileUri().equals(this.getRedactedTranscriptFileUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscriptFileUri() == null) ? 0 : getTranscriptFileUri().hashCode());
        hashCode = prime * hashCode + ((getRedactedTranscriptFileUri() == null) ? 0 : getRedactedTranscriptFileUri().hashCode());
        return hashCode;
    }

    @Override
    public Transcript clone() {
        try {
            return (Transcript) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.TranscriptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
