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
 * Describes the output of a transcription job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/Transcript" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Transcript implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 location where the transcription result is stored. The general form of this Uri is:
     * </p>
     * <p>
     * <code> https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/example.json</code>
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/mediadocs/example.json</code>
     * </p>
     */
    private String transcriptFileUri;

    /**
     * <p>
     * The S3 location where the transcription result is stored. The general form of this Uri is:
     * </p>
     * <p>
     * <code> https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/example.json</code>
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/mediadocs/example.json</code>
     * </p>
     * 
     * @param transcriptFileUri
     *        The S3 location where the transcription result is stored. The general form of this Uri is:</p>
     *        <p>
     *        <code> https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        <code>https://s3-us-west-2.amazonaws.com/examplebucket/example.json</code>
     *        </p>
     *        <p>
     *        <code>https://s3-us-west-2.amazonaws.com/examplebucket/mediadocs/example.json</code>
     */

    public void setTranscriptFileUri(String transcriptFileUri) {
        this.transcriptFileUri = transcriptFileUri;
    }

    /**
     * <p>
     * The S3 location where the transcription result is stored. The general form of this Uri is:
     * </p>
     * <p>
     * <code> https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/example.json</code>
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/mediadocs/example.json</code>
     * </p>
     * 
     * @return The S3 location where the transcription result is stored. The general form of this Uri is:</p>
     *         <p>
     *         <code> https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <p>
     *         <code>https://s3-us-west-2.amazonaws.com/examplebucket/example.json</code>
     *         </p>
     *         <p>
     *         <code>https://s3-us-west-2.amazonaws.com/examplebucket/mediadocs/example.json</code>
     */

    public String getTranscriptFileUri() {
        return this.transcriptFileUri;
    }

    /**
     * <p>
     * The S3 location where the transcription result is stored. The general form of this Uri is:
     * </p>
     * <p>
     * <code> https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/example.json</code>
     * </p>
     * <p>
     * <code>https://s3-us-west-2.amazonaws.com/examplebucket/mediadocs/example.json</code>
     * </p>
     * 
     * @param transcriptFileUri
     *        The S3 location where the transcription result is stored. The general form of this Uri is:</p>
     *        <p>
     *        <code> https://&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        <code>https://s3-us-west-2.amazonaws.com/examplebucket/example.json</code>
     *        </p>
     *        <p>
     *        <code>https://s3-us-west-2.amazonaws.com/examplebucket/mediadocs/example.json</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Transcript withTranscriptFileUri(String transcriptFileUri) {
        setTranscriptFileUri(transcriptFileUri);
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
        if (getTranscriptFileUri() != null)
            sb.append("TranscriptFileUri: ").append(getTranscriptFileUri());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscriptFileUri() == null) ? 0 : getTranscriptFileUri().hashCode());
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
