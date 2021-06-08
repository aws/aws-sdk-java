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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/RevokeSignature" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeSignatureRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the signing job to be revoked.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * AWS account ID of the job owner.
     * </p>
     */
    private String jobOwner;
    /**
     * <p>
     * The reason for revoking the signing job.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * ID of the signing job to be revoked.
     * </p>
     * 
     * @param jobId
     *        ID of the signing job to be revoked.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * ID of the signing job to be revoked.
     * </p>
     * 
     * @return ID of the signing job to be revoked.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * ID of the signing job to be revoked.
     * </p>
     * 
     * @param jobId
     *        ID of the signing job to be revoked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSignatureRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * AWS account ID of the job owner.
     * </p>
     * 
     * @param jobOwner
     *        AWS account ID of the job owner.
     */

    public void setJobOwner(String jobOwner) {
        this.jobOwner = jobOwner;
    }

    /**
     * <p>
     * AWS account ID of the job owner.
     * </p>
     * 
     * @return AWS account ID of the job owner.
     */

    public String getJobOwner() {
        return this.jobOwner;
    }

    /**
     * <p>
     * AWS account ID of the job owner.
     * </p>
     * 
     * @param jobOwner
     *        AWS account ID of the job owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSignatureRequest withJobOwner(String jobOwner) {
        setJobOwner(jobOwner);
        return this;
    }

    /**
     * <p>
     * The reason for revoking the signing job.
     * </p>
     * 
     * @param reason
     *        The reason for revoking the signing job.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for revoking the signing job.
     * </p>
     * 
     * @return The reason for revoking the signing job.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for revoking the signing job.
     * </p>
     * 
     * @param reason
     *        The reason for revoking the signing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeSignatureRequest withReason(String reason) {
        setReason(reason);
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
        if (getJobOwner() != null)
            sb.append("JobOwner: ").append(getJobOwner()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeSignatureRequest == false)
            return false;
        RevokeSignatureRequest other = (RevokeSignatureRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobOwner() == null ^ this.getJobOwner() == null)
            return false;
        if (other.getJobOwner() != null && other.getJobOwner().equals(this.getJobOwner()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobOwner() == null) ? 0 : getJobOwner().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public RevokeSignatureRequest clone() {
        return (RevokeSignatureRequest) super.clone();
    }

}
