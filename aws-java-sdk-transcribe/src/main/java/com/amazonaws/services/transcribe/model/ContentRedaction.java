/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Settings for content redaction within a transcription job.
 * </p>
 * <p>
 * You can redact transcripts in US English (en-us). For more information see: <a
 * href="https://docs.aws.amazon.com/transcribe/latest/dg/content-redaction.html">Automatic Content Redaction</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ContentRedaction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContentRedaction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * </p>
     */
    private String redactionType;
    /**
     * <p>
     * Request parameter where you choose whether to output only the redacted transcript or generate an additional
     * unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs a JSON file with only the redacted transcript and
     * related information.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs a JSON file with the unredacted
     * transcript and related information in addition to the JSON file with the redacted transcript.
     * </p>
     */
    private String redactionOutput;

    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * </p>
     * 
     * @param redactionType
     *        Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * @see RedactionType
     */

    public void setRedactionType(String redactionType) {
        this.redactionType = redactionType;
    }

    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * </p>
     * 
     * @return Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * @see RedactionType
     */

    public String getRedactionType() {
        return this.redactionType;
    }

    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * </p>
     * 
     * @param redactionType
     *        Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedactionType
     */

    public ContentRedaction withRedactionType(String redactionType) {
        setRedactionType(redactionType);
        return this;
    }

    /**
     * <p>
     * Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * </p>
     * 
     * @param redactionType
     *        Request parameter that defines the entities to be redacted. The only accepted value is <code>PII</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedactionType
     */

    public ContentRedaction withRedactionType(RedactionType redactionType) {
        this.redactionType = redactionType.toString();
        return this;
    }

    /**
     * <p>
     * Request parameter where you choose whether to output only the redacted transcript or generate an additional
     * unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs a JSON file with only the redacted transcript and
     * related information.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs a JSON file with the unredacted
     * transcript and related information in addition to the JSON file with the redacted transcript.
     * </p>
     * 
     * @param redactionOutput
     *        Request parameter where you choose whether to output only the redacted transcript or generate an
     *        additional unredacted transcript.</p>
     *        <p>
     *        When you choose <code>redacted</code> Amazon Transcribe outputs a JSON file with only the redacted
     *        transcript and related information.
     *        </p>
     *        <p>
     *        When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs a JSON file with the
     *        unredacted transcript and related information in addition to the JSON file with the redacted transcript.
     * @see RedactionOutput
     */

    public void setRedactionOutput(String redactionOutput) {
        this.redactionOutput = redactionOutput;
    }

    /**
     * <p>
     * Request parameter where you choose whether to output only the redacted transcript or generate an additional
     * unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs a JSON file with only the redacted transcript and
     * related information.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs a JSON file with the unredacted
     * transcript and related information in addition to the JSON file with the redacted transcript.
     * </p>
     * 
     * @return Request parameter where you choose whether to output only the redacted transcript or generate an
     *         additional unredacted transcript.</p>
     *         <p>
     *         When you choose <code>redacted</code> Amazon Transcribe outputs a JSON file with only the redacted
     *         transcript and related information.
     *         </p>
     *         <p>
     *         When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs a JSON file with the
     *         unredacted transcript and related information in addition to the JSON file with the redacted transcript.
     * @see RedactionOutput
     */

    public String getRedactionOutput() {
        return this.redactionOutput;
    }

    /**
     * <p>
     * Request parameter where you choose whether to output only the redacted transcript or generate an additional
     * unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs a JSON file with only the redacted transcript and
     * related information.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs a JSON file with the unredacted
     * transcript and related information in addition to the JSON file with the redacted transcript.
     * </p>
     * 
     * @param redactionOutput
     *        Request parameter where you choose whether to output only the redacted transcript or generate an
     *        additional unredacted transcript.</p>
     *        <p>
     *        When you choose <code>redacted</code> Amazon Transcribe outputs a JSON file with only the redacted
     *        transcript and related information.
     *        </p>
     *        <p>
     *        When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs a JSON file with the
     *        unredacted transcript and related information in addition to the JSON file with the redacted transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedactionOutput
     */

    public ContentRedaction withRedactionOutput(String redactionOutput) {
        setRedactionOutput(redactionOutput);
        return this;
    }

    /**
     * <p>
     * Request parameter where you choose whether to output only the redacted transcript or generate an additional
     * unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe outputs a JSON file with only the redacted transcript and
     * related information.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs a JSON file with the unredacted
     * transcript and related information in addition to the JSON file with the redacted transcript.
     * </p>
     * 
     * @param redactionOutput
     *        Request parameter where you choose whether to output only the redacted transcript or generate an
     *        additional unredacted transcript.</p>
     *        <p>
     *        When you choose <code>redacted</code> Amazon Transcribe outputs a JSON file with only the redacted
     *        transcript and related information.
     *        </p>
     *        <p>
     *        When you choose <code>redacted_and_unredacted</code> Amazon Transcribe outputs a JSON file with the
     *        unredacted transcript and related information in addition to the JSON file with the redacted transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedactionOutput
     */

    public ContentRedaction withRedactionOutput(RedactionOutput redactionOutput) {
        this.redactionOutput = redactionOutput.toString();
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
        if (getRedactionType() != null)
            sb.append("RedactionType: ").append(getRedactionType()).append(",");
        if (getRedactionOutput() != null)
            sb.append("RedactionOutput: ").append(getRedactionOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentRedaction == false)
            return false;
        ContentRedaction other = (ContentRedaction) obj;
        if (other.getRedactionType() == null ^ this.getRedactionType() == null)
            return false;
        if (other.getRedactionType() != null && other.getRedactionType().equals(this.getRedactionType()) == false)
            return false;
        if (other.getRedactionOutput() == null ^ this.getRedactionOutput() == null)
            return false;
        if (other.getRedactionOutput() != null && other.getRedactionOutput().equals(this.getRedactionOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRedactionType() == null) ? 0 : getRedactionType().hashCode());
        hashCode = prime * hashCode + ((getRedactionOutput() == null) ? 0 : getRedactionOutput().hashCode());
        return hashCode;
    }

    @Override
    public ContentRedaction clone() {
        try {
            return (ContentRedaction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.ContentRedactionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
