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
 * Represents the input of an AcknowledgeThirdPartyJob action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/AcknowledgeThirdPartyJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcknowledgeThirdPartyJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique system-generated ID of the job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. Get this number from the response to a <a>GetThirdPartyJobDetails</a> request.
     * </p>
     */
    private String nonce;
    /**
     * <p>
     * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed
     * access to the job and its details.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The unique system-generated ID of the job.
     * </p>
     * 
     * @param jobId
     *        The unique system-generated ID of the job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique system-generated ID of the job.
     * </p>
     * 
     * @return The unique system-generated ID of the job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique system-generated ID of the job.
     * </p>
     * 
     * @param jobId
     *        The unique system-generated ID of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcknowledgeThirdPartyJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. Get this number from the response to a <a>GetThirdPartyJobDetails</a> request.
     * </p>
     * 
     * @param nonce
     *        A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by
     *        only one job worker. Get this number from the response to a <a>GetThirdPartyJobDetails</a> request.
     */

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. Get this number from the response to a <a>GetThirdPartyJobDetails</a> request.
     * </p>
     * 
     * @return A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by
     *         only one job worker. Get this number from the response to a <a>GetThirdPartyJobDetails</a> request.
     */

    public String getNonce() {
        return this.nonce;
    }

    /**
     * <p>
     * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one
     * job worker. Get this number from the response to a <a>GetThirdPartyJobDetails</a> request.
     * </p>
     * 
     * @param nonce
     *        A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by
     *        only one job worker. Get this number from the response to a <a>GetThirdPartyJobDetails</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcknowledgeThirdPartyJobRequest withNonce(String nonce) {
        setNonce(nonce);
        return this;
    }

    /**
     * <p>
     * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed
     * access to the job and its details.
     * </p>
     * 
     * @param clientToken
     *        The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is
     *        allowed access to the job and its details.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed
     * access to the job and its details.
     * </p>
     * 
     * @return The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is
     *         allowed access to the job and its details.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed
     * access to the job and its details.
     * </p>
     * 
     * @param clientToken
     *        The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is
     *        allowed access to the job and its details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcknowledgeThirdPartyJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
            sb.append("Nonce: ").append(getNonce()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcknowledgeThirdPartyJobRequest == false)
            return false;
        AcknowledgeThirdPartyJobRequest other = (AcknowledgeThirdPartyJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getNonce() == null ^ this.getNonce() == null)
            return false;
        if (other.getNonce() != null && other.getNonce().equals(this.getNonce()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getNonce() == null) ? 0 : getNonce().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public AcknowledgeThirdPartyJobRequest clone() {
        return (AcknowledgeThirdPartyJobRequest) super.clone();
    }

}
