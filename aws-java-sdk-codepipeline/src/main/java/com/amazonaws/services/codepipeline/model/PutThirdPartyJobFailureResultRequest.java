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
 * Represents the input of a PutThirdPartyJobFailureResult action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PutThirdPartyJobFailureResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutThirdPartyJobFailureResultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the job that failed. This is the same ID returned from PollForThirdPartyJobs.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed
     * access to the job and its details.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Represents information about failure details.
     * </p>
     */
    private FailureDetails failureDetails;

    /**
     * <p>
     * The ID of the job that failed. This is the same ID returned from PollForThirdPartyJobs.
     * </p>
     * 
     * @param jobId
     *        The ID of the job that failed. This is the same ID returned from PollForThirdPartyJobs.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the job that failed. This is the same ID returned from PollForThirdPartyJobs.
     * </p>
     * 
     * @return The ID of the job that failed. This is the same ID returned from PollForThirdPartyJobs.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the job that failed. This is the same ID returned from PollForThirdPartyJobs.
     * </p>
     * 
     * @param jobId
     *        The ID of the job that failed. This is the same ID returned from PollForThirdPartyJobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutThirdPartyJobFailureResultRequest withJobId(String jobId) {
        setJobId(jobId);
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

    public PutThirdPartyJobFailureResultRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Represents information about failure details.
     * </p>
     * 
     * @param failureDetails
     *        Represents information about failure details.
     */

    public void setFailureDetails(FailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * Represents information about failure details.
     * </p>
     * 
     * @return Represents information about failure details.
     */

    public FailureDetails getFailureDetails() {
        return this.failureDetails;
    }

    /**
     * <p>
     * Represents information about failure details.
     * </p>
     * 
     * @param failureDetails
     *        Represents information about failure details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutThirdPartyJobFailureResultRequest withFailureDetails(FailureDetails failureDetails) {
        setFailureDetails(failureDetails);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getFailureDetails() != null)
            sb.append("FailureDetails: ").append(getFailureDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutThirdPartyJobFailureResultRequest == false)
            return false;
        PutThirdPartyJobFailureResultRequest other = (PutThirdPartyJobFailureResultRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        return hashCode;
    }

    @Override
    public PutThirdPartyJobFailureResultRequest clone() {
        return (PutThirdPartyJobFailureResultRequest) super.clone();
    }

}
