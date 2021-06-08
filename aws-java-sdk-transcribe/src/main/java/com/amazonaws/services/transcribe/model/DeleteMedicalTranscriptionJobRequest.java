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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteMedicalTranscriptionJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteMedicalTranscriptionJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name you provide to the <code>DeleteMedicalTranscriptionJob</code> object to delete a transcription job.
     * </p>
     */
    private String medicalTranscriptionJobName;

    /**
     * <p>
     * The name you provide to the <code>DeleteMedicalTranscriptionJob</code> object to delete a transcription job.
     * </p>
     * 
     * @param medicalTranscriptionJobName
     *        The name you provide to the <code>DeleteMedicalTranscriptionJob</code> object to delete a transcription
     *        job.
     */

    public void setMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name you provide to the <code>DeleteMedicalTranscriptionJob</code> object to delete a transcription job.
     * </p>
     * 
     * @return The name you provide to the <code>DeleteMedicalTranscriptionJob</code> object to delete a transcription
     *         job.
     */

    public String getMedicalTranscriptionJobName() {
        return this.medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name you provide to the <code>DeleteMedicalTranscriptionJob</code> object to delete a transcription job.
     * </p>
     * 
     * @param medicalTranscriptionJobName
     *        The name you provide to the <code>DeleteMedicalTranscriptionJob</code> object to delete a transcription
     *        job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteMedicalTranscriptionJobRequest withMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        setMedicalTranscriptionJobName(medicalTranscriptionJobName);
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
        if (getMedicalTranscriptionJobName() != null)
            sb.append("MedicalTranscriptionJobName: ").append(getMedicalTranscriptionJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteMedicalTranscriptionJobRequest == false)
            return false;
        DeleteMedicalTranscriptionJobRequest other = (DeleteMedicalTranscriptionJobRequest) obj;
        if (other.getMedicalTranscriptionJobName() == null ^ this.getMedicalTranscriptionJobName() == null)
            return false;
        if (other.getMedicalTranscriptionJobName() != null && other.getMedicalTranscriptionJobName().equals(this.getMedicalTranscriptionJobName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMedicalTranscriptionJobName() == null) ? 0 : getMedicalTranscriptionJobName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteMedicalTranscriptionJobRequest clone() {
        return (DeleteMedicalTranscriptionJobRequest) super.clone();
    }

}
