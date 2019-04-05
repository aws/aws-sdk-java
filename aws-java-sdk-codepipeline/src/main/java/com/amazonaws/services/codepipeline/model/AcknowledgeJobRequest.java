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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of an AcknowledgeJob action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/AcknowledgeJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcknowledgeJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique system-generated ID of the job for which you want to confirm receipt.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. Get this number from the response of the <a>PollForJobs</a> request that returned this job.
     * </p>
     */
    private String nonce;

    /**
     * <p>
     * The unique system-generated ID of the job for which you want to confirm receipt.
     * </p>
     * 
     * @param jobId
     *        The unique system-generated ID of the job for which you want to confirm receipt.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique system-generated ID of the job for which you want to confirm receipt.
     * </p>
     * 
     * @return The unique system-generated ID of the job for which you want to confirm receipt.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique system-generated ID of the job for which you want to confirm receipt.
     * </p>
     * 
     * @param jobId
     *        The unique system-generated ID of the job for which you want to confirm receipt.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcknowledgeJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. Get this number from the response of the <a>PollForJobs</a> request that returned this job.
     * </p>
     * 
     * @param nonce
     *        A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by
     *        only one job worker. Get this number from the response of the <a>PollForJobs</a> request that returned
     *        this job.
     */

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. Get this number from the response of the <a>PollForJobs</a> request that returned this job.
     * </p>
     * 
     * @return A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by
     *         only one job worker. Get this number from the response of the <a>PollForJobs</a> request that returned
     *         this job.
     */

    public String getNonce() {
        return this.nonce;
    }

    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. Get this number from the response of the <a>PollForJobs</a> request that returned this job.
     * </p>
     * 
     * @param nonce
     *        A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by
     *        only one job worker. Get this number from the response of the <a>PollForJobs</a> request that returned
     *        this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcknowledgeJobRequest withNonce(String nonce) {
        setNonce(nonce);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getNonce() != null)
            sb.append("Nonce: ").append(getNonce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcknowledgeJobRequest == false)
            return false;
        AcknowledgeJobRequest other = (AcknowledgeJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getNonce() == null ^ this.getNonce() == null)
            return false;
        if (other.getNonce() != null && other.getNonce().equals(this.getNonce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getNonce() == null) ? 0 : getNonce().hashCode());
        return hashCode;
    }

    @Override
    public AcknowledgeJobRequest clone() {
        return (AcknowledgeJobRequest) super.clone();
    }

}
