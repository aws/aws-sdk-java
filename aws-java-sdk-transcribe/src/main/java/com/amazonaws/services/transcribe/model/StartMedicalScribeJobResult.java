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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/StartMedicalScribeJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMedicalScribeJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Provides detailed information about the current Medical Scribe job, including job status and, if applicable,
     * failure reason.
     * </p>
     */
    private MedicalScribeJob medicalScribeJob;

    /**
     * <p>
     * Provides detailed information about the current Medical Scribe job, including job status and, if applicable,
     * failure reason.
     * </p>
     * 
     * @param medicalScribeJob
     *        Provides detailed information about the current Medical Scribe job, including job status and, if
     *        applicable, failure reason.
     */

    public void setMedicalScribeJob(MedicalScribeJob medicalScribeJob) {
        this.medicalScribeJob = medicalScribeJob;
    }

    /**
     * <p>
     * Provides detailed information about the current Medical Scribe job, including job status and, if applicable,
     * failure reason.
     * </p>
     * 
     * @return Provides detailed information about the current Medical Scribe job, including job status and, if
     *         applicable, failure reason.
     */

    public MedicalScribeJob getMedicalScribeJob() {
        return this.medicalScribeJob;
    }

    /**
     * <p>
     * Provides detailed information about the current Medical Scribe job, including job status and, if applicable,
     * failure reason.
     * </p>
     * 
     * @param medicalScribeJob
     *        Provides detailed information about the current Medical Scribe job, including job status and, if
     *        applicable, failure reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMedicalScribeJobResult withMedicalScribeJob(MedicalScribeJob medicalScribeJob) {
        setMedicalScribeJob(medicalScribeJob);
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
        if (getMedicalScribeJob() != null)
            sb.append("MedicalScribeJob: ").append(getMedicalScribeJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMedicalScribeJobResult == false)
            return false;
        StartMedicalScribeJobResult other = (StartMedicalScribeJobResult) obj;
        if (other.getMedicalScribeJob() == null ^ this.getMedicalScribeJob() == null)
            return false;
        if (other.getMedicalScribeJob() != null && other.getMedicalScribeJob().equals(this.getMedicalScribeJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMedicalScribeJob() == null) ? 0 : getMedicalScribeJob().hashCode());
        return hashCode;
    }

    @Override
    public StartMedicalScribeJobResult clone() {
        try {
            return (StartMedicalScribeJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
