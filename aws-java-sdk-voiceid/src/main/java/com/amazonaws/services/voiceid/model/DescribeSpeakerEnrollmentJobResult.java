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
package com.amazonaws.services.voiceid.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeSpeakerEnrollmentJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSpeakerEnrollmentJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains details about the specified speaker enrollment job.
     * </p>
     */
    private SpeakerEnrollmentJob job;

    /**
     * <p>
     * Contains details about the specified speaker enrollment job.
     * </p>
     * 
     * @param job
     *        Contains details about the specified speaker enrollment job.
     */

    public void setJob(SpeakerEnrollmentJob job) {
        this.job = job;
    }

    /**
     * <p>
     * Contains details about the specified speaker enrollment job.
     * </p>
     * 
     * @return Contains details about the specified speaker enrollment job.
     */

    public SpeakerEnrollmentJob getJob() {
        return this.job;
    }

    /**
     * <p>
     * Contains details about the specified speaker enrollment job.
     * </p>
     * 
     * @param job
     *        Contains details about the specified speaker enrollment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpeakerEnrollmentJobResult withJob(SpeakerEnrollmentJob job) {
        setJob(job);
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
        if (getJob() != null)
            sb.append("Job: ").append(getJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpeakerEnrollmentJobResult == false)
            return false;
        DescribeSpeakerEnrollmentJobResult other = (DescribeSpeakerEnrollmentJobResult) obj;
        if (other.getJob() == null ^ this.getJob() == null)
            return false;
        if (other.getJob() != null && other.getJob().equals(this.getJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJob() == null) ? 0 : getJob().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSpeakerEnrollmentJobResult clone() {
        try {
            return (DescribeSpeakerEnrollmentJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
