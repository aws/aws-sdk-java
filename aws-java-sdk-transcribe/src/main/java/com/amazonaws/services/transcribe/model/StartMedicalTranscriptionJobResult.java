/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartMedicalTranscriptionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMedicalTranscriptionJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A batch job submitted to transcribe medical speech to text.
     * </p>
     */
    private MedicalTranscriptionJob medicalTranscriptionJob;

    /**
     * <p>
     * A batch job submitted to transcribe medical speech to text.
     * </p>
     * 
     * @param medicalTranscriptionJob
     *        A batch job submitted to transcribe medical speech to text.
     */

    public void setMedicalTranscriptionJob(MedicalTranscriptionJob medicalTranscriptionJob) {
        this.medicalTranscriptionJob = medicalTranscriptionJob;
    }

    /**
     * <p>
     * A batch job submitted to transcribe medical speech to text.
     * </p>
     * 
     * @return A batch job submitted to transcribe medical speech to text.
     */

    public MedicalTranscriptionJob getMedicalTranscriptionJob() {
        return this.medicalTranscriptionJob;
    }

    /**
     * <p>
     * A batch job submitted to transcribe medical speech to text.
     * </p>
     * 
     * @param medicalTranscriptionJob
     *        A batch job submitted to transcribe medical speech to text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalTranscriptionJobResult withMedicalTranscriptionJob(MedicalTranscriptionJob medicalTranscriptionJob) {
        setMedicalTranscriptionJob(medicalTranscriptionJob);
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
        if (getMedicalTranscriptionJob() != null)
            sb.append("MedicalTranscriptionJob: ").append(getMedicalTranscriptionJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMedicalTranscriptionJobResult == false)
            return false;
        StartMedicalTranscriptionJobResult other = (StartMedicalTranscriptionJobResult) obj;
        if (other.getMedicalTranscriptionJob() == null ^ this.getMedicalTranscriptionJob() == null)
            return false;
        if (other.getMedicalTranscriptionJob() != null && other.getMedicalTranscriptionJob().equals(this.getMedicalTranscriptionJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMedicalTranscriptionJob() == null) ? 0 : getMedicalTranscriptionJob().hashCode());
        return hashCode;
    }

    @Override
    public StartMedicalTranscriptionJobResult clone() {
        try {
            return (StartMedicalTranscriptionJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
