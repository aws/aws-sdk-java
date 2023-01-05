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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/voice-id-2021-09-27/DescribeSpeakerEnrollmentJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSpeakerEnrollmentJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the domain containing the speaker enrollment job.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The identifier of the speaker enrollment job you are describing.
     * </p>
     */
    private String jobId;

    /**
     * <p>
     * The identifier of the domain containing the speaker enrollment job.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain containing the speaker enrollment job.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the domain containing the speaker enrollment job.
     * </p>
     * 
     * @return The identifier of the domain containing the speaker enrollment job.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the domain containing the speaker enrollment job.
     * </p>
     * 
     * @param domainId
     *        The identifier of the domain containing the speaker enrollment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpeakerEnrollmentJobRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The identifier of the speaker enrollment job you are describing.
     * </p>
     * 
     * @param jobId
     *        The identifier of the speaker enrollment job you are describing.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier of the speaker enrollment job you are describing.
     * </p>
     * 
     * @return The identifier of the speaker enrollment job you are describing.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identifier of the speaker enrollment job you are describing.
     * </p>
     * 
     * @param jobId
     *        The identifier of the speaker enrollment job you are describing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpeakerEnrollmentJobRequest withJobId(String jobId) {
        setJobId(jobId);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpeakerEnrollmentJobRequest == false)
            return false;
        DescribeSpeakerEnrollmentJobRequest other = (DescribeSpeakerEnrollmentJobRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSpeakerEnrollmentJobRequest clone() {
        return (DescribeSpeakerEnrollmentJobRequest) super.clone();
    }

}
