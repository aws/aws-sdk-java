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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetTranscriptionJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTranscriptionJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains the results of the transcription job.
     * </p>
     */
    private TranscriptionJob transcriptionJob;

    /**
     * <p>
     * An object that contains the results of the transcription job.
     * </p>
     * 
     * @param transcriptionJob
     *        An object that contains the results of the transcription job.
     */

    public void setTranscriptionJob(TranscriptionJob transcriptionJob) {
        this.transcriptionJob = transcriptionJob;
    }

    /**
     * <p>
     * An object that contains the results of the transcription job.
     * </p>
     * 
     * @return An object that contains the results of the transcription job.
     */

    public TranscriptionJob getTranscriptionJob() {
        return this.transcriptionJob;
    }

    /**
     * <p>
     * An object that contains the results of the transcription job.
     * </p>
     * 
     * @param transcriptionJob
     *        An object that contains the results of the transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTranscriptionJobResult withTranscriptionJob(TranscriptionJob transcriptionJob) {
        setTranscriptionJob(transcriptionJob);
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
        if (getTranscriptionJob() != null)
            sb.append("TranscriptionJob: ").append(getTranscriptionJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTranscriptionJobResult == false)
            return false;
        GetTranscriptionJobResult other = (GetTranscriptionJobResult) obj;
        if (other.getTranscriptionJob() == null ^ this.getTranscriptionJob() == null)
            return false;
        if (other.getTranscriptionJob() != null && other.getTranscriptionJob().equals(this.getTranscriptionJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscriptionJob() == null) ? 0 : getTranscriptionJob().hashCode());
        return hashCode;
    }

    @Override
    public GetTranscriptionJobResult clone() {
        try {
            return (GetTranscriptionJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
