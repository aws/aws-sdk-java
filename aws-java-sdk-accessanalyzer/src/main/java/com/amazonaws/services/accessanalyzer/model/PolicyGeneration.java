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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the policy generation status and properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/PolicyGeneration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyGeneration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A timestamp of when the policy generation was completed.
     * </p>
     */
    private java.util.Date completedOn;
    /**
     * <p>
     * The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     * <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or used
     * with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy.
     * </p>
     */
    private String principalArn;
    /**
     * <p>
     * A timestamp of when the policy generation started.
     * </p>
     */
    private java.util.Date startedOn;
    /**
     * <p>
     * The status of the policy generation request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * A timestamp of when the policy generation was completed.
     * </p>
     * 
     * @param completedOn
     *        A timestamp of when the policy generation was completed.
     */

    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * A timestamp of when the policy generation was completed.
     * </p>
     * 
     * @return A timestamp of when the policy generation was completed.
     */

    public java.util.Date getCompletedOn() {
        return this.completedOn;
    }

    /**
     * <p>
     * A timestamp of when the policy generation was completed.
     * </p>
     * 
     * @param completedOn
     *        A timestamp of when the policy generation was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyGeneration withCompletedOn(java.util.Date completedOn) {
        setCompletedOn(completedOn);
        return this;
    }

    /**
     * <p>
     * The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     * <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or used
     * with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * </p>
     * 
     * @param jobId
     *        The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     *        <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or
     *        used with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     * <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or used
     * with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * </p>
     * 
     * @return The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     *         <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or
     *         used with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     * <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or used
     * with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * </p>
     * 
     * @param jobId
     *        The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     *        <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or
     *        used with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyGeneration withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM entity (user or role) for which you are generating a policy.
     */

    public void setPrincipalArn(String principalArn) {
        this.principalArn = principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy.
     * </p>
     * 
     * @return The ARN of the IAM entity (user or role) for which you are generating a policy.
     */

    public String getPrincipalArn() {
        return this.principalArn;
    }

    /**
     * <p>
     * The ARN of the IAM entity (user or role) for which you are generating a policy.
     * </p>
     * 
     * @param principalArn
     *        The ARN of the IAM entity (user or role) for which you are generating a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyGeneration withPrincipalArn(String principalArn) {
        setPrincipalArn(principalArn);
        return this;
    }

    /**
     * <p>
     * A timestamp of when the policy generation started.
     * </p>
     * 
     * @param startedOn
     *        A timestamp of when the policy generation started.
     */

    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * A timestamp of when the policy generation started.
     * </p>
     * 
     * @return A timestamp of when the policy generation started.
     */

    public java.util.Date getStartedOn() {
        return this.startedOn;
    }

    /**
     * <p>
     * A timestamp of when the policy generation started.
     * </p>
     * 
     * @param startedOn
     *        A timestamp of when the policy generation started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyGeneration withStartedOn(java.util.Date startedOn) {
        setStartedOn(startedOn);
        return this;
    }

    /**
     * <p>
     * The status of the policy generation request.
     * </p>
     * 
     * @param status
     *        The status of the policy generation request.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the policy generation request.
     * </p>
     * 
     * @return The status of the policy generation request.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the policy generation request.
     * </p>
     * 
     * @param status
     *        The status of the policy generation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public PolicyGeneration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the policy generation request.
     * </p>
     * 
     * @param status
     *        The status of the policy generation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public PolicyGeneration withStatus(JobStatus status) {
        this.status = status.toString();
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
        if (getCompletedOn() != null)
            sb.append("CompletedOn: ").append(getCompletedOn()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getPrincipalArn() != null)
            sb.append("PrincipalArn: ").append(getPrincipalArn()).append(",");
        if (getStartedOn() != null)
            sb.append("StartedOn: ").append(getStartedOn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyGeneration == false)
            return false;
        PolicyGeneration other = (PolicyGeneration) obj;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getPrincipalArn() == null ^ this.getPrincipalArn() == null)
            return false;
        if (other.getPrincipalArn() != null && other.getPrincipalArn().equals(this.getPrincipalArn()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getPrincipalArn() == null) ? 0 : getPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public PolicyGeneration clone() {
        try {
            return (PolicyGeneration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.PolicyGenerationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
