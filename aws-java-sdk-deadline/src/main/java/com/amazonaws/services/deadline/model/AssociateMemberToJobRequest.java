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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssociateMemberToJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateMemberToJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The farm ID of the job to associate with the member.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The member's identity store ID to associate with the job.
     * </p>
     */
    private String identityStoreId;
    /**
     * <p>
     * The job ID to associate with the member.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The principal's membership level for the associated job.
     * </p>
     */
    private String membershipLevel;
    /**
     * <p>
     * The member's principal ID to associate with the job.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The member's principal type to associate with the job.
     * </p>
     */
    private String principalType;
    /**
     * <p>
     * The queue ID to associate to the member.
     * </p>
     */
    private String queueId;

    /**
     * <p>
     * The farm ID of the job to associate with the member.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the job to associate with the member.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the job to associate with the member.
     * </p>
     * 
     * @return The farm ID of the job to associate with the member.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the job to associate with the member.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the job to associate with the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMemberToJobRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The member's identity store ID to associate with the job.
     * </p>
     * 
     * @param identityStoreId
     *        The member's identity store ID to associate with the job.
     */

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    /**
     * <p>
     * The member's identity store ID to associate with the job.
     * </p>
     * 
     * @return The member's identity store ID to associate with the job.
     */

    public String getIdentityStoreId() {
        return this.identityStoreId;
    }

    /**
     * <p>
     * The member's identity store ID to associate with the job.
     * </p>
     * 
     * @param identityStoreId
     *        The member's identity store ID to associate with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMemberToJobRequest withIdentityStoreId(String identityStoreId) {
        setIdentityStoreId(identityStoreId);
        return this;
    }

    /**
     * <p>
     * The job ID to associate with the member.
     * </p>
     * 
     * @param jobId
     *        The job ID to associate with the member.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID to associate with the member.
     * </p>
     * 
     * @return The job ID to associate with the member.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID to associate with the member.
     * </p>
     * 
     * @param jobId
     *        The job ID to associate with the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMemberToJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The principal's membership level for the associated job.
     * </p>
     * 
     * @param membershipLevel
     *        The principal's membership level for the associated job.
     * @see MembershipLevel
     */

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    /**
     * <p>
     * The principal's membership level for the associated job.
     * </p>
     * 
     * @return The principal's membership level for the associated job.
     * @see MembershipLevel
     */

    public String getMembershipLevel() {
        return this.membershipLevel;
    }

    /**
     * <p>
     * The principal's membership level for the associated job.
     * </p>
     * 
     * @param membershipLevel
     *        The principal's membership level for the associated job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipLevel
     */

    public AssociateMemberToJobRequest withMembershipLevel(String membershipLevel) {
        setMembershipLevel(membershipLevel);
        return this;
    }

    /**
     * <p>
     * The principal's membership level for the associated job.
     * </p>
     * 
     * @param membershipLevel
     *        The principal's membership level for the associated job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipLevel
     */

    public AssociateMemberToJobRequest withMembershipLevel(MembershipLevel membershipLevel) {
        this.membershipLevel = membershipLevel.toString();
        return this;
    }

    /**
     * <p>
     * The member's principal ID to associate with the job.
     * </p>
     * 
     * @param principalId
     *        The member's principal ID to associate with the job.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The member's principal ID to associate with the job.
     * </p>
     * 
     * @return The member's principal ID to associate with the job.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The member's principal ID to associate with the job.
     * </p>
     * 
     * @param principalId
     *        The member's principal ID to associate with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMemberToJobRequest withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The member's principal type to associate with the job.
     * </p>
     * 
     * @param principalType
     *        The member's principal type to associate with the job.
     * @see PrincipalType
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * The member's principal type to associate with the job.
     * </p>
     * 
     * @return The member's principal type to associate with the job.
     * @see PrincipalType
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * The member's principal type to associate with the job.
     * </p>
     * 
     * @param principalType
     *        The member's principal type to associate with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AssociateMemberToJobRequest withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * The member's principal type to associate with the job.
     * </p>
     * 
     * @param principalType
     *        The member's principal type to associate with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public AssociateMemberToJobRequest withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
        return this;
    }

    /**
     * <p>
     * The queue ID to associate to the member.
     * </p>
     * 
     * @param queueId
     *        The queue ID to associate to the member.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID to associate to the member.
     * </p>
     * 
     * @return The queue ID to associate to the member.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID to associate to the member.
     * </p>
     * 
     * @param queueId
     *        The queue ID to associate to the member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMemberToJobRequest withQueueId(String queueId) {
        setQueueId(queueId);
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
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getIdentityStoreId() != null)
            sb.append("IdentityStoreId: ").append(getIdentityStoreId()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getMembershipLevel() != null)
            sb.append("MembershipLevel: ").append(getMembershipLevel()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getPrincipalType() != null)
            sb.append("PrincipalType: ").append(getPrincipalType()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateMemberToJobRequest == false)
            return false;
        AssociateMemberToJobRequest other = (AssociateMemberToJobRequest) obj;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getIdentityStoreId() == null ^ this.getIdentityStoreId() == null)
            return false;
        if (other.getIdentityStoreId() != null && other.getIdentityStoreId().equals(this.getIdentityStoreId()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getMembershipLevel() == null ^ this.getMembershipLevel() == null)
            return false;
        if (other.getMembershipLevel() != null && other.getMembershipLevel().equals(this.getMembershipLevel()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getPrincipalType() == null ^ this.getPrincipalType() == null)
            return false;
        if (other.getPrincipalType() != null && other.getPrincipalType().equals(this.getPrincipalType()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getIdentityStoreId() == null) ? 0 : getIdentityStoreId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getMembershipLevel() == null) ? 0 : getMembershipLevel().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateMemberToJobRequest clone() {
        return (AssociateMemberToJobRequest) super.clone();
    }

}
