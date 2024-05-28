/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The location of the output of your Medical Scribe job. <code>ClinicalDocumentUri</code> holds the Amazon S3 URI for
 * the Clinical Document and <code>TranscriptFileUri</code> holds the Amazon S3 URI for the Transcript.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/MedicalScribeOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MedicalScribeOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Holds the Amazon S3 URI for the Transcript.
     * </p>
     */
    private String transcriptFileUri;
    /**
     * <p>
     * Holds the Amazon S3 URI for the Clinical Document.
     * </p>
     */
    private String clinicalDocumentUri;

    /**
     * <p>
     * Holds the Amazon S3 URI for the Transcript.
     * </p>
     * 
     * @param transcriptFileUri
     *        Holds the Amazon S3 URI for the Transcript.
     */

    public void setTranscriptFileUri(String transcriptFileUri) {
        this.transcriptFileUri = transcriptFileUri;
    }

    /**
     * <p>
     * Holds the Amazon S3 URI for the Transcript.
     * </p>
     * 
     * @return Holds the Amazon S3 URI for the Transcript.
     */

    public String getTranscriptFileUri() {
        return this.transcriptFileUri;
    }

    /**
     * <p>
     * Holds the Amazon S3 URI for the Transcript.
     * </p>
     * 
     * @param transcriptFileUri
     *        Holds the Amazon S3 URI for the Transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeOutput withTranscriptFileUri(String transcriptFileUri) {
        setTranscriptFileUri(transcriptFileUri);
        return this;
    }

    /**
     * <p>
     * Holds the Amazon S3 URI for the Clinical Document.
     * </p>
     * 
     * @param clinicalDocumentUri
     *        Holds the Amazon S3 URI for the Clinical Document.
     */

    public void setClinicalDocumentUri(String clinicalDocumentUri) {
        this.clinicalDocumentUri = clinicalDocumentUri;
    }

    /**
     * <p>
     * Holds the Amazon S3 URI for the Clinical Document.
     * </p>
     * 
     * @return Holds the Amazon S3 URI for the Clinical Document.
     */

    public String getClinicalDocumentUri() {
        return this.clinicalDocumentUri;
    }

    /**
     * <p>
     * Holds the Amazon S3 URI for the Clinical Document.
     * </p>
     * 
     * @param clinicalDocumentUri
     *        Holds the Amazon S3 URI for the Clinical Document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalScribeOutput withClinicalDocumentUri(String clinicalDocumentUri) {
        setClinicalDocumentUri(clinicalDocumentUri);
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
        if (getClinicalDocumentUri() != null)
            sb.append("ClinicalDocumentUri: ").append(getClinicalDocumentUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MedicalScribeOutput == false)
            return false;
        MedicalScribeOutput other = (MedicalScribeOutput) obj;
        if (other.getTranscriptFileUri() == null ^ this.getTranscriptFileUri() == null)
            return false;
        if (other.getTranscriptFileUri() != null && other.getTranscriptFileUri().equals(this.getTranscriptFileUri()) == false)
            return false;
        if (other.getClinicalDocumentUri() == null ^ this.getClinicalDocumentUri() == null)
            return false;
        if (other.getClinicalDocumentUri() != null && other.getClinicalDocumentUri().equals(this.getClinicalDocumentUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscriptFileUri() == null) ? 0 : getTranscriptFileUri().hashCode());
        hashCode = prime * hashCode + ((getClinicalDocumentUri() == null) ? 0 : getClinicalDocumentUri().hashCode());
        return hashCode;
    }

    @Override
    public MedicalScribeOutput clone() {
        try {
            return (MedicalScribeOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.MedicalScribeOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
